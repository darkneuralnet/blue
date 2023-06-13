package p000;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\t*\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"LVg;", "", "", "width", "height", "LNW1;", "bitmapConfig", "", "hasAlpha", "LBm0;", "colorSpace", "Landroid/graphics/Bitmap;", "c", "(IIIZLBm0;)Landroid/graphics/Bitmap;", C17296a.f69688o, "(Landroid/graphics/Bitmap;)LBm0;", "Landroid/graphics/ColorSpace;", DateTokenConverter.CONVERTER_KEY, "(LBm0;)Landroid/graphics/ColorSpace;", "b", "(Landroid/graphics/ColorSpace;)LBm0;", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vg */
/* loaded from: classes.dex */
public final class C8720Vg {

    /* renamed from: a */
    public static final C8720Vg f39435a = new C8720Vg();

    private C8720Vg() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC31955Bm0 m79587a(Bitmap bitmap) {
        ColorSpace colorSpace;
        AbstractC31955Bm0 m79586b;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        colorSpace = bitmap.getColorSpace();
        if (colorSpace == null || (m79586b = m79586b(colorSpace)) == null) {
            return C32891Fm0.f10082a.m106598w();
        }
        return m79586b;
    }

    @JvmStatic
    /* renamed from: b */
    public static final AbstractC31955Bm0 m79586b(ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace.Named named2;
        ColorSpace colorSpace3;
        ColorSpace.Named named3;
        ColorSpace colorSpace4;
        ColorSpace.Named named4;
        ColorSpace colorSpace5;
        ColorSpace.Named named5;
        ColorSpace colorSpace6;
        ColorSpace.Named named6;
        ColorSpace colorSpace7;
        ColorSpace.Named named7;
        ColorSpace colorSpace8;
        ColorSpace.Named named8;
        ColorSpace colorSpace9;
        ColorSpace.Named named9;
        ColorSpace colorSpace10;
        ColorSpace.Named named10;
        ColorSpace colorSpace11;
        ColorSpace.Named named11;
        ColorSpace colorSpace12;
        ColorSpace.Named named12;
        ColorSpace colorSpace13;
        ColorSpace.Named named13;
        ColorSpace colorSpace14;
        ColorSpace.Named named14;
        ColorSpace colorSpace15;
        ColorSpace.Named named15;
        ColorSpace colorSpace16;
        ColorSpace.Named named16;
        ColorSpace colorSpace17;
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        named = ColorSpace.Named.SRGB;
        colorSpace2 = ColorSpace.get(named);
        if (Intrinsics.areEqual(colorSpace, colorSpace2)) {
            return C32891Fm0.f10082a.m106598w();
        }
        named2 = ColorSpace.Named.ACES;
        colorSpace3 = ColorSpace.get(named2);
        if (Intrinsics.areEqual(colorSpace, colorSpace3)) {
            return C32891Fm0.f10082a.m106616e();
        }
        named3 = ColorSpace.Named.ACESCG;
        colorSpace4 = ColorSpace.get(named3);
        if (Intrinsics.areEqual(colorSpace, colorSpace4)) {
            return C32891Fm0.f10082a.m106615f();
        }
        named4 = ColorSpace.Named.ADOBE_RGB;
        colorSpace5 = ColorSpace.get(named4);
        if (Intrinsics.areEqual(colorSpace, colorSpace5)) {
            return C32891Fm0.f10082a.m106614g();
        }
        named5 = ColorSpace.Named.BT2020;
        colorSpace6 = ColorSpace.get(named5);
        if (Intrinsics.areEqual(colorSpace, colorSpace6)) {
            return C32891Fm0.f10082a.m106613h();
        }
        named6 = ColorSpace.Named.BT709;
        colorSpace7 = ColorSpace.get(named6);
        if (Intrinsics.areEqual(colorSpace, colorSpace7)) {
            return C32891Fm0.f10082a.m106612i();
        }
        named7 = ColorSpace.Named.CIE_LAB;
        colorSpace8 = ColorSpace.get(named7);
        if (Intrinsics.areEqual(colorSpace, colorSpace8)) {
            return C32891Fm0.f10082a.m106611j();
        }
        named8 = ColorSpace.Named.CIE_XYZ;
        colorSpace9 = ColorSpace.get(named8);
        if (Intrinsics.areEqual(colorSpace, colorSpace9)) {
            return C32891Fm0.f10082a.m106610k();
        }
        named9 = ColorSpace.Named.DCI_P3;
        colorSpace10 = ColorSpace.get(named9);
        if (Intrinsics.areEqual(colorSpace, colorSpace10)) {
            return C32891Fm0.f10082a.m106608m();
        }
        named10 = ColorSpace.Named.DISPLAY_P3;
        colorSpace11 = ColorSpace.get(named10);
        if (Intrinsics.areEqual(colorSpace, colorSpace11)) {
            return C32891Fm0.f10082a.m106607n();
        }
        named11 = ColorSpace.Named.EXTENDED_SRGB;
        colorSpace12 = ColorSpace.get(named11);
        if (Intrinsics.areEqual(colorSpace, colorSpace12)) {
            return C32891Fm0.f10082a.m106606o();
        }
        named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        colorSpace13 = ColorSpace.get(named12);
        if (Intrinsics.areEqual(colorSpace, colorSpace13)) {
            return C32891Fm0.f10082a.m106605p();
        }
        named13 = ColorSpace.Named.LINEAR_SRGB;
        colorSpace14 = ColorSpace.get(named13);
        if (Intrinsics.areEqual(colorSpace, colorSpace14)) {
            return C32891Fm0.f10082a.m106604q();
        }
        named14 = ColorSpace.Named.NTSC_1953;
        colorSpace15 = ColorSpace.get(named14);
        if (Intrinsics.areEqual(colorSpace, colorSpace15)) {
            return C32891Fm0.f10082a.m106603r();
        }
        named15 = ColorSpace.Named.PRO_PHOTO_RGB;
        colorSpace16 = ColorSpace.get(named15);
        if (Intrinsics.areEqual(colorSpace, colorSpace16)) {
            return C32891Fm0.f10082a.m106600u();
        }
        named16 = ColorSpace.Named.SMPTE_C;
        colorSpace17 = ColorSpace.get(named16);
        if (Intrinsics.areEqual(colorSpace, colorSpace17)) {
            return C32891Fm0.f10082a.m106599v();
        }
        return C32891Fm0.f10082a.m106598w();
    }

