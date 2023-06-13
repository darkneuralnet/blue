package co.bird.android.model.identification;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationRejectionReason;", "", "(Ljava/lang/String;I)V", "explanationResId", "", "hasIngestionResultExplanation", "", "UNSUPPORTED_DOCUMENT", "COULD_NOT_INITIATE", "INVALID_METADATA", "NOT_COMPLETED", "INGESTION_FAILURE", "MINIMUM_AGE", "VEHICLE_CLASS", "BAD_SCORE", "DUPLICATE_ID", "EXPIRED", "RATE_LIMIT", "UNKNOWN", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum IdentificationRejectionReason {
    UNSUPPORTED_DOCUMENT,
    COULD_NOT_INITIATE,
    INVALID_METADATA,
    NOT_COMPLETED,
    INGESTION_FAILURE,
    MINIMUM_AGE,
    VEHICLE_CLASS,
    BAD_SCORE,
    DUPLICATE_ID,
    EXPIRED,
    RATE_LIMIT,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationRejectionReason$Companion;", "", "()V", "fromWire", "Lco/bird/android/model/identification/IdentificationRejectionReason;", "value", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentificationRejectionReason fromWire(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = value.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return IdentificationRejectionReason.valueOf(upperCase);
            } catch (Exception unused) {
                return IdentificationRejectionReason.UNKNOWN;
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
            int[] iArr = new int[IdentificationRejectionReason.values().length];
            try {
                iArr[IdentificationRejectionReason.UNSUPPORTED_DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationRejectionReason.COULD_NOT_INITIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentificationRejectionReason.NOT_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentificationRejectionReason.INVALID_METADATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdentificationRejectionReason.MINIMUM_AGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdentificationRejectionReason.VEHICLE_CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdentificationRejectionReason.BAD_SCORE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdentificationRejectionReason.DUPLICATE_ID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdentificationRejectionReason.EXPIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdentificationRejectionReason.RATE_LIMIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IdentificationRejectionReason.INGESTION_FAILURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IdentificationRejectionReason.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final int explanationResId(boolean z) {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return C45871nl4.identification_reject_explanation_unsupported_document;
            case 2:
            case 3:
                return C45871nl4.identification_reject_explanation_server_error;
            case 4:
                return C45871nl4.identification_reject_explanation_invalid_data;
            case 5:
                return C45871nl4.identification_reject_explanation_min_age_not_met;
            case 6:
                return C45871nl4.identification_reject_explanation_vehicle_class_not_met;
            case 7:
                return C45871nl4.identification_reject_explanation_authenticity;
            case 8:
                return C45871nl4.identification_reject_explanation_duplicate;
            case 9:
                return C45871nl4.identification_reject_explanation_expired;
            case 10:
                return C45871nl4.identification_reject_explanation_rate_limit;
            case 11:
                if (z) {
                    return C45871nl4.identification_reject_explanation_ingestion_failure_known;
                }
                return C45871nl4.identification_reject_explanation_ingestion_failure_unkown;
            case 12:
                return C45871nl4.identification_reject_explanation_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
