package p000;

import android.support.annotation.NonNull;
/* renamed from: fM6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC40893fM6 {
    KNOWN_ROOT_APPS_PACKAGES("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk"),
    SU_PATHS("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/system/xbin/daemonsu/", "/system/etc/init.d/99SuperSUDaemon/", "/system/bin/.ext/.su/", "/system/etc/.has_su_daemon/", "/system/etc/.installed_su_daemon/", "/cache/", "/data/", "/dev/");
    

    /* renamed from: b */
    public final String[] f79957b;

    /* renamed from: fM6$a */
    /* loaded from: classes8.dex */
    public enum EnumC20379a {
        SU("su"),
        BUSYBOX("busybox"),
        MAGISK("magisk");
        

        /* renamed from: b */
        public final String f79962b;

        EnumC20379a(String str) {
            this.f79962b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f79962b;
        }
    }

    /* renamed from: fM6$b */
    /* loaded from: classes8.dex */
    public enum EnumC20380b {
        NUMBER_OF_ROOTED_FLAGS(7),
        IS_TEST_KEYS_FOUND(0),
        IS_SU_FOUND(1),
        IS_SUPER_USER_APK_FOUND(2),
        DETECT_ROOT_MANAGEMENT_APPS(3),
        CHECK_FOR_BINARY_SU(4),
        CHECK_FOR_BINARY_BUSYBOX(5),
        CHECK_FOR_BINARY_MAGISK(6);
        

        /* renamed from: b */
        public final int f79972b;

        EnumC20380b(int i) {
            this.f79972b = i;
        }

        /* renamed from: b */
        public static EnumC20380b m41498b(int i) {
            EnumC20380b enumC20380b = IS_TEST_KEYS_FOUND;
            if (i == enumC20380b.m41499a()) {
                return enumC20380b;
            }
            EnumC20380b enumC20380b2 = IS_SU_FOUND;
            if (i == enumC20380b2.m41499a()) {
                return enumC20380b2;
            }
            EnumC20380b enumC20380b3 = IS_SUPER_USER_APK_FOUND;
            if (i == enumC20380b3.m41499a()) {
                return enumC20380b3;
            }
            EnumC20380b enumC20380b4 = DETECT_ROOT_MANAGEMENT_APPS;
            if (i == enumC20380b4.m41499a()) {
                return enumC20380b4;
            }
            EnumC20380b enumC20380b5 = CHECK_FOR_BINARY_SU;
            if (i == enumC20380b5.m41499a()) {
                return enumC20380b5;
            }
            EnumC20380b enumC20380b6 = CHECK_FOR_BINARY_BUSYBOX;
            if (i == enumC20380b6.m41499a()) {
                return enumC20380b6;
            }
            EnumC20380b enumC20380b7 = CHECK_FOR_BINARY_MAGISK;
            if (i == enumC20380b7.m41499a()) {
                return enumC20380b7;
            }
            return null;
        }

        /* renamed from: a */
        public int m41499a() {
            return this.f79972b;
        }
    }

    EnumC40893fM6(String... strArr) {
        this.f79957b = strArr;
    }

    /* renamed from: a */
    public String[] m41500a() {
        return this.f79957b;
    }
}
