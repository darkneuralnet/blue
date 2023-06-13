package p000;

import android.animation.TimeInterpolator;
/* renamed from: d91  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C39585d91 {

    /* renamed from: a */
    public static final TimeInterpolator f76175a = new C19683a();

    /* renamed from: b */
    public static final TimeInterpolator f76176b = new C19684b();

    /* renamed from: c */
    public static final TimeInterpolator f76177c = new C19685c();

    /* renamed from: d91$a */
    /* loaded from: classes4.dex */
    public class C19683a implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f / 1.0f;
            return (1.0f * f2 * f2 * f2 * f2) + 0.0f;
        }
    }

    /* renamed from: d91$b */
    /* loaded from: classes4.dex */
    public class C19684b implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = (f / 1.0f) - 1.0f;
            return (((((f2 * f2) * f2) * f2) - 1.0f) * (-1.0f)) + 0.0f;
        }
    }

    /* renamed from: d91$c */
    /* loaded from: classes4.dex */
    public class C19685c implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f / 0.5f;
            if (f2 < 1.0f) {
                return (0.5f * f2 * f2 * f2 * f2) + 0.0f;
            }
            float f3 = f2 - 2.0f;
            return (((((f3 * f3) * f3) * f3) - 2.0f) * (-0.5f)) + 0.0f;
        }
    }
}
