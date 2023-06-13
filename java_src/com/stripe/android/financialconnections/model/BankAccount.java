package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010+BK\b\u0017\u0012\u0006\u0010,\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014HÖ\u0001R \u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010!R\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u0012\u0004\b)\u0010#\u001a\u0004\b(\u0010!¨\u00062"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/BankAccount;", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "id", "last4", "bankName", "routingNumber", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getLast4", "getLast4$annotations", "getBankName", "getBankName$annotations", "getRoutingNumber", "getRoutingNumber$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class BankAccount extends PaymentAccount {
    public static final int $stable = 0;
    private final String bankName;

    /* renamed from: id */
    private final String f75306id;
    private final String last4;
    private final String routingNumber;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/BankAccount$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/BankAccount;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<BankAccount> serializer() {
            return BankAccount$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<BankAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccount[] newArray(int i) {
            return new BankAccount[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BankAccount(int i, @InterfaceC36694Vs5("id") String str, @InterfaceC36694Vs5("last4") String str2, @InterfaceC36694Vs5("bank_name") String str3, @InterfaceC36694Vs5("routing_number") String str4, C38819bt5 c38819bt5) {
        super(null);
        if (3 != (i & 3)) {
            C52838zW3.m1275b(i, 3, BankAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.f75306id = str;
        this.last4 = str2;
        if ((i & 4) == 0) {
            this.bankName = null;
        } else {
            this.bankName = str3;
        }
        if ((i & 8) == 0) {
            this.routingNumber = null;
        } else {
            this.routingNumber = str4;
        }
    }

    public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankAccount.f75306id;
        }
        if ((i & 2) != 0) {
            str2 = bankAccount.last4;
        }
        if ((i & 4) != 0) {
            str3 = bankAccount.bankName;
        }
        if ((i & 8) != 0) {
            str4 = bankAccount.routingNumber;
        }
        return bankAccount.copy(str, str2, str3, str4);
    }

    @InterfaceC36694Vs5("bank_name")
    public static /* synthetic */ void getBankName$annotations() {
    }

    @InterfaceC36694Vs5("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC36694Vs5("last4")
    public static /* synthetic */ void getLast4$annotations() {
    }

    @InterfaceC36694Vs5("routing_number")
    public static /* synthetic */ void getRoutingNumber$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BankAccount self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        output.mo1128w(serialDesc, 0, self.f75306id);
        output.mo1128w(serialDesc, 1, self.last4);
        if (output.mo1132s(serialDesc, 2) || self.bankName != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 2, C41539gS5.f82260a, self.bankName);
        }
        if (output.mo1132s(serialDesc, 3) || self.routingNumber != null) {
            z2 = true;
        }
        if (z2) {
            output.mo1173E(serialDesc, 3, C41539gS5.f82260a, self.routingNumber);
        }
    }

    public final String component1() {
        return this.f75306id;
    }

    public final String component2() {
        return this.last4;
    }

    public final String component3() {
        return this.bankName;
    }

    public final String component4() {
        return this.routingNumber;
    }

    public final BankAccount copy(String id, String last4, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(last4, "last4");
        return new BankAccount(id, last4, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BankAccount) {
            BankAccount bankAccount = (BankAccount) obj;
            return Intrinsics.areEqual(this.f75306id, bankAccount.f75306id) && Intrinsics.areEqual(this.last4, bankAccount.last4) && Intrinsics.areEqual(this.bankName, bankAccount.bankName) && Intrinsics.areEqual(this.routingNumber, bankAccount.routingNumber);
        }
        return false;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getId() {
        return this.f75306id;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public int hashCode() {
        int hashCode = ((this.f75306id.hashCode() * 31) + this.last4.hashCode()) * 31;
        String str = this.bankName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f75306id;
        String str2 = this.last4;
        String str3 = this.bankName;
        String str4 = this.routingNumber;
        return "BankAccount(id=" + str + ", last4=" + str2 + ", bankName=" + str3 + ", routingNumber=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75306id);
        out.writeString(this.last4);
        out.writeString(this.bankName);
        out.writeString(this.routingNumber);
    }

    public /* synthetic */ BankAccount(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccount(String id, String last4, String str, String str2) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(last4, "last4");
        this.f75306id = id;
        this.last4 = last4;
        this.bankName = str;
        this.routingNumber = str2;
    }
}
