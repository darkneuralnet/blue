package com.stripe.android.stripe3ds2.transaction;

import java.security.KeyPair;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0011\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeTransaction;", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "areqParamsFactory", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;", "directoryServerId", "", "directoryServerPublicKey", "Ljava/security/PublicKey;", "directoryServerKeyId", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkKeyPair", "Ljava/security/KeyPair;", "sdkReferenceNumber", "(Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/KeyPair;Ljava/lang/String;)V", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "createAuthenticationRequestParameters", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInitChallengeArgs", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "challengeParameters", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "timeoutMins", "", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeTransaction implements Transaction {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_TIMEOUT = 5;
    private final AuthenticationRequestParametersFactory areqParamsFactory;
    private final String directoryServerId;
    private final String directoryServerKeyId;
    private final PublicKey directoryServerPublicKey;
    private final KeyPair sdkKeyPair;
    private final String sdkReferenceNumber;
    private final SdkTransactionId sdkTransactionId;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeTransaction$Companion;", "", "()V", "MIN_TIMEOUT", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StripeTransaction(AuthenticationRequestParametersFactory areqParamsFactory, String directoryServerId, PublicKey directoryServerPublicKey, String str, SdkTransactionId sdkTransactionId, KeyPair sdkKeyPair, String sdkReferenceNumber) {
        Intrinsics.checkNotNullParameter(areqParamsFactory, "areqParamsFactory");
        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
        Intrinsics.checkNotNullParameter(directoryServerPublicKey, "directoryServerPublicKey");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(sdkKeyPair, "sdkKeyPair");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        this.areqParamsFactory = areqParamsFactory;
        this.directoryServerId = directoryServerId;
        this.directoryServerPublicKey = directoryServerPublicKey;
        this.directoryServerKeyId = str;
        this.sdkTransactionId = sdkTransactionId;
        this.sdkKeyPair = sdkKeyPair;
        this.sdkReferenceNumber = sdkReferenceNumber;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.Transaction
    public Object createAuthenticationRequestParameters(Continuation<? super AuthenticationRequestParameters> continuation) {
        AuthenticationRequestParametersFactory authenticationRequestParametersFactory = this.areqParamsFactory;
        String str = this.directoryServerId;
        PublicKey publicKey = this.directoryServerPublicKey;
        String str2 = this.directoryServerKeyId;
        SdkTransactionId sdkTransactionId = getSdkTransactionId();
        PublicKey publicKey2 = this.sdkKeyPair.getPublic();
        Intrinsics.checkNotNullExpressionValue(publicKey2, "sdkKeyPair.public");
        return authenticationRequestParametersFactory.create(str, publicKey, str2, sdkTransactionId, publicKey2, continuation);
    }

    @Override // com.stripe.android.stripe3ds2.transaction.Transaction
    public InitChallengeArgs createInitChallengeArgs(ChallengeParameters challengeParameters, int i, IntentData intentData) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(challengeParameters, "challengeParameters");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        String str = this.sdkReferenceNumber;
        KeyPair keyPair = this.sdkKeyPair;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, 5);
        return new InitChallengeArgs(str, keyPair, challengeParameters, coerceAtLeast, intentData);
    }

    @Override // com.stripe.android.stripe3ds2.transaction.Transaction
    public SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }
}
