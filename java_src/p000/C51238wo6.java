package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0012\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u001a2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0000\u001a,\u0010\u0017\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¨\u0006\u001a"}, m28432d2 = {"", "LPS0;", "", "index", "", "time", "", "dataPoint", "", "g", "([LPS0;IJF)V", "Lvo6;", "LjX3;", "event", "c", "", "x", "y", "degree", "f", "dataPoints", "", "isDataDifferential", DateTokenConverter.CONVERTER_KEY, "kineticEnergy", "e", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,599:1\n33#2,6:600\n1#3:606\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n297#1:600,6\n*E\n"})
/* renamed from: wo6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51238wo6 {
    /* renamed from: c */
    public static final void m6306c(C50645vo6 c50645vo6, C43361jX3 event) {
        Intrinsics.checkNotNullParameter(c50645vo6, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (ZW3.m72997b(event)) {
            c50645vo6.m8005e(event.m30359f());
            c50645vo6.m8006d();
        }
        long m30356i = event.m30356i();
        List<PM1> m30361d = event.m30361d();
        int size = m30361d.size();
        int i = 0;
        while (i < size) {
            PM1 pm1 = m30361d.get(i);
            long m111940s = C32120Ce3.m111940s(pm1.m90444a(), m30356i);
            long m90444a = pm1.m90444a();
            c50645vo6.m8005e(C32120Ce3.m111939t(c50645vo6.m8007c(), m111940s));
            c50645vo6.m8009a(pm1.m90443b(), c50645vo6.m8007c());
            i++;
            m30356i = m90444a;
        }
        c50645vo6.m8005e(C32120Ce3.m111939t(c50645vo6.m8007c(), C32120Ce3.m111940s(event.m30359f(), m30356i)));
        c50645vo6.m8009a(event.m30352m(), c50645vo6.m8007c());
    }

    /* renamed from: d */
    public static final float m6305d(List<Float> list, List<Float> list2, boolean z) {
        boolean z2;
        float floatValue;
        boolean z3;
        float floatValue2;
        int size = list.size();
        float f = 0.0f;
        if (size < 2) {
            return 0.0f;
        }
        if (size == 2) {
            if (list2.get(0).floatValue() == list2.get(1).floatValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return 0.0f;
            }
            if (z) {
                floatValue2 = list.get(0).floatValue();
            } else {
                floatValue2 = list.get(0).floatValue() - list.get(1).floatValue();
            }
            return floatValue2 / (list2.get(0).floatValue() - list2.get(1).floatValue());
        }
        int i = size - 1;
        for (int i2 = i; i2 > 0; i2--) {
            int i3 = i2 - 1;
            if (list2.get(i2).floatValue() == list2.get(i3).floatValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                float m6304e = m6304e(f);
                if (z) {
                    floatValue = -list.get(i3).floatValue();
                } else {
                    floatValue = list.get(i2).floatValue() - list.get(i3).floatValue();
                }
                float floatValue3 = floatValue / (list2.get(i2).floatValue() - list2.get(i3).floatValue());
                f += (floatValue3 - m6304e) * Math.abs(floatValue3);
                if (i2 == i) {
                    f *= 0.5f;
                }
            }
        }
        return m6304e(f);
    }

    /* renamed from: e */
    public static final float m6304e(float f) {
        return Math.signum(f) * ((float) Math.sqrt(2 * Math.abs(f)));
    }

    /* renamed from: f */
    public static final List<Float> m6303f(List<Float> x, List<Float> y, int i) {
        int i2;
        float m86413d;
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        if (i >= 1) {
            if (x.size() == y.size()) {
                if (!x.isEmpty()) {
                    if (i >= x.size()) {
                        i2 = x.size() - 1;
                    } else {
                        i2 = i;
                    }
                    int i3 = i + 1;
                    ArrayList arrayList = new ArrayList(i3);
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList.add(Float.valueOf(0.0f));
                    }
                    int size = x.size();
                    int i5 = i2 + 1;
                    C42677iN2 c42677iN2 = new C42677iN2(i5, size);
                    for (int i6 = 0; i6 < size; i6++) {
                        c42677iN2.m34039c(0, i6, 1.0f);
                        for (int i7 = 1; i7 < i5; i7++) {
                            c42677iN2.m34039c(i7, i6, c42677iN2.m34041a(i7 - 1, i6) * x.get(i6).floatValue());
                        }
                    }
                    C42677iN2 c42677iN22 = new C42677iN2(i5, size);
                    C42677iN2 c42677iN23 = new C42677iN2(i5, i5);
                    for (int i8 = 0; i8 < i5; i8++) {
                        for (int i9 = 0; i9 < size; i9++) {
                            c42677iN22.m34039c(i8, i9, c42677iN2.m34041a(i8, i9));
                        }
                        for (int i10 = 0; i10 < i8; i10++) {
                            float m86413d2 = c42677iN22.m34040b(i8).m86413d(c42677iN22.m34040b(i10));
                            for (int i11 = 0; i11 < size; i11++) {
                                c42677iN22.m34039c(i8, i11, c42677iN22.m34041a(i8, i11) - (c42677iN22.m34041a(i10, i11) * m86413d2));
                            }
                        }
                        float m86415b = c42677iN22.m34040b(i8).m86415b();
                        if (m86415b >= 1.0E-6d) {
                            float f = 1.0f / m86415b;
                            for (int i12 = 0; i12 < size; i12++) {
                                c42677iN22.m34039c(i8, i12, c42677iN22.m34041a(i8, i12) * f);
                            }
                            for (int i13 = 0; i13 < i5; i13++) {
                                if (i13 < i8) {
                                    m86413d = 0.0f;
                                } else {
                                    m86413d = c42677iN22.m34040b(i8).m86413d(c42677iN2.m34040b(i13));
                                }
                                c42677iN23.m34039c(i8, i13, m86413d);
                            }
                        } else {
                            throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                        }
                    }
                    C35678Rj6 c35678Rj6 = new C35678Rj6(size);
                    for (int i14 = 0; i14 < size; i14++) {
                        c35678Rj6.m86414c(i14, y.get(i14).floatValue() * 1.0f);
                    }
                    int i15 = i5 - 1;
                    for (int i16 = i15; -1 < i16; i16--) {
                        arrayList.set(i16, Float.valueOf(c42677iN22.m34040b(i16).m86413d(c35678Rj6)));
                        int i17 = i16 + 1;
                        if (i17 <= i15) {
                            int i18 = i15;
                            while (true) {
                                arrayList.set(i16, Float.valueOf(((Number) arrayList.get(i16)).floatValue() - (c42677iN23.m34041a(i16, i18) * ((Number) arrayList.get(i18)).floatValue())));
                                if (i18 != i17) {
                                    i18--;
                                }
                            }
                        }
                        arrayList.set(i16, Float.valueOf(((Number) arrayList.get(i16)).floatValue() / c42677iN23.m34041a(i16, i16)));
                    }
                    return arrayList;
                }
                throw new IllegalArgumentException("At least one point must be provided");
            }
            throw new IllegalArgumentException("x and y must be the same length");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }

    /* renamed from: g */
    public static final void m6302g(PS0[] ps0Arr, int i, long j, float f) {
        PS0 ps0 = ps0Arr[i];
        if (ps0 == null) {
            ps0Arr[i] = new PS0(j, f);
            return;
        }
        ps0.m90242d(j);
        ps0.m90243c(f);
    }
}
