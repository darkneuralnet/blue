package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.lifecycle.C11759u;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PollingFragment$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    final /* synthetic */ PollingFragment this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment$viewModel$2$1 */
    /* loaded from: classes7.dex */
    public static final class C192811 extends Lambda implements Function0<PollingViewModel.Args> {
        final /* synthetic */ PollingFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192811(PollingFragment pollingFragment) {
            super(0);
            this.this$0 = pollingFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PollingViewModel.Args invoke() {
            PollingContract.Args args;
            PollingContract.Args args2;
            PollingContract.Args args3;
            PollingContract.Args args4;
            args = this.this$0.getArgs();
            String clientSecret = args.getClientSecret();
            Duration.Companion companion = Duration.Companion;
            args2 = this.this$0.getArgs();
            int timeLimitInSeconds = args2.getTimeLimitInSeconds();
            DurationUnit durationUnit = DurationUnit.SECONDS;
            long duration = DurationKt.toDuration(timeLimitInSeconds, durationUnit);
            args3 = this.this$0.getArgs();
            long duration2 = DurationKt.toDuration(args3.getInitialDelayInSeconds(), durationUnit);
            args4 = this.this$0.getArgs();
            return new PollingViewModel.Args(clientSecret, duration, duration2, args4.getMaxAttempts(), null, 16, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingFragment$viewModel$2(PollingFragment pollingFragment) {
        super(0);
        this.this$0 = pollingFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        return new PollingViewModel.Factory(new C192811(this.this$0));
    }
}
