package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;", "payload", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onPayloadLoaded$2", m28418f = "AccountPickerViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1549#2:324\n1620#2,3:325\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$2\n*L\n131#1:324\n131#1:325,3\n*E\n"})
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$onPayloadLoaded$2 extends SuspendLambda implements Function2<AccountPickerState.Payload, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel$onPayloadLoaded$2(AccountPickerViewModel accountPickerViewModel, Continuation<? super AccountPickerViewModel$onPayloadLoaded$2> continuation) {
        super(2, continuation);
        this.this$0 = accountPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountPickerViewModel$onPayloadLoaded$2 accountPickerViewModel$onPayloadLoaded$2 = new AccountPickerViewModel$onPayloadLoaded$2(this.this$0, continuation);
        accountPickerViewModel$onPayloadLoaded$2.L$0 = obj;
        return accountPickerViewModel$onPayloadLoaded$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountPickerState.Payload payload, Continuation<? super Unit> continuation) {
        return ((AccountPickerViewModel$onPayloadLoaded$2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object first;
        Set of;
        int collectionSizeOrDefault;
        Set set;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AccountPickerState.Payload payload = (AccountPickerState.Payload) this.L$0;
            if (payload.getSkipAccountSelection()) {
                AccountPickerViewModel accountPickerViewModel = this.this$0;
                List<AccountPickerState.PartnerAccountUI> selectableAccounts = payload.getSelectableAccounts();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(selectableAccounts, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (AccountPickerState.PartnerAccountUI partnerAccountUI : selectableAccounts) {
                    arrayList.add(partnerAccountUI.getAccount().getId());
                }
                set = CollectionsKt___CollectionsKt.toSet(arrayList);
                accountPickerViewModel.submitAccounts(set, false);
            } else if (payload.getUserSelectedSingleAccountInInstitution()) {
                AccountPickerViewModel accountPickerViewModel2 = this.this$0;
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) payload.getAccounts());
                of = SetsKt__SetsJVMKt.setOf(((AccountPickerState.PartnerAccountUI) first).getAccount().getId());
                accountPickerViewModel2.submitAccounts(of, true);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
