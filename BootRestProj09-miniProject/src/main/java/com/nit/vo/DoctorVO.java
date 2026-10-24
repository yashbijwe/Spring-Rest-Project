package com.nit.vo;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class DoctorVO {

    private Integer did;

    @Nonnull
    private String dname;

    @Nonnull
    private String addrs;

    @Nonnull
    private Double fee;

    @Nonnull
    private String specialization;
}
