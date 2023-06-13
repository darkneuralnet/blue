package com.stripe.android.link.p042ui.inline;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/link/ui/inline/UserInput;", "", "()V", "SignIn", "SignUp", "Lcom/stripe/android/link/ui/inline/UserInput$SignIn;", "Lcom/stripe/android/link/ui/inline/UserInput$SignUp;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.inline.UserInput */
/* loaded from: classes7.dex */
public abstract class UserInput {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/link/ui/inline/UserInput$SignIn;", "Lcom/stripe/android/link/ui/inline/UserInput;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.inline.UserInput$SignIn */
    /* loaded from: classes7.dex */
    public static final class SignIn extends UserInput {
        public static final int $stable = 0;
        private final String email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignIn(String email) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }

        public static /* synthetic */ SignIn copy$default(SignIn signIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signIn.email;
            }
            return signIn.copy(str);
        }

        public final String component1() {
            return this.email;
        }

        public final SignIn copy(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new SignIn(email);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignIn) && Intrinsics.areEqual(this.email, ((SignIn) obj).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            String str = this.email;
            return "SignIn(email=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/link/ui/inline/UserInput$SignUp;", "Lcom/stripe/android/link/ui/inline/UserInput;", "email", "", PaymentMethod.BillingDetails.PARAM_PHONE, "country", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getEmail", "getName", "getPhone", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.inline.UserInput$SignUp */
    /* loaded from: classes7.dex */
    public static final class SignUp extends UserInput {
        public static final int $stable = 0;
        private final String country;
        private final String email;
        private final String name;
        private final String phone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignUp(String email, String phone, String country, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(country, "country");
            this.email = email;
            this.phone = phone;
            this.country = country;
            this.name = str;
        }

        public static /* synthetic */ SignUp copy$default(SignUp signUp, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signUp.email;
            }
            if ((i & 2) != 0) {
                str2 = signUp.phone;
            }
            if ((i & 4) != 0) {
                str3 = signUp.country;
            }
            if ((i & 8) != 0) {
                str4 = signUp.name;
            }
            return signUp.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.email;
        }

        public final String component2() {
            return this.phone;
        }

        public final String component3() {
            return this.country;
        }

        public final String component4() {
            return this.name;
        }

        public final SignUp copy(String email, String phone, String country, String str) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(country, "country");
            return new SignUp(email, phone, country, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SignUp) {
                SignUp signUp = (SignUp) obj;
                return Intrinsics.areEqual(this.email, signUp.email) && Intrinsics.areEqual(this.phone, signUp.phone) && Intrinsics.areEqual(this.country, signUp.country) && Intrinsics.areEqual(this.name, signUp.name);
            }
            return false;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            int hashCode = ((((this.email.hashCode() * 31) + this.phone.hashCode()) * 31) + this.country.hashCode()) * 31;
            String str = this.name;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.email;
            String str2 = this.phone;
            String str3 = this.country;
            String str4 = this.name;
            return "SignUp(email=" + str + ", phone=" + str2 + ", country=" + str3 + ", name=" + str4 + ")";
        }
    }

    public /* synthetic */ UserInput(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserInput() {
    }
}
