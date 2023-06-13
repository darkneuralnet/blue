package com.stripe.android.stripe3ds2.security;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C38696bh2;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0080\b\u0018\u0000 32\u00020\u0001:\u00013B!\b\u0001\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b0\u00101B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b0\u00102J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÂ\u0003J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\"\u0010 J'\u0010'\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u0004HÆ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020)HÖ\u0001J\u0013\u0010-\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010.R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010/R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010/¨\u00064"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "", "component1", "", "component2", "component3", "Lorg/json/JSONObject;", "challengeRequest", "Ljavax/crypto/SecretKey;", "secretKey", "", "encrypt", "message", "decrypt", "cres", "", "validateAcsToSdkCounter$3ds2sdk_release", "(Lorg/json/JSONObject;)V", "validateAcsToSdkCounter", "decryptMessage$3ds2sdk_release", "(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;", "decryptMessage", "keyId", "Lbh2;", "createEncryptionHeader$3ds2sdk_release", "(Ljava/lang/String;)Lbh2;", "createEncryptionHeader", "LUc1;", "encryptionMethod", "", "getDecryptionKey$3ds2sdk_release", "(Ljavax/crypto/SecretKey;LUc1;)[B", "getDecryptionKey", "getEncryptionKey$3ds2sdk_release", "getEncryptionKey", "isLiveMode", "counterSdkToAcs", "counterAcsToSdk", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "B", "<init>", "(ZBB)V", "(Z)V", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class DefaultMessageTransformer implements MessageTransformer {
    public static final int BITS_IN_BYTE = 8;
    public static final Companion Companion = new Companion(null);
    private static final C36312Uc1 ENCRYPTION_METHOD = C36312Uc1.f37664f;
    public static final String FIELD_ACS_COUNTER_ACS_TO_SDK = "acsCounterAtoS";
    public static final String FIELD_SDK_COUNTER_SDK_TO_ACS = "sdkCounterStoA";
    private byte counterAcsToSdk;
    private byte counterSdkToAcs;
    private final boolean isLiveMode;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;", "", "", "BITS_IN_BYTE", "I", "LUc1;", "kotlin.jvm.PlatformType", "ENCRYPTION_METHOD", "LUc1;", "", "FIELD_ACS_COUNTER_ACS_TO_SDK", "Ljava/lang/String;", "FIELD_SDK_COUNTER_SDK_TO_ACS", "<init>", "()V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultMessageTransformer(boolean z, byte b, byte b2) {
        this.isLiveMode = z;
        this.counterSdkToAcs = b;
        this.counterAcsToSdk = b2;
    }

    private final boolean component1() {
        return this.isLiveMode;
    }

    private final byte component2() {
        return this.counterSdkToAcs;
    }

    private final byte component3() {
        return this.counterAcsToSdk;
    }

    public static /* synthetic */ DefaultMessageTransformer copy$default(DefaultMessageTransformer defaultMessageTransformer, boolean z, byte b, byte b2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = defaultMessageTransformer.isLiveMode;
        }
        if ((i & 2) != 0) {
            b = defaultMessageTransformer.counterSdkToAcs;
        }
        if ((i & 4) != 0) {
            b2 = defaultMessageTransformer.counterAcsToSdk;
        }
        return defaultMessageTransformer.copy(z, b, b2);
    }

    public final DefaultMessageTransformer copy(boolean z, byte b, byte b2) {
        return new DefaultMessageTransformer(z, b, b2);
    }

    public final C38696bh2 createEncryptionHeader$3ds2sdk_release(String keyId) {
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        C38696bh2 m64158d = new C38696bh2.C12474a(C37051Xg2.f43559m, ENCRYPTION_METHOD).m64149m(keyId).m64158d();
        Intrinsics.checkNotNullExpressionValue(m64158d, "Builder(JWEAlgorithm.DIR…yId)\n            .build()");
        return m64158d;
    }

    @Override // com.stripe.android.stripe3ds2.security.MessageTransformer
    public JSONObject decrypt(String message, SecretKey secretKey) throws ParseException, JOSEException, JSONException, ChallengeResponseParseException {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        JSONObject decryptMessage$3ds2sdk_release = decryptMessage$3ds2sdk_release(message, secretKey);
        validateAcsToSdkCounter$3ds2sdk_release(decryptMessage$3ds2sdk_release);
        boolean z = true;
        byte b = (byte) (this.counterAcsToSdk + 1);
        this.counterAcsToSdk = b;
        if (b == 0) {
            z = false;
        }
        if (z) {
            return decryptMessage$3ds2sdk_release;
        }
        throw new IllegalArgumentException("ACS to SDK counter is zero".toString());
    }

    public final JSONObject decryptMessage$3ds2sdk_release(String message, SecretKey secretKey) throws ParseException, JOSEException, JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        C39900dh2 m43885q = C39900dh2.m43885q(message);
        C36312Uc1 m64167t = m43885q.m43887o().m64167t();
        Intrinsics.checkNotNullExpressionValue(m64167t, "jweObject.header.encryptionMethod");
        m43885q.m43896f(new C40127e41(getDecryptionKey$3ds2sdk_release(secretKey, m64167t)));
        return new JSONObject(m43885q.m106754b().toString());
    }

    @Override // com.stripe.android.stripe3ds2.security.MessageTransformer
    public String encrypt(JSONObject challengeRequest, SecretKey secretKey) throws JOSEException, JSONException {
        Intrinsics.checkNotNullParameter(challengeRequest, "challengeRequest");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        String string = challengeRequest.getString(ChallengeRequestData.FIELD_ACS_TRANS_ID);
        Intrinsics.checkNotNullExpressionValue(string, "challengeRequest.getStri…tData.FIELD_ACS_TRANS_ID)");
        C38696bh2 createEncryptionHeader$3ds2sdk_release = createEncryptionHeader$3ds2sdk_release(string);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        boolean z = true;
        String format = String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(this.counterSdkToAcs)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        challengeRequest.put(FIELD_SDK_COUNTER_SDK_TO_ACS, format);
        C39900dh2 c39900dh2 = new C39900dh2(createEncryptionHeader$3ds2sdk_release, new C50367vL3(challengeRequest.toString()));
        C36312Uc1 m64167t = createEncryptionHeader$3ds2sdk_release.m64167t();
        Intrinsics.checkNotNullExpressionValue(m64167t, "header.encryptionMethod");
        c39900dh2.m43895g(new TransactionEncrypter(getEncryptionKey$3ds2sdk_release(secretKey, m64167t), this.counterSdkToAcs));
        byte b = (byte) (this.counterSdkToAcs + 1);
        this.counterSdkToAcs = b;
        if (b == 0) {
            z = false;
        }
        if (z) {
            String m43884r = c39900dh2.m43884r();
            Intrinsics.checkNotNullExpressionValue(m43884r, "jweObject.serialize()");
            return m43884r;
        }
        throw new IllegalArgumentException("SDK to ACS counter is zero".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultMessageTransformer) {
            DefaultMessageTransformer defaultMessageTransformer = (DefaultMessageTransformer) obj;
            return this.isLiveMode == defaultMessageTransformer.isLiveMode && this.counterSdkToAcs == defaultMessageTransformer.counterSdkToAcs && this.counterAcsToSdk == defaultMessageTransformer.counterAcsToSdk;
        }
        return false;
    }

    public final byte[] getDecryptionKey$3ds2sdk_release(SecretKey secretKey, C36312Uc1 encryptionMethod) {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        C36312Uc1 c36312Uc1 = C36312Uc1.f37669k;
        if (c36312Uc1 == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, encoded.length - (c36312Uc1.m81265b() / 8), encoded.length);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n            Arrays.cop…e\n            )\n        }");
            return copyOfRange;
        }
        Intrinsics.checkNotNullExpressionValue(encoded, "{\n            encodedKey\n        }");
        return encoded;
    }

    public final byte[] getEncryptionKey$3ds2sdk_release(SecretKey secretKey, C36312Uc1 encryptionMethod) {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        C36312Uc1 c36312Uc1 = C36312Uc1.f37669k;
        if (c36312Uc1 == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, c36312Uc1.m81265b() / 8);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n            Arrays.cop…E\n            )\n        }");
            return copyOfRange;
        }
        Intrinsics.checkNotNullExpressionValue(encoded, "{\n            encodedKey\n        }");
        return encoded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isLiveMode;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Byte.hashCode(this.counterSdkToAcs)) * 31) + Byte.hashCode(this.counterAcsToSdk);
    }

    public String toString() {
        return "DefaultMessageTransformer(isLiveMode=" + this.isLiveMode + ", counterSdkToAcs=" + ((int) this.counterSdkToAcs) + ", counterAcsToSdk=" + ((int) this.counterAcsToSdk) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void validateAcsToSdkCounter$3ds2sdk_release(JSONObject cres) throws ChallengeResponseParseException, JSONException {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(cres, "cres");
        if (!this.isLiveMode) {
            return;
        }
        if (cres.has(FIELD_ACS_COUNTER_ACS_TO_SDK)) {
            try {
                Result.Companion companion = Result.Companion;
                String string = cres.getString(FIELD_ACS_COUNTER_ACS_TO_SDK);
                Intrinsics.checkNotNullExpressionValue(string, "cres.getString(FIELD_ACS_COUNTER_ACS_TO_SDK)");
                m116783constructorimpl = Result.m116783constructorimpl(Byte.valueOf(Byte.parseByte(string)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) == null) {
                byte byteValue = ((Number) m116783constructorimpl).byteValue();
                if (this.counterAcsToSdk == byteValue) {
                    return;
                }
                ProtocolError protocolError = ProtocolError.DataDecryptionFailure;
                throw new ChallengeResponseParseException(protocolError, "Counters are not equal. SDK counter: " + ((int) this.counterAcsToSdk) + ", ACS counter: " + ((int) byteValue));
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(FIELD_ACS_COUNTER_ACS_TO_SDK);
        }
        throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(FIELD_ACS_COUNTER_ACS_TO_SDK);
    }

    public DefaultMessageTransformer(boolean z) {
        this(z, (byte) 0, (byte) 0);
    }
}
