package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* renamed from: o */
    public float f53544o;

    /* renamed from: p */
    public int f53545p;

    /* renamed from: q */
    public int f53546q;

    /* renamed from: r */
    public int f53547r;

    /* renamed from: s */
    public int f53548s;

    /* renamed from: t */
    public boolean f53549t;

    /* renamed from: u */
    public int f53550u;

    /* renamed from: v */
    public int f53551v;

    public MotionEffect(Context context) {
        super(context);
        this.f53544o = 0.1f;
        this.f53545p = 49;
        this.f53546q = 50;
        this.f53547r = 0;
        this.f53548s = 0;
        this.f53549t = true;
        this.f53550u = -1;
        this.f53551v = -1;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /* renamed from: C */
    public boolean mo68204C() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
        if (r14 == 0.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019a, code lost:
        if (r14 == 0.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01aa, code lost:
        if (r15 == 0.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ba, code lost:
        if (r15 == 0.0f) goto L63;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo68198I(MotionLayout motionLayout, HashMap<View, OV2> hashMap) {
        C39319ck2 c39319ck2;
        C39319ck2 c39319ck22;
        C39319ck2 c39319ck23;
        boolean z;
        HashMap<View, OV2> hashMap2 = hashMap;
        View[] m67890p = m67890p((ConstraintLayout) getParent());
        if (m67890p == null) {
            Log.v("FadeMove", FU0.m107120a() + " views = null");
            return;
        }
        C39319ck2 c39319ck24 = new C39319ck2();
        C39319ck2 c39319ck25 = new C39319ck2();
        c39319ck24.m60993R("alpha", Float.valueOf(this.f53544o));
        c39319ck25.m60993R("alpha", Float.valueOf(this.f53544o));
        c39319ck24.m76530g(this.f53545p);
        c39319ck25.m76530g(this.f53546q);
        C32641Ek2 c32641Ek2 = new C32641Ek2();
        c32641Ek2.m76530g(this.f53545p);
        c32641Ek2.m108540m(0);
        c32641Ek2.m108539n("percentX", 0);
        c32641Ek2.m108539n("percentY", 0);
        C32641Ek2 c32641Ek22 = new C32641Ek2();
        c32641Ek22.m76530g(this.f53546q);
        c32641Ek22.m108540m(0);
        c32641Ek22.m108539n("percentX", 1);
        c32641Ek22.m108539n("percentY", 1);
        C39319ck2 c39319ck26 = null;
        if (this.f53547r > 0) {
            c39319ck2 = new C39319ck2();
            c39319ck22 = new C39319ck2();
            c39319ck2.m60993R("translationX", Integer.valueOf(this.f53547r));
            c39319ck2.m76530g(this.f53546q);
            c39319ck22.m60993R("translationX", 0);
            c39319ck22.m76530g(this.f53546q - 1);
        } else {
            c39319ck2 = null;
            c39319ck22 = null;
        }
        if (this.f53548s > 0) {
            c39319ck26 = new C39319ck2();
            c39319ck23 = new C39319ck2();
            c39319ck26.m60993R("translationY", Integer.valueOf(this.f53548s));
            c39319ck26.m76530g(this.f53546q);
            c39319ck23.m60993R("translationY", 0);
            c39319ck23.m76530g(this.f53546q - 1);
        } else {
            c39319ck23 = null;
        }
        int i = this.f53551v;
        if (i == -1) {
            int[] iArr = new int[4];
            for (View view : m67890p) {
                OV2 ov2 = hashMap2.get(view);
                if (ov2 != null) {
                    float m92143n = ov2.m92143n() - ov2.m92137t();
                    float m92142o = ov2.m92142o() - ov2.m92136u();
                    if (m92142o < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (m92142o > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (m92143n > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (m92143n < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i2 = iArr[0];
            i = 0;
            for (int i3 = 1; i3 < 4; i3++) {
                int i4 = iArr[i3];
                if (i2 < i4) {
                    i = i3;
                    i2 = i4;
                }
            }
        }
        int i5 = 0;
        while (i5 < m67890p.length) {
            OV2 ov22 = hashMap2.get(m67890p[i5]);
            if (ov22 != null) {
                float m92143n2 = ov22.m92143n() - ov22.m92137t();
                float m92142o2 = ov22.m92142o() - ov22.m92136u();
                if (i == 0) {
                    if (m92142o2 > 0.0f) {
                        if (this.f53549t) {
                        }
                        z = false;
                    }
                    z = true;
                } else if (i == 1) {
                    if (m92142o2 < 0.0f) {
                        if (this.f53549t) {
                        }
                        z = false;
                    }
                    z = true;
                } else if (i == 2) {
                    if (m92143n2 < 0.0f) {
                        if (this.f53549t) {
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    if (i == 3) {
                        if (m92143n2 > 0.0f) {
                            if (this.f53549t) {
                            }
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    int i6 = this.f53550u;
                    if (i6 == -1) {
                        ov22.m92156a(c39319ck24);
                        ov22.m92156a(c39319ck25);
                        ov22.m92156a(c32641Ek2);
                        ov22.m92156a(c32641Ek22);
                        if (this.f53547r > 0) {
                            ov22.m92156a(c39319ck2);
                            ov22.m92156a(c39319ck22);
                        }
                        if (this.f53548s > 0) {
                            ov22.m92156a(c39319ck26);
                            ov22.m92156a(c39319ck23);
                        }
                    } else {
                        motionLayout.m68195C(i6, ov22);
                    }
                    i5++;
                    hashMap2 = hashMap;
                }
            }
            i5++;
            hashMap2 = hashMap;
        }
    }

    /* renamed from: J */
    public final void m68205J(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f53545p);
                    this.f53545p = i2;
                    this.f53545p = Math.max(Math.min(i2, 99), 0);
                } else if (index == C39341cm4.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f53546q);
                    this.f53546q = i3;
                    this.f53546q = Math.max(Math.min(i3, 99), 0);
                } else if (index == C39341cm4.MotionEffect_motionEffect_translationX) {
                    this.f53547r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f53547r);
                } else if (index == C39341cm4.MotionEffect_motionEffect_translationY) {
                    this.f53548s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f53548s);
                } else if (index == C39341cm4.MotionEffect_motionEffect_alpha) {
                    this.f53544o = obtainStyledAttributes.getFloat(index, this.f53544o);
                } else if (index == C39341cm4.MotionEffect_motionEffect_move) {
                    this.f53551v = obtainStyledAttributes.getInt(index, this.f53551v);
                } else if (index == C39341cm4.MotionEffect_motionEffect_strict) {
                    this.f53549t = obtainStyledAttributes.getBoolean(index, this.f53549t);
                } else if (index == C39341cm4.MotionEffect_motionEffect_viewTransition) {
                    this.f53550u = obtainStyledAttributes.getResourceId(index, this.f53550u);
                }
            }
            int i4 = this.f53545p;
            int i5 = this.f53546q;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f53545p = i4 - 1;
                } else {
                    this.f53546q = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53544o = 0.1f;
        this.f53545p = 49;
        this.f53546q = 50;
        this.f53547r = 0;
        this.f53548s = 0;
        this.f53549t = true;
        this.f53550u = -1;
        this.f53551v = -1;
        m68205J(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53544o = 0.1f;
        this.f53545p = 49;
        this.f53546q = 50;
        this.f53547r = 0;
        this.f53548s = 0;
        this.f53549t = true;
        this.f53550u = -1;
        this.f53551v = -1;
        m68205J(context, attributeSet);
    }
}
