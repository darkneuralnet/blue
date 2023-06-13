package co.bird.android.model.identification;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;", "", "(Ljava/lang/String;I)V", "toWire", "", "PHOTO", "VIDEO", "UNKNOWN", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIdentificationEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationEntry.kt\nco/bird/android/model/identification/IdentificationSelfieEntryMethod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
/* loaded from: classes4.dex */
public enum IdentificationSelfieEntryMethod {
    PHOTO,
    VIDEO,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationSelfieEntryMethod$Companion;", "", "()V", "fromWire", "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;", "value", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentificationSelfieEntryMethod fromWire(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = value.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return IdentificationSelfieEntryMethod.valueOf(upperCase);
            } catch (Exception unused) {
                return IdentificationSelfieEntryMethod.UNKNOWN;
            }
        }

        private Companion() {
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