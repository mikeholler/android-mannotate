package me.mikeholler.manifestannotations.app;

import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import me.mikeholler.mannotate.annotations.Manifest;
import me.mikeholler.mannotate.annotations.UsesConfiguration;
import me.mikeholler.mannotate.annotations.UsesPermission;

import static android.Manifest.permission.ACCESS_WIFI_STATE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;
import static android.os.Build.VERSION_CODES.LOLLIPOP;

@Manifest(
        usesPermissions = {
                @UsesPermission(value = ACCESS_WIFI_STATE, maxSdkVersion = LOLLIPOP),
                @UsesPermission(value = WRITE_EXTERNAL_STORAGE, maxSdkVersion = LOLLIPOP),
        },
        usesConfigurations = {
                @UsesConfiguration(reqTouchScreen = "true"),
                @UsesConfiguration(reqFiveWayNav = "true")
        }
)
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
