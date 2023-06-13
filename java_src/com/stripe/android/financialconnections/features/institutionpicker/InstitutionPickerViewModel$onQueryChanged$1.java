package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onQueryChanged$1", m28418f = "InstitutionPickerViewModel.kt", m28417i = {1, 2}, m28416l = {92, 94, 99}, m28415m = "invokeSuspend", m28414n = {"startTime$iv", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, m28413s = {"J$0", "L$0"})
@SourceDebugExtension({"SMAP\nInstitutionPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstitutionPickerViewModel.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onQueryChanged$1\n+ 2 Time.kt\ncom/stripe/android/financialconnections/utils/TimeKt\n*L\n1#1,203:1\n6#2,4:204\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerViewModel.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onQueryChanged$1\n*L\n93#1:204,4\n*E\n"})
/* loaded from: classes7.dex */
public final class InstitutionPickerViewModel$onQueryChanged$1 extends SuspendLambda implements Function1<Continuation<? super InstitutionResponse>, Object> {
    final /* synthetic */ String $query;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ InstitutionPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerViewModel$onQueryChanged$1(String str, InstitutionPickerViewModel institutionPickerViewModel, Continuation<? super InstitutionPickerViewModel$onQueryChanged$1> continuation) {
        super(1, continuation);
        this.$query = str;
        this.this$0 = institutionPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InstitutionPickerViewModel$onQueryChanged$1(this.$query, this.this$0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        boolean isBlank;
        List emptyList;
        SearchInstitutions searchInstitutions;
        long j;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
        FinancialConnectionsEvent.SearchSucceeded searchSucceeded;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        InstitutionResponse institutionResponse = (InstitutionResponse) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).m116792unboximpl();
                        return institutionResponse;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
                Pair m28425to = TuplesKt.m28425to((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j));
                InstitutionResponse institutionResponse2 = (InstitutionResponse) m28425to.component1();
                long longValue = ((Number) m28425to.component2()).longValue();
                financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
                searchSucceeded = new FinancialConnectionsEvent.SearchSucceeded(FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER, this.$query, longValue, institutionResponse2.getData().size());
                this.L$0 = institutionResponse2;
                this.label = 3;
                if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(searchSucceeded, this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return institutionResponse2;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            isBlank = StringsKt__StringsJVMKt.isBlank(this.$query);
            if (!isBlank) {
                this.label = 1;
                if (C48120rZ0.m15768a(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return new InstitutionResponse(emptyList);
            }
        }
        InstitutionPickerViewModel institutionPickerViewModel = this.this$0;
        String str = this.$query;
        long currentTimeMillis = System.currentTimeMillis();
        searchInstitutions = institutionPickerViewModel.searchInstitutions;
        String financialConnectionsSessionClientSecret = institutionPickerViewModel.configuration.getFinancialConnectionsSessionClientSecret();
        this.J$0 = currentTimeMillis;
        this.label = 2;
        obj = searchInstitutions.invoke(financialConnectionsSessionClientSecret, str, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        j = currentTimeMillis;
        Pair m28425to2 = TuplesKt.m28425to((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j));
        InstitutionResponse institutionResponse22 = (InstitutionResponse) m28425to2.component1();
        long longValue2 = ((Number) m28425to2.component2()).longValue();
        financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
        searchSucceeded = new FinancialConnectionsEvent.SearchSucceeded(FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER, this.$query, longValue2, institutionResponse22.getData().size());
        this.L$0 = institutionResponse22;
        this.label = 3;
        if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(searchSucceeded, this) != coroutine_suspended) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InstitutionResponse> continuation) {
        return ((InstitutionPickerViewModel$onQueryChanged$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
