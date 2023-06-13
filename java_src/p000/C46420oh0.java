package p000;

import java.util.ArrayList;
import java.util.Iterator;
import p000.C43042iz0;
/* renamed from: oh0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46420oh0 extends AbstractC41387gB6 {

    /* renamed from: k */
    public ArrayList<AbstractC41387gB6> f102338k;

    /* renamed from: l */
    public int f102339l;

    public C46420oh0(C43042iz0 c43042iz0, int i) {
        super(c43042iz0);
        this.f102338k = new ArrayList<>();
        this.f81754f = i;
        m20619q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0400, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // p000.AbstractC41387gB6, p000.InterfaceC44238l01
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5649a(InterfaceC44238l01 interfaceC44238l01) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        float m31401T;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        float f2;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        int i22;
        int i23;
        if (this.f81756h.f102910j && this.f81757i.f102910j) {
            C43042iz0 m31414M = this.f81750b.m31414M();
            if (m31414M instanceof C43635jz0) {
                z = ((C43635jz0) m31414M).m29540U1();
            } else {
                z = false;
            }
            int i24 = this.f81757i.f102907g - this.f81756h.f102907g;
            int size = this.f102338k.size();
            int i25 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i25 < size) {
                    if (this.f102338k.get(i25).f81750b.m31393X() != 8) {
                        break;
                    }
                    i25++;
                } else {
                    i25 = -1;
                    break;
                }
            }
            int i26 = size - 1;
            int i27 = i26;
            while (true) {
                if (i27 < 0) {
                    break;
                } else if (this.f102338k.get(i27).f81750b.m31393X() != 8) {
                    i = i27;
                    break;
                } else {
                    i27--;
                }
            }
            int i28 = 0;
            while (i28 < 2) {
                int i29 = 0;
                i4 = 0;
                i5 = 0;
                int i30 = 0;
                f = 0.0f;
                while (i29 < size) {
                    AbstractC41387gB6 abstractC41387gB6 = this.f102338k.get(i29);
                    if (abstractC41387gB6.f81750b.m31393X() != i2) {
                        i30++;
                        if (i29 > 0 && i29 >= i25) {
                            i4 += abstractC41387gB6.f81756h.f102906f;
                        }
                        Y31 y31 = abstractC41387gB6.f81753e;
                        int i31 = y31.f102907g;
                        if (abstractC41387gB6.f81752d != C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i32 = this.f81754f;
                            if (i32 == 0 && !abstractC41387gB6.f81750b.f91891e.f81753e.f102910j) {
                                return;
                            }
                            if (i32 == 1 && !abstractC41387gB6.f81750b.f91893f.f81753e.f102910j) {
                                return;
                            }
                            i22 = i31;
                        } else {
                            i22 = i31;
                            if (abstractC41387gB6.f81749a == 1 && i28 == 0) {
                                i23 = y31.f44482m;
                                i5++;
                            } else if (y31.f102910j) {
                                i23 = i22;
                            }
                            z4 = true;
                            if (z4) {
                                i5++;
                                float f3 = abstractC41387gB6.f81750b.f91864N0[this.f81754f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i4 += i23;
                            }
                            if (i29 < i26 && i29 < i) {
                                i4 += -abstractC41387gB6.f81757i.f102906f;
                            }
                        }
                        i23 = i22;
                        if (z4) {
                        }
                        if (i29 < i26) {
                            i4 += -abstractC41387gB6.f81757i.f102906f;
                        }
                    }
                    i29++;
                    i2 = 8;
                }
                if (i4 >= i24 && i5 != 0) {
                    i28++;
                    i2 = 8;
                } else {
                    i3 = i30;
                    break;
                }
            }
            i3 = 0;
            i4 = 0;
            i5 = 0;
            f = 0.0f;
            int i33 = this.f81756h.f102907g;
            if (z) {
                i33 = this.f81757i.f102907g;
            }
            if (i4 > i24) {
                if (z) {
                    i33 += (int) (((i4 - i24) / 2.0f) + 0.5f);
                } else {
                    i33 -= (int) (((i4 - i24) / 2.0f) + 0.5f);
                }
            }
            if (i5 > 0) {
                float f4 = i24 - i4;
                int i34 = (int) ((f4 / i5) + 0.5f);
                int i35 = 0;
                int i36 = 0;
                while (i35 < size) {
                    AbstractC41387gB6 abstractC41387gB62 = this.f102338k.get(i35);
                    int i37 = i34;
                    int i38 = i4;
                    if (abstractC41387gB62.f81750b.m31393X() != 8 && abstractC41387gB62.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                        Y31 y312 = abstractC41387gB62.f81753e;
                        if (!y312.f102910j) {
                            if (f > 0.0f) {
                                i17 = i33;
                                i18 = (int) (((abstractC41387gB62.f81750b.f91864N0[this.f81754f] * f4) / f) + 0.5f);
                            } else {
                                i17 = i33;
                                i18 = i37;
                            }
                            if (this.f81754f == 0) {
                                C43042iz0 c43042iz0 = abstractC41387gB62.f81750b;
                                f2 = f4;
                                i20 = c43042iz0.f91837A;
                                i19 = c43042iz0.f91933z;
                                z3 = z;
                            } else {
                                f2 = f4;
                                C43042iz0 c43042iz02 = abstractC41387gB62.f81750b;
                                int i39 = c43042iz02.f91843D;
                                z3 = z;
                                i19 = c43042iz02.f91841C;
                                i20 = i39;
                            }
                            i16 = i3;
                            if (abstractC41387gB62.f81749a == 1) {
                                i21 = Math.min(i18, y312.f44482m);
                            } else {
                                i21 = i18;
                            }
                            int max = Math.max(i19, i21);
                            if (i20 > 0) {
                                max = Math.min(i20, max);
                            }
                            if (max != i18) {
                                i36++;
                                i18 = max;
                            }
                            abstractC41387gB62.f81753e.mo20170d(i18);
                            i35++;
                            i34 = i37;
                            i4 = i38;
                            i33 = i17;
                            f4 = f2;
                            z = z3;
                            i3 = i16;
                        }
                    }
                    z3 = z;
                    i16 = i3;
                    i17 = i33;
                    f2 = f4;
                    i35++;
                    i34 = i37;
                    i4 = i38;
                    i33 = i17;
                    f4 = f2;
                    z = z3;
                    i3 = i16;
                }
                z2 = z;
                i6 = i3;
                i7 = i33;
                int i40 = i4;
                if (i36 > 0) {
                    i5 -= i36;
                    int i41 = 0;
                    for (int i42 = 0; i42 < size; i42++) {
                        AbstractC41387gB6 abstractC41387gB63 = this.f102338k.get(i42);
                        if (abstractC41387gB63.f81750b.m31393X() != 8) {
                            if (i42 > 0 && i42 >= i25) {
                                i41 += abstractC41387gB63.f81756h.f102906f;
                            }
                            i41 += abstractC41387gB63.f81753e.f102907g;
                            if (i42 < i26 && i42 < i) {
                                i41 += -abstractC41387gB63.f81757i.f102906f;
                            }
                        }
                    }
                    i4 = i41;
                } else {
                    i4 = i40;
                }
                i9 = 2;
                if (this.f102339l == 2 && i36 == 0) {
                    i8 = 0;
                    this.f102339l = 0;
                } else {
                    i8 = 0;
                }
            } else {
                z2 = z;
                i6 = i3;
                i7 = i33;
                i8 = 0;
                i9 = 2;
            }
            if (i4 > i24) {
                this.f102339l = i9;
            }
            if (i6 > 0 && i5 == 0 && i25 == i) {
                this.f102339l = i9;
            }
            int i43 = this.f102339l;
            if (i43 == 1) {
                int i44 = i6;
                if (i44 > 1) {
                    i14 = (i24 - i4) / (i44 - 1);
                } else if (i44 == 1) {
                    i14 = (i24 - i4) / 2;
                } else {
                    i14 = i8;
                }
                if (i5 > 0) {
                    i14 = i8;
                }
                int i45 = i7;
                for (int i46 = i8; i46 < size; i46++) {
                    if (z2) {
                        i15 = size - (i46 + 1);
                    } else {
                        i15 = i46;
                    }
                    AbstractC41387gB6 abstractC41387gB64 = this.f102338k.get(i15);
                    if (abstractC41387gB64.f81750b.m31393X() == 8) {
                        abstractC41387gB64.f81756h.mo20170d(i45);
                        abstractC41387gB64.f81757i.mo20170d(i45);
                    } else {
                        if (i46 > 0) {
                            if (z2) {
                                i45 -= i14;
                            } else {
                                i45 += i14;
                            }
                        }
                        if (i46 > 0 && i46 >= i25) {
                            if (z2) {
                                i45 -= abstractC41387gB64.f81756h.f102906f;
                            } else {
                                i45 += abstractC41387gB64.f81756h.f102906f;
                            }
                        }
                        if (z2) {
                            abstractC41387gB64.f81757i.mo20170d(i45);
                        } else {
                            abstractC41387gB64.f81756h.mo20170d(i45);
                        }
                        Y31 y313 = abstractC41387gB64.f81753e;
                        int i47 = y313.f102907g;
                        if (abstractC41387gB64.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && abstractC41387gB64.f81749a == 1) {
                            i47 = y313.f44482m;
                        }
                        if (z2) {
                            i45 -= i47;
                        } else {
                            i45 += i47;
                        }
                        if (z2) {
                            abstractC41387gB64.f81756h.mo20170d(i45);
                        } else {
                            abstractC41387gB64.f81757i.mo20170d(i45);
                        }
                        abstractC41387gB64.f81755g = true;
                        if (i46 < i26 && i46 < i) {
                            if (z2) {
                                i45 -= -abstractC41387gB64.f81757i.f102906f;
                            } else {
                                i45 += -abstractC41387gB64.f81757i.f102906f;
                            }
                        }
                    }
                }
                return;
            }
            int i48 = i6;
            if (i43 == 0) {
                int i49 = (i24 - i4) / (i48 + 1);
                if (i5 > 0) {
                    i49 = i8;
                }
                int i50 = i7;
                for (int i51 = i8; i51 < size; i51++) {
                    if (z2) {
                        i12 = size - (i51 + 1);
                    } else {
                        i12 = i51;
                    }
                    AbstractC41387gB6 abstractC41387gB65 = this.f102338k.get(i12);
                    if (abstractC41387gB65.f81750b.m31393X() == 8) {
                        abstractC41387gB65.f81756h.mo20170d(i50);
                        abstractC41387gB65.f81757i.mo20170d(i50);
                    } else {
                        if (z2) {
                            i13 = i50 - i49;
                        } else {
                            i13 = i50 + i49;
                        }
                        if (i51 > 0 && i51 >= i25) {
                            if (z2) {
                                i13 -= abstractC41387gB65.f81756h.f102906f;
                            } else {
                                i13 += abstractC41387gB65.f81756h.f102906f;
                            }
                        }
                        if (z2) {
                            abstractC41387gB65.f81757i.mo20170d(i13);
                        } else {
                            abstractC41387gB65.f81756h.mo20170d(i13);
                        }
                        Y31 y314 = abstractC41387gB65.f81753e;
                        int i52 = y314.f102907g;
                        if (abstractC41387gB65.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && abstractC41387gB65.f81749a == 1) {
                            i52 = Math.min(i52, y314.f44482m);
                        }
                        if (z2) {
                            i50 = i13 - i52;
                        } else {
                            i50 = i13 + i52;
                        }
                        if (z2) {
                            abstractC41387gB65.f81756h.mo20170d(i50);
                        } else {
                            abstractC41387gB65.f81757i.mo20170d(i50);
                        }
                        if (i51 < i26 && i51 < i) {
                            if (z2) {
                                i50 -= -abstractC41387gB65.f81757i.f102906f;
                            } else {
                                i50 += -abstractC41387gB65.f81757i.f102906f;
                            }
                        }
                    }
                }
            } else if (i43 == 2) {
                if (this.f81754f == 0) {
                    m31401T = this.f81750b.m31438A();
                } else {
                    m31401T = this.f81750b.m31401T();
                }
                if (z2) {
                    m31401T = 1.0f - m31401T;
                }
                int i53 = (int) (((i24 - i4) * m31401T) + 0.5f);
                if (i53 < 0 || i5 > 0) {
                    i53 = i8;
                }
                if (z2) {
                    i10 = i7 - i53;
                } else {
                    i10 = i7 + i53;
                }
                for (int i54 = i8; i54 < size; i54++) {
                    if (z2) {
                        i11 = size - (i54 + 1);
                    } else {
                        i11 = i54;
                    }
                    AbstractC41387gB6 abstractC41387gB66 = this.f102338k.get(i11);
                    if (abstractC41387gB66.f81750b.m31393X() == 8) {
                        abstractC41387gB66.f81756h.mo20170d(i10);
                        abstractC41387gB66.f81757i.mo20170d(i10);
                    } else {
                        if (i54 > 0 && i54 >= i25) {
                            if (z2) {
                                i10 -= abstractC41387gB66.f81756h.f102906f;
                            } else {
                                i10 += abstractC41387gB66.f81756h.f102906f;
                            }
                        }
                        if (z2) {
                            abstractC41387gB66.f81757i.mo20170d(i10);
                        } else {
                            abstractC41387gB66.f81756h.mo20170d(i10);
                        }
                        Y31 y315 = abstractC41387gB66.f81753e;
                        int i55 = y315.f102907g;
                        if (abstractC41387gB66.f81752d == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && abstractC41387gB66.f81749a == 1) {
                            i55 = y315.f44482m;
                        }
                        i10 += i55;
                        if (z2) {
                            abstractC41387gB66.f81756h.mo20170d(i10);
                        } else {
                            abstractC41387gB66.f81757i.mo20170d(i10);
                        }
                        if (i54 < i26 && i54 < i) {
                            if (z2) {
                                i10 -= -abstractC41387gB66.f81757i.f102906f;
                            } else {
                                i10 += -abstractC41387gB66.f81757i.f102906f;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: d */
    public void mo5648d() {
        Iterator<AbstractC41387gB6> it = this.f102338k.iterator();
        while (it.hasNext()) {
            it.next().mo5648d();
        }
        int size = this.f102338k.size();
        if (size < 1) {
            return;
        }
        C43042iz0 c43042iz0 = this.f102338k.get(0).f81750b;
        C43042iz0 c43042iz02 = this.f102338k.get(size - 1).f81750b;
        if (this.f81754f == 0) {
            C37211Xy0 c37211Xy0 = c43042iz0.f91869Q;
            C37211Xy0 c37211Xy02 = c43042iz02.f91873S;
            C46610p01 m39890i = m39890i(c37211Xy0, 0);
            int m75997f = c37211Xy0.m75997f();
            C43042iz0 m20618r = m20618r();
            if (m20618r != null) {
                m75997f = m20618r.f91869Q.m75997f();
            }
            if (m39890i != null) {
                m39894b(this.f81756h, m39890i, m75997f);
            }
            C46610p01 m39890i2 = m39890i(c37211Xy02, 0);
            int m75997f2 = c37211Xy02.m75997f();
            C43042iz0 m20617s = m20617s();
            if (m20617s != null) {
                m75997f2 = m20617s.f91873S.m75997f();
            }
            if (m39890i2 != null) {
                m39894b(this.f81757i, m39890i2, -m75997f2);
            }
        } else {
            C37211Xy0 c37211Xy03 = c43042iz0.f91871R;
            C37211Xy0 c37211Xy04 = c43042iz02.f91875T;
            C46610p01 m39890i3 = m39890i(c37211Xy03, 1);
            int m75997f3 = c37211Xy03.m75997f();
            C43042iz0 m20618r2 = m20618r();
            if (m20618r2 != null) {
                m75997f3 = m20618r2.f91871R.m75997f();
            }
            if (m39890i3 != null) {
                m39894b(this.f81756h, m39890i3, m75997f3);
            }
            C46610p01 m39890i4 = m39890i(c37211Xy04, 1);
            int m75997f4 = c37211Xy04.m75997f();
            C43042iz0 m20617s2 = m20617s();
            if (m20617s2 != null) {
                m75997f4 = m20617s2.f91875T.m75997f();
            }
            if (m39890i4 != null) {
                m39894b(this.f81757i, m39890i4, -m75997f4);
            }
        }
        this.f81756h.f102901a = this;
        this.f81757i.f102901a = this;
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: e */
    public void mo5647e() {
        for (int i = 0; i < this.f102338k.size(); i++) {
            this.f102338k.get(i).mo5647e();
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: f */
    public void mo5646f() {
        this.f81751c = null;
        Iterator<AbstractC41387gB6> it = this.f102338k.iterator();
        while (it.hasNext()) {
            it.next().mo5646f();
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: j */
    public long mo20620j() {
        int size = this.f102338k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC41387gB6 abstractC41387gB6 = this.f102338k.get(i);
            j = j + abstractC41387gB6.f81756h.f102906f + abstractC41387gB6.mo20620j() + abstractC41387gB6.f81757i.f102906f;
        }
        return j;
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: m */
    public boolean mo5645m() {
        int size = this.f102338k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f102338k.get(i).mo5645m()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void m20619q() {
        C43042iz0 c43042iz0;
        boolean z;
        int m31399U;
        C43042iz0 c43042iz02 = this.f81750b;
        C43042iz0 m31412N = c43042iz02.m31412N(this.f81754f);
        while (true) {
            C43042iz0 c43042iz03 = m31412N;
            c43042iz0 = c43042iz02;
            c43042iz02 = c43042iz03;
            if (c43042iz02 == null) {
                break;
            }
            m31412N = c43042iz02.m31412N(this.f81754f);
        }
        this.f81750b = c43042iz0;
        this.f102338k.add(c43042iz0.m31408P(this.f81754f));
        C43042iz0 m31416L = c43042iz0.m31416L(this.f81754f);
        while (m31416L != null) {
            this.f102338k.add(m31416L.m31408P(this.f81754f));
            m31416L = m31416L.m31416L(this.f81754f);
        }
        Iterator<AbstractC41387gB6> it = this.f102338k.iterator();
        while (it.hasNext()) {
            AbstractC41387gB6 next = it.next();
            int i = this.f81754f;
            if (i == 0) {
                next.f81750b.f91887c = this;
            } else if (i == 1) {
                next.f81750b.f91889d = this;
            }
        }
        if (this.f81754f == 0 && ((C43635jz0) this.f81750b.m31414M()).m29540U1()) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f102338k.size() > 1) {
            ArrayList<AbstractC41387gB6> arrayList = this.f102338k;
            this.f81750b = arrayList.get(arrayList.size() - 1).f81750b;
        }
        if (this.f81754f == 0) {
            m31399U = this.f81750b.m31436B();
        } else {
            m31399U = this.f81750b.m31399U();
        }
        this.f102339l = m31399U;
    }

    /* renamed from: r */
    public final C43042iz0 m20618r() {
        for (int i = 0; i < this.f102338k.size(); i++) {
            AbstractC41387gB6 abstractC41387gB6 = this.f102338k.get(i);
            if (abstractC41387gB6.f81750b.m31393X() != 8) {
                return abstractC41387gB6.f81750b;
            }
        }
        return null;
    }

    /* renamed from: s */
    public final C43042iz0 m20617s() {
        for (int size = this.f102338k.size() - 1; size >= 0; size--) {
            AbstractC41387gB6 abstractC41387gB6 = this.f102338k.get(size);
            if (abstractC41387gB6.f81750b.m31393X() != 8) {
                return abstractC41387gB6.f81750b;
            }
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f81754f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator<AbstractC41387gB6> it = this.f102338k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
