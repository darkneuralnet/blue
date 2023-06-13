package p000;

import java.util.Objects;
/* renamed from: p80  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46689p80 {

    /* renamed from: a */
    public final InterfaceC48754sd3 f103153a;

    /* renamed from: b */
    public Number f103154b = 0;

    public C46689p80(InterfaceC48754sd3 interfaceC48754sd3) {
        this.f103153a = interfaceC48754sd3;
    }

    /* renamed from: a */
    public static C46689p80 m19935a() {
        return new C46689p80(C49060t80.m13024c());
    }

    /* renamed from: c */
    public static C46689p80 m19933c(Number number) {
        return m19935a().m19934b(number);
    }

    /* renamed from: b */
    public C46689p80 m19934b(Number number) {
        Objects.requireNonNull(number);
        this.f103154b = this.f103153a.mo13931d(number);
        return this;
    }

    /* renamed from: d */
    public Number m19932d() {
        return this.f103153a.mo13931d(this.f103154b);
    }

    /* renamed from: e */
    public C46689p80 m19931e(int i) {
        this.f103154b = this.f103153a.mo13924k(this.f103154b, i);
        return this;
    }

    /* renamed from: f */
    public C46689p80 m19930f() {
        this.f103154b = this.f103153a.mo13929f(this.f103154b);
        return this;
    }
}
