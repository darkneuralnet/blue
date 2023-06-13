package com.stripe.android.link.p042ui.signup;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorTextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,240:1\n76#2:241\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$2\n*L\n176#1:241\n*E\n"})
/* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$3$3$1$2 */
/* loaded from: classes7.dex */
public final class SignUpScreenKt$SignUpBody$3$3$1$2 extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ ErrorMessage $errorMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$3$3$1$2(ErrorMessage errorMessage) {
        super(3);
        this.$errorMessage = errorMessage;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String str;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-240369475, i, -1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignUpScreen.kt:173)");
        }
        ErrorMessage errorMessage = this.$errorMessage;
        if (errorMessage != null) {
            Resources resources = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
            str = errorMessage.getMessage(resources);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        ErrorTextKt.ErrorText(str, BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), null, interfaceC32720Et0, 48, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
