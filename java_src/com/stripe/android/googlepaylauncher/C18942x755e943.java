package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncher$Companion$rememberLauncher$activityResultLauncher$1 */
/* loaded from: classes7.dex */
public /* synthetic */ class C18942x755e943 extends FunctionReferenceImpl implements Function1<GooglePayLauncher.Result, Unit> {
    public C18942x755e943(Object obj) {
        super(1, obj, GooglePayLauncher.ResultCallback.class, "onResult", "onResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GooglePayLauncher.Result result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GooglePayLauncher.Result p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GooglePayLauncher.ResultCallback) this.receiver).onResult(p0);
    }
}
