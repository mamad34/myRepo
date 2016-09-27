/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icip.core.repository;

import com.icip.core.user.ICIPUser;

/**
 *
 * @author icipmac
 */
public interface ClimateUserRepository {
    
    ICIPUser createUser(ICIPUser user);
    ICIPUser findUserByName(String userName);
    ICIPUser updateUserPassword(ICIPUser user);
    ICIPUser findByEmail(String emial);
//    boolean deleteUser(String userName);
    public void deleteUser(ICIPUser user);

    
}
