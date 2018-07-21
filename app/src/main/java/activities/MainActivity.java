package activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.arash.stereoplayer.R;

public class MainActivity extends BaseActivity {

    private ImageView topBarRightImage, topBarLeftImage;
    private LinearLayout topRightLinear, topLeftLinear;
    private TextView topBarMidText;
    private CoordinatorLayout root;
    private ViewPager viewPagerMain;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initViews();
    }

    private void initViews() {
        root = findViewById(R.id.mainActivityCoordinator);
        topBarMidText = findViewById(R.id.topBarMidTextView);
        topLeftLinear = findViewById(R.id.topBarLeftLinear);
        topBarLeftImage = findViewById(R.id.topBarLeftImage);
        topRightLinear = findViewById(R.id.topBarRightLinear);
        topBarRightImage = findViewById(R.id.topBarRightImage);
        viewPagerMain = findViewById(R.id.viewPagerMain);
        tabLayout = findViewById(R.id.bottomTabLayout);

    }
}
