package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
/* renamed from: x68  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51419x68 extends C36102Te7 {

    /* renamed from: b */
    public final /* synthetic */ C32359De8 f117107b;

    public C51419x68(C32359De8 c32359De8) {
        this.f117107b = c32359De8;
    }

    @Override // p000.C36102Te7, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = ZG8.f48142c;
            ((ZG8) activity.getFragmentManager().findFragmentByTag("com.google.android.libraries.intelligence.acceleration.process.report_fragment_tag")).m73374b(this.f117107b.f6140i);
        }
    }

    @Override // p000.C36102Te7, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f117107b.m110068b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new C45153mY7(this));
    }

    @Override // p000.C36102Te7, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f117107b.m110065e();
    }
}
