package p000;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: s91  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48478s91<T> implements InterfaceC48378rz0<T> {

    /* renamed from: a */
    public InterfaceC48378rz0<T> f108381a;

    /* renamed from: a */
    public void m14666a(InterfaceC48378rz0<T> interfaceC48378rz0) {
        this.f108381a = interfaceC48378rz0;
    }

    @Override // p000.InterfaceC48378rz0
    public void accept(T t) {
        Intrinsics.checkNotNull(this.f108381a, "Listener is not set.");
        this.f108381a.accept(t);
    }
}
