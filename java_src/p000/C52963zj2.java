package p000;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import p000.AbstractC39920dj2;
/* renamed from: zj2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52963zj2 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f122121a = AbstractC39920dj2.C19847a.m43839a("x", "y");

    /* renamed from: zj2$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C31493a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f122122a;

        static {
            int[] iArr = new int[AbstractC39920dj2.EnumC19848b.values().length];
            f122122a = iArr;
            try {
                iArr[AbstractC39920dj2.EnumC19848b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122122a[AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122122a[AbstractC39920dj2.EnumC19848b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C52963zj2() {
    }

    /* renamed from: a */
    public static PointF m476a(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        abstractC39920dj2.mo2771b();
        float mo2765k = (float) abstractC39920dj2.mo2765k();
        float mo2765k2 = (float) abstractC39920dj2.mo2765k();
        while (abstractC39920dj2.mo2761q() != AbstractC39920dj2.EnumC19848b.END_ARRAY) {
            abstractC39920dj2.mo2758u();
        }
        abstractC39920dj2.mo2769d();
        return new PointF(mo2765k * f, mo2765k2 * f);
    }

    /* renamed from: b */
    public static PointF m475b(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        float mo2765k = (float) abstractC39920dj2.mo2765k();
        float mo2765k2 = (float) abstractC39920dj2.mo2765k();
        while (abstractC39920dj2.mo2767g()) {
            abstractC39920dj2.mo2758u();
        }
        return new PointF(mo2765k * f, mo2765k2 * f);
    }

    /* renamed from: c */
    public static PointF m474c(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        abstractC39920dj2.mo2770c();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f122121a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    abstractC39920dj2.mo2759t();
                    abstractC39920dj2.mo2758u();
                } else {
                    f3 = m470g(abstractC39920dj2);
                }
            } else {
                f2 = m470g(abstractC39920dj2);
            }
        }
        abstractC39920dj2.mo2768f();
        return new PointF(f2 * f, f3 * f);
    }

    /* renamed from: d */
    public static int m473d(AbstractC39920dj2 abstractC39920dj2) throws IOException {
        abstractC39920dj2.mo2771b();
        int mo2765k = (int) (abstractC39920dj2.mo2765k() * 255.0d);
        int mo2765k2 = (int) (abstractC39920dj2.mo2765k() * 255.0d);
        int mo2765k3 = (int) (abstractC39920dj2.mo2765k() * 255.0d);
        while (abstractC39920dj2.mo2767g()) {
            abstractC39920dj2.mo2758u();
        }
        abstractC39920dj2.mo2769d();
        return Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, mo2765k, mo2765k2, mo2765k3);
    }

    /* renamed from: e */
    public static PointF m472e(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        int i = C31493a.f122122a[abstractC39920dj2.mo2761q().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m474c(abstractC39920dj2, f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + abstractC39920dj2.mo2761q());
            }
            return m476a(abstractC39920dj2, f);
        }
        return m475b(abstractC39920dj2, f);
    }

    /* renamed from: f */
    public static List<PointF> m471f(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC39920dj2.mo2771b();
        while (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY) {
            abstractC39920dj2.mo2771b();
            arrayList.add(m472e(abstractC39920dj2, f));
            abstractC39920dj2.mo2769d();
        }
        abstractC39920dj2.mo2769d();
        return arrayList;
    }

    /* renamed from: g */
    public static float m470g(AbstractC39920dj2 abstractC39920dj2) throws IOException {
        AbstractC39920dj2.EnumC19848b mo2761q = abstractC39920dj2.mo2761q();
        int i = C31493a.f122122a[mo2761q.ordinal()];
        if (i != 1) {
            if (i == 2) {
                abstractC39920dj2.mo2771b();
                float mo2765k = (float) abstractC39920dj2.mo2765k();
                while (abstractC39920dj2.mo2767g()) {
                    abstractC39920dj2.mo2758u();
                }
                abstractC39920dj2.mo2769d();
                return mo2765k;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + mo2761q);
        }
        return (float) abstractC39920dj2.mo2765k();
    }
}
