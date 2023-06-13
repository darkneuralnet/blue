package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentMethodOptionsParams;
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
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0003-.,B\u001b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b&\u0010'B1\b\u0017\u0012\u0006\u0010(\u001a\u00020\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000f\u001a\u00020\f\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0018\u001a\u00020\fHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fHÖ\u0001R\"\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "Lcom/stripe/android/core/model/StripeModel;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "component1", "", "component2", "status", "lastAttemptedAt", "copy", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "getStatus", "()Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "getStatus$annotations", "()V", "I", "getLastAttemptedAt", "()I", "getLastAttemptedAt$annotations", "<init>", "(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;ILbt5;)V", "Companion", "$serializer", "BalanceRefreshStatus", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class BalanceRefresh implements StripeModel, Parcelable {
    public static final int $stable = 0;
    private final int lastAttemptedAt;
    private final BalanceRefreshStatus status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BalanceRefresh> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$financial_connections_release", "()Ljava/lang/String;", "FAILED", "PENDING", "SUCCEEDED", "UNKNOWN", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5
    /* loaded from: classes7.dex */
    public enum BalanceRefreshStatus {
        FAILED("failed"),
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return BalanceRefreshStatus.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<BalanceRefreshStatus> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C18876x55007f44.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        BalanceRefreshStatus(String str) {
            this.code = str;
        }

        public final String getCode$financial_connections_release() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<BalanceRefresh> serializer() {
            return BalanceRefresh$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<BalanceRefresh> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BalanceRefresh createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BalanceRefresh(parcel.readInt() == 0 ? null : BalanceRefreshStatus.valueOf(parcel.readString()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BalanceRefresh[] newArray(int i) {
            return new BalanceRefresh[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BalanceRefresh(int i, @InterfaceC36694Vs5("status") BalanceRefreshStatus balanceRefreshStatus, @InterfaceC36694Vs5("last_attempted_at") int i2, C38819bt5 c38819bt5) {
        if (2 != (i & 2)) {
            C52838zW3.m1275b(i, 2, BalanceRefresh$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.status = BalanceRefreshStatus.UNKNOWN;
        } else {
            this.status = balanceRefreshStatus;
        }
        this.lastAttemptedAt = i2;
    }

    public static /* synthetic */ BalanceRefresh copy$default(BalanceRefresh balanceRefresh, BalanceRefreshStatus balanceRefreshStatus, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            balanceRefreshStatus = balanceRefresh.status;
        }
        if ((i2 & 2) != 0) {
            i = balanceRefresh.lastAttemptedAt;
        }
        return balanceRefresh.copy(balanceRefreshStatus, i);
    }

    @InterfaceC36694Vs5("last_attempted_at")
    public static /* synthetic */ void getLastAttemptedAt$annotations() {
    }

    @InterfaceC36694Vs5("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BalanceRefresh self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.mo1132s(serialDesc, 0) || self.status != BalanceRefreshStatus.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 0, BalanceRefreshStatus.Companion.serializer(), self.status);
        }
        output.mo1145e(serialDesc, 1, self.lastAttemptedAt);
    }

    public final BalanceRefreshStatus component1() {
        return this.status;
    }

    public final int component2() {
        return this.lastAttemptedAt;
    }

    public final BalanceRefresh copy(BalanceRefreshStatus balanceRefreshStatus, int i) {
        return new BalanceRefresh(balanceRefreshStatus, i);
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
        if (obj instanceof BalanceRefresh) {
            BalanceRefresh balanceRefresh = (BalanceRefresh) obj;
            return this.status == balanceRefresh.status && this.lastAttemptedAt == balanceRefresh.lastAttemptedAt;
        }
        return false;
    }

    public final int getLastAttemptedAt() {
        return this.lastAttemptedAt;
    }

    public final BalanceRefreshStatus getStatus() {
        return this.status;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        return ((balanceRefreshStatus == null ? 0 : balanceRefreshStatus.hashCode()) * 31) + Integer.hashCode(this.lastAttemptedAt);
    }

    public String toString() {
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        int i = this.lastAttemptedAt;
        return "BalanceRefresh(status=" + balanceRefreshStatus + ", lastAttemptedAt=" + i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        if (balanceRefreshStatus == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(balanceRefreshStatus.name());
        }
        out.writeInt(this.lastAttemptedAt);
    }

    public BalanceRefresh(BalanceRefreshStatus balanceRefreshStatus, int i) {
        this.status = balanceRefreshStatus;
        this.lastAttemptedAt = i;
    }

    public /* synthetic */ BalanceRefresh(BalanceRefreshStatus balanceRefreshStatus, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BalanceRefreshStatus.UNKNOWN : balanceRefreshStatus, i);
    }
}
