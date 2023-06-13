package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001Bt\u0012\u0006\u0010&\u001a\u00020\"\u0012*\u0010,\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150'\u0012\u0006\u00101\u001a\u00020-\u0012\u0006\u00106\u001a\u000202\u0012\u0006\u0010;\u001a\u000207\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020=0<\u0012\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020Bø\u0001\u0001¢\u0006\u0004\bK\u0010LJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0002J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J2\u0010!\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0003H\u0002R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R;\u0010,\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150'8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b*\u0010+R \u00101\u001a\u00020-8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u00105R\u0017\u0010;\u001a\u0002078\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020=0<8\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006M"}, m28432d2 = {"LWc5;", "", "LOU3;", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "LzO2;", "measureScope", "Lkz0;", "constraints", "startIndex", "endIndex", "LVc5;", "e", "(LzO2;JII)LVc5;", "LOU3$a;", "placeableScope", "measureResult", "crossAxisOffset", "Lpm2;", "layoutDirection", "", "f", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "c", "placeable", "LXc5;", "parentData", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "b", "LRm2;", "LRm2;", "getOrientation", "()LRm2;", "orientation", "Lkotlin/Function5;", "Lg01;", "Lkotlin/jvm/functions/Function5;", "getArrangement", "()Lkotlin/jvm/functions/Function5;", "arrangement", "Lk61;", "F", "getArrangementSpacing-D9Ej5fM", "()F", "arrangementSpacing", "LDB5;", "LDB5;", "getCrossAxisSize", "()LDB5;", "crossAxisSize", "LQE0;", "LQE0;", "getCrossAxisAlignment", "()LQE0;", "crossAxisAlignment", "", "LvO2;", "Ljava/util/List;", "getMeasurables", "()Ljava/util/List;", "measurables", "", "g", "[LOU3;", "getPlaceables", "()[LOU3;", "placeables", "h", "[LXc5;", "rowColumnParentData", "<init>", "(LRm2;Lkotlin/jvm/functions/Function5;FLDB5;LQE0;Ljava/util/List;[LOU3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
/* renamed from: Wc5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36784Wc5 {

    /* renamed from: a */
    public final EnumC35701Rm2 f41400a;

    /* renamed from: b */
    public final Function5<Integer, int[], EnumC47065pm2, InterfaceC41273g01, int[], Unit> f41401b;

    /* renamed from: c */
    public final float f41402c;

    /* renamed from: d */
    public final DB5 f41403d;

    /* renamed from: e */
    public final QE0 f41404e;

    /* renamed from: f */
    public final List<InterfaceC50393vO2> f41405f;

    /* renamed from: g */
    public final OU3[] f41406g;

    /* renamed from: h */
    public final C37018Xc5[] f41407h;

    public /* synthetic */ C36784Wc5(EnumC35701Rm2 enumC35701Rm2, Function5 function5, float f, DB5 db5, QE0 qe0, List list, OU3[] ou3Arr, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC35701Rm2, function5, f, db5, qe0, list, ou3Arr);
    }

    /* renamed from: a */
    public final int m78129a(OU3 ou3) {
        Intrinsics.checkNotNullParameter(ou3, "<this>");
        if (this.f41400a == EnumC35701Rm2.Horizontal) {
            return ou3.m92229d1();
        }
        return ou3.m92226i1();
    }

    /* renamed from: b */
    public final int m78128b(OU3 ou3, C37018Xc5 c37018Xc5, int i, EnumC47065pm2 enumC47065pm2, int i2) {
        QE0 qe0;
        if (c37018Xc5 == null || (qe0 = c37018Xc5.m76759a()) == null) {
            qe0 = this.f41404e;
        }
        int m78129a = i - m78129a(ou3);
        if (this.f41400a == EnumC35701Rm2.Horizontal) {
            enumC47065pm2 = EnumC47065pm2.Ltr;
        }
        return qe0.mo88710a(m78129a, enumC47065pm2, ou3, i2);
    }

    /* renamed from: c */
    public final int[] m78127c(int i, int[] iArr, int[] iArr2, InterfaceC52765zO2 interfaceC52765zO2) {
        this.f41401b.invoke(Integer.valueOf(i), iArr, interfaceC52765zO2.getLayoutDirection(), interfaceC52765zO2, iArr2);
        return iArr2;
    }

    /* renamed from: d */
    public final int m78126d(OU3 ou3) {
        Intrinsics.checkNotNullParameter(ou3, "<this>");
        if (this.f41400a == EnumC35701Rm2.Horizontal) {
            return ou3.m92226i1();
        }
        return ou3.m92229d1();
    }

    /* renamed from: e */
    public final C36550Vc5 m78125e(InterfaceC52765zO2 measureScope, long j, int i, int i2) {
        int i3;
        int m106122f;
        float f;
        IntRange until;
        int i4;
        int coerceAtMost;
        float f2;
        boolean z;
        int sign;
        int roundToInt;
        int i5;
        int roundToInt2;
        int i6;
        int i7;
        int max;
        Integer num;
        int i8;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        C33002Fy3 c33002Fy3 = new C33002Fy3(j, this.f41400a, null);
        int mo3416F0 = measureScope.mo3416F0(this.f41402c);
        int i12 = i2 - i;
        float f3 = 0.0f;
        int i13 = i;
        float f4 = 0.0f;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z2 = false;
        while (true) {
            i3 = Integer.MAX_VALUE;
            if (i13 >= i2) {
                break;
            }
            InterfaceC50393vO2 interfaceC50393vO2 = this.f41405f.get(i13);
            C37018Xc5 c37018Xc5 = this.f41407h[i13];
            float m81240m = C36316Uc5.m81240m(c37018Xc5);
            if (m81240m > 0.0f) {
                f4 += m81240m;
                i16++;
                i10 = i13;
            } else {
                int m106123e = c33002Fy3.m106123e();
                OU3 ou3 = this.f41406g[i13];
                if (ou3 == null) {
                    if (m106123e == Integer.MAX_VALUE) {
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i11 = m106123e - i17;
                    }
                    int i18 = i11;
                    i8 = m106123e;
                    i9 = i15;
                    i10 = i13;
                    ou3 = interfaceC50393vO2.mo8763P0(C33002Fy3.m106126b(c33002Fy3, 0, i18, 0, 0, 8, null).m106121g(this.f41400a));
                } else {
                    i8 = m106123e;
                    i9 = i15;
                    i10 = i13;
                }
                int min = Math.min(mo3416F0, (i8 - i17) - m78126d(ou3));
                i17 += m78126d(ou3) + min;
                i15 = Math.max(i9, m78129a(ou3));
                if (!z2 && !C36316Uc5.m81236q(c37018Xc5)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f41406g[i10] = ou3;
                i14 = min;
            }
            i13 = i10 + 1;
        }
        int i19 = i15;
        if (i16 == 0) {
            i17 -= i14;
            i4 = i19;
            coerceAtMost = 0;
        } else {
            int i20 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i20 > 0 && c33002Fy3.m106123e() != Integer.MAX_VALUE) {
                m106122f = c33002Fy3.m106123e();
            } else {
                m106122f = c33002Fy3.m106122f();
            }
            int i21 = mo3416F0 * (i16 - 1);
            int i22 = (m106122f - i17) - i21;
            if (i20 > 0) {
                f = i22 / f4;
            } else {
                f = 0.0f;
            }
            until = RangesKt___RangesKt.until(i, i2);
            Iterator<Integer> it = until.iterator();
            int i23 = 0;
            while (it.hasNext()) {
                roundToInt2 = MathKt__MathJVMKt.roundToInt(C36316Uc5.m81240m(this.f41407h[((IntIterator) it).nextInt()]) * f);
                i23 += roundToInt2;
            }
            int i24 = i22 - i23;
            int i25 = i;
            i4 = i19;
            int i26 = 0;
            while (i25 < i2) {
                if (this.f41406g[i25] == null) {
                    InterfaceC50393vO2 interfaceC50393vO22 = this.f41405f.get(i25);
                    C37018Xc5 c37018Xc52 = this.f41407h[i25];
                    float m81240m2 = C36316Uc5.m81240m(c37018Xc52);
                    if (m81240m2 > f3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        sign = MathKt__MathJVMKt.getSign(i24);
                        int i27 = i24 - sign;
                        roundToInt = MathKt__MathJVMKt.roundToInt(m81240m2 * f);
                        int max2 = Math.max(0, roundToInt + sign);
                        if (C36316Uc5.m81242k(c37018Xc52) && max2 != i3) {
                            f2 = f;
                            i5 = max2;
                        } else {
                            f2 = f;
                            i5 = 0;
                        }
                        OU3 mo8763P0 = interfaceC50393vO22.mo8763P0(new C33002Fy3(i5, max2, 0, c33002Fy3.m106125c()).m106121g(this.f41400a));
                        i26 += m78126d(mo8763P0);
                        i4 = Math.max(i4, m78129a(mo8763P0));
                        if (!z2 && !C36316Uc5.m81236q(c37018Xc52)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        this.f41406g[i25] = mo8763P0;
                        i24 = i27;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    f2 = f;
                }
                i25++;
                f = f2;
                i3 = Integer.MAX_VALUE;
                f3 = 0.0f;
            }
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i26 + i21, c33002Fy3.m106123e() - i17);
        }
        if (z2) {
            int i28 = 0;
            i6 = 0;
            for (int i29 = i; i29 < i2; i29++) {
                OU3 ou32 = this.f41406g[i29];
                Intrinsics.checkNotNull(ou32);
                QE0 m81243j = C36316Uc5.m81243j(this.f41407h[i29]);
                if (m81243j != null) {
                    num = m81243j.m88714b(ou32);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i28 = Math.max(i28, intValue);
                    int m78129a = m78129a(ou32);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = m78129a(ou32);
                    }
                    i6 = Math.max(i6, m78129a - intValue2);
                }
            }
            i7 = i28;
        } else {
            i6 = 0;
            i7 = 0;
        }
        int max3 = Math.max(i17 + coerceAtMost, c33002Fy3.m106122f());
        if (c33002Fy3.m106125c() != Integer.MAX_VALUE && this.f41403d == DB5.Expand) {
            max = c33002Fy3.m106125c();
        } else {
            max = Math.max(i4, Math.max(c33002Fy3.m106124d(), i6 + i7));
        }
        int[] iArr = new int[i12];
        for (int i30 = 0; i30 < i12; i30++) {
            iArr[i30] = 0;
        }
        int[] iArr2 = new int[i12];
        for (int i31 = 0; i31 < i12; i31++) {
            OU3 ou33 = this.f41406g[i31 + i];
            Intrinsics.checkNotNull(ou33);
            iArr2[i31] = m78126d(ou33);
        }
        return new C36550Vc5(max, max3, i, i2, i7, m78127c(max3, iArr2, iArr, measureScope));
    }

    /* renamed from: f */
    public final void m78124f(OU3.AbstractC6015a placeableScope, C36550Vc5 measureResult, int i, EnumC47065pm2 layoutDirection) {
        C37018Xc5 c37018Xc5;
        Intrinsics.checkNotNullParameter(placeableScope, "placeableScope");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int m79648c = measureResult.m79648c();
        for (int m79645f = measureResult.m79645f(); m79645f < m79648c; m79645f++) {
            OU3 ou3 = this.f41406g[m79645f];
            Intrinsics.checkNotNull(ou3);
            int[] m79647d = measureResult.m79647d();
            Object mo77401c = this.f41405f.get(m79645f).mo77401c();
            if (mo77401c instanceof C37018Xc5) {
                c37018Xc5 = (C37018Xc5) mo77401c;
            } else {
                c37018Xc5 = null;
            }
            int m78128b = m78128b(ou3, c37018Xc5, measureResult.m79649b(), layoutDirection, measureResult.m79650a()) + i;
            if (this.f41400a == EnumC35701Rm2.Horizontal) {
                OU3.AbstractC6015a.m92209n(placeableScope, ou3, m79647d[m79645f - measureResult.m79645f()], m78128b, 0.0f, 4, null);
            } else {
                OU3.AbstractC6015a.m92209n(placeableScope, ou3, m78128b, m79647d[m79645f - measureResult.m79645f()], 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36784Wc5(EnumC35701Rm2 enumC35701Rm2, Function5<? super Integer, ? super int[], ? super EnumC47065pm2, ? super InterfaceC41273g01, ? super int[], Unit> function5, float f, DB5 db5, QE0 qe0, List<? extends InterfaceC50393vO2> list, OU3[] ou3Arr) {
        this.f41400a = enumC35701Rm2;
        this.f41401b = function5;
        this.f41402c = f;
        this.f41403d = db5;
        this.f41404e = qe0;
        this.f41405f = list;
        this.f41406g = ou3Arr;
        int size = list.size();
        C37018Xc5[] c37018Xc5Arr = new C37018Xc5[size];
        for (int i = 0; i < size; i++) {
            c37018Xc5Arr[i] = C36316Uc5.m81241l(this.f41405f.get(i));
        }
        this.f41407h = c37018Xc5Arr;
    }
}
