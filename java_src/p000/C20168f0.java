package p000;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: f0 */
/* loaded from: classes6.dex */
public final class C20168f0 implements NC0 {

    /* renamed from: a */
    public final float f79257a;

    public C20168f0(float f) {
        this.f79257a = f;
    }

    @Override // p000.NC0
    /* renamed from: a */
    public float mo29259a(RectF rectF) {
        return this.f79257a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C20168f0) && this.f79257a == ((C20168f0) obj).f79257a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f79257a)});
    }
}