    @JvmStatic
    /* renamed from: c */
    public static final Bitmap m79585c(int i, int i2, int i3, boolean z, AbstractC31955Bm0 colorSpace) {
        Bitmap createBitmap;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, C6809Qc.m88361d(i3), z, m79584d(colorSpace));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return createBitmap;
    }

    @JvmStatic
    /* renamed from: d */
    public static final ColorSpace m79584d(AbstractC31955Bm0 abstractC31955Bm0) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Intrinsics.checkNotNullParameter(abstractC31955Bm0, "<this>");
        C32891Fm0 c32891Fm0 = C32891Fm0.f10082a;
        if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106598w())) {
            named = ColorSpace.Named.SRGB;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106616e())) {
            named = ColorSpace.Named.ACES;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106615f())) {
            named = ColorSpace.Named.ACESCG;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106614g())) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106613h())) {
            named = ColorSpace.Named.BT2020;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106612i())) {
            named = ColorSpace.Named.BT709;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106611j())) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106610k())) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106608m())) {
            named = ColorSpace.Named.DCI_P3;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106607n())) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106606o())) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106605p())) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106604q())) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106603r())) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106600u())) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else if (Intrinsics.areEqual(abstractC31955Bm0, c32891Fm0.m106599v())) {
            named = ColorSpace.Named.SMPTE_C;
        } else {
            named = ColorSpace.Named.SRGB;
        }
        colorSpace = ColorSpace.get(named);
        Intrinsics.checkNotNullExpressionValue(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
