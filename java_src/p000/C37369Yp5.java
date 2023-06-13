package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¨\u0006\u0011"}, m28432d2 = {"LYp5;", "", "Lcu1;", C17296a.f69688o, "(LEt0;I)Lcu1;", "LDA3;", "b", "(LEt0;I)LDA3;", "Lpm2;", "layoutDirection", "LEy3;", "orientation", "", "reverseScrolling", "c", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,579:1\n36#2:580\n1114#3,6:581\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n190#1:580\n190#1:581,6\n*E\n"})
/* renamed from: Yp5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37369Yp5 {

    /* renamed from: a */
    public static final C37369Yp5 f47422a = new C37369Yp5();

    private C37369Yp5() {
    }

    /* renamed from: a */
    public final InterfaceC39436cu1 m74177a(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(1107739818);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:187)");
        }
        InterfaceC43340jV0 m78507b = WN5.m78507b(interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(m78507b);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C42765iX0(m78507b, null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C42765iX0 c42765iX0 = (C42765iX0) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c42765iX0;
    }

    /* renamed from: b */
    public final DA3 m74176b(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(1809802212);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:200)");
        }
        DA3 m41102b = C20475fd.m41102b(interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m41102b;
    }

    /* renamed from: c */
    public final boolean m74175c(EnumC47065pm2 layoutDirection, EnumC32768Ey3 orientation, boolean z) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        boolean z2 = true;
        boolean z3 = !z;
        if (layoutDirection != EnumC47065pm2.Rtl) {
            z2 = false;
        }
        if (z2 && orientation != EnumC32768Ey3.Vertical) {
            return !z3;
        }
        return z3;
    }
}
