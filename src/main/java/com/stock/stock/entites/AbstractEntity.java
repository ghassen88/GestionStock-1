package com.stock.stock.entites;


import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "creationDate")
    private Date creationDate;
    @Column(name = "lastUpdateDate")
    private Date lastUpdateDate;
}
