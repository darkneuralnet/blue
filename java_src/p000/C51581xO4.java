package p000;

import android.animation.TimeInterpolator;
/* renamed from: xO4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51581xO4 implements TimeInterpolator {

    /* renamed from: a */
    public final TimeInterpolator f117546a;

    public C51581xO4(TimeInterpolator timeInterpolator) {
        this.f117546a = timeInterpolator;
    }

    /* renamed from: a */
    public static TimeInterpolator m5309a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new C51581xO4(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.f117546a.getInterpolation(f);
    }
}
