package co.bird.android.model.constant;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/model/constant/MapMode;", "", "(Ljava/lang/String;I)V", "toDefaultUserRole", "Lco/bird/android/model/constant/UserRole;", "toScanMode", "Lco/bird/android/model/constant/ScanMode;", "toString", "", "RIDER", "CHARGER", "OPERATOR", "MERCHANT", "SERVICE_CENTER", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum MapMode {
    RIDER,
    CHARGER,
    OPERATOR,
    MERCHANT,
    SERVICE_CENTER;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.RIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapMode.CHARGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapMode.OPERATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MapMode.SERVICE_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MapMode.MERCHANT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final UserRole toDefaultUserRole() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return UserRole.MERCHANT;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return UserRole.OPERATOR;
                }
                return UserRole.OPERATOR;
            }
            return UserRole.RIDER;
        }
        return UserRole.RIDER;
    }

    public final ScanMode toScanMode() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return ScanMode.RIDER;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return ScanMode.SERVICE_CENTER;
                }
                return ScanMode.WATCHER;
            }
            return ScanMode.RIDER;
        }
        return ScanMode.RIDER;
    }

    @Override // java.lang.Enum
    public String toString() {
        String name = name();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = name.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
