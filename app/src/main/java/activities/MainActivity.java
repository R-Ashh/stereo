package activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.arash.stereoplayer.R;

public class MainActivity extends BaseActivity {

    private ImageView topBarRightImage, topBarLeftImage;
    private TextView topBarMidText;
    private RelativeLayout root;
    private LinearLayout linearForInflate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
}
