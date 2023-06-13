package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p056ws.WebSocketProtocol;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0017\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u0019\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0002\u001a\u0019\u0010\u001d\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m28432d2 = {"", "red", "green", "blue", "alpha", "LBm0;", "colorSpace", "Lpm0;", C17296a.f69688o, "(FFFFLBm0;)J", "", "color", "b", "(I)J", "", "c", "(J)J", "start", "stop", "fraction", "e", "(JJF)J", "background", DateTokenConverter.CONVERTER_KEY, "(JJ)J", "f", "(J)F", "v", "g", "h", "(J)I", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,659:1\n587#1:660\n587#1:661\n587#1:662\n646#1:663\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:660\n568#1:661\n569#1:662\n658#1:663\n*E\n"})
/* renamed from: vm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50619vm0 {
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m8180a(float f, float f2, float f3, float f4, AbstractC31955Bm0 colorSpace) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        boolean z7 = false;
        float mo73364f = colorSpace.mo73364f(0);
        if (f <= colorSpace.mo73365e(0) && mo73364f <= f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float mo73364f2 = colorSpace.mo73364f(1);
            if (f2 <= colorSpace.mo73365e(1) && mo73364f2 <= f2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                float mo73364f3 = colorSpace.mo73364f(2);
                if (f3 <= colorSpace.mo73365e(2) && mo73364f3 <= f3) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (0.0f <= f4 && f4 <= 1.0f) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        z2 = true;
                        if (!z2) {
                            if (colorSpace.mo85553i()) {
                                return C47063pm0.m18746j(ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                            }
                            if (colorSpace.m113511c() == 3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                int m113510d = colorSpace.m113510d();
                                if (m113510d != -1) {
                                    z7 = true;
                                }
                                if (z7) {
                                    short m40582a = C41214fu1.m40582a(f);
                                    return C47063pm0.m18746j(ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl(C41214fu1.m40582a(f2)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl(m40582a) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl(C41214fu1.m40582a(f3)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m116957constructorimpl(ULong.m116957constructorimpl(m113510d) & 63)));
                                }
                                throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                            }
                            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                        }
                        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
                    }
                }
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    /* renamed from: b */
    public static final long m8179b(int i) {
        return C47063pm0.m18746j(ULong.m116957constructorimpl(ULong.m116957constructorimpl(i) << 32));
    }

    /* renamed from: c */
    public static final long m8178c(long j) {
        return C47063pm0.m18746j(ULong.m116957constructorimpl(ULong.m116957constructorimpl(ULong.m116957constructorimpl(j) & 4294967295L) << 32));
    }

    /* renamed from: d */
    public static final long m8177d(long j, long j2) {
        boolean z;
        float f;
        boolean z2;
        float f2;
        long m18745k = C47063pm0.m18745k(j, C47063pm0.m18738r(j2));
        float m18740p = C47063pm0.m18740p(j2);
        float m18740p2 = C47063pm0.m18740p(m18745k);
        float f3 = 1.0f - m18740p2;
        float f4 = (m18740p * f3) + m18740p2;
        float m18736t = C47063pm0.m18736t(m18745k);
        float m18736t2 = C47063pm0.m18736t(j2);
        float f5 = 0.0f;
        int i = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        boolean z3 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = ((m18736t * m18740p2) + ((m18736t2 * m18740p) * f3)) / f4;
        }
        float m18737s = C47063pm0.m18737s(m18745k);
        float m18737s2 = C47063pm0.m18737s(j2);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = ((m18737s * m18740p2) + ((m18737s2 * m18740p) * f3)) / f4;
        }
        float m18739q = C47063pm0.m18739q(m18745k);
        float m18739q2 = C47063pm0.m18739q(j2);
        if (i != 0) {
            z3 = false;
        }
        if (!z3) {
            f5 = ((m18739q * m18740p2) + ((m18739q2 * m18740p) * f3)) / f4;
        }
        return m8180a(f, f2, f5, f4, C47063pm0.m18738r(j2));
    }

    /* renamed from: e */
    public static final long m8176e(long j, long j2, float f) {
        AbstractC31955Bm0 m106601t = C32891Fm0.f10082a.m106601t();
        long m18745k = C47063pm0.m18745k(j, m106601t);
        long m18745k2 = C47063pm0.m18745k(j2, m106601t);
        float m18740p = C47063pm0.m18740p(m18745k);
        float m18736t = C47063pm0.m18736t(m18745k);
        float m18737s = C47063pm0.m18737s(m18745k);
        float m18739q = C47063pm0.m18739q(m18745k);
        float m18740p2 = C47063pm0.m18740p(m18745k2);
        float m18736t2 = C47063pm0.m18736t(m18745k2);
        float m18737s2 = C47063pm0.m18737s(m18745k2);
        float m18739q2 = C47063pm0.m18739q(m18745k2);
        return C47063pm0.m18745k(m8180a(YM2.m75146a(m18736t, m18736t2, f), YM2.m75146a(m18737s, m18737s2, f), YM2.m75146a(m18739q, m18739q2, f), YM2.m75146a(m18740p, m18740p2, f), m106601t), C47063pm0.m18738r(j2));
    }

    /* renamed from: f */
    public static final float m8175f(long j) {
        AbstractC31955Bm0 m18738r = C47063pm0.m18738r(j);
        if (C51212wm0.m6387e(m18738r.m113509g(), C51212wm0.f116470a.m6382b())) {
            Intrinsics.checkNotNull(m18738r, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            X51 m85561H = ((SO4) m18738r).m85561H();
            return m8174g((float) ((m85561H.mo77425a(C47063pm0.m18736t(j)) * 0.2126d) + (m85561H.mo77425a(C47063pm0.m18737s(j)) * 0.7152d) + (m85561H.mo77425a(C47063pm0.m18739q(j)) * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) C51212wm0.m6384h(m18738r.m113509g()))).toString());
    }

    /* renamed from: g */
    public static final float m8174g(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    /* renamed from: h */
    public static final int m8173h(long j) {
        return (int) ULong.m116957constructorimpl(C47063pm0.m18745k(j, C32891Fm0.f10082a.m106598w()) >>> 32);
    }
}
