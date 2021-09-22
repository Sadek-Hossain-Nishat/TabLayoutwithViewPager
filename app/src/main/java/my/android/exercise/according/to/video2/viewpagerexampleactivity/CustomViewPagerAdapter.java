package my.android.exercise.according.to.video2.viewpagerexampleactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class CustomViewPagerAdapter extends PagerAdapter {

    private Context mcontext;

    public CustomViewPagerAdapter(Context context) {
        this.mcontext = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ModelObject modelObject=ModelObject.values()[position];
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        ViewGroup layout= (ViewGroup) inflater.inflate(modelObject.getmLayoutResId(),container,false);
        container.addView(layout);
        return layout;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return ModelObject.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    public CharSequence getPageTitle(int position){
        ModelObject custompageenum=ModelObject.values()[position];
        return mcontext.getString(custompageenum.getmTitleResId());

    }
}
