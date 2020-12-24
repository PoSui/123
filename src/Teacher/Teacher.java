package Teacher;


/**
 * @author LiLinnan
 * @version 1.0
 * @date 2020/8/6 14:54
 */

public class Teacher implements Comparable<Teacher> {
    private String id;
    private String name;
    private int age;

    public Teacher(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if (o == null) {
            throw new NullPointerException("不能和null比");
        }
        int result = this.name.compareTo(o.getName());
        if (result != 0) {
            return result;
        }

        if (this.age != o.getAge()) {
            return this.age - o.getAge();
        }

        return this.id.compareTo(o.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Teacher teacher = (Teacher) o;

        if (age != teacher.age) {
            return false;
        }
        if (!id.equals(teacher.id)) {
            return false;
        }
        return name.equals(teacher.name);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
