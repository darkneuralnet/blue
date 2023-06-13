package p000;

import android.view.View;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u001a\f\u0010\b\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Landroid/view/View;", "LJm2;", "layoutNode", "", "e", "", "", "f", "g", "type", "LH43;", "h", "(I)I", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: he */
/* loaded from: classes.dex */
public final class C22704he {
    /* renamed from: e */
    public static final void m36124e(View view, C33829Jm2 c33829Jm2) {
        int roundToInt;
        int roundToInt2;
        long m20516e = C46472om2.m20516e(c33829Jm2.mo8157h());
        roundToInt = MathKt__MathJVMKt.roundToInt(C32120Ce3.m111944o(m20516e));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(C32120Ce3.m111943p(m20516e));
        view.layout(roundToInt, roundToInt2, view.getMeasuredWidth() + roundToInt, view.getMeasuredHeight() + roundToInt2);
    }

    /* renamed from: f */
    public static final float m36123f(int i) {
        return i * (-1);
    }

    /* renamed from: g */
    public static final float m36122g(float f) {
        return f * (-1.0f);
    }

    /* renamed from: h */
    public static final int m36121h(int i) {
        if (i == 0) {
            return H43.f12808a.m104444a();
        }
        return H43.f12808a.m104443b();
    }
}
