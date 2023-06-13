package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
/* loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* renamed from: w */
    public static int f53513w;

    /* renamed from: x */
    public static float f53514x;

    /* renamed from: m */
    public ConstraintLayout f53515m;

    /* renamed from: n */
    public int f53516n;

    /* renamed from: o */
    public float[] f53517o;

    /* renamed from: p */
    public int[] f53518p;

    /* renamed from: q */
    public int f53519q;

    /* renamed from: r */
    public int f53520r;

    /* renamed from: s */
    public String f53521s;

    /* renamed from: t */
    public String f53522t;

    /* renamed from: u */
    public Float f53523u;

    /* renamed from: v */
    public Integer f53524v;

    public CircularFlow(Context context) {
        super(context);
    }

    /* renamed from: D */
    public final void m68215D(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f53938d == null || (fArr = this.f53517o) == null) {
            return;
        }
        if (this.f53520r + 1 > fArr.length) {
            this.f53517o = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f53517o[this.f53520r] = Integer.parseInt(str);
        this.f53520r++;
    }

    /* renamed from: E */
    public final void m68214E(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f53938d == null || (iArr = this.f53518p) == null) {
            return;
        }
        if (this.f53519q + 1 > iArr.length) {
            this.f53518p = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f53518p[this.f53519q] = (int) (Integer.parseInt(str) * this.f53938d.getResources().getDisplayMetrics().density);
        this.f53519q++;
    }

    /* renamed from: F */
    public final void m68213F() {
        this.f53515m = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f53937c; i++) {
            View viewById = this.f53515m.getViewById(this.f53936b[i]);
            if (viewById != null) {
                int i2 = f53513w;
                float f = f53514x;
                int[] iArr = this.f53518p;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    Integer num = this.f53524v;
                    if (num != null && num.intValue() != -1) {
                        this.f53519q++;
                        if (this.f53518p == null) {
                            this.f53518p = new int[1];
                        }
                        int[] m68211H = m68211H();
                        this.f53518p = m68211H;
                        m68211H[this.f53519q - 1] = i2;
                    } else {
                        Log.e("CircularFlow", "Added radius to view with id: " + this.f53944j.get(Integer.valueOf(viewById.getId())));
                    }
                }
                float[] fArr = this.f53517o;
                if (fArr != null && i < fArr.length) {
                    f = fArr[i];
                } else {
                    Float f2 = this.f53523u;
                    if (f2 != null && f2.floatValue() != -1.0f) {
                        this.f53520r++;
                        if (this.f53517o == null) {
                            this.f53517o = new float[1];
                        }
                        float[] m68212G = m68212G();
                        this.f53517o = m68212G;
                        m68212G[this.f53520r - 1] = f;
                    } else {
                        Log.e("CircularFlow", "Added angle to view with id: " + this.f53944j.get(Integer.valueOf(viewById.getId())));
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.f54005r = f;
                layoutParams.f54001p = this.f53516n;
                layoutParams.f54003q = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        m67896i();
    }

    /* renamed from: G */
    public float[] m68212G() {
        return Arrays.copyOf(this.f53517o, this.f53520r);
    }

    /* renamed from: H */
    public int[] m68211H() {
        return Arrays.copyOf(this.f53518p, this.f53519q);
    }

    /* renamed from: I */
    public final void m68210I(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f53520r = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m68215D(str.substring(i).trim());
                return;
            } else {
                m68215D(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    /* renamed from: J */
    public final void m68209J(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f53519q = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m68214E(str.substring(i).trim());
                return;
            } else {
                m68214E(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f53521s;
        if (str != null) {
            this.f53517o = new float[1];
            m68210I(str);
        }
        String str2 = this.f53522t;
        if (str2 != null) {
            this.f53518p = new int[1];
            m68209J(str2);
        }
        Float f = this.f53523u;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f53524v;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        m68213F();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo67862q(AttributeSet attributeSet) {
        super.mo67862q(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f53516n = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == C39341cm4.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f53521s = string;
                    m68210I(string);
                } else if (index == C39341cm4.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f53522t = string2;
                    m68209J(string2);
                } else if (index == C39341cm4.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f53514x));
                    this.f53523u = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == C39341cm4.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f53513w));
                    this.f53524v = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setDefaultAngle(float f) {
        f53514x = f;
    }

    public void setDefaultRadius(int i) {
        f53513w = i;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
