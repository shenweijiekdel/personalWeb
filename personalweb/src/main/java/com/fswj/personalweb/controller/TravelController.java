package com.fswj.personalweb.controller;

import com.fswj.personalweb.constdefine.StatusCode;
import com.fswj.personalweb.entity.Response;
import com.fswj.personalweb.entity.TravelLog;
import com.fswj.personalweb.exception.DataAlreadyExistsException;
import com.fswj.personalweb.exception.InvalidValueException;
import com.fswj.personalweb.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/travel/")
public class TravelController {
    @Autowired
    private TravelService travelService;
    @RequestMapping("getTravelLogs")
    public Response getTravelLogs(){
        Response<List<TravelLog>> response = new Response<>();
        try {
            List<TravelLog> allTravelLogs = travelService.getAllTravelLogs();
            response.setCode(StatusCode.SUCCESS);
            response.setMsg("数据获取成功");
            response.setData(allTravelLogs);
        }
        catch (Exception e) {
           response.setCode(StatusCode.OTHER_ERROR);
            response.setMsg("请求异常，状态码" + response.getCode());
        }
        return response;
    }

    @RequestMapping("setPlan")
    public Response setPlan(@RequestBody TravelLog travelLog){
        Response response = new Response<>();
        System.out.println(travelLog);
        if (travelLog == null){
            response.setCode(StatusCode.NULL_PARAM);
            response.setMsg("非法参数");
            return response;
        }
        try {
            travelService.makePlan(travelLog);
            response.setCode(StatusCode.SUCCESS);
            response.setMsg("操作成功");
        } catch (InvalidValueException |DataAlreadyExistsException e ) {
            response.setCode(StatusCode.SERVICE_LOGIC_ERROR);
            response.setMsg(e.getMessage() + ",状态码" + response.getCode());

        }catch (DataIntegrityViolationException e){
            e.printStackTrace();
            response.setCode(StatusCode.DATABASE_OPRT_ERROR);
            response.setMsg("数据库操作异常,状态码" + response.getCode());
        }
        catch (Exception e){
            e.printStackTrace();
            response.setCode(StatusCode.OTHER_ERROR);
            response.setMsg("其他异常,状态码" + response.getCode());
        }
        return response;
    }
}
