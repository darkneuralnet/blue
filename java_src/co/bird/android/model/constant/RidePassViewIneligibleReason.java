package co.bird.android.model.constant;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/constant/RidePassViewIneligibleReason;", "", "(Ljava/lang/String;I)V", "toString", "", "INELIGIBLE_DEVICE", "UNKNOWN", "Companion", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum RidePassViewIneligibleReason {
    INELIGIBLE_DEVICE,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/RidePassViewIneligibleReason$Companion;", "", "()V", "from", "Lco/bird/android/model/constant/RidePassViewIneligibleReason;", Entry.TYPE_TEXT, "", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePassViewIneligibleReason.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassViewIneligibleReason.kt\nco/bird/android/model/constant/RidePassViewIneligibleReason$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n1282#2,2:21\n*S KotlinDebug\n*F\n+ 1 RidePassViewIneligibleReason.kt\nco/bird/android/model/constant/RidePassViewIneligibleReason$Companion\n*L\n17#1:21,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RidePassViewIneligibleReason from(String str) {
            RidePassViewIneligibleReason ridePassViewIneligibleReason;
            RidePassViewIneligibleReason[] values = RidePassViewIneligibleReason.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    ridePassViewIneligibleReason = values[i];
                    if (Intrinsics.areEqual(ridePassViewIneligibleReason.toString(), str)) {
                        break;
                    }
                    i++;
                } else {
                    ridePassViewIneligibleReason = null;
                    break;
                }
            }
            if (ridePassViewIneligibleReason == null) {
                return RidePassViewIneligibleReason.UNKNOWN;
            }
            return ridePassViewIneligibleReason;
        }

        private Companion() {
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}