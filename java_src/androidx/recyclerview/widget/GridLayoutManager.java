package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p000.C27125p2;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: J */
    public boolean f55146J;

    /* renamed from: K */
    public int f55147K;

    /* renamed from: P */
    public int[] f55148P;

    /* renamed from: Q */
    public View[] f55149Q;

    /* renamed from: R */
    public final SparseIntArray f55150R;

    /* renamed from: S */
    public final SparseIntArray f55151S;

    /* renamed from: T */
    public AbstractC11826b f55152T;

    /* renamed from: U */
    public final Rect f55153U;

    /* renamed from: W */
    public boolean f55154W;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C11825a extends AbstractC11826b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC11826b
        /* renamed from: e */
        public int mo66752e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC11826b
        /* renamed from: f */
        public int mo56202f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11826b {

        /* renamed from: a */
        public final SparseIntArray f55157a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f55158b = new SparseIntArray();

        /* renamed from: c */
        public boolean f55159c = false;

        /* renamed from: d */
        public boolean f55160d = false;

        /* renamed from: a */
        public static int m66756a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 >= 0 && i4 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i4);
            }
            return -1;
        }

        /* renamed from: b */
        public int m66755b(int i, int i2) {
            if (!this.f55160d) {
                return m66753d(i, i2);
            }
            int i3 = this.f55158b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int m66753d = m66753d(i, i2);
            this.f55158b.put(i, m66753d);
            return m66753d;
        }

        /* renamed from: c */
        public int m66754c(int i, int i2) {
            if (!this.f55159c) {
                return mo66752e(i, i2);
            }
            int i3 = this.f55157a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int mo66752e = mo66752e(i, i2);
            this.f55157a.put(i, mo66752e);
            return mo66752e;
        }

        /* renamed from: d */
        public int m66753d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int m66756a;
            if (this.f55160d && (m66756a = m66756a(this.f55158b, i)) != -1) {
                i3 = this.f55158b.get(m66756a);
                i4 = m66756a + 1;
                i5 = m66754c(m66756a, i2) + mo56202f(m66756a);
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                }
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            int mo56202f = mo56202f(i);
            while (i4 < i) {
                int mo56202f2 = mo56202f(i4);
                i5 += mo56202f2;
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                } else if (i5 > i2) {
                    i3++;
                    i5 = mo56202f2;
                }
                i4++;
            }
            if (i5 + mo56202f > i2) {
                return i3 + 1;
            }
            return i3;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo66752e(int i, int i2) {
            int i3;
            int i4;
            int mo56202f = mo56202f(i);
            if (mo56202f == i2) {
                return 0;
            }
            if (this.f55159c && (i3 = m66756a(this.f55157a, i)) >= 0) {
                i4 = this.f55157a.get(i3) + mo56202f(i3);
                i3++;
                if (i3 >= i) {
                }
            } else {
                i3 = 0;
                i4 = 0;
                if (i3 >= i) {
                    int mo56202f2 = mo56202f(i3);
                    i4 += mo56202f2;
                    if (i4 == i2) {
                        i4 = 0;
                    } else if (i4 > i2) {
                        i4 = mo56202f2;
                    }
                    i3++;
                    if (i3 >= i) {
                        if (mo56202f + i4 > i2) {
                            return 0;
                        }
                        return i4;
                    }
                }
            }
        }

        /* renamed from: f */
        public abstract int mo56202f(int i);

        /* renamed from: g */
        public void m66751g() {
            this.f55158b.clear();
        }

        /* renamed from: h */
        public void m66750h() {
            this.f55157a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f55146J = false;
        this.f55147K = -1;
        this.f55150R = new SparseIntArray();
        this.f55151S = new SparseIntArray();
        this.f55152T = new C11825a();
        this.f55153U = new Rect();
        m66761w3(RecyclerView.AbstractC11855p.m66561y0(context, attributeSet, i, i2).f55250b);
    }

    /* renamed from: h3 */
    public static int[] m66776h3(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 > 0 && i - i4 < i6) {
                i3 = i5 + 1;
                i4 -= i;
            } else {
                i3 = i5;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: A0 */
    public int mo66653A0(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        if (this.f55170t == 0) {
            return this.f55147K;
        }
        if (c11872z.m66490b() < 1) {
            return 0;
        }
        return m66768p3(c11866v, c11872z, c11872z.m66490b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: G */
    public boolean mo51876G(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f55186b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: I2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo66741I2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, LinearLayoutManager.C11830c c11830c, LinearLayoutManager.C11829b c11829b) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int mo66159f;
        int i11;
        int m66592e0;
        int i12;
        View m66685d;
        int mo66153l = this.f55172v.mo66153l();
        if (mo66153l != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (m66594d0() > 0) {
            i = this.f55148P[this.f55147K];
        } else {
            i = 0;
        }
        if (z) {
            m66759y3();
        }
        if (c11830c.f55193e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i13 = this.f55147K;
        if (!z2) {
            i13 = m66767q3(c11866v, c11872z, c11830c.f55192d) + m66766r3(c11866v, c11872z, c11830c.f55192d);
        }
        int i14 = 0;
        while (i14 < this.f55147K && c11830c.m66686c(c11872z) && i13 > 0) {
            int i15 = c11830c.f55192d;
            int m66766r3 = m66766r3(c11866v, c11872z, i15);
            if (m66766r3 <= this.f55147K) {
                i13 -= m66766r3;
                if (i13 < 0 || (m66685d = c11830c.m66685d(c11866v)) == null) {
                    break;
                }
                this.f55149Q[i14] = m66685d;
                i14++;
            } else {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + m66766r3 + " spans but GridLayoutManager has only " + this.f55147K + " spans.");
            }
        }
        m66779e3(c11866v, c11872z, i14, z2);
        float f = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f55149Q[i17];
            if (c11830c.f55200l == null) {
                if (z2) {
                    m66565x(view);
                } else {
                    m66562y(view, 0);
                }
            } else if (z2) {
                m66570v(view);
            } else {
                m66568w(view, 0);
            }
            m66645D(view, this.f55153U);
            m66763u3(view, mo66153l, false);
            int mo66160e = this.f55172v.mo66160e(view);
            if (mo66160e > i16) {
                i16 = mo66160e;
            }
            float mo66159f2 = (this.f55172v.mo66159f(view) * 1.0f) / ((LayoutParams) view.getLayoutParams()).f55156g;
            if (mo66159f2 > f) {
                f = mo66159f2;
            }
        }
        if (z) {
            m66764t3(f, i);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f55149Q[i18];
                m66763u3(view2, 1073741824, true);
                int mo66160e2 = this.f55172v.mo66160e(view2);
                if (mo66160e2 > i16) {
                    i16 = mo66160e2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f55149Q[i19];
            if (this.f55172v.mo66160e(view3) != i16) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f55210c;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int m66770n3 = m66770n3(layoutParams.f55155f, layoutParams.f55156g);
                if (this.f55170t == 1) {
                    i12 = RecyclerView.AbstractC11855p.m66592e0(m66770n3, 1073741824, i21, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    m66592e0 = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    m66592e0 = RecyclerView.AbstractC11855p.m66592e0(m66770n3, 1073741824, i20, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    i12 = makeMeasureSpec;
                }
                m66762v3(view3, i12, m66592e0, true);
            }
        }
        c11829b.f55185a = i16;
        if (this.f55170t == 1) {
            if (c11830c.f55194f == -1) {
                i7 = c11830c.f55190b;
                i11 = i7 - i16;
            } else {
                i11 = c11830c.f55190b;
                i7 = i11 + i16;
            }
            i5 = i11;
            i6 = 0;
            i4 = 0;
        } else {
            if (c11830c.f55194f == -1) {
                i3 = c11830c.f55190b;
                i2 = i3 - i16;
            } else {
                i2 = c11830c.f55190b;
                i3 = i2 + i16;
            }
            i4 = i2;
            i5 = 0;
            i6 = i3;
            i7 = 0;
        }
        int i22 = 0;
        while (i22 < i14) {
            View view4 = this.f55149Q[i22];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f55170t == 1) {
                if (m66743G2()) {
                    int paddingLeft = getPaddingLeft() + this.f55148P[this.f55147K - layoutParams2.f55155f];
                    mo66159f = i7;
                    i9 = paddingLeft;
                    i10 = paddingLeft - this.f55172v.mo66159f(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f55148P[layoutParams2.f55155f];
                    mo66159f = i7;
                    i10 = paddingLeft2;
                    i9 = this.f55172v.mo66159f(view4) + paddingLeft2;
                }
                i8 = i5;
            } else {
                int paddingTop = getPaddingTop() + this.f55148P[layoutParams2.f55155f];
                i8 = paddingTop;
                i9 = i6;
                i10 = i4;
                mo66159f = this.f55172v.mo66159f(view4) + paddingTop;
            }
            m66619Q0(view4, i10, i8, i9, mo66159f);
            if (layoutParams2.m66674c() || layoutParams2.m66675b()) {
                c11829b.f55187c = true;
            }
            c11829b.f55188d |= view4.hasFocusable();
            i22++;
            i7 = mo66159f;
            i6 = i9;
            i4 = i10;
            i5 = i8;
        }
        Arrays.fill(this.f55149Q, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: K2 */
    public void mo66739K2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, LinearLayoutManager.C11828a c11828a, int i) {
        super.mo66739K2(c11866v, c11872z, c11828a, i);
        m66759y3();
        if (c11872z.m66490b() > 0 && !c11872z.m66487e()) {
            m66772l3(c11866v, c11872z, c11828a, i);
        }
        m66771m3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: L */
    public int mo51868L(RecyclerView.C11872z c11872z) {
        if (this.f55154W) {
            return m66774j3(c11872z);
        }
        return super.mo51868L(c11872z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: M */
    public int mo51866M(RecyclerView.C11872z c11872z) {
        if (this.f55154W) {
            return m66773k3(c11872z);
        }
        return super.mo51866M(c11872z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: O */
    public int mo51861O(RecyclerView.C11872z c11872z) {
        if (this.f55154W) {
            return m66774j3(c11872z);
        }
        return super.mo51861O(c11872z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: O1 */
    public int mo51860O1(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        m66759y3();
        m66771m3();
        return super.mo51860O1(i, c11866v, c11872z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: P */
    public int mo51858P(RecyclerView.C11872z c11872z) {
        if (this.f55154W) {
            return m66773k3(c11872z);
        }
        return super.mo51858P(c11872z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Q1 */
    public int mo51855Q1(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        m66759y3();
        m66771m3();
        return super.mo51855Q1(i, c11866v, c11872z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: U1 */
    public void mo66460U1(Rect rect, int i, int i2) {
        int m66636H;
        int m66636H2;
        if (this.f55148P == null) {
            super.mo66460U1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f55170t == 1) {
            m66636H2 = RecyclerView.AbstractC11855p.m66636H(i2, rect.height() + paddingTop, m66569v0());
            int[] iArr = this.f55148P;
            m66636H = RecyclerView.AbstractC11855p.m66636H(i, iArr[iArr.length - 1] + paddingLeft, m66567w0());
        } else {
            m66636H = RecyclerView.AbstractC11855p.m66636H(i, rect.width() + paddingLeft, m66567w0());
            int[] iArr2 = this.f55148P;
            m66636H2 = RecyclerView.AbstractC11855p.m66636H(i2, iArr2[iArr2.length - 1] + paddingTop, m66569v0());
        }
        m66611T1(m66636H, m66636H2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: V2 */
    public void mo66728V2(boolean z) {
        if (!z) {
            super.mo66728V2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: X */
    public RecyclerView.LayoutParams mo51846X() {
        if (this.f55170t == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Y */
    public RecyclerView.LayoutParams mo51842Y(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Z */
    public RecyclerView.LayoutParams mo66454Z(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == r11) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo66452a1(View view, int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        boolean z;
        boolean z2;
        int m66594d0;
        int i2;
        int i3;
        boolean z3;
        View view2;
        View view3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        RecyclerView.C11866v c11866v2 = c11866v;
        RecyclerView.C11872z c11872z2 = c11872z;
        View m66609V = m66609V(view);
        View view4 = null;
        if (m66609V == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) m66609V.getLayoutParams();
        int i8 = layoutParams.f55155f;
        int i9 = layoutParams.f55156g + i8;
        if (super.mo66452a1(view, i, c11866v, c11872z) == null) {
            return null;
        }
        if (m66715j2(i) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f55175y) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i3 = m66594d0() - 1;
            m66594d0 = -1;
            i2 = -1;
        } else {
            m66594d0 = m66594d0();
            i2 = 1;
            i3 = 0;
        }
        if (this.f55170t == 1 && m66743G2()) {
            z3 = true;
        } else {
            z3 = false;
        }
        int m66768p3 = m66768p3(c11866v2, c11872z2, i3);
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = i3;
        View view5 = null;
        while (i14 != m66594d0) {
            int m66768p32 = m66768p3(c11866v2, c11872z2, i14);
            View m66597c0 = m66597c0(i14);
            if (m66597c0 == m66609V) {
                break;
            }
            if (m66597c0.hasFocusable() && m66768p32 != m66768p3) {
                if (view4 != null) {
                    break;
                }
                view2 = m66609V;
                view3 = view5;
                i4 = i12;
                i5 = m66594d0;
                i7 = i11;
                i6 = i13;
            } else {
                LayoutParams layoutParams2 = (LayoutParams) m66597c0.getLayoutParams();
                int i15 = layoutParams2.f55155f;
                view2 = m66609V;
                int i16 = layoutParams2.f55156g + i15;
                if (m66597c0.hasFocusable() && i15 == i8 && i16 == i9) {
                    return m66597c0;
                }
                if ((m66597c0.hasFocusable() && view4 == null) || (!m66597c0.hasFocusable() && view5 == null)) {
                    view3 = view5;
                } else {
                    view3 = view5;
                    int min = Math.min(i16, i9) - Math.max(i15, i8);
                    if (m66597c0.hasFocusable()) {
                        if (min <= i12) {
                            if (min == i12) {
                                if (i15 > i10) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i12;
                        i5 = m66594d0;
                        z4 = true;
                        if (m66621P0(m66597c0, false, true)) {
                            i6 = i13;
                            if (min > i6) {
                                i7 = i11;
                                if (z4) {
                                    if (m66597c0.hasFocusable()) {
                                        i10 = layoutParams2.f55155f;
                                        i11 = i7;
                                        i13 = i6;
                                        view5 = view3;
                                        view4 = m66597c0;
                                        i12 = Math.min(i16, i9) - Math.max(i15, i8);
                                    } else {
                                        int i17 = layoutParams2.f55155f;
                                        i13 = Math.min(i16, i9) - Math.max(i15, i8);
                                        i11 = i17;
                                        i12 = i4;
                                        view5 = m66597c0;
                                    }
                                    i14 += i2;
                                    c11866v2 = c11866v;
                                    c11872z2 = c11872z;
                                    m66609V = view2;
                                    m66594d0 = i5;
                                }
                            } else {
                                if (min == i6) {
                                    i7 = i11;
                                    if (i15 <= i7) {
                                        z4 = false;
                                    }
                                } else {
                                    i7 = i11;
                                }
                                z4 = false;
                                if (z4) {
                                }
                            }
                        }
                        i7 = i11;
                        i6 = i13;
                        z4 = false;
                        if (z4) {
                        }
                    }
                    i4 = i12;
                    i5 = m66594d0;
                    i7 = i11;
                    i6 = i13;
                    z4 = false;
                    if (z4) {
                    }
                }
                i4 = i12;
                i5 = m66594d0;
                i7 = i11;
                i6 = i13;
                z4 = true;
                if (z4) {
                }
            }
            i11 = i7;
            i13 = i6;
            i12 = i4;
            view5 = view3;
            i14 += i2;
            c11866v2 = c11866v;
            c11872z2 = c11872z;
            m66609V = view2;
            m66594d0 = i5;
        }
        View view6 = view5;
        if (view4 == null) {
            return view6;
        }
        return view4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: d2 */
    public boolean mo66447d2() {
        return this.f55165E == null && !this.f55146J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: e1 */
    public void mo65670e1(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, C27125p2 c27125p2) {
        super.mo65670e1(c11866v, c11872z, c27125p2);
        c27125p2.m20080f0(GridView.class.getName());
    }

    /* renamed from: e3 */
    public final void m66779e3(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.f55149Q[i2];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int m66766r3 = m66766r3(c11866v, c11872z, m66564x0(view));
            layoutParams.f55156g = m66766r3;
            layoutParams.f55155f = i5;
            i5 += m66766r3;
            i2 += i4;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: f2 */
    public void mo66719f2(RecyclerView.C11872z c11872z, LinearLayoutManager.C11830c c11830c, RecyclerView.AbstractC11855p.InterfaceC11858c interfaceC11858c) {
        int i = this.f55147K;
        for (int i2 = 0; i2 < this.f55147K && c11830c.m66686c(c11872z) && i > 0; i2++) {
            int i3 = c11830c.f55192d;
            interfaceC11858c.mo66216a(i3, Math.max(0, c11830c.f55195g));
            i -= this.f55152T.mo56202f(i3);
            c11830c.f55192d += c11830c.f55193e;
        }
    }

    /* renamed from: f3 */
    public final void m66778f3() {
        int m66594d0 = m66594d0();
        for (int i = 0; i < m66594d0; i++) {
            LayoutParams layoutParams = (LayoutParams) m66597c0(i).getLayoutParams();
            int m66676a = layoutParams.m66676a();
            this.f55150R.put(m66676a, layoutParams.m66757g());
            this.f55151S.put(m66676a, layoutParams.m66758e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: g1 */
    public void mo65669g1(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, View view, C27125p2 c27125p2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.m66590f1(view, c27125p2);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int m66768p3 = m66768p3(c11866v, c11872z, layoutParams2.m66676a());
        if (this.f55170t == 0) {
            c27125p2.m20074i0(C27125p2.C27128c.m20033a(layoutParams2.m66758e(), layoutParams2.m66757g(), m66768p3, 1, false, false));
        } else {
            c27125p2.m20074i0(C27125p2.C27128c.m20033a(m66768p3, 1, layoutParams2.m66758e(), layoutParams2.m66757g(), false, false));
        }
    }

    /* renamed from: g3 */
    public final void m66777g3(int i) {
        this.f55148P = m66776h3(this.f55148P, this.f55147K, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: h0 */
    public int mo66588h0(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        if (this.f55170t == 1) {
            return this.f55147K;
        }
        if (c11872z.m66490b() < 1) {
            return 0;
        }
        return m66768p3(c11866v, c11872z, c11872z.m66490b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: i1 */
    public void mo51816i1(RecyclerView recyclerView, int i, int i2) {
        this.f55152T.m66750h();
        this.f55152T.m66751g();
    }

    /* renamed from: i3 */
    public final void m66775i3() {
        this.f55150R.clear();
        this.f55151S.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: j1 */
    public void mo66435j1(RecyclerView recyclerView) {
        this.f55152T.m66750h();
        this.f55152T.m66751g();
    }

    /* renamed from: j3 */
    public final int m66774j3(RecyclerView.C11872z c11872z) {
        int max;
        if (m66594d0() != 0 && c11872z.m66490b() != 0) {
            m66713l2();
            boolean m66742H2 = m66742H2();
            View m66708q2 = m66708q2(!m66742H2, true);
            View m66709p2 = m66709p2(!m66742H2, true);
            if (m66708q2 != null && m66709p2 != null) {
                int m66755b = this.f55152T.m66755b(m66564x0(m66708q2), this.f55147K);
                int m66755b2 = this.f55152T.m66755b(m66564x0(m66709p2), this.f55147K);
                int min = Math.min(m66755b, m66755b2);
                int max2 = Math.max(m66755b, m66755b2);
                int m66755b3 = this.f55152T.m66755b(c11872z.m66490b() - 1, this.f55147K) + 1;
                if (this.f55175y) {
                    max = Math.max(0, (m66755b3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!m66742H2) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.f55172v.mo66161d(m66709p2) - this.f55172v.mo66158g(m66708q2)) / ((this.f55152T.m66755b(m66564x0(m66709p2), this.f55147K) - this.f55152T.m66755b(m66564x0(m66708q2), this.f55147K)) + 1))) + (this.f55172v.mo66152m() - this.f55172v.mo66158g(m66708q2)));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: k1 */
    public void mo51810k1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f55152T.m66750h();
        this.f55152T.m66751g();
    }

    /* renamed from: k3 */
    public final int m66773k3(RecyclerView.C11872z c11872z) {
        if (m66594d0() != 0 && c11872z.m66490b() != 0) {
            m66713l2();
            View m66708q2 = m66708q2(!m66742H2(), true);
            View m66709p2 = m66709p2(!m66742H2(), true);
            if (m66708q2 != null && m66709p2 != null) {
                if (!m66742H2()) {
                    return this.f55152T.m66755b(c11872z.m66490b() - 1, this.f55147K) + 1;
                }
                int mo66161d = this.f55172v.mo66161d(m66709p2) - this.f55172v.mo66158g(m66708q2);
                int m66755b = this.f55152T.m66755b(m66564x0(m66708q2), this.f55147K);
                return (int) ((mo66161d / ((this.f55152T.m66755b(m66564x0(m66709p2), this.f55147K) - m66755b) + 1)) * (this.f55152T.m66755b(c11872z.m66490b() - 1, this.f55147K) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: l1 */
    public void mo51807l1(RecyclerView recyclerView, int i, int i2) {
        this.f55152T.m66750h();
        this.f55152T.m66751g();
    }

    /* renamed from: l3 */
    public final void m66772l3(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, LinearLayoutManager.C11828a c11828a, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int m66767q3 = m66767q3(c11866v, c11872z, c11828a.f55181b);
        if (z) {
            while (m66767q3 > 0) {
                int i2 = c11828a.f55181b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    c11828a.f55181b = i3;
                    m66767q3 = m66767q3(c11866v, c11872z, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int m66490b = c11872z.m66490b() - 1;
        int i4 = c11828a.f55181b;
        while (i4 < m66490b) {
            int i5 = i4 + 1;
            int m66767q32 = m66767q3(c11866v, c11872z, i5);
            if (m66767q32 <= m66767q3) {
                break;
            }
            i4 = i5;
            m66767q3 = m66767q32;
        }
        c11828a.f55181b = i4;
    }

    /* renamed from: m3 */
    public final void m66771m3() {
        View[] viewArr = this.f55149Q;
        if (viewArr == null || viewArr.length != this.f55147K) {
            this.f55149Q = new View[this.f55147K];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: n1 */
    public void mo51801n1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f55152T.m66750h();
        this.f55152T.m66751g();
    }

    /* renamed from: n3 */
    public int m66770n3(int i, int i2) {
        if (this.f55170t == 1 && m66743G2()) {
            int[] iArr = this.f55148P;
            int i3 = this.f55147K;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f55148P;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: o1 */
    public void mo51798o1(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        if (c11872z.m66487e()) {
            m66778f3();
        }
        super.mo51798o1(c11866v, c11872z);
        m66775i3();
    }

    /* renamed from: o3 */
    public int m66769o3() {
        return this.f55147K;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: p1 */
    public void mo51795p1(RecyclerView.C11872z c11872z) {
        super.mo51795p1(c11872z);
        this.f55146J = false;
    }

    /* renamed from: p3 */
    public final int m66768p3(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, int i) {
        if (!c11872z.m66487e()) {
            return this.f55152T.m66755b(i, this.f55147K);
        }
        int m66519f = c11866v.m66519f(i);
        if (m66519f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.f55152T.m66755b(m66519f, this.f55147K);
    }

    /* renamed from: q3 */
    public final int m66767q3(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, int i) {
        if (!c11872z.m66487e()) {
            return this.f55152T.m66754c(i, this.f55147K);
        }
        int i2 = this.f55151S.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m66519f = c11866v.m66519f(i);
        if (m66519f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.f55152T.m66754c(m66519f, this.f55147K);
    }

    /* renamed from: r3 */
    public final int m66766r3(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, int i) {
        if (!c11872z.m66487e()) {
            return this.f55152T.mo56202f(i);
        }
        int i2 = this.f55150R.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m66519f = c11866v.m66519f(i);
        if (m66519f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.f55152T.mo56202f(m66519f);
    }

    /* renamed from: s3 */
    public AbstractC11826b m66765s3() {
        return this.f55152T;
    }

    /* renamed from: t3 */
    public final void m66764t3(float f, int i) {
        m66777g3(Math.max(Math.round(f * this.f55147K), i));
    }

    /* renamed from: u3 */
    public final void m66763u3(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f55210c;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int m66770n3 = m66770n3(layoutParams.f55155f, layoutParams.f55156g);
        if (this.f55170t == 1) {
            i3 = RecyclerView.AbstractC11855p.m66592e0(m66770n3, i, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i2 = RecyclerView.AbstractC11855p.m66592e0(this.f55172v.mo66151n(), m66576r0(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int m66592e0 = RecyclerView.AbstractC11855p.m66592e0(m66770n3, i, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int m66592e02 = RecyclerView.AbstractC11855p.m66592e0(this.f55172v.mo66151n(), m66640F0(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i2 = m66592e0;
            i3 = m66592e02;
        }
        m66762v3(view, i3, i2, z);
    }

    /* renamed from: v3 */
    public final void m66762v3(View view, int i, int i2, boolean z) {
        boolean m66604X1;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            m66604X1 = m66601Z1(view, i, i2, layoutParams);
        } else {
            m66604X1 = m66604X1(view, i, i2, layoutParams);
        }
        if (m66604X1) {
            view.measure(i, i2);
        }
    }

    /* renamed from: w3 */
    public void m66761w3(int i) {
        if (i == this.f55147K) {
            return;
        }
        this.f55146J = true;
        if (i >= 1) {
            this.f55147K = i;
            this.f55152T.m66750h();
            m66627L1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    /* renamed from: x3 */
    public void m66760x3(AbstractC11826b abstractC11826b) {
        this.f55152T = abstractC11826b;
    }

    /* renamed from: y3 */
    public final void m66759y3() {
        int m66578q0;
        int paddingTop;
        if (m66744F2() == 1) {
            m66578q0 = m66642E0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            m66578q0 = m66578q0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m66777g3(m66578q0 - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: z2 */
    public View mo66699z2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, boolean z, boolean z2) {
        int i;
        int i2;
        int m66594d0 = m66594d0();
        int i3 = 1;
        if (z2) {
            i2 = m66594d0() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = m66594d0;
            i2 = 0;
        }
        int m66490b = c11872z.m66490b();
        m66713l2();
        int mo66152m = this.f55172v.mo66152m();
        int mo66156i = this.f55172v.mo66156i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View m66597c0 = m66597c0(i2);
            int m66564x0 = m66564x0(m66597c0);
            if (m66564x0 >= 0 && m66564x0 < m66490b && m66767q3(c11866v, c11872z, m66564x0) == 0) {
                if (((RecyclerView.LayoutParams) m66597c0.getLayoutParams()).m66674c()) {
                    if (view2 == null) {
                        view2 = m66597c0;
                    }
                } else if (this.f55172v.mo66158g(m66597c0) < mo66156i && this.f55172v.mo66161d(m66597c0) >= mo66152m) {
                    return m66597c0;
                } else {
                    if (view == null) {
                        view = m66597c0;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: f */
        public int f55155f;

        /* renamed from: g */
        public int f55156g;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f55155f = -1;
            this.f55156g = 0;
        }

        /* renamed from: e */
        public int m66758e() {
            return this.f55155f;
        }

        /* renamed from: g */
        public int m66757g() {
            return this.f55156g;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f55155f = -1;
            this.f55156g = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f55155f = -1;
            this.f55156g = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f55155f = -1;
            this.f55156g = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f55146J = false;
        this.f55147K = -1;
        this.f55150R = new SparseIntArray();
        this.f55151S = new SparseIntArray();
        this.f55152T = new C11825a();
        this.f55153U = new Rect();
        m66761w3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f55146J = false;
        this.f55147K = -1;
        this.f55150R = new SparseIntArray();
        this.f55151S = new SparseIntArray();
        this.f55152T = new C11825a();
        this.f55153U = new Rect();
        m66761w3(i);
    }
}
