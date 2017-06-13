package com.aaron.clusterquartz.job;

import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * @author FengHaixin
 * @description 涓�鍙ヨ瘽鎻忚堪璇ユ枃浠剁殑鐢ㄩ��
 * @date 2016-05-23
 */
@Controller
public class ClusterQuartz
{
    public void printUserInfo()
    {
       System.out.println("***      start== " + new Date() + "*************");

        System.out.println("*");
        System.out.println("*        current username is " + System.getProperty("user.name"));
        System.out.println("*        current os name is " + System.getProperty("os.name"));
        System.out.println("*");

        System.out.println("*********current user information end******************");
    }
}
