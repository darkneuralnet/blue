package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* renamed from: lb5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44586lb5 extends AbstractC44826lz5 {

    /* renamed from: a */
    public final SideSheetBehavior<? extends View> f96420a;

    public C44586lb5(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f96420a = sideSheetBehavior;
    }

    @Override // p000.AbstractC44826lz5
    /* renamed from: a */
    public float mo26568a(int i) {
        float mo26565d = mo26565d();
        return (mo26565d - i) / (mo26565d - mo26566c());
    }

    @Override // p000.AbstractC44826lz5
    /* renamed from: b */
    public int mo26567b(View view, float f, float f2) {
        if (f < 0.0f) {
            return 3;
        }
        if (m27097k(view, f)) {
            if (!m27098j(f, f2) && !m27099i(view)) {
                return 3;
            }
        } else if (f == 0.0f || !C45419mz5.m24597a(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - mo26566c()) < Math.abs(left - mo26565d())) {
                return 3;
            }
        }
        return 5;
    }

    @Override // p000.AbstractC44826lz5
    /* renamed from: c */
    public int mo26566c() {
        return Math.max(0, mo26565d() - this.f96420a.m49054s());
    }

    @Override // p000.AbstractC44826lz5
    /* renamed from: d */
    public int mo26565d() {
        return this.f96420a.m49047z();
    }

    @Override // p000.AbstractC44826lz5
    /* renamed from: e */
    public <V extends View> int mo26564e(V v) {
        return v.getLeft();
    }

    @Override // p000.AbstractC44826lz5
    /* renamed from: f */
    public int mo26563f() {
        return 0;
    }

    @Override // p000.AbstractC44826lz5
    /* renamed from: g */
    public boolean mo26562g(View view, int i, boolean z) {
        int m49048y = this.f96420a.m49048y(i);
        C35975Sq6 m49092B = this.f96420a.m49092B();
        if (m49092B != null && (!z ? m49092B.m84774R(view, m49048y, view.getTop()) : m49092B.m84776P(m49048y, view.getTop()))) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC44826lz5
    /* renamed from: h */
    public void mo26561h(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int m49047z = this.f96420a.m49047z();
        if (i <= m49047z) {
            marginLayoutParams.rightMargin = m49047z - i;
        }
    }

    /* renamed from: i */
    public final boolean m27099i(View view) {
        return view.getLeft() > (mo26565d() - mo26566c()) / 2;
    }

    /* renamed from: j */
    public final boolean m27098j(float f, float f2) {
        if (C45419mz5.m24597a(f, f2) && f2 > this.f96420a.m49093A()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m27097k(View view, float f) {
        if (Math.abs(view.getRight() + (f * this.f96420a.m49050w())) > this.f96420a.m49049x()) {
            return true;
        }
        return false;
    }
}
