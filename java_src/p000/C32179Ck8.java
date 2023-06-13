package p000;

import java.io.IOException;
import p000.C32179Ck8;
/* renamed from: Ck8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32179Ck8<M extends C32179Ck8<M>> extends C35464Ql8 {

    /* renamed from: c */
    public C39335cl8 f4623c;

    @Override // p000.C35464Ql8
    /* renamed from: d */
    public void mo40568d(C39325ck8 c39325ck8) throws IOException {
        if (this.f4623c == null) {
            return;
        }
        for (int i = 0; i < this.f4623c.size(); i++) {
            this.f4623c.m60896e(i).m20532e(c39325ck8);
        }
    }

    @Override // p000.C35464Ql8
    /* renamed from: g */
    public int mo40567g() {
        if (this.f4623c != null) {
            for (int i = 0; i < this.f4623c.size(); i++) {
                this.f4623c.m60896e(i).m20531f();
            }
        }
        return 0;
    }

    @Override // p000.C35464Ql8
    /* renamed from: h */
    public /* synthetic */ C35464Ql8 mo40566h() throws CloneNotSupportedException {
        return (C32179Ck8) clone();
    }

    @Override // p000.C35464Ql8
    /* renamed from: j */
    public M clone() throws CloneNotSupportedException {
        M m = (M) super.clone();
        C32422Dl8.m109966h(this, m);
        return m;
    }
}
