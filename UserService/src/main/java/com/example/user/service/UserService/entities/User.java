package com.example.user.service.UserService.entities;



import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="micro-services")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @Column(name="id")
    private String userId;

    @Column(name="Name",length = 20)
    private String userName;

    @Column(name="Email")
    private String userEmail;

    @Column(name="About")
    private String about;

   @Transient
    private List<Ratings>  ratings=new ArrayList<>();

}
