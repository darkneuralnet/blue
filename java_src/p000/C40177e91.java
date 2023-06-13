package p000;

import android.animation.TimeInterpolator;
/* renamed from: e91  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C40177e91 {

    /* renamed from: a */
    public static final TimeInterpolator f78021a = new C19969a();

    /* renamed from: b */
    public static final TimeInterpolator f78022b = new C19970b();

    /* renamed from: c */
    public static final TimeInterpolator f78023c = new C19971c();

    /* renamed from: e91$a */
    /* loaded from: classes4.dex */
    public class C19969a implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f / 1.0f;
            return (1.0f * f2 * f2 * f2 * f2 * f2) + 0.0f;
        }
    }

    /* renamed from: e91$b */
    /* loaded from: classes4.dex */
    public class C19970b implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = (f / 1.0f) - 1.0f;
            return (((f2 * f2 * f2 * f2 * f2) + 1.0f) * 1.0f) + 0.0f;
        }
    }

    /* renamed from: e91$c */
    /* loaded from: classes4.dex */
    public class C19971c implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f / 0.5f;
            if (f2 < 1.0f) {
                return (0.5f * f2 * f2 * f2 * f2 * f2) + 0.0f;
            }
            float f3 = f2 - 2.0f;
            return (((f3 * f3 * f3 * f3 * f3) + 2.0f) * 0.5f) + 0.0f;
        }
    }
}
