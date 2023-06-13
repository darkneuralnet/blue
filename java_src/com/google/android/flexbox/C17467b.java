package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.flexbox.b */
/* loaded from: classes5.dex */
public class C17467b {

    /* renamed from: a */
    public final InterfaceC36681Vr1 f70277a;

    /* renamed from: b */
    public boolean[] f70278b;

    /* renamed from: c */
    public int[] f70279c;

    /* renamed from: d */
    public long[] f70280d;

    /* renamed from: e */
    public long[] f70281e;

    /* renamed from: com.google.android.flexbox.b$b */
    /* loaded from: classes5.dex */
    public static class C17469b {

        /* renamed from: a */
        public List<C17466a> f70282a;

        /* renamed from: b */
        public int f70283b;

        /* renamed from: a */
        public void m51646a() {
            this.f70282a = null;
            this.f70283b = 0;
        }
    }

    /* renamed from: com.google.android.flexbox.b$c */
    /* loaded from: classes5.dex */
    public static class C17470c implements Comparable<C17470c> {

        /* renamed from: b */
        public int f70284b;

        /* renamed from: c */
        public int f70285c;

        private C17470c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C17470c c17470c) {
            int i = this.f70285c;
            int i2 = c17470c.f70285c;
            if (i != i2) {
                return i - i2;
            }
            return this.f70284b - c17470c.f70284b;
        }

