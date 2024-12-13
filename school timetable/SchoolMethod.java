package schooltimesystem;  

// The SchoolMethod class represents a school schedule or lesson entry
public class SchoolMethod {     

    // Instance variables to store information about a teacher, subject, time, and room
    private String instructor;  
    private String subject;  
    private String time;  
    private String room;  
    private String id;
    private String endTime;
    private String course;
    private String day;

    // Constructor to initialize a new SchoolMethod object with teacher, subject, time, and room
    public SchoolMethod(String instructor, String subject, String time, String room, String id, String endTime, String course, String day){         
        this.instructor = instructor;  
        this.subject = subject;  
        this.time = time;  
        this.room = room;  
        this.id = id;
        this.endTime = endTime;
        this.course = course;
        this.day = day;
    }  
        // Getter and Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for endTime
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Getter and Setter for day
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    // Getter method to retrieve the teacher's name
    public String getInstructor() {         
        return instructor;     
    }  

    // Setter method to assign a new teacher's name
    public void setInstructor(String teacher) {         
        this.instructor = instructor;     
    }  

    // Getter method to retrieve the subject name
    public String getSubject() {         
        return subject;     
    }  

    // Setter method to assign a new subject
    public void setSubject(String subject) {         
        this.subject = subject;     
    }  

    // Getter method to retrieve the time of the lesson
    public String getTime() {         
        return time;     
    }  

    // Setter method to assign a new time for the lesson
    public void setTime(String time) {         
        this.time = time;     
    }  

    // Getter method to retrieve the room where the lesson takes place
    public String getRoom() {         
        return room;     
    }  

    // Setter method to assign a new room for the lesson
    public void setRoom(String room) {         
        this.room = room;     
    }  
}  
