package p000;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: k8 */
/* loaded from: classes6.dex */
public final class C25112k8 implements NC0 {

    /* renamed from: a */
    public final NC0 f93968a;

    /* renamed from: b */
    public final float f93969b;

    public C25112k8(float f, NC0 nc0) {
        while (nc0 instanceof C25112k8) {
            nc0 = ((C25112k8) nc0).f93968a;
            f += ((C25112k8) nc0).f93969b;
        }
        this.f93968a = nc0;
        this.f93969b = f;
    }

    @Override // p000.NC0
    /* renamed from: a */
    public float mo29259a(RectF rectF) {
        return Math.max(0.0f, this.f93968a.mo29259a(rectF) + this.f93969b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25112k8)) {
            return false;
        }
        C25112k8 c25112k8 = (C25112k8) obj;
        if (this.f93968a.equals(c25112k8.f93968a) && this.f93969b == c25112k8.f93969b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f93968a, Float.valueOf(this.f93969b)});
    }
}
