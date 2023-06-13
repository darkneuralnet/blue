package com.stripe.android.paymentsheet.flowcontroller;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.uicore.image.StripeImageLoader;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule;", "", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideEventReporterMode", "", "", "provideProductUsageTokens", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "viewModel", "LZC0;", "provideViewModelScope", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/uicore/image/StripeImageLoader;", "provideStripeImageLoader", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module(subcomponents = {PaymentOptionsViewModelSubcomponent.class, FormViewModelSubcomponent.class})
/* loaded from: classes7.dex */
public final class FlowControllerModule {
    public static final FlowControllerModule INSTANCE = new FlowControllerModule();

    private FlowControllerModule() {
    }

    @Provides
    public final EventReporter.Mode provideEventReporterMode() {
        return EventReporter.Mode.Custom;
    }

    @Provides
    public final Set<String> provideProductUsageTokens() {
        Set<String> of;
        of = SetsKt__SetsJVMKt.setOf("PaymentSheet.FlowController");
        return of;
    }

    @Provides
    public final StripeImageLoader provideStripeImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new StripeImageLoader(context, null, null, null, null, 30, null);
    }

    @Provides
    public final ZC0 provideViewModelScope(FlowControllerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        return C36218Tr6.m82333a(viewModel);
    }
}
