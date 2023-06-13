package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$SearchModeNoQuery$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ InstitutionPickerState $state;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchModeNoQuery$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187891 extends Lambda implements Function0<AbstractC19862dp<? extends InstitutionResponse>> {
        final /* synthetic */ InstitutionPickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C187891(InstitutionPickerState institutionPickerState) {
            super(0);
            this.$state = institutionPickerState;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final AbstractC19862dp<? extends InstitutionResponse> invoke2() {
            return this.$state.getSearchInstitutions();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchModeNoQuery$1$2 */
    /* loaded from: classes7.dex */
    public static final class C187902 extends Lambda implements Function1<String, Unit> {
        public static final C187902 INSTANCE = new C187902();

        public C187902() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchModeNoQuery$1$3 */
    /* loaded from: classes7.dex */
    public static final class C187913 extends Lambda implements Function2<FinancialConnectionsInstitution, Boolean, Unit> {
        public static final C187913 INSTANCE = new C187913();

        public C187913() {
            super(2);
        }

        public final void invoke(FinancialConnectionsInstitution financialConnectionsInstitution, boolean z) {
            Intrinsics.checkNotNullParameter(financialConnectionsInstitution, "<anonymous parameter 0>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsInstitution financialConnectionsInstitution, Boolean bool) {
            invoke(financialConnectionsInstitution, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchModeNoQuery$1$4 */
    /* loaded from: classes7.dex */
    public static final class C187924 extends Lambda implements Function0<Unit> {
        public static final C187924 INSTANCE = new C187924();

        public C187924() {
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
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchModeNoQuery$1$5 */
    /* loaded from: classes7.dex */
    public static final class C187935 extends Lambda implements Function0<Unit> {
        public static final C187935 INSTANCE = new C187935();

        public C187935() {
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
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchModeNoQuery$1$6 */
    /* loaded from: classes7.dex */
    public static final class C187946 extends Lambda implements Function0<Unit> {
        public static final C187946 INSTANCE = new C187946();

        public C187946() {
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
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchModeNoQuery$1$7 */
    /* loaded from: classes7.dex */
    public static final class C187957 extends Lambda implements Function0<Unit> {
        public static final C187957 INSTANCE = new C187957();

        public C187957() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerScreenKt$SearchModeNoQuery$1(InstitutionPickerState institutionPickerState) {
        super(2);
        this.$state = institutionPickerState;
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
            C35528Qt0.m87816Z(-1968179997, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeNoQuery.<anonymous> (InstitutionPickerScreen.kt:584)");
        }
        InstitutionPickerScreenKt.InstitutionPickerContent(this.$state.getPayload(), new C187891(this.$state), this.$state.getSearchMode(), C187902.INSTANCE, C187913.INSTANCE, C187924.INSTANCE, C187935.INSTANCE, C187946.INSTANCE, C187957.INSTANCE, interfaceC32720Et0, 115043336);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}