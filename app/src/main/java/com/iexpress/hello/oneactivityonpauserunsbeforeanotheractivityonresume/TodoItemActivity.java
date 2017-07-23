package com.iexpress.hello.oneactivityonpauserunsbeforeanotheractivityonresume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TodoItemActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_todo_item);
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.i("PAUSE", getLocalClassName() + " called onPause()");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.i("RESUME", getLocalClassName() + " called onResume()");
  }

  protected void showAllTodos(View view) {
    Intent allTodos = new Intent();
    allTodos.setClass(TodoItemActivity.this, TodosActivity.class);
    startActivity(allTodos);
  }
}
