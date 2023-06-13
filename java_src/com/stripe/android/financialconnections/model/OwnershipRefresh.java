package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0003-,.B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b&\u0010'B1\b\u0017\u0012\u0006\u0010(\u001a\u00020\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\n\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0018\u001a\u00020\nHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\nHÖ\u0001R \u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "Landroid/os/Parcelable;", "Lcom/stripe/android/core/model/StripeModel;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "component2", "lastAttemptedAt", "status", "copy", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "I", "getLastAttemptedAt", "()I", "getLastAttemptedAt$annotations", "()V", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "getStatus", "()Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "getStatus$annotations", "<init>", "(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(IILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;Lbt5;)V", "Companion", "$serializer", "Status", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class OwnershipRefresh implements Parcelable, StripeModel {
    public static final int $stable = 0;
    private final int lastAttemptedAt;
    private final Status status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OwnershipRefresh> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<OwnershipRefresh> serializer() {
            return OwnershipRefresh$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OwnershipRefresh> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OwnershipRefresh createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OwnershipRefresh(parcel.readInt(), Status.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OwnershipRefresh[] newArray(int i) {
            return new OwnershipRefresh[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FAILED", "PENDING", "SUCCEEDED", "UNKNOWN", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5
    /* loaded from: classes7.dex */
    public enum Status {
        FAILED("failed"),
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return Status.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<Status> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) OwnershipRefresh$Status$Companion$$cachedSerializer$delegate$1.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Status(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ OwnershipRefresh(int i, @InterfaceC36694Vs5("last_attempted_at") int i2, @InterfaceC36694Vs5("status") Status status, C38819bt5 c38819bt5) {
        if (1 != (i & 1)) {
            C52838zW3.m1275b(i, 1, OwnershipRefresh$$serializer.INSTANCE.getDescriptor());
        }
        this.lastAttemptedAt = i2;
        if ((i & 2) == 0) {
            this.status = Status.UNKNOWN;
        } else {
            this.status = status;
        }
    }

    public static /* synthetic */ OwnershipRefresh copy$default(OwnershipRefresh ownershipRefresh, int i, Status status, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ownershipRefresh.lastAttemptedAt;
        }
        if ((i2 & 2) != 0) {
            status = ownershipRefresh.status;
        }
        return ownershipRefresh.copy(i, status);
    }

    @InterfaceC36694Vs5("last_attempted_at")
    public static /* synthetic */ void getLastAttemptedAt$annotations() {
    }

    @InterfaceC36694Vs5("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @JvmStatic
    public static final void write$Self(OwnershipRefresh self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z = false;
        output.mo1145e(serialDesc, 0, self.lastAttemptedAt);
        if (output.mo1132s(serialDesc, 1) || self.status != Status.UNKNOWN) {
            z = true;
        }
        if (z) {
            output.mo1126y(serialDesc, 1, Status.Companion.serializer(), self.status);
        }
    }

    public final int component1() {
        return this.lastAttemptedAt;
    }

    public final Status component2() {
        return this.status;
    }

    public final OwnershipRefresh copy(int i, Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new OwnershipRefresh(i, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OwnershipRefresh) {
            OwnershipRefresh ownershipRefresh = (OwnershipRefresh) obj;
            return this.lastAttemptedAt == ownershipRefresh.lastAttemptedAt && this.status == ownershipRefresh.status;
        }
        return false;
    }

    public final int getLastAttemptedAt() {
        return this.lastAttemptedAt;
    }

    public final Status getStatus() {
        return this.status;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (Integer.hashCode(this.lastAttemptedAt) * 31) + this.status.hashCode();
    }

    public String toString() {
        int i = this.lastAttemptedAt;
        Status status = this.status;
        return "OwnershipRefresh(lastAttemptedAt=" + i + ", status=" + status + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.lastAttemptedAt);
        out.writeString(this.status.name());
    }

    public OwnershipRefresh(int i, Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.lastAttemptedAt = i;
        this.status = status;
    }

    public /* synthetic */ OwnershipRefresh(int i, Status status, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? Status.UNKNOWN : status);
    }
}
