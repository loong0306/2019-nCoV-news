package china.fighting.model.wrap;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * <p>Title: Wrapper </p>
 * <p>Description 包装类 </p>
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Wrapper<T> implements Serializable {

    /**
     * 成功码.
     */
    public static final int SUCCESS_CODE = 200;

    /**
     * 成功信息.
     */
    public static final String SUCCESS_MESSAGE = "success";

    /**
     * 验证码错误
     */
    public static final int CAPTCHA_CODE_ERROR = 600;

    /**
     * 错误码.
     */
    public static final int ERROR_CODE = 500;

    /**
     * 错误信息.
     */
    public static final String ERROR_MESSAGE = "error";

    /**
     * 错误码：参数非法
     */
    public static final int ILLEGAL_ARGUMENT_CODE_ = 100;

    /**
     * 错误信息：参数非法
     */
    public static final String ILLEGAL_ARGUMENT_MESSAGE = "illegal";
    private static final long serialVersionUID = -1937360126619176765L;

    /**
     * 编号.
     */
    private int code;

    /**
     * 信息.
     */
    private String message;

    /**
     * 结果数据
     */
    private T result;

    /**
     * Instantiates a new wrapper. default code=200
     */
    public Wrapper() {
        this(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    /**
     * Instantiates a new wrapper.
     *
     * @param code    the code
     * @param message the message
     */
    public Wrapper(int code, String message) {
        this.code(code).message(message);
    }

    /**
     * Instantiates a new wrapper.
     *
     * @param code    the code
     * @param message the message
     * @param result  the result
     */
    public Wrapper(int code, String message, T result) {
        super();
        this.code(code).message(message).result(result);
    }

    /**
     * Gets the 编号.
     *
     * @return the 编号
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the 编号.
     *
     * @param code the new 编号
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets the 信息.
     *
     * @return the 信息
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the 信息.
     *
     * @param message the new 信息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the 结果数据.
     *
     * @return the 结果数据
     */
    public T getResult() {
        return result;
    }

    /**
     * Sets the 结果数据.
     *
     * @param result the new 结果数据
     */
    public void setResult(T result) {
        this.result = result;
    }

    /**
     * Sets the 编号 ，返回自身的引用.
     *
     * @param code the new 编号
     * @return the wrapper
     */
    public Wrapper<T> code(int code) {
        this.setCode(code);
        return this;
    }

    /**
     * Sets the 信息 ，返回自身的引用.
     *
     * @param message the new 信息
     * @return the wrapper
     */
    public Wrapper<T> message(String message) {
        this.setMessage(message);
        return this;
    }

    /**
     * Sets the 结果数据 ，返回自身的引用.
     *
     * @param result the new 结果数据
     * @return the wrapper
     */
    public Wrapper<T> result(T result) {
        this.setResult(result);
        return this;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return Wrapper.SUCCESS_CODE == this.code;
    }

    @JsonIgnore
    public boolean isFail() {
        return Wrapper.SUCCESS_CODE != this.code;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
