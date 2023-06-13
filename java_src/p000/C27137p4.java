package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
/* renamed from: p4 */
/* loaded from: classes3.dex */
public final class C27137p4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final NestedScrollView f103084a;

    /* renamed from: b */
    public final T33 f103085b;

    /* renamed from: c */
    public final U33 f103086c;

    public C27137p4(NestedScrollView nestedScrollView, T33 t33, U33 u33) {
        this.f103084a = nestedScrollView;
        this.f103085b = t33;
        this.f103086c = u33;
    }

    /* renamed from: a */
    public static C27137p4 m20002a(View view) {
        int i = C32148Ch4.details;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            T33 m84394a = T33.m84394a(m96312a);
            int i2 = C32148Ch4.vehicles;
            View m96312a2 = C34328Lp6.m96312a(view, i2);
            if (m96312a2 != null) {
                return new C27137p4((NestedScrollView) view, m84394a, U33.m82033a(m96312a2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C27137p4 m20000c(LayoutInflater layoutInflater) {
        return m19999d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27137p4 m19999d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C47037pj4.activity_nest_inventory_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20002a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f103084a;
    }
}
