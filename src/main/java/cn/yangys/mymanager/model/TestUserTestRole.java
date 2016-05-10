package cn.yangys.mymanager.model;

public class TestUserTestRole {
    private Integer id;

    private Integer testuserId;

    private Integer testroleId;
    
    private TestRole testRole;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestuserId() {
        return testuserId;
    }

    public void setTestuserId(Integer testuserId) {
        this.testuserId = testuserId;
    }

    public Integer getTestroleId() {
        return testroleId;
    }

    public void setTestroleId(Integer testroleId) {
        this.testroleId = testroleId;
    }

	public TestRole getTestRole() {
		return testRole;
	}

	public void setTestRole(TestRole testRole) {
		this.testRole = testRole;
	}
    
    
}