package com.company.autoservice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "ORDER_", indexes = {
        @Index(name = "IDX_ORDER__CLIENT", columnList = "CLIENT_ID"),
        @Index(name = "IDX_ORDER__MECHANIC", columnList = "MECHANIC_ID")
})
@Entity(name = "Order_")
public class Order {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "ORDERNUMBER", nullable = false)
    @NotNull
    private Long ordernumber;

    @JoinColumn(name = "CLIENT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User client;

    @JoinColumn(name = "MECHANIC_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User mechanic;

    @Column(name = "MODEL", nullable = false)
    @NotNull
    private String model;

    @Column(name = "PROBLEM")
    private String problem;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "ORDERCREATETIME", nullable = false)
    @NotNull
    private LocalDateTime ordercreatetime;

    @Column(name = "EXPECTEDENDINGTIME")
    private LocalDateTime expectedendingtime;

    @Column(name = "ENDINGTIME")
    private LocalDateTime endingtime;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private Integer status;

    public OrderStatus getStatus() {
        return status == null ? null : OrderStatus.fromId(status);
    }

    public void setStatus(OrderStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public LocalDateTime getEndingtime() {
        return endingtime;
    }

    public void setEndingtime(LocalDateTime endingtime) {
        this.endingtime = endingtime;
    }

    public LocalDateTime getExpectedendingtime() {
        return expectedendingtime;
    }

    public void setExpectedendingtime(LocalDateTime expectedendingtime) {
        this.expectedendingtime = expectedendingtime;
    }

    public LocalDateTime getOrdercreatetime() {
        return ordercreatetime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getMechanic() {
        return mechanic;
    }

    public void setMechanic(User mechanic) {
        this.mechanic = mechanic;
    }

    public User getClient() {
        return client;
    }

    public Long getOrdernumber() {
        return ordernumber;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}