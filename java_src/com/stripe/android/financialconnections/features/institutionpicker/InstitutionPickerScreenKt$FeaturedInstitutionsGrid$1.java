package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nInstitutionPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1\n+ 2 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n1#1,617:1\n380#2,14:618\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1\n*L\n429#1:618,14\n*E\n"})
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1 extends Lambda implements Function1<InterfaceC31966Bn2, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<FinancialConnectionsInstitution, Boolean, Unit> $onInstitutionSelected;
    final /* synthetic */ AbstractC19862dp<InstitutionPickerState.Payload> $payload;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187621 extends Lambda implements Function1<InterfaceC49446tn2, C39631dE1> {
        public static final C187621 INSTANCE = new C187621();

        public C187621() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C39631dE1 invoke(InterfaceC49446tn2 interfaceC49446tn2) {
            return C39631dE1.m44518a(m116390invokeBHJflc(interfaceC49446tn2));
        }

        /* renamed from: invoke-BHJ-flc  reason: not valid java name */
        public final long m116390invokeBHJflc(InterfaceC49446tn2 item) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            return C32668En2.m108361a(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1(AbstractC19862dp<InstitutionPickerState.Payload> abstractC19862dp, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2, int i) {
        super(1);
        this.$payload = abstractC19862dp;
        this.$onInstitutionSelected = function2;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC31966Bn2 interfaceC31966Bn2) {
        invoke2(interfaceC31966Bn2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC31966Bn2 LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        AbstractC19862dp<InstitutionPickerState.Payload> abstractC19862dp = this.$payload;
        if (Intrinsics.areEqual(abstractC19862dp, C34454Md6.f23316e) ? true : abstractC19862dp instanceof C31786At2) {
            InterfaceC31966Bn2.m113489c(LazyVerticalGrid, null, C187621.INSTANCE, null, ComposableSingletons$InstitutionPickerScreenKt.INSTANCE.m116386getLambda4$financial_connections_release(), 5, null);
        } else if ((abstractC19862dp instanceof C32163Cj1) || !(abstractC19862dp instanceof C51034wT5)) {
        } else {
            List<FinancialConnectionsInstitution> featuredInstitutions = ((InstitutionPickerState.Payload) ((C51034wT5) this.$payload).mo6788a()).getFeaturedInstitutions();
            LazyVerticalGrid.mo111690b(featuredInstitutions.size(), null, null, new C18756xca5b181d(C18753xca5b181a.INSTANCE, featuredInstitutions), C43575jt0.m29790c(699646206, true, new C18757xca5b181e(featuredInstitutions, this.$onInstitutionSelected, this.$$dirty)));
        }
    }
}
