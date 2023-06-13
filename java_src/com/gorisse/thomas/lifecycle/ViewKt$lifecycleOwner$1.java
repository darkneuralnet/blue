package com.gorisse.thomas.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11729j;
import androidx.lifecycle.InterfaceC11728i;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28432d2 = {"com/gorisse/thomas/lifecycle/ViewKt$lifecycleOwner$1", "LLifecycleOwner;", "Landroidx/lifecycle/i;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "", "onStateChanged", "Landroidx/lifecycle/f;", "getLifecycle", "Landroidx/lifecycle/j;", "b", "Landroidx/lifecycle/j;", "lifecycle", "android-view-lifecycle_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class ViewKt$lifecycleOwner$1 implements LifecycleOwner, InterfaceC11728i {

    /* renamed from: b */
    public C11729j f74945b;

    @Override // p000.LifecycleOwner
    public AbstractC11719f getLifecycle() {
        return this.f74945b;
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f74945b.m66995o(event.m67019c());
    }
}
