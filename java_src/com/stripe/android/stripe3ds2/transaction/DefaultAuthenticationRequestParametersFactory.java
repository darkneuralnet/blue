package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.init.AppInfoRepository;
import com.stripe.android.stripe3ds2.init.DeviceDataFactory;
import com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory;
import com.stripe.android.stripe3ds2.init.SecurityChecker;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.DefaultJweEncrypter;
import com.stripe.android.stripe3ds2.security.DirectoryServer;
import com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.security.JweEncrypter;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.Q81;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 32\u00020\u0001:\u00013BQ\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b.\u0010/BQ\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b.\u00102J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;", "", "directoryServerId", "Ljava/security/PublicKey;", "directoryServerPublicKey", "keyId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "sdkPublicKey", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "create", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/PublicKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LRk2;", "getKeyUse$3ds2sdk_release", "(Ljava/lang/String;)LRk2;", "getKeyUse", "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;", "deviceDataFactory", "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;", "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;", "deviceParamNotAvailableFactory", "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "securityChecker", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;", "appInfoRepository", "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;", "Lcom/stripe/android/stripe3ds2/security/JweEncrypter;", "jweEncrypter", "Lcom/stripe/android/stripe3ds2/security/JweEncrypter;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "sdkReferenceNumber", "Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "getDeviceDataJson$3ds2sdk_release", "()Ljava/lang/String;", "deviceDataJson", "<init>", "(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/security/JweEncrypter;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "ephemeralKeyPairGenerator", "(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class DefaultAuthenticationRequestParametersFactory implements AuthenticationRequestParametersFactory {
    public static final Companion Companion = new Companion(null);
    private static final String DATA_VERSION = "1.1";
    public static final String KEY_DATA_VERSION = "DV";
    public static final String KEY_DEVICE_DATA = "DD";
    public static final String KEY_DEVICE_PARAM_NOT_AVAILABLE = "DPNA";
    public static final String KEY_SECURITY_WARNINGS = "SW";
    private final AppInfoRepository appInfoRepository;
    private final DeviceDataFactory deviceDataFactory;
    private final DeviceParamNotAvailableFactory deviceParamNotAvailableFactory;
    private final ErrorReporter errorReporter;
    private final JweEncrypter jweEncrypter;
    private final MessageVersionRegistry messageVersionRegistry;
    private final String sdkReferenceNumber;
    private final SecurityChecker securityChecker;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$Companion;", "", "Ljava/security/PublicKey;", "publicKey", "", "keyId", "LRk2;", "keyUse", "Lfh2;", "createPublicJwk$3ds2sdk_release", "(Ljava/security/PublicKey;Ljava/lang/String;LRk2;)Lfh2;", "createPublicJwk", "DATA_VERSION", "Ljava/lang/String;", "KEY_DATA_VERSION", "KEY_DEVICE_DATA", "KEY_DEVICE_PARAM_NOT_AVAILABLE", "KEY_SECURITY_WARNINGS", "<init>", "()V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AbstractC41085fh2 createPublicJwk$3ds2sdk_release(PublicKey publicKey, String str, C35683Rk2 c35683Rk2) {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(publicKey, "publicKey");
            Q81.C6685a m88882c = new Q81.C6685a(C41417gF0.f81831e, (ECPublicKey) publicKey).m88882c(c35683Rk2);
            if (str != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        str = null;
                    }
                    Q81 m88885z = m88882c.m88883b(str).m88884a().m88885z();
                    Intrinsics.checkNotNullExpressionValue(m88885z, "Builder(Curve.P_256, pub…           .toPublicJWK()");
                    return m88885z;
                }
            }
            z = true;
            if (z) {
            }
            Q81 m88885z2 = m88882c.m88883b(str).m88884a().m88885z();
            Intrinsics.checkNotNullExpressionValue(m88885z2, "Builder(Curve.P_256, pub…           .toPublicJWK()");
            return m88885z2;
        }

        private Companion() {
        }
    }

    public DefaultAuthenticationRequestParametersFactory(DeviceDataFactory deviceDataFactory, DeviceParamNotAvailableFactory deviceParamNotAvailableFactory, SecurityChecker securityChecker, AppInfoRepository appInfoRepository, JweEncrypter jweEncrypter, MessageVersionRegistry messageVersionRegistry, String sdkReferenceNumber, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(deviceDataFactory, "deviceDataFactory");
        Intrinsics.checkNotNullParameter(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        Intrinsics.checkNotNullParameter(securityChecker, "securityChecker");
        Intrinsics.checkNotNullParameter(appInfoRepository, "appInfoRepository");
        Intrinsics.checkNotNullParameter(jweEncrypter, "jweEncrypter");
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.deviceDataFactory = deviceDataFactory;
        this.deviceParamNotAvailableFactory = deviceParamNotAvailableFactory;
        this.securityChecker = securityChecker;
        this.appInfoRepository = appInfoRepository;
        this.jweEncrypter = jweEncrypter;
        this.messageVersionRegistry = messageVersionRegistry;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParametersFactory
    public Object create(String str, PublicKey publicKey, String str2, SdkTransactionId sdkTransactionId, PublicKey publicKey2, Continuation<? super AuthenticationRequestParameters> continuation) {
        return X30.m77504g(this.workContext, new DefaultAuthenticationRequestParametersFactory$create$2(sdkTransactionId, this, publicKey2, str2, str, publicKey, null), continuation);
    }

    public final String getDeviceDataJson$3ds2sdk_release() throws JSONException {
        int collectionSizeOrDefault;
        JSONObject put = new JSONObject().put(KEY_DATA_VERSION, DATA_VERSION).put(KEY_DEVICE_DATA, new JSONObject(this.deviceDataFactory.create())).put(KEY_DEVICE_PARAM_NOT_AVAILABLE, new JSONObject(this.deviceParamNotAvailableFactory.create()));
        List<Warning> warnings = this.securityChecker.getWarnings();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(warnings, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Warning warning : warnings) {
            arrayList.add(warning.getId());
        }
        String jSONObject = put.put(KEY_SECURITY_WARNINGS, new JSONArray((Collection) arrayList)).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           …              .toString()");
        return jSONObject;
    }

    public final C35683Rk2 getKeyUse$3ds2sdk_release(String directoryServerId) {
        DirectoryServer directoryServer;
        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
        DirectoryServer[] values = DirectoryServer.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                directoryServer = values[i];
                if (directoryServer.getIds().contains(directoryServerId)) {
                    break;
                }
                i++;
            } else {
                directoryServer = null;
                break;
            }
        }
        if (directoryServer != null) {
            return directoryServer.getKeyUse();
        }
        return C35683Rk2.f32497c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAuthenticationRequestParametersFactory(DeviceDataFactory deviceDataFactory, DeviceParamNotAvailableFactory deviceParamNotAvailableFactory, SecurityChecker securityChecker, EphemeralKeyPairGenerator ephemeralKeyPairGenerator, AppInfoRepository appInfoRepository, MessageVersionRegistry messageVersionRegistry, String sdkReferenceNumber, ErrorReporter errorReporter, CoroutineContext workContext) {
        this(deviceDataFactory, deviceParamNotAvailableFactory, securityChecker, appInfoRepository, new DefaultJweEncrypter(ephemeralKeyPairGenerator, errorReporter), messageVersionRegistry, sdkReferenceNumber, errorReporter, workContext);
        Intrinsics.checkNotNullParameter(deviceDataFactory, "deviceDataFactory");
        Intrinsics.checkNotNullParameter(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        Intrinsics.checkNotNullParameter(securityChecker, "securityChecker");
        Intrinsics.checkNotNullParameter(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        Intrinsics.checkNotNullParameter(appInfoRepository, "appInfoRepository");
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }
}
