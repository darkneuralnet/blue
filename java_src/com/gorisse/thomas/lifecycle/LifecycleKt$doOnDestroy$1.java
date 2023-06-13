package com.gorisse.thomas.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"com/gorisse/thomas/lifecycle/LifecycleKt$doOnDestroy$1", "LVX0;", "LLifecycleOwner;", "owner", "", "onDestroy", "android-view-lifecycle_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class LifecycleKt$doOnDestroy$1 implements VX0 {

    /* renamed from: b */
    public final /* synthetic */ AbstractC11719f f74911b;

    /* renamed from: c */
    public final /* synthetic */ Function0<Unit> f74912c;

    @Override // p000.VX0
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f74911b.mo67006d(this);
        this.f74912c.invoke();
    }
}
