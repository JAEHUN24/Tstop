package com.with.tstop;


import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegistaerRequest extends StringRequest {
    // 서버 URL 설정 (php 파일 연동)
    final static private  String URL = "http://wwkdwogns.dothome.co.kr/Register.php";
    private Map<String, String> map;

    public RegistaerRequest(String userID, String userPassword, String userName, String userNumber, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);
        map.put("userName",userName);
        map.put("userNumber",userNumber);
    }

    @Nullable
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
