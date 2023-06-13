package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11711b;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC11728i {

    /* renamed from: b */
    public final Object f54852b;

    /* renamed from: c */
    public final C11711b.C11712a f54853c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f54852b = obj;
        this.f54853c = C11711b.f54898c.m67030c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
        this.f54853c.m67027a(lifecycleOwner, enumC11720a, this.f54852b);
    }
}
