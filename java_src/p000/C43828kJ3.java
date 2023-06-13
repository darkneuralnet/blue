package p000;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
/* renamed from: kJ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43828kJ3 {

    /* renamed from: kJ3$a */
    /* loaded from: classes.dex */
    public static class C25138a {
        private C25138a() {
        }

        /* renamed from: a */
        public static PathInterpolator m29070a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        /* renamed from: b */
        public static PathInterpolator m29069b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        /* renamed from: c */
        public static PathInterpolator m29068c(Path path) {
            return new PathInterpolator(path);
        }
    }

    private C43828kJ3() {
    }

    /* renamed from: a */
    public static Interpolator m29072a(float f, float f2, float f3, float f4) {
        return C25138a.m29069b(f, f2, f3, f4);
    }

    /* renamed from: b */
    public static Interpolator m29071b(Path path) {
        return C25138a.m29068c(path);
    }
}
