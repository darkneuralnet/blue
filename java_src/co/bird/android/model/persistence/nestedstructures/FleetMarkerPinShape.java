package co.bird.android.model.persistence.nestedstructures;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;", "", "(Ljava/lang/String;I)V", "CIRCLE", "CIRCLE_NO_ANCHOR", "SQUARE", "TEARDROP", "Companion", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum FleetMarkerPinShape {
    CIRCLE,
    CIRCLE_NO_ANCHOR,
    SQUARE,
    TEARDROP;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape$Companion;", "", "()V", "fromString", "Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;", "value", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FleetMarkerPinShape fromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String upperCase = value.toUpperCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return FleetMarkerPinShape.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return FleetMarkerPinShape.CIRCLE;
            }
        }

        private Companion() {
        }
    }
}
