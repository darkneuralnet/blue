package com.stripe.android.financialconnections.presentation;

import android.content.Intent;
import android.net.Uri;
import com.stripe.android.financialconnections.exception.WebAuthFlowCancelledException;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.utils.UriUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1", m28418f = "FinancialConnectionsSheetNativeViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$1 */
    /* loaded from: classes7.dex */
    public static final class C188931 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {
        final /* synthetic */ String $receivedUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188931(String str) {
            super(1);
            this.$receivedUrl = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.copy$default(setState, new C51034wT5(this.$receivedUrl), false, null, false, false, null, null, 126, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$2 */
    /* loaded from: classes7.dex */
    public static final class C188942 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {
        final /* synthetic */ String $receivedUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188942(String str) {
            super(1);
            this.$receivedUrl = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.copy$default(setState, new C51034wT5(this.$receivedUrl), false, null, false, false, null, null, 126, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$3 */
    /* loaded from: classes7.dex */
    public static final class C188953 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {
        public static final C188953 INSTANCE = new C188953();

        public C188953() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.copy$default(setState, new C32163Cj1(new WebAuthFlowCancelledException(), null, 2, null), false, null, false, false, null, null, 126, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$4 */
    /* loaded from: classes7.dex */
    public static final class C188964 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {
        final /* synthetic */ String $receivedUrl;
        final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188964(String str, FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel) {
            super(1);
            this.$receivedUrl = str;
            this.this$0 = financialConnectionsSheetNativeViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            UriUtils uriUtils;
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            String str = "Received return_url with failed status: " + this.$receivedUrl;
            uriUtils = this.this$0.uriUtils;
            return FinancialConnectionsSheetNativeState.copy$default(setState, new C32163Cj1(new WebAuthFlowFailedException(uriUtils.getQueryParameter(this.$receivedUrl, "error_reason"), str), null, 2, null), false, null, false, false, null, null, 126, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$5 */
    /* loaded from: classes7.dex */
    public static final class C188975 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {
        final /* synthetic */ String $receivedUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188975(String str) {
            super(1);
            this.$receivedUrl = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            String str = this.$receivedUrl;
            return FinancialConnectionsSheetNativeState.copy$default(setState, new C32163Cj1(new WebAuthFlowFailedException(null, "Received return_url with unknown status: " + str), null, 2, null), false, null, false, false, null, null, 126, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1$6 */
    /* loaded from: classes7.dex */
    public static final class C188986 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {
        final /* synthetic */ String $receivedUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188986(String str) {
            super(1);
            this.$receivedUrl = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            String str = this.$receivedUrl;
            return FinancialConnectionsSheetNativeState.copy$default(setState, new C32163Cj1(new WebAuthFlowFailedException(null, "Received unknown return_url: " + str), null, 2, null), false, null, false, false, null, null, 126, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1(Intent intent, FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, Continuation<? super FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1> continuation) {
        super(2, continuation);
        this.$intent = intent;
        this.this$0 = financialConnectionsSheetNativeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean contains;
        UriUtils uriUtils;
        String str2;
        String baseUrl;
        UriUtils uriUtils2;
        Uri data;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Intent intent = this.$intent;
            if (intent != null && (data = intent.getData()) != null) {
                str = data.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            contains = StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "authentication_return", true);
            if (contains) {
                this.this$0.setState(new C188931(str));
            } else {
                uriUtils = this.this$0.uriUtils;
                FinancialConnectionsSheetNativeViewModel.Companion companion = FinancialConnectionsSheetNativeViewModel.Companion;
                str2 = this.this$0.applicationId;
                baseUrl = companion.baseUrl(str2);
                if (uriUtils.compareSchemeAuthorityAndPath(str, baseUrl)) {
                    uriUtils2 = this.this$0.uriUtils;
                    String queryParameter = uriUtils2.getQueryParameter(str, "status");
                    if (queryParameter != null) {
                        int hashCode = queryParameter.hashCode();
                        if (hashCode != -1867169789) {
                            if (hashCode != -1367724422) {
                                if (hashCode == -1086574198 && queryParameter.equals("failure")) {
                                    FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = this.this$0;
                                    financialConnectionsSheetNativeViewModel.setState(new C188964(str, financialConnectionsSheetNativeViewModel));
                                }
                            } else if (queryParameter.equals("cancel")) {
                                this.this$0.setState(C188953.INSTANCE);
                            }
                        } else if (queryParameter.equals("success")) {
                            this.this$0.setState(new C188942(str));
                        }
                    }
                    this.this$0.setState(new C188975(str));
                } else {
                    this.this$0.setState(new C188986(str));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
