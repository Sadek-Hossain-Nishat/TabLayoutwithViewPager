package my.android.exercise.according.to.video2.viewpagerexampleactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter {
    private int numOfTabs;
    private ArrayList<String> tabtitlelist=new ArrayList<>();

    public PagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    public void addtabtitle(String tabtitle){
        this.tabtitlelist.add(tabtitle);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitlelist.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ChatsFragment();
            case 1:
                return new CallsFragment();
            case 2:
                return new StatusFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
