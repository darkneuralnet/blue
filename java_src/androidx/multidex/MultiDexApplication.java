package androidx.multidex;

import android.app.Application;
import android.content.Context;
/* loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C49280tW2.m12246k(this);
    }
}
