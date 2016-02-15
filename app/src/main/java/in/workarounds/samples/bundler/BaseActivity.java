package in.workarounds.samples.bundler;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;

import in.workarounds.bundler.annotations.Arg;
import in.workarounds.bundler.annotations.Args;
import in.workarounds.bundler.annotations.OptionsForBundler;
import in.workarounds.bundler.annotations.RequireBundler;
import in.workarounds.bundler.annotations.Required;
import in.workarounds.bundler.annotations.State;

/**
 * Created by madki on 18/11/15.
 */
@RequireBundler(
    requireAll = false,
    flags = Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK,
    action = Intent.ACTION_VIEW,
    data = "http://www.google.com"
)
@OptionsForBundler(packageName = "in.workarounds")
@Args({
    @Arg(key = "wat", type = Parcelable.class)
})
public class BaseActivity extends AppCompatActivity {

    @Arg
    int someInt;
    @Arg @Required
    boolean someBool;

    @State
    String someState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_book_detail);

    }
}
