package com.fswj.personalweb.mapper;

import com.fswj.personalweb.entity.TravelLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface TravelLogMapper {
    @Select("select * from t_travel_log")
    List<TravelLog> getTravelLogs();
    @Update("insert into t_travel_log(province,time,remark) values (#{travelLog.province},#{travelLog.time},#{travelLog.remark})")
    int setPlan(@Param("travelLog") TravelLog travelLog);

    @Select("select * from t_travel_log where province=#{province}")
    TravelLog findTravelLogByProvince(@Param("province") String  province);
}
