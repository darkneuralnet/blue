package p000;

import android.view.View;
import android.view.ViewGroup;
/* renamed from: M43 */
/* loaded from: classes.dex */
public class M43 {

    /* renamed from: a */
    public int f22601a;

    /* renamed from: b */
    public int f22602b;

    public M43(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m95845a() {
        return this.f22601a | this.f22602b;
    }

    /* renamed from: b */
    public void m95844b(View view, View view2, int i) {
        m95843c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void m95843c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f22602b = i;
        } else {
            this.f22601a = i;
        }
    }

    /* renamed from: d */
    public void m95842d(View view) {
        m95841e(view, 0);
    }

    /* renamed from: e */
    public void m95841e(View view, int i) {
        if (i == 1) {
            this.f22602b = 0;
        } else {
            this.f22601a = 0;
        }
    }
}
