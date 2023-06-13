package com.stripe.android.financialconnections.features.attachpayment;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.GetAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty1;
import p000.WN2;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBI\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "", "logErrors", "onEnterDetailsManually", "onSelectAnotherBank", "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;", "pollAttachPaymentAccount", "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;", "getAuthorizationSessionAccounts", "Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "navigationManager", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "getManifest", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "Lcom/stripe/android/financialconnections/domain/GoNext;", "goNext", "Lcom/stripe/android/financialconnections/domain/GoNext;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AttachPaymentViewModel extends RN2<AttachPaymentState> {
    public static final Companion Companion = new Companion(null);
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetAuthorizationSessionAccounts getAuthorizationSessionAccounts;
    private final GetManifest getManifest;
    private final GoNext goNext;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final PollAttachPaymentAccount pollAttachPaymentAccount;

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$1", m28418f = "AttachPaymentViewModel.kt", m28417i = {}, m28416l = {42, 46}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C186961 extends SuspendLambda implements Function1<Continuation<? super AttachPaymentState.Payload>, Object> {
        Object L$0;
        int label;

        public C186961(Continuation<? super C186961> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C186961(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            String str;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        str = (String) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        return new AttachPaymentState.Payload(((PartnerAccountsList) obj).getData().size(), str);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                GetManifest getManifest = AttachPaymentViewModel.this.getManifest;
                this.label = 1;
                obj = getManifest.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
            FinancialConnectionsAuthorizationSession activeAuthSession = financialConnectionsSessionManifest.getActiveAuthSession();
            if (activeAuthSession != null) {
                String businessName = financialConnectionsSessionManifest.getBusinessName();
                GetAuthorizationSessionAccounts getAuthorizationSessionAccounts = AttachPaymentViewModel.this.getAuthorizationSessionAccounts;
                String id = activeAuthSession.getId();
                this.L$0 = businessName;
                this.label = 2;
                Object invoke = getAuthorizationSessionAccounts.invoke(id, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = businessName;
                obj = invoke;
                return new AttachPaymentState.Payload(((PartnerAccountsList) obj).getData().size(), str);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AttachPaymentState.Payload> continuation) {
            return ((C186961) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "Ldp;", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Ldp;)Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C186972 extends Lambda implements Function2<AttachPaymentState, AbstractC19862dp<? extends AttachPaymentState.Payload>, AttachPaymentState> {
        public static final C186972 INSTANCE = new C186972();

        public C186972() {
            super(2);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final AttachPaymentState invoke2(AttachPaymentState execute, AbstractC19862dp<AttachPaymentState.Payload> it) {
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            Intrinsics.checkNotNullParameter(it, "it");
            return AttachPaymentState.copy$default(execute, it, null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ AttachPaymentState invoke(AttachPaymentState attachPaymentState, AbstractC19862dp<? extends AttachPaymentState.Payload> abstractC19862dp) {
            return invoke2(attachPaymentState, (AbstractC19862dp<AttachPaymentState.Payload>) abstractC19862dp);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$3", m28418f = "AttachPaymentViewModel.kt", m28417i = {1, 1, 1, 2, 2, 3}, m28416l = {50, 53, 57, 63}, m28415m = "invokeSuspend", m28414n = {"manifest", "authSession", "activeInstitution", "authSession", "startTime$iv", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, m28413s = {"L$0", "L$1", "L$2", "L$0", "J$0", "L$0"})
    @SourceDebugExtension({"SMAP\nAttachPaymentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachPaymentViewModel.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3\n+ 2 Time.kt\ncom/stripe/android/financialconnections/utils/TimeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n6#2,2:119\n9#2:122\n1#3:121\n*S KotlinDebug\n*F\n+ 1 AttachPaymentViewModel.kt\ncom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3\n*L\n56#1:119,2\n56#1:122\n*E\n"})
    /* renamed from: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$3 */
    /* loaded from: classes7.dex */
    public static final class C186983 extends SuspendLambda implements Function1<Continuation<? super LinkAccountSessionPaymentAccount>, Object> {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C186983(Continuation<? super C186983> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C186983(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0125 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object invoke;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Object invoke2;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
            FinancialConnectionsInstitution financialConnectionsInstitution;
            List<PartnerAccount> data;
            Object first;
            AttachPaymentViewModel attachPaymentViewModel;
            Object invoke3;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2;
            long j;
            FinancialConnectionsSessionManifest.Pane nextPane;
            FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
            FinancialConnectionsEvent.PollAttachPaymentsSucceeded pollAttachPaymentsSucceeded;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                ((Result) obj).m116792unboximpl();
                                return linkAccountSessionPaymentAccount;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = this.J$0;
                        financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        attachPaymentViewModel = (AttachPaymentViewModel) this.L$1;
                        invoke3 = obj;
                        LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount2 = (LinkAccountSessionPaymentAccount) invoke3;
                        GoNext goNext = attachPaymentViewModel.goNext;
                        nextPane = linkAccountSessionPaymentAccount2.getNextPane();
                        if (nextPane == null) {
                            nextPane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
                        }
                        GoNext.invoke$default(goNext, nextPane, null, 2, null);
                        Pair m28425to = TuplesKt.m28425to(linkAccountSessionPaymentAccount2, Boxing.boxLong(System.currentTimeMillis() - j));
                        LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount3 = (LinkAccountSessionPaymentAccount) m28425to.component1();
                        long longValue = ((Number) m28425to.component2()).longValue();
                        financialConnectionsAnalyticsTracker = AttachPaymentViewModel.this.eventTracker;
                        pollAttachPaymentsSucceeded = new FinancialConnectionsEvent.PollAttachPaymentsSucceeded(financialConnectionsAuthorizationSession2.getId(), longValue);
                        this.L$0 = linkAccountSessionPaymentAccount3;
                        this.L$1 = null;
                        this.label = 4;
                        if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(pollAttachPaymentsSucceeded, this) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return linkAccountSessionPaymentAccount3;
                    }
                    financialConnectionsInstitution = (FinancialConnectionsInstitution) this.L$2;
                    financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) this.L$1;
                    financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    invoke2 = obj;
                    data = ((PartnerAccountsList) invoke2).getData();
                    if (data.size() != 1) {
                        z = false;
                    }
                    if (!z) {
                        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) data);
                        String linkedAccountId = ((PartnerAccount) first).getLinkedAccountId();
                        attachPaymentViewModel = AttachPaymentViewModel.this;
                        long currentTimeMillis = System.currentTimeMillis();
                        PollAttachPaymentAccount pollAttachPaymentAccount = attachPaymentViewModel.pollAttachPaymentAccount;
                        boolean allowManualEntry = financialConnectionsSessionManifest.getAllowManualEntry();
                        if (linkedAccountId != null) {
                            PaymentAccountParams.LinkedAccount linkedAccount = new PaymentAccountParams.LinkedAccount(linkedAccountId);
                            this.L$0 = financialConnectionsAuthorizationSession;
                            this.L$1 = attachPaymentViewModel;
                            this.L$2 = null;
                            this.J$0 = currentTimeMillis;
                            this.label = 3;
                            invoke3 = pollAttachPaymentAccount.invoke(allowManualEntry, financialConnectionsInstitution, linkedAccount, this);
                            if (invoke3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            financialConnectionsAuthorizationSession2 = financialConnectionsAuthorizationSession;
                            j = currentTimeMillis;
                            LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount22 = (LinkAccountSessionPaymentAccount) invoke3;
                            GoNext goNext2 = attachPaymentViewModel.goNext;
                            nextPane = linkAccountSessionPaymentAccount22.getNextPane();
                            if (nextPane == null) {
                            }
                            GoNext.invoke$default(goNext2, nextPane, null, 2, null);
                            Pair m28425to2 = TuplesKt.m28425to(linkAccountSessionPaymentAccount22, Boxing.boxLong(System.currentTimeMillis() - j));
                            LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount32 = (LinkAccountSessionPaymentAccount) m28425to2.component1();
                            long longValue2 = ((Number) m28425to2.component2()).longValue();
                            financialConnectionsAnalyticsTracker = AttachPaymentViewModel.this.eventTracker;
                            pollAttachPaymentsSucceeded = new FinancialConnectionsEvent.PollAttachPaymentsSucceeded(financialConnectionsAuthorizationSession2.getId(), longValue2);
                            this.L$0 = linkAccountSessionPaymentAccount32;
                            this.L$1 = null;
                            this.label = 4;
                            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(pollAttachPaymentsSucceeded, this) != coroutine_suspended) {
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    invoke = obj;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                GetManifest getManifest = AttachPaymentViewModel.this.getManifest;
                this.label = 1;
                invoke = getManifest.invoke(this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) invoke;
            FinancialConnectionsAuthorizationSession activeAuthSession = financialConnectionsSessionManifest.getActiveAuthSession();
            if (activeAuthSession != null) {
                FinancialConnectionsInstitution activeInstitution = financialConnectionsSessionManifest.getActiveInstitution();
                if (activeInstitution != null) {
                    GetAuthorizationSessionAccounts getAuthorizationSessionAccounts = AttachPaymentViewModel.this.getAuthorizationSessionAccounts;
                    String id = activeAuthSession.getId();
                    this.L$0 = financialConnectionsSessionManifest;
                    this.L$1 = activeAuthSession;
                    this.L$2 = activeInstitution;
                    this.label = 2;
                    invoke2 = getAuthorizationSessionAccounts.invoke(id, this);
                    if (invoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsAuthorizationSession = activeAuthSession;
                    financialConnectionsInstitution = activeInstitution;
                    data = ((PartnerAccountsList) invoke2).getData();
                    if (data.size() != 1) {
                    }
                    if (!z) {
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
            return ((C186983) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "Ldp;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Ldp;)Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$4 */
    /* loaded from: classes7.dex */
    public static final class C186994 extends Lambda implements Function2<AttachPaymentState, AbstractC19862dp<? extends LinkAccountSessionPaymentAccount>, AttachPaymentState> {
        public static final C186994 INSTANCE = new C186994();

        public C186994() {
            super(2);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final AttachPaymentState invoke2(AttachPaymentState execute, AbstractC19862dp<LinkAccountSessionPaymentAccount> it) {
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            Intrinsics.checkNotNullParameter(it, "it");
            return AttachPaymentState.copy$default(execute, null, it, 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ AttachPaymentState invoke(AttachPaymentState attachPaymentState, AbstractC19862dp<? extends LinkAccountSessionPaymentAccount> abstractC19862dp) {
            return invoke2(attachPaymentState, (AbstractC19862dp<LinkAccountSessionPaymentAccount>) abstractC19862dp);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<AttachPaymentViewModel, AttachPaymentState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public AttachPaymentViewModel create(AbstractC35282Pr6 viewModelContext, AttachPaymentState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return ((FinancialConnectionsSheetNativeActivity) viewModelContext.m89681a()).getViewModel().getActivityRetainedComponent().getAttachPaymentSubcomponent().initialState(state).build().getViewModel();
        }

        public AttachPaymentState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (AttachPaymentState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachPaymentViewModel(AttachPaymentState initialState, PollAttachPaymentAccount pollAttachPaymentAccount, FinancialConnectionsAnalyticsTracker eventTracker, GetAuthorizationSessionAccounts getAuthorizationSessionAccounts, NavigationManager navigationManager, GetManifest getManifest, GoNext goNext, Logger logger) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(pollAttachPaymentAccount, "pollAttachPaymentAccount");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(getAuthorizationSessionAccounts, "getAuthorizationSessionAccounts");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(getManifest, "getManifest");
        Intrinsics.checkNotNullParameter(goNext, "goNext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.pollAttachPaymentAccount = pollAttachPaymentAccount;
        this.eventTracker = eventTracker;
        this.getAuthorizationSessionAccounts = getAuthorizationSessionAccounts;
        this.navigationManager = navigationManager;
        this.getManifest = getManifest;
        this.goNext = goNext;
        this.logger = logger;
        logErrors();
        RN2.execute$default(this, new C186961(null), (SC0) null, (KProperty1) null, C186972.INSTANCE, 3, (Object) null);
        RN2.execute$default(this, new C186983(null), (SC0) null, (KProperty1) null, C186994.INSTANCE, 3, (Object) null);
    }

    private final void logErrors() {
        onAsync(AttachPaymentViewModel$logErrors$1.INSTANCE, new AttachPaymentViewModel$logErrors$2(this, null), new AttachPaymentViewModel$logErrors$3(this, null));
        RN2.onAsync$default(this, AttachPaymentViewModel$logErrors$4.INSTANCE, new AttachPaymentViewModel$logErrors$5(this, null), null, 4, null);
    }

    public final void onEnterDetailsManually() {
        this.navigationManager.navigate(NavigationDirections.INSTANCE.getManualEntry());
    }

    public final void onSelectAnotherBank() {
        this.navigationManager.navigate(NavigationDirections.INSTANCE.getReset());
    }
}
