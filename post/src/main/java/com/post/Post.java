package com.post;

    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;import javax.persistence.*;
    import java.util.Date;import java.util.List;
    @Entity
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
 public   class Post {
        @Id
        int id;
        Date time;
        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(referencedColumnName = "id",name = "ms_fk")
        List<Message> msg;
    }

