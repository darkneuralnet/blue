package com.stripe.android.stripe3ds2.init;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "warning", "Lcom/stripe/android/stripe3ds2/init/Warning;", "(Lcom/stripe/android/stripe3ds2/init/Warning;)V", "getWarning", "()Lcom/stripe/android/stripe3ds2/init/Warning;", "check", "", "DebuggerAttached", "Emulator", "RootedCheck", "Tampered", "UnsupportedOS", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class SecurityCheck {
    private final Warning warning;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "isDebuggerConnected", "", "(Z)V", "()Z", "check", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DebuggerAttached extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW04", "A debugger is attached to the App.", Warning.Severity.MEDIUM);
        private final boolean isDebuggerConnected;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached$Companion;", "", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public DebuggerAttached() {
            this(false, 1, null);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return this.isDebuggerConnected;
        }

        public final boolean isDebuggerConnected() {
            return this.isDebuggerConnected;
        }

        public /* synthetic */ DebuggerAttached(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Debug.isDebuggerConnected() : z);
        }

        public DebuggerAttached(boolean z) {
            super(WARNING, null);
            this.isDebuggerConnected = z;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "()V", "isEmulator", "", "()Z", "check", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Emulator extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW02", "An emulator is being used to run the App.", Warning.Severity.HIGH);

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator$Companion;", "", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Emulator() {
            super(WARNING, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
            if (r0 == false) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final boolean isEmulator() {
            boolean startsWith$default;
            boolean startsWith$default2;
            boolean contains$default;
            boolean contains$default2;
            boolean contains$default3;
            boolean contains$default4;
            boolean startsWith$default3;
            boolean startsWith$default4;
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(FINGERPRINT, "generic", false, 2, null);
            if (!startsWith$default) {
                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(FINGERPRINT, "unknown", false, 2, null);
                if (!startsWith$default2) {
                    String MODEL = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    contains$default = StringsKt__StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Emulator", false, 2, (Object) null);
                    if (!contains$default) {
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Android SDK built for x86", false, 2, (Object) null);
                        if (!contains$default2) {
                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                            contains$default3 = StringsKt__StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null);
                            if (!contains$default3) {
                                String MANUFACTURER = Build.MANUFACTURER;
                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                contains$default4 = StringsKt__StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null);
                                if (!contains$default4) {
                                    String BRAND = Build.BRAND;
                                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                    startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(BRAND, "generic", false, 2, null);
                                    if (startsWith$default3) {
                                        String DEVICE = Build.DEVICE;
                                        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                        startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(DEVICE, "generic", false, 2, null);
                                    }
                                    if (!Intrinsics.areEqual("google_sdk", Build.PRODUCT)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return isEmulator();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "()V", "check", "", "findSuBinary", "findSuperuserApk", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class RootedCheck extends SecurityCheck {
        @Deprecated
        private static final List<String> BINARY_PATHS;
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck$Companion;", "", "()V", "BINARY_PATHS", "", "", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            List<String> listOf;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"});
            BINARY_PATHS = listOf;
            WARNING = new Warning("SW01", "The device is jailbroken.", Warning.Severity.HIGH);
        }

        public RootedCheck() {
            super(WARNING, null);
        }

        private final boolean findSuBinary() {
            List<String> list = BINARY_PATHS;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (new File(((String) it.next()) + "su").exists()) {
                    return true;
                }
            }
            return false;
        }

        private final boolean findSuperuserApk() {
            return new File(Environment.getRootDirectory().toString() + "/Superuser").isDirectory();
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return findSuBinary() || findSuperuserApk();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "()V", "check", "", "hasValidFields", "hasValidMethods", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Tampered extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW02", "The integrity of the SDK has been tampered.", Warning.Severity.HIGH);

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered$Companion;", "", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Tampered() {
            super(WARNING, null);
        }

        private final boolean hasValidFields() {
            if (StripeThreeDs2ServiceImpl.class.getDeclaredFields().length == 9) {
                return true;
            }
            return false;
        }

        private final boolean hasValidMethods() {
            if (StripeThreeDs2ServiceImpl.class.getDeclaredMethods().length == 6) {
                return true;
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return (hasValidFields() && hasValidMethods()) ? false : true;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "()V", "check", "", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class UnsupportedOS extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW05", "The OS or the OS version is not supported.", Warning.Severity.HIGH);

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS$Companion;", "", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public UnsupportedOS() {
            super(WARNING, null);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return false;
        }
    }

    public /* synthetic */ SecurityCheck(Warning warning, DefaultConstructorMarker defaultConstructorMarker) {
        this(warning);
    }

    public abstract boolean check();

    public final Warning getWarning() {
        return this.warning;
    }

    private SecurityCheck(Warning warning) {
        this.warning = warning;
    }
}
