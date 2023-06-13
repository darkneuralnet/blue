package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.elements.ConfirmResponseStatusSpecs;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BO\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b0\u00101Bc\b\u0017\u0012\u0006\u00102\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\"\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010#R\"\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010!\u0012\u0004\b/\u0010%\u001a\u0004\b.\u0010#¨\u00068"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/model/StripeIntent$Status;", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "getMap", "component1", "component2", "component3", "component4", "component5", "component6", "requiresPaymentMethod", "requiresConfirmation", "requiresAction", BaseSheetViewModel.SAVE_PROCESSING, "succeeded", "canceled", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "getRequiresPaymentMethod", "()Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "getRequiresPaymentMethod$annotations", "()V", "getRequiresConfirmation", "getRequiresConfirmation$annotations", "getRequiresAction", "getRequiresAction$annotations", "getProcessing", "getProcessing$annotations", "getSucceeded", "getSucceeded$annotations", "getCanceled", "getCanceled$annotations", "<init>", "(Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.ConfirmStatusSpecAssociation */
/* loaded from: classes7.dex */
public final class ConfirmStatusSpecAssociation {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final ConfirmResponseStatusSpecs canceled;
    private final ConfirmResponseStatusSpecs processing;
    private final ConfirmResponseStatusSpecs requiresAction;
    private final ConfirmResponseStatusSpecs requiresConfirmation;
    private final ConfirmResponseStatusSpecs requiresPaymentMethod;
    private final ConfirmResponseStatusSpecs succeeded;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.ConfirmStatusSpecAssociation$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<ConfirmStatusSpecAssociation> serializer() {
            return ConfirmStatusSpecAssociation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ConfirmStatusSpecAssociation() {
        this((ConfirmResponseStatusSpecs) null, (ConfirmResponseStatusSpecs) null, (ConfirmResponseStatusSpecs) null, (ConfirmResponseStatusSpecs) null, (ConfirmResponseStatusSpecs) null, (ConfirmResponseStatusSpecs) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ConfirmStatusSpecAssociation copy$default(ConfirmStatusSpecAssociation confirmStatusSpecAssociation, ConfirmResponseStatusSpecs confirmResponseStatusSpecs, ConfirmResponseStatusSpecs confirmResponseStatusSpecs2, ConfirmResponseStatusSpecs confirmResponseStatusSpecs3, ConfirmResponseStatusSpecs confirmResponseStatusSpecs4, ConfirmResponseStatusSpecs confirmResponseStatusSpecs5, ConfirmResponseStatusSpecs confirmResponseStatusSpecs6, int i, Object obj) {
        if ((i & 1) != 0) {
            confirmResponseStatusSpecs = confirmStatusSpecAssociation.requiresPaymentMethod;
        }
        if ((i & 2) != 0) {
            confirmResponseStatusSpecs2 = confirmStatusSpecAssociation.requiresConfirmation;
        }
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs7 = confirmResponseStatusSpecs2;
        if ((i & 4) != 0) {
            confirmResponseStatusSpecs3 = confirmStatusSpecAssociation.requiresAction;
        }
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs8 = confirmResponseStatusSpecs3;
        if ((i & 8) != 0) {
            confirmResponseStatusSpecs4 = confirmStatusSpecAssociation.processing;
        }
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs9 = confirmResponseStatusSpecs4;
        if ((i & 16) != 0) {
            confirmResponseStatusSpecs5 = confirmStatusSpecAssociation.succeeded;
        }
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs10 = confirmResponseStatusSpecs5;
        if ((i & 32) != 0) {
            confirmResponseStatusSpecs6 = confirmStatusSpecAssociation.canceled;
        }
        return confirmStatusSpecAssociation.copy(confirmResponseStatusSpecs, confirmResponseStatusSpecs7, confirmResponseStatusSpecs8, confirmResponseStatusSpecs9, confirmResponseStatusSpecs10, confirmResponseStatusSpecs6);
    }

    @InterfaceC36694Vs5("canceled")
    public static /* synthetic */ void getCanceled$annotations() {
    }

    @InterfaceC36694Vs5(BaseSheetViewModel.SAVE_PROCESSING)
    public static /* synthetic */ void getProcessing$annotations() {
    }

    @InterfaceC36694Vs5("requires_action")
    public static /* synthetic */ void getRequiresAction$annotations() {
    }

    @InterfaceC36694Vs5("requires_confirmation")
    public static /* synthetic */ void getRequiresConfirmation$annotations() {
    }

    @InterfaceC36694Vs5("requires_payment_method")
    public static /* synthetic */ void getRequiresPaymentMethod$annotations() {
    }

    @InterfaceC36694Vs5("succeeded")
    public static /* synthetic */ void getSucceeded$annotations() {
    }

    @JvmStatic
    public static final void write$Self(ConfirmStatusSpecAssociation self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z6 = false;
        if (output.mo1132s(serialDesc, 0) || self.requiresPaymentMethod != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 0, ConfirmResponseStatusSpecsSerializer.INSTANCE, self.requiresPaymentMethod);
        }
        if (output.mo1132s(serialDesc, 1) || self.requiresConfirmation != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 1, ConfirmResponseStatusSpecsSerializer.INSTANCE, self.requiresConfirmation);
        }
        if (output.mo1132s(serialDesc, 2) || self.requiresAction != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo1173E(serialDesc, 2, ConfirmResponseStatusSpecsSerializer.INSTANCE, self.requiresAction);
        }
        if (output.mo1132s(serialDesc, 3) || self.processing != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo1173E(serialDesc, 3, ConfirmResponseStatusSpecsSerializer.INSTANCE, self.processing);
        }
        if (output.mo1132s(serialDesc, 4) || !Intrinsics.areEqual(self.succeeded, ConfirmResponseStatusSpecs.FinishedSpec.INSTANCE)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            output.mo1173E(serialDesc, 4, ConfirmResponseStatusSpecsSerializer.INSTANCE, self.succeeded);
        }
        if (output.mo1132s(serialDesc, 5) || self.canceled != null) {
            z6 = true;
        }
        if (z6) {
            output.mo1173E(serialDesc, 5, ConfirmResponseStatusSpecsSerializer.INSTANCE, self.canceled);
        }
    }

    public final ConfirmResponseStatusSpecs component1() {
        return this.requiresPaymentMethod;
    }

    public final ConfirmResponseStatusSpecs component2() {
        return this.requiresConfirmation;
    }

    public final ConfirmResponseStatusSpecs component3() {
        return this.requiresAction;
    }

    public final ConfirmResponseStatusSpecs component4() {
        return this.processing;
    }

    public final ConfirmResponseStatusSpecs component5() {
        return this.succeeded;
    }

    public final ConfirmResponseStatusSpecs component6() {
        return this.canceled;
    }

    public final ConfirmStatusSpecAssociation copy(ConfirmResponseStatusSpecs confirmResponseStatusSpecs, ConfirmResponseStatusSpecs confirmResponseStatusSpecs2, ConfirmResponseStatusSpecs confirmResponseStatusSpecs3, ConfirmResponseStatusSpecs confirmResponseStatusSpecs4, ConfirmResponseStatusSpecs confirmResponseStatusSpecs5, ConfirmResponseStatusSpecs confirmResponseStatusSpecs6) {
        return new ConfirmStatusSpecAssociation(confirmResponseStatusSpecs, confirmResponseStatusSpecs2, confirmResponseStatusSpecs3, confirmResponseStatusSpecs4, confirmResponseStatusSpecs5, confirmResponseStatusSpecs6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfirmStatusSpecAssociation) {
            ConfirmStatusSpecAssociation confirmStatusSpecAssociation = (ConfirmStatusSpecAssociation) obj;
            return Intrinsics.areEqual(this.requiresPaymentMethod, confirmStatusSpecAssociation.requiresPaymentMethod) && Intrinsics.areEqual(this.requiresConfirmation, confirmStatusSpecAssociation.requiresConfirmation) && Intrinsics.areEqual(this.requiresAction, confirmStatusSpecAssociation.requiresAction) && Intrinsics.areEqual(this.processing, confirmStatusSpecAssociation.processing) && Intrinsics.areEqual(this.succeeded, confirmStatusSpecAssociation.succeeded) && Intrinsics.areEqual(this.canceled, confirmStatusSpecAssociation.canceled);
        }
        return false;
    }

    public final ConfirmResponseStatusSpecs getCanceled() {
        return this.canceled;
    }

    public final Map<StripeIntent.Status, ConfirmResponseStatusSpecs> getMap() {
        Map mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(StripeIntent.Status.RequiresPaymentMethod, this.requiresPaymentMethod), TuplesKt.m28425to(StripeIntent.Status.RequiresConfirmation, this.requiresConfirmation), TuplesKt.m28425to(StripeIntent.Status.RequiresAction, this.requiresAction), TuplesKt.m28425to(StripeIntent.Status.Processing, this.processing), TuplesKt.m28425to(StripeIntent.Status.Succeeded, this.succeeded), TuplesKt.m28425to(StripeIntent.Status.Canceled, this.canceled));
        return NextActionSpecKt.filterNotNullValues(mapOf);
    }

