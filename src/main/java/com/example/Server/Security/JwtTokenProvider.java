package com.example.Server.Security;

import com.example.Server.Models.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class JwtTokenProvider {
    public String createToken(String username, List<Role> roles) {
        return null;
    }

    public Object resolveToken(HttpServletRequest req) {
        return null;
    }

    public String getUsername(Object resolveToken) {
        return null;
    }
}
