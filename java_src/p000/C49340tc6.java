package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p000.C32514Dw1;
import p000.C34386Lw1;
/* renamed from: tc6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49340tc6 extends C49933uc6 {
    /* renamed from: l */
    public static int m12008l(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        int i;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        if (slant == slant2) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override // p000.C49933uc6
    /* renamed from: b */
    public Typeface mo9961b(Context context, C32514Dw1.C1671c c1671c, Resources resources, int i) {
        C32514Dw1.C1672d[] m109610a;
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        int i2;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            FontFamily.Builder builder = null;
            for (C32514Dw1.C1672d c1672d : c1671c.m109610a()) {
                try {
                    C38650bc6.m64272a();
                    weight = C37244Yb6.m74826a(resources, c1672d.m109608b()).setWeight(c1672d.m109605e());
                    if (c1672d.m109604f()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    slant = weight.setSlant(i2);
                    ttcIndex = slant.setTtcIndex(c1672d.m109607c());
                    fontVariationSettings = ttcIndex.setFontVariationSettings(c1672d.m109606d());
                    build3 = fontVariationSettings.build();
                    if (builder == null) {
                        C39243cc6.m61170a();
                        builder = C37478Zb6.m72898a(build3);
                    } else {
                        builder.addFont(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            C38057ac6.m71013a();
            Typeface.CustomFallbackBuilder m76803a = C37010Xb6.m76803a(build);
            style = m12009k(build, i).getStyle();
            style2 = m76803a.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000.C49933uc6
    /* renamed from: c */
    public Typeface mo9960c(Context context, CancellationSignal cancellationSignal, C34386Lw1.C5132b[] c5132bArr, int i) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        ParcelFileDescriptor openFileDescriptor;
        Font.Builder weight;
        int i2;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build3;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C34386Lw1.C5132b c5132b : c5132bArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c5132b.m96108d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        C38650bc6.m64272a();
                        weight = C39854dc6.m44019a(openFileDescriptor).setWeight(c5132b.m96107e());
                        if (c5132b.m96106f()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        slant = weight.setSlant(i2);
                        ttcIndex = slant.setTtcIndex(c5132b.m96109c());
                        build3 = ttcIndex.build();
                        if (builder == null) {
                            C39243cc6.m61170a();
                            builder = C37478Zb6.m72898a(build3);
                        } else {
                            builder.addFont(build3);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            C38057ac6.m71013a();
            Typeface.CustomFallbackBuilder m76803a = C37010Xb6.m76803a(build);
            style = m12009k(build, i).getStyle();
            style2 = m76803a.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000.C49933uc6
    /* renamed from: d */
    public Typeface mo9959d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p000.C49933uc6
    /* renamed from: e */
    public Typeface mo9958e(Context context, Resources resources, int i, String str, int i2) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            C38650bc6.m64272a();
            build = C37244Yb6.m74826a(resources, i).build();
            C39243cc6.m61170a();
            build2 = C37478Zb6.m72898a(build).build();
            C38057ac6.m71013a();
            Typeface.CustomFallbackBuilder m76803a = C37010Xb6.m76803a(build2);
            style = build.getStyle();
            style2 = m76803a.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.C49933uc6
    /* renamed from: i */
    public C34386Lw1.C5132b mo9954i(C34386Lw1.C5132b[] c5132bArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0029 */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Font m12009k(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        Font font;
        FontStyle style;
        int size;
        Font font2;
        FontStyle style2;
        C41039fc6.m41107a();
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle m42709a = C40446ec6.m42709a(i2, i3);
        font = fontFamily.getFont(0);
        style = font.getStyle();
        int m12008l = m12008l(m42709a, style);
        for (int i4 = 1; i4 < size; i4++) {
            font2 = fontFamily.getFont(i4);
            style2 = font2.getStyle();
            int m12008l2 = m12008l(m42709a, style2);
            if (m12008l2 < m12008l) {
                font = font2;
                m12008l = m12008l2;
            }
        }
        return font;
    }
}
