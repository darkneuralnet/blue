package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.LiveData;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002STB1\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010N\u001a\u00020M\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00170)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010+R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00028\u0006¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b>\u0010/R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010/R\"\u0010B\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010I\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006U"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "LOr6;", "Landroidx/lifecycle/LiveData;", "", "getTimeout", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "imageData", "", "densityDpi", "Landroid/graphics/Bitmap;", "getImage", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "action", "", "submit", "stopTimer", "onMemoryEvent", "onRefreshUi", "challengeAction", "onSubmitClicked", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "challengeResult", "onFinish", "", Entry.TYPE_TEXT, "updateChallengeText", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cres", "onNextScreen", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "imageRepository", "Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "LuX2;", "_refreshUi", "LuX2;", "refreshUi", "Landroidx/lifecycle/LiveData;", "getRefreshUi", "()Landroidx/lifecycle/LiveData;", "_submitClicked", "submitClicked", "getSubmitClicked", "_shouldFinish", "shouldFinish", "getShouldFinish", "_challengeText", "challengeText", "getChallengeText", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "_challengeRequestResult", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "challengeRequestResult", "getChallengeRequestResult", "_nextScreen", "nextScreen", "getNextScreen", "shouldRefreshUi", "Z", "getShouldRefreshUi", "()Z", "setShouldRefreshUi", "(Z)V", "Lzh2;", "transactionTimerJob", "Lzh2;", "getTransactionTimerJob$3ds2sdk_release", "()Lzh2;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lkotlin/coroutines/CoroutineContext;)V", "Factory", "OnInactiveAwareMutableLiveData", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class ChallengeActivityViewModel extends AbstractC35048Or6 {
    private final OnInactiveAwareMutableLiveData<ChallengeRequestResult> _challengeRequestResult;
    private final C49882uX2<String> _challengeText;
    private final OnInactiveAwareMutableLiveData<ChallengeResponseData> _nextScreen;
    private final C49882uX2<Unit> _refreshUi;
    private final C49882uX2<ChallengeResult> _shouldFinish;
    private final C49882uX2<ChallengeAction> _submitClicked;
    private final ChallengeActionHandler challengeActionHandler;
    private final LiveData<ChallengeRequestResult> challengeRequestResult;
    private final LiveData<String> challengeText;
    private final ImageCache imageCache;
    private final ImageRepository imageRepository;
    private final LiveData<ChallengeResponseData> nextScreen;
    private final LiveData<Unit> refreshUi;
    private final LiveData<ChallengeResult> shouldFinish;
    private boolean shouldRefreshUi;
    private final LiveData<ChallengeAction> submitClicked;
    private final TransactionTimer transactionTimer;
    private final InterfaceC52943zh2 transactionTimerJob;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1", m28418f = "ChallengeActivityViewModel.kt", m28417i = {}, m28416l = {55}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C193461 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C193461(Continuation<? super C193461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C193461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C193461) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TransactionTimer transactionTimer = ChallengeActivityViewModel.this.transactionTimer;
                this.label = 1;
                if (transactionTimer.start(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        private final ChallengeActionHandler challengeActionHandler;
        private final ErrorReporter errorReporter;
        private final TransactionTimer transactionTimer;
        private final CoroutineContext workContext;

        public Factory(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(challengeActionHandler, "challengeActionHandler");
            Intrinsics.checkNotNullParameter(transactionTimer, "transactionTimer");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.challengeActionHandler = challengeActionHandler;
            this.transactionTimer = transactionTimer;
            this.errorReporter = errorReporter;
            this.workContext = workContext;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new ChallengeActivityViewModel(this.challengeActionHandler, this.transactionTimer, this.errorReporter, null, this.workContext, 8, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "T", "LuX2;", "", "onInactive", "<init>", "()V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* loaded from: classes7.dex */
    public static final class OnInactiveAwareMutableLiveData<T> extends C49882uX2<T> {
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    public /* synthetic */ ChallengeActivityViewModel(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, ImageCache imageCache, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(challengeActionHandler, transactionTimer, errorReporter, (i & 8) != 0 ? ImageCache.Default.INSTANCE : imageCache, coroutineContext);
    }

    public final LiveData<ChallengeRequestResult> getChallengeRequestResult() {
        return this.challengeRequestResult;
    }

    public final LiveData<String> getChallengeText() {
        return this.challengeText;
    }

    public final LiveData<Bitmap> getImage(ChallengeResponseData.Image image, int i) {
        return WC0.m78736b(null, 0L, new ChallengeActivityViewModel$getImage$1(this, image, i, null), 3, null);
    }

    public final LiveData<ChallengeResponseData> getNextScreen() {
        return this.nextScreen;
    }

    public final LiveData<Unit> getRefreshUi() {
        return this.refreshUi;
    }

    public final LiveData<ChallengeResult> getShouldFinish() {
        return this.shouldFinish;
    }

    public final boolean getShouldRefreshUi() {
        return this.shouldRefreshUi;
    }

    public final LiveData<ChallengeAction> getSubmitClicked() {
        return this.submitClicked;
    }

    public final LiveData<Boolean> getTimeout() {
        return WC0.m78736b(null, 0L, new ChallengeActivityViewModel$getTimeout$1(this, null), 3, null);
    }

    public final InterfaceC52943zh2 getTransactionTimerJob$3ds2sdk_release() {
        return this.transactionTimerJob;
    }

    public final void onFinish(ChallengeResult challengeResult) {
        Intrinsics.checkNotNullParameter(challengeResult, "challengeResult");
        this._shouldFinish.postValue(challengeResult);
    }

    public final void onMemoryEvent() {
        this.imageCache.clear();
    }

    public final void onNextScreen(ChallengeResponseData cres) {
        Intrinsics.checkNotNullParameter(cres, "cres");
        this._nextScreen.setValue(cres);
    }

    public final void onRefreshUi() {
        this._refreshUi.setValue(Unit.INSTANCE);
    }

    public final void onSubmitClicked(ChallengeAction challengeAction) {
        Intrinsics.checkNotNullParameter(challengeAction, "challengeAction");
        this._submitClicked.postValue(challengeAction);
    }

    public final void setShouldRefreshUi(boolean z) {
        this.shouldRefreshUi = z;
    }

    public final void stopTimer() {
        InterfaceC52943zh2.C31478a.m550a(this.transactionTimerJob, null, 1, null);
    }

    public final void submit(ChallengeAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new ChallengeActivityViewModel$submit$1(this, action, null), 3, null);
    }

    public final void updateChallengeText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this._challengeText.setValue(text);
    }

    public ChallengeActivityViewModel(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, ImageCache imageCache, CoroutineContext workContext) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(challengeActionHandler, "challengeActionHandler");
        Intrinsics.checkNotNullParameter(transactionTimer, "transactionTimer");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.challengeActionHandler = challengeActionHandler;
        this.transactionTimer = transactionTimer;
        this.imageCache = imageCache;
        this.imageRepository = new ImageRepository(errorReporter, workContext);
        C49882uX2<Unit> c49882uX2 = new C49882uX2<>();
        this._refreshUi = c49882uX2;
        this.refreshUi = c49882uX2;
        C49882uX2<ChallengeAction> c49882uX22 = new C49882uX2<>();
        this._submitClicked = c49882uX22;
        this.submitClicked = c49882uX22;
        C49882uX2<ChallengeResult> c49882uX23 = new C49882uX2<>();
        this._shouldFinish = c49882uX23;
        this.shouldFinish = c49882uX23;
        C49882uX2<String> c49882uX24 = new C49882uX2<>();
        this._challengeText = c49882uX24;
        this.challengeText = c49882uX24;
        OnInactiveAwareMutableLiveData<ChallengeRequestResult> onInactiveAwareMutableLiveData = new OnInactiveAwareMutableLiveData<>();
        this._challengeRequestResult = onInactiveAwareMutableLiveData;
        this.challengeRequestResult = onInactiveAwareMutableLiveData;
        OnInactiveAwareMutableLiveData<ChallengeResponseData> onInactiveAwareMutableLiveData2 = new OnInactiveAwareMutableLiveData<>();
        this._nextScreen = onInactiveAwareMutableLiveData2;
        this.nextScreen = onInactiveAwareMutableLiveData2;
        m73800d = Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C193461(null), 3, null);
        this.transactionTimerJob = m73800d;
    }
}
