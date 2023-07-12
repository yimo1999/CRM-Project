package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Fri Jun 23 15:09:52 CST 2023
     */
    int deleteByPrimaryKey(String id);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Fri Jun 23 15:09:52 CST 2023
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Fri Jun 23 15:09:52 CST 2023
     */
    Activity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Fri Jun 23 15:09:52 CST 2023
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Fri Jun 23 15:09:52 CST 2023
     */
    int updateByPrimaryKey(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Fri Jun 23 15:09:52 CST 2023
     * Edited by Mo
     */
    int insertActivity(Activity activity);

    /**
     * select activities by condition.
     * @param map
     * @return
     */

    List<Activity> selectActivityByConditionForPage(Map<String, Object> map);

    /**
     *
     * @param map
     * @return
     */
    int selectCountOfActivityByCondition(Map<String, Object> map);
}