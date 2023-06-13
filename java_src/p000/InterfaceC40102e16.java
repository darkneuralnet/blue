package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, m28432d2 = {"Le16;", "Ld16;", "", "enabled", "isError", "Le62;", "interactionSource", "LsP5;", "Lpm0;", "c", "(ZZLe62;LEt0;I)LsP5;", "f", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: e16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC40102e16 extends InterfaceC39510d16 {
    /* renamed from: c */
    default InterfaceC48627sP5<C47063pm0> m43402c(boolean z, boolean z2, InterfaceC40148e62 interactionSource, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        interfaceC32720Et0.mo89638F(1279189910);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1279189910, i, -1, "androidx.compose.material.TextFieldColorsWithIcons.leadingIconColor (TextFieldDefaults.kt:160)");
        }
        InterfaceC48627sP5<C47063pm0> mo44713e = mo44713e(z, z2, interfaceC32720Et0, (i & 14) | (i & 112) | ((i >> 3) & 896));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return mo44713e;
    }

    /* renamed from: f */
    default InterfaceC48627sP5<C47063pm0> mo43401f(boolean z, boolean z2, InterfaceC40148e62 interactionSource, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        interfaceC32720Et0.mo89638F(-712140408);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-712140408, i, -1, "androidx.compose.material.TextFieldColorsWithIcons.trailingIconColor (TextFieldDefaults.kt:177)");
        }
        InterfaceC48627sP5<C47063pm0> mo44710i = mo44710i(z, z2, interfaceC32720Et0, (i & 14) | (i & 112) | ((i >> 3) & 896));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return mo44710i;
    }
}
