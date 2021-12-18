package pl.sda.xmasgifts.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    private boolean fullfilled;

    @ManyToOne
    private Person owner;

    @ManyToOne
    private Person gifter;
}
