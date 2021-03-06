package com.cpe.backend.Payment.entity;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.OneToMany;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
// import javax.persistence.FetchType;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;


@Entity  
@Data  
@NoArgsConstructor  
@Table(name = "TYPEBANK")
public class TypeBank {  //ผู้ป่วย
      
  @Id 
  @SequenceGenerator(name="typebank_seq",sequenceName="typebank_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="typebank_seq") 
  @Column(name = "TYPEBANK_ID", unique = true, nullable = true)
  private @NonNull Long id;  

  
  private String name ;


  @OneToMany(fetch = FetchType.LAZY)
  //mappedBy  = "type"
  private Collection<Payment> pay;








      
}