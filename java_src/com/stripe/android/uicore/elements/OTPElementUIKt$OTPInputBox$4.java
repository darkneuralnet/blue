package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C47063pm0;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,257:1\n1057#2,6:258\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4\n*L\n234#1:258,6\n*E\n"})
/* loaded from: classes7.dex */
public final class OTPElementUIKt$OTPInputBox$4 extends Lambda implements Function3<Function2<? super InterfaceC32720Et0, ? super Integer, ? extends Unit>, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ OTPElementColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $value;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.uicore.elements.OTPElementUIKt$OTPInputBox$4$2 */
    /* loaded from: classes7.dex */
    public static final class C194592 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ boolean $isSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194592(boolean z) {
            super(2);
            this.$isSelected = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1263013324, i, -1, "com.stripe.android.uicore.elements.OTPInputBox.<anonymous>.<anonymous> (OTPElementUI.kt:224)");
            }
            C38909c26.m62000e(!this.$isSelected ? "●" : "", BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, C47801r06.m16685g(C47801r06.f106195b.m16678a()), 0L, 0, false, 0, null, null, interfaceC32720Et0, 48, 0, 65020);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPInputBox$4(OTPElementColors oTPElementColors, String str, boolean z, int i, boolean z2) {
        super(3);
        this.$colors = oTPElementColors;
        this.$value = str;
        this.$enabled = z;
        this.$$dirty = i;
        this.$isSelected = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC32720Et0, ? super Integer, ? extends Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke((Function2<? super InterfaceC32720Et0, ? super Integer, Unit>) function2, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> innerTextField, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i & 14) == 0) {
            i2 = i | (interfaceC32720Et0.mo89539n(innerTextField) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1385086863, i2, -1, "com.stripe.android.uicore.elements.OTPInputBox.<anonymous> (OTPElementUI.kt:219)");
        }
        C41288g16 c41288g16 = C41288g16.f81350a;
        InterfaceC32735Eu6 m108216a = InterfaceC32735Eu6.f8291a.m108216a();
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = C40741f62.m42091a();
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        TM2 tm2 = TM2.f35372a;
        int i3 = TM2.f35373b;
        long m116698getOnComponent0d7_KjU = StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i3).m116698getOnComponent0d7_KjU();
        C47063pm0.C27386a c27386a = C47063pm0.f104050b;
        InterfaceC39510d16 m40288l = c41288g16.m40288l(m116698getOnComponent0d7_KjU, 0L, c27386a.m18727f(), StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i3).m116701getTextCursor0d7_KjU(), 0L, c27386a.m18727f(), c27386a.m18727f(), c27386a.m18727f(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, this.$colors.m116740getPlaceholder0d7_KjU(), this.$colors.m116740getPlaceholder0d7_KjU(), interfaceC32720Et0, 14352768, 0, 48, 524050);
        PD3 m94190c = ND3.m94190c(0.0f, 0.0f, 3, null);
        String str = this.$value;
        boolean z = this.$enabled;
        InterfaceC42389ht0 m29791b = C43575jt0.m29791b(interfaceC32720Et0, -1263013324, true, new C194592(this.$isSelected));
        int i4 = this.$$dirty;
        c41288g16.m40297c(str, innerTextField, z, true, m108216a, (InterfaceC48104rX2) mo89635G, false, null, m29791b, null, null, m40288l, m94190c, interfaceC32720Et0, (i4 & 14) | 100887552 | ((i2 << 3) & 112) | ((i4 >> 12) & 896), 3456, 1728);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
