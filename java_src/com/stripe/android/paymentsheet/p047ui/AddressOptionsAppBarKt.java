package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"", "isRootScreen", "Lkotlin/Function0;", "", "onButtonClick", "AddressOptionsAppBar", "(ZLkotlin/jvm/functions/Function0;LEt0;I)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressOptionsAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressOptionsAppBar.kt\ncom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,49:1\n154#2:50\n*S KotlinDebug\n*F\n+ 1 AddressOptionsAppBar.kt\ncom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt\n*L\n23#1:50\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.AddressOptionsAppBarKt */
/* loaded from: classes7.dex */
public final class AddressOptionsAppBarKt {
    public static final void AddressOptionsAppBar(boolean z, Function0<Unit> onButtonClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-111772214);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onButtonClick)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-111772214, i2, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar (AddressOptionsAppBar.kt:16)");
            }
            C3727Ih.m101813b(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94896n(), 0L, C43705k61.m29303g(0), null, C43575jt0.m29791b(mo89518u, 663677113, true, new AddressOptionsAppBarKt$AddressOptionsAppBar$1(onButtonClick, i2, z)), mo89518u, 199686, 20);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AddressOptionsAppBarKt$AddressOptionsAppBar$2(z, onButtonClick, i));
        }
    }
}
