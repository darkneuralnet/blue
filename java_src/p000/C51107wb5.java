package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"", "bounded", "Lk61;", "radius", "Lpm0;", "color", "Ly12;", "e", "(ZFJLEt0;II)Ly12;", "Ld62;", "interaction", "Llf;", "", "c", DateTokenConverter.CONVERTER_KEY, "Ltb6;", C17296a.f69688o, "Ltb6;", "DefaultTweenSpec", "material-ripple_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,355:1\n50#2:356\n49#2:357\n1057#3,6:358\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n83#1:356\n83#1:357\n83#1:358,6\n*E\n"})
/* renamed from: wb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51107wb5 {

    /* renamed from: a */
    public static final C49330tb6<Float> f116246a = new C49330tb6<>(15, 0, C42549i91.m34394c(), 2, null);

    /* renamed from: c */
    public static final InterfaceC25753lf<Float> m6607c(InterfaceC39556d62 interfaceC39556d62) {
        if (interfaceC39556d62 instanceof C43269jN1) {
            return f116246a;
        }
        if (interfaceC39556d62 instanceof C51896xv1) {
            return new C49330tb6(45, 0, C42549i91.m34394c(), 2, null);
        }
        if (interfaceC39556d62 instanceof C48448s61) {
            return new C49330tb6(45, 0, C42549i91.m34394c(), 2, null);
        }
        return f116246a;
    }

    /* renamed from: d */
    public static final InterfaceC25753lf<Float> m6606d(InterfaceC39556d62 interfaceC39556d62) {
        if (interfaceC39556d62 instanceof C43269jN1) {
            return f116246a;
        }
        if (interfaceC39556d62 instanceof C51896xv1) {
            return f116246a;
        }
        if (interfaceC39556d62 instanceof C48448s61) {
            return new C49330tb6(150, 0, C42549i91.m34394c(), 2, null);
        }
        return f116246a;
    }

    /* renamed from: e */
    public static final InterfaceC51956y12 m6605e(boolean z, float f, long j, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        interfaceC32720Et0.mo89638F(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = C43705k61.f93903c.m29295c();
        }
        if ((i2 & 4) != 0) {
            j = C47063pm0.f104050b.m18726g();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1635163520, i, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:76)");
        }
        InterfaceC48627sP5 m105193n = GM5.m105193n(C47063pm0.m18747i(j), interfaceC32720Et0, (i >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z);
        C43705k61 m29306d = C43705k61.m29306d(f);
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf) | interfaceC32720Et0.mo89539n(m29306d);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C38591bW3(z, f, m105193n, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C38591bW3 c38591bW3 = (C38591bW3) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c38591bW3;
    }
}
