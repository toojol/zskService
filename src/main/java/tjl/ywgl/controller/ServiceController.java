package tjl.ywgl.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tjl.ywgl.common.entity.ServiceInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping(value = "zskService")
public class ServiceController {

    @RequestMapping(value = "add")
    public void login(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody ServiceInfo serviceInfo) throws IOException {

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(serviceInfo);
        response.getWriter().print("zskService:add  " + jsonObject);

    }

    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo){

        return "zskService:rest  " + serviceInfo.getName() + " !";
    }

}
