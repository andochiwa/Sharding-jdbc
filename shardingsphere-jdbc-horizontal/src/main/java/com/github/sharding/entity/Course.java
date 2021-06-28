package com.github.sharding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author HAN
 * @since 2021-06-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Serializable {

//    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    private Long userId;

    private String status;


}
