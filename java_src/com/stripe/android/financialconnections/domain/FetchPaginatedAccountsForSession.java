package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import com.stripe.android.financialconnections.model.ManualEntry;
import com.stripe.android.financialconnections.model.PaymentAccount;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;", "", "financialConnectionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "session", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FetchPaginatedAccountsForSession {
    private final FinancialConnectionsRepository financialConnectionsRepository;

    public FetchPaginatedAccountsForSession(FinancialConnectionsRepository financialConnectionsRepository) {
        Intrinsics.checkNotNullParameter(financialConnectionsRepository, "financialConnectionsRepository");
        this.financialConnectionsRepository = financialConnectionsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00e2 -> B:30:0x00e5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(FinancialConnectionsSession financialConnectionsSession, Continuation<? super FinancialConnectionsSession> continuation) {
        FetchPaginatedAccountsForSession$invoke$1 fetchPaginatedAccountsForSession$invoke$1;
        Object coroutine_suspended;
        int i;
        List arrayList;
        Object last;
        FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession;
        FinancialConnectionsSession financialConnectionsSession2;
        FinancialConnectionsAccountList financialConnectionsAccountList;
        List list;
        FinancialConnectionsSession financialConnectionsSession3;
        FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession2;
        Object last2;
        if (continuation instanceof FetchPaginatedAccountsForSession$invoke$1) {
            fetchPaginatedAccountsForSession$invoke$1 = (FetchPaginatedAccountsForSession$invoke$1) continuation;
            int i2 = fetchPaginatedAccountsForSession$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchPaginatedAccountsForSession$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchPaginatedAccountsForSession$invoke$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchPaginatedAccountsForSession$invoke$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession3 = (FetchPaginatedAccountsForSession) fetchPaginatedAccountsForSession$invoke$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            list = (List) fetchPaginatedAccountsForSession$invoke$1.L$2;
                            financialConnectionsSession3 = (FinancialConnectionsSession) fetchPaginatedAccountsForSession$invoke$1.L$1;
                            fetchPaginatedAccountsForSession2 = fetchPaginatedAccountsForSession3;
                            financialConnectionsAccountList = (FinancialConnectionsAccountList) obj;
                            list.addAll(financialConnectionsAccountList.getData());
                            if (!financialConnectionsAccountList.getHasMore() && list.size() < 100) {
                                FinancialConnectionsRepository financialConnectionsRepository = fetchPaginatedAccountsForSession2.financialConnectionsRepository;
                                String clientSecret = financialConnectionsSession3.getClientSecret();
                                last2 = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
                                GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams = new GetFinancialConnectionsAcccountsParams(clientSecret, ((FinancialConnectionsAccount) last2).getId());
                                fetchPaginatedAccountsForSession$invoke$1.L$0 = fetchPaginatedAccountsForSession2;
                                fetchPaginatedAccountsForSession$invoke$1.L$1 = financialConnectionsSession3;
                                fetchPaginatedAccountsForSession$invoke$1.L$2 = list;
                                fetchPaginatedAccountsForSession$invoke$1.label = 2;
                                obj = financialConnectionsRepository.getFinancialConnectionsAccounts(getFinancialConnectionsAcccountsParams, fetchPaginatedAccountsForSession$invoke$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                financialConnectionsAccountList = (FinancialConnectionsAccountList) obj;
                                list.addAll(financialConnectionsAccountList.getData());
                                if (!financialConnectionsAccountList.getHasMore()) {
                                }
                                return new FinancialConnectionsSession(financialConnectionsSession3.getClientSecret(), financialConnectionsSession3.getId(), (FinancialConnectionsAccountList) null, new FinancialConnectionsAccountList(list, financialConnectionsAccountList.getHasMore(), financialConnectionsAccountList.getUrl(), Boxing.boxInt(list.size()), financialConnectionsAccountList.getTotalCount()), financialConnectionsSession3.getLivemode(), (PaymentAccount) null, (String) null, (String) null, (ManualEntry) null, (FinancialConnectionsSession.Status) null, (FinancialConnectionsSession.StatusDetails) null, 1892, (DefaultConstructorMarker) null);
                            }
                            return new FinancialConnectionsSession(financialConnectionsSession3.getClientSecret(), financialConnectionsSession3.getId(), (FinancialConnectionsAccountList) null, new FinancialConnectionsAccountList(list, financialConnectionsAccountList.getHasMore(), financialConnectionsAccountList.getUrl(), Boxing.boxInt(list.size()), financialConnectionsAccountList.getTotalCount()), financialConnectionsSession3.getLivemode(), (PaymentAccount) null, (String) null, (String) null, (ManualEntry) null, (FinancialConnectionsSession.Status) null, (FinancialConnectionsSession.StatusDetails) null, 1892, (DefaultConstructorMarker) null);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (List) fetchPaginatedAccountsForSession$invoke$1.L$2;
                    financialConnectionsSession2 = (FinancialConnectionsSession) fetchPaginatedAccountsForSession$invoke$1.L$1;
                    fetchPaginatedAccountsForSession = (FetchPaginatedAccountsForSession) fetchPaginatedAccountsForSession$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (financialConnectionsSession.getAccounts().getHasMore()) {
                        arrayList = new ArrayList();
                        arrayList.addAll(financialConnectionsSession.getAccounts().getData());
                        FinancialConnectionsRepository financialConnectionsRepository2 = this.financialConnectionsRepository;
                        String clientSecret2 = financialConnectionsSession.getClientSecret();
                        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList);
                        GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams2 = new GetFinancialConnectionsAcccountsParams(clientSecret2, ((FinancialConnectionsAccount) last).getId());
                        fetchPaginatedAccountsForSession$invoke$1.L$0 = this;
                        fetchPaginatedAccountsForSession$invoke$1.L$1 = financialConnectionsSession;
                        fetchPaginatedAccountsForSession$invoke$1.L$2 = arrayList;
                        fetchPaginatedAccountsForSession$invoke$1.label = 1;
                        obj = financialConnectionsRepository2.getFinancialConnectionsAccounts(getFinancialConnectionsAcccountsParams2, fetchPaginatedAccountsForSession$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        fetchPaginatedAccountsForSession = this;
                        financialConnectionsSession2 = financialConnectionsSession;
                    } else {
                        return financialConnectionsSession;
                    }
                }
                financialConnectionsAccountList = (FinancialConnectionsAccountList) obj;
                arrayList.addAll(financialConnectionsAccountList.getData());
                FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession4 = fetchPaginatedAccountsForSession;
                list = arrayList;
                financialConnectionsSession3 = financialConnectionsSession2;
                fetchPaginatedAccountsForSession2 = fetchPaginatedAccountsForSession4;
                if (!financialConnectionsAccountList.getHasMore()) {
                }
                return new FinancialConnectionsSession(financialConnectionsSession3.getClientSecret(), financialConnectionsSession3.getId(), (FinancialConnectionsAccountList) null, new FinancialConnectionsAccountList(list, financialConnectionsAccountList.getHasMore(), financialConnectionsAccountList.getUrl(), Boxing.boxInt(list.size()), financialConnectionsAccountList.getTotalCount()), financialConnectionsSession3.getLivemode(), (PaymentAccount) null, (String) null, (String) null, (ManualEntry) null, (FinancialConnectionsSession.Status) null, (FinancialConnectionsSession.StatusDetails) null, 1892, (DefaultConstructorMarker) null);
            }
        }
        fetchPaginatedAccountsForSession$invoke$1 = new FetchPaginatedAccountsForSession$invoke$1(this, continuation);
        Object obj2 = fetchPaginatedAccountsForSession$invoke$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchPaginatedAccountsForSession$invoke$1.label;
        if (i == 0) {
        }
        financialConnectionsAccountList = (FinancialConnectionsAccountList) obj2;
        arrayList.addAll(financialConnectionsAccountList.getData());
        FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession42 = fetchPaginatedAccountsForSession;
        list = arrayList;
        financialConnectionsSession3 = financialConnectionsSession2;
        fetchPaginatedAccountsForSession2 = fetchPaginatedAccountsForSession42;
        if (!financialConnectionsAccountList.getHasMore()) {
        }
        return new FinancialConnectionsSession(financialConnectionsSession3.getClientSecret(), financialConnectionsSession3.getId(), (FinancialConnectionsAccountList) null, new FinancialConnectionsAccountList(list, financialConnectionsAccountList.getHasMore(), financialConnectionsAccountList.getUrl(), Boxing.boxInt(list.size()), financialConnectionsAccountList.getTotalCount()), financialConnectionsSession3.getLivemode(), (PaymentAccount) null, (String) null, (String) null, (ManualEntry) null, (FinancialConnectionsSession.Status) null, (FinancialConnectionsSession.StatusDetails) null, 1892, (DefaultConstructorMarker) null);
    }
}
