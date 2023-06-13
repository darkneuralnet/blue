package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* renamed from: j88  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43139j88 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final /* synthetic */ C52032y88 f92214b;

    public C43139j88(C52032y88 c52032y88) {
        this.f92214b = c52032y88;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f92214b.m4054m(new C42516i58(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f92214b.m4054m(new T78(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f92214b.m4054m(new Z68(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f92214b.m4054m(new O58(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC43293jP7 binderC43293jP7 = new BinderC43293jP7();
        this.f92214b.m4054m(new D78(this, activity, binderC43293jP7));
        Bundle m30652d5 = binderC43293jP7.m30652d5(50L);
        if (m30652d5 != null) {
            bundle.putAll(m30652d5);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f92214b.m4054m(new C52002y58(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f92214b.m4054m(new C46094o78(this, activity));
    }
}
