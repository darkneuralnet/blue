package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule;", "", "()V", "bindsApplicationForContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module(subcomponents = {PaymentSheetViewModelSubcomponent.class, FormViewModelSubcomponent.class})
/* loaded from: classes7.dex */
public abstract class PaymentSheetLauncherModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule$Companion;", "", "()V", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideProductUsageTokens", "", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        public final EventReporter.Mode provideEventReporterMode() {
            return EventReporter.Mode.Complete;
        }

        @Provides
        public final Set<String> provideProductUsageTokens() {
            Set<String> of;
            of = SetsKt__SetsJVMKt.setOf("PaymentSheet");
            return of;
        }

        private Companion() {
        }
    }

    @Binds
    public abstract Context bindsApplicationForContext(Application application);
}
