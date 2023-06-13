package co.bird.android.model.ridertutorial;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/ridertutorial/TutorialKind;", "", "(Ljava/lang/String;I)V", "toString", "", "CONTEXTUAL_M365", "CONTEXTUAL_ES", "CONTEXTUAL_BC", "CONTEXTUAL_B2", "CONTEXTUAL_B3", "CLASS_MOPED", "CLASS_MOPED_PARKING", "CLASS_SCOOTER", "CLASS_SCOOTER_PARKING", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum TutorialKind {
    CONTEXTUAL_M365,
    CONTEXTUAL_ES,
    CONTEXTUAL_BC,
    CONTEXTUAL_B2,
    CONTEXTUAL_B3,
    CLASS_MOPED,
    CLASS_MOPED_PARKING,
    CLASS_SCOOTER,
    CLASS_SCOOTER_PARKING;
    
    public static final Companion Companion = new Companion(null);
    private static final TutorialKind[] all = values();

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/ridertutorial/TutorialKind$Companion;", "", "()V", "all", "", "Lco/bird/android/model/ridertutorial/TutorialKind;", "getAll", "()[Lco/bird/android/model/ridertutorial/TutorialKind;", "[Lco/bird/android/model/ridertutorial/TutorialKind;", "from", "string", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TutorialKind from(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            String upperCase = string.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
            return TutorialKind.valueOf(upperCase);
        }

        public final TutorialKind[] getAll() {
            return TutorialKind.all;
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
