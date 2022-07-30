package main.java;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Lulu
 * @Description: 登出
 * @DateTime: 2022/7/28 22:09
 **/
@WebServlet(urlPatterns = "/signout")
public class SignOutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 从Httpsession移除用户名
        req.getSession().removeAttribute("user");
        resp.sendRedirect("/");
    }
}
