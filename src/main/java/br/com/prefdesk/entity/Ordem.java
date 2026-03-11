package br.com.prefdesk.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Ordem")
public class Ordem  extends PanacheEntity{

    @NotNull
    public String titulo;

    @NotNull
    public String local;

    @NotNull
    public String item;
}
