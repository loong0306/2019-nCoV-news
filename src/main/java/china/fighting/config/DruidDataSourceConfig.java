package china.fighting.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.SQLException;

/**
 * Druid的DataResource配置类
 * @author dragon
 */
@Slf4j
@Configuration
@EnableTransactionManagement
@MapperScan(value = "china.fighting.mapper")
public class DruidDataSourceConfig implements EnvironmentAware {

    private Environment environment;

    private RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        this.propertyResolver = new RelaxedPropertyResolver(environment,"spring.datasource.");
    }

    @Bean(initMethod = "init", destroyMethod = "close")
    public DruidDataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(propertyResolver.getProperty("driver-class-name"));
        druidDataSource.setUrl(propertyResolver.getProperty("url"));
        druidDataSource.setUsername(propertyResolver.getProperty("username"));
        druidDataSource.setPassword(propertyResolver.getProperty("password"));
        druidDataSource.setInitialSize(Integer.parseInt(propertyResolver.getProperty("druid.initial-size")));
        druidDataSource.setMinIdle(Integer.parseInt(propertyResolver.getProperty("druid.min-idle")));
        druidDataSource.setMaxActive(Integer.parseInt(propertyResolver.getProperty("druid.max-active")));
        druidDataSource.setMaxWait(Integer.parseInt(propertyResolver.getProperty("druid.max-wait")));
        druidDataSource.setTimeBetweenEvictionRunsMillis(Long.parseLong(propertyResolver.getProperty("druid.time-between-eviction-runs-millis")));
        druidDataSource.setMinEvictableIdleTimeMillis(Long.parseLong(propertyResolver.getProperty("druid.min-evictable-idle-time-millis")));
        druidDataSource.setValidationQuery(propertyResolver.getProperty("druid.validation-query"));
        druidDataSource.setTestWhileIdle(Boolean.parseBoolean(propertyResolver.getProperty("druid.test-on-borrow")));
        druidDataSource.setTestOnBorrow(Boolean.parseBoolean(propertyResolver.getProperty("druid.test-while-idle")));
        druidDataSource.setTestOnReturn(Boolean.parseBoolean(propertyResolver.getProperty("druid.test-on-return")));
        druidDataSource.setPoolPreparedStatements(Boolean.parseBoolean(propertyResolver.getProperty("druid.pool-prepared-statements")));
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(Integer.parseInt(propertyResolver.getProperty("druid.max-pool-prepared-statement-per-connection-size")));
        druidDataSource.setFilters(propertyResolver.getProperty("filters"));
        return druidDataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws SQLException {
        return new DataSourceTransactionManager(dataSource());
    }

}