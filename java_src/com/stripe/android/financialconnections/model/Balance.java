package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import java.util.LinkedHashMap;
import java.util.Map;
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
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0003BACBE\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b;\u0010<Ba\b\u0017\u0012\u0006\u0010=\u001a\u00020\n\u0012\b\b\u0001\u0010\u0015\u001a\u00020\n\u0012\u0016\b\u0001\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b;\u0010@J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\n2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\t\u0010\u001b\u001a\u00020\rHÖ\u0001J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\u0019\u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nHÖ\u0001R \u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R \u0010\u0017\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00107\u0012\u0004\b:\u0010*\u001a\u0004\b8\u00109¨\u0006D"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/Balance;", "Lcom/stripe/android/core/model/StripeModel;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "", "", "component2", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "component3", "Lcom/stripe/android/financialconnections/model/CashBalance;", "component4", "Lcom/stripe/android/financialconnections/model/CreditBalance;", "component5", "asOf", "current", "type", "cash", "credit", "copy", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "I", "getAsOf", "()I", "getAsOf$annotations", "()V", "Ljava/util/Map;", "getCurrent", "()Ljava/util/Map;", "getCurrent$annotations", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "getType", "()Lcom/stripe/android/financialconnections/model/Balance$Type;", "getType$annotations", "Lcom/stripe/android/financialconnections/model/CashBalance;", "getCash", "()Lcom/stripe/android/financialconnections/model/CashBalance;", "getCash$annotations", "Lcom/stripe/android/financialconnections/model/CreditBalance;", "getCredit", "()Lcom/stripe/android/financialconnections/model/CreditBalance;", "getCredit$annotations", "<init>", "(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(IILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;Lbt5;)V", "Companion", "$serializer", "Type", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Balance implements StripeModel, Parcelable {
    private final int asOf;
    private final CashBalance cash;
    private final CreditBalance credit;
    private final Map<String, Integer> current;
    private final Type type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Balance> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/Balance$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/Balance;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<Balance> serializer() {
            return Balance$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Balance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Balance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i = 0; i != readInt2; i++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new Balance(readInt, linkedHashMap, Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CashBalance.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreditBalance.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Balance[] newArray(int i) {
            return new Balance[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/Balance$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CASH", "CREDIT", "UNKNOWN", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @InterfaceC36928Ws5
    /* loaded from: classes7.dex */
    public enum Type {
        CASH("cash"),
        CREDIT("credit"),
        UNKNOWN("unknown");
        
        private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/Balance$Type$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
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
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) Balance$Type$Companion$$cachedSerializer$delegate$1.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        Type(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Balance(int i, @InterfaceC36694Vs5("as_of") int i2, @InterfaceC36694Vs5("current") Map map, @InterfaceC36694Vs5("type") Type type, @InterfaceC36694Vs5("cash") CashBalance cashBalance, @InterfaceC36694Vs5("credit") CreditBalance creditBalance, C38819bt5 c38819bt5) {
        if (3 != (i & 3)) {
            C52838zW3.m1275b(i, 3, Balance$$serializer.INSTANCE.getDescriptor());
        }
        this.asOf = i2;
        this.current = map;
        if ((i & 4) == 0) {
            this.type = Type.UNKNOWN;
        } else {
            this.type = type;
        }
        if ((i & 8) == 0) {
            this.cash = null;
        } else {
            this.cash = cashBalance;
        }
        if ((i & 16) == 0) {
            this.credit = null;
        } else {
            this.credit = creditBalance;
        }
    }

    public static /* synthetic */ Balance copy$default(Balance balance, int i, Map map, Type type, CashBalance cashBalance, CreditBalance creditBalance, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = balance.asOf;
        }
        Map<String, Integer> map2 = map;
        if ((i2 & 2) != 0) {
            map2 = balance.current;
        }
        Map map3 = map2;
        if ((i2 & 4) != 0) {
            type = balance.type;
        }
        Type type2 = type;
        if ((i2 & 8) != 0) {
            cashBalance = balance.cash;
        }
        CashBalance cashBalance2 = cashBalance;
        if ((i2 & 16) != 0) {
            creditBalance = balance.credit;
        }
        return balance.copy(i, map3, type2, cashBalance2, creditBalance);
    }

    @InterfaceC36694Vs5("as_of")
    public static /* synthetic */ void getAsOf$annotations() {
    }

    @InterfaceC36694Vs5("cash")
    public static /* synthetic */ void getCash$annotations() {
    }

    @InterfaceC36694Vs5("credit")
    public static /* synthetic */ void getCredit$annotations() {
    }

    @InterfaceC36694Vs5("current")
    public static /* synthetic */ void getCurrent$annotations() {
    }

    @InterfaceC36694Vs5("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @JvmStatic
    public static final void write$Self(Balance self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z3 = false;
        output.mo1145e(serialDesc, 0, self.asOf);
        output.mo1126y(serialDesc, 1, new C35512Qr2(C41539gS5.f82260a, F52.f8705a), self.current);
        if (output.mo1132s(serialDesc, 2) || self.type != Type.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1126y(serialDesc, 2, Type.Companion.serializer(), self.type);
        }
        if (output.mo1132s(serialDesc, 3) || self.cash != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 3, CashBalance$$serializer.INSTANCE, self.cash);
        }
        if (output.mo1132s(serialDesc, 4) || self.credit != null) {
            z3 = true;
        }
        if (z3) {
            output.mo1173E(serialDesc, 4, CreditBalance$$serializer.INSTANCE, self.credit);
        }
    }

    public final int component1() {
        return this.asOf;
    }

    public final Map<String, Integer> component2() {
        return this.current;
    }

    public final Type component3() {
        return this.type;
    }

    public final CashBalance component4() {
        return this.cash;
    }

    public final CreditBalance component5() {
        return this.credit;
    }

    public final Balance copy(int i, Map<String, Integer> current, Type type, CashBalance cashBalance, CreditBalance creditBalance) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Balance(i, current, type, cashBalance, creditBalance);
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
        if (obj instanceof Balance) {
            Balance balance = (Balance) obj;
            return this.asOf == balance.asOf && Intrinsics.areEqual(this.current, balance.current) && this.type == balance.type && Intrinsics.areEqual(this.cash, balance.cash) && Intrinsics.areEqual(this.credit, balance.credit);
        }
        return false;
    }

    public final int getAsOf() {
        return this.asOf;
    }

    public final CashBalance getCash() {
        return this.cash;
    }

    public final CreditBalance getCredit() {
        return this.credit;
    }

    public final Map<String, Integer> getCurrent() {
        return this.current;
    }

    public final Type getType() {
        return this.type;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.asOf) * 31) + this.current.hashCode()) * 31) + this.type.hashCode()) * 31;
        CashBalance cashBalance = this.cash;
        int hashCode2 = (hashCode + (cashBalance == null ? 0 : cashBalance.hashCode())) * 31;
        CreditBalance creditBalance = this.credit;
        return hashCode2 + (creditBalance != null ? creditBalance.hashCode() : 0);
    }

    public String toString() {
        int i = this.asOf;
        Map<String, Integer> map = this.current;
        Type type = this.type;
        CashBalance cashBalance = this.cash;
        CreditBalance creditBalance = this.credit;
        return "Balance(asOf=" + i + ", current=" + map + ", type=" + type + ", cash=" + cashBalance + ", credit=" + creditBalance + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.asOf);
        Map<String, Integer> map = this.current;
        out.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeInt(entry.getValue().intValue());
        }
        out.writeString(this.type.name());
        CashBalance cashBalance = this.cash;
        if (cashBalance == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cashBalance.writeToParcel(out, i);
        }
        CreditBalance creditBalance = this.credit;
        if (creditBalance == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        creditBalance.writeToParcel(out, i);
    }

    public Balance(int i, Map<String, Integer> current, Type type, CashBalance cashBalance, CreditBalance creditBalance) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(type, "type");
        this.asOf = i;
        this.current = current;
        this.type = type;
        this.cash = cashBalance;
        this.credit = creditBalance;
    }

    public /* synthetic */ Balance(int i, Map map, Type type, CashBalance cashBalance, CreditBalance creditBalance, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, map, (i2 & 4) != 0 ? Type.UNKNOWN : type, (i2 & 8) != 0 ? null : cashBalance, (i2 & 16) != 0 ? null : creditBalance);
    }
}
