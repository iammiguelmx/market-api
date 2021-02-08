package com.platzi.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 6640084229094387681L;

    @Id @Getter @Setter
    private String id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String apellidos;

    @Getter @Setter
    private Long celular;

    @Getter @Setter
    private String direccion;

    @Getter @Setter
    @Column(name="correo_electronico")
    private String correoElectronico;

    @Getter @Setter
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

}
