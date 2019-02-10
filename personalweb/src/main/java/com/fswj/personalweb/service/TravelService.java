package com.fswj.personalweb.service;

import com.fswj.personalweb.entity.TravelLog;
import com.fswj.personalweb.exception.DataAlreadyExistsException;
import com.fswj.personalweb.exception.InvalidValueException;

import java.util.List;

public interface TravelService {
    List<TravelLog> getAllTravelLogs() throws Exception;

    TravelLog isProvinceExists(String province)throws Exception;

    int makePlan(TravelLog travelLog) throws InvalidValueException, DataAlreadyExistsException,Exception;


    int planCancel(TravelLog travelLog);

    int signGone(TravelLog travelLog);
}
