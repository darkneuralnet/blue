package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"", "enabled", "isError", "Le62;", "interactionSource", "Ld16;", "colors", "Lk61;", "focusedBorderThickness", "unfocusedBorderThickness", "LsP5;", "LeZ;", "b", "(ZZLe62;Ld16;FFLEt0;I)LsP5;", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,855:1\n76#2:856\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n*L\n844#1:856\n*E\n"})
/* renamed from: h16 */
/* loaded from: classes.dex */
public final class C41881h16 {
    /* renamed from: a */
    public static final /* synthetic */ InterfaceC48627sP5 m36902a(boolean z, boolean z2, InterfaceC40148e62 interfaceC40148e62, InterfaceC39510d16 interfaceC39510d16, float f, float f2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        return m36901b(z, z2, interfaceC40148e62, interfaceC39510d16, f, f2, interfaceC32720Et0, i);
    }

    /* renamed from: b */
    public static final InterfaceC48627sP5<C20064eZ> m36901b(boolean z, boolean z2, InterfaceC40148e62 interfaceC40148e62, InterfaceC39510d16 interfaceC39510d16, float f, float f2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        float f3;
        InterfaceC48627sP5 m105193n;
        interfaceC32720Et0.mo89638F(1097899920);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1097899920, i, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:835)");
        }
        InterfaceC48627sP5<Boolean> m116a = C53082zv1.m116a(interfaceC40148e62, interfaceC32720Et0, (i >> 6) & 14);
        InterfaceC48627sP5<C47063pm0> mo44714d = interfaceC39510d16.mo44714d(z, z2, interfaceC40148e62, interfaceC32720Et0, (i & 14) | (i & 112) | (i & 896) | (i & 7168));
        if (m36900c(m116a)) {
            f3 = f;
        } else {
            f3 = f2;
        }
        if (z) {
            interfaceC32720Et0.mo89638F(1685712066);
            m105193n = C4171Je.m100065d(f3, C26160mf.m25219k(150, 0, null, 6, null), null, interfaceC32720Et0, 48, 4);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(1685712164);
            m105193n = GM5.m105193n(C43705k61.m29306d(f2), interfaceC32720Et0, (i >> 15) & 14);
            interfaceC32720Et0.mo89605Q();
        }
        InterfaceC48627sP5<C20064eZ> m105193n2 = GM5.m105193n(new C20064eZ(((C43705k61) m105193n.getValue()).m29298l(), new C46831pN5(mo44714d.getValue().m18733w(), null), null), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105193n2;
    }

    /* renamed from: c */
    public static final boolean m36900c(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }
}
