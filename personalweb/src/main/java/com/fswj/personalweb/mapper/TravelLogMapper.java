package com.fswj.personalweb.mapper;

import com.fswj.personalweb.entity.TravelLog;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TravelLogMapper {
    @Select("select * from t_travel_log")
    List<TravelLog> getTravelLogs();
    @Update("insert into t_travel_log(province,time,remark) values (#{travelLog.province},#{travelLog.time},#{travelLog.remark})")
    int setPlan(@Param("travelLog") TravelLog travelLog);

    @Select("select * from t_travel_log where province=#{province}")
    TravelLog findTravelLogByProvince(@Param("province") String  province);

    @Update("update t_travel_log  set is_gone=true where province=#{travelLog.province} ")
    int signGone(@Param("travelLog") TravelLog travelLog);
    @Delete("delete from t_travel_log where province=#{travelLog.province}")
    int planCancel(@Param("travelLog") TravelLog travelLog);
}
