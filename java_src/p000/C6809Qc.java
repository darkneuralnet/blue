package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.NW1;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a=\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\n\u0010\u000e\u001a\u00020\u0000*\u00020\u0001\u001a\u0019\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\u0006*\u00020\u000fH\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"Landroid/graphics/Bitmap;", "LMW1;", "c", "", "width", "height", "LNW1;", "config", "", "hasAlpha", "LBm0;", "colorSpace", C17296a.f69688o, "(IIIZLBm0;)LMW1;", "b", "Landroid/graphics/Bitmap$Config;", DateTokenConverter.CONVERTER_KEY, "(I)Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Qc */
/* loaded from: classes.dex */
public final class C6809Qc {
    /* renamed from: a */
    public static final MW1 m88364a(int i, int i2, int i3, boolean z, AbstractC31955Bm0 colorSpace) {
        Bitmap createBitmap;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap.Config m88361d = m88361d(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = C8720Vg.m79585c(i, i2, i3, z, colorSpace);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, m88361d);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            createBitmap.setHasAlpha(z);
        }
        return new C5612Nc(createBitmap);
    }

    /* renamed from: b */
    public static final Bitmap m88363b(MW1 mw1) {
        Intrinsics.checkNotNullParameter(mw1, "<this>");
        if (mw1 instanceof C5612Nc) {
            return ((C5612Nc) mw1).m93707c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: c */
    public static final MW1 m88362c(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new C5612Nc(bitmap);
    }

    /* renamed from: d */
    public static final Bitmap.Config m88361d(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        NW1.C5598a c5598a = NW1.f24729b;
        if (NW1.m93822i(i, c5598a.m93817b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (NW1.m93822i(i, c5598a.m93818a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (NW1.m93822i(i, c5598a.m93814e())) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && NW1.m93822i(i, c5598a.m93816c())) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        } else if (i2 >= 26 && NW1.m93822i(i, c5598a.m93815d())) {
            config = Bitmap.Config.HARDWARE;
            return config;
        } else {
            return Bitmap.Config.ARGB_8888;
        }
    }

    /* renamed from: e */
    public static final int m88360e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return NW1.f24729b.m93818a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return NW1.f24729b.m93814e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return NW1.f24729b.m93817b();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return NW1.f24729b.m93816c();
            }
        }
        if (i >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return NW1.f24729b.m93815d();
            }
        }
        return NW1.f24729b.m93817b();
    }
}
