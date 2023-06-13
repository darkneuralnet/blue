package p000;

import java.io.IOException;
/* renamed from: oG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46170oG0 implements InterfaceC8533V {

    /* renamed from: b */
    public C9585Y f101679b;

    public C46170oG0(C9585Y c9585y) {
        this.f101679b = c9585y;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() throws IOException {
        return new C45577nG0(this.f101679b.m75886d());
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
