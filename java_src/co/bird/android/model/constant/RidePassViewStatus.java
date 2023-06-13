package co.bird.android.model.constant;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/constant/RidePassViewStatus;", "", "(Ljava/lang/String;I)V", "toString", "", "ACTIVE", "AVAILABLE", "INELIGIBLE", "Companion", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum RidePassViewStatus {
    ACTIVE,
    AVAILABLE,
    INELIGIBLE;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/RidePassViewStatus$Companion;", "", "()V", "from", "Lco/bird/android/model/constant/RidePassViewStatus;", Entry.TYPE_TEXT, "", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePassViewStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassViewStatus.kt\nco/bird/android/model/constant/RidePassViewStatus$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,23:1\n1282#2,2:24\n*S KotlinDebug\n*F\n+ 1 RidePassViewStatus.kt\nco/bird/android/model/constant/RidePassViewStatus$Companion\n*L\n20#1:24,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RidePassViewStatus from(String str) {
            RidePassViewStatus[] values;
            for (RidePassViewStatus ridePassViewStatus : RidePassViewStatus.values()) {
                if (Intrinsics.areEqual(ridePassViewStatus.toString(), str)) {
                    return ridePassViewStatus;
                }
            }
            return null;
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
