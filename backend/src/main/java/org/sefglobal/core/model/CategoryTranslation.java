package org.sefglobal.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category_translation")
@Getter @Setter
public class CategoryTranslation extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "category_id",
            referencedColumnName = "id",
            nullable = false
    ) private Category category;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "language_id",
            referencedColumnName = "id",
            nullable = false
    ) private Language language;

    private String name;

}
