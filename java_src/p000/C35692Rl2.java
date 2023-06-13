package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"LRl2;", "LBm0;", "", "component", "", "f", "e", "", "v", "l", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", C17296a.f69688o, "colorSpace", "Lpm0;", "n", "(FFFFLBm0;)J", "b", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,140:1\n25#2,3:141\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:141,3\n*E\n"})
/* renamed from: Rl2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35692Rl2 extends AbstractC31955Bm0 {

    /* renamed from: e */
    public static final C7268a f32556e = new C7268a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"LRl2$a;", "", "", "A", "F", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Rl2$a */
    /* loaded from: classes.dex */
    public static final class C7268a {
        public /* synthetic */ C7268a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7268a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35692Rl2(String name, int i) {
        super(name, C51212wm0.f116470a.m6383a(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: b */
    public float[] mo73366b(float[] v) {
        float f;
        float f2;
        float f3;
        float coerceIn;
        float coerceIn2;
        float coerceIn3;
        Intrinsics.checkNotNullParameter(v, "v");
        float f4 = v[0];
        C51057wW1 c51057wW1 = C51057wW1.f116104a;
        float f5 = f4 / c51057wW1.m6721c()[0];
        float f6 = v[1] / c51057wW1.m6721c()[1];
        float f7 = v[2] / c51057wW1.m6721c()[2];
        if (f5 > 0.008856452f) {
            f = (float) Math.pow(f5, 0.33333334f);
        } else {
            f = (f5 * 7.787037f) + 0.13793103f;
        }
        if (f6 > 0.008856452f) {
            f2 = (float) Math.pow(f6, 0.33333334f);
        } else {
            f2 = (f6 * 7.787037f) + 0.13793103f;
        }
        if (f7 > 0.008856452f) {
            f3 = (float) Math.pow(f7, 0.33333334f);
        } else {
            f3 = (f7 * 7.787037f) + 0.13793103f;
        }
        coerceIn = RangesKt___RangesKt.coerceIn((116.0f * f2) - 16.0f, 0.0f, 100.0f);
        v[0] = coerceIn;
        coerceIn2 = RangesKt___RangesKt.coerceIn((f - f2) * 500.0f, -128.0f, 128.0f);
        v[1] = coerceIn2;
        coerceIn3 = RangesKt___RangesKt.coerceIn((f2 - f3) * 200.0f, -128.0f, 128.0f);
        v[2] = coerceIn3;
        return v;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: e */
    public float mo73365e(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: f */
    public float mo73364f(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: j */
    public long mo73363j(float f, float f2, float f3) {
        float coerceIn;
        float coerceIn2;
        float f4;
        float f5;
        coerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 100.0f);
        coerceIn2 = RangesKt___RangesKt.coerceIn(f, -128.0f, 128.0f);
        float f6 = (coerceIn + 16.0f) / 116.0f;
        float f7 = (coerceIn2 * 0.002f) + f6;
        if (f7 > 0.20689656f) {
            f4 = f7 * f7 * f7;
        } else {
            f4 = (f7 - 0.13793103f) * 0.12841855f;
        }
        if (f6 > 0.20689656f) {
            f5 = f6 * f6 * f6;
        } else {
            f5 = (f6 - 0.13793103f) * 0.12841855f;
        }
        C51057wW1 c51057wW1 = C51057wW1.f116104a;
        return (Float.floatToIntBits(f4 * c51057wW1.m6721c()[0]) << 32) | (Float.floatToIntBits(f5 * c51057wW1.m6721c()[1]) & 4294967295L);
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: l */
    public float[] mo73362l(float[] v) {
        float coerceIn;
        float coerceIn2;
        float coerceIn3;
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(v, "v");
        coerceIn = RangesKt___RangesKt.coerceIn(v[0], 0.0f, 100.0f);
        v[0] = coerceIn;
        coerceIn2 = RangesKt___RangesKt.coerceIn(v[1], -128.0f, 128.0f);
        v[1] = coerceIn2;
        coerceIn3 = RangesKt___RangesKt.coerceIn(v[2], -128.0f, 128.0f);
        v[2] = coerceIn3;
        float f4 = (v[0] + 16.0f) / 116.0f;
        float f5 = (v[1] * 0.002f) + f4;
        float f6 = f4 - (coerceIn3 * 0.005f);
        if (f5 > 0.20689656f) {
            f = f5 * f5 * f5;
        } else {
            f = (f5 - 0.13793103f) * 0.12841855f;
        }
        if (f4 > 0.20689656f) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = (f4 - 0.13793103f) * 0.12841855f;
        }
        if (f6 > 0.20689656f) {
            f3 = f6 * f6 * f6;
        } else {
            f3 = (f6 - 0.13793103f) * 0.12841855f;
        }
        C51057wW1 c51057wW1 = C51057wW1.f116104a;
        v[0] = f * c51057wW1.m6721c()[0];
        v[1] = f2 * c51057wW1.m6721c()[1];
        v[2] = f3 * c51057wW1.m6721c()[2];
        return v;
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: m */
    public float mo73361m(float f, float f2, float f3) {
        float coerceIn;
        float coerceIn2;
        float f4;
        coerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 100.0f);
        coerceIn2 = RangesKt___RangesKt.coerceIn(f3, -128.0f, 128.0f);
        float f5 = ((coerceIn + 16.0f) / 116.0f) - (coerceIn2 * 0.005f);
        if (f5 > 0.20689656f) {
            f4 = f5 * f5 * f5;
        } else {
            f4 = 0.12841855f * (f5 - 0.13793103f);
        }
        return f4 * C51057wW1.f116104a.m6721c()[2];
    }

    @Override // p000.AbstractC31955Bm0
    /* renamed from: n */
    public long mo73360n(float f, float f2, float f3, float f4, AbstractC31955Bm0 colorSpace) {
        float f5;
        float f6;
        float f7;
        float coerceIn;
        float coerceIn2;
        float coerceIn3;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        C51057wW1 c51057wW1 = C51057wW1.f116104a;
        float f8 = f / c51057wW1.m6721c()[0];
        float f9 = f2 / c51057wW1.m6721c()[1];
        float f10 = f3 / c51057wW1.m6721c()[2];
        if (f8 > 0.008856452f) {
            f5 = (float) Math.pow(f8, 0.33333334f);
        } else {
            f5 = (f8 * 7.787037f) + 0.13793103f;
        }
        if (f9 > 0.008856452f) {
            f6 = (float) Math.pow(f9, 0.33333334f);
        } else {
            f6 = (f9 * 7.787037f) + 0.13793103f;
        }
        if (f10 > 0.008856452f) {
            f7 = (float) Math.pow(f10, 0.33333334f);
        } else {
            f7 = (f10 * 7.787037f) + 0.13793103f;
        }
        coerceIn = RangesKt___RangesKt.coerceIn((116.0f * f6) - 16.0f, 0.0f, 100.0f);
        coerceIn2 = RangesKt___RangesKt.coerceIn((f5 - f6) * 500.0f, -128.0f, 128.0f);
        coerceIn3 = RangesKt___RangesKt.coerceIn((f6 - f7) * 200.0f, -128.0f, 128.0f);
        return C50619vm0.m8180a(coerceIn, coerceIn2, coerceIn3, f4, colorSpace);
    }
}
