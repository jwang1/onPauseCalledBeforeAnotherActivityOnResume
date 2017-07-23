package com.iexpress.hello.oneactivityonpauserunsbeforeanotheractivityonresume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TodosActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_todos);
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.i("PAUSE", getLocalClassName() + " called onPuase()");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.i("RESUME", getLocalClassName() + " called onResume()");
  }

  public void showTodo(View view) {
    Intent todoItem = new Intent();
    todoItem.setClass(TodosActivity.this, TodoItemActivity.class);
    startActivity(todoItem);
  }
}
