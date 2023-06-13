package com.stripe.android.stripe3ds2.init;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/Warning;", "Landroid/os/Parcelable;", "id", "", "message", "severity", "Lcom/stripe/android/stripe3ds2/init/Warning$Severity;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/Warning$Severity;)V", "getId", "()Ljava/lang/String;", "getMessage", "getSeverity", "()Lcom/stripe/android/stripe3ds2/init/Warning$Severity;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Severity", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Warning implements Parcelable {
    public static final Parcelable.Creator<Warning> CREATOR = new Creator();

    /* renamed from: id */
    private final String f75438id;
    private final String message;
    private final Severity severity;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Warning> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Warning createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Warning(parcel.readString(), parcel.readString(), Severity.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Warning[] newArray(int i) {
            return new Warning[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/Warning$Severity;", "", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Severity {
        LOW,
        MEDIUM,
        HIGH
    }

    public Warning(String id, String message, Severity severity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        this.f75438id = id;
        this.message = message;
        this.severity = severity;
    }

    public static /* synthetic */ Warning copy$default(Warning warning, String str, String str2, Severity severity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = warning.f75438id;
        }
        if ((i & 2) != 0) {
            str2 = warning.message;
        }
        if ((i & 4) != 0) {
            severity = warning.severity;
        }
        return warning.copy(str, str2, severity);
    }

    public final String component1() {
        return this.f75438id;
    }

    public final String component2() {
        return this.message;
    }

    public final Severity component3() {
        return this.severity;
    }

    public final Warning copy(String id, String message, Severity severity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        return new Warning(id, message, severity);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Warning) {
            Warning warning = (Warning) obj;
            return Intrinsics.areEqual(this.f75438id, warning.f75438id) && Intrinsics.areEqual(this.message, warning.message) && this.severity == warning.severity;
        }
        return false;
    }

    public final String getId() {
        return this.f75438id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Severity getSeverity() {
        return this.severity;
    }

    public int hashCode() {
        return (((this.f75438id.hashCode() * 31) + this.message.hashCode()) * 31) + this.severity.hashCode();
    }

    public String toString() {
        return "Warning(id=" + this.f75438id + ", message=" + this.message + ", severity=" + this.severity + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75438id);
        out.writeString(this.message);
        out.writeString(this.severity.name());
    }
}
