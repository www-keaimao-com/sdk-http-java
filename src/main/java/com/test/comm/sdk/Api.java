package com.test.comm.sdk;

import com.alibaba.fastjson.JSONObject;
import com.test.comm.utils.HttpUtil;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

public class Api {
    private final static String API_URL = "http://127.0.0.1:8073/send";

    /**
     * 发送文字消息(好友或者群)
     *
     * @param robot_wxid String robot_wxid 登录账号id，用哪个账号去发送这条消息
     * @param to_wxid    String to_wxid 对方的id，可以是群或者好友id
     * @param msg        String msg     消息内容
     * @return string json_string
     */
    public static String send_text_msg(String robot_wxid, String to_wxid, String msg) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "100");// Api数值（可以参考 - api列表demo）
        map.put("msg", URLEncoder.encode(msg, "UTF-8"));// 发送内容
        map.put("to_wxid", to_wxid);// 对方id
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 发送群消息并艾特某人
     * @about qsls9
     * @about qsls9
     * String robot_wxid 账户id，用哪个账号去发送这条消息
     * String to_wxid 群id
     * String at_wxid 艾特的id，群成员的id
     * String at_name 艾特的昵称，群成员的昵称
     * String msg     消息内容
     *
     * @return string json_string
     */
    public static String send_group_at_msg(String robot_wxid, String to_wxid, String at_wxid, String at_name, String msg) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "102");// Api数值（可以参考 - api列表demo）
        map.put("msg", URLEncoder.encode(msg, "UTF-8"));// 发送内容
        map.put("to_wxid", to_wxid);// 对方id
        map.put("at_wxid", at_wxid);// 艾特的id，群成员的id
        map.put("at_name", at_name);// 艾特的昵称，群成员的昵称
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 发送图片消息
     * @about qsls9
     * @about qsls9
     * String robot_wxid 登录账号id，用哪个账号去发送这条消息
     * String to_wxid 对方的id，可以是群或者好友id
     * String path    图片的绝对路径
     *
     * @return string json_string
     */
    public static String send_image_msg(String robot_wxid, String to_wxid, String path) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "103");// Api数值（可以参考 - api列表demo）
        map.put("msg", path);// 发送的图片的绝对路径
        map.put("to_wxid", to_wxid);// 对方id
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 发送视频消息
     * @about qsls9
     * @about qsls9
     * String robot_wxid 账户id，用哪个账号去发送这条消息
     * String to_wxid 对方的id，可以是群或者好友id
     * String path    视频的绝对路径
     *
     * @return string json_string
     */
    public static String send_video_msg(String robot_wxid, String to_wxid, String path) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "104");// Api数值（可以参考 - api列表demo）
        map.put("msg", path);// 发送的视频的绝对路径
        map.put("to_wxid", to_wxid);// 对方id
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 发送文件消息
     * @about qsls9
     * @about qsls9
     * String robot_wxid 账户id，用哪个账号去发送这条消息
     * String to_wxid 对方的id，可以是群或者好友id
     * String path    文件的绝对路径
     *
     * @return string json_string
     */
    public static String send_file_msg(String robot_wxid, String to_wxid, String path) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "105");// Api数值（可以参考 - api列表demo）
        map.put("msg", path);// 发送的文件的绝对路径
        map.put("to_wxid", to_wxid);// 对方id
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 发送动态表情
     * @about qsls9
     * @about qsls9
     * String robot_wxid 账户id，用哪个账号去发送这条消息
     * String to_wxid 对方的id，可以是群或者好友id
     * String path    动态表情文件（通常是gif）的绝对路径
     *
     * @return string json_string
     */
    public static String send_emoji_msg(String robot_wxid, String to_wxid, String path) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "106");// Api数值（可以参考 - api列表demo）
        map.put("msg", path);// 发送的文件的绝对路径
        map.put("to_wxid", to_wxid);// 对方id
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 发送分享链接
     * @about qsls9
     * @about qsls9
     * String robot_wxid    账户id，用哪个账号去发送这条消息
     * String to_wxid    对方的id，可以是群或者好友id
     * $title      链接标题
     * $text       链接内容
     * $target_url 跳转链接
     * $pic_url    图片链接
     *
     * @return string json_string
     */
    public static String send_link_msg(String robot_wxid, String to_wxid, String title, String text, String target_url, String pic_url) throws IOException {

        // 封装链接结构体
        HashMap<String, String> map = new HashMap<String, String>();
        HashMap<String, String> link = new HashMap<String, String>();
        link.put("title", title);
        link.put("text", text);
        link.put("url", target_url);
        link.put("pic", pic_url);

        // 封装返回数据结构
        map.put("type", "107");// Api数值（可以参考 - api列表demo）
        map.put("msg", link.toString());// 发送的分享链接结构体
        map.put("to_wxid", to_wxid);// 对方id
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 发送音乐分享
     * @about qsls9
     * @about qsls9
     * String robot_wxid 账户id，用哪个账号去发送这条消息
     * String to_wxid 对方的id，可以是群或者好友id
     * $name    歌曲名字
     *
     * @return string json_string
     */
    public static String send_music_msg(String robot_wxid, String to_wxid, String name) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "108");// Api数值（可以参考 - api列表demo）
        map.put("msg", URLEncoder.encode(name, "UTF-8"));// 歌曲名字
        map.put("to_wxid", to_wxid);// 对方id
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 取指定登录账号的昵称
     * @about qsls9
     * @about qsls9
     * String robot_wxid 账户id
     *
     * @return string 账号昵称
     */
    public static String get_robot_name(String robot_wxid) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "201");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 取指定登录账号的头像
     * @about qsls9
     * @about qsls9
     * String robot_wxid 账户id
     *
     * @return string 头像http地址
     */
    public static String get_robot_headimgurl(String robot_wxid) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "202");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 取登录账号列表
     * @about qsls9
     * @about qsls9
     * String robot_wxid 账户id
     *
     * @return string 当前框架已登录的账号信息列表
     */
    public static String get_logged_account_list() throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "203");// Api数值（可以参考 - api列表demo）
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 取好友列表
     * @about qsls9
     * @about qsls9
     * String robot_wxid    账户id
     * $is_refresh 是否刷新
     *
     * @return string 当前框架已登录的账号信息列表
     */
    public static String get_friend_list(String robot_wxid, String is_refresh) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "204");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid); // 账户id（可选，如果填空字符串，即取所有登录账号的好友列表，反正取指定账号的列表）
        map.put("is_refresh", is_refresh);// 是否刷新列表，0 从缓存获取 / 1 刷新并获取
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 取群聊列表
     * @about qsls9
     * @about qsls9
     * String robot_wxid    账户id
     * $is_refresh 是否刷新
     *
     * @return string 当前框架已登录的账号信息列表
     */
    public static String get_group_list(String robot_wxid, String is_refresh) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "205");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("is_refresh", is_refresh);// 是否刷新
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 取群成员列表
     * @about qsls9
     * @about qsls9
     * String robot_wxid    账户id
     * String group_wxid 群id
     * $is_refresh 是否刷新，0 从缓存获取 / 1 刷新并获取
     *
     * @return string 当前框架已登录的账号信息列表
     */
    public static String get_group_member_list(String robot_wxid, String group_wxid, String is_refresh) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "206");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("group_wxid", group_wxid);// 群id
        map.put("is_refresh", is_refresh);// 是否刷新列表，0 从缓存获取 / 1 刷新并获取
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));

    }


    /**
     * 取群成员资料
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * String group_wxid  群id
     * $member_wxid 群成员id
     *
     * @return string json_string
     */
    public static String get_group_member(String robot_wxid, String group_wxid, String member_wxid) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "207");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("group_wxid", group_wxid);// 群id
        map.put("member_wxid", member_wxid);// 群成员id
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 接收好友转账
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * String friend_wxid 朋友id
     * $json_string 转账事件原消息
     *
     * @return string json_string
     */
    public static String accept_transfer(String robot_wxid, String friend_wxid, String json_string) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "301");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("friend_wxid", friend_wxid);// 朋友id
        map.put("msg", json_string);// 群成员id
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 同意群聊邀请
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * $json_string 同步消息事件中群聊邀请原消息
     *
     * @return string json_string
     */
    public static String agree_group_invite(String robot_wxid, String json_string) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "302");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("msg", json_string);// 同步消息事件中群聊邀请原消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 同意好友请求
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * $json_string 好友请求事件中原消息
     *
     * @return string json_string
     */
    public static String agree_friend_verify(String robot_wxid, String json_string) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "303");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("msg", json_string);// 同步消息事件中群聊邀请原消息
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }

    /**
     * 修改好友备注
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * String friend_wxid 好友id
     * $note 新备注（空字符串则是删除备注）
     *
     * @return string json_string
     */
    public static String modify_friend_note(String robot_wxid, String friend_wxid, String note) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "304");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("friend_wxid", friend_wxid);// 朋友id
        map.put("note", URLEncoder.encode(note, "UTF-8"));// 新备注（空字符串则是删除备注）
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 删除好友
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * String friend_wxid 好友id
     *
     * @return string json_string
     */
    public static String delete_friend(String robot_wxid, String friend_wxid) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "305");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("friend_wxid", friend_wxid);// 朋友id
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 踢出群成员
     * String robot_wxid     账户id
     * String group_wxid  群id
     * $member_wxid 群成员id
     *
     * @return string json_string
     */
    public static String remove_group_member(String robot_wxid, String group_wxid, String member_wxid) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "306");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("group_wxid", group_wxid);// 群id
        map.put("member_wxid", member_wxid);// 群成员id
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 修改群名称
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * String group_wxid  群id
     * String group_name  新群名
     *
     * @return string json_string
     */
    public static String modify_group_name(String robot_wxid, String group_wxid, String group_name) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "307");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("group_wxid", group_wxid);// 群id
        map.put("group_name", group_name);// 新群名
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }

    /**
     * 修改群公告
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * String group_wxid  群id
     * $notice      新公告
     *
     * @return string json_string
     */
    public static String modify_group_notice(String robot_wxid, String group_wxid, String notice) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "308");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("group_wxid", group_wxid);// 群id
        map.put("notice", notice);// 新公告
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 建立新群
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     *
     * @param friends<String>     三个人及以上的好友id数组，['wxid_1xxx', 'wxid_2xxx', 'wxid_3xxx', 'wxid_4xxx']
     * @return string json_string
     */
    public static String building_group(String robot_wxid, ArrayList<String> friends) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "309");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("friends", friends.toString());// 三个人及以上的好友id数组
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }


    /**
     * 退出群聊
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * String group_wxid  群id
     *
     * @return string json_string
     */
    public static String quit_group(String robot_wxid, String group_wxid) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "310");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("group_wxid", group_wxid);// 群id
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }

    /**
     * 邀请加入群聊
     * @about qsls9
     * @about qsls9
     * String robot_wxid     账户id
     * String group_wxid  群id
     * String friend_wxid 好友id
     *
     * @return string json_string
     */
    public static String invite_in_group(String robot_wxid, String group_wxid, String friend_wxid) throws IOException {
        // 封装返回数据结构
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "311");// Api数值（可以参考 - api列表demo）
        map.put("robot_wxid", robot_wxid);// 账户id，用哪个账号去发送这条消息
        map.put("group_wxid", group_wxid);// 群id
        map.put("friend_wxid", friend_wxid);// 好友id
        return HttpUtil.post(API_URL, JSONObject.toJSONString(map));
    }
}
