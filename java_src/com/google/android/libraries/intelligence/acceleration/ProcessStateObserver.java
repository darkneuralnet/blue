package com.google.android.libraries.intelligence.acceleration;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import com.google.android.libraries.intelligence.acceleration.ProcessStateObserver;
/* loaded from: classes6.dex */
public class ProcessStateObserver implements InterfaceC32929Fq2 {

    /* renamed from: b */
    public static ProcessStateObserver f72084b = new ProcessStateObserver();

    /* renamed from: a */
    public static ProcessStateObserver m50504a() {
        return f72084b;
    }

    /* renamed from: b */
    public final void m50503b() {
        try {
            Analytics.m50505b();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C32359De8.m110069a().getLifecycle().mo67008a(this);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: w68
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32359De8.m110069a().getLifecycle().mo67008a(ProcessStateObserver.this);
                    }
                });
            }
        } catch (UnsatisfiedLinkError unused) {
            throw new UnsatisfiedLinkError("Make sure analytics_jni_lib is loaded. For VisionKit Pipeline, analytics_jni_lib can be loaded by setting `include_acceleration_analytics` of `pipeline_android_library` to `True` and this method should be called after initializing Pipeline.java.");
        }
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        Analytics.m50506a(false);
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        Analytics.m50506a(true);
    }
}
