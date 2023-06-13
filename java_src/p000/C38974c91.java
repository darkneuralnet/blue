package p000;

import android.animation.TimeInterpolator;
/* renamed from: c91  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C38974c91 {

    /* renamed from: a */
    public static final TimeInterpolator f60195a = new C13412a();

    /* renamed from: b */
    public static final TimeInterpolator f60196b = new C13413b();

    /* renamed from: c */
    public static final TimeInterpolator f60197c = new C13414c();

    /* renamed from: c91$a */
    /* loaded from: classes4.dex */
    public class C13412a implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f / 1.0f;
            return (1.0f * f2 * f2) + 0.0f;
        }
    }

    /* renamed from: c91$b */
    /* loaded from: classes4.dex */
    public class C13413b implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f / 1.0f;
            return ((-1.0f) * f2 * (f2 - 2.0f)) + 0.0f;
        }
    }

    /* renamed from: c91$c */
    /* loaded from: classes4.dex */
    public class C13414c implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f / 0.5f;
            if (f2 < 1.0f) {
                return (0.5f * f2 * f2) + 0.0f;
            }
            float f3 = f2 - 1.0f;
            return (((f3 * (f3 - 2.0f)) - 1.0f) * (-0.5f)) + 0.0f;
        }
    }
}
