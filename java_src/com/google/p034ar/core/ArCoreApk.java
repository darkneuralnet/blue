package com.google.p034ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.p034ar.core.exceptions.FatalException;
import com.google.p034ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p034ar.core.exceptions.UnavailableUserDeclinedInstallationException;
/* renamed from: com.google.ar.core.ArCoreApk */
/* loaded from: classes6.dex */
public class ArCoreApk {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.google.ar.core.ArCoreApk$Availability */
    /* loaded from: classes6.dex */
    public static class Availability {
        final int nativeCode;
        public static final Availability UNKNOWN_ERROR = new C17973a();
        public static final Availability UNKNOWN_CHECKING = new C17984b();
        public static final Availability UNKNOWN_TIMED_OUT = new C17985c();
        public static final Availability UNSUPPORTED_DEVICE_NOT_CAPABLE = new C17986d();
        public static final Availability SUPPORTED_NOT_INSTALLED = new C17997e();
        public static final Availability SUPPORTED_APK_TOO_OLD = new C17998f();
        public static final Availability SUPPORTED_INSTALLED = new C17999g();
        private static final /* synthetic */ Availability[] $VALUES = $values();

        private static /* synthetic */ Availability[] $values() {
            return new Availability[]{UNKNOWN_ERROR, UNKNOWN_CHECKING, UNKNOWN_TIMED_OUT, UNSUPPORTED_DEVICE_NOT_CAPABLE, SUPPORTED_NOT_INSTALLED, SUPPORTED_APK_TOO_OLD, SUPPORTED_INSTALLED};
        }

        public static Availability forNumber(int i) {
            Availability[] values;
            for (Availability availability : values()) {
                if (availability.nativeCode == i) {
                    return availability;
                }
            }
            throw new FatalException("Unexpected value for native Availability, value=" + i);
        }

        public static Availability valueOf(String str) {
            return (Availability) Enum.valueOf(Availability.class, str);
        }

        public static Availability[] values() {
            return (Availability[]) $VALUES.clone();
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }

        private Availability(String str, int i, int i2) {
            this.nativeCode = i2;
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$InstallBehavior */
    /* loaded from: classes6.dex */
    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);
        
        final int nativeCode;

        InstallBehavior(int i) {
            this.nativeCode = i;
        }

        public static InstallBehavior forNumber(int i) {
            InstallBehavior[] values;
            for (InstallBehavior installBehavior : values()) {
                if (installBehavior.nativeCode == i) {
                    return installBehavior;
                }
            }
            throw new FatalException("Unexpected value for native InstallBehavior, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$InstallStatus */
    /* loaded from: classes6.dex */
    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);
        
        final int nativeCode;

        InstallStatus(int i) {
            this.nativeCode = i;
        }

        public static InstallStatus forNumber(int i) {
            InstallStatus[] values;
            for (InstallStatus installStatus : values()) {
                if (installStatus.nativeCode == i) {
                    return installStatus;
                }
            }
            throw new FatalException("Unexpected value for native InstallStatus, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.ArCoreApk$UserMessageType */
    /* loaded from: classes6.dex */
    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);
        
        final int nativeCode;

        UserMessageType(int i) {
            this.nativeCode = i;
        }

        public static UserMessageType forNumber(int i) {
            UserMessageType[] values;
            for (UserMessageType userMessageType : values()) {
                if (userMessageType.nativeCode == i) {
                    return userMessageType;
                }
            }
            throw new FatalException("Unexpected value for native UserMessageType, value=" + i);
        }
    }

    public static ArCoreApk getInstance() {
        return C18002j.m48414a();
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z, InstallBehavior installBehavior, UserMessageType userMessageType) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        throw new UnsupportedOperationException("Stub");
    }
}