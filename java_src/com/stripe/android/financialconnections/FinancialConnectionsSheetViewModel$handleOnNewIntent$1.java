package com.stripe.android.financialconnections;

import android.content.Intent;
import android.net.Uri;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$handleOnNewIntent$1", m28418f = "FinancialConnectionsSheetViewModel.kt", m28417i = {0, 1, 1}, m28416l = {454, 305}, m28415m = "invokeSuspend", m28414n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "receivedUrl"}, m28413s = {"L$0", "L$0", "L$2"})
@SourceDebugExtension({"SMAP\nFinancialConnectionsSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,448:1\n107#2,10:449\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1\n*L\n303#1:449,10\n*E\n"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel$handleOnNewIntent$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$handleOnNewIntent$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, Intent intent, Continuation<? super FinancialConnectionsSheetViewModel$handleOnNewIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetViewModel;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetViewModel$handleOnNewIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetViewModel$handleOnNewIntent$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001b, B:31:0x0086, B:33:0x008a, B:35:0x0090, B:38:0x009a, B:80:0x0178, B:40:0x00cb, B:42:0x00d1, B:44:0x00d9, B:46:0x00df, B:48:0x00e5, B:50:0x00eb, B:52:0x00f1, B:54:0x010f, B:56:0x0116, B:58:0x011c, B:60:0x0122, B:62:0x012c, B:64:0x0132, B:66:0x0138, B:68:0x013e, B:70:0x0144, B:72:0x014a, B:74:0x0154, B:76:0x015a, B:78:0x0160, B:79:0x0164), top: B:85:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[Catch: all -> 0x0020, TRY_ENTER, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001b, B:31:0x0086, B:33:0x008a, B:35:0x0090, B:38:0x009a, B:80:0x0178, B:40:0x00cb, B:42:0x00d1, B:44:0x00d9, B:46:0x00df, B:48:0x00e5, B:50:0x00eb, B:52:0x00f1, B:54:0x010f, B:56:0x0116, B:58:0x011c, B:60:0x0122, B:62:0x012c, B:64:0x0132, B:66:0x0138, B:68:0x013e, B:70:0x0144, B:72:0x014a, B:74:0x0154, B:76:0x015a, B:78:0x0160, B:79:0x0164), top: B:85:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        SX2 sx2;
        Intent intent;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel;
        String uri;
        Uri uriOrNull;
        SX2 sx22;
        Throwable th;
        Object awaitState;
        Uri uri2;
        String str;
        String str2;
        Uri.Builder builder;
        String str3;
        Uri.Builder builder2;
        String str4;
        Uri.Builder buildUpon;
        Uri.Builder buildUpon2;
        String str5;
        String str6;
        Uri.Builder clearQuery;
        Uri build;
        String str7;
        String replaceFirst$default;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    uri2 = (Uri) this.L$2;
                    financialConnectionsSheetViewModel = (FinancialConnectionsSheetViewModel) this.L$1;
                    sx22 = (SX2) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        FinancialConnectionsSheetState financialConnectionsSheetState = (FinancialConnectionsSheetState) obj;
                        if (uri2 == null) {
                            str = uri2.getHost();
                        } else {
                            str = null;
                        }
                        if (!Intrinsics.areEqual(str, "native-redirect")) {
                            String uri3 = uri2.toString();
                            Intrinsics.checkNotNullExpressionValue(uri3, "receivedUrl.toString()");
                            str7 = financialConnectionsSheetViewModel.applicationId;
                            replaceFirst$default = StringsKt__StringsJVMKt.replaceFirst$default(uri3, "stripe-auth://native-redirect/" + str7 + "/", "", false, 4, (Object) null);
                            financialConnectionsSheetViewModel.onStartApp2App(replaceFirst$default);
                        } else {
                            if (uri2 != null) {
                                str2 = uri2.getHost();
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.areEqual(str2, "link-accounts")) {
                                Uri.Builder buildUpon3 = uri2.buildUpon();
                                if (buildUpon3 != null && (clearQuery = buildUpon3.clearQuery()) != null && (build = clearQuery.build()) != null) {
                                    str5 = build.getPath();
                                } else {
                                    str5 = null;
                                }
                                str6 = financialConnectionsSheetViewModel.applicationId;
                                if (Intrinsics.areEqual(str5, "/" + str6 + "/authentication_return")) {
                                    financialConnectionsSheetViewModel.onFinishApp2App(uri2);
                                }
                            }
                            if (uri2 != null && (buildUpon2 = uri2.buildUpon()) != null) {
                                builder = buildUpon2.clearQuery();
                            } else {
                                builder = null;
                            }
                            String valueOf = String.valueOf(builder);
                            FinancialConnectionsSessionManifest manifest = financialConnectionsSheetState.getManifest();
                            if (manifest != null) {
                                str3 = manifest.getSuccessUrl();
                            } else {
                                str3 = null;
                            }
                            if (Intrinsics.areEqual(valueOf, str3)) {
                                financialConnectionsSheetViewModel.onFlowSuccess(financialConnectionsSheetState, uri2);
                            } else {
                                if (uri2 != null && (buildUpon = uri2.buildUpon()) != null) {
                                    builder2 = buildUpon.clearQuery();
                                } else {
                                    builder2 = null;
                                }
                                String valueOf2 = String.valueOf(builder2);
                                FinancialConnectionsSessionManifest manifest2 = financialConnectionsSheetState.getManifest();
                                if (manifest2 != null) {
                                    str4 = manifest2.getCancelUrl();
                                } else {
                                    str4 = null;
                                }
                                if (Intrinsics.areEqual(valueOf2, str4)) {
                                    financialConnectionsSheetViewModel.onFlowCancelled(financialConnectionsSheetState);
                                } else {
                                    financialConnectionsSheetViewModel.setState(FinancialConnectionsSheetViewModel$handleOnNewIntent$1$1$1.INSTANCE);
                                    financialConnectionsSheetViewModel.finishWithResult(financialConnectionsSheetState, new FinancialConnectionsSheetActivityResult.Failed(new Exception("Error processing FinancialConnectionsSheet intent")));
                                }
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        sx22.mo83451b(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        sx22.mo83451b(null);
                        throw th;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsSheetViewModel = (FinancialConnectionsSheetViewModel) this.L$2;
            intent = (Intent) this.L$1;
            ResultKt.throwOnFailure(obj);
            sx2 = (SX2) this.L$0;
        } else {
            ResultKt.throwOnFailure(obj);
            sx2 = this.this$0.mutex;
            Intent intent2 = this.$intent;
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = this.this$0;
            this.L$0 = sx2;
            this.L$1 = intent2;
            this.L$2 = financialConnectionsSheetViewModel2;
            this.label = 1;
            if (sx2.mo83452a(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            intent = intent2;
            financialConnectionsSheetViewModel = financialConnectionsSheetViewModel2;
        }
        if (intent != null) {
            try {
                Uri data = intent.getData();
                if (data != null && (uri = data.toString()) != null) {
                    uriOrNull = financialConnectionsSheetViewModel.toUriOrNull(uri);
                    this.L$0 = sx2;
                    this.L$1 = financialConnectionsSheetViewModel;
                    this.L$2 = uriOrNull;
                    this.label = 2;
                    awaitState = financialConnectionsSheetViewModel.awaitState(this);
                    if (awaitState != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uri2 = uriOrNull;
                    sx22 = sx2;
                    obj = awaitState;
                    FinancialConnectionsSheetState financialConnectionsSheetState2 = (FinancialConnectionsSheetState) obj;
                    if (uri2 == null) {
                    }
                    if (!Intrinsics.areEqual(str, "native-redirect")) {
                    }
                    Unit unit2 = Unit.INSTANCE;
                    sx22.mo83451b(null);
                    return Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                sx22 = sx2;
                th = th3;
                sx22.mo83451b(null);
                throw th;
            }
        }
        uriOrNull = null;
        this.L$0 = sx2;
        this.L$1 = financialConnectionsSheetViewModel;
        this.L$2 = uriOrNull;
        this.label = 2;
        awaitState = financialConnectionsSheetViewModel.awaitState(this);
        if (awaitState != coroutine_suspended) {
        }
    }
}
