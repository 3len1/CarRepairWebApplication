package com.example.CarRepair.Services;

import com.example.CarRepair.Domain.User;

public interface OwnerService {
    void CreateUser(User user) throws Exception;
    User findByTaxNumber(Integer taxNumber) throws Exception;
    User SearchUser(String inputSearch) throws Exception;

}
