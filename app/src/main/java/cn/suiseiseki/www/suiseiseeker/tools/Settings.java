package cn.suiseiseki.www.suiseiseeker.tools;

/**
 * Created by Suiseiseki/shuikeyi on 2016/3/15.
 */
public class Settings {
    /**
     * You may set your own URL and other things here
     */
    public static final String MAIN_URL = "http://www.suiseiseki.cn/";
    public static final String CATEGORY_INDEX_URL = MAIN_URL + "?json=get_category_index";
    public static final String DEFAULT_THUMBNAIL_URL = "http://www.iconpng.com/png/mono-general/document.png";
    public static final String NONCE_URL = MAIN_URL + "api/get_nonce/?controller=posts&method=create_post";
    public static final String NONCE_URL_DELETE = MAIN_URL + "api/get_nonce/?controller=posts&method=delete_post";
    public static final String CREATE_POST_URL = MAIN_URL + "api/create_post/";
    public static final String DELETE_POST_URL = MAIN_URL + "api/posts/delete_post/";
    /**
     * The Nonce, DO NOT EDIT OR EAT!
     * Fuck the AsyncVolley
     */
    public static String Nonce = null;
    public static String Nonce_delete = null;

}
