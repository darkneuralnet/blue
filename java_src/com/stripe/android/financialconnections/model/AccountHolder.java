package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
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
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0003102B)\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b*\u0010+B?\b\u0017\u0012\u0006\u0010,\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0013\u001a\u00020\fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014HÖ\u0001R \u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&R\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010$\u0012\u0004\b)\u0010#\u001a\u0004\b(\u0010&¨\u00063"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/AccountHolder;", "Lcom/stripe/android/core/model/StripeModel;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/AccountHolder$Type;", "component1", "", "component2", "component3", "type", "account", PaymentSheetEvent.FIELD_CUSTOMER, "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/AccountHolder$Type;", "getType", "()Lcom/stripe/android/financialconnections/model/AccountHolder$Type;", "getType$annotations", "()V", "Ljava/lang/String;", "getAccount", "()Ljava/lang/String;", "getAccount$annotations", "getCustomer", "getCustomer$annotations", "<init>", "(Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "Type", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AccountHolder implements StripeModel, Parcelable {
    public static final int $stable = 0;
    private final String account;
    private final String customer;
    private final Type type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccountHolder> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/AccountHolder$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/AccountHolder;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<AccountHolder> serializer() {
            return AccountHolder$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AccountHolder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountHolder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountHolder(Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountHolder[] newArray(int i) {
            return new AccountHolder[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/AccountHolder$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCOUNT", "CUSTOMER", "UNKNOWN", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5
    /* loaded from: classes7.dex */
    public enum Type {
        ACCOUNT("account"),
        CUSTOMER(PaymentSheetEvent.FIELD_CUSTOMER),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/AccountHolder$Type$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/AccountHolder$Type;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                return Type.$cachedSerializer$delegate;
            }

            public final InterfaceC34036Kj2<Type> serializer() {
                return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
            }

            private Companion() {
            }
        }

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) AccountHolder$Type$Companion$$cachedSerializer$delegate$1.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Type(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public AccountHolder() {
        this((Type) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AccountHolder copy$default(AccountHolder accountHolder, Type type, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            type = accountHolder.type;
        }
        if ((i & 2) != 0) {
            str = accountHolder.account;
        }
        if ((i & 4) != 0) {
            str2 = accountHolder.customer;
        }
        return accountHolder.copy(type, str, str2);
    }

    @InterfaceC36694Vs5("account")
    public static /* synthetic */ void getAccount$annotations() {
    }

    @InterfaceC36694Vs5(PaymentSheetEvent.FIELD_CUSTOMER)
    public static /* synthetic */ void getCustomer$annotations() {
    }

    @InterfaceC36694Vs5("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @JvmStatic
    public static final void write$Self(AccountHolder self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z3 = false;
        if (output.mo1132s(serialDesc, 0) || self.type != Type.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1126y(serialDesc, 0, Type.Companion.serializer(), self.type);
        }
        if (output.mo1132s(serialDesc, 1) || self.account != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 1, C41539gS5.f82260a, self.account);
        }
        if (output.mo1132s(serialDesc, 2) || self.customer != null) {
            z3 = true;
        }
        if (z3) {
            output.mo1173E(serialDesc, 2, C41539gS5.f82260a, self.customer);
        }
    }

    public final Type component1() {
        return this.type;
    }

    public final String component2() {
        return this.account;
    }

    public final String component3() {
        return this.customer;
    }

    public final AccountHolder copy(Type type, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new AccountHolder(type, str, str2);
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
        if (obj instanceof AccountHolder) {
            AccountHolder accountHolder = (AccountHolder) obj;
            return this.type == accountHolder.type && Intrinsics.areEqual(this.account, accountHolder.account) && Intrinsics.areEqual(this.customer, accountHolder.customer);
        }
        return false;
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getCustomer() {
        return this.customer;
    }

    public final Type getType() {
        return this.type;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.account;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customer;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Type type = this.type;
        String str = this.account;
        String str2 = this.customer;
        return "AccountHolder(type=" + type + ", account=" + str + ", customer=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.type.name());
        out.writeString(this.account);
        out.writeString(this.customer);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AccountHolder(int i, @InterfaceC36694Vs5("type") Type type, @InterfaceC36694Vs5("account") String str, @InterfaceC36694Vs5("customer") String str2, C38819bt5 c38819bt5) {
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, AccountHolder$$serializer.INSTANCE.getDescriptor());
        }
        this.type = (i & 1) == 0 ? Type.UNKNOWN : type;
        if ((i & 2) == 0) {
            this.account = null;
        } else {
            this.account = str;
        }
        if ((i & 4) == 0) {
            this.customer = null;
        } else {
            this.customer = str2;
        }
    }

    public AccountHolder(Type type, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.account = str;
        this.customer = str2;
    }

    public /* synthetic */ AccountHolder(Type type, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Type.UNKNOWN : type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
