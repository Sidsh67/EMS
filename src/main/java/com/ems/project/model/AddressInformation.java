package com.ems.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @NotBlank(message = "Address Line 1 is required")
    @Column(name = "address_line_1", nullable = false, length = 255)
    private String addressLine1;

    @Column(name = "address_line_2", length = 255)
    private String addressLine2;

    @NotBlank(message = "City is required")
    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @NotBlank(message = "State is required")
    @Column(name = "state", nullable = false, length = 100)
    private String state;

    @NotBlank(message = "Postal Code is required")
    @Pattern(regexp = "\\d{6}", message = "Postal code must be 6 digits")
    @Column(name = "postal_code", nullable = false, length = 6)
    private String postalCode;

    @NotBlank(message = "Country is required")
    @Column(name = "country", nullable = false, length = 100)
    private String country;
}