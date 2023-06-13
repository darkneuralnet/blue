package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 _2\u00020\u0001:\u0001\u0015B]\b\u0000\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020 \u0012\b\u00105\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010C\u001a\u000209\u0012\u0006\u0010K\u001a\u000209\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010)\u0012\u0006\u0010W\u001a\u00020\u0002¢\u0006\u0004\bX\u0010YB1\b\u0010\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010Z\u001a\u00020)\u0012\u0006\u0010W\u001a\u00020\u0002¢\u0006\u0004\bX\u0010[BA\b\u0010\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010\\\u001a\u00020?\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010W\u001a\u00020\u0002¢\u0006\u0004\bX\u0010]B!\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0000\u0012\u0006\u00105\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020 ¢\u0006\u0004\bX\u0010^J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00105\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b4\u00102R\u001a\u00108\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00102R\u001a\u0010=\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R#\u0010C\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0>8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010E\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\bD\u0010<R\u001a\u0010H\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\bG\u0010<R#\u0010K\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0>8\u0006¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010BR\u001a\u0010N\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<R\u001a\u0010Q\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\b/\u0010R\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006`"}, m28432d2 = {"LSO4;", "LBm0;", "", "component", "", "f", "e", "", "v", "l", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", C17296a.f69688o, "colorSpace", "Lpm0;", "n", "(FFFFLBm0;)J", "b", "", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "LNA6;", "LNA6;", "N", "()LNA6;", "whitePoint", "F", "min", "g", "max", "Lj96;", "h", "Lj96;", "getTransferParameters", "()Lj96;", "transferParameters", "i", "[F", "getPrimaries$ui_graphics_release", "()[F", "primaries", "M", "transform", "k", "J", "inverseTransform", "LX51;", "LX51;", "L", "()LX51;", "oetfOrig", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "getOetf", "()Lkotlin/jvm/functions/Function1;", "oetf", "K", "oetfFunc", "o", "I", "eotfOrig", "p", "getEotf", "eotf", "q", "H", "eotfFunc", "r", "Z", "isWideGamut", "()Z", "s", "isSrgb", "", "name", "id", "<init>", "(Ljava/lang/String;[FLNA6;[FLX51;LX51;FFLj96;I)V", "function", "(Ljava/lang/String;[FLNA6;Lj96;I)V", "gamma", "(Ljava/lang/String;[FLNA6;DFFI)V", "(LSO4;[FLNA6;)V", "t", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1396:1\n25#2,3:1397\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n915#1:1397,3\n*E\n"})
/* renamed from: SO4 */
/* loaded from: classes.dex */
public final class SO4 extends AbstractC31955Bm0 {

    /* renamed from: t */
    public static final C7419a f33593t = new C7419a(null);

    /* renamed from: u */
    public static final X51 f33594u = new X51() { // from class: LO4
        @Override // p000.X51
        /* renamed from: a */
        public final double mo77425a(double d) {
            double m85543x;
            m85543x = SO4.m85543x(d);
            return m85543x;
        }
    };

    /* renamed from: e */
    public final NA6 f33595e;

    /* renamed from: f */
    public final float f33596f;

    /* renamed from: g */
    public final float f33597g;

    /* renamed from: h */
    public final C43147j96 f33598h;

    /* renamed from: i */
    public final float[] f33599i;

    /* renamed from: j */
    public final float[] f33600j;

    /* renamed from: k */
    public final float[] f33601k;

    /* renamed from: l */
    public final X51 f33602l;

    /* renamed from: m */
    public final Function1<Double, Double> f33603m;

    /* renamed from: n */
    public final X51 f33604n;

    /* renamed from: o */
    public final X51 f33605o;

    /* renamed from: p */
    public final Function1<Double, Double> f33606p;

    /* renamed from: q */
    public final X51 f33607q;

    /* renamed from: r */
    public final boolean f33608r;

