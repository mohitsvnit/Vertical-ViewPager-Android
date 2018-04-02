# Vertical-ViewPager-Horizontal-ViewPager-Android

This application contains custom `ViewPager` which provide the effect of vertical card swiping

![sample.gif](https://github.com/mohitsvnit/Vertical-ViewPager-Horizontal-ViewPager-Android/blob/master/sample.gif)


To use `VerticalViewPager`

Add following code into your layout xml file

`<com.mohit.verticalviewpager.VerticalViewPager
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/viewPager"
        />`
        
 Add below code into you java file
 
 `
VerticalViewPager mViewPager = (VerticalViewPager) findViewById(R.id.viewPager);
 `

Now viewpager will provide you above effect with all the functionality of normal viewpager.

