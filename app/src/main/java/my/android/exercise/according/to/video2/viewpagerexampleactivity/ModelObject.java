package my.android.exercise.according.to.video2.viewpagerexampleactivity;

public enum ModelObject {

    //defining colors

    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue),
    GREEN(R.string.green, R.layout.view_green);

    private int mTitleResId;
    private  int mLayoutResId;

    // constructor


    ModelObject(int titleResId, int layoutResId){
        mTitleResId=titleResId;
        mLayoutResId=layoutResId;
    }

    // Getters


    public int getmTitleResId() {
        return mTitleResId;
    }

    public int getmLayoutResId() {
        return mLayoutResId;
    }
}
