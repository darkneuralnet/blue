package p000;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.LS5;
import p000.NS5;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0002\u001a\b\u0010\u0004\u001a\u00020\u0002H\u0000\u001a%\u0010\t\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\r\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\u0010\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010\u0012\u001a\u00020\u0011*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0017\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u0016H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\n\u001a\u0010\u0010\u0018\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\u0019\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010\u001b\u001a\u00020\u001a*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u001aH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\n\u001a\u001a\u0010\u001f\u001a\u00020\u001e*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001c\u001a%\u0010 \u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u001eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\n\u001a\u0010\u0010!\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\"\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010$\u001a\u00020#*\u00060\u0002j\u0002`\u0005H\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u001c\u001a%\u0010%\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\f\u001a\u00020#H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\n\u001a \u0010(\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u000e\u0010\f\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0000\u001a\u001a\u0010*\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\b\u0010\f\u001a\u0004\u0018\u00010)H\u0000*\n\u0010+\"\u00020\u00022\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, m28432d2 = {"LkE3;", C17296a.f69688o, "Landroid/graphics/Paint;", "v", "i", "Landroidx/compose/ui/graphics/NativePaint;", "LLW;", "mode", "", "k", "(Landroid/graphics/Paint;I)V", "Lsm0;", "value", "m", "", "b", "j", "Lpm0;", "c", "(Landroid/graphics/Paint;)J", "l", "(Landroid/graphics/Paint;J)V", "LqE3;", "u", "h", "t", "LLS5;", "e", "(Landroid/graphics/Paint;)I", "q", "LNS5;", "f", "r", "g", "s", "LRl1;", DateTokenConverter.CONVERTER_KEY, "n", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "p", "LiJ3;", "o", "NativePaint", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: hd */
/* loaded from: classes.dex */
public final class C22702hd {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hd$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C22703a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* renamed from: a */
    public static final InterfaceC43783kE3 m36156a() {
        return new C22393gd();
    }

    /* renamed from: b */
    public static final float m36155b(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    /* renamed from: c */
    public static final long m36154c(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return C50619vm0.m8179b(paint.getColor());
    }

    /* renamed from: d */
    public static final int m36153d(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return C35691Rl1.f32551a.m86327b();
        }
        return C35691Rl1.f32551a.m86328a();
    }

    /* renamed from: e */
    public static final int m36152e(Paint paint) {
        int i;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = C22703a.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return LS5.f21441b.m96920a();
                }
                return LS5.f21441b.m96918c();
            }
            return LS5.f21441b.m96919b();
        }
        return LS5.f21441b.m96920a();
    }

    /* renamed from: f */
    public static final int m36151f(Paint paint) {
        int i;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = C22703a.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return NS5.f24612b.m93878b();
                }
                return NS5.f24612b.m93877c();
            }
            return NS5.f24612b.m93879a();
        }
        return NS5.f24612b.m93878b();
    }

    /* renamed from: g */
    public static final float m36150g(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeMiter();
    }

    /* renamed from: h */
    public static final float m36149h(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeWidth();
    }

    /* renamed from: i */
    public static final Paint m36148i() {
        return new Paint(7);
    }

    /* renamed from: j */
    public static final void m36147j(Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    /* renamed from: k */
    public static final void m36146k(Paint setNativeBlendMode, int i) {
        Intrinsics.checkNotNullParameter(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            C42034hH6.f84964a.m36561a(setNativeBlendMode, i);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(C9817Yb.m74839b(i)));
        }
    }

    /* renamed from: l */
    public static final void m36145l(Paint setNativeColor, long j) {
        Intrinsics.checkNotNullParameter(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(C50619vm0.m8173h(j));
    }

    /* renamed from: m */
    public static final void m36144m(Paint paint, C48841sm0 c48841sm0) {
        ColorFilter colorFilter;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        if (c48841sm0 != null) {
            colorFilter = C20473fc.m41121b(c48841sm0);
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    /* renamed from: n */
    public static final void m36143n(Paint setNativeFilterQuality, int i) {
        Intrinsics.checkNotNullParameter(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!C35691Rl1.m86331d(i, C35691Rl1.f32551a.m86327b()));
    }

    /* renamed from: o */
    public static final void m36142o(Paint paint, InterfaceC42642iJ3 interfaceC42642iJ3) {
        PathEffect pathEffect;
        Intrinsics.checkNotNullParameter(paint, "<this>");
        C27322pd c27322pd = (C27322pd) interfaceC42642iJ3;
        if (c27322pd != null) {
            pathEffect = c27322pd.m19057a();
        } else {
            pathEffect = null;
        }
        paint.setPathEffect(pathEffect);
    }

    /* renamed from: p */
    public static final void m36141p(Paint paint, Shader shader) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setShader(shader);
    }

    /* renamed from: q */
    public static final void m36140q(Paint setNativeStrokeCap, int i) {
        Paint.Cap cap;
        Intrinsics.checkNotNullParameter(setNativeStrokeCap, "$this$setNativeStrokeCap");
        LS5.C4927a c4927a = LS5.f21441b;
        if (LS5.m96924g(i, c4927a.m96918c())) {
            cap = Paint.Cap.SQUARE;
        } else if (LS5.m96924g(i, c4927a.m96919b())) {
            cap = Paint.Cap.ROUND;
        } else if (LS5.m96924g(i, c4927a.m96920a())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        setNativeStrokeCap.setStrokeCap(cap);
    }

    /* renamed from: r */
    public static final void m36139r(Paint setNativeStrokeJoin, int i) {
        Paint.Join join;
        Intrinsics.checkNotNullParameter(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        NS5.C5579a c5579a = NS5.f24612b;
        if (NS5.m93883g(i, c5579a.m93878b())) {
            join = Paint.Join.MITER;
        } else if (NS5.m93883g(i, c5579a.m93879a())) {
            join = Paint.Join.BEVEL;
        } else if (NS5.m93883g(i, c5579a.m93877c())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        setNativeStrokeJoin.setStrokeJoin(join);
    }

    /* renamed from: s */
    public static final void m36138s(Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    /* renamed from: t */
    public static final void m36137t(Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* renamed from: u */
    public static final void m36136u(Paint setNativeStyle, int i) {
        Paint.Style style;
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        if (C47341qE3.m17856d(i, C47341qE3.f104958a.m17854b())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        setNativeStyle.setStyle(style);
    }

    /* renamed from: v */
    public static final InterfaceC43783kE3 m36135v(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return new C22393gd(paint);
    }
}