    /* renamed from: s */
    public final boolean f33609s;

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J@\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, m28432d2 = {"LSO4$a;", "", "", "primaries", "LNA6;", "whitePoint", "LX51;", "OETF", "EOTF", "", "min", "max", "", "id", "", "j", "", "point", C17296a.f69688o, "b", "f", "k", "e", "ax", "ay", "bx", "by", "i", "p1", "p2", "h", "l", "g", "DoubleIdentity", "LX51;", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: SO4$a */
    /* loaded from: classes.dex */
    public static final class C7419a {
        public /* synthetic */ C7419a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: e */
        public final float m85536e(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            if (f7 < 0.0f) {
                return -f7;
            }
            return f7;
        }

        /* renamed from: f */
        public final boolean m85535f(double d, X51 x51, X51 x512) {
            if (Math.abs(x51.mo77425a(d) - x512.mo77425a(d)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final float[] m85534g(float[] fArr, NA6 na6) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float m94262a = na6.m94262a();
            float m94261b = na6.m94261b();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (m94262a / m94261b) - f9;
            float f12 = ((f7 - f3) / f4) - f8;
            float f13 = (f5 / f6) - f9;
            float f14 = (((((f7 - m94262a) / m94261b) - f8) * f10) - (f11 * f12)) / (((((f7 - f5) / f6) - f8) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, f17 * ((1.0f - f) - f2), f18 * f3, f15, f18 * ((1.0f - f3) - f4), f19 * f5, f14, f19 * ((1.0f - f5) - f6)};
        }

        /* renamed from: h */
        public final boolean m85533h(float[] fArr, float[] fArr2) {
            float f = fArr[0] - fArr2[0];
            float f2 = fArr[1] - fArr2[1];
            float[] fArr3 = {f, f2, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (m85532i(f, f2, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < 0.0f || m85532i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || m85532i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || m85532i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || m85532i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || m85532i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public final float m85532i(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: j */
        public final boolean m85531j(float[] fArr, NA6 na6, X51 x51, X51 x512, float f, float f2, int i) {
            boolean z;
            boolean z2;
            if (i == 0) {
                return true;
            }
            C32891Fm0 c32891Fm0 = C32891Fm0.f10082a;
            if (!C32189Cm0.m111737g(fArr, c32891Fm0.m106597x()) || !C32189Cm0.m111738f(na6, C51057wW1.f116104a.m6719e())) {
                return false;
            }
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (f2 == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            SO4 m106598w = c32891Fm0.m106598w();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!m85535f(d, x51, m106598w.m85557L()) || !m85535f(d, x512, m106598w.m85560I())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: k */
        public final boolean m85530k(float[] fArr, float f, float f2) {
            float m85536e = m85536e(fArr);
            C32891Fm0 c32891Fm0 = C32891Fm0.f10082a;
            if ((m85536e / m85536e(c32891Fm0.m106602s()) > 0.9f && m85533h(fArr, c32891Fm0.m106597x())) || (f < 0.0f && f2 > 1.0f)) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public final float[] m85529l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                ArraysKt___ArraysJvmKt.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            } else {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            }
            return fArr2;
        }

        private C7419a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "x", C17296a.f69688o, "(D)Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SO4$b */
    /* loaded from: classes.dex */
    public static final class C7420b extends Lambda implements Function1<Double, Double> {
        public C7420b() {
            super(1);
        }

        /* renamed from: a */
        public final Double m85528a(double d) {
            double coerceIn;
            X51 m85560I = SO4.this.m85560I();
            coerceIn = RangesKt___RangesKt.coerceIn(d, SO4.this.f33596f, SO4.this.f33597g);
            return Double.valueOf(m85560I.mo77425a(coerceIn));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return m85528a(d.doubleValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "x", C17296a.f69688o, "(D)Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SO4$c */
    /* loaded from: classes.dex */
    public static final class C7421c extends Lambda implements Function1<Double, Double> {
        public C7421c() {
            super(1);
        }

        /* renamed from: a */
        public final Double m85527a(double d) {
            double coerceIn;
            coerceIn = RangesKt___RangesKt.coerceIn(SO4.this.m85557L().mo77425a(d), SO4.this.f33596f, SO4.this.f33597g);
            return Double.valueOf(coerceIn);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return m85527a(d.doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SO4(String name, float[] primaries, NA6 whitePoint, float[] fArr, X51 oetf, X51 eotf, float f, float f2, C43147j96 c43147j96, int i) {
        super(name, C51212wm0.f116470a.m6382b(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.f33595e = whitePoint;
        this.f33596f = f;
        this.f33597g = f2;
        this.f33598h = c43147j96;
        this.f33602l = oetf;
        this.f33603m = new C7421c();
        this.f33604n = new X51() { // from class: JO4
            @Override // p000.X51
            /* renamed from: a */
            public final double mo77425a(double d) {
                double m85554O;
                m85554O = SO4.m85554O(SO4.this, d);
                return m85554O;
            }
        };
        this.f33605o = eotf;
        this.f33606p = new C7420b();
        this.f33607q = new X51() { // from class: KO4
            @Override // p000.X51
            /* renamed from: a */
            public final double mo77425a(double d) {
                double m85562G;
                m85562G = SO4.m85562G(SO4.this, d);
                return m85562G;
            }
        };
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            C7419a c7419a = f33593t;
            float[] m85529l = c7419a.m85529l(primaries);
            this.f33599i = m85529l;
            if (fArr == null) {
                this.f33600j = c7419a.m85534g(m85529l, whitePoint);
            } else if (fArr.length == 9) {
                this.f33600j = fArr;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.f33601k = C32189Cm0.m111734j(this.f33600j);
            this.f33608r = c7419a.m85530k(m85529l, f, f2);
            this.f33609s = c7419a.m85531j(m85529l, whitePoint, oetf, eotf, f, f2, i);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    /* renamed from: A */
    public static final double m85568A(C43147j96 function, double d) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return C32189Cm0.m111727q(d, function.m31060a(), function.m31059b(), function.m31058c(), function.m31057d(), function.m31054g());
    }

    /* renamed from: B */
    public static final double m85567B(C43147j96 function, double d) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return C32189Cm0.m111726r(d, function.m31060a(), function.m31059b(), function.m31058c(), function.m31057d(), function.m31056e(), function.m31055f(), function.m31054g());
    }

    /* renamed from: C */
    public static final double m85566C(C43147j96 function, double d) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return C32189Cm0.m111725s(d, function.m31060a(), function.m31059b(), function.m31058c(), function.m31057d(), function.m31054g());
    }

    /* renamed from: D */
    public static final double m85565D(C43147j96 function, double d) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return C32189Cm0.m111724t(d, function.m31060a(), function.m31059b(), function.m31058c(), function.m31057d(), function.m31056e(), function.m31055f(), function.m31054g());
    }

    /* renamed from: G */
    public static final double m85562G(SO4 this$0, double d) {
        double coerceIn;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        X51 x51 = this$0.f33605o;
        coerceIn = RangesKt___RangesKt.coerceIn(d, this$0.f33596f, this$0.f33597g);
        return x51.mo77425a(coerceIn);
    }

    /* renamed from: O */
    public static final double m85554O(SO4 this$0, double d) {
        double coerceIn;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        coerceIn = RangesKt___RangesKt.coerceIn(this$0.f33602l.mo77425a(d), this$0.f33596f, this$0.f33597g);
        return coerceIn;
    }

    /* renamed from: x */
    public static final double m85543x(double d) {
        return d;
    }

    /* renamed from: y */
    public static final double m85542y(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* renamed from: z */
    public static final double m85541z(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* renamed from: H */
    public final X51 m85561H() {
        return this.f33607q;
    }

    /* renamed from: I */
    public final X51 m85560I() {
        return this.f33605o;
    }

    /* renamed from: J */
    public final float[] m85559J() {
        return this.f33601k;
    }

    /* renamed from: K */
    public final X51 m85558K() {
        return this.f33604n;
    }

    /* renamed from: L */
    public final X51 m85557L() {
        return this.f33602l;
    }

    /* renamed from: M */
    public final float[] m85556M() {
        return this.f33600j;
    }

    /* renamed from: N */
    public final NA6 m85555N() {
        return this.f33595e;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: b */
    public float[] mo73366b(float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        C32189Cm0.m111731m(this.f33601k, v);
        v[0] = (float) this.f33604n.mo77425a(v[0]);
        v[1] = (float) this.f33604n.mo77425a(v[1]);
        v[2] = (float) this.f33604n.mo77425a(v[2]);
        return v;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: e */
    public float mo73365e(int i) {
        return this.f33597g;
    }

    @Override // p000.AbstractC31955Bm0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SO4.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        SO4 so4 = (SO4) obj;
        if (Float.compare(so4.f33596f, this.f33596f) != 0 || Float.compare(so4.f33597g, this.f33597g) != 0 || !Intrinsics.areEqual(this.f33595e, so4.f33595e) || !Arrays.equals(this.f33599i, so4.f33599i)) {
            return false;
        }
        C43147j96 c43147j96 = this.f33598h;
        if (c43147j96 != null) {
            return Intrinsics.areEqual(c43147j96, so4.f33598h);
        }
        if (so4.f33598h == null) {
            return true;
        }
        if (!Intrinsics.areEqual(this.f33602l, so4.f33602l)) {
            return false;
        }
        return Intrinsics.areEqual(this.f33605o, so4.f33605o);
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: f */
    public float mo73364f(int i) {
        return this.f33596f;
    }

    @Override // p000.AbstractC31955Bm0
    public int hashCode() {
        boolean z;
        int i;
        int i2;
        int hashCode = ((((super.hashCode() * 31) + this.f33595e.hashCode()) * 31) + Arrays.hashCode(this.f33599i)) * 31;
        float f = this.f33596f;
        boolean z2 = true;
        int i3 = 0;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        float f2 = this.f33597g;
        if (f2 != 0.0f) {
            z2 = false;
        }
        if (!z2) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        C43147j96 c43147j96 = this.f33598h;
        if (c43147j96 != null) {
            i3 = c43147j96.hashCode();
        }
        int i6 = i5 + i3;
        if (this.f33598h == null) {
            return (((i6 * 31) + this.f33602l.hashCode()) * 31) + this.f33605o.hashCode();
        }
        return i6;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: i */
    public boolean mo85553i() {
        return this.f33609s;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: j */
    public long mo73363j(float f, float f2, float f3) {
        float mo77425a = (float) this.f33607q.mo77425a(f);
        float mo77425a2 = (float) this.f33607q.mo77425a(f2);
        float mo77425a3 = (float) this.f33607q.mo77425a(f3);
        return (Float.floatToIntBits(C32189Cm0.m111730n(this.f33600j, mo77425a, mo77425a2, mo77425a3)) << 32) | (Float.floatToIntBits(C32189Cm0.m111729o(this.f33600j, mo77425a, mo77425a2, mo77425a3)) & 4294967295L);
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: l */
    public float[] mo73362l(float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = (float) this.f33607q.mo77425a(v[0]);
        v[1] = (float) this.f33607q.mo77425a(v[1]);
        v[2] = (float) this.f33607q.mo77425a(v[2]);
        return C32189Cm0.m111731m(this.f33600j, v);
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: m */
    public float mo73361m(float f, float f2, float f3) {
        return C32189Cm0.m111728p(this.f33600j, (float) this.f33607q.mo77425a(f), (float) this.f33607q.mo77425a(f2), (float) this.f33607q.mo77425a(f3));
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: n */
    public long mo73360n(float f, float f2, float f3, float f4, AbstractC31955Bm0 colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return C50619vm0.m8180a((float) this.f33604n.mo77425a(C32189Cm0.m111730n(this.f33601k, f, f2, f3)), (float) this.f33604n.mo77425a(C32189Cm0.m111729o(this.f33601k, f, f2, f3)), (float) this.f33604n.mo77425a(C32189Cm0.m111728p(this.f33601k, f, f2, f3)), f4, colorSpace);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SO4(String name, float[] primaries, NA6 whitePoint, final C43147j96 function, int i) {
        this(name, primaries, whitePoint, null, r10, r0, 0.0f, 1.0f, function, i);
        X51 x51;
        X51 x512;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
        if (function.m31056e() == 0.0d) {
            if (function.m31055f() == 0.0d) {
                x51 = new X51() { // from class: MO4
                    @Override // p000.X51
                    /* renamed from: a */
                    public final double mo77425a(double d) {
                        double m85568A;
                        m85568A = SO4.m85568A(C43147j96.this, d);
                        return m85568A;
                    }
                };
                X51 x513 = x51;
                if (function.m31056e() != 0.0d) {
                    if (function.m31055f() == 0.0d) {
                        x512 = new X51() { // from class: OO4
                            @Override // p000.X51
                            /* renamed from: a */
                            public final double mo77425a(double d) {
                                double m85566C;
                                m85566C = SO4.m85566C(C43147j96.this, d);
                                return m85566C;
                            }
                        };
                    }
                }
                x512 = new X51() { // from class: PO4
                    @Override // p000.X51
                    /* renamed from: a */
                    public final double mo77425a(double d) {
                        double m85565D;
                        m85565D = SO4.m85565D(C43147j96.this, d);
                        return m85565D;
                    }
                };
            }
        }
        x51 = new X51() { // from class: NO4
            @Override // p000.X51
            /* renamed from: a */
            public final double mo77425a(double d) {
                double m85567B;
                m85567B = SO4.m85567B(C43147j96.this, d);
                return m85567B;
            }
        };
        X51 x5132 = x51;
        if (function.m31056e() != 0.0d) {
        }
        x512 = new X51() { // from class: PO4
            @Override // p000.X51
            /* renamed from: a */
            public final double mo77425a(double d) {
                double m85565D;
                m85565D = SO4.m85565D(C43147j96.this, d);
                return m85565D;
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SO4(String name, float[] primaries, NA6 whitePoint, final double d, float f, float f2, int i) {
        this(name, primaries, whitePoint, null, r18, r0, f, f2, new C43147j96(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
        X51 x51;
        X51 x512;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        int i2 = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
        if (i2 == 0) {
            x51 = f33594u;
        } else {
            x51 = new X51() { // from class: QO4
                @Override // p000.X51
                /* renamed from: a */
                public final double mo77425a(double d2) {
                    double m85542y;
                    m85542y = SO4.m85542y(d, d2);
                    return m85542y;
                }
            };
        }
        X51 x513 = x51;
        if (i2 == 0) {
            x512 = f33594u;
        } else {
            x512 = new X51() { // from class: RO4
                @Override // p000.X51
                /* renamed from: a */
                public final double mo77425a(double d2) {
                    double m85541z;
                    m85541z = SO4.m85541z(d, d2);
                    return m85541z;
                }
            };
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SO4(SO4 colorSpace, float[] transform, NA6 whitePoint) {
        this(colorSpace.m113508h(), colorSpace.f33599i, whitePoint, transform, colorSpace.f33602l, colorSpace.f33605o, colorSpace.f33596f, colorSpace.f33597g, colorSpace.f33598h, -1);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }
}
