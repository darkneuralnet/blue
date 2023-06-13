package p000;

import android.annotation.TargetApi;
@TargetApi(31)
/* renamed from: Sw2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36025Sw2 implements InterfaceC34855Nw2 {

    /* renamed from: a */
    public final C51765xi0 f34507a;

    /* renamed from: b */
    public final C31919Bi0 f34508b;

    /* renamed from: c */
    public final boolean f34509c;

    /* renamed from: d */
    public final boolean f34510d;

    public C36025Sw2(C51765xi0 c51765xi0, C31919Bi0 c31919Bi0, boolean z, boolean z2) {
        this.f34507a = c51765xi0;
        this.f34508b = c31919Bi0;
        this.f34509c = z;
        this.f34510d = z2;
    }

    @Override // p000.InterfaceC34855Nw2
    /* renamed from: a */
    public boolean mo84592a() {
        return this.f34508b.m113662a();
    }

    @Override // p000.InterfaceC34855Nw2
    /* renamed from: b */
    public boolean mo84591b() {
        return !m84590c() || this.f34507a.m4861a();
    }

    /* renamed from: c */
    public final boolean m84590c() {
        if (this.f34509c) {
            return false;
        }
        return !this.f34510d;
    }
}
