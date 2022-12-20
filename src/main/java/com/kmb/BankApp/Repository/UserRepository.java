package com.kmb.BankApp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmb.BankApp.Entity.RegisterEntity;

@Repository
public interface UserRepository extends JpaRepository<RegisterEntity,Serializable>{

}
