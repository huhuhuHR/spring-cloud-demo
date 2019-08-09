package com.github.springcloud.serverA.pojo;

import java.io.Serializable;

/**
 * tmp_dept
 *
 * @author
 */
public class TmpDept implements Serializable {
    /**
     * 部门标识
     */
    private String deptId;

    /**
     * 父部门标识
     */
    private String parentDeptId;

    /**
     * 部门名称
     */
    private String deptName;

    private static final long serialVersionUID = 1L;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getParentDeptId() {
        return parentDeptId;
    }

    public void setParentDeptId(String parentDeptId) {
        this.parentDeptId = parentDeptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TmpDept other = (TmpDept) that;
        return (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
                && (this.getParentDeptId() == null ? other.getParentDeptId() == null : this.getParentDeptId().equals(other.getParentDeptId()))
                && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getParentDeptId() == null) ? 0 : getParentDeptId().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptId=").append(deptId);
        sb.append(", parentDeptId=").append(parentDeptId);
        sb.append(", deptName=").append(deptName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}