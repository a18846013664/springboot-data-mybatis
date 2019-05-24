package com.atguigu.springboot.mapper;


import com.atguigu.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
//@Mapper或@MapperScan
public interface EmployeeMapper {
    public Employee getEmpId(Integer id);

    public void insertEmp(Employee employee);
}
