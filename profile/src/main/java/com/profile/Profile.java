package com.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    @Id
    int id;
    String gender;
    String name;
    int age;
    @OneToOne(cascade = CascadeType.ALL)
            @JoinColumn(referencedColumnName = "id:",name = "pa_fk")
Address pAddress;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id",name = "wa_fk")
Address wAddress;
}
