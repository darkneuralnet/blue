package com.stripe.android.uicore.elements;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0019\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"B\t\b\u0016¢\u0006\u0004\b!\u0010#B-\b\u0017\u0012\u0006\u0010$\u001a\u00020\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b!\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "v1", "ignoreField", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "getV1", "()Ljava/lang/String;", "Z", "getIgnoreField", "()Z", "<init>", "(Ljava/lang/String;Z)V", "()V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;ZLbt5;)V", "Companion", "$serializer", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class IdentifierSpec implements Parcelable {
    public static final int $stable = 0;
    private final boolean ignoreField;

    /* renamed from: v1 */
    private final String f75478v1;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IdentifierSpec> CREATOR = new Creator();
    private static final IdentifierSpec Name = new IdentifierSpec("billing_details[name]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardBrand = new IdentifierSpec("card[brand]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardNumber = new IdentifierSpec("card[number]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardCvc = new IdentifierSpec("card[cvc]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardExpMonth = new IdentifierSpec("card[exp_month]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardExpYear = new IdentifierSpec("card[exp_year]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Email = new IdentifierSpec("billing_details[email]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Phone = new IdentifierSpec("billing_details[phone]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Line1 = new IdentifierSpec("billing_details[address][line1]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Line2 = new IdentifierSpec("billing_details[address][line2]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec City = new IdentifierSpec("billing_details[address][city]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec DependentLocality = new IdentifierSpec("", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec PostalCode = new IdentifierSpec("billing_details[address][postal_code]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SortingCode = new IdentifierSpec("", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec State = new IdentifierSpec("billing_details[address][state]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Country = new IdentifierSpec("billing_details[address][country]", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SaveForFutureUse = new IdentifierSpec("save_for_future_use", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec OneLineAddress = new IdentifierSpec(PaymentMethod.BillingDetails.PARAM_ADDRESS, false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SameAsShipping = new IdentifierSpec("same_as_shipping", true);
    private static final IdentifierSpec Upi = new IdentifierSpec("upi", false, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Vpa = new IdentifierSpec("upi[vpa]", false, 2, (DefaultConstructorMarker) null);

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\rR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\rR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b/\u0010\rR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b1\u0010\rR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\rR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\r¨\u00068"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;", "", "", "_value", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Generic", "value", "get", "LKj2;", "serializer", "Name", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getName", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "CardBrand", "getCardBrand", "CardNumber", "getCardNumber", "CardCvc", "getCardCvc", "CardExpMonth", "getCardExpMonth", "CardExpYear", "getCardExpYear", "Email", "getEmail", "Phone", "getPhone", "Line1", "getLine1", "Line2", "getLine2", "City", "getCity", "DependentLocality", "getDependentLocality", "PostalCode", "getPostalCode", "SortingCode", "getSortingCode", "State", "getState", "Country", "getCountry", "SaveForFutureUse", "getSaveForFutureUse", "OneLineAddress", "getOneLineAddress", "SameAsShipping", "getSameAsShipping", "Upi", "getUpi", "Vpa", "getVpa", "<init>", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentifierSpec Generic(String _value) {
            Intrinsics.checkNotNullParameter(_value, "_value");
            return new IdentifierSpec(_value, false, 2, (DefaultConstructorMarker) null);
        }

        public final IdentifierSpec get(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, getCardBrand().getV1())) {
                return getCardBrand();
            }
            if (Intrinsics.areEqual(value, getCardNumber().getV1())) {
                return getCardNumber();
            }
            if (Intrinsics.areEqual(value, getCardCvc().getV1())) {
                return getCardCvc();
            }
            if (Intrinsics.areEqual(value, getCity().getV1())) {
                return getCity();
            }
            if (Intrinsics.areEqual(value, getCountry().getV1())) {
                return getCountry();
            }
            if (Intrinsics.areEqual(value, getEmail().getV1())) {
                return getEmail();
            }
            if (Intrinsics.areEqual(value, getLine1().getV1())) {
                return getLine1();
            }
            if (Intrinsics.areEqual(value, getLine2().getV1())) {
                return getLine2();
            }
            if (Intrinsics.areEqual(value, getName().getV1())) {
                return getName();
            }
            if (Intrinsics.areEqual(value, getPhone().getV1())) {
                return getPhone();
            }
            if (Intrinsics.areEqual(value, getPostalCode().getV1())) {
                return getPostalCode();
            }
            if (Intrinsics.areEqual(value, getSaveForFutureUse().getV1())) {
                return getSaveForFutureUse();
            }
            if (Intrinsics.areEqual(value, getState().getV1())) {
                return getState();
            }
            if (Intrinsics.areEqual(value, getOneLineAddress().getV1())) {
                return getOneLineAddress();
            }
            return Generic(value);
        }

        public final IdentifierSpec getCardBrand() {
            return IdentifierSpec.CardBrand;
        }

        public final IdentifierSpec getCardCvc() {
            return IdentifierSpec.CardCvc;
        }

        public final IdentifierSpec getCardExpMonth() {
            return IdentifierSpec.CardExpMonth;
        }

        public final IdentifierSpec getCardExpYear() {
            return IdentifierSpec.CardExpYear;
        }

        public final IdentifierSpec getCardNumber() {
            return IdentifierSpec.CardNumber;
        }

        public final IdentifierSpec getCity() {
            return IdentifierSpec.City;
        }

        public final IdentifierSpec getCountry() {
            return IdentifierSpec.Country;
        }

        public final IdentifierSpec getDependentLocality() {
            return IdentifierSpec.DependentLocality;
        }

        public final IdentifierSpec getEmail() {
            return IdentifierSpec.Email;
        }

        public final IdentifierSpec getLine1() {
            return IdentifierSpec.Line1;
        }

        public final IdentifierSpec getLine2() {
            return IdentifierSpec.Line2;
        }

        public final IdentifierSpec getName() {
            return IdentifierSpec.Name;
        }

        public final IdentifierSpec getOneLineAddress() {
            return IdentifierSpec.OneLineAddress;
        }

        public final IdentifierSpec getPhone() {
            return IdentifierSpec.Phone;
        }

        public final IdentifierSpec getPostalCode() {
            return IdentifierSpec.PostalCode;
        }

        public final IdentifierSpec getSameAsShipping() {
            return IdentifierSpec.SameAsShipping;
        }

        public final IdentifierSpec getSaveForFutureUse() {
            return IdentifierSpec.SaveForFutureUse;
        }

        public final IdentifierSpec getSortingCode() {
            return IdentifierSpec.SortingCode;
        }

        public final IdentifierSpec getState() {
            return IdentifierSpec.State;
        }

        public final IdentifierSpec getUpi() {
            return IdentifierSpec.Upi;
        }

        public final IdentifierSpec getVpa() {
            return IdentifierSpec.Vpa;
        }

        public final InterfaceC34036Kj2<IdentifierSpec> serializer() {
            return IdentifierSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<IdentifierSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentifierSpec createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IdentifierSpec(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentifierSpec[] newArray(int i) {
            return new IdentifierSpec[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ IdentifierSpec(int i, String str, boolean z, C38819bt5 c38819bt5) {
        if (1 != (i & 1)) {
            C52838zW3.m1275b(i, 1, IdentifierSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.f75478v1 = str;
        if ((i & 2) == 0) {
            this.ignoreField = false;
        } else {
            this.ignoreField = z;
        }
    }

    public static /* synthetic */ IdentifierSpec copy$default(IdentifierSpec identifierSpec, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identifierSpec.f75478v1;
        }
        if ((i & 2) != 0) {
            z = identifierSpec.ignoreField;
        }
        return identifierSpec.copy(str, z);
    }

    @JvmStatic
    public static final void write$Self(IdentifierSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z = false;
        output.mo1128w(serialDesc, 0, self.f75478v1);
        if (output.mo1132s(serialDesc, 1) || self.ignoreField) {
            z = true;
        }
        if (z) {
            output.mo1129v(serialDesc, 1, self.ignoreField);
        }
    }

    public final String component1() {
        return this.f75478v1;
    }

    public final boolean component2() {
        return this.ignoreField;
    }

    public final IdentifierSpec copy(String v1, boolean z) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        return new IdentifierSpec(v1, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentifierSpec) {
            IdentifierSpec identifierSpec = (IdentifierSpec) obj;
            return Intrinsics.areEqual(this.f75478v1, identifierSpec.f75478v1) && this.ignoreField == identifierSpec.ignoreField;
        }
        return false;
    }

    public final boolean getIgnoreField() {
        return this.ignoreField;
    }

    public final String getV1() {
        return this.f75478v1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f75478v1.hashCode() * 31;
        boolean z = this.ignoreField;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f75478v1;
        boolean z = this.ignoreField;
        return "IdentifierSpec(v1=" + str + ", ignoreField=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75478v1);
        out.writeInt(this.ignoreField ? 1 : 0);
    }

    public IdentifierSpec(String v1, boolean z) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        this.f75478v1 = v1;
        this.ignoreField = z;
    }

    public /* synthetic */ IdentifierSpec(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public IdentifierSpec() {
        this("", false, 2, (DefaultConstructorMarker) null);
    }
}
