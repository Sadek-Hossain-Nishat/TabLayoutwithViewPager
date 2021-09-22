package my.android.exercise.according.to.video2.viewpagerexampleactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TabLayoutExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_example);
        final ViewPager viewPager=findViewById(R.id.viewpageridintablayout);

        final TabLayout tabLayout=findViewById(R.id.tablayoutid);
        tabLayout.setupWithViewPager(viewPager);





        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());
        pagerAdapter.addtabtitle("Chats");
        pagerAdapter.addtabtitle("Calls");
        pagerAdapter.addtabtitle("Status");
        viewPager.setAdapter(pagerAdapter);



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}