package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11717d;
import com.uber.autodispose.android.lifecycle.LifecycleEventsObservable;
/* loaded from: classes7.dex */
public class LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter implements InterfaceC11717d {

    /* renamed from: a */
    public final LifecycleEventsObservable.ArchLifecycleObserver f75576a;

    public LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter(LifecycleEventsObservable.ArchLifecycleObserver archLifecycleObserver) {
        this.f75576a = archLifecycleObserver;
    }

    @Override // androidx.lifecycle.InterfaceC11717d
    /* renamed from: a */
    public void mo45185a(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a, boolean z, XT2 xt2) {
        boolean z2;
        if (xt2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 || xt2.m76972a("onStateChange", 4)) {
                this.f75576a.onStateChange(lifecycleOwner, enumC11720a);
            }
        }
    }
}
