package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$submitAccounts$1", m28418f = "AccountPickerViewModel.kt", m28417i = {}, m28416l = {204, 205}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$submitAccounts$1 extends SuspendLambda implements Function1<Continuation<? super PartnerAccountsList>, Object> {
    final /* synthetic */ Set<String> $selectedIds;
    final /* synthetic */ boolean $updateLocalCache;
    int label;
    final /* synthetic */ AccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel$submitAccounts$1(AccountPickerViewModel accountPickerViewModel, Set<String> set, boolean z, Continuation<? super AccountPickerViewModel$submitAccounts$1> continuation) {
        super(1, continuation);
        this.this$0 = accountPickerViewModel;
        this.$selectedIds = set;
        this.$updateLocalCache = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AccountPickerViewModel$submitAccounts$1(this.this$0, this.$selectedIds, this.$updateLocalCache, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        GetManifest getManifest;
        SelectAccounts selectAccounts;
        GoNext goNext;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    PartnerAccountsList partnerAccountsList = (PartnerAccountsList) obj;
                    goNext = this.this$0.goNext;
                    GoNext.invoke$default(goNext, partnerAccountsList.getNextPane(), null, 2, null);
                    return partnerAccountsList;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            getManifest = this.this$0.getManifest;
            this.label = 1;
            obj = getManifest.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        selectAccounts = this.this$0.selectAccounts;
        Set<String> set = this.$selectedIds;
        FinancialConnectionsAuthorizationSession activeAuthSession = ((FinancialConnectionsSessionManifest) obj).getActiveAuthSession();
        if (activeAuthSession != null) {
            String id = activeAuthSession.getId();
            boolean z = this.$updateLocalCache;
            this.label = 2;
            obj = selectAccounts.invoke(set, id, z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            PartnerAccountsList partnerAccountsList2 = (PartnerAccountsList) obj;
            goNext = this.this$0.goNext;
            GoNext.invoke$default(goNext, partnerAccountsList2.getNextPane(), null, 2, null);
            return partnerAccountsList2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PartnerAccountsList> continuation) {
        return ((AccountPickerViewModel$submitAccounts$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
