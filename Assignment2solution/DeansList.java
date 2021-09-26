import java.util.ArrayList;

public class DeansList implements ICollection<Student> {
    private ArrayList<Student> studentList;

    public DeansList(){
        studentList= new ArrayList<Student>();
    }
    public boolean add(Student newItem) {
        if (newItem.getGpa() >= 3.7) {
            studentList.add(newItem);
            return true;
        } else
            return false;
    }

    @Override
    public Student getNext() {
        double maxGpa=0.0;
        int index=-1;

        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getGpa()>maxGpa) {
                maxGpa = studentList.get(i).getGpa();
                index = i;
            }

        }

        if(index==-1)
            return null;
        else
            return studentList.remove(index);
    }
}
