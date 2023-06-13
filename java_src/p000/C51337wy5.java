package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: wy5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51337wy5 implements InterfaceC52637zA0 {

    /* renamed from: a */
    public final String f116923a;

    /* renamed from: b */
    public final int f116924b;

    /* renamed from: c */
    public final C31066ze f116925c;

    /* renamed from: d */
    public final boolean f116926d;

    public C51337wy5(String str, int i, C31066ze c31066ze, boolean z) {
        this.f116923a = str;
        this.f116924b = i;
        this.f116925c = c31066ze;
        this.f116926d = z;
    }

    @Override // p000.InterfaceC52637zA0
    /* renamed from: a */
    public InterfaceC36752Vz0 mo483a(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB) {
        return new C44816ly5(rd2, abstractC27525qB, this);
    }

    /* renamed from: b */
    public String m6020b() {
        return this.f116923a;
    }

    /* renamed from: c */
    public C31066ze m6019c() {
        return this.f116925c;
    }

    /* renamed from: d */
    public boolean m6018d() {
        return this.f116926d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f116923a + ", index=" + this.f116924b + CoreConstants.CURLY_RIGHT;
    }
}
