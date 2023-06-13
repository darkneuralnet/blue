package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "googlePayResult", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayPaymentMethodLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayPaymentMethodLauncherActivity.kt\ncom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity$onCreate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncherActivity$onCreate$1 extends Lambda implements Function1<GooglePayPaymentMethodLauncher.Result, Unit> {
    final /* synthetic */ GooglePayPaymentMethodLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherActivity$onCreate$1(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity) {
        super(1);
        this.this$0 = googlePayPaymentMethodLauncherActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GooglePayPaymentMethodLauncher.Result result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GooglePayPaymentMethodLauncher.Result result) {
        if (result != null) {
            this.this$0.finishWithResult(result);
        }
    }
}
