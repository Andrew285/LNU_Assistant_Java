//package com.example.lnu_assistant;
//
//import static androidx.navigation.ui.NavigationUI.setupActionBarWithNavController;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.DrawableUtils;
//import androidx.appcompat.widget.Toolbar;
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//
//import android.graphics.drawable.Drawable;
//import android.os.Bundle;
//import android.view.MenuItem;
//import android.view.View;
//
//public class MainActivity extends AppCompatActivity {
//
//
//    private AppBarConfiguration appBarConfiguration;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        NavController navController = Navigation.findNavController(this, R.id.my_nav_host_fragment);
//        appBarConfiguration =
//                new AppBarConfiguration.Builder(navController.getGraph()).build();
//        Drawable drawerLayout = findViewById(R.id.drawer_layout);
//        appBarConfiguration =
//                new AppBarConfiguration.Builder(navController.getGraph())
//                        .setDrawerLayout(findViewById(R.id.drawer_layout))
//                        .build();
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        NavigationUI.setupWithNavController(
//                toolbar, navController, appBarConfiguration);
//
//        setupActionBarWithNavController(this,navController);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        NavController navController = Navigation.findNavController(this, R.id.my_nav_host_fragment);
//        return NavigationUI.onNavDestinationSelected(item, navController)
//                || super.onOptionsItemSelected(item);
//    }
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.my_nav_host_fragment);
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
//}