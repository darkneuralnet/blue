package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.C17467b;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
/* loaded from: classes5.dex */
public class FlexboxLayout extends ViewGroup implements InterfaceC36681Vr1 {

    /* renamed from: b */
    public int f70176b;

    /* renamed from: c */
    public int f70177c;

    /* renamed from: d */
    public int f70178d;

    /* renamed from: e */
    public int f70179e;

    /* renamed from: f */
    public int f70180f;

    /* renamed from: g */
    public int f70181g;

    /* renamed from: h */
    public Drawable f70182h;

    /* renamed from: i */
    public Drawable f70183i;

    /* renamed from: j */
    public int f70184j;

    /* renamed from: k */
    public int f70185k;

    /* renamed from: l */
    public int f70186l;

    /* renamed from: m */
    public int f70187m;

    /* renamed from: n */
    public int[] f70188n;

    /* renamed from: o */
    public SparseIntArray f70189o;

    /* renamed from: p */
    public C17467b f70190p;

    /* renamed from: q */
    public List<C17466a> f70191q;

    /* renamed from: r */
    public C17467b.C17469b f70192r;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public View m51903A(int i) {
        if (i >= 0) {
            int[] iArr = this.f70188n;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
            return null;
        }
        return null;
    }

    /* renamed from: B */
    public final boolean m51902B(int i, int i2) {
        if (m51892q(i, i2)) {
            if (mo51785u()) {
                if ((this.f70185k & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.f70184j & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (mo51785u()) {
            if ((this.f70185k & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f70184j & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: C */
    public final boolean m51901C(int i) {
        if (i < 0 || i >= this.f70191q.size()) {
            return false;
        }
        if (m51893a(i)) {
            if (mo51785u()) {
                if ((this.f70184j & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.f70185k & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (mo51785u()) {
            if ((this.f70184j & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f70185k & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: D */
    public final boolean m51900D(int i) {
        if (i < 0 || i >= this.f70191q.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f70191q.size(); i2++) {
            if (this.f70191q.get(i2).m51700c() > 0) {
                return false;
            }
        }
        if (mo51785u()) {
            if ((this.f70184j & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f70185k & 4) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m51899E(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        int i6;
        int i7;
        int i8;
        char c;
        float f4;
        int i9;
        char c2;
        int i10;
        LayoutParams layoutParams;
        float f5;
        int m51700c;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f70191q.size();
        int i12 = 0;
        while (i12 < size) {
            C17466a c17466a = this.f70191q.get(i12);
            if (m51901C(i12)) {
                int i13 = this.f70186l;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = this.f70178d;
            char c3 = 4;
            int i15 = 1;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                if (i14 == 5) {
                                    if (c17466a.m51700c() != 0) {
                                        f3 = (i11 - c17466a.f70263e) / (m51700c + 1);
                                    } else {
                                        f3 = 0.0f;
                                    }
                                    f = paddingLeft + f3;
                                    f2 = (i11 - paddingRight) - f3;
                                } else {
                                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f70178d);
                                }
                            } else {
                                int m51700c2 = c17466a.m51700c();
                                if (m51700c2 != 0) {
                                    f3 = (i11 - c17466a.f70263e) / m51700c2;
                                } else {
                                    f3 = 0.0f;
                                }
                                float f6 = f3 / 2.0f;
                                f = paddingLeft + f6;
                                f2 = (i11 - paddingRight) - f6;
                            }
                        } else {
                            f = paddingLeft;
                            int m51700c3 = c17466a.m51700c();
                            if (m51700c3 != 1) {
                                f5 = m51700c3 - 1;
                            } else {
                                f5 = 1.0f;
                            }
                            f3 = (i11 - c17466a.f70263e) / f5;
                            f2 = i11 - paddingRight;
                        }
                        float max = Math.max(f3, 0.0f);
                        i5 = 0;
                        while (i5 < c17466a.f70266h) {
                            int i16 = c17466a.f70273o + i5;
                            View m51903A = m51903A(i16);
                            if (m51903A != null) {
                                if (m51903A.getVisibility() == 8) {
                                    i6 = paddingLeft;
                                    i7 = i15;
                                    i8 = i5;
                                    c = 4;
                                } else {
                                    LayoutParams layoutParams2 = (LayoutParams) m51903A.getLayoutParams();
                                    float f7 = f + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                                    float f8 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                                    if (m51902B(i16, i5)) {
                                        int i17 = this.f70187m;
                                        float f9 = i17;
                                        f7 += f9;
                                        i9 = i17;
                                        f4 = f8 - f9;
                                    } else {
                                        f4 = f8;
                                        i9 = 0;
                                    }
                                    if (i5 == c17466a.f70266h - i15) {
                                        c2 = 4;
                                        if ((this.f70185k & 4) > 0) {
                                            i10 = this.f70187m;
                                            if (this.f70177c != 2) {
                                                if (z) {
                                                    i7 = i15;
                                                    i8 = i5;
                                                    i6 = paddingLeft;
                                                    layoutParams = layoutParams2;
                                                    c = c2;
                                                    this.f70190p.m51682Q(m51903A, c17466a, Math.round(f4) - m51903A.getMeasuredWidth(), paddingBottom - m51903A.getMeasuredHeight(), Math.round(f4), paddingBottom);
                                                } else {
                                                    i6 = paddingLeft;
                                                    i7 = i15;
                                                    i8 = i5;
                                                    layoutParams = layoutParams2;
                                                    c = c2;
                                                    this.f70190p.m51682Q(m51903A, c17466a, Math.round(f7), paddingBottom - m51903A.getMeasuredHeight(), Math.round(f7) + m51903A.getMeasuredWidth(), paddingBottom);
                                                }
                                            } else {
                                                i6 = paddingLeft;
                                                i7 = i15;
                                                i8 = i5;
                                                layoutParams = layoutParams2;
                                                c = c2;
                                                if (z) {
                                                    this.f70190p.m51682Q(m51903A, c17466a, Math.round(f4) - m51903A.getMeasuredWidth(), paddingTop, Math.round(f4), paddingTop + m51903A.getMeasuredHeight());
                                                } else {
                                                    this.f70190p.m51682Q(m51903A, c17466a, Math.round(f7), paddingTop, Math.round(f7) + m51903A.getMeasuredWidth(), paddingTop + m51903A.getMeasuredHeight());
                                                }
                                            }
                                            f = f7 + m51903A.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                                            float measuredWidth = f4 - ((m51903A.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                                            if (!z) {
                                                c17466a.m51699d(m51903A, i10, 0, i9, 0);
                                            } else {
                                                c17466a.m51699d(m51903A, i9, 0, i10, 0);
                                            }
                                            f2 = measuredWidth;
                                        }
                                    } else {
                                        c2 = 4;
                                    }
                                    i10 = 0;
                                    if (this.f70177c != 2) {
                                    }
                                    f = f7 + m51903A.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                                    float measuredWidth2 = f4 - ((m51903A.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                                    if (!z) {
                                    }
                                    f2 = measuredWidth2;
                                }
                            } else {
                                i6 = paddingLeft;
                                i7 = i15;
                                i8 = i5;
                                c = c3;
                            }
                            i5 = i8 + 1;
                            paddingLeft = i6;
                            i15 = i7;
                            c3 = c;
                        }
                        int i18 = paddingLeft;
                        int i19 = c17466a.f70265g;
                        paddingTop += i19;
                        paddingBottom -= i19;
                        i12++;
                        paddingLeft = i18;
                    } else {
                        int i20 = c17466a.f70263e;
                        f = paddingLeft + ((i11 - i20) / 2.0f);
                        f2 = (i11 - paddingRight) - ((i11 - i20) / 2.0f);
                    }
                } else {
                    int i21 = c17466a.f70263e;
                    f2 = i21 - paddingLeft;
                    f = (i11 - i21) + paddingRight;
                }
            } else {
                f = paddingLeft;
                f2 = i11 - paddingRight;
            }
            f3 = 0.0f;
            float max2 = Math.max(f3, 0.0f);
            i5 = 0;
            while (i5 < c17466a.f70266h) {
            }
            int i182 = paddingLeft;
            int i192 = c17466a.f70265g;
            paddingTop += i192;
            paddingBottom -= i192;
            i12++;
            paddingLeft = i182;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m51898F(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        int i6;
        int i7;
        boolean z3;
        char c;
        float f4;
        float f5;
        int i8;
        char c2;
        int i9;
        LayoutParams layoutParams;
        int m51700c;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.f70191q.size();
        for (int i12 = 0; i12 < size; i12++) {
            C17466a c17466a = this.f70191q.get(i12);
            if (m51901C(i12)) {
                int i13 = this.f70187m;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = this.f70178d;
            char c3 = 4;
            boolean z4 = true;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                if (i14 == 5) {
                                    if (c17466a.m51700c() != 0) {
                                        f3 = (i10 - c17466a.f70263e) / (m51700c + 1);
                                    } else {
                                        f3 = 0.0f;
                                    }
                                    f = paddingTop + f3;
                                    f2 = (i10 - paddingBottom) - f3;
                                } else {
                                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f70178d);
                                }
                            } else {
                                int m51700c2 = c17466a.m51700c();
                                if (m51700c2 != 0) {
                                    f3 = (i10 - c17466a.f70263e) / m51700c2;
                                } else {
                                    f3 = 0.0f;
                                }
                                float f6 = f3 / 2.0f;
                                f = paddingTop + f6;
                                f2 = (i10 - paddingBottom) - f6;
                            }
                        } else {
                            f = paddingTop;
                            int m51700c3 = c17466a.m51700c();
                            f3 = (i10 - c17466a.f70263e) / (m51700c3 != 1 ? m51700c3 - 1 : 1.0f);
                            f2 = i10 - paddingBottom;
                        }
                        float max = Math.max(f3, 0.0f);
                        i6 = 0;
                        while (i6 < c17466a.f70266h) {
                            int i15 = c17466a.f70273o + i6;
                            View m51903A = m51903A(i15);
                            if (m51903A != null) {
                                if (m51903A.getVisibility() == 8) {
                                    i7 = i6;
                                    z3 = true;
                                    c = 4;
                                } else {
                                    LayoutParams layoutParams2 = (LayoutParams) m51903A.getLayoutParams();
                                    float f7 = f + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                                    float f8 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                                    if (m51902B(i15, i6)) {
                                        int i16 = this.f70186l;
                                        float f9 = i16;
                                        f4 = f7 + f9;
                                        i8 = i16;
                                        f5 = f8 - f9;
                                    } else {
                                        f4 = f7;
                                        f5 = f8;
                                        i8 = 0;
                                    }
                                    if (i6 == c17466a.f70266h - 1) {
                                        c2 = 4;
                                        if ((this.f70184j & 4) > 0) {
                                            i9 = this.f70186l;
                                            if (!z) {
                                                if (z2) {
                                                    i7 = i6;
                                                    z3 = true;
                                                    layoutParams = layoutParams2;
                                                    c = c2;
                                                    this.f70190p.m51681R(m51903A, c17466a, true, i11 - m51903A.getMeasuredWidth(), Math.round(f5) - m51903A.getMeasuredHeight(), i11, Math.round(f5));
                                                } else {
                                                    i7 = i6;
                                                    z3 = true;
                                                    layoutParams = layoutParams2;
                                                    c = c2;
                                                    this.f70190p.m51681R(m51903A, c17466a, true, i11 - m51903A.getMeasuredWidth(), Math.round(f4), i11, Math.round(f4) + m51903A.getMeasuredHeight());
                                                }
                                            } else {
                                                i7 = i6;
                                                z3 = true;
                                                layoutParams = layoutParams2;
                                                c = c2;
                                                if (z2) {
                                                    this.f70190p.m51681R(m51903A, c17466a, false, paddingLeft, Math.round(f5) - m51903A.getMeasuredHeight(), paddingLeft + m51903A.getMeasuredWidth(), Math.round(f5));
                                                } else {
                                                    this.f70190p.m51681R(m51903A, c17466a, false, paddingLeft, Math.round(f4), paddingLeft + m51903A.getMeasuredWidth(), Math.round(f4) + m51903A.getMeasuredHeight());
                                                }
                                            }
                                            LayoutParams layoutParams3 = layoutParams;
                                            float measuredHeight = f4 + m51903A.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                                            float measuredHeight2 = f5 - ((m51903A.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                                            if (!z2) {
                                                c17466a.m51699d(m51903A, 0, i9, 0, i8);
                                            } else {
                                                c17466a.m51699d(m51903A, 0, i8, 0, i9);
                                            }
                                            f = measuredHeight;
                                            f2 = measuredHeight2;
                                        }
                                    } else {
                                        c2 = 4;
                                    }
                                    i9 = 0;
                                    if (!z) {
                                    }
                                    LayoutParams layoutParams32 = layoutParams;
                                    float measuredHeight3 = f4 + m51903A.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) layoutParams32).bottomMargin;
                                    float measuredHeight22 = f5 - ((m51903A.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) layoutParams32).topMargin);
                                    if (!z2) {
                                    }
                                    f = measuredHeight3;
                                    f2 = measuredHeight22;
                                }
                            } else {
                                i7 = i6;
                                z3 = z4;
                                c = c3;
                            }
                            i6 = i7 + 1;
                            z4 = z3;
                            c3 = c;
                        }
                        int i17 = c17466a.f70265g;
                        paddingLeft += i17;
                        i11 -= i17;
                    } else {
                        int i18 = c17466a.f70263e;
                        f2 = (i10 - paddingBottom) - ((i10 - i18) / 2.0f);
                        f = paddingTop + ((i10 - i18) / 2.0f);
                        f3 = 0.0f;
                        float max2 = Math.max(f3, 0.0f);
                        i6 = 0;
                        while (i6 < c17466a.f70266h) {
                        }
                        int i172 = c17466a.f70265g;
                        paddingLeft += i172;
                        i11 -= i172;
                    }
                } else {
                    int i19 = c17466a.f70263e;
                    f = (i10 - i19) + paddingBottom;
                    i5 = i19 - paddingTop;
                }
            } else {
                f = paddingTop;
                i5 = i10 - paddingBottom;
            }
            f2 = i5;
            f3 = 0.0f;
            float max22 = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < c17466a.f70266h) {
            }
            int i1722 = c17466a.f70265g;
            paddingLeft += i1722;
            i11 -= i1722;
        }
    }

    /* renamed from: G */
    public final void m51897G(int i, int i2) {
        this.f70191q.clear();
        this.f70192r.m51646a();
        this.f70190p.m51670c(this.f70192r, i, i2);
        this.f70191q = this.f70192r.f70282a;
        this.f70190p.m51657p(i, i2);
        if (this.f70179e == 3) {
            for (C17466a c17466a : this.f70191q) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < c17466a.f70266h; i4++) {
                    View m51903A = m51903A(c17466a.f70273o + i4);
                    if (m51903A != null && m51903A.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) m51903A.getLayoutParams();
                        if (this.f70177c != 2) {
                            i3 = Math.max(i3, m51903A.getMeasuredHeight() + Math.max(c17466a.f70270l - m51903A.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        } else {
                            i3 = Math.max(i3, m51903A.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((c17466a.f70270l - m51903A.getMeasuredHeight()) + m51903A.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                }
                c17466a.f70265g = i3;
            }
        }
        this.f70190p.m51658o(i, i2, getPaddingTop() + getPaddingBottom());
        this.f70190p.m51675X();
        m51895I(this.f70176b, i, i2, this.f70192r.f70283b);
    }

    /* renamed from: H */
    public final void m51896H(int i, int i2) {
        this.f70191q.clear();
        this.f70192r.m51646a();
        this.f70190p.m51667f(this.f70192r, i, i2);
        this.f70191q = this.f70192r.f70282a;
        this.f70190p.m51657p(i, i2);
        this.f70190p.m51658o(i, i2, getPaddingLeft() + getPaddingRight());
        this.f70190p.m51675X();
        m51895I(this.f70176b, i, i2, this.f70192r.f70283b);
    }

    /* renamed from: I */
    public final void m51895I(int i, int i2, int i3, int i4) {
        int mo51788t;
        int mo51831d;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i);
            }
            mo51788t = mo51831d();
            mo51831d = mo51788t() + getPaddingLeft() + getPaddingRight();
        } else {
            mo51788t = mo51788t() + getPaddingTop() + getPaddingBottom();
            mo51831d = mo51831d();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < mo51831d) {
                        i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                } else {
                    throw new IllegalStateException("Unknown width mode is set: " + mode);
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(mo51831d, i2, i4);
            }
        } else {
            if (size < mo51831d) {
                i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = mo51831d;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < mo51788t) {
                        i4 = View.combineMeasuredStates(i4, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                } else {
                    throw new IllegalStateException("Unknown height mode is set: " + mode2);
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(mo51788t, i3, i4);
            }
        } else {
            if (size2 < mo51788t) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = mo51788t;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* renamed from: J */
    public final void m51894J() {
        if (this.f70182h == null && this.f70183i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* renamed from: a */
    public final boolean m51893a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f70191q.get(i2).m51700c() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f70189o == null) {
            this.f70189o = new SparseIntArray(getChildCount());
        }
        this.f70188n = this.f70190p.m51659n(view, i, layoutParams, this.f70189o);
        super.addView(view, i, layoutParams);
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: b */
    public void mo51835b(View view, int i, int i2, C17466a c17466a) {
        if (m51902B(i, i2)) {
            if (mo51785u()) {
                int i3 = c17466a.f70263e;
                int i4 = this.f70187m;
                c17466a.f70263e = i3 + i4;
                c17466a.f70264f += i4;
                return;
            }
            int i5 = c17466a.f70263e;
            int i6 = this.f70186l;
            c17466a.f70263e = i5 + i6;
            c17466a.f70264f += i6;
        }
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: c */
    public int mo51833c() {
        return this.f70176b;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: d */
    public int mo51831d() {
        int i = Integer.MIN_VALUE;
        for (C17466a c17466a : this.f70191q) {
            i = Math.max(i, c17466a.f70263e);
        }
        return i;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: e */
    public View mo51829e(int i) {
        return getChildAt(i);
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: f */
    public List<C17466a> mo51826f() {
        return this.f70191q;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: g */
    public int mo51823g(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: h */
    public int mo51820h() {
        return this.f70180f;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: i */
    public int mo51817i(View view) {
        return 0;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: j */
    public int mo51813j() {
        return this.f70177c;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: k */
    public View mo51811k(int i) {
        return m51903A(i);
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: l */
    public int mo51808l() {
        return this.f70179e;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: m */
    public int mo51805m(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo51785u()) {
            if (m51902B(i, i2)) {
                i4 = 0 + this.f70187m;
            }
            if ((this.f70185k & 4) > 0) {
                i3 = this.f70187m;
            } else {
                return i4;
            }
        } else {
            if (m51902B(i, i2)) {
                i4 = 0 + this.f70186l;
            }
            if ((this.f70184j & 4) > 0) {
                i3 = this.f70186l;
            } else {
                return i4;
            }
        }
        return i4 + i3;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: n */
    public int mo51802n() {
        return getChildCount();
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: o */
    public int mo51799o() {
        return this.f70181g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f70183i == null && this.f70182h == null) {
            return;
        }
        if (this.f70184j == 0 && this.f70185k == 0) {
            return;
        }
        int m62548D = C38790bq6.m62548D(this);
        int i = this.f70176b;
        boolean z3 = false;
        boolean z4 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (m62548D == 1) {
                            z3 = true;
                        }
                        if (this.f70177c == 2) {
                            z3 = !z3;
                        }
                        m51890w(canvas, z3, true);
                        return;
                    }
                    return;
                }
                if (m62548D != 1) {
                    z4 = false;
                }
                if (this.f70177c == 2) {
                    z4 = !z4;
                }
                m51890w(canvas, z4, false);
                return;
            }
            if (m62548D != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f70177c == 2) {
                z3 = true;
            }
            m51891v(canvas, z2, z3);
            return;
        }
        if (m62548D == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f70177c == 2) {
            z3 = true;
        }
        m51891v(canvas, z, z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int m62548D = C38790bq6.m62548D(this);
        int i5 = this.f70176b;
        boolean z6 = false;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (m62548D == 1) {
                            z6 = true;
                        }
                        if (this.f70177c == 2) {
                            z5 = !z6;
                        } else {
                            z5 = z6;
                        }
                        m51898F(z5, true, i, i2, i3, i4);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.f70176b);
                }
                if (m62548D == 1) {
                    z6 = true;
                }
                if (this.f70177c == 2) {
                    z4 = !z6;
                } else {
                    z4 = z6;
                }
                m51898F(z4, false, i, i2, i3, i4);
                return;
            }
            if (m62548D != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            m51899E(z3, i, i2, i3, i4);
            return;
        }
        if (m62548D == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        m51899E(z2, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f70189o == null) {
            this.f70189o = new SparseIntArray(getChildCount());
        }
        if (this.f70190p.m51684O(this.f70189o)) {
            this.f70188n = this.f70190p.m51660m(this.f70189o);
        }
        int i3 = this.f70176b;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f70176b);
            }
            m51896H(i, i2);
            return;
        }
        m51897G(i, i2);
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: p */
    public int mo51796p(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: q */
    public final boolean m51892q(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View m51903A = m51903A(i - i3);
            if (m51903A != null && m51903A.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: r */
    public void mo51792r(C17466a c17466a) {
        if (mo51785u()) {
            if ((this.f70185k & 4) > 0) {
                int i = c17466a.f70263e;
                int i2 = this.f70187m;
                c17466a.f70263e = i + i2;
                c17466a.f70264f += i2;
            }
        } else if ((this.f70184j & 4) > 0) {
            int i3 = c17466a.f70263e;
            int i4 = this.f70186l;
            c17466a.f70263e = i3 + i4;
            c17466a.f70264f += i4;
        }
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: s */
    public void mo51790s(int i, View view) {
    }

    public void setAlignContent(int i) {
        if (this.f70180f != i) {
            this.f70180f = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f70179e != i) {
            this.f70179e = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f70182h) {
            return;
        }
        this.f70182h = drawable;
        if (drawable != null) {
            this.f70186l = drawable.getIntrinsicHeight();
        } else {
            this.f70186l = 0;
        }
        m51894J();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f70183i) {
            return;
        }
        this.f70183i = drawable;
        if (drawable != null) {
            this.f70187m = drawable.getIntrinsicWidth();
        } else {
            this.f70187m = 0;
        }
        m51894J();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f70176b != i) {
            this.f70176b = i;
            requestLayout();
        }
    }

    @Override // p000.InterfaceC36681Vr1
    public void setFlexLines(List<C17466a> list) {
        this.f70191q = list;
    }

    public void setFlexWrap(int i) {
        if (this.f70177c != i) {
            this.f70177c = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f70178d != i) {
            this.f70178d = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f70181g != i) {
            this.f70181g = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f70184j) {
            this.f70184j = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f70185k) {
            this.f70185k = i;
            requestLayout();
        }
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: t */
    public int mo51788t() {
        int i;
        int i2;
        int size = this.f70191q.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C17466a c17466a = this.f70191q.get(i4);
            if (m51901C(i4)) {
                if (mo51785u()) {
                    i2 = this.f70186l;
                } else {
                    i2 = this.f70187m;
                }
                i3 += i2;
            }
            if (m51900D(i4)) {
                if (mo51785u()) {
                    i = this.f70186l;
                } else {
                    i = this.f70187m;
                }
                i3 += i;
            }
            i3 += c17466a.f70265g;
        }
        return i3;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: u */
    public boolean mo51785u() {
        int i = this.f70176b;
        return i == 0 || i == 1;
    }

    /* renamed from: v */
    public final void m51891v(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f70191q.size();
        for (int i3 = 0; i3 < size; i3++) {
            C17466a c17466a = this.f70191q.get(i3);
            for (int i4 = 0; i4 < c17466a.f70266h; i4++) {
                int i5 = c17466a.f70273o + i4;
                View m51903A = m51903A(i5);
                if (m51903A != null && m51903A.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) m51903A.getLayoutParams();
                    if (m51902B(i5, i4)) {
                        if (z) {
                            left = m51903A.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        } else {
                            left = (m51903A.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f70187m;
                        }
                        m51888y(canvas, left, c17466a.f70260b, c17466a.f70265g);
                    }
                    if (i4 == c17466a.f70266h - 1 && (this.f70185k & 4) > 0) {
                        if (z) {
                            right = (m51903A.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f70187m;
                        } else {
                            right = m51903A.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                        m51888y(canvas, right, c17466a.f70260b, c17466a.f70265g);
                    }
                }
            }
            if (m51901C(i3)) {
                if (z2) {
                    i2 = c17466a.f70262d;
                } else {
                    i2 = c17466a.f70260b - this.f70186l;
                }
                m51889x(canvas, paddingLeft, i2, max);
            }
            if (m51900D(i3) && (this.f70184j & 4) > 0) {
                if (z2) {
                    i = c17466a.f70260b - this.f70186l;
                } else {
                    i = c17466a.f70262d;
                }
                m51889x(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: w */
    public final void m51890w(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f70191q.size();
        for (int i3 = 0; i3 < size; i3++) {
            C17466a c17466a = this.f70191q.get(i3);
            for (int i4 = 0; i4 < c17466a.f70266h; i4++) {
                int i5 = c17466a.f70273o + i4;
                View m51903A = m51903A(i5);
                if (m51903A != null && m51903A.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) m51903A.getLayoutParams();
                    if (m51902B(i5, i4)) {
                        if (z2) {
                            top = m51903A.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        } else {
                            top = (m51903A.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f70186l;
                        }
                        m51889x(canvas, c17466a.f70259a, top, c17466a.f70265g);
                    }
                    if (i4 == c17466a.f70266h - 1 && (this.f70184j & 4) > 0) {
                        if (z2) {
                            bottom = (m51903A.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f70186l;
                        } else {
                            bottom = m51903A.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        m51889x(canvas, c17466a.f70259a, bottom, c17466a.f70265g);
                    }
                }
            }
            if (m51901C(i3)) {
                if (z) {
                    i2 = c17466a.f70261c;
                } else {
                    i2 = c17466a.f70259a - this.f70187m;
                }
                m51888y(canvas, i2, paddingTop, max);
            }
            if (m51900D(i3) && (this.f70185k & 4) > 0) {
                if (z) {
                    i = c17466a.f70259a - this.f70187m;
                } else {
                    i = c17466a.f70261c;
                }
                m51888y(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: x */
    public final void m51889x(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f70182h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f70186l + i2);
        this.f70182h.draw(canvas);
    }

    /* renamed from: y */
    public final void m51888y(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f70183i;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f70187m + i, i3 + i2);
        this.f70183i.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: z */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70181g = -1;
        this.f70190p = new C17467b(this);
        this.f70191q = new ArrayList();
        this.f70192r = new C17467b.C17469b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35928Sl4.FlexboxLayout, i, 0);
        this.f70176b = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_flexDirection, 0);
        this.f70177c = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_flexWrap, 0);
        this.f70178d = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_justifyContent, 0);
        this.f70179e = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_alignItems, 0);
        this.f70180f = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_alignContent, 0);
        this.f70181g = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(C35928Sl4.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(C35928Sl4.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C35928Sl4.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f70185k = i2;
            this.f70184j = i2;
        }
        int i3 = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f70185k = i3;
        }
        int i4 = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f70184j = i4;
        }
        obtainStyledAttributes.recycle();
    }

    /* loaded from: classes5.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C17460a();

        /* renamed from: b */
        public int f70193b;

        /* renamed from: c */
        public float f70194c;

        /* renamed from: d */
        public float f70195d;

        /* renamed from: e */
        public int f70196e;

        /* renamed from: f */
        public float f70197f;

        /* renamed from: g */
        public int f70198g;

        /* renamed from: h */
        public int f70199h;

        /* renamed from: i */
        public int f70200i;

        /* renamed from: j */
        public int f70201j;

        /* renamed from: k */
        public boolean f70202k;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$a */
        /* loaded from: classes5.dex */
        public class C17460a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f70193b = 1;
            this.f70194c = 0.0f;
            this.f70195d = 1.0f;
            this.f70196e = -1;
            this.f70197f = -1.0f;
            this.f70198g = -1;
            this.f70199h = -1;
            this.f70200i = 16777215;
            this.f70201j = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35928Sl4.FlexboxLayout_Layout);
            this.f70193b = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_Layout_layout_order, 1);
            this.f70194c = obtainStyledAttributes.getFloat(C35928Sl4.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f70195d = obtainStyledAttributes.getFloat(C35928Sl4.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f70196e = obtainStyledAttributes.getInt(C35928Sl4.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f70197f = obtainStyledAttributes.getFraction(C35928Sl4.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f70198g = obtainStyledAttributes.getDimensionPixelSize(C35928Sl4.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f70199h = obtainStyledAttributes.getDimensionPixelSize(C35928Sl4.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f70200i = obtainStyledAttributes.getDimensionPixelSize(C35928Sl4.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f70201j = obtainStyledAttributes.getDimensionPixelSize(C35928Sl4.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f70202k = obtainStyledAttributes.getBoolean(C35928Sl4.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: N1 */
        public int mo51777N1() {
            return this.f70196e;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: P1 */
        public float mo51776P1() {
            return this.f70195d;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: U2 */
        public void mo51775U2(int i) {
            this.f70198g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: V0 */
        public int mo51774V0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: W2 */
        public int mo51773W2() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: f */
        public int mo51772f() {
            return this.f70198g;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: f0 */
        public int mo51771f0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: g2 */
        public void mo51770g2(int i) {
            this.f70199h = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.f70201j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.f70200i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f70193b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: i2 */
        public float mo51769i2() {
            return this.f70194c;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: m2 */
        public float mo51768m2() {
            return this.f70197f;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: n3 */
        public int mo51767n3() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: o3 */
        public int mo51766o3() {
            return this.f70199h;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: v2 */
        public boolean mo51765v2() {
            return this.f70202k;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f70193b);
            parcel.writeFloat(this.f70194c);
            parcel.writeFloat(this.f70195d);
            parcel.writeInt(this.f70196e);
            parcel.writeFloat(this.f70197f);
            parcel.writeInt(this.f70198g);
            parcel.writeInt(this.f70199h);
            parcel.writeInt(this.f70200i);
            parcel.writeInt(this.f70201j);
            parcel.writeByte(this.f70202k ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f70193b = 1;
            this.f70194c = 0.0f;
            this.f70195d = 1.0f;
            this.f70196e = -1;
            this.f70197f = -1.0f;
            this.f70198g = -1;
            this.f70199h = -1;
            this.f70200i = 16777215;
            this.f70201j = 16777215;
            this.f70193b = layoutParams.f70193b;
            this.f70194c = layoutParams.f70194c;
            this.f70195d = layoutParams.f70195d;
            this.f70196e = layoutParams.f70196e;
            this.f70197f = layoutParams.f70197f;
            this.f70198g = layoutParams.f70198g;
            this.f70199h = layoutParams.f70199h;
            this.f70200i = layoutParams.f70200i;
            this.f70201j = layoutParams.f70201j;
            this.f70202k = layoutParams.f70202k;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f70193b = 1;
            this.f70194c = 0.0f;
            this.f70195d = 1.0f;
            this.f70196e = -1;
            this.f70197f = -1.0f;
            this.f70198g = -1;
            this.f70199h = -1;
            this.f70200i = 16777215;
            this.f70201j = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f70193b = 1;
            this.f70194c = 0.0f;
            this.f70195d = 1.0f;
            this.f70196e = -1;
            this.f70197f = -1.0f;
            this.f70198g = -1;
            this.f70199h = -1;
            this.f70200i = 16777215;
            this.f70201j = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f70193b = 1;
            this.f70194c = 0.0f;
            this.f70195d = 1.0f;
            this.f70196e = -1;
            this.f70197f = -1.0f;
            this.f70198g = -1;
            this.f70199h = -1;
            this.f70200i = 16777215;
            this.f70201j = 16777215;
            this.f70193b = parcel.readInt();
            this.f70194c = parcel.readFloat();
            this.f70195d = parcel.readFloat();
            this.f70196e = parcel.readInt();
            this.f70197f = parcel.readFloat();
            this.f70198g = parcel.readInt();
            this.f70199h = parcel.readInt();
            this.f70200i = parcel.readInt();
            this.f70201j = parcel.readInt();
            this.f70202k = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
