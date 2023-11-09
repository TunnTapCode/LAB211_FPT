
package taskmanager;

public class Task {

    private int id;
    private String name;
    private String taskTypeId;
    private String date;
    private String from;
    private String to;
    private String assign;
    private String reviewer;

    public Task() {
    }

    public Task(int id, String name, String taskTypeId, String date, String from, String to, String assign, String reviewer) {
        this.id = id;
        this.name = name;
        this.taskTypeId = taskTypeId;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assign = assign;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

  
   
}
