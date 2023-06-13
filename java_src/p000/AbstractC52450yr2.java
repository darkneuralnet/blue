package p000;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
/* renamed from: yr2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC52450yr2<T extends Entry> extends AbstractC31596zx<T> implements OO1<T> {

    /* renamed from: A */
    public float f120333A;

    /* renamed from: B */
    public DashPathEffect f120334B;

    /* renamed from: y */
    public boolean f120335y;

    /* renamed from: z */
    public boolean f120336z;

    public AbstractC52450yr2(List<T> list, String str) {
        super(list, str);
        this.f120335y = true;
        this.f120336z = true;
        this.f120333A = 0.5f;
        this.f120334B = null;
        this.f120333A = AbstractC34967Oi6.m91656e(0.5f);
    }

    @Override // p000.OO1
    /* renamed from: E0 */
    public DashPathEffect mo2389E0() {
        return this.f120334B;
    }

    @Override // p000.OO1
    /* renamed from: O0 */
    public boolean mo2388O0() {
        return this.f120336z;
    }

    @Override // p000.OO1
    /* renamed from: r0 */
    public float mo2387r0() {
        return this.f120333A;
    }

    @Override // p000.OO1
    /* renamed from: v */
    public boolean mo2386v() {
        return this.f120335y;
    }
}