    public final ConfirmResponseStatusSpecs getProcessing() {
        return this.processing;
    }

    public final ConfirmResponseStatusSpecs getRequiresAction() {
        return this.requiresAction;
    }

    public final ConfirmResponseStatusSpecs getRequiresConfirmation() {
        return this.requiresConfirmation;
    }

    public final ConfirmResponseStatusSpecs getRequiresPaymentMethod() {
        return this.requiresPaymentMethod;
    }

    public final ConfirmResponseStatusSpecs getSucceeded() {
        return this.succeeded;
    }

    public int hashCode() {
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs = this.requiresPaymentMethod;
        int hashCode = (confirmResponseStatusSpecs == null ? 0 : confirmResponseStatusSpecs.hashCode()) * 31;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs2 = this.requiresConfirmation;
        int hashCode2 = (hashCode + (confirmResponseStatusSpecs2 == null ? 0 : confirmResponseStatusSpecs2.hashCode())) * 31;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs3 = this.requiresAction;
        int hashCode3 = (hashCode2 + (confirmResponseStatusSpecs3 == null ? 0 : confirmResponseStatusSpecs3.hashCode())) * 31;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs4 = this.processing;
        int hashCode4 = (hashCode3 + (confirmResponseStatusSpecs4 == null ? 0 : confirmResponseStatusSpecs4.hashCode())) * 31;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs5 = this.succeeded;
        int hashCode5 = (hashCode4 + (confirmResponseStatusSpecs5 == null ? 0 : confirmResponseStatusSpecs5.hashCode())) * 31;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs6 = this.canceled;
        return hashCode5 + (confirmResponseStatusSpecs6 != null ? confirmResponseStatusSpecs6.hashCode() : 0);
    }

