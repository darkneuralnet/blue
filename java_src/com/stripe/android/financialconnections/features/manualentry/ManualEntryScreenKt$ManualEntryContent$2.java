package com.stripe.android.financialconnections.features.manualentry;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenKt;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntryScreenKt$ManualEntryContent$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Pair<String, Integer> $account;
    final /* synthetic */ Pair<String, Integer> $accountConfirm;
    final /* synthetic */ boolean $isValidForm;
    final /* synthetic */ AbstractC19862dp<LinkAccountSessionPaymentAccount> $linkPaymentAccountStatus;
    final /* synthetic */ Function1<String, Unit> $onAccountConfirmEntered;
    final /* synthetic */ Function1<String, Unit> $onAccountEntered;
    final /* synthetic */ Function1<String, Unit> $onRoutingEntered;
    final /* synthetic */ Function0<Unit> $onSubmit;
    final /* synthetic */ AbstractC19862dp<ManualEntryState.Payload> $payload;
    final /* synthetic */ Pair<String, Integer> $routing;
    final /* synthetic */ C37135Xp5 $scrollState;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryContent$2$1 */
    /* loaded from: classes7.dex */
    public static final class C188311 extends Lambda implements Function0<Unit> {
        public static final C188311 INSTANCE = new C188311();

        public C188311() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryContent$2$2 */
    /* loaded from: classes7.dex */
    public static final class C188322 extends Lambda implements Function0<Unit> {
        public static final C188322 INSTANCE = new C188322();

        public C188322() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt$ManualEntryContent$2$3 */
    /* loaded from: classes7.dex */
    public static final class C188333 extends Lambda implements Function1<Throwable, Unit> {
        public static final C188333 INSTANCE = new C188333();

        public C188333() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntryScreenKt$ManualEntryContent$2(AbstractC19862dp<ManualEntryState.Payload> abstractC19862dp, C37135Xp5 c37135Xp5, AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2, Pair<String, Integer> pair, Function1<? super String, Unit> function1, Pair<String, Integer> pair2, Function1<? super String, Unit> function12, Pair<String, Integer> pair3, Function1<? super String, Unit> function13, boolean z, Function0<Unit> function0, int i) {
        super(3);
        this.$payload = abstractC19862dp;
        this.$scrollState = c37135Xp5;
        this.$linkPaymentAccountStatus = abstractC19862dp2;
        this.$routing = pair;
        this.$onRoutingEntered = function1;
        this.$account = pair2;
        this.$onAccountEntered = function12;
        this.$accountConfirm = pair3;
        this.$onAccountConfirmEntered = function13;
        this.$isValidForm = z;
        this.$onSubmit = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-767497213, i, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryContent.<anonymous> (ManualEntryScreen.kt:101)");
        }
        AbstractC19862dp<ManualEntryState.Payload> abstractC19862dp = this.$payload;
        if (abstractC19862dp instanceof C31786At2 ? true : Intrinsics.areEqual(abstractC19862dp, C34454Md6.f23316e)) {
            interfaceC32720Et0.mo89638F(-2085157612);
            LoadingContentKt.LoadingContent(null, null, null, interfaceC32720Et0, 0, 7);
            interfaceC32720Et0.mo89605Q();
        } else if (abstractC19862dp instanceof C32163Cj1) {
            interfaceC32720Et0.mo89638F(-2085157572);
            PartnerAuthScreenKt.ErrorContent(((C32163Cj1) this.$payload).m111793b(), C188311.INSTANCE, C188322.INSTANCE, C188333.INSTANCE, interfaceC32720Et0, 3512);
            interfaceC32720Et0.mo89605Q();
        } else if (abstractC19862dp instanceof C51034wT5) {
            interfaceC32720Et0.mo89638F(-2085157348);
            boolean customManualEntry = ((ManualEntryState.Payload) ((C51034wT5) this.$payload).mo6788a()).getCustomManualEntry();
            if (customManualEntry) {
                interfaceC32720Et0.mo89638F(-2085157287);
                LoadingContentKt.LoadingContent(null, null, null, interfaceC32720Et0, 0, 7);
                interfaceC32720Et0.mo89605Q();
            } else if (!customManualEntry) {
                interfaceC32720Et0.mo89638F(-2085157245);
                ManualEntryState.Payload payload = (ManualEntryState.Payload) ((C51034wT5) this.$payload).mo6788a();
                C37135Xp5 c37135Xp5 = this.$scrollState;
                AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2 = this.$linkPaymentAccountStatus;
                Pair<String, Integer> pair = this.$routing;
                Function1<String, Unit> function1 = this.$onRoutingEntered;
                Pair<String, Integer> pair2 = this.$account;
                Function1<String, Unit> function12 = this.$onAccountEntered;
                Pair<String, Integer> pair3 = this.$accountConfirm;
                Function1<String, Unit> function13 = this.$onAccountConfirmEntered;
                boolean z = this.$isValidForm;
                Function0<Unit> function0 = this.$onSubmit;
                int i2 = this.$$dirty;
                ManualEntryScreenKt.ManualEntryLoaded(c37135Xp5, payload, abstractC19862dp2, pair, function1, pair2, function12, pair3, function13, z, function0, interfaceC32720Et0, ((i2 << 9) & 7168) | 512 | ((i2 >> 6) & 57344) | ((i2 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i2 >> 3) & 3670016) | ((i2 << 15) & 29360128) | (234881024 & i2) | ((i2 << 18) & 1879048192), (i2 >> 27) & 14);
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(-2085156631);
                interfaceC32720Et0.mo89605Q();
            }
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-2085156621);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
