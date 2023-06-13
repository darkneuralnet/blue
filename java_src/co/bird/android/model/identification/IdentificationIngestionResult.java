package co.bird.android.model.identification;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIngestionResult;", "", "(Ljava/lang/String;I)V", "explanationResId", "", "()Ljava/lang/Integer;", "toWire", "", "SUCCESS", "BLURRY", "NOT_READABLE", "PARTIALLY_READABLE", "DOCUMENT_TYPE_NOT_SUPPORTED", "REJECTED", "DAMAGED", "INVALID", "FACE_DID_NOT_MATCH", "FRAUD_SUSPECTED", "NETWORK_ERROR", "RESULT_TIMEOUT", "UNKNOWN_ERROR", "UNKNOWN", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIdentificationEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationEntry.kt\nco/bird/android/model/identification/IdentificationIngestionResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
/* loaded from: classes4.dex */
public enum IdentificationIngestionResult {
    SUCCESS,
    BLURRY,
    NOT_READABLE,
    PARTIALLY_READABLE,
    DOCUMENT_TYPE_NOT_SUPPORTED,
    REJECTED,
    DAMAGED,
    INVALID,
    FACE_DID_NOT_MATCH,
    FRAUD_SUSPECTED,
    NETWORK_ERROR,
    RESULT_TIMEOUT,
    UNKNOWN_ERROR,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIngestionResult$Companion;", "", "()V", "fromWire", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "value", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentificationIngestionResult fromWire(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = value.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return IdentificationIngestionResult.valueOf(upperCase);
            } catch (Exception unused) {
                return IdentificationIngestionResult.UNKNOWN;
            }
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentificationIngestionResult.values().length];
            try {
                iArr[IdentificationIngestionResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationIngestionResult.BLURRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentificationIngestionResult.NOT_READABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentificationIngestionResult.PARTIALLY_READABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdentificationIngestionResult.DOCUMENT_TYPE_NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdentificationIngestionResult.REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdentificationIngestionResult.DAMAGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdentificationIngestionResult.INVALID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdentificationIngestionResult.FACE_DID_NOT_MATCH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdentificationIngestionResult.FRAUD_SUSPECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IdentificationIngestionResult.NETWORK_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IdentificationIngestionResult.RESULT_TIMEOUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[IdentificationIngestionResult.UNKNOWN_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[IdentificationIngestionResult.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Integer explanationResId() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return null;
            case 2:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_blurry);
            case 3:
            case 4:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_not_readable);
            case 5:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_not_supported);
            case 6:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_rejected);
            case 7:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_damaged);
            case 8:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_invalid);
            case 9:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_face_did_not_match);
            case 10:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_fraud_suspected);
            case 11:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_network_error);
            case 12:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_result_timeout);
            case 13:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_unknown_error);
            case 14:
                return Integer.valueOf(C45871nl4.identification_ingestion_result_unknown_error);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String toWire() {
        String name = name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (this != UNKNOWN) {
            return lowerCase;
        }
        return null;
    }
}
