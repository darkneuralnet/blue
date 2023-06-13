package com.stripe.android.stripe3ds2.transaction;

import ch.qos.logback.core.net.SyslogConstants;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.init.AppInfoRepository;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.JweEncrypter;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$create$2", m28418f = "DefaultAuthenticationRequestParametersFactory.kt", m28417i = {}, m28416l = {SyslogConstants.LOG_LOCAL1}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultAuthenticationRequestParametersFactory$create$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super AuthenticationRequestParameters>, Object> {
    final /* synthetic */ String $directoryServerId;
    final /* synthetic */ PublicKey $directoryServerPublicKey;
    final /* synthetic */ String $keyId;
    final /* synthetic */ PublicKey $sdkPublicKey;
    final /* synthetic */ SdkTransactionId $sdkTransactionId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultAuthenticationRequestParametersFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAuthenticationRequestParametersFactory$create$2(SdkTransactionId sdkTransactionId, DefaultAuthenticationRequestParametersFactory defaultAuthenticationRequestParametersFactory, PublicKey publicKey, String str, String str2, PublicKey publicKey2, Continuation<? super DefaultAuthenticationRequestParametersFactory$create$2> continuation) {
        super(2, continuation);
        this.$sdkTransactionId = sdkTransactionId;
        this.this$0 = defaultAuthenticationRequestParametersFactory;
        this.$sdkPublicKey = publicKey;
        this.$keyId = str;
        this.$directoryServerId = str2;
        this.$directoryServerPublicKey = publicKey2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultAuthenticationRequestParametersFactory$create$2 defaultAuthenticationRequestParametersFactory$create$2 = new DefaultAuthenticationRequestParametersFactory$create$2(this.$sdkTransactionId, this.this$0, this.$sdkPublicKey, this.$keyId, this.$directoryServerId, this.$directoryServerPublicKey, continuation);
        defaultAuthenticationRequestParametersFactory$create$2.L$0 = obj;
        return defaultAuthenticationRequestParametersFactory$create$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super AuthenticationRequestParameters> continuation) {
        return ((DefaultAuthenticationRequestParametersFactory$create$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        String str;
        AppInfoRepository appInfoRepository;
        SdkTransactionId sdkTransactionId;
        ErrorReporter errorReporter;
        String trimIndent;
        JweEncrypter jweEncrypter;
        String str2;
        MessageVersionRegistry messageVersionRegistry;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                sdkTransactionId = (SdkTransactionId) this.L$1;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            DefaultAuthenticationRequestParametersFactory defaultAuthenticationRequestParametersFactory = this.this$0;
            PublicKey publicKey = this.$directoryServerPublicKey;
            String str3 = this.$directoryServerId;
            String str4 = this.$keyId;
            try {
                Result.Companion companion = Result.Companion;
                jweEncrypter = defaultAuthenticationRequestParametersFactory.jweEncrypter;
                m116783constructorimpl = Result.m116783constructorimpl(jweEncrypter.encrypt(defaultAuthenticationRequestParametersFactory.getDeviceDataJson$3ds2sdk_release(), publicKey, str3, str4));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            DefaultAuthenticationRequestParametersFactory defaultAuthenticationRequestParametersFactory2 = this.this$0;
            String str5 = this.$directoryServerId;
            String str6 = this.$keyId;
            SdkTransactionId sdkTransactionId2 = this.$sdkTransactionId;
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl != null) {
                errorReporter = defaultAuthenticationRequestParametersFactory2.errorReporter;
                trimIndent = StringsKt__IndentKt.trimIndent("\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId=" + str5 + "\n                    keyId=" + str6 + "\n                    sdkTransactionId=" + sdkTransactionId2 + "\n                    ");
                errorReporter.reportError(new RuntimeException(trimIndent, m116786exceptionOrNullimpl));
            }
            Throwable m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl2 == null) {
                str = (String) m116783constructorimpl;
                SdkTransactionId sdkTransactionId3 = this.$sdkTransactionId;
                appInfoRepository = this.this$0.appInfoRepository;
                this.L$0 = str;
                this.L$1 = sdkTransactionId3;
                this.label = 1;
                Object obj2 = appInfoRepository.get(this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sdkTransactionId = sdkTransactionId3;
                obj = obj2;
            } else {
                throw new SDKRuntimeException(m116786exceptionOrNullimpl2);
            }
        }
        String sdkAppId = ((AppInfo) obj).getSdkAppId();
        str2 = this.this$0.sdkReferenceNumber;
        String m41022n = DefaultAuthenticationRequestParametersFactory.Companion.createPublicJwk$3ds2sdk_release(this.$sdkPublicKey, this.$keyId, this.this$0.getKeyUse$3ds2sdk_release(this.$directoryServerId)).m41022n();
        Intrinsics.checkNotNullExpressionValue(m41022n, "createPublicJwk(\n       …         ).toJSONString()");
        messageVersionRegistry = this.this$0.messageVersionRegistry;
        return new AuthenticationRequestParameters(str, sdkTransactionId, sdkAppId, str2, m41022n, messageVersionRegistry.getCurrent());
    }
}
