import china.fighting.StartApplication;
import china.fighting.model.dto.WeiboDTO;
import china.fighting.service.NcovNewsKeywordsService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Title: ApiRunnerTest. </p>
 * <p>Description: API测试用例 </p>
 *
 * @author dragon
 * @date 2020/1/24 4:17 下午
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApplication.class)
public class ApiRunnerTest {

    @Resource
    private NcovNewsKeywordsService ncovNewsKeywordsService;

    /**
     * <p>Title: doTest. </p>
     * <p>Description: 测试用例 </p>
     *
     * @author dragon
     * @date 2020/1/24 4:17 下午
     */
    @Test
    public void doTest() {
        String apiResult = "{\n" +
                "    \"code\": \"10000\",\n" +
                "    \"charge\": false,\n" +
                "    \"remain\": 0,\n" +
                "    \"msg\": \"查询成功\",\n" +
                "    \"result\": {\n" +
                "        \"data\": [\n" +
                "            {\n" +
                "                \"url\": \"http://weibo.com/2286908003/IqX1pm9Ub\",\n" +
                "                \"likeCount\": 1180,\n" +
                "                \"mblog\": {\n" +
                "                    \"pic_bg_new\": \"http://vip.storage.weibo.com/feed_cover/star_11247_common_mobile_new.png?version=2019071801\",\n" +
                "                    \"attitudes_status\": 0,\n" +
                "                    \"show_additional_indication\": 0,\n" +
                "                    \"title\": {\n" +
                "                        \"base_color\": 2,\n" +
                "                        \"icon_url\": \"https://img.t.sinajs.cn/t4/appstyle/huati/images/common/super_card_icon/super_topic_top_icon.png\",\n" +
                "                        \"text\": \"置顶\"\n" +
                "                    },\n" +
                "                    \"readtimetype\": \"mblog\",\n" +
                "                    \"isLongText\": false,\n" +
                "                    \"in_reply_to_status_id\": \"\",\n" +
                "                    \"gif_ids\": \"\",\n" +
                "                    \"extern_safe\": 0,\n" +
                "                    \"pic_types\": \"\",\n" +
                "                    \"mblogid\": \"IqX1pm9Ub\",\n" +
                "                    \"mblog_menu_new_style\": 1,\n" +
                "                    \"source_type\": 1,\n" +
                "                    \"comments_count\": 228,\n" +
                "                    \"bmiddle_pic\": \"https://wx3.sinaimg.cn/bmiddle/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\",\n" +
                "                    \"text_tag_tips\": [],\n" +
                "                    \"text\": \"【@ 每个人：亲爱的，我们下次再聚，好吗？】不远门，不扎堆，戴口罩，勤洗手，#线上拜年云聚会#，网络问候，温暖依旧！ \u200B\u200B\u200B\",\n" +
                "                    \"reward_exhibition_type\": 0,\n" +
                "                    \"show_attitude_bar\": 0,\n" +
                "                    \"hide_multi_attitude\": 1,\n" +
                "                    \"appid\": 805015,\n" +
                "                    \"idstr\": \"4464234115281295\",\n" +
                "                    \"truncated\": false,\n" +
                "                    \"mlevel\": 0,\n" +
                "                    \"biz_feature\": 0,\n" +
                "                    \"pic_infos\": {\n" +
                "                        \"884f7263ly1gb7jbfypjyj20u01hcn5i\": {\n" +
                "                            \"thumbnail\": {\n" +
                "                                \"width\": 180,\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": 320,\n" +
                "                                \"url\": \"https://wx3.sinaimg.cn/or180/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"original\": {\n" +
                "                                \"width\": \"1080\",\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": \"1920\",\n" +
                "                                \"url\": \"https://wx3.sinaimg.cn/orj1080/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"type\": \"pic\",\n" +
                "                            \"pic_id\": \"884f7263ly1gb7jbfypjyj20u01hcn5i\",\n" +
                "                            \"bmiddle\": {\n" +
                "                                \"width\": 360,\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": 640,\n" +
                "                                \"url\": \"https://wx3.sinaimg.cn/or360/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"middleplus\": {\n" +
                "                                \"width\": 480,\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": 853,\n" +
                "                                \"url\": \"https://wx3.sinaimg.cn/or480/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"pic_status\": 0,\n" +
                "                            \"photo_tag\": 0,\n" +
                "                            \"largest\": {\n" +
                "                                \"width\": \"1080\",\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": \"1920\",\n" +
                "                                \"url\": \"https://wx3.sinaimg.cn/large/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"large\": {\n" +
                "                                \"width\": 960,\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": 1706,\n" +
                "                                \"url\": \"https://wx3.sinaimg.cn/orj960/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"object_id\": \"1042018:ff3237a0eea200255087de85290499f1\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"original_pic\": \"https://wx3.sinaimg.cn/large/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\",\n" +
                "                    \"created_at\": \"Fri Jan 24 12:23:36 +0800 2020\",\n" +
                "                    \"more_info_type\": 0,\n" +
                "                    \"edit_config\": {\n" +
                "                        \"edited\": false\n" +
                "                    },\n" +
                "                    \"pending_approval_count\": 0,\n" +
                "                    \"hasActionTypeCard\": 1,\n" +
                "                    \"recom_state\": -1,\n" +
                "                    \"attitudes_count\": 1180,\n" +
                "                    \"mid\": \"4464234115281295\",\n" +
                "                    \"source\": \"<a href=\\\"http://app.weibo.com/t/feed/2O2xZO\\\" rel=\\\"nofollow\\\">人民网微博</a>\",\n" +
                "                    \"in_reply_to_user_id\": \"\",\n" +
                "                    \"can_edit\": false,\n" +
                "                    \"pic_bg_type\": 1,\n" +
                "                    \"favorited\": false,\n" +
                "                    \"scheme\": \"sinaweibo://detail/?mblogid=IqX1pm9Ub\",\n" +
                "                    \"id\": 4464234115281295,\n" +
                "                    \"topic_struct\": [\n" +
                "                        {\n" +
                "                            \"topic_url\": \"sinaweibo://searchall?containerid=231522&q=%23%E7%BA%BF%E4%B8%8A%E6%8B%9C%E5%B9%B4%E4%BA%91%E8%81%9A%E4%BC%9A%23&extparam=%23%E7%BA%BF%E4%B8%8A%E6%8B%9C%E5%B9%B4%E4%BA%91%E8%81%9A%E4%BC%9A%23\",\n" +
                "                            \"is_invalid\": 0,\n" +
                "                            \"topic_title\": \"线上拜年云聚会\",\n" +
                "                            \"title\": \"\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"mblogtype\": 2,\n" +
                "                    \"isTop\": 1,\n" +
                "                    \"in_reply_to_screen_name\": \"\",\n" +
                "                    \"thumbnail_pic\": \"https://wx3.sinaimg.cn/thumbnail/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\",\n" +
                "                    \"is_fold\": 0,\n" +
                "                    \"userType\": 0,\n" +
                "                    \"pic_num\": 1,\n" +
                "                    \"pic_ids\": [\n" +
                "                        \"884f7263ly1gb7jbfypjyj20u01hcn5i\"\n" +
                "                    ],\n" +
                "                    \"mblog_vip_type\": 0,\n" +
                "                    \"weibo_position\": 1,\n" +
                "                    \"mblogtypename\": \"\",\n" +
                "                    \"content_auth\": 0,\n" +
                "                    \"textLength\": 112,\n" +
                "                    \"visible\": {\n" +
                "                        \"type\": 0,\n" +
                "                        \"list_id\": 0\n" +
                "                    },\n" +
                "                    \"is_paid\": false,\n" +
                "                    \"cardid\": \"star_11247_common\",\n" +
                "                    \"page_type\": 64,\n" +
                "                    \"comment_manage_info\": {\n" +
                "                        \"comment_permission_type\": -1,\n" +
                "                        \"approval_comment_type\": 0\n" +
                "                    },\n" +
                "                    \"positive_recom_flag\": 0,\n" +
                "                    \"source_allowclick\": 0,\n" +
                "                    \"geo\": \"\",\n" +
                "                    \"is_show_bulletin\": 2,\n" +
                "                    \"reposts_count\": 330,\n" +
                "                    \"hide_flag\": 1\n" +
                "                },\n" +
                "                \"publishDate\": 1579839816,\n" +
                "                \"shareCount\": 330,\n" +
                "                \"content\": \"【@ 每个人：亲爱的，我们下次再聚，好吗？】不远门，不扎堆，戴口罩，勤洗手，#线上拜年云聚会#，网络问候，温暖依旧！ \u200B\u200B\u200B\",\n" +
                "                \"id\": \"4464234115281295\",\n" +
                "                \"publishDateStr\": \"2020-01-24T04:23:36\",\n" +
                "                \"pDate\": \"2020-01-24 12:23:36\",\n" +
                "                \"imageUrls\": [\n" +
                "                    \"https://wx3.sinaimg.cn/orj1080/884f7263ly1gb7jbfypjyj20u01hcn5i.jpg\"\n" +
                "                ],\n" +
                "                \"commentCount\": 228,\n" +
                "                \"from\": {\n" +
                "                    \"id\": \"2286908003\",\n" +
                "                    \"fansCount\": 70493450,\n" +
                "                    \"extend\": {\n" +
                "                        \"ulevel\": 0,\n" +
                "                        \"verified_level\": 3,\n" +
                "                        \"verified_reason_modified\": \"\",\n" +
                "                        \"star\": 0,\n" +
                "                        \"block_app\": 1,\n" +
                "                        \"user_limit\": 0,\n" +
                "                        \"class\": 1,\n" +
                "                        \"verified_source_url\": \"\",\n" +
                "                        \"verified_reason\": \"人民网法人微博\",\n" +
                "                        \"cardid\": \"star_11247_common\",\n" +
                "                        \"is_teenager\": 0,\n" +
                "                        \"city\": \"1000\",\n" +
                "                        \"cover_image_phone\": \"https://wx4.sinaimg.cn/crop.0.0.640.640.640/884f7263ly1gb3y3vqkobj20e80e8acq.jpg;https://wx4.sinaimg.cn/crop.0.0.640.640.640/a716fd45ly1g0e36yeldnj20yi0yidlv.jpg\",\n" +
                "                        \"weihao\": \"\",\n" +
                "                        \"block_word\": 0,\n" +
                "                        \"video_status_count\": 0,\n" +
                "                        \"statuses_count\": 165757,\n" +
                "                        \"extend\": {\n" +
                "                            \"privacy\": {\n" +
                "                                \"mobile\": 0\n" +
                "                            },\n" +
                "                            \"mbprivilege\": \"0000000000000000000000000000000000000000000000000000000005c80208\"\n" +
                "                        },\n" +
                "                        \"user_ability\": 280301324,\n" +
                "                        \"verified_trade\": \"\",\n" +
                "                        \"cover_image\": \"https://wx3.sinaimg.cn/crop.0.0.920.300/884f7263gy1gb2r7qttwej20pk08cgzz.jpg\",\n" +
                "                        \"has_service_tel\": false,\n" +
                "                        \"verified_contact_name\": \"\",\n" +
                "                        \"screen_name\": \"人民网\",\n" +
                "                        \"following\": false,\n" +
                "                        \"friends_count\": 812,\n" +
                "                        \"idstr\": \"2286908003\",\n" +
                "                        \"verified_reason_url\": \"\",\n" +
                "                        \"credit_score\": 80,\n" +
                "                        \"verified\": true,\n" +
                "                        \"special_follow\": false,\n" +
                "                        \"allow_all_act_msg\": false,\n" +
                "                        \"insecurity\": {\n" +
                "                            \"sexual_content\": false\n" +
                "                        },\n" +
                "                        \"created_at\": \"Fri Aug 05 13:31:32 +0800 2011\",\n" +
                "                        \"follow_me\": false,\n" +
                "                        \"like_me\": false,\n" +
                "                        \"has_ability_tag\": 1,\n" +
                "                        \"allow_all_comment\": false,\n" +
                "                        \"profile_image_url\": \"https://tvax1.sinaimg.cn/crop.191.213.616.616.50/884f7263ly8fx0hnmtt6nj20rs0rsab5.jpg?KID=imgbed,tva&Expires=1579851400&ssig=Lr0Uj0OiqZ\",\n" +
                "                        \"level\": 2,\n" +
                "                        \"verified_type\": 3,\n" +
                "                        \"type\": 5,\n" +
                "                        \"online_status\": 0,\n" +
                "                        \"geo_enabled\": false,\n" +
                "                        \"gender\": \"m\",\n" +
                "                        \"is_guardian\": 0,\n" +
                "                        \"is_teenager_list\": 1,\n" +
                "                        \"like\": false,\n" +
                "                        \"name\": \"人民网\",\n" +
                "                        \"bi_followers_count\": 751,\n" +
                "                        \"verified_state\": 0,\n" +
                "                        \"avatar_hd\": \"https://tvax1.sinaimg.cn/crop.191.213.616.616.1024/884f7263ly8fx0hnmtt6nj20rs0rsab5.jpg?KID=imgbed,tva&Expires=1579851400&ssig=F0A%2FXlHuvJ\",\n" +
                "                        \"id\": 2286908003,\n" +
                "                        \"verified_source\": \"\",\n" +
                "                        \"pagefriends_count\": 23,\n" +
                "                        \"remark\": \"\",\n" +
                "                        \"lang\": \"zh-cn\",\n" +
                "                        \"description\": \"报道全球 传播中国\",\n" +
                "                        \"profile_url\": \"renminwang\",\n" +
                "                        \"location\": \"北京\",\n" +
                "                        \"verified_contact_mobile\": \"\",\n" +
                "                        \"tab_manage\": \"[1108236044933, 0]\",\n" +
                "                        \"verified_type_ext\": 0,\n" +
                "                        \"ptype\": 0,\n" +
                "                        \"domain\": \"renminwang\",\n" +
                "                        \"mbrank\": 7,\n" +
                "                        \"province\": \"11\",\n" +
                "                        \"badge\": {\n" +
                "                            \"hongkong_2019\": 1,\n" +
                "                            \"zongyiji\": 0,\n" +
                "                            \"yiqijuan_2018\": 0,\n" +
                "                            \"lol_s8\": 0,\n" +
                "                            \"dailv_2019\": 0,\n" +
                "                            \"unread_pool_ext\": 0,\n" +
                "                            \"gongjiri_2019\": 1,\n" +
                "                            \"hongbao_2020\": 2,\n" +
                "                            \"travel_2017\": 0,\n" +
                "                            \"fu_2019\": 0,\n" +
                "                            \"earth_2019\": 0,\n" +
                "                            \"super_star_2017\": 0,\n" +
                "                            \"memorial_2018\": 1,\n" +
                "                            \"vip_activity1\": 0,\n" +
                "                            \"wenda_v2\": 0,\n" +
                "                            \"cishan_2019\": 0,\n" +
                "                            \"lol_gm_2017\": 0,\n" +
                "                            \"weibo_display_fans\": 1,\n" +
                "                            \"dzwbqlx_2019\": 0,\n" +
                "                            \"relation_display\": 1,\n" +
                "                            \"vip_activity2\": 0,\n" +
                "                            \"worldcup_2018\": 0,\n" +
                "                            \"follow_whitelist_video\": 1,\n" +
                "                            \"dailv_2018\": 0,\n" +
                "                            \"wbzy_2019\": 0,\n" +
                "                            \"taobao\": 0,\n" +
                "                            \"uc_domain\": 0,\n" +
                "                            \"dzwbqlx_2016\": 1,\n" +
                "                            \"national_day_2018\": 1,\n" +
                "                            \"macao_2019\": 1,\n" +
                "                            \"taohuayuan_2019\": 0,\n" +
                "                            \"china_2019_2\": 1,\n" +
                "                            \"dailv\": 0,\n" +
                "                            \"lol_msi_2017\": 0,\n" +
                "                            \"shouhuan_2019\": 0,\n" +
                "                            \"family_2019\": 0,\n" +
                "                            \"super_star_2018\": 0,\n" +
                "                            \"video_attention\": 0,\n" +
                "                            \"daiyan\": 0,\n" +
                "                            \"suishoupai_2018\": 0,\n" +
                "                            \"status_visible\": 0,\n" +
                "                            \"weishi_2019\": 0,\n" +
                "                            \"double11_2018\": 0,\n" +
                "                            \"wbzy_2018\": 0,\n" +
                "                            \"cz_wed_2017\": 0,\n" +
                "                            \"gongyi_level\": 0,\n" +
                "                            \"hongbaofei_2019\": 1,\n" +
                "                            \"womensday_2018\": 0,\n" +
                "                            \"fools_day_2016\": 0,\n" +
                "                            \"uve_icon\": 0,\n" +
                "                            \"wenda\": 0,\n" +
                "                            \"china_2019\": 1,\n" +
                "                            \"anniversary\": 0,\n" +
                "                            \"self_media\": 1,\n" +
                "                            \"ali_1688\": 0,\n" +
                "                            \"uefa_euro_2016\": 0,\n" +
                "                            \"jvhuasuan_2019\": 0,\n" +
                "                            \"denglong_2019\": 0,\n" +
                "                            \"kdx_2019\": 0,\n" +
                "                            \"hongrenjie_2019\": 1,\n" +
                "                            \"shuang11_2019\": 0,\n" +
                "                            \"rrgyj_2019\": 1,\n" +
                "                            \"enterprise\": 1,\n" +
                "                            \"ant_2019\": 0,\n" +
                "                            \"user_name_certificate\": 1,\n" +
                "                            \"v_influence_2018\": 0,\n" +
                "                            \"bind_taobao\": 0,\n" +
                "                            \"kpl_2018\": 0,\n" +
                "                            \"meilizhongguo_2018\": 0,\n" +
                "                            \"asiad_2018\": 0,\n" +
                "                            \"daqi_2019\": 0,\n" +
                "                            \"gongyi\": 0,\n" +
                "                            \"unread_pool\": 0,\n" +
                "                            \"panda\": 1,\n" +
                "                            \"suishoupai_2019\": 0,\n" +
                "                            \"wenchuan_10th\": 1,\n" +
                "                            \"discount_2016\": 0,\n" +
                "                            \"avengers_2019\": 0,\n" +
                "                            \"starlight_2019\": 1,\n" +
                "                            \"league_badge_2018\": 0,\n" +
                "                            \"league_badge\": 1,\n" +
                "                            \"wusi_2019\": 0,\n" +
                "                            \"inspector\": 0,\n" +
                "                            \"qixi_2018\": 1\n" +
                "                        },\n" +
                "                        \"urank\": 48,\n" +
                "                        \"favourites_count\": 76,\n" +
                "                        \"mbtype\": 12,\n" +
                "                        \"badge_top\": \"\",\n" +
                "                        \"story_read_state\": -1,\n" +
                "                        \"vclub_member\": 0,\n" +
                "                        \"url\": \"\",\n" +
                "                        \"avatar_large\": \"https://tvax1.sinaimg.cn/crop.191.213.616.616.180/884f7263ly8fx0hnmtt6nj20rs0rsab5.jpg?KID=imgbed,tva&Expires=1579851400&ssig=JQ6Q27ZyJk\",\n" +
                "                        \"followers_count\": 70493450,\n" +
                "                        \"icons\": [\n" +
                "                            {\n" +
                "                                \"scheme\": \"https://new.vip.weibo.cn/hongbaofei/pay?sinainternalbrowser=topnav&toolbar_hidden=1&F=hbf_2020_xhg_feed\",\n" +
                "                                \"url\": \"https://h5.sinaimg.cn/upload/2016/09/27/494/common_icon_membership_level7.png\",\n" +
                "                                \"name\": \"vip\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"url\": \"https://h5.sinaimg.cn/upload/1017/172/2019/12/27/feed_icon_20hbkyk42x42c.png\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"url\": \"https://h5.sinaimg.cn/upload/1078/660/2018/04/27/feed_icon_panda_new2.png\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"verified_contact_email\": \"\"\n" +
                "                    },\n" +
                "                    \"description\": \"报道全球 传播中国\",\n" +
                "                    \"likeCount\": 1180,\n" +
                "                    \"url\": \"http://weibo.com/u/2286908003\",\n" +
                "                    \"name\": \"人民网\",\n" +
                "                    \"postCount\": 165757,\n" +
                "                    \"friendCount\": 812\n" +
                "                }\n" +
                "            },\n" +
                "            {\n" +
                "                \"url\": \"http://weibo.com/2286908003/IqW3Th1hy\",\n" +
                "                \"likeCount\": 4403,\n" +
                "                \"mblog\": {\n" +
                "                    \"pic_bg_new\": \"http://vip.storage.weibo.com/feed_cover/star_11247_common_mobile_new.png?version=2019071801\",\n" +
                "                    \"attitudes_status\": 0,\n" +
                "                    \"show_additional_indication\": 0,\n" +
                "                    \"readtimetype\": \"mblog\",\n" +
                "                    \"isLongText\": false,\n" +
                "                    \"in_reply_to_status_id\": \"\",\n" +
                "                    \"gif_ids\": \"\",\n" +
                "                    \"extern_safe\": 0,\n" +
                "                    \"pic_types\": \"\",\n" +
                "                    \"mblogid\": \"IqW3Th1hy\",\n" +
                "                    \"mblog_menu_new_style\": 1,\n" +
                "                    \"text\": \"妈妈对不起，今年又不回家了…[泪]#疫情中的逆行者# \u200B\u200B\u200B\",\n" +
                "                    \"comments_count\": 449,\n" +
                "                    \"bmiddle_pic\": \"https://wx1.sinaimg.cn/bmiddle/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\",\n" +
                "                    \"source_type\": 1,\n" +
                "                    \"text_tag_tips\": [],\n" +
                "                    \"edit_at\": \"Fri Jan 24 09:59:43 +0800 2020\",\n" +
                "                    \"reward_exhibition_type\": 0,\n" +
                "                    \"show_attitude_bar\": 0,\n" +
                "                    \"in_reply_to_screen_name\": \"\",\n" +
                "                    \"appid\": 780,\n" +
                "                    \"idstr\": \"4464197214056508\",\n" +
                "                    \"truncated\": false,\n" +
                "                    \"mlevel\": 0,\n" +
                "                    \"biz_feature\": 0,\n" +
                "                    \"pic_infos\": {\n" +
                "                        \"884f7263ly1gb7f2a9clwj20cucmzx71\": {\n" +
                "                            \"thumbnail\": {\n" +
                "                                \"width\": 180,\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": 600,\n" +
                "                                \"url\": \"https://wx1.sinaimg.cn/or180/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"original\": {\n" +
                "                                \"width\": \"462\",\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": \"16379\",\n" +
                "                                \"url\": \"https://wx1.sinaimg.cn/orj1080/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"type\": \"pic\",\n" +
                "                            \"pic_id\": \"884f7263ly1gb7f2a9clwj20cucmzx71\",\n" +
                "                            \"bmiddle\": {\n" +
                "                                \"width\": 360,\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": 1200,\n" +
                "                                \"url\": \"https://wx1.sinaimg.cn/or360/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"middleplus\": {\n" +
                "                                \"width\": \"462\",\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": 1540,\n" +
                "                                \"url\": \"https://wx1.sinaimg.cn/or480/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"pic_status\": 0,\n" +
                "                            \"photo_tag\": 0,\n" +
                "                            \"largest\": {\n" +
                "                                \"width\": \"462\",\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": \"16379\",\n" +
                "                                \"url\": \"https://wx1.sinaimg.cn/large/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"large\": {\n" +
                "                                \"width\": \"462\",\n" +
                "                                \"cut_type\": 1,\n" +
                "                                \"height\": \"16379\",\n" +
                "                                \"url\": \"https://wx1.sinaimg.cn/orj960/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\",\n" +
                "                                \"type\": \"\"\n" +
                "                            },\n" +
                "                            \"object_id\": \"1042018:cbe70fc2cd7fb7dd2a3ba914c21d2575\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"original_pic\": \"https://wx1.sinaimg.cn/large/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\",\n" +
                "                    \"created_at\": \"Fri Jan 24 09:56:58 +0800 2020\",\n" +
                "                    \"more_info_type\": 0,\n" +
                "                    \"edit_config\": {\n" +
                "                        \"menu_edit_history\": {\n" +
                "                            \"title\": \"查看编辑记录\",\n" +
                "                            \"scheme\": \"sinaweibo://cardlist?containerid=231440_-_4464197214056508&title=编辑记录\"\n" +
                "                        },\n" +
                "                        \"edited\": true\n" +
                "                    },\n" +
                "                    \"pending_approval_count\": 0,\n" +
                "                    \"hasActionTypeCard\": 1,\n" +
                "                    \"recom_state\": -1,\n" +
                "                    \"attitudes_count\": 4403,\n" +
                "                    \"mid\": \"4464197214056508\",\n" +
                "                    \"source\": \"<a href=\\\"http://app.weibo.com/t/feed/6vtZb0\\\" rel=\\\"nofollow\\\">微博 weibo.com</a>\",\n" +
                "                    \"in_reply_to_user_id\": \"\",\n" +
                "                    \"can_edit\": false,\n" +
                "                    \"pic_bg_type\": 1,\n" +
                "                    \"favorited\": false,\n" +
                "                    \"scheme\": \"sinaweibo://detail/?mblogid=IqW3Th1hy\",\n" +
                "                    \"id\": 4464197214056508,\n" +
                "                    \"topic_struct\": [\n" +
                "                        {\n" +
                "                            \"topic_url\": \"sinaweibo://searchall?containerid=231522&q=%23%E7%96%AB%E6%83%85%E4%B8%AD%E7%9A%84%E9%80%86%E8%A1%8C%E8%80%85%23&extparam=%23%E7%96%AB%E6%83%85%E4%B8%AD%E7%9A%84%E9%80%86%E8%A1%8C%E8%80%85%23\",\n" +
                "                            \"is_invalid\": 0,\n" +
                "                            \"topic_title\": \"疫情中的逆行者\",\n" +
                "                            \"title\": \"\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"mblogtype\": 0,\n" +
                "                    \"hide_multi_attitude\": 1,\n" +
                "                    \"thumbnail_pic\": \"https://wx1.sinaimg.cn/thumbnail/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\",\n" +
                "                    \"is_fold\": 0,\n" +
                "                    \"userType\": 0,\n" +
                "                    \"pic_num\": 1,\n" +
                "                    \"pic_ids\": [\n" +
                "                        \"884f7263ly1gb7f2a9clwj20cucmzx71\"\n" +
                "                    ],\n" +
                "                    \"mblog_vip_type\": 0,\n" +
                "                    \"weibo_position\": 1,\n" +
                "                    \"edit_count\": 2,\n" +
                "                    \"mblogtypename\": \"\",\n" +
                "                    \"content_auth\": 0,\n" +
                "                    \"textLength\": 48,\n" +
                "                    \"visible\": {\n" +
                "                        \"type\": 0,\n" +
                "                        \"list_id\": 0\n" +
                "                    },\n" +
                "                    \"is_paid\": false,\n" +
                "                    \"cardid\": \"star_11247_common\",\n" +
                "                    \"page_type\": 64,\n" +
                "                    \"comment_manage_info\": {\n" +
                "                        \"comment_permission_type\": -1,\n" +
                "                        \"approval_comment_type\": 0\n" +
                "                    },\n" +
                "                    \"positive_recom_flag\": 0,\n" +
                "                    \"source_allowclick\": 0,\n" +
                "                    \"geo\": \"\",\n" +
                "                    \"version\": 2,\n" +
                "                    \"is_show_bulletin\": 2,\n" +
                "                    \"reposts_count\": 873,\n" +
                "                    \"hide_flag\": 1\n" +
                "                },\n" +
                "                \"publishDate\": 1579831018,\n" +
                "                \"shareCount\": 873,\n" +
                "                \"content\": \"妈妈对不起，今年又不回家了…[泪]#疫情中的逆行者# \u200B\u200B\u200B\",\n" +
                "                \"id\": \"4464197214056508\",\n" +
                "                \"publishDateStr\": \"2020-01-24T01:56:58\",\n" +
                "                \"pDate\": \"2020-01-24 09:56:58\",\n" +
                "                \"imageUrls\": [\n" +
                "                    \"https://wx1.sinaimg.cn/orj1080/884f7263ly1gb7f2a9clwj20cucmzx71.jpg\"\n" +
                "                ],\n" +
                "                \"commentCount\": 449,\n" +
                "                \"from\": {\n" +
                "                    \"id\": \"2286908003\",\n" +
                "                    \"fansCount\": 70493450,\n" +
                "                    \"extend\": {\n" +
                "                        \"ulevel\": 0,\n" +
                "                        \"verified_level\": 3,\n" +
                "                        \"verified_reason_modified\": \"\",\n" +
                "                        \"star\": 0,\n" +
                "                        \"block_app\": 1,\n" +
                "                        \"user_limit\": 0,\n" +
                "                        \"class\": 1,\n" +
                "                        \"verified_source_url\": \"\",\n" +
                "                        \"verified_reason\": \"人民网法人微博\",\n" +
                "                        \"cardid\": \"star_11247_common\",\n" +
                "                        \"is_teenager\": 0,\n" +
                "                        \"city\": \"1000\",\n" +
                "                        \"cover_image_phone\": \"https://wx4.sinaimg.cn/crop.0.0.640.640.640/884f7263ly1gb3y3vqkobj20e80e8acq.jpg;https://wx4.sinaimg.cn/crop.0.0.640.640.640/a716fd45ly1g0e36yeldnj20yi0yidlv.jpg\",\n" +
                "                        \"weihao\": \"\",\n" +
                "                        \"block_word\": 0,\n" +
                "                        \"video_status_count\": 0,\n" +
                "                        \"statuses_count\": 165757,\n" +
                "                        \"extend\": {\n" +
                "                            \"privacy\": {\n" +
                "                                \"mobile\": 0\n" +
                "                            },\n" +
                "                            \"mbprivilege\": \"0000000000000000000000000000000000000000000000000000000005c80208\"\n" +
                "                        },\n" +
                "                        \"user_ability\": 280301324,\n" +
                "                        \"verified_trade\": \"\",\n" +
                "                        \"cover_image\": \"https://wx3.sinaimg.cn/crop.0.0.920.300/884f7263gy1gb2r7qttwej20pk08cgzz.jpg\",\n" +
                "                        \"has_service_tel\": false,\n" +
                "                        \"verified_contact_name\": \"\",\n" +
                "                        \"screen_name\": \"人民网\",\n" +
                "                        \"following\": false,\n" +
                "                        \"friends_count\": 812,\n" +
                "                        \"idstr\": \"2286908003\",\n" +
                "                        \"verified_reason_url\": \"\",\n" +
                "                        \"credit_score\": 80,\n" +
                "                        \"verified\": true,\n" +
                "                        \"special_follow\": false,\n" +
                "                        \"allow_all_act_msg\": false,\n" +
                "                        \"insecurity\": {\n" +
                "                            \"sexual_content\": false\n" +
                "                        },\n" +
                "                        \"created_at\": \"Fri Aug 05 13:31:32 +0800 2011\",\n" +
                "                        \"follow_me\": false,\n" +
                "                        \"like_me\": false,\n" +
                "                        \"has_ability_tag\": 1,\n" +
                "                        \"allow_all_comment\": false,\n" +
                "                        \"profile_image_url\": \"https://tvax1.sinaimg.cn/crop.191.213.616.616.50/884f7263ly8fx0hnmtt6nj20rs0rsab5.jpg?KID=imgbed,tva&Expires=1579851400&ssig=Lr0Uj0OiqZ\",\n" +
                "                        \"level\": 2,\n" +
                "                        \"verified_type\": 3,\n" +
                "                        \"type\": 5,\n" +
                "                        \"online_status\": 0,\n" +
                "                        \"geo_enabled\": false,\n" +
                "                        \"gender\": \"m\",\n" +
                "                        \"is_guardian\": 0,\n" +
                "                        \"is_teenager_list\": 1,\n" +
                "                        \"like\": false,\n" +
                "                        \"name\": \"人民网\",\n" +
                "                        \"bi_followers_count\": 751,\n" +
                "                        \"verified_state\": 0,\n" +
                "                        \"avatar_hd\": \"https://tvax1.sinaimg.cn/crop.191.213.616.616.1024/884f7263ly8fx0hnmtt6nj20rs0rsab5.jpg?KID=imgbed,tva&Expires=1579851400&ssig=F0A%2FXlHuvJ\",\n" +
                "                        \"id\": 2286908003,\n" +
                "                        \"verified_source\": \"\",\n" +
                "                        \"pagefriends_count\": 23,\n" +
                "                        \"remark\": \"\",\n" +
                "                        \"lang\": \"zh-cn\",\n" +
                "                        \"description\": \"报道全球 传播中国\",\n" +
                "                        \"profile_url\": \"renminwang\",\n" +
                "                        \"location\": \"北京\",\n" +
                "                        \"verified_contact_mobile\": \"\",\n" +
                "                        \"tab_manage\": \"[1108236044933, 0]\",\n" +
                "                        \"verified_type_ext\": 0,\n" +
                "                        \"ptype\": 0,\n" +
                "                        \"domain\": \"renminwang\",\n" +
                "                        \"mbrank\": 7,\n" +
                "                        \"province\": \"11\",\n" +
                "                        \"badge\": {\n" +
                "                            \"hongkong_2019\": 1,\n" +
                "                            \"zongyiji\": 0,\n" +
                "                            \"yiqijuan_2018\": 0,\n" +
                "                            \"lol_s8\": 0,\n" +
                "                            \"dailv_2019\": 0,\n" +
                "                            \"unread_pool_ext\": 0,\n" +
                "                            \"gongjiri_2019\": 1,\n" +
                "                            \"hongbao_2020\": 2,\n" +
                "                            \"travel_2017\": 0,\n" +
                "                            \"fu_2019\": 0,\n" +
                "                            \"earth_2019\": 0,\n" +
                "                            \"super_star_2017\": 0,\n" +
                "                            \"memorial_2018\": 1,\n" +
                "                            \"vip_activity1\": 0,\n" +
                "                            \"wenda_v2\": 0,\n" +
                "                            \"cishan_2019\": 0,\n" +
                "                            \"lol_gm_2017\": 0,\n" +
                "                            \"weibo_display_fans\": 1,\n" +
                "                            \"dzwbqlx_2019\": 0,\n" +
                "                            \"relation_display\": 1,\n" +
                "                            \"vip_activity2\": 0,\n" +
                "                            \"worldcup_2018\": 0,\n" +
                "                            \"follow_whitelist_video\": 1,\n" +
                "                            \"dailv_2018\": 0,\n" +
                "                            \"wbzy_2019\": 0,\n" +
                "                            \"taobao\": 0,\n" +
                "                            \"uc_domain\": 0,\n" +
                "                            \"dzwbqlx_2016\": 1,\n" +
                "                            \"national_day_2018\": 1,\n" +
                "                            \"macao_2019\": 1,\n" +
                "                            \"taohuayuan_2019\": 0,\n" +
                "                            \"china_2019_2\": 1,\n" +
                "                            \"dailv\": 0,\n" +
                "                            \"lol_msi_2017\": 0,\n" +
                "                            \"shouhuan_2019\": 0,\n" +
                "                            \"family_2019\": 0,\n" +
                "                            \"super_star_2018\": 0,\n" +
                "                            \"video_attention\": 0,\n" +
                "                            \"daiyan\": 0,\n" +
                "                            \"suishoupai_2018\": 0,\n" +
                "                            \"status_visible\": 0,\n" +
                "                            \"weishi_2019\": 0,\n" +
                "                            \"double11_2018\": 0,\n" +
                "                            \"wbzy_2018\": 0,\n" +
                "                            \"cz_wed_2017\": 0,\n" +
                "                            \"gongyi_level\": 0,\n" +
                "                            \"hongbaofei_2019\": 1,\n" +
                "                            \"womensday_2018\": 0,\n" +
                "                            \"fools_day_2016\": 0,\n" +
                "                            \"uve_icon\": 0,\n" +
                "                            \"wenda\": 0,\n" +
                "                            \"china_2019\": 1,\n" +
                "                            \"anniversary\": 0,\n" +
                "                            \"self_media\": 1,\n" +
                "                            \"ali_1688\": 0,\n" +
                "                            \"uefa_euro_2016\": 0,\n" +
                "                            \"jvhuasuan_2019\": 0,\n" +
                "                            \"denglong_2019\": 0,\n" +
                "                            \"kdx_2019\": 0,\n" +
                "                            \"hongrenjie_2019\": 1,\n" +
                "                            \"shuang11_2019\": 0,\n" +
                "                            \"rrgyj_2019\": 1,\n" +
                "                            \"enterprise\": 1,\n" +
                "                            \"ant_2019\": 0,\n" +
                "                            \"user_name_certificate\": 1,\n" +
                "                            \"v_influence_2018\": 0,\n" +
                "                            \"bind_taobao\": 0,\n" +
                "                            \"kpl_2018\": 0,\n" +
                "                            \"meilizhongguo_2018\": 0,\n" +
                "                            \"asiad_2018\": 0,\n" +
                "                            \"daqi_2019\": 0,\n" +
                "                            \"gongyi\": 0,\n" +
                "                            \"unread_pool\": 0,\n" +
                "                            \"panda\": 1,\n" +
                "                            \"suishoupai_2019\": 0,\n" +
                "                            \"wenchuan_10th\": 1,\n" +
                "                            \"discount_2016\": 0,\n" +
                "                            \"avengers_2019\": 0,\n" +
                "                            \"starlight_2019\": 1,\n" +
                "                            \"league_badge_2018\": 0,\n" +
                "                            \"league_badge\": 1,\n" +
                "                            \"wusi_2019\": 0,\n" +
                "                            \"inspector\": 0,\n" +
                "                            \"qixi_2018\": 1\n" +
                "                        },\n" +
                "                        \"urank\": 48,\n" +
                "                        \"favourites_count\": 76,\n" +
                "                        \"mbtype\": 12,\n" +
                "                        \"badge_top\": \"\",\n" +
                "                        \"story_read_state\": -1,\n" +
                "                        \"vclub_member\": 0,\n" +
                "                        \"url\": \"\",\n" +
                "                        \"avatar_large\": \"https://tvax1.sinaimg.cn/crop.191.213.616.616.180/884f7263ly8fx0hnmtt6nj20rs0rsab5.jpg?KID=imgbed,tva&Expires=1579851400&ssig=JQ6Q27ZyJk\",\n" +
                "                        \"followers_count\": 70493450,\n" +
                "                        \"icons\": [\n" +
                "                            {\n" +
                "                                \"scheme\": \"https://new.vip.weibo.cn/hongbaofei/pay?sinainternalbrowser=topnav&toolbar_hidden=1&F=hbf_2020_xhg_feed\",\n" +
                "                                \"url\": \"https://h5.sinaimg.cn/upload/2016/09/27/494/common_icon_membership_level7.png\",\n" +
                "                                \"name\": \"vip\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"url\": \"https://h5.sinaimg.cn/upload/1017/172/2019/12/27/feed_icon_20hbkyk42x42c.png\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"url\": \"https://h5.sinaimg.cn/upload/1078/660/2018/04/27/feed_icon_panda_new2.png\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"verified_contact_email\": \"\"\n" +
                "                    },\n" +
                "                    \"description\": \"报道全球 传播中国\",\n" +
                "                    \"likeCount\": 4403,\n" +
                "                    \"url\": \"http://weibo.com/u/2286908003\",\n" +
                "                    \"name\": \"人民网\",\n" +
                "                    \"postCount\": 165757,\n" +
                "                    \"friendCount\": 812\n" +
                "                }\n" +
                "            }\n" +
                "        ],\n" +
                "        \"hasNext\": true,\n" +
                "        \"retcode\": \"000000\",\n" +
                "        \"appCode\": \"weibo\",\n" +
                "        \"dataType\": \"post\",\n" +
                "        \"pageToken\": \"2\"\n" +
                "    }\n" +
                "}";
        JSONObject apiJsonObject = JSON.parseObject(apiResult);
        String code = (String) apiJsonObject.get("code");
        if ("10000".equals(code)) {
            JSONObject resultJsonObject = (JSONObject) apiJsonObject.get("result");
            JSONArray data = (JSONArray) resultJsonObject.get("data");
            List<WeiboDTO> list = data.toJavaList(WeiboDTO.class);
            list.forEach(item -> {
                String content = item.getContent();
            });
        }
        log.info(">>> success");
    }

    @Test
    public void testMethod() {
        List<String> keywordsList = ncovNewsKeywordsService.getNcovNewsKeywords();
        log.info(JSON.toJSONString(keywordsList));
    }
}
