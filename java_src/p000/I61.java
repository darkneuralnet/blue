package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 R2\u00020\u0001:\u0001SJ!\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006Jm\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J[\u0010\u001d\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ[\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"JQ\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&Jy\u0010/\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020)2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020-H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100Je\u00103\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104Je\u00105\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J[\u00109\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:Js\u0010?\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@JO\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020A2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DJO\u0010E\u001a\u00020\u00162\u0006\u0010B\u001a\u00020A2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001d\u00108\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001d\u0010\u001a\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bM\u0010LR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010Pø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006TÀ\u0006\u0003"}, m28432d2 = {"LI61;", "Lg01;", "LxB5;", "LCe3;", "offset", "Q0", "(JJ)J", "La30;", "brush", "start", "end", "", "strokeWidth", "LLS5;", "cap", "LiJ3;", "pathEffect", "alpha", "Lsm0;", "colorFilter", "LLW;", "blendMode", "", "K", "(La30;JJFILiJ3;FLsm0;I)V", "topLeft", "size", "LJ61;", "style", "m0", "(La30;JJFLJ61;Lsm0;I)V", "Lpm0;", "color", "k0", "(JJJFLJ61;Lsm0;I)V", "LMW1;", Entry.TYPE_IMAGE, "i0", "(LMW1;JFLJ61;Lsm0;I)V", "LA52;", "srcOffset", "LG52;", "srcSize", "dstOffset", "dstSize", "LRl1;", "filterQuality", "N0", "(LMW1;JJJJFLJ61;Lsm0;II)V", "LLC0;", "cornerRadius", "R", "(La30;JJJFLJ61;Lsm0;I)V", "W0", "(JJJJLJ61;FLsm0;I)V", "radius", "center", "I", "(JFJFLJ61;Lsm0;I)V", "startAngle", "sweepAngle", "", "useCenter", AbstractC26684u0.f100690q, "(JFFZJJFLJ61;Lsm0;I)V", "LcJ3;", "path", "Z", "(LcJ3;JFLJ61;Lsm0;I)V", "j0", "(LcJ3;La30;FLJ61;Lsm0;I)V", "LC61;", "d0", "()LC61;", "drawContext", "l0", "()J", "h", "Lpm2;", "getLayoutDirection", "()Lpm2;", "layoutDirection", "O", C17296a.f69688o, "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: I61 */
/* loaded from: classes.dex */
public interface I61 extends InterfaceC41273g01 {

    /* renamed from: O */
    public static final C3326a f14524O = C3326a.f14525a;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, m28432d2 = {"LI61$a;", "", "LLW;", "b", "I", C17296a.f69688o, "()I", "DefaultBlendMode", "LRl1;", "c", "DefaultFilterQuality", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: I61$a */
    /* loaded from: classes.dex */
    public static final class C3326a {

        /* renamed from: a */
        public static final /* synthetic */ C3326a f14525a = new C3326a();

        /* renamed from: b */
        public static final int f14526b = C5016LW.f21593b.m96748B();

        /* renamed from: c */
        public static final int f14527c = C35691Rl1.f32551a.m86328a();

        private C3326a() {
        }

        /* renamed from: a */
        public final int m102944a() {
            return f14526b;
        }

        /* renamed from: b */
        public final int m102943b() {
            return f14527c;
        }
    }

    /* renamed from: E0 */
    static /* synthetic */ void m102956E0(I61 i61, InterfaceC39067cJ3 interfaceC39067cJ3, long j, float f, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        float f2;
        C52982zl1 c52982zl1;
        C48841sm0 c48841sm02;
        int i3;
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                c52982zl1 = C52982zl1.f122162a;
            } else {
                c52982zl1 = j61;
            }
            if ((i2 & 16) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i2 & 32) != 0) {
                i3 = f14524O.m102944a();
            } else {
                i3 = i;
            }
            i61.mo20753Z(interfaceC39067cJ3, j, f2, c52982zl1, c48841sm02, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    /* renamed from: J */
    static /* synthetic */ void m102955J(I61 i61, long j, float f, long j2, float f2, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        float f3;
        long j3;
        float f4;
        C52982zl1 c52982zl1;
        C48841sm0 c48841sm02;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f3 = C51465xB5.m5731h(i61.mo96360h()) / 2.0f;
            } else {
                f3 = f;
            }
            if ((i2 & 4) != 0) {
                j3 = i61.mo96359l0();
            } else {
                j3 = j2;
            }
            if ((i2 & 8) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i2 & 16) != 0) {
                c52982zl1 = C52982zl1.f122162a;
            } else {
                c52982zl1 = j61;
            }
            if ((i2 & 32) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i2 & 64) != 0) {
                i3 = f14524O.m102944a();
            } else {
                i3 = i;
            }
            i61.mo20758I(j, f3, j3, f4, c52982zl1, c48841sm02, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    /* renamed from: J0 */
    static /* synthetic */ void m102954J0(I61 i61, InterfaceC39067cJ3 interfaceC39067cJ3, AbstractC37727a30 abstractC37727a30, float f, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                j61 = C52982zl1.f122162a;
            }
            J61 j612 = j61;
            if ((i2 & 16) != 0) {
                c48841sm0 = null;
            }
            C48841sm0 c48841sm02 = c48841sm0;
            if ((i2 & 32) != 0) {
                i = f14524O.m102944a();
            }
            i61.mo20745j0(interfaceC39067cJ3, abstractC37727a30, f2, j612, c48841sm02, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    /* renamed from: K0 */
    static /* synthetic */ void m102953K0(I61 i61, MW1 mw1, long j, long j2, long j3, long j4, float f, J61 j61, C48841sm0 c48841sm0, int i, int i2, int i3, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f2;
        J61 j612;
        C48841sm0 c48841sm02;
        int i4;
        int i5;
        if (obj == null) {
            if ((i3 & 2) != 0) {
                j5 = A52.f130b.m116106a();
            } else {
                j5 = j;
            }
            if ((i3 & 4) != 0) {
                j6 = H52.m104430a(mw1.getWidth(), mw1.getHeight());
            } else {
                j6 = j2;
            }
            if ((i3 & 8) != 0) {
                j7 = A52.f130b.m116106a();
            } else {
                j7 = j3;
            }
            if ((i3 & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            if ((i3 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i3 & 64) != 0) {
                j612 = C52982zl1.f122162a;
            } else {
                j612 = j61;
            }
            if ((i3 & 128) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i3 & 256) != 0) {
                i4 = f14524O.m102944a();
            } else {
                i4 = i;
            }
            if ((i3 & 512) != 0) {
                i5 = f14524O.m102943b();
            } else {
                i5 = i2;
            }
            i61.mo20756N0(mw1, j5, j6, j7, j8, f2, j612, c48841sm02, i4, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    /* renamed from: Q0 */
    private default long m102952Q0(long j, long j2) {
        return CB5.m112663a(C51465xB5.m5730i(j) - C32120Ce3.m111944o(j2), C51465xB5.m5732g(j) - C32120Ce3.m111943p(j2));
    }

    /* renamed from: V */
    static /* synthetic */ void m102951V(I61 i61, long j, float f, float f2, boolean z, long j2, long j3, float f3, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f4;
        C52982zl1 c52982zl1;
        C48841sm0 c48841sm02;
        int i3;
        if (obj == null) {
            if ((i2 & 16) != 0) {
                j4 = C32120Ce3.f4427b.m111932c();
            } else {
                j4 = j2;
            }
            if ((i2 & 32) != 0) {
                j5 = i61.m102952Q0(i61.mo96360h(), j4);
            } else {
                j5 = j3;
            }
            if ((i2 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f3;
            }
            if ((i2 & 128) != 0) {
                c52982zl1 = C52982zl1.f122162a;
            } else {
                c52982zl1 = j61;
            }
            if ((i2 & 256) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i2 & 512) != 0) {
                i3 = f14524O.m102944a();
            } else {
                i3 = i;
            }
            i61.mo20739u0(j, f, f2, z, j4, j5, f4, c52982zl1, c48841sm02, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    /* renamed from: W */
    static /* synthetic */ void m102950W(I61 i61, AbstractC37727a30 abstractC37727a30, long j, long j2, long j3, float f, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        long j4;
        long j5;
        long j6;
        float f2;
        J61 j612;
        C48841sm0 c48841sm02;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = C32120Ce3.f4427b.m111932c();
            } else {
                j4 = j;
            }
            if ((i2 & 4) != 0) {
                j5 = i61.m102952Q0(i61.mo96360h(), j4);
            } else {
                j5 = j2;
            }
            if ((i2 & 8) != 0) {
                j6 = LC0.f20887a.m97597a();
            } else {
                j6 = j3;
            }
            if ((i2 & 16) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 32) != 0) {
                j612 = C52982zl1.f122162a;
            } else {
                j612 = j61;
            }
            if ((i2 & 64) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i2 & 128) != 0) {
                i3 = f14524O.m102944a();
            } else {
                i3 = i;
            }
            i61.mo20755R(abstractC37727a30, j4, j5, j6, f2, j612, c48841sm02, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }

    /* renamed from: a0 */
    static /* synthetic */ void m102949a0(I61 i61, MW1 mw1, long j, float f, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        long j2;
        float f2;
        J61 j612;
        C48841sm0 c48841sm02;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = C32120Ce3.f4427b.m111932c();
            } else {
                j2 = j;
            }
            if ((i2 & 4) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                j612 = C52982zl1.f122162a;
            } else {
                j612 = j61;
            }
            if ((i2 & 16) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i2 & 32) != 0) {
                i3 = f14524O.m102944a();
            } else {
                i3 = i;
            }
            i61.mo20746i0(mw1, j2, f2, j612, c48841sm02, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    /* renamed from: b0 */
    static /* synthetic */ void m102948b0(I61 i61, AbstractC37727a30 abstractC37727a30, long j, long j2, float f, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        J61 j612;
        C48841sm0 c48841sm02;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j3 = C32120Ce3.f4427b.m111932c();
            } else {
                j3 = j;
            }
            if ((i2 & 4) != 0) {
                j4 = i61.m102952Q0(i61.mo96360h(), j3);
            } else {
                j4 = j2;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                j612 = C52982zl1.f122162a;
            } else {
                j612 = j61;
            }
            if ((i2 & 32) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i2 & 64) != 0) {
                i3 = f14524O.m102944a();
            } else {
                i3 = i;
            }
            i61.mo20743m0(abstractC37727a30, j3, j4, f2, j612, c48841sm02, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    /* renamed from: e0 */
    static /* synthetic */ void m102947e0(I61 i61, long j, long j2, long j3, long j4, J61 j61, float f, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        long j5;
        long j6;
        long j7;
        C52982zl1 c52982zl1;
        float f2;
        C48841sm0 c48841sm02;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j5 = C32120Ce3.f4427b.m111932c();
            } else {
                j5 = j2;
            }
            if ((i2 & 4) != 0) {
                j6 = i61.m102952Q0(i61.mo96360h(), j5);
            } else {
                j6 = j3;
            }
            if ((i2 & 8) != 0) {
                j7 = LC0.f20887a.m97597a();
            } else {
                j7 = j4;
            }
            if ((i2 & 16) != 0) {
                c52982zl1 = C52982zl1.f122162a;
            } else {
                c52982zl1 = j61;
            }
            if ((i2 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 64) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i2 & 128) != 0) {
                i3 = f14524O.m102944a();
            } else {
                i3 = i;
            }
            i61.mo20754W0(j, j5, j6, j7, c52982zl1, f2, c48841sm02, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
    }

    /* renamed from: f0 */
    static /* synthetic */ void m102946f0(I61 i61, AbstractC37727a30 abstractC37727a30, long j, long j2, float f, int i, InterfaceC42642iJ3 interfaceC42642iJ3, float f2, C48841sm0 c48841sm0, int i2, int i3, Object obj) {
        float f3;
        int i4;
        InterfaceC42642iJ3 interfaceC42642iJ32;
        float f4;
        C48841sm0 c48841sm02;
        int i5;
        if (obj == null) {
            if ((i3 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i3 & 16) != 0) {
                i4 = KS5.f19635f.m98858a();
            } else {
                i4 = i;
            }
            if ((i3 & 32) != 0) {
                interfaceC42642iJ32 = null;
            } else {
                interfaceC42642iJ32 = interfaceC42642iJ3;
            }
            if ((i3 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i3 & 128) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i3 & 256) != 0) {
                i5 = f14524O.m102944a();
            } else {
                i5 = i2;
            }
            i61.mo20757K(abstractC37727a30, j, j2, f3, i4, interfaceC42642iJ32, f4, c48841sm02, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    /* renamed from: z0 */
    static /* synthetic */ void m102945z0(I61 i61, long j, long j2, long j3, float f, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f2;
        C52982zl1 c52982zl1;
        C48841sm0 c48841sm02;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = C32120Ce3.f4427b.m111932c();
            } else {
                j4 = j2;
            }
            if ((i2 & 4) != 0) {
                j5 = i61.m102952Q0(i61.mo96360h(), j4);
            } else {
                j5 = j3;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                c52982zl1 = C52982zl1.f122162a;
            } else {
                c52982zl1 = j61;
            }
            if ((i2 & 32) != 0) {
                c48841sm02 = null;
            } else {
                c48841sm02 = c48841sm0;
            }
            if ((i2 & 64) != 0) {
                i3 = f14524O.m102944a();
            } else {
                i3 = i;
            }
            i61.mo20744k0(j, j4, j5, f2, c52982zl1, c48841sm02, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    /* renamed from: I */
    void mo20758I(long j, float f, long j2, float f2, J61 j61, C48841sm0 c48841sm0, int i);

    /* renamed from: K */
    void mo20757K(AbstractC37727a30 abstractC37727a30, long j, long j2, float f, int i, InterfaceC42642iJ3 interfaceC42642iJ3, float f2, C48841sm0 c48841sm0, int i2);

    /* renamed from: N0 */
    default void mo20756N0(MW1 image, long j, long j2, long j3, long j4, float f, J61 style, C48841sm0 c48841sm0, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        m102953K0(this, image, j, j2, j3, j4, f, style, c48841sm0, i, 0, 512, null);
    }

    /* renamed from: R */
    void mo20755R(AbstractC37727a30 abstractC37727a30, long j, long j2, long j3, float f, J61 j61, C48841sm0 c48841sm0, int i);

    /* renamed from: W0 */
    void mo20754W0(long j, long j2, long j3, long j4, J61 j61, float f, C48841sm0 c48841sm0, int i);

    /* renamed from: Z */
    void mo20753Z(InterfaceC39067cJ3 interfaceC39067cJ3, long j, float f, J61 j61, C48841sm0 c48841sm0, int i);

    /* renamed from: d0 */
    C61 mo20750d0();

    EnumC47065pm2 getLayoutDirection();

    /* renamed from: h */
    default long mo96360h() {
        return mo20750d0().mo20721h();
    }

    /* renamed from: i0 */
    void mo20746i0(MW1 mw1, long j, float f, J61 j61, C48841sm0 c48841sm0, int i);

    /* renamed from: j0 */
    void mo20745j0(InterfaceC39067cJ3 interfaceC39067cJ3, AbstractC37727a30 abstractC37727a30, float f, J61 j61, C48841sm0 c48841sm0, int i);

    /* renamed from: k0 */
    void mo20744k0(long j, long j2, long j3, float f, J61 j61, C48841sm0 c48841sm0, int i);

    /* renamed from: l0 */
    default long mo96359l0() {
        return CB5.m112662b(mo20750d0().mo20721h());
    }

    /* renamed from: m0 */
    void mo20743m0(AbstractC37727a30 abstractC37727a30, long j, long j2, float f, J61 j61, C48841sm0 c48841sm0, int i);

    /* renamed from: u0 */
    void mo20739u0(long j, float f, float f2, boolean z, long j2, long j3, float f3, J61 j61, C48841sm0 c48841sm0, int i);
}
