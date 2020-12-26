package com.hjx.core.designPattern.filterPattern.demoone;

import java.util.List;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/26 10:31
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
