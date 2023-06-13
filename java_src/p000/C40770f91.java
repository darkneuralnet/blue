package p000;

import android.animation.TimeInterpolator;
/* renamed from: f91  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C40770f91 {

    /* renamed from: a */
    public static final TimeInterpolator f79539a = new C20245a();

    /* renamed from: b */
    public static final TimeInterpolator f79540b = new C20246b();

    /* renamed from: c */
    public static final TimeInterpolator f79541c = new C20247c();

    /* renamed from: f91$a */
    /* loaded from: classes4.dex */
    public class C20245a implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (((float) Math.cos((f / 1.0f) * 1.5707963267948966d)) * (-1.0f)) + 1.0f + 0.0f;
        }
    }

    /* renamed from: f91$b */
    /* loaded from: classes4.dex */
    public class C20246b implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (((float) Math.sin((f / 1.0f) * 1.5707963267948966d)) * 1.0f) + 0.0f;
        }
    }

    /* renamed from: f91$c */
    /* loaded from: classes4.dex */
    public class C20247c implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return ((((float) Math.cos((f * 3.141592653589793d) / 1.0d)) - 1.0f) * (-0.5f)) + 0.0f;
        }
    }
}
