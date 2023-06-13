package p000;

import kotlin.text.Typography;
/* renamed from: Au9 */
/* loaded from: classes6.dex */
public enum Au9 implements Qm9 {
    MOBILE_SIGNALS_UNKNOWN(0),
    BATTERY_LEVEL(1),
    FOREGROUND_VOLUME_PERCENTAGE(2),
    AVAILABLE_RAM_PERCENTAGE(3),
    APP_VERSION(4),
    APP_PERMISSIONS(5),
    SCREEN_BRIGHTNESS(6),
    ACTIVITY_NAME(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    public static final Wm9<Au9> f1351l = new Wm9<Au9>() { // from class: yu9
    };

    /* renamed from: b */
    public final int f1353b;

    Au9(int i) {
        this.f1353b = i;
    }

    /* renamed from: a */
    public static Au9 m114959a(int i) {
        switch (i) {
            case 0:
                return MOBILE_SIGNALS_UNKNOWN;
            case 1:
                return BATTERY_LEVEL;
            case 2:
                return FOREGROUND_VOLUME_PERCENTAGE;
            case 3:
                return AVAILABLE_RAM_PERCENTAGE;
            case 4:
                return APP_VERSION;
            case 5:
                return APP_PERMISSIONS;
            case 6:
                return SCREEN_BRIGHTNESS;
            case 7:
                return ACTIVITY_NAME;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(Au9.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append(Typography.greater);
        return sb.toString();
    }

    @Override // p000.Qm9
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f1353b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
