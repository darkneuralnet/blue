package p000;

import android.animation.TimeInterpolator;
/* renamed from: a91  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C37788a91 {

    /* renamed from: a */
    public static final TimeInterpolator f49901a = new C10583a();

    /* renamed from: b */
    public static final TimeInterpolator f49902b = new C10584b();

    /* renamed from: c */
    public static final TimeInterpolator f49903c = new C10585c();

    /* renamed from: a91$a */
    /* loaded from: classes4.dex */
    public class C10583a implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f / 1.0f;
            return (1.0f * f2 * f2 * f2) + 0.0f;
        }
    }

    /* renamed from: a91$b */
    /* loaded from: classes4.dex */
    public class C10584b implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = (f / 1.0f) - 1.0f;
            return (((f2 * f2 * f2) + 1.0f) * 1.0f) + 0.0f;
        }
    }

    /* renamed from: a91$c */
    /* loaded from: classes4.dex */
    public class C10585c implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f / 0.5f;
            if (f2 < 1.0f) {
                return (0.5f * f2 * f2 * f2) + 0.0f;
            }
            float f3 = f2 - 2.0f;
            return (((f3 * f3 * f3) + 2.0f) * 0.5f) + 0.0f;
        }
    }
}
