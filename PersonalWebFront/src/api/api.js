import axios from 'axios';


let base = '/api';

export const getAllTravelLogs = params => { return axios.post(`${base}/travel/getTravelLogs`, params).then(res => res.data); };
export const makePlan = params => { return axios.post(`${base}/travel/setPlan`, params).then(res => res.data); };

