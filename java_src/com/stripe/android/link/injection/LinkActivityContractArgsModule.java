package com.stripe.android.link.injection;

import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkActivityContractArgsModule;", "", "Companion", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module(subcomponents = {SignedInViewModelSubcomponent.class, FormControllerSubcomponent.class})
/* loaded from: classes7.dex */
public interface LinkActivityContractArgsModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;", "", "()V", "provideConfiguration", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "args", "Lcom/stripe/android/link/LinkActivityContract$Args;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final LinkPaymentLauncher.Configuration provideConfiguration(LinkActivityContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return args.getConfiguration$link_release();
        }
    }
}
