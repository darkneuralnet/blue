package com.stripe.android.paymentsheet.addresselement;

import androidx.lifecycle.C11747p;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\u0004\b\u0000\u0010\f2\u0006\u0010\b\u001a\u00020\u0007J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;", "target", "", "navigateTo", "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;)Lkotlin/Unit;", "", "key", "value", "setResult", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;", "T", "LEu1;", "getResultFlow", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "dismiss", "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)Lkotlin/Unit;", "onBack", "()Lkotlin/Unit;", "LOY2;", "navigationController", "LOY2;", "getNavigationController", "()LOY2;", "setNavigationController", "(LOY2;)V", "Lkotlin/Function1;", "onDismiss", "Lkotlin/jvm/functions/Function1;", "getOnDismiss", "()Lkotlin/jvm/functions/Function1;", "setOnDismiss", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AddressElementNavigator {
    private OY2 navigationController;
    private Function1<? super AddressLauncherResult, Unit> onDismiss;

    public static /* synthetic */ Unit dismiss$default(AddressElementNavigator addressElementNavigator, AddressLauncherResult addressLauncherResult, int i, Object obj) {
        if ((i & 1) != 0) {
            addressLauncherResult = AddressLauncherResult.Canceled.INSTANCE;
        }
        return addressElementNavigator.dismiss(addressLauncherResult);
    }

    public final Unit dismiss(AddressLauncherResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Function1<? super AddressLauncherResult, Unit> function1 = this.onDismiss;
        if (function1 != null) {
            function1.invoke(result);
            return Unit.INSTANCE;
        }
        return null;
    }

    public final OY2 getNavigationController() {
        return this.navigationController;
    }

    public final Function1<AddressLauncherResult, Unit> getOnDismiss() {
        return this.onDismiss;
    }

    public final <T> InterfaceC32730Eu1<T> getResultFlow(String key) {
        AY2 m110202y;
        Intrinsics.checkNotNullParameter(key, "key");
        OY2 oy2 = this.navigationController;
        if (oy2 == null || (m110202y = oy2.m110202y()) == null) {
            return null;
        }
        return C36708Vu1.m79249v(m110202y.m115579i().m66944i(key, null));
    }

    public final Unit navigateTo(AddressElementScreen target) {
        Intrinsics.checkNotNullParameter(target, "target");
        OY2 oy2 = this.navigationController;
        if (oy2 != null) {
            DY2.m110246P(oy2, target.getRoute(), null, null, 6, null);
            return Unit.INSTANCE;
        }
        return null;
    }

    public final Unit onBack() {
        OY2 oy2 = this.navigationController;
        if (oy2 == null) {
            return null;
        }
        if (!oy2.m110243S()) {
            dismiss$default(this, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final void setNavigationController(OY2 oy2) {
        this.navigationController = oy2;
    }

    public final void setOnDismiss(Function1<? super AddressLauncherResult, Unit> function1) {
        this.onDismiss = function1;
    }

    public final Unit setResult(String key, Object obj) {
        AY2 m110256F;
        C11747p m115579i;
        Intrinsics.checkNotNullParameter(key, "key");
        OY2 oy2 = this.navigationController;
        if (oy2 != null && (m110256F = oy2.m110256F()) != null && (m115579i = m110256F.m115579i()) != null) {
            m115579i.m66940m(key, obj);
            return Unit.INSTANCE;
        }
        return null;
    }
}
