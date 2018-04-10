package com.helpta.vcsadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNLogClient;

/**
 * @author : HongKai.wang
 * @date : 2018/4/8
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login() {
        return "usermain";
    }

    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    @ResponseBody
    public Boolean checkLogin(String username, String psw) {
        SVNClientManager svnClientManager = SVNClientManager.newInstance();
        SVNLogClient logClient = svnClientManager.getLogClient();
        try {
            SVNURL svnurl = SVNURL.create("http", "wanghongkai", "172.20.21.1", 80, "/svn/codes", false);
            logClient.doLog(svnurl, new String[]{"/"}, null, null, null, false,
                    false, false, 1000, null, null);
        } catch (SVNException e) {
            e.printStackTrace();
        }
        return
                Boolean.FALSE;
    }
}
