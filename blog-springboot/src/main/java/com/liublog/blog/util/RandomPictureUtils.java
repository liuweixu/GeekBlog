package com.liublog.blog.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Weixu Liu
 * @date 2023/08/04
 */

public class RandomPictureUtils {

    public static List<String> list = new ArrayList<>();
    public static void addPicture(List<String> list){
        list.add("https://t.mwm.moe/pc");
        list.add("https://t.mwm.moe/ysz");
        list.add("https://t.mwm.moe/fj");
        list.add("https://t.mwm.moe/bd");
        list.add("https://t.mwm.moe/moez");
        list.add("https://t.mwm.moe/ys");
        list.add("https://t.mwm.moe/ycy");
        list.add("https://imgapi.xl0408.top/index.php");
        list.add("https://www.dmoe.cc/random.php");
        list.add("https://api.btstu.cn/sjbz/api.php?lx=fengjing&format=images");
        list.add("https://api.btstu.cn/sjbz/api.php?lx=dongman&format=images");
        list.add("http://dsyai.club/api/DmImg.php");
        list.add("https://api.vvhan.com/api/acgimg");
        list.add("https://api.vvhan.com/api/view");
        list.add("https://api.boxmoe.com/random.php");
        list.add("https://api.horosama.com/random.php?name=anime");
        list.add("https://api.horosama.com/random.php?name=genshin");
        list.add("https://api.yimian.xyz/img?type=moe&size=1920x1080"); //有失效风险
        list.add("https://api.dujin.org/pic/yuanshen/");
        //有随时失效风险
        list.add("https://api.r10086.com/%E6%A8%B1%E9%81%93%E9%9A%8F%E6%9C%BA%E5%9B%BE%E7%89%87api%E6%8E%A5%E5%8F%A3.php?%E5%9B%BE%E7%89%87%E7%B3%BB%E5%88%97=%E9%A3%8E%E6%99%AF%E7%B3%BB%E5%88%973");
        //有随时失效风险
        list.add("https://api.r10086.com/%E6%A8%B1%E9%81%93%E9%9A%8F%E6%9C%BA%E5%9B%BE%E7%89%87api%E6%8E%A5%E5%8F%A3.php?%E5%9B%BE%E7%89%87%E7%B3%BB%E5%88%97=%E8%B5%9B%E9%A9%AC%E5%A8%98%E6%A8%AA%E5%B1%8F%E7%B3%BB%E5%88%971");
        //有随时失效风险
        list.add("https://api.r10086.com/%E6%A8%B1%E9%81%93%E9%9A%8F%E6%9C%BA%E5%9B%BE%E7%89%87api%E6%8E%A5%E5%8F%A3.php?%E5%9B%BE%E7%89%87%E7%B3%BB%E5%88%97=%E4%B8%BA%E7%BE%8E%E5%A5%BD%E4%B8%96%E7%95%8C%E7%8C%AE%E4%B8%8A%E7%A5%9D%E7%A6%8F%E6%A8%AA%E5%B1%8F%E7%B3%BB%E5%88%971");
        //有失效风险
        list.add("https://api.r10086.com/%E6%A8%B1%E9%81%93%E9%9A%8F%E6%9C%BA%E5%9B%BE%E7%89%87api%E6%8E%A5%E5%8F%A3.php?%E8%87%AA%E9%80%82%E5%BA%94%E5%9B%BE%E7%89%87%E7%B3%BB%E5%88%97=%E6%9F%90%E7%A7%91%E5%AD%A6%E7%9A%84%E8%B6%85%E7%94%B5%E7%A3%81%E7%82%AE");
        //有失效风险
        list.add("https://api.r10086.com/%E6%A8%B1%E9%81%93%E9%9A%8F%E6%9C%BA%E5%9B%BE%E7%89%87api%E6%8E%A5%E5%8F%A3.php?%E8%87%AA%E9%80%82%E5%BA%94%E5%9B%BE%E7%89%87%E7%B3%BB%E5%88%97=%E5%8E%9F%E7%A5%9E");
    }
    /*
    随机获取图片的api
     */
    public static String getPictureUrl(){
        addPicture(list);
        Random r = new Random();
        int num = r.nextInt(list.size());
        if(num >= list.size()){
            num = r.nextInt(list.size() - 1);
        }
        return list.get(num);
    }
}
