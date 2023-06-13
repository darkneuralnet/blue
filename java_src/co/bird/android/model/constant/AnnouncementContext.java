package co.bird.android.model.constant;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/constant/AnnouncementContext;", "", "(Ljava/lang/String;I)V", "toString", "", "BOUNTY_MAP", "BULK_SCANNER_STATUS", "DROP_MAP", "OPERATOR_MAP", "POST_RIDE", "POST_RIDE_START", "RATING_SCREEN", "RIDE_STARTED", "RIDER_MAP", "RIDER_SCANNER", "SIDE_MENU", "UNKNOWN", "Companion", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum AnnouncementContext {
    BOUNTY_MAP,
    BULK_SCANNER_STATUS,
    DROP_MAP,
    OPERATOR_MAP,
    POST_RIDE,
    POST_RIDE_START,
    RATING_SCREEN,
    RIDE_STARTED,
    RIDER_MAP,
    RIDER_SCANNER,
    SIDE_MENU,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/AnnouncementContext$Companion;", "", "()V", "fromString", "Lco/bird/android/model/constant/AnnouncementContext;", "value", "", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnnouncementContext fromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                String upperCase = value.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
                return AnnouncementContext.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return AnnouncementContext.UNKNOWN;
            }
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
