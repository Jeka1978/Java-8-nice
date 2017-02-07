package com.nice.mapFunction;

import lombok.*;

import java.util.List;

/**
 * Created by Evegeny on 07/02/2017.
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Employee {
    @Singular
    private List<Integer> salaries;

}
