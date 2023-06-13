package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.link.model.ConsumerPaymentDetailsKtxKt;
import com.stripe.android.link.p042ui.menus.LinkMenuKt;
import com.stripe.android.link.p042ui.wallet.WalletPaymentMethodMenuItem;
import com.stripe.android.model.ConsumerPaymentDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aO\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "paymentDetails", "Lkotlin/Function0;", "", "onEditClick", "onSetDefaultClick", "onRemoveClick", "onCancelClick", "WalletPaymentMethodMenu", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWalletPaymentMethodMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletPaymentMethodMenu.kt\ncom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,66:1\n83#2,3:67\n1057#3,6:70\n*S KotlinDebug\n*F\n+ 1 WalletPaymentMethodMenu.kt\ncom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt\n*L\n56#1:67,3\n56#1:70,6\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuKt */
/* loaded from: classes7.dex */
public final class WalletPaymentMethodMenuKt {
    public static final void WalletPaymentMethodMenu(ConsumerPaymentDetails.PaymentDetails paymentDetails, Function0<Unit> onEditClick, Function0<Unit> onSetDefaultClick, Function0<Unit> onRemoveClick, Function0<Unit> onCancelClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        List createListBuilder;
        List build;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(onEditClick, "onEditClick");
        Intrinsics.checkNotNullParameter(onSetDefaultClick, "onSetDefaultClick");
        Intrinsics.checkNotNullParameter(onRemoveClick, "onRemoveClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-266126714);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(paymentDetails)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onEditClick)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onSetDefaultClick)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(onRemoveClick)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (mo89518u.mo89539n(onCancelClick)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 46811) == 9362 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-266126714, i, -1, "com.stripe.android.link.ui.wallet.WalletPaymentMethodMenu (WalletPaymentMethodMenu.kt:33)");
            }
            createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
                createListBuilder.add(WalletPaymentMethodMenuItem.EditCard.INSTANCE);
            }
            if (!paymentDetails.isDefault()) {
                createListBuilder.add(WalletPaymentMethodMenuItem.SetAsDefault.INSTANCE);
            }
            createListBuilder.add(new WalletPaymentMethodMenuItem.RemoveItem(ConsumerPaymentDetailsKtxKt.getRemoveLabel(paymentDetails)));
            createListBuilder.add(WalletPaymentMethodMenuItem.Cancel.INSTANCE);
            build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            Object[] objArr = {onEditClick, onSetDefaultClick, onRemoveClick, onCancelClick};
            mo89518u.mo89638F(-568225417);
            boolean z = false;
            for (int i8 = 0; i8 < 4; i8++) {
                z |= mo89518u.mo89539n(objArr[i8]);
            }
            Object mo89635G = mo89518u.mo89635G();
            if (z || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$1$1(onEditClick, onSetDefaultClick, onRemoveClick, onCancelClick);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            LinkMenuKt.LinkMenu(build, (Function1) mo89635G, mo89518u, 8);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$2(paymentDetails, onEditClick, onSetDefaultClick, onRemoveClick, onCancelClick, i));
        }
    }
}
