package com.stripe.android.stripe3ds2.service;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository;
import com.stripe.android.stripe3ds2.init.DefaultSecurityChecker;
import com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl;
import com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactoryImpl;
import com.stripe.android.stripe3ds2.init.HardwareIdSupplier;
import com.stripe.android.stripe3ds2.init.SecurityChecker;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.init.p048ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.security.PublicKeyFactory;
import com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory;
import com.stripe.android.stripe3ds2.transaction.DefaultTransactionFactory;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.stripe3ds2.transaction.TransactionFactory;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import com.stripe.android.stripe3ds2.views.Brand;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u00018B!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB/\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eB/\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0011BO\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u001aB=\b\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0002\u0010\"J\b\u0010%\u001a\u00020&H\u0016JZ\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\n2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\n2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000 2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\n2\u0006\u00104\u001a\u000205H\u0016JR\u0010'\u001a\u00020(2\u0006\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\n2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\n2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000 2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\n2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\nH\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00069"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2ServiceImpl;", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", NamedConstantsKt.ENABLE_LOGGING, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;)V", "sdkReferenceNumber", "", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/coroutines/CoroutineContext;)V", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Ljava/lang/String;ZLkotlin/coroutines/CoroutineContext;)V", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "ephemeralKeyPairGenerator", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "hardwareIdSupplier", "Lcom/stripe/android/stripe3ds2/init/HardwareIdSupplier;", "securityChecker", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/init/HardwareIdSupplier;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lkotlin/coroutines/CoroutineContext;)V", "transactionFactory", "Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;", "publicKeyFactory", "Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;", "warnings", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "(Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;Ljava/util/List;)V", "getWarnings", "()Ljava/util/List;", "cleanup", "", "createTransaction", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "directoryServerID", ChallengeRequestData.FIELD_MESSAGE_VERSION, "isLiveMode", "directoryServerName", "rootCerts", "Ljava/security/cert/X509Certificate;", "dsPublicKey", "Ljava/security/PublicKey;", "keyId", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "getPublicKey", "directoryServerId", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeThreeDs2ServiceImpl implements StripeThreeDs2Service {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String STRIPE_SDK_REFERENCE_NUMBER = "3DS_LOA_SDK_STIN_020100_00142";
    private final ErrorReporter errorReporter;
    private final ImageCache imageCache;
    private final MessageVersionRegistry messageVersionRegistry;
    private final PublicKeyFactory publicKeyFactory;
    private final TransactionFactory transactionFactory;
    private final List<Warning> warnings;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2ServiceImpl$Companion;", "", "()V", "STRIPE_SDK_REFERENCE_NUMBER", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeThreeDs2ServiceImpl(Context context, CoroutineContext workContext) {
        this(context, false, workContext, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public void cleanup() {
        this.imageCache.clear();
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public Transaction createTransaction(SdkTransactionId sdkTransactionId, String directoryServerID, String str, boolean z, String directoryServerName, List<? extends X509Certificate> rootCerts, PublicKey dsPublicKey, String str2, StripeUiCustomization uiCustomization) throws InvalidInputException, SDKRuntimeException {
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(directoryServerID, "directoryServerID");
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
        Intrinsics.checkNotNullParameter(dsPublicKey, "dsPublicKey");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        return createTransaction(directoryServerID, str, z, directoryServerName, rootCerts, dsPublicKey, str2, sdkTransactionId);
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public PublicKey getPublicKey(String directoryServerId) {
        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
        return this.publicKeyFactory.create(directoryServerId);
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public List<Warning> getWarnings() {
        return this.warnings;
    }

    public StripeThreeDs2ServiceImpl(MessageVersionRegistry messageVersionRegistry, ImageCache imageCache, ErrorReporter errorReporter, TransactionFactory transactionFactory, PublicKeyFactory publicKeyFactory, List<Warning> warnings) {
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(transactionFactory, "transactionFactory");
        Intrinsics.checkNotNullParameter(publicKeyFactory, "publicKeyFactory");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        this.messageVersionRegistry = messageVersionRegistry;
        this.imageCache = imageCache;
        this.errorReporter = errorReporter;
        this.transactionFactory = transactionFactory;
        this.publicKeyFactory = publicKeyFactory;
        this.warnings = warnings;
    }

    private final Transaction createTransaction(String str, String str2, boolean z, String str3, List<? extends X509Certificate> list, PublicKey publicKey, String str4, SdkTransactionId sdkTransactionId) {
        String str5 = str2;
        if (!this.messageVersionRegistry.isSupported(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Message version is unsupported: ");
            if (str5 == null) {
                str5 = "";
            }
            sb.append(str5);
            throw new InvalidInputException(sb.toString(), null, 2, null);
        }
        return this.transactionFactory.create(str, list, publicKey, str4, sdkTransactionId, z, Brand.Companion.lookup$3ds2sdk_release(str3, this.errorReporter));
    }

    public /* synthetic */ StripeThreeDs2ServiceImpl(Context context, boolean z, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z, coroutineContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeThreeDs2ServiceImpl(Context context, boolean z, CoroutineContext workContext) {
        this(context, STRIPE_SDK_REFERENCE_NUMBER, z, workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    public /* synthetic */ StripeThreeDs2ServiceImpl(Context context, String str, boolean z, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? false : z, coroutineContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeThreeDs2ServiceImpl(Context context, String sdkReferenceNumber, boolean z, CoroutineContext workContext) {
        this(context, ImageCache.Default.INSTANCE, sdkReferenceNumber, z, workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, boolean z, CoroutineContext coroutineContext) {
        this(context, imageCache, str, new DefaultErrorReporter(r1, null, null, Logger.Companion.get(z), null, null, null, 0, 246, null), coroutineContext);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
    }

    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, ErrorReporter errorReporter, CoroutineContext coroutineContext) {
        this(context, imageCache, str, errorReporter, new StripeEphemeralKeyPairGenerator(errorReporter), new HardwareIdSupplier(context), new DefaultSecurityChecker(null, 1, null), new MessageVersionRegistry(), coroutineContext);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, ErrorReporter errorReporter, EphemeralKeyPairGenerator ephemeralKeyPairGenerator, HardwareIdSupplier hardwareIdSupplier, SecurityChecker securityChecker, MessageVersionRegistry messageVersionRegistry, CoroutineContext coroutineContext) {
        this(messageVersionRegistry, imageCache, errorReporter, new DefaultTransactionFactory(new DefaultAuthenticationRequestParametersFactory(new DeviceDataFactoryImpl(r3, hardwareIdSupplier), new DeviceParamNotAvailableFactoryImpl(hardwareIdSupplier), securityChecker, ephemeralKeyPairGenerator, new DefaultAppInfoRepository(context, coroutineContext), messageVersionRegistry, str, errorReporter, coroutineContext), ephemeralKeyPairGenerator, str), new PublicKeyFactory(context, errorReporter), securityChecker.getWarnings());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
    }
}
