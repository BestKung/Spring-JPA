/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.springrelationshif.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.springrelationshif.model.Student;

/**
 *
 * @author Best
 */
public interface StudentRepo extends JpaRepository<Student,Integer>{
    
}
