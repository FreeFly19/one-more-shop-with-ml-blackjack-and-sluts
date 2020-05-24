package com.cherkassydevelopment.onemoreshopwithmlblackjackandsluts.product;

import com.cherkassydevelopment.onemoreshopwithmlblackjackandsluts.image.Image;
import com.cherkassydevelopment.onemoreshopwithmlblackjackandsluts.localization.LocalizedLabel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private Set<LocalizedLabel> titles = new HashSet<>();

    @OneToOne
    private Image mainImage;

    private boolean published;

    private Instant createdAt;
}