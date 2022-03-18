package com.lin.pfa.account.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.lin.pfa.common.enums.Category;
import com.lin.pfa.common.enums.Currency;
import com.lin.common.base.BaseEntity;

@Entity
@SQLDelete(sql = "UPDATE account SET is_deleted = 1 WHERE id = ?")
@Where(clause = "is_deleted = 0")
@DynamicInsert @DynamicUpdate
@Getter @Setter @NoArgsConstructor
public class Account extends BaseEntity {
	@Column(nullable=false, length=60)
	private String instituteName;
	
	@Column(length=60)
	private String accountNo;
	
	@Column(length=20)
	private String accountHolder;
	
	@Column(name="category_id", nullable=false)
	private Category category;
	
	@Column(name="currency_id", nullable=false)
	private Currency currency;
	
	@Column(precision=8, scale=2)
	private BigDecimal amount;
	
	@Column
	private LocalDate maturityDate;
}
