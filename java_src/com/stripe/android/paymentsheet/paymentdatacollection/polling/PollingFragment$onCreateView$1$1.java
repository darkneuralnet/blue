package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PollingFragment$onCreateView$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ PollingFragment this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment$onCreateView$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C192771 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ PollingFragment this$0;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment$onCreateView$1$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C192781 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ PollingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C192781(PollingFragment pollingFragment) {
                super(2);
                this.this$0 = pollingFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                PollingViewModel viewModel;
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1592145657, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PollingFragment.kt:52)");
                }
                viewModel = this.this$0.getViewModel();
                PollingScreenKt.PollingScreen(viewModel, null, interfaceC32720Et0, 8, 2);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192771(PollingFragment pollingFragment) {
            super(2);
            this.this$0 = pollingFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-687403829, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (PollingFragment.kt:49)");
            }
            NV5.m93838a(null, null, TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94896n(), 0L, null, 0.0f, C43575jt0.m29791b(interfaceC32720Et0, -1592145657, true, new C192781(this.this$0)), interfaceC32720Et0, 1572864, 59);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingFragment$onCreateView$1$1(PollingFragment pollingFragment) {
        super(2);
        this.this$0 = pollingFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1355583161, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment.onCreateView.<anonymous>.<anonymous> (PollingFragment.kt:48)");
        }
        StripeThemeKt.StripeTheme(null, null, null, C43575jt0.m29791b(interfaceC32720Et0, -687403829, true, new C192771(this.this$0)), interfaceC32720Et0, 3072, 7);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
