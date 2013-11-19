/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.imc.dao;

import com.imc.framework.bean.Categories;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ammad27k
 */
public interface CategoriesDao {
     public List<Categories> getAllCategories(Session session) throws Exception;
}
