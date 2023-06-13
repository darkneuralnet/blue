package p000;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
/* renamed from: my5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C45409my5 {

    /* renamed from: a */
    public final List<VE0> f99184a;

    /* renamed from: b */
    public PointF f99185b;

    /* renamed from: c */
    public boolean f99186c;

    public C45409my5(PointF pointF, boolean z, List<VE0> list) {
        this.f99185b = pointF;
        this.f99186c = z;
        this.f99184a = new ArrayList(list);
    }

    /* renamed from: a */
    public List<VE0> m24606a() {
        return this.f99184a;
    }

    /* renamed from: b */
    public PointF m24605b() {
        return this.f99185b;
    }

    /* renamed from: c */
    public void m24604c(C45409my5 c45409my5, C45409my5 c45409my52, float f) {
        boolean z;
        if (this.f99185b == null) {
            this.f99185b = new PointF();
        }
        if (!c45409my5.m24603d() && !c45409my52.m24603d()) {
            z = false;
        } else {
            z = true;
        }
        this.f99186c = z;
        if (c45409my5.m24606a().size() != c45409my52.m24606a().size()) {
            C32524Dx2.m109586c("Curves must have the same number of control points. Shape 1: " + c45409my5.m24606a().size() + "\tShape 2: " + c45409my52.m24606a().size());
        }
        int min = Math.min(c45409my5.m24606a().size(), c45409my52.m24606a().size());
        if (this.f99184a.size() < min) {
            for (int size = this.f99184a.size(); size < min; size++) {
                this.f99184a.add(new VE0());
            }
        } else if (this.f99184a.size() > min) {
            for (int size2 = this.f99184a.size() - 1; size2 >= min; size2--) {
                List<VE0> list = this.f99184a;
                list.remove(list.size() - 1);
            }
        }
        PointF m24605b = c45409my5.m24605b();
        PointF m24605b2 = c45409my52.m24605b();
        m24601f(C48077rU2.m15911i(m24605b.x, m24605b2.x, f), C48077rU2.m15911i(m24605b.y, m24605b2.y, f));
        for (int size3 = this.f99184a.size() - 1; size3 >= 0; size3--) {
            VE0 ve0 = c45409my5.m24606a().get(size3);
            VE0 ve02 = c45409my52.m24606a().get(size3);
            PointF m80181a = ve0.m80181a();
            PointF m80180b = ve0.m80180b();
            PointF m80179c = ve0.m80179c();
            PointF m80181a2 = ve02.m80181a();
            PointF m80180b2 = ve02.m80180b();
            PointF m80179c2 = ve02.m80179c();
            this.f99184a.get(size3).m80178d(C48077rU2.m15911i(m80181a.x, m80181a2.x, f), C48077rU2.m15911i(m80181a.y, m80181a2.y, f));
            this.f99184a.get(size3).m80177e(C48077rU2.m15911i(m80180b.x, m80180b2.x, f), C48077rU2.m15911i(m80180b.y, m80180b2.y, f));
            this.f99184a.get(size3).m80176f(C48077rU2.m15911i(m80179c.x, m80179c2.x, f), C48077rU2.m15911i(m80179c.y, m80179c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean m24603d() {
        return this.f99186c;
    }

    /* renamed from: e */
    public void m24602e(boolean z) {
        this.f99186c = z;
    }

    /* renamed from: f */
    public void m24601f(float f, float f2) {
        if (this.f99185b == null) {
            this.f99185b = new PointF();
        }
        this.f99185b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f99184a.size() + "closed=" + this.f99186c + CoreConstants.CURLY_RIGHT;
    }

    public C45409my5() {
        this.f99184a = new ArrayList();
    }
}
