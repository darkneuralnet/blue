package p000;

import java.util.LinkedList;
/* renamed from: qP5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47442qP5 {

    /* renamed from: e */
    public static final C47442qP5 f105274e = new C47442qP5(AbstractC46665p56.f103123b, 0, 0, 0);

    /* renamed from: a */
    public final int f105275a;

    /* renamed from: b */
    public final AbstractC46665p56 f105276b;

    /* renamed from: c */
    public final int f105277c;

    /* renamed from: d */
    public final int f105278d;

    public C47442qP5(AbstractC46665p56 abstractC46665p56, int i, int i2, int i3) {
        this.f105276b = abstractC46665p56;
        this.f105275a = i;
        this.f105277c = i2;
        this.f105278d = i3;
    }

    /* renamed from: a */
    public C47442qP5 m17539a(int i) {
        int i2;
        AbstractC46665p56 abstractC46665p56 = this.f105276b;
        int i3 = this.f105275a;
        int i4 = this.f105278d;
        if (i3 == 4 || i3 == 2) {
            int i5 = LM1.f21305c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            abstractC46665p56 = abstractC46665p56.m19972a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f105277c;
        if (i8 != 0 && i8 != 31) {
            if (i8 == 62) {
                i2 = 9;
            } else {
                i2 = 8;
            }
        } else {
            i2 = 18;
        }
        C47442qP5 c47442qP5 = new C47442qP5(abstractC46665p56, i3, i8 + 1, i4 + i2);
        if (c47442qP5.f105277c == 2078) {
            return c47442qP5.m17538b(i + 1);
        }
        return c47442qP5;
    }

    /* renamed from: b */
    public C47442qP5 m17538b(int i) {
        int i2 = this.f105277c;
        if (i2 == 0) {
            return this;
        }
        return new C47442qP5(this.f105276b.m19971b(i - i2, i2), this.f105275a, 0, this.f105278d);
    }

    /* renamed from: c */
    public int m17537c() {
        return this.f105277c;
    }

    /* renamed from: d */
    public int m17536d() {
        return this.f105278d;
    }

    /* renamed from: e */
    public int m17535e() {
        return this.f105275a;
    }

    /* renamed from: f */
    public boolean m17534f(C47442qP5 c47442qP5) {
        int i;
        int i2 = this.f105278d + (LM1.f21305c[this.f105275a][c47442qP5.f105275a] >> 16);
        int i3 = c47442qP5.f105277c;
        if (i3 > 0 && ((i = this.f105277c) == 0 || i > i3)) {
            i2 += 10;
        }
        if (i2 <= c47442qP5.f105278d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public C47442qP5 m17533g(int i, int i2) {
        int i3;
        int i4 = this.f105278d;
        AbstractC46665p56 abstractC46665p56 = this.f105276b;
        int i5 = this.f105275a;
        if (i != i5) {
            int i6 = LM1.f21305c[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            abstractC46665p56 = abstractC46665p56.m19972a(i7, i8);
            i4 += i8;
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new C47442qP5(abstractC46665p56.m19972a(i2, i3), i, 0, i4 + i3);
    }

    /* renamed from: h */
    public C47442qP5 m17532h(int i, int i2) {
        int i3;
        AbstractC46665p56 abstractC46665p56 = this.f105276b;
        int i4 = this.f105275a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new C47442qP5(abstractC46665p56.m19972a(LM1.f21307e[i4][i], i3).m19972a(i2, 5), this.f105275a, 0, this.f105278d + i3 + 5);
    }

    /* renamed from: i */
    public C1027CT m17531i(byte[] bArr) {
        LinkedList<AbstractC46665p56> linkedList = new LinkedList();
        for (AbstractC46665p56 abstractC46665p56 = m17538b(bArr.length).f105276b; abstractC46665p56 != null; abstractC46665p56 = abstractC46665p56.m19969d()) {
            linkedList.addFirst(abstractC46665p56);
        }
        C1027CT c1027ct = new C1027CT();
        for (AbstractC46665p56 abstractC46665p562 : linkedList) {
            abstractC46665p562.mo19970c(c1027ct, bArr);
        }
        return c1027ct;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", LM1.f21304b[this.f105275a], Integer.valueOf(this.f105278d), Integer.valueOf(this.f105277c));
    }
}
