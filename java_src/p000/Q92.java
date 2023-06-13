package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, m28432d2 = {"LhN2;", LegacyRepairType.OTHER_KEY, "", C17296a.f69688o, "([F[F)Z", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,77:1\n39#2:78\n39#2:79\n39#2:80\n39#2:81\n39#2:82\n39#2:83\n39#2:84\n39#2:85\n39#2:86\n39#2:87\n39#2:88\n39#2:89\n39#2:90\n39#2:91\n39#2:92\n39#2:93\n42#2,2:94\n42#2,2:96\n42#2,2:98\n42#2,2:100\n42#2,2:102\n42#2,2:104\n42#2,2:106\n42#2,2:108\n42#2,2:110\n42#2,2:112\n42#2,2:114\n42#2,2:116\n42#2,2:118\n42#2,2:120\n42#2,2:122\n42#2,2:124\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n26#1:78\n27#1:79\n28#1:80\n29#1:81\n30#1:82\n31#1:83\n32#1:84\n33#1:85\n34#1:86\n35#1:87\n36#1:88\n37#1:89\n38#1:90\n39#1:91\n40#1:92\n41#1:93\n60#1:94,2\n61#1:96,2\n62#1:98,2\n63#1:100,2\n64#1:102,2\n65#1:104,2\n66#1:106,2\n67#1:108,2\n68#1:110,2\n69#1:112,2\n70#1:114,2\n71#1:116,2\n72#1:118,2\n73#1:120,2\n74#1:122,2\n75#1:124,2\n*E\n"})
/* renamed from: Q92 */
/* loaded from: classes.dex */
public final class Q92 {
    /* renamed from: a */
    public static final boolean m88865a(float[] invertTo, float[] other) {
        boolean z;
        Intrinsics.checkNotNullParameter(invertTo, "$this$invertTo");
        Intrinsics.checkNotNullParameter(other, "other");
        float f = invertTo[0];
        float f2 = invertTo[1];
        float f3 = invertTo[2];
        float f4 = invertTo[3];
        float f5 = invertTo[4];
        float f6 = invertTo[5];
        float f7 = invertTo[6];
        float f8 = invertTo[7];
        float f9 = invertTo[8];
        float f10 = invertTo[9];
        float f11 = invertTo[10];
        float f12 = invertTo[11];
        float f13 = invertTo[12];
        float f14 = invertTo[13];
        float f15 = invertTo[14];
        float f16 = invertTo[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        float f30 = 1.0f / f29;
        other[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
        other[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
        other[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
        other[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
        float f31 = -f5;
        other[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
        other[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
        float f32 = -f13;
        other[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
        other[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
        other[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
        other[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
        other[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
        other[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
        other[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
        other[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
        other[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
        other[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
        return true;
    }
}
