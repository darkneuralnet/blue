package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
/* renamed from: qm8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47664qm8 extends C36102Te7 {
    @Override // p000.C36102Te7, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new C49681uA8());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("com.google.android.libraries.intelligence.acceleration.process.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ZG8(), "com.google.android.libraries.intelligence.acceleration.process.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // p000.C36102Te7, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // p000.C36102Te7, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
