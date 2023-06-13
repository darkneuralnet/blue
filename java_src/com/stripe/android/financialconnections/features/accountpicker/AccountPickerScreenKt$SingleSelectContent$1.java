package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAccountPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$SingleSelectContent$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,521:1\n136#2,12:522\n*S KotlinDebug\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$SingleSelectContent$1\n*L\n272#1:522,12\n*E\n"})
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$SingleSelectContent$1 extends Lambda implements Function1<InterfaceC52420yo2, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<AccountPickerState.PartnerAccountUI> $accounts;
    final /* synthetic */ Function1<PartnerAccount, Unit> $onAccountClicked;
    final /* synthetic */ Set<String> $selectedIds;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$SingleSelectContent$1$1 */
    /* loaded from: classes7.dex */
    public static final class C186681 extends Lambda implements Function1<AccountPickerState.PartnerAccountUI, Object> {
        public static final C186681 INSTANCE = new C186681();

        public C186681() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(AccountPickerState.PartnerAccountUI it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getAccount().getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPickerScreenKt$SingleSelectContent$1(List<AccountPickerState.PartnerAccountUI> list, Set<String> set, Function1<? super PartnerAccount, Unit> function1, int i) {
        super(1);
        this.$accounts = list;
        this.$selectedIds = set;
        this.$onAccountClicked = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC52420yo2 interfaceC52420yo2) {
        invoke2(interfaceC52420yo2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC52420yo2 LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<AccountPickerState.PartnerAccountUI> list = this.$accounts;
        C186681 c186681 = C186681.INSTANCE;
        Set<String> set = this.$selectedIds;
        Function1<PartnerAccount, Unit> function1 = this.$onAccountClicked;
        int i = this.$$dirty;
        LazyColumn.mo409c(list.size(), c186681 != null ? new C18661x8723f164(c186681, list) : null, new C18662x8723f165(C18660x8723f163.INSTANCE, list), C43575jt0.m29790c(-632812321, true, new C18663x8723f166(list, set, function1, i)));
    }
}
