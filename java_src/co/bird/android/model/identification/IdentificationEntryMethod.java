package co.bird.android.model.identification;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u0006\u0010\u0006\u001a\u00020\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationEntryMethod;", "", "(Ljava/lang/String;I)V", "requiredSides", "", "Lco/bird/android/model/identification/IdentificationEntryMethod$Side;", "toWire", "", "LEGACY", "BARCODE_ONLY", "SCAN_FRONT", "SCAN_BACK", "SCAN_FRONT_AND_BACK", "MANUAL_ENTRY", "UNKNOWN", "Companion", "Side", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum IdentificationEntryMethod {
    LEGACY,
    BARCODE_ONLY,
    SCAN_FRONT,
    SCAN_BACK,
    SCAN_FRONT_AND_BACK,
    MANUAL_ENTRY,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationEntryMethod$Companion;", "", "()V", "fromWire", "Lco/bird/android/model/identification/IdentificationEntryMethod;", "value", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentificationEntryMethod fromWire(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = value.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return IdentificationEntryMethod.valueOf(upperCase);
            } catch (Exception unused) {
                return IdentificationEntryMethod.UNKNOWN;
            }
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationEntryMethod$Side;", "", "(Ljava/lang/String;I)V", "FRONT", "BACK", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum Side {
        FRONT,
        BACK
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentificationEntryMethod.values().length];
            try {
                iArr[IdentificationEntryMethod.SCAN_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationEntryMethod.SCAN_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentificationEntryMethod.SCAN_FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentificationEntryMethod.LEGACY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdentificationEntryMethod.BARCODE_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdentificationEntryMethod.MANUAL_ENTRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdentificationEntryMethod.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final List<Side> requiredSides() {
        List<Side> listOf;
        List<Side> listOf2;
        List<Side> listOf3;
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Side.FRONT);
                return listOf;
            case 2:
                listOf2 = CollectionsKt__CollectionsJVMKt.listOf(Side.BACK);
                return listOf2;
            case 3:
                listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new Side[]{Side.FRONT, Side.BACK});
                return listOf3;
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
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
        return lowerCase;
    }
}
