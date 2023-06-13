package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"LMm0;", "colors", "LB26;", "e", "(LMm0;LEt0;I)LB26;", "Lpm0;", "selectionColor", "textColor", "backgroundColor", DateTokenConverter.CONVERTER_KEY, "(JJJ)J", "", C17296a.f69688o, "(JJJ)F", "selectionColorAlpha", "c", "(JFJJ)F", "foreground", "background", "b", "(JJ)F", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n658#2:243\n646#2:244\n76#3:245\n67#4,3:246\n66#4:249\n1114#5,6:250\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n43#1:243\n43#1:244\n44#1:245\n48#1:246,3\n48#1:249\n48#1:250,6\n*E\n"})
/* renamed from: SM2 */
/* loaded from: classes.dex */
public final class SM2 {
    /* renamed from: a */
    public static final float m85700a(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float m85698c = (m85698c(j, f2, j2, j3) / 4.5f) - 1.0f;
            if (0.0f <= m85698c && m85698c <= 0.01f) {
                break;
            }
            if (m85698c < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    /* renamed from: b */
    public static final float m85699b(long j, long j2) {
        float m8175f = C50619vm0.m8175f(j) + 0.05f;
        float m8175f2 = C50619vm0.m8175f(j2) + 0.05f;
        return Math.max(m8175f, m8175f2) / Math.min(m8175f, m8175f2);
    }

    /* renamed from: c */
    public static final float m85698c(long j, float f, long j2, long j3) {
        long m8177d = C50619vm0.m8177d(C47063pm0.m18743m(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m85699b(C50619vm0.m8177d(j2, m8177d), m8177d);
    }

    /* renamed from: d */
    public static final long m85697d(long j, long j2, long j3) {
        float m85700a;
        float m85698c = m85698c(j, 0.4f, j2, j3);
        float m85698c2 = m85698c(j, 0.2f, j2, j3);
        if (m85698c >= 4.5f) {
            m85700a = 0.4f;
        } else if (m85698c2 < 4.5f) {
            m85700a = 0.2f;
        } else {
            m85700a = m85700a(j, j2, j3);
        }
        return C47063pm0.m18743m(j, m85700a, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: e */
    public static final B26 m85696e(C34529Mm0 colors, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(colors, "colors");
        interfaceC32720Et0.mo89638F(-721696685);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-721696685, i, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m94900j = colors.m94900j();
        long m94907c = colors.m94907c();
        interfaceC32720Et0.mo89638F(35572910);
        long m93469a = C34763Nm0.m93469a(colors, m94907c);
        if (m93469a != C47063pm0.f104050b.m18726g()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m93469a = ((C47063pm0) interfaceC32720Et0.mo89572c(C41372gA0.m39962a())).m18733w();
        }
        interfaceC32720Et0.mo89605Q();
        long m18743m = C47063pm0.m18743m(m93469a, C36986Wz0.f42427a.m77586d(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        C47063pm0 m18747i = C47063pm0.m18747i(m94900j);
        C47063pm0 m18747i2 = C47063pm0.m18747i(m94907c);
        C47063pm0 m18747i3 = C47063pm0.m18747i(m18743m);
        interfaceC32720Et0.mo89638F(1618982084);
        boolean mo89539n = interfaceC32720Et0.mo89539n(m18747i) | interfaceC32720Et0.mo89539n(m18747i2) | interfaceC32720Et0.mo89539n(m18747i3);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new B26(colors.m94900j(), m85697d(m94900j, m18743m, m94907c), null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        B26 b26 = (B26) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return b26;
    }
}
