package com.fliter;

import com.entity.Admin;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebFilter("/index")
public class LoginFilter extends HttpFilter {
    private List<String> exclude=List.of("/login");
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
            for(String e:exclude){
                if(e.equals(request.getServletPath())){
                    chain.doFilter(request,response);
                    return;
                }
                Admin admin=(Admin) request.getSession().getAttribute("admin");
                if(admin!=null){
                    chain.doFilter(request,response);
                }
                else{
                    response.sendRedirect(request.getContextPath()+"/login");
                }
            }
        }
    }
