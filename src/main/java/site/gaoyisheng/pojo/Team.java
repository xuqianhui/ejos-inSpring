package site.gaoyisheng.pojo;

public class Team {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.introduce
     *
     * @mbg.generated
     */
    private String introduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team.teacher_id
     *
     * @mbg.generated
     */
    private Integer teacherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.id
     *
     * @return the value of team.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.id
     *
     * @param id the value for team.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.name
     *
     * @return the value of team.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.name
     *
     * @param name the value for team.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.introduce
     *
     * @return the value of team.introduce
     *
     * @mbg.generated
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.introduce
     *
     * @param introduce the value for team.introduce
     *
     * @mbg.generated
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team.teacher_id
     *
     * @return the value of team.teacher_id
     *
     * @mbg.generated
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team.teacher_id
     *
     * @param teacherId the value for team.teacher_id
     *
     * @mbg.generated
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}