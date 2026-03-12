package br.com.prefdesk.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Ordem")
public class Ordem  extends PanacheEntity{

    @Column(nullable = false)
    public String titulo;

    @Column(nullable = false)
    public String local;

    @Column(nullable = false)
    public String item;
}
