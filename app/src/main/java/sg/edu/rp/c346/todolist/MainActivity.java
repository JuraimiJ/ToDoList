package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoList> ToDoArrayList;
    ArrayAdapter aaTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.ToDoList);

        ToDoArrayList = new ArrayList<>();
        ToDoArrayList.add(new ToDoList("MSA", "1/7/2019"));
        ToDoArrayList.add(new ToDoList("Go for haircut", "22/9/2019"));
        ToDoArrayList.add(new ToDoList("Jog on the Beach", "24/10/2020"));



        aaTask = new CustomAdapter(this,
                R.layout.row, ToDoArrayList);

        lvToDo.setAdapter(aaTask);
    }
}
