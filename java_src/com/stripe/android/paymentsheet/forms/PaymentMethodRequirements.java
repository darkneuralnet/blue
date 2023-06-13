package com.stripe.android.paymentsheet.forms;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.lang.annotation.Annotation;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B1\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)BK\b\u0017\u0012\u0006\u0010*\u001a\u00020\u001b\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b(\u0010-J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bHÇ\u0001J\u0012\u0010\u000f\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003J@\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\fHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010&\u0012\u0004\b'\u0010#¨\u00060"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "", "", "component3", "()Ljava/lang/Boolean;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/model/PaymentMethodCode;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "getConfirmPMFromCustomer", "", "Lcom/stripe/android/paymentsheet/forms/PIRequirement;", "component1", "Lcom/stripe/android/paymentsheet/forms/SIRequirement;", "component2", "piRequirements", "siRequirements", "confirmPMFromCustomer", "copy", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/util/Set;", "getPiRequirements", "()Ljava/util/Set;", "getPiRequirements$annotations", "()V", "getSiRequirements", "getSiRequirements$annotations", "Ljava/lang/Boolean;", "getConfirmPMFromCustomer$annotations", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentMethodRequirements {
    private final Boolean confirmPMFromCustomer;
    private final Set<PIRequirement> piRequirements;
    private final Set<SIRequirement> siRequirements;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$Companion;", "", "LKj2;", "Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<PaymentMethodRequirements> serializer() {
            return PaymentMethodRequirements$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentMethodRequirements(int i, @InterfaceC36694Vs5("pi_requirements") Set set, @InterfaceC36694Vs5("si_requirements") Set set2, @InterfaceC36694Vs5("confirm_pm_from_customer") Boolean bool, C38819bt5 c38819bt5) {
        if (7 != (i & 7)) {
            C52838zW3.m1275b(i, 7, PaymentMethodRequirements$$serializer.INSTANCE.getDescriptor());
        }
        this.piRequirements = set;
        this.siRequirements = set2;
        this.confirmPMFromCustomer = bool;
    }

    private final Boolean component3() {
        return this.confirmPMFromCustomer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodRequirements copy$default(PaymentMethodRequirements paymentMethodRequirements, Set set, Set set2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            set = paymentMethodRequirements.piRequirements;
        }
        if ((i & 2) != 0) {
            set2 = paymentMethodRequirements.siRequirements;
        }
        if ((i & 4) != 0) {
            bool = paymentMethodRequirements.confirmPMFromCustomer;
        }
        return paymentMethodRequirements.copy(set, set2, bool);
    }

    @InterfaceC36694Vs5("confirm_pm_from_customer")
    private static /* synthetic */ void getConfirmPMFromCustomer$annotations() {
    }

    @InterfaceC36694Vs5("pi_requirements")
    public static /* synthetic */ void getPiRequirements$annotations() {
    }

    @InterfaceC36694Vs5("si_requirements")
    public static /* synthetic */ void getSiRequirements$annotations() {
    }

    @JvmStatic
    public static final void write$Self(PaymentMethodRequirements self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1173E(serialDesc, 0, new C35980Sr2(new QX3(Reflection.getOrCreateKotlinClass(PIRequirement.class), new Annotation[0])), self.piRequirements);
        output.mo1173E(serialDesc, 1, new C35980Sr2(new QX3(Reflection.getOrCreateKotlinClass(SIRequirement.class), new Annotation[0])), self.siRequirements);
        output.mo1173E(serialDesc, 2, C9804YY.f45990a, self.confirmPMFromCustomer);
    }

    public final Set<PIRequirement> component1() {
        return this.piRequirements;
    }

    public final Set<SIRequirement> component2() {
        return this.siRequirements;
    }

    public final PaymentMethodRequirements copy(Set<? extends PIRequirement> set, Set<? extends SIRequirement> set2, Boolean bool) {
        return new PaymentMethodRequirements(set, set2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentMethodRequirements) {
            PaymentMethodRequirements paymentMethodRequirements = (PaymentMethodRequirements) obj;
            return Intrinsics.areEqual(this.piRequirements, paymentMethodRequirements.piRequirements) && Intrinsics.areEqual(this.siRequirements, paymentMethodRequirements.siRequirements) && Intrinsics.areEqual(this.confirmPMFromCustomer, paymentMethodRequirements.confirmPMFromCustomer);
        }
        return false;
    }

    public final boolean getConfirmPMFromCustomer(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (PaymentMethod.Type.Companion.fromCode(code) != null && Intrinsics.areEqual(this.confirmPMFromCustomer, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public final Set<PIRequirement> getPiRequirements() {
        return this.piRequirements;
    }

    public final Set<SIRequirement> getSiRequirements() {
        return this.siRequirements;
    }

    public int hashCode() {
        Set<PIRequirement> set = this.piRequirements;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<SIRequirement> set2 = this.siRequirements;
        int hashCode2 = (hashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        Boolean bool = this.confirmPMFromCustomer;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        Set<PIRequirement> set = this.piRequirements;
        Set<SIRequirement> set2 = this.siRequirements;
        Boolean bool = this.confirmPMFromCustomer;
        return "PaymentMethodRequirements(piRequirements=" + set + ", siRequirements=" + set2 + ", confirmPMFromCustomer=" + bool + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodRequirements(Set<? extends PIRequirement> set, Set<? extends SIRequirement> set2, Boolean bool) {
        this.piRequirements = set;
        this.siRequirements = set2;
        this.confirmPMFromCustomer = bool;
    }
}
