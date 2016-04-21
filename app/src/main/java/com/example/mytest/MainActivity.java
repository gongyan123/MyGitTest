package com.example.mytest;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    private SensorManager sm;
    Sensor sensor;
@Override
 public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    button=(Button)findViewById(R.id.button);
    sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
    // 选取加速度感应器
    int sensorType = Sensor.TYPE_ACCELEROMETER;
    sensor = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

    sm.registerListener(myAccelerometerListener,
            sm.getDefaultSensor(sensorType), 20000);


}
}