        public String toString() {
            return "Order{order=" + this.f70285c + ", index=" + this.f70284b + CoreConstants.CURLY_RIGHT;
        }
    }

    public C17467b(InterfaceC36681Vr1 interfaceC36681Vr1) {
        this.f70277a = interfaceC36681Vr1;
    }

    /* renamed from: A */
    public final int m51698A(int i, FlexItem flexItem, int i2) {
        InterfaceC36681Vr1 interfaceC36681Vr1 = this.f70277a;
        int mo51796p = interfaceC36681Vr1.mo51796p(i, interfaceC36681Vr1.getPaddingLeft() + this.f70277a.getPaddingRight() + flexItem.mo51773W2() + flexItem.mo51767n3() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(mo51796p);
        if (size > flexItem.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(mo51796p));
        }
        if (size < flexItem.mo51772f()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo51772f(), View.MeasureSpec.getMode(mo51796p));
        }
        return mo51796p;
    }

    /* renamed from: B */
    public final int m51697B(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo51774V0();
        }
        return flexItem.mo51767n3();
    }

    /* renamed from: C */
    public final int m51696C(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo51767n3();
        }
        return flexItem.mo51774V0();
    }

    /* renamed from: D */
    public final int m51695D(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo51771f0();
        }
        return flexItem.mo51773W2();
    }

    /* renamed from: E */
    public final int m51694E(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo51773W2();
        }
        return flexItem.mo51771f0();
    }

    /* renamed from: F */
    public final int m51693F(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getHeight();
        }
        return flexItem.getWidth();
    }

    /* renamed from: G */
    public final int m51692G(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getWidth();
        }
        return flexItem.getHeight();
    }

    /* renamed from: H */
    public final int m51691H(boolean z) {
        if (z) {
            return this.f70277a.getPaddingBottom();
        }
        return this.f70277a.getPaddingEnd();
    }

    /* renamed from: I */
    public final int m51690I(boolean z) {
        if (z) {
            return this.f70277a.getPaddingEnd();
        }
        return this.f70277a.getPaddingBottom();
    }

    /* renamed from: J */
    public final int m51689J(boolean z) {
        if (z) {
            return this.f70277a.getPaddingTop();
        }
        return this.f70277a.getPaddingStart();
    }

    /* renamed from: K */
    public final int m51688K(boolean z) {
        if (z) {
            return this.f70277a.getPaddingStart();
        }
        return this.f70277a.getPaddingTop();
    }

    /* renamed from: L */
    public final int m51687L(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: M */
    public final int m51686M(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: N */
    public final boolean m51685N(int i, int i2, C17466a c17466a) {
        return i == i2 - 1 && c17466a.m51700c() != 0;
    }

    /* renamed from: O */
    public boolean m51684O(SparseIntArray sparseIntArray) {
        int mo51802n = this.f70277a.mo51802n();
        if (sparseIntArray.size() != mo51802n) {
            return true;
        }
        for (int i = 0; i < mo51802n; i++) {
            View mo51829e = this.f70277a.mo51829e(i);
            if (mo51829e != null && ((FlexItem) mo51829e.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final boolean m51683P(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.f70277a.mo51813j() == 0) {
            return false;
        }
        if (flexItem.mo51765v2()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int mo51799o = this.f70277a.mo51799o();
        if (mo51799o != -1 && mo51799o <= i7 + 1) {
            return false;
        }
        int mo51805m = this.f70277a.mo51805m(view, i5, i6);
        if (mo51805m > 0) {
            i4 += mo51805m;
        }
        if (i2 >= i3 + i4) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public void m51682Q(View view, C17466a c17466a, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int mo51808l = this.f70277a.mo51808l();
        if (flexItem.mo51777N1() != -1) {
            mo51808l = flexItem.mo51777N1();
        }
        int i5 = c17466a.f70265g;
        if (mo51808l != 0) {
            if (mo51808l != 1) {
                if (mo51808l != 2) {
                    if (mo51808l != 3) {
                        if (mo51808l != 4) {
                            return;
                        }
                    } else if (this.f70277a.mo51813j() != 2) {
                        int max = Math.max(c17466a.f70270l - view.getBaseline(), flexItem.mo51771f0());
                        view.layout(i, i2 + max, i3, i4 + max);
                        return;
                    } else {
                        int max2 = Math.max((c17466a.f70270l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo51774V0());
                        view.layout(i, i2 - max2, i3, i4 - max2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo51771f0()) - flexItem.mo51774V0()) / 2;
                    if (this.f70277a.mo51813j() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                }
            } else if (this.f70277a.mo51813j() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.mo51774V0(), i3, i8 - flexItem.mo51774V0());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo51771f0(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo51771f0());
                return;
            }
        }
        if (this.f70277a.mo51813j() != 2) {
            view.layout(i, i2 + flexItem.mo51771f0(), i3, i4 + flexItem.mo51771f0());
        } else {
            view.layout(i, i2 - flexItem.mo51774V0(), i3, i4 - flexItem.mo51774V0());
        }
    }

    /* renamed from: R */
    public void m51681R(View view, C17466a c17466a, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int mo51808l = this.f70277a.mo51808l();
        if (flexItem.mo51777N1() != -1) {
            mo51808l = flexItem.mo51777N1();
        }
        int i5 = c17466a.f70265g;
        if (mo51808l != 0) {
            if (mo51808l != 1) {
                if (mo51808l != 2) {
                    if (mo51808l != 3 && mo51808l != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + C39093cM2.m61542b(marginLayoutParams)) - C39093cM2.m61543a(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo51767n3(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo51767n3(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo51773W2(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo51773W2(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.mo51773W2(), i2, i3 + flexItem.mo51773W2(), i4);
        } else {
            view.layout(i - flexItem.mo51767n3(), i2, i3 - flexItem.mo51767n3(), i4);
        }
    }

    /* renamed from: S */
    public long m51680S(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    /* renamed from: T */
    public final void m51679T(int i, int i2, C17466a c17466a, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8 = c17466a.f70263e;
        float f = c17466a.f70269k;
        float f2 = 0.0f;
        if (f > 0.0f && i3 <= i8) {
            float f3 = (i8 - i3) / f;
            c17466a.f70263e = i4 + c17466a.f70264f;
            if (!z) {
                c17466a.f70265g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < c17466a.f70266h) {
                int i11 = c17466a.f70273o + i9;
                View mo51811k = this.f70277a.mo51811k(i11);
                if (mo51811k != null && mo51811k.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) mo51811k.getLayoutParams();
                    int mo51833c = this.f70277a.mo51833c();
                    if (mo51833c != 0 && mo51833c != 1) {
                        int measuredHeight = mo51811k.getMeasuredHeight();
                        long[] jArr = this.f70281e;
                        if (jArr != null) {
                            measuredHeight = m51649x(jArr[i11]);
                        }
                        int measuredWidth = mo51811k.getMeasuredWidth();
                        long[] jArr2 = this.f70281e;
                        if (jArr2 != null) {
                            measuredWidth = m51648y(jArr2[i11]);
                        }
                        if (!this.f70278b[i11] && flexItem.mo51776P1() > f2) {
                            float mo51776P1 = measuredHeight - (flexItem.mo51776P1() * f3);
                            if (i9 == c17466a.f70266h - 1) {
                                mo51776P1 += f4;
                                f4 = f2;
                            }
                            int round = Math.round(mo51776P1);
                            if (round < flexItem.mo51766o3()) {
                                round = flexItem.mo51766o3();
                                this.f70278b[i11] = true;
                                c17466a.f70269k -= flexItem.mo51776P1();
                                i5 = i8;
                                i6 = i9;
                                z2 = true;
                            } else {
                                f4 += mo51776P1 - round;
                                i5 = i8;
                                i6 = i9;
                                double d = f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int m51698A = m51698A(i, flexItem, c17466a.f70271m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            mo51811k.measure(m51698A, makeMeasureSpec);
                            measuredWidth = mo51811k.getMeasuredWidth();
                            int measuredHeight2 = mo51811k.getMeasuredHeight();
                            m51673Z(i11, m51698A, makeMeasureSpec, mo51811k);
                            this.f70277a.mo51790s(i11, mo51811k);
                            measuredHeight = measuredHeight2;
                        } else {
                            i5 = i8;
                            i6 = i9;
                        }
                        i7 = Math.max(i10, measuredWidth + flexItem.mo51773W2() + flexItem.mo51767n3() + this.f70277a.mo51817i(mo51811k));
                        c17466a.f70263e += measuredHeight + flexItem.mo51771f0() + flexItem.mo51774V0();
                    } else {
                        i5 = i8;
                        int i12 = i9;
                        int measuredWidth2 = mo51811k.getMeasuredWidth();
                        long[] jArr3 = this.f70281e;
                        if (jArr3 != null) {
                            measuredWidth2 = m51648y(jArr3[i11]);
                        }
                        int measuredHeight3 = mo51811k.getMeasuredHeight();
                        long[] jArr4 = this.f70281e;
                        if (jArr4 != null) {
                            measuredHeight3 = m51649x(jArr4[i11]);
                        }
                        if (!this.f70278b[i11] && flexItem.mo51776P1() > 0.0f) {
                            float mo51776P12 = measuredWidth2 - (flexItem.mo51776P1() * f3);
                            i6 = i12;
                            if (i6 == c17466a.f70266h - 1) {
                                mo51776P12 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(mo51776P12);
                            if (round2 < flexItem.mo51772f()) {
                                round2 = flexItem.mo51772f();
                                this.f70278b[i11] = true;
                                c17466a.f70269k -= flexItem.mo51776P1();
                                z2 = true;
                            } else {
                                f4 += mo51776P12 - round2;
                                double d2 = f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int m51647z = m51647z(i2, flexItem, c17466a.f70271m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            mo51811k.measure(makeMeasureSpec2, m51647z);
                            int measuredWidth3 = mo51811k.getMeasuredWidth();
                            int measuredHeight4 = mo51811k.getMeasuredHeight();
                            m51673Z(i11, makeMeasureSpec2, m51647z, mo51811k);
                            this.f70277a.mo51790s(i11, mo51811k);
                            measuredWidth2 = measuredWidth3;
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i6 = i12;
                        }
                        int max = Math.max(i10, measuredHeight3 + flexItem.mo51771f0() + flexItem.mo51774V0() + this.f70277a.mo51817i(mo51811k));
                        c17466a.f70263e += measuredWidth2 + flexItem.mo51773W2() + flexItem.mo51767n3();
                        i7 = max;
                    }
                    c17466a.f70265g = Math.max(c17466a.f70265g, i7);
                    i10 = i7;
                } else {
                    i5 = i8;
                    i6 = i9;
                }
                i9 = i6 + 1;
                i8 = i5;
                f2 = 0.0f;
            }
            int i13 = i8;
            if (z2 && i13 != c17466a.f70263e) {
                m51679T(i, i2, c17466a, i3, i4, true);
            }
        }
    }

    /* renamed from: U */
    public final int[] m51678U(int i, List<C17470c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C17470c c17470c : list) {
            int i3 = c17470c.f70284b;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c17470c.f70285c);
            i2++;
        }
        return iArr;
    }

    /* renamed from: V */
    public final void m51677V(View view, int i, int i2) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo51773W2()) - flexItem.mo51767n3()) - this.f70277a.mo51817i(view), flexItem.mo51772f()), flexItem.getMaxWidth());
        long[] jArr = this.f70281e;
        if (jArr != null) {
            measuredHeight = m51649x(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m51673Z(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f70277a.mo51790s(i2, view);
    }

    /* renamed from: W */
    public final void m51676W(View view, int i, int i2) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo51771f0()) - flexItem.mo51774V0()) - this.f70277a.mo51817i(view), flexItem.mo51766o3()), flexItem.getMaxHeight());
        long[] jArr = this.f70281e;
        if (jArr != null) {
            measuredWidth = m51648y(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m51673Z(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f70277a.mo51790s(i2, view);
    }

    /* renamed from: X */
    public void m51675X() {
        m51674Y(0);
    }

    /* renamed from: Y */
    public void m51674Y(int i) {
        int i2;
        View mo51811k;
        if (i >= this.f70277a.mo51802n()) {
            return;
        }
        int mo51833c = this.f70277a.mo51833c();
        if (this.f70277a.mo51808l() == 4) {
            int[] iArr = this.f70279c;
            if (iArr != null) {
                i2 = iArr[i];
            } else {
                i2 = 0;
            }
            List<C17466a> mo51826f = this.f70277a.mo51826f();
            int size = mo51826f.size();
            while (i2 < size) {
                C17466a c17466a = mo51826f.get(i2);
                int i3 = c17466a.f70266h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c17466a.f70273o + i4;
                    if (i4 < this.f70277a.mo51802n() && (mo51811k = this.f70277a.mo51811k(i5)) != null && mo51811k.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) mo51811k.getLayoutParams();
                        if (flexItem.mo51777N1() == -1 || flexItem.mo51777N1() == 4) {
                            if (mo51833c != 0 && mo51833c != 1) {
                                if (mo51833c != 2 && mo51833c != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: " + mo51833c);
                                }
                                m51677V(mo51811k, c17466a.f70265g, i5);
                            } else {
                                m51676W(mo51811k, c17466a.f70265g, i5);
                            }
                        }
                    }
                }
                i2++;
            }
            return;
        }
        for (C17466a c17466a2 : this.f70277a.mo51826f()) {
            for (Integer num : c17466a2.f70272n) {
                View mo51811k2 = this.f70277a.mo51811k(num.intValue());
                if (mo51833c != 0 && mo51833c != 1) {
                    if (mo51833c != 2 && mo51833c != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: " + mo51833c);
                    }
                    m51677V(mo51811k2, c17466a2.f70265g, num.intValue());
                } else {
                    m51676W(mo51811k2, c17466a2.f70265g, num.intValue());
                }
            }
        }
    }

    /* renamed from: Z */
    public final void m51673Z(int i, int i2, int i3, View view) {
        long[] jArr = this.f70280d;
        if (jArr != null) {
            jArr[i] = m51680S(i2, i3);
        }
        long[] jArr2 = this.f70281e;
        if (jArr2 != null) {
            jArr2[i] = m51680S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    public final void m51672a(List<C17466a> list, C17466a c17466a, int i, int i2) {
        c17466a.f70271m = i2;
        this.f70277a.mo51792r(c17466a);
        c17466a.f70274p = i;
        list.add(c17466a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m51671b(C17469b c17469b, int i, int i2, int i3, int i4, int i5, List<C17466a> list) {
        ArrayList arrayList;
        int i6;
        int i7;
        C17469b c17469b2;
        int i8;
        int i9;
        int i10;
        List<C17466a> list2;
        int i11;
        View view;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = i;
        int i23 = i2;
        int i24 = i5;
        boolean mo51785u = this.f70277a.mo51785u();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        c17469b.f70282a = arrayList;
        if (i24 == -1) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        int m51688K = m51688K(mo51785u);
        int m51690I = m51690I(mo51785u);
        int m51689J = m51689J(mo51785u);
        int m51691H = m51691H(mo51785u);
        C17466a c17466a = new C17466a();
        int i25 = i4;
        c17466a.f70273o = i25;
        int i26 = m51690I + m51688K;
        c17466a.f70263e = i26;
        int mo51802n = this.f70277a.mo51802n();
        int i27 = i6;
        int i28 = Integer.MIN_VALUE;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            if (i25 < mo51802n) {
                View mo51811k = this.f70277a.mo51811k(i25);
                if (mo51811k == null) {
                    if (m51685N(i25, mo51802n, c17466a)) {
                        m51672a(arrayList, c17466a, i25, i29);
                    }
                } else if (mo51811k.getVisibility() == 8) {
                    c17466a.f70267i++;
                    c17466a.f70266h++;
                    if (m51685N(i25, mo51802n, c17466a)) {
                        m51672a(arrayList, c17466a, i25, i29);
                    }
                } else {
                    if (mo51811k instanceof CompoundButton) {
                        m51651v((CompoundButton) mo51811k);
                    }
                    FlexItem flexItem = (FlexItem) mo51811k.getLayoutParams();
                    int i32 = mo51802n;
                    if (flexItem.mo51777N1() == 4) {
                        c17466a.f70272n.add(Integer.valueOf(i25));
                    }
                    int m51692G = m51692G(flexItem, mo51785u);
                    if (flexItem.mo51768m2() != -1.0f && mode == 1073741824) {
                        m51692G = Math.round(size * flexItem.mo51768m2());
                    }
                    if (mo51785u) {
                        int mo51796p = this.f70277a.mo51796p(i22, i26 + m51694E(flexItem, true) + m51696C(flexItem, true), m51692G);
                        i8 = size;
                        i9 = mode;
                        int mo51823g = this.f70277a.mo51823g(i23, m51689J + m51691H + m51695D(flexItem, true) + m51697B(flexItem, true) + i29, m51693F(flexItem, true));
                        mo51811k.measure(mo51796p, mo51823g);
                        m51673Z(i25, mo51796p, mo51823g, mo51811k);
                        i10 = mo51796p;
                    } else {
                        i8 = size;
                        i9 = mode;
                        int mo51796p2 = this.f70277a.mo51796p(i23, m51689J + m51691H + m51695D(flexItem, false) + m51697B(flexItem, false) + i29, m51693F(flexItem, false));
                        int mo51823g2 = this.f70277a.mo51823g(i22, m51694E(flexItem, false) + i26 + m51696C(flexItem, false), m51692G);
                        mo51811k.measure(mo51796p2, mo51823g2);
                        m51673Z(i25, mo51796p2, mo51823g2, mo51811k);
                        i10 = mo51823g2;
                    }
                    this.f70277a.mo51790s(i25, mo51811k);
                    m51664i(mo51811k, i25);
                    i30 = View.combineMeasuredStates(i30, mo51811k.getMeasuredState());
                    int i33 = i29;
                    int i34 = i26;
                    C17466a c17466a2 = c17466a;
                    int i35 = i25;
                    list2 = arrayList;
                    int i36 = i10;
                    if (m51683P(mo51811k, i9, i8, c17466a.f70263e, m51696C(flexItem, mo51785u) + m51686M(mo51811k, mo51785u) + m51694E(flexItem, mo51785u), flexItem, i35, i31, arrayList.size())) {
                        if (c17466a2.m51700c() > 0) {
                            if (i35 > 0) {
                                i21 = i35 - 1;
                            } else {
                                i21 = 0;
                            }
                            m51672a(list2, c17466a2, i21, i33);
                            i29 = c17466a2.f70265g + i33;
                        } else {
                            i29 = i33;
                        }
                        if (mo51785u) {
                            if (flexItem.getHeight() == -1) {
                                InterfaceC36681Vr1 interfaceC36681Vr1 = this.f70277a;
                                i11 = i2;
                                i25 = i35;
                                view = mo51811k;
                                view.measure(i36, interfaceC36681Vr1.mo51823g(i11, interfaceC36681Vr1.getPaddingTop() + this.f70277a.getPaddingBottom() + flexItem.mo51771f0() + flexItem.mo51774V0() + i29, flexItem.getHeight()));
                                m51664i(view, i25);
                            } else {
                                i11 = i2;
                                view = mo51811k;
                                i25 = i35;
                            }
                        } else {
                            i11 = i2;
                            view = mo51811k;
                            i25 = i35;
                            if (flexItem.getWidth() == -1) {
                                InterfaceC36681Vr1 interfaceC36681Vr12 = this.f70277a;
                                view.measure(interfaceC36681Vr12.mo51796p(i11, interfaceC36681Vr12.getPaddingLeft() + this.f70277a.getPaddingRight() + flexItem.mo51773W2() + flexItem.mo51767n3() + i29, flexItem.getWidth()), i36);
                                m51664i(view, i25);
                            }
                        }
                        c17466a = new C17466a();
                        i13 = 1;
                        c17466a.f70266h = 1;
                        i12 = i34;
                        c17466a.f70263e = i12;
                        c17466a.f70273o = i25;
                        i15 = Integer.MIN_VALUE;
                        i14 = 0;
                    } else {
                        i11 = i2;
                        view = mo51811k;
                        i25 = i35;
                        c17466a = c17466a2;
                        i12 = i34;
                        i13 = 1;
                        c17466a.f70266h++;
                        i14 = i31 + 1;
                        i29 = i33;
                        i15 = i28;
                    }
                    boolean z = c17466a.f70275q;
                    if (flexItem.mo51769i2() != 0.0f) {
                        i16 = i13;
                    } else {
                        i16 = 0;
                    }
                    c17466a.f70275q = (z ? 1 : 0) | i16;
                    boolean z2 = c17466a.f70276r;
                    if (flexItem.mo51776P1() != 0.0f) {
                        i17 = i13;
                    } else {
                        i17 = 0;
                    }
                    c17466a.f70276r = (z2 ? 1 : 0) | i17;
                    int[] iArr = this.f70279c;
                    if (iArr != null) {
                        iArr[i25] = list2.size();
                    }
                    c17466a.f70263e += m51686M(view, mo51785u) + m51694E(flexItem, mo51785u) + m51696C(flexItem, mo51785u);
                    c17466a.f70268j += flexItem.mo51769i2();
                    c17466a.f70269k += flexItem.mo51776P1();
                    this.f70277a.mo51835b(view, i25, i14, c17466a);
                    int max = Math.max(i15, m51687L(view, mo51785u) + m51695D(flexItem, mo51785u) + m51697B(flexItem, mo51785u) + this.f70277a.mo51817i(view));
                    c17466a.f70265g = Math.max(c17466a.f70265g, max);
                    if (mo51785u) {
                        if (this.f70277a.mo51813j() != 2) {
                            c17466a.f70270l = Math.max(c17466a.f70270l, view.getBaseline() + flexItem.mo51771f0());
                        } else {
                            c17466a.f70270l = Math.max(c17466a.f70270l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.mo51774V0());
                        }
                    }
                    i18 = i32;
                    if (m51685N(i25, i18, c17466a)) {
                        m51672a(list2, c17466a, i25, i29);
                        i29 += c17466a.f70265g;
                    }
                    i19 = i5;
                    if (i19 != -1 && list2.size() > 0 && list2.get(list2.size() - i13).f70274p >= i19 && i25 >= i19 && i27 == 0) {
                        i29 = -c17466a.m51702a();
                        i20 = i3;
                        i27 = i13;
                    } else {
                        i20 = i3;
                    }
                    if (i29 > i20 && i27 != 0) {
                        c17469b2 = c17469b;
                        i7 = i30;
                        break;
                    }
                    i31 = i14;
                    i28 = max;
                    i25++;
                    i22 = i;
                    mo51802n = i18;
                    i23 = i11;
                    i26 = i12;
                    arrayList = list2;
                    size = i8;
                    i24 = i19;
                    mode = i9;
                }
                i8 = size;
                i9 = mode;
                i11 = i23;
                i19 = i24;
                list2 = arrayList;
                i12 = i26;
                i18 = mo51802n;
                i25++;
                i22 = i;
                mo51802n = i18;
                i23 = i11;
                i26 = i12;
                arrayList = list2;
                size = i8;
                i24 = i19;
                mode = i9;
            } else {
                i7 = i30;
                c17469b2 = c17469b;
                break;
            }
        }
        c17469b2.f70283b = i7;
    }

    /* renamed from: c */
    public void m51670c(C17469b c17469b, int i, int i2) {
        m51671b(c17469b, i, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    /* renamed from: d */
    public void m51669d(C17469b c17469b, int i, int i2, int i3, int i4, List<C17466a> list) {
        m51671b(c17469b, i, i2, i3, i4, -1, list);
    }

    /* renamed from: e */
    public void m51668e(C17469b c17469b, int i, int i2, int i3, int i4, List<C17466a> list) {
        m51671b(c17469b, i, i2, i3, 0, i4, list);
    }

    /* renamed from: f */
    public void m51667f(C17469b c17469b, int i, int i2) {
        m51671b(c17469b, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    /* renamed from: g */
    public void m51666g(C17469b c17469b, int i, int i2, int i3, int i4, List<C17466a> list) {
        m51671b(c17469b, i2, i, i3, i4, -1, list);
    }

    /* renamed from: h */
    public void m51665h(C17469b c17469b, int i, int i2, int i3, int i4, List<C17466a> list) {
        m51671b(c17469b, i2, i, i3, 0, i4, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m51664i(View view, int i) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < flexItem.mo51772f()) {
            measuredWidth = flexItem.mo51772f();
        } else if (measuredWidth > flexItem.getMaxWidth()) {
            measuredWidth = flexItem.getMaxWidth();
        } else {
            z = false;
            if (measuredHeight >= flexItem.mo51766o3()) {
                measuredHeight = flexItem.mo51766o3();
            } else if (measuredHeight > flexItem.getMaxHeight()) {
                measuredHeight = flexItem.getMaxHeight();
            } else {
                z2 = z;
            }
            if (!z2) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                m51673Z(i, makeMeasureSpec, makeMeasureSpec2, view);
                this.f70277a.mo51790s(i, view);
                return;
            }
            return;
        }
        z = true;
        if (measuredHeight >= flexItem.mo51766o3()) {
        }
        if (!z2) {
        }
    }

    /* renamed from: j */
    public void m51663j(List<C17466a> list, int i) {
        int i2 = this.f70279c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f70279c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f70280d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* renamed from: k */
    public final List<C17466a> m51662k(List<C17466a> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C17466a c17466a = new C17466a();
        c17466a.f70265g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(c17466a);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(c17466a);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public final List<C17470c> m51661l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C17470c c17470c = new C17470c();
            c17470c.f70285c = ((FlexItem) this.f70277a.mo51829e(i2).getLayoutParams()).getOrder();
            c17470c.f70284b = i2;
            arrayList.add(c17470c);
        }
        return arrayList;
    }

    /* renamed from: m */
    public int[] m51660m(SparseIntArray sparseIntArray) {
        int mo51802n = this.f70277a.mo51802n();
        return m51678U(mo51802n, m51661l(mo51802n), sparseIntArray);
    }

    /* renamed from: n */
    public int[] m51659n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int mo51802n = this.f70277a.mo51802n();
        List<C17470c> m51661l = m51661l(mo51802n);
        C17470c c17470c = new C17470c();
        if (view != null && (layoutParams instanceof FlexItem)) {
            c17470c.f70285c = ((FlexItem) layoutParams).getOrder();
        } else {
            c17470c.f70285c = 1;
        }
        if (i != -1 && i != mo51802n) {
            if (i < this.f70277a.mo51802n()) {
                c17470c.f70284b = i;
                while (i < mo51802n) {
                    m51661l.get(i).f70284b++;
                    i++;
                }
            } else {
                c17470c.f70284b = mo51802n;
            }
        } else {
            c17470c.f70284b = mo51802n;
        }
        m51661l.add(c17470c);
        return m51678U(mo51802n + 1, m51661l, sparseIntArray);
    }

    /* renamed from: o */
    public void m51658o(int i, int i2, int i3) {
        int i4;
        int i5;
        int mo51833c = this.f70277a.mo51833c();
        if (mo51833c != 0 && mo51833c != 1) {
            if (mo51833c != 2 && mo51833c != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + mo51833c);
            }
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        }
        List<C17466a> mo51826f = this.f70277a.mo51826f();
        if (i4 == 1073741824) {
            int mo51788t = this.f70277a.mo51788t() + i3;
            int i6 = 0;
            if (mo51826f.size() == 1) {
                mo51826f.get(0).f70265g = i5 - i3;
            } else if (mo51826f.size() >= 2) {
                int mo51820h = this.f70277a.mo51820h();
                if (mo51820h != 1) {
                    if (mo51820h != 2) {
                        if (mo51820h != 3) {
                            if (mo51820h != 4) {
                                if (mo51820h == 5 && mo51788t < i5) {
                                    float size2 = (i5 - mo51788t) / mo51826f.size();
                                    int size3 = mo51826f.size();
                                    float f = 0.0f;
                                    while (i6 < size3) {
                                        C17466a c17466a = mo51826f.get(i6);
                                        float f2 = c17466a.f70265g + size2;
                                        if (i6 == mo51826f.size() - 1) {
                                            f2 += f;
                                            f = 0.0f;
                                        }
                                        int round = Math.round(f2);
                                        f += f2 - round;
                                        if (f > 1.0f) {
                                            round++;
                                            f -= 1.0f;
                                        } else if (f < -1.0f) {
                                            round--;
                                            f += 1.0f;
                                        }
                                        c17466a.f70265g = round;
                                        i6++;
                                    }
                                    return;
                                }
                                return;
                            } else if (mo51788t >= i5) {
                                this.f70277a.setFlexLines(m51662k(mo51826f, i5, mo51788t));
                                return;
                            } else {
                                int size4 = (i5 - mo51788t) / (mo51826f.size() * 2);
                                ArrayList arrayList = new ArrayList();
                                C17466a c17466a2 = new C17466a();
                                c17466a2.f70265g = size4;
                                for (C17466a c17466a3 : mo51826f) {
                                    arrayList.add(c17466a2);
                                    arrayList.add(c17466a3);
                                    arrayList.add(c17466a2);
                                }
                                this.f70277a.setFlexLines(arrayList);
                                return;
                            }
                        } else if (mo51788t < i5) {
                            float size5 = (i5 - mo51788t) / (mo51826f.size() - 1);
                            ArrayList arrayList2 = new ArrayList();
                            int size6 = mo51826f.size();
                            float f3 = 0.0f;
                            while (i6 < size6) {
                                arrayList2.add(mo51826f.get(i6));
                                if (i6 != mo51826f.size() - 1) {
                                    C17466a c17466a4 = new C17466a();
                                    if (i6 == mo51826f.size() - 2) {
                                        c17466a4.f70265g = Math.round(f3 + size5);
                                        f3 = 0.0f;
                                    } else {
                                        c17466a4.f70265g = Math.round(size5);
                                    }
                                    int i7 = c17466a4.f70265g;
                                    f3 += size5 - i7;
                                    if (f3 > 1.0f) {
                                        c17466a4.f70265g = i7 + 1;
                                        f3 -= 1.0f;
                                    } else if (f3 < -1.0f) {
                                        c17466a4.f70265g = i7 - 1;
                                        f3 += 1.0f;
                                    }
                                    arrayList2.add(c17466a4);
                                }
                                i6++;
                            }
                            this.f70277a.setFlexLines(arrayList2);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.f70277a.setFlexLines(m51662k(mo51826f, i5, mo51788t));
                    return;
                }
                int i8 = i5 - mo51788t;
                C17466a c17466a5 = new C17466a();
                c17466a5.f70265g = i8;
                mo51826f.add(0, c17466a5);
            }
        }
    }

    /* renamed from: p */
    public void m51657p(int i, int i2) {
        m51656q(i, i2, 0);
    }

    /* renamed from: q */
    public void m51656q(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        m51655r(this.f70277a.mo51802n());
        if (i3 >= this.f70277a.mo51802n()) {
            return;
        }
        int mo51833c = this.f70277a.mo51833c();
        int mo51833c2 = this.f70277a.mo51833c();
        if (mo51833c2 != 0 && mo51833c2 != 1) {
            if (mo51833c2 != 2 && mo51833c2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + mo51833c);
            }
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                size = this.f70277a.mo51831d();
            }
            paddingLeft = this.f70277a.getPaddingTop();
            paddingRight = this.f70277a.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int mo51831d = this.f70277a.mo51831d();
            if (mode2 != 1073741824) {
                size = Math.min(mo51831d, size);
            }
            paddingLeft = this.f70277a.getPaddingLeft();
            paddingRight = this.f70277a.getPaddingRight();
        }
        int i5 = paddingLeft + paddingRight;
        int[] iArr = this.f70279c;
        if (iArr != null) {
            i4 = iArr[i3];
        } else {
            i4 = 0;
        }
        List<C17466a> mo51826f = this.f70277a.mo51826f();
        int size2 = mo51826f.size();
        while (i4 < size2) {
            C17466a c17466a = mo51826f.get(i4);
            int i6 = c17466a.f70263e;
            if (i6 < size && c17466a.f70275q) {
                m51650w(i, i2, c17466a, size, i5, false);
            } else if (i6 > size && c17466a.f70276r) {
                m51679T(i, i2, c17466a, size, i5, false);
            }
            i4++;
        }
    }

    /* renamed from: r */
    public final void m51655r(int i) {
        boolean[] zArr = this.f70278b;
        if (zArr == null) {
            this.f70278b = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f70278b = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: s */
    public void m51654s(int i) {
        int[] iArr = this.f70279c;
        if (iArr == null) {
            this.f70279c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f70279c = Arrays.copyOf(this.f70279c, Math.max(iArr.length * 2, i));
        }
    }

    /* renamed from: t */
    public void m51653t(int i) {
        long[] jArr = this.f70280d;
        if (jArr == null) {
            this.f70280d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f70280d = Arrays.copyOf(this.f70280d, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: u */
    public void m51652u(int i) {
        long[] jArr = this.f70281e;
        if (jArr == null) {
            this.f70281e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f70281e = Arrays.copyOf(this.f70281e, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: v */
    public final void m51651v(CompoundButton compoundButton) {
        int minimumWidth;
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int mo51772f = flexItem.mo51772f();
        int mo51766o3 = flexItem.mo51766o3();
        Drawable m13546a = C48921su0.m13546a(compoundButton);
        int i = 0;
        if (m13546a == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = m13546a.getMinimumWidth();
        }
        if (m13546a != null) {
            i = m13546a.getMinimumHeight();
        }
        if (mo51772f == -1) {
            mo51772f = minimumWidth;
        }
        flexItem.mo51775U2(mo51772f);
        if (mo51766o3 == -1) {
            mo51766o3 = i;
        }
        flexItem.mo51770g2(mo51766o3);
    }

    /* renamed from: w */
    public final void m51650w(int i, int i2, C17466a c17466a, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        float f = c17466a.f70268j;
        float f2 = 0.0f;
        if (f > 0.0f && i3 >= (i5 = c17466a.f70263e)) {
            float f3 = (i3 - i5) / f;
            c17466a.f70263e = i4 + c17466a.f70264f;
            if (!z) {
                c17466a.f70265g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < c17466a.f70266h) {
                int i11 = c17466a.f70273o + i9;
                View mo51811k = this.f70277a.mo51811k(i11);
                if (mo51811k != null && mo51811k.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) mo51811k.getLayoutParams();
                    int mo51833c = this.f70277a.mo51833c();
                    if (mo51833c != 0 && mo51833c != 1) {
                        int measuredHeight = mo51811k.getMeasuredHeight();
                        long[] jArr = this.f70281e;
                        if (jArr != null) {
                            measuredHeight = m51649x(jArr[i11]);
                        }
                        int measuredWidth = mo51811k.getMeasuredWidth();
                        long[] jArr2 = this.f70281e;
                        if (jArr2 != null) {
                            measuredWidth = m51648y(jArr2[i11]);
                        }
                        if (!this.f70278b[i11] && flexItem.mo51769i2() > f2) {
                            float mo51769i2 = measuredHeight + (flexItem.mo51769i2() * f3);
                            if (i9 == c17466a.f70266h - 1) {
                                mo51769i2 += f4;
                                f4 = f2;
                            }
                            int round = Math.round(mo51769i2);
                            if (round > flexItem.getMaxHeight()) {
                                round = flexItem.getMaxHeight();
                                this.f70278b[i11] = true;
                                c17466a.f70268j -= flexItem.mo51769i2();
                                i8 = i5;
                                z2 = true;
                            } else {
                                f4 += mo51769i2 - round;
                                i8 = i5;
                                double d3 = f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d2 = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d2 = d3 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int m51698A = m51698A(i, flexItem, c17466a.f70271m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            mo51811k.measure(m51698A, makeMeasureSpec);
                            measuredWidth = mo51811k.getMeasuredWidth();
                            int measuredHeight2 = mo51811k.getMeasuredHeight();
                            m51673Z(i11, m51698A, makeMeasureSpec, mo51811k);
                            this.f70277a.mo51790s(i11, mo51811k);
                            measuredHeight = measuredHeight2;
                        } else {
                            i8 = i5;
                        }
                        i7 = Math.max(i10, measuredWidth + flexItem.mo51773W2() + flexItem.mo51767n3() + this.f70277a.mo51817i(mo51811k));
                        c17466a.f70263e += measuredHeight + flexItem.mo51771f0() + flexItem.mo51774V0();
                        i6 = i8;
                    } else {
                        int i12 = i5;
                        int measuredWidth2 = mo51811k.getMeasuredWidth();
                        long[] jArr3 = this.f70281e;
                        if (jArr3 != null) {
                            measuredWidth2 = m51648y(jArr3[i11]);
                        }
                        int measuredHeight3 = mo51811k.getMeasuredHeight();
                        long[] jArr4 = this.f70281e;
                        i6 = i12;
                        if (jArr4 != null) {
                            measuredHeight3 = m51649x(jArr4[i11]);
                        }
                        if (!this.f70278b[i11] && flexItem.mo51769i2() > 0.0f) {
                            float mo51769i22 = measuredWidth2 + (flexItem.mo51769i2() * f3);
                            if (i9 == c17466a.f70266h - 1) {
                                mo51769i22 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(mo51769i22);
                            if (round2 > flexItem.getMaxWidth()) {
                                round2 = flexItem.getMaxWidth();
                                this.f70278b[i11] = true;
                                c17466a.f70268j -= flexItem.mo51769i2();
                                z2 = true;
                            } else {
                                f4 += mo51769i22 - round2;
                                double d4 = f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d = d4 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int m51647z = m51647z(i2, flexItem, c17466a.f70271m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            mo51811k.measure(makeMeasureSpec2, m51647z);
                            int measuredWidth3 = mo51811k.getMeasuredWidth();
                            int measuredHeight4 = mo51811k.getMeasuredHeight();
                            m51673Z(i11, makeMeasureSpec2, m51647z, mo51811k);
                            this.f70277a.mo51790s(i11, mo51811k);
                            measuredWidth2 = measuredWidth3;
                            measuredHeight3 = measuredHeight4;
                        }
                        int max = Math.max(i10, measuredHeight3 + flexItem.mo51771f0() + flexItem.mo51774V0() + this.f70277a.mo51817i(mo51811k));
                        c17466a.f70263e += measuredWidth2 + flexItem.mo51773W2() + flexItem.mo51767n3();
                        i7 = max;
                    }
                    c17466a.f70265g = Math.max(c17466a.f70265g, i7);
                    i10 = i7;
                } else {
                    i6 = i5;
                }
                i9++;
                i5 = i6;
                f2 = 0.0f;
            }
            int i13 = i5;
            if (z2 && i13 != c17466a.f70263e) {
                m51650w(i, i2, c17466a, i3, i4, true);
            }
        }
    }

    /* renamed from: x */
    public int m51649x(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: y */
    public int m51648y(long j) {
        return (int) j;
    }

    /* renamed from: z */
    public final int m51647z(int i, FlexItem flexItem, int i2) {
        InterfaceC36681Vr1 interfaceC36681Vr1 = this.f70277a;
        int mo51823g = interfaceC36681Vr1.mo51823g(i, interfaceC36681Vr1.getPaddingTop() + this.f70277a.getPaddingBottom() + flexItem.mo51771f0() + flexItem.mo51774V0() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(mo51823g);
        if (size > flexItem.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(mo51823g));
        }
        if (size < flexItem.mo51766o3()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo51766o3(), View.MeasureSpec.getMode(mo51823g));
        }
        return mo51823g;
    }
}
