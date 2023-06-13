package p000;

import java.io.IOException;
/* renamed from: Nv */
/* loaded from: classes8.dex */
public class C5741Nv implements InterfaceC8533V {

    /* renamed from: b */
    public C9585Y f25373b;

    public C5741Nv(C9585Y c9585y) {
        this.f25373b = c9585y;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() throws IOException {
        return new C5424Mv(this.f25373b.m75886d());
    }

    @Override // p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        try {
            return mo17712a();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
