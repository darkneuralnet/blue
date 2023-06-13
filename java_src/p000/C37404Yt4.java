package p000;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: Yt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37404Yt4 implements NC0 {

    /* renamed from: a */
    public final float f47595a;

    public C37404Yt4(float f) {
        this.f47595a = f;
    }

    /* renamed from: b */
    public static float m74037b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // p000.NC0
    /* renamed from: a */
    public float mo29259a(RectF rectF) {
        return this.f47595a * m74037b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C37404Yt4) && this.f47595a == ((C37404Yt4) obj).f47595a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f47595a)});
    }
}
