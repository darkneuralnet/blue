package p000;

import java.util.ArrayList;
/* renamed from: ed5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40455ed5 {

    /* renamed from: h */
    public static int f78624h;

    /* renamed from: c */
    public AbstractC41387gB6 f78627c;

    /* renamed from: d */
    public AbstractC41387gB6 f78628d;

    /* renamed from: f */
    public int f78630f;

    /* renamed from: g */
    public int f78631g;

    /* renamed from: a */
    public int f78625a = 0;

    /* renamed from: b */
    public boolean f78626b = false;

    /* renamed from: e */
    public ArrayList<AbstractC41387gB6> f78629e = new ArrayList<>();

    public C40455ed5(AbstractC41387gB6 abstractC41387gB6, int i) {
        this.f78627c = null;
        this.f78628d = null;
        int i2 = f78624h;
        this.f78630f = i2;
        f78624h = i2 + 1;
        this.f78627c = abstractC41387gB6;
        this.f78628d = abstractC41387gB6;
        this.f78631g = i;
    }

    /* renamed from: a */
    public void m42694a(AbstractC41387gB6 abstractC41387gB6) {
        this.f78629e.add(abstractC41387gB6);
        this.f78628d = abstractC41387gB6;
    }

    /* renamed from: b */
    public long m42693b(C43635jz0 c43635jz0, int i) {
        AbstractC41387gB6 abstractC41387gB6;
        AbstractC41387gB6 abstractC41387gB62;
        AbstractC41387gB6 abstractC41387gB63;
        long mo20620j;
        int i2;
        C46610p01 c46610p01;
        C46610p01 c46610p012;
        AbstractC41387gB6 abstractC41387gB64;
        AbstractC41387gB6 abstractC41387gB65 = this.f78627c;
        long j = 0;
        if (abstractC41387gB65 instanceof C46420oh0) {
            if (((C46420oh0) abstractC41387gB65).f81754f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(abstractC41387gB65 instanceof C40304eN1)) {
                return 0L;
            }
        } else if (!(abstractC41387gB65 instanceof C34085Ko6)) {
            return 0L;
        }
        if (i == 0) {
            abstractC41387gB6 = c43635jz0.f91891e;
        } else {
            abstractC41387gB6 = c43635jz0.f91893f;
        }
        C46610p01 c46610p013 = abstractC41387gB6.f81756h;
        if (i == 0) {
            abstractC41387gB62 = c43635jz0.f91891e;
        } else {
            abstractC41387gB62 = c43635jz0.f91893f;
        }
        C46610p01 c46610p014 = abstractC41387gB62.f81757i;
        boolean contains = abstractC41387gB65.f81756h.f102912l.contains(c46610p013);
        boolean contains2 = this.f78627c.f81757i.f102912l.contains(c46610p014);
        long mo20620j2 = this.f78627c.mo20620j();
        if (contains && contains2) {
            long m42691d = m42691d(this.f78627c.f81756h, 0L);
            long m42692c = m42692c(this.f78627c.f81757i, 0L);
            long j2 = m42691d - mo20620j2;
            AbstractC41387gB6 abstractC41387gB66 = this.f78627c;
            int i3 = abstractC41387gB66.f81757i.f102906f;
            if (j2 >= (-i3)) {
                j2 += i3;
            }
            int i4 = abstractC41387gB66.f81756h.f102906f;
            long j3 = ((-m42692c) - mo20620j2) - i4;
            if (j3 >= i4) {
                j3 -= i4;
            }
            float m31342s = abstractC41387gB66.f81750b.m31342s(i);
            if (m31342s > 0.0f) {
                j = (((float) j3) / m31342s) + (((float) j2) / (1.0f - m31342s));
            }
            float f = (float) j;
            long j4 = (f * m31342s) + 0.5f + mo20620j2 + (f * (1.0f - m31342s)) + 0.5f;
            mo20620j = abstractC41387gB64.f81756h.f102906f + j4;
            i2 = this.f78627c.f81757i.f102906f;
        } else if (contains) {
            return Math.max(m42691d(this.f78627c.f81756h, c46610p012.f102906f), this.f78627c.f81756h.f102906f + mo20620j2);
        } else if (contains2) {
            return Math.max(-m42692c(this.f78627c.f81757i, c46610p01.f102906f), (-this.f78627c.f81757i.f102906f) + mo20620j2);
        } else {
            mo20620j = abstractC41387gB63.f81756h.f102906f + this.f78627c.mo20620j();
            i2 = this.f78627c.f81757i.f102906f;
        }
        return mo20620j - i2;
    }

    /* renamed from: c */
    public final long m42692c(C46610p01 c46610p01, long j) {
        AbstractC41387gB6 abstractC41387gB6 = c46610p01.f102904d;
        if (abstractC41387gB6 instanceof IL1) {
            return j;
        }
        int size = c46610p01.f102911k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC44238l01 interfaceC44238l01 = c46610p01.f102911k.get(i);
            if (interfaceC44238l01 instanceof C46610p01) {
                C46610p01 c46610p012 = (C46610p01) interfaceC44238l01;
                if (c46610p012.f102904d != abstractC41387gB6) {
                    j2 = Math.min(j2, m42692c(c46610p012, c46610p012.f102906f + j));
                }
            }
        }
        if (c46610p01 == abstractC41387gB6.f81757i) {
            long mo20620j = j - abstractC41387gB6.mo20620j();
            return Math.min(Math.min(j2, m42692c(abstractC41387gB6.f81756h, mo20620j)), mo20620j - abstractC41387gB6.f81756h.f102906f);
        }
        return j2;
    }

    /* renamed from: d */
    public final long m42691d(C46610p01 c46610p01, long j) {
        AbstractC41387gB6 abstractC41387gB6 = c46610p01.f102904d;
        if (abstractC41387gB6 instanceof IL1) {
            return j;
        }
        int size = c46610p01.f102911k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC44238l01 interfaceC44238l01 = c46610p01.f102911k.get(i);
            if (interfaceC44238l01 instanceof C46610p01) {
                C46610p01 c46610p012 = (C46610p01) interfaceC44238l01;
                if (c46610p012.f102904d != abstractC41387gB6) {
                    j2 = Math.max(j2, m42691d(c46610p012, c46610p012.f102906f + j));
                }
            }
        }
        if (c46610p01 == abstractC41387gB6.f81756h) {
            long mo20620j = j + abstractC41387gB6.mo20620j();
            return Math.max(Math.max(j2, m42691d(abstractC41387gB6.f81757i, mo20620j)), mo20620j - abstractC41387gB6.f81757i.f102906f);
        }
        return j2;
    }
}
