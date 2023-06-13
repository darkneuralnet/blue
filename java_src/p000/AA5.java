package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
/* renamed from: AA5 */
/* loaded from: classes.dex */
public class AA5 extends AbstractC32267Cu6 {

    /* renamed from: b */
    public float f229b = 3.0f;

    /* renamed from: c */
    public int f230c = 80;

    @Override // p000.L96
    /* renamed from: c */
    public long mo97641c(ViewGroup viewGroup, Transition transition, N96 n96, N96 n962) {
        int i;
        int i2;
        int i3;
        N96 n963 = n96;
        if (n963 == null && n962 == null) {
            return 0L;
        }
        Rect m65908A = transition.m65908A();
        if (n962 != null && m111364e(n963) != 0) {
            n963 = n962;
            i = 1;
        } else {
            i = -1;
        }
        int m111363f = m111363f(n963);
        int m111362g = m111362g(n963);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (m65908A != null) {
            i2 = m65908A.centerX();
            i3 = m65908A.centerY();
        } else {
            i2 = (round + width) / 2;
            i3 = (round2 + height) / 2;
        }
        float m116038h = m116038h(viewGroup, m111363f, m111362g, i2, i3, round, round2, width, height) / m116037i(viewGroup);
        long m65873z = transition.m65873z();
        if (m65873z < 0) {
            m65873z = 300;
        }
        return Math.round((((float) (m65873z * i)) / this.f229b) * m116038h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (r5 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r5 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = 5;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m116038h(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f230c;
        boolean z = true;
        if (i9 == 8388611) {
            if (C38790bq6.m62548D(view) != 1) {
                z = false;
            }
        } else if (i9 == 8388613) {
            if (C38790bq6.m62548D(view) != 1) {
                z = false;
            }
        }
        if (i9 != 3) {
            if (i9 != 5) {
                if (i9 != 48) {
                    if (i9 != 80) {
                        return 0;
                    }
                    return (i2 - i6) + Math.abs(i3 - i);
                }
                return (i8 - i2) + Math.abs(i3 - i);
            }
            return (i - i5) + Math.abs(i4 - i2);
        }
        return (i7 - i) + Math.abs(i4 - i2);
    }

    /* renamed from: i */
    public final int m116037i(ViewGroup viewGroup) {
        int i = this.f230c;
        if (i != 3 && i != 5 && i != 8388611 && i != 8388613) {
            return viewGroup.getHeight();
        }
        return viewGroup.getWidth();
    }

    /* renamed from: j */
    public void m116036j(int i) {
        this.f230c = i;
    }
}
