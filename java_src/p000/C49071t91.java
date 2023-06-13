package p000;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
/* renamed from: t91  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49071t91 {

    /* renamed from: t91$a */
    /* loaded from: classes.dex */
    public static class C28537a {
        private C28537a() {
        }

        /* renamed from: a */
        public static void m12997a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: t91$b */
    /* loaded from: classes.dex */
    public static class C28538b {
        private C28538b() {
        }

        /* renamed from: a */
        public static EdgeEffect m12996a(Context context, AttributeSet attributeSet) {
            try {
                C25761lh.m27004a();
                return C24983jh.m30109a(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m12995b(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m12994c(EdgeEffect edgeEffect, float f, float f2) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f, f2);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m13001a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C28538b.m12996a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m13000b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C28538b.m12995b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m12999c(EdgeEffect edgeEffect, float f, float f2) {
        C28537a.m12997a(edgeEffect, f, f2);
    }

    /* renamed from: d */
    public static float m12998d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C28538b.m12994c(edgeEffect, f, f2);
        }
        m12999c(edgeEffect, f, f2);
        return f;
    }
}
