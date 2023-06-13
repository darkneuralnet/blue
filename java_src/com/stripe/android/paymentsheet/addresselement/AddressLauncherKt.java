package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;", "callback", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;", "rememberAddressLauncher", "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;LEt0;I)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressLauncher.kt\ncom/stripe/android/paymentsheet/addresselement/AddressLauncherKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,221:1\n25#2:222\n1057#3,6:223\n*S KotlinDebug\n*F\n+ 1 AddressLauncher.kt\ncom/stripe/android/paymentsheet/addresselement/AddressLauncherKt\n*L\n217#1:222\n217#1:223,6\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressLauncherKt {
    public static final AddressLauncher rememberAddressLauncher(AddressLauncherResultCallback callback, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        interfaceC32720Et0.mo89638F(857915885);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(857915885, i, -1, "com.stripe.android.paymentsheet.addresselement.rememberAddressLauncher (AddressLauncher.kt:208)");
        }
        TH2 m110957a = C1362D5.m110957a(new AddressElementActivityContract(), new C19176x235b7f9d(callback), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new AddressLauncher(m110957a);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        AddressLauncher addressLauncher = (AddressLauncher) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return addressLauncher;
    }
}
