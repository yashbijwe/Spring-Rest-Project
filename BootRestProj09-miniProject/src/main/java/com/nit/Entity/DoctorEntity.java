package com.nit.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="DoctorMiniProject")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class DoctorEntity {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "DID-SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer did;
	
	@Column(length = 30)
	@Nonnull
	private String dname;
	@Column(length = 30)
	@Nonnull
	private String addrs;
	@Nonnull
	private Double fee;
	@Column(length = 30)
	@Nonnull
	private String specialization;
	
	@Version
	private Integer updateCount;
	@CreationTimestamp
	@Column(insertable = true,updatable = false)
	private LocalDateTime registeredOn;
	
	@CreationTimestamp
	@Column(insertable = false,updatable = true)
	private LocalDateTime lastUpdatedOn;
	
	@Column(length = 30,insertable = true,updatable = false)
	private String createdBy;
	@Column(length = 30,updatable = true,insertable = true)
	private String updatedBy;
	
	@Column(length = 30)
	private String active_SW= "active";

}