    public String toString() {
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs = this.requiresPaymentMethod;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs2 = this.requiresConfirmation;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs3 = this.requiresAction;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs4 = this.processing;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs5 = this.succeeded;
        ConfirmResponseStatusSpecs confirmResponseStatusSpecs6 = this.canceled;
        return "ConfirmStatusSpecAssociation(requiresPaymentMethod=" + confirmResponseStatusSpecs + ", requiresConfirmation=" + confirmResponseStatusSpecs2 + ", requiresAction=" + confirmResponseStatusSpecs3 + ", processing=" + confirmResponseStatusSpecs4 + ", succeeded=" + confirmResponseStatusSpecs5 + ", canceled=" + confirmResponseStatusSpecs6 + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ConfirmStatusSpecAssociation(int i, @InterfaceC36694Vs5("requires_payment_method") ConfirmResponseStatusSpecs confirmResponseStatusSpecs, @InterfaceC36694Vs5("requires_confirmation") ConfirmResponseStatusSpecs confirmResponseStatusSpecs2, @InterfaceC36694Vs5("requires_action") ConfirmResponseStatusSpecs confirmResponseStatusSpecs3, @InterfaceC36694Vs5("processing") ConfirmResponseStatusSpecs confirmResponseStatusSpecs4, @InterfaceC36694Vs5("succeeded") ConfirmResponseStatusSpecs confirmResponseStatusSpecs5, @InterfaceC36694Vs5("canceled") ConfirmResponseStatusSpecs confirmResponseStatusSpecs6, C38819bt5 c38819bt5) {
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, ConfirmStatusSpecAssociation$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.requiresPaymentMethod = null;
        } else {
            this.requiresPaymentMethod = confirmResponseStatusSpecs;
        }
        if ((i & 2) == 0) {
            this.requiresConfirmation = null;
        } else {
            this.requiresConfirmation = confirmResponseStatusSpecs2;
        }
        if ((i & 4) == 0) {
            this.requiresAction = null;
        } else {
            this.requiresAction = confirmResponseStatusSpecs3;
        }
        if ((i & 8) == 0) {
            this.processing = null;
        } else {
            this.processing = confirmResponseStatusSpecs4;
        }
        if ((i & 16) == 0) {
            this.succeeded = ConfirmResponseStatusSpecs.FinishedSpec.INSTANCE;
        } else {
            this.succeeded = confirmResponseStatusSpecs5;
        }
        if ((i & 32) == 0) {
            this.canceled = null;
        } else {
            this.canceled = confirmResponseStatusSpecs6;
        }
    }

    public ConfirmStatusSpecAssociation(ConfirmResponseStatusSpecs confirmResponseStatusSpecs, ConfirmResponseStatusSpecs confirmResponseStatusSpecs2, ConfirmResponseStatusSpecs confirmResponseStatusSpecs3, ConfirmResponseStatusSpecs confirmResponseStatusSpecs4, ConfirmResponseStatusSpecs confirmResponseStatusSpecs5, ConfirmResponseStatusSpecs confirmResponseStatusSpecs6) {
        this.requiresPaymentMethod = confirmResponseStatusSpecs;
        this.requiresConfirmation = confirmResponseStatusSpecs2;
        this.requiresAction = confirmResponseStatusSpecs3;
        this.processing = confirmResponseStatusSpecs4;
        this.succeeded = confirmResponseStatusSpecs5;
        this.canceled = confirmResponseStatusSpecs6;
    }

    public /* synthetic */ ConfirmStatusSpecAssociation(ConfirmResponseStatusSpecs confirmResponseStatusSpecs, ConfirmResponseStatusSpecs confirmResponseStatusSpecs2, ConfirmResponseStatusSpecs confirmResponseStatusSpecs3, ConfirmResponseStatusSpecs confirmResponseStatusSpecs4, ConfirmResponseStatusSpecs confirmResponseStatusSpecs5, ConfirmResponseStatusSpecs confirmResponseStatusSpecs6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : confirmResponseStatusSpecs, (i & 2) != 0 ? null : confirmResponseStatusSpecs2, (i & 4) != 0 ? null : confirmResponseStatusSpecs3, (i & 8) != 0 ? null : confirmResponseStatusSpecs4, (i & 16) != 0 ? ConfirmResponseStatusSpecs.FinishedSpec.INSTANCE : confirmResponseStatusSpecs5, (i & 32) != 0 ? null : confirmResponseStatusSpecs6);
    }
}
