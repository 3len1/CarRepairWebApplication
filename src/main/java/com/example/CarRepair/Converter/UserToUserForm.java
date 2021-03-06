package com.example.CarRepair.Converter;

import com.example.CarRepair.Domain.User;
import com.example.CarRepair.Model.UserForm;

public class UserToUserForm {
    public static UserForm TypeCastUser(User user) {
        UserForm userDetails = new UserForm();

        userDetails.setUserID(user.getUserID());
        userDetails.setTaxNumber(String.valueOf(user.getTaxNumber()));
        userDetails.setLastName(user.getLastName());
        userDetails.setFirstName(user.getFirstName());
        userDetails.setAddress(user.getAddress());
        userDetails.setEmail(user.getEmail());
        userDetails.setPassword(user.getPassword());
        if(user.isAdmin()){
            userDetails.setType("Admin");
        }else{
            userDetails.setType("User");
        }

        return userDetails;
    }
}
