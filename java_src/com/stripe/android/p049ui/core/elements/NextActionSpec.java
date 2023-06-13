package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36694Vs5("next_action_spec")
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/NextActionSpec;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;", "component1", "Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation;", "component2", "confirmResponseStatusSpecs", "postConfirmHandlingPiStatusSpecs", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;", "getConfirmResponseStatusSpecs", "()Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;", "getConfirmResponseStatusSpecs$annotations", "()V", "Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation;", "getPostConfirmHandlingPiStatusSpecs", "()Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation;", "getPostConfirmHandlingPiStatusSpecs$annotations", "<init>", "(Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.NextActionSpec */
/* loaded from: classes7.dex */
public final class NextActionSpec {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final ConfirmStatusSpecAssociation confirmResponseStatusSpecs;
    private final PostConfirmStatusSpecAssociation postConfirmHandlingPiStatusSpecs;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/NextActionSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/NextActionSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.NextActionSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<NextActionSpec> serializer() {
            return NextActionSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public NextActionSpec() {
        this((ConfirmStatusSpecAssociation) null, (PostConfirmStatusSpecAssociation) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NextActionSpec copy$default(NextActionSpec nextActionSpec, ConfirmStatusSpecAssociation confirmStatusSpecAssociation, PostConfirmStatusSpecAssociation postConfirmStatusSpecAssociation, int i, Object obj) {
        if ((i & 1) != 0) {
            confirmStatusSpecAssociation = nextActionSpec.confirmResponseStatusSpecs;
        }
        if ((i & 2) != 0) {
            postConfirmStatusSpecAssociation = nextActionSpec.postConfirmHandlingPiStatusSpecs;
        }
        return nextActionSpec.copy(confirmStatusSpecAssociation, postConfirmStatusSpecAssociation);
    }

    @InterfaceC36694Vs5("confirm_response_status_specs")
    public static /* synthetic */ void getConfirmResponseStatusSpecs$annotations() {
    }

    @InterfaceC36694Vs5("post_confirm_handling_pi_status_specs")
    public static /* synthetic */ void getPostConfirmHandlingPiStatusSpecs$annotations() {
    }

    @JvmStatic
    public static final void write$Self(NextActionSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo1132s(serialDesc, 0) || self.confirmResponseStatusSpecs != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 0, ConfirmStatusSpecAssociation$$serializer.INSTANCE, self.confirmResponseStatusSpecs);
        }
        if (output.mo1132s(serialDesc, 1) || self.postConfirmHandlingPiStatusSpecs != null) {
            z2 = true;
        }
        if (z2) {
            output.mo1173E(serialDesc, 1, PostConfirmStatusSpecAssociation$$serializer.INSTANCE, self.postConfirmHandlingPiStatusSpecs);
        }
    }

    public final ConfirmStatusSpecAssociation component1() {
        return this.confirmResponseStatusSpecs;
    }

    public final PostConfirmStatusSpecAssociation component2() {
        return this.postConfirmHandlingPiStatusSpecs;
    }

    public final NextActionSpec copy(ConfirmStatusSpecAssociation confirmStatusSpecAssociation, PostConfirmStatusSpecAssociation postConfirmStatusSpecAssociation) {
        return new NextActionSpec(confirmStatusSpecAssociation, postConfirmStatusSpecAssociation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NextActionSpec) {
            NextActionSpec nextActionSpec = (NextActionSpec) obj;
            return Intrinsics.areEqual(this.confirmResponseStatusSpecs, nextActionSpec.confirmResponseStatusSpecs) && Intrinsics.areEqual(this.postConfirmHandlingPiStatusSpecs, nextActionSpec.postConfirmHandlingPiStatusSpecs);
        }
        return false;
    }

    public final ConfirmStatusSpecAssociation getConfirmResponseStatusSpecs() {
        return this.confirmResponseStatusSpecs;
    }

    public final PostConfirmStatusSpecAssociation getPostConfirmHandlingPiStatusSpecs() {
        return this.postConfirmHandlingPiStatusSpecs;
    }

    public int hashCode() {
        ConfirmStatusSpecAssociation confirmStatusSpecAssociation = this.confirmResponseStatusSpecs;
        int hashCode = (confirmStatusSpecAssociation == null ? 0 : confirmStatusSpecAssociation.hashCode()) * 31;
        PostConfirmStatusSpecAssociation postConfirmStatusSpecAssociation = this.postConfirmHandlingPiStatusSpecs;
        return hashCode + (postConfirmStatusSpecAssociation != null ? postConfirmStatusSpecAssociation.hashCode() : 0);
    }

    public String toString() {
        ConfirmStatusSpecAssociation confirmStatusSpecAssociation = this.confirmResponseStatusSpecs;
        PostConfirmStatusSpecAssociation postConfirmStatusSpecAssociation = this.postConfirmHandlingPiStatusSpecs;
        return "NextActionSpec(confirmResponseStatusSpecs=" + confirmStatusSpecAssociation + ", postConfirmHandlingPiStatusSpecs=" + postConfirmStatusSpecAssociation + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ NextActionSpec(int i, @InterfaceC36694Vs5("confirm_response_status_specs") ConfirmStatusSpecAssociation confirmStatusSpecAssociation, @InterfaceC36694Vs5("post_confirm_handling_pi_status_specs") PostConfirmStatusSpecAssociation postConfirmStatusSpecAssociation, C38819bt5 c38819bt5) {
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, NextActionSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.confirmResponseStatusSpecs = null;
        } else {
            this.confirmResponseStatusSpecs = confirmStatusSpecAssociation;
        }
        if ((i & 2) == 0) {
            this.postConfirmHandlingPiStatusSpecs = null;
        } else {
            this.postConfirmHandlingPiStatusSpecs = postConfirmStatusSpecAssociation;
        }
    }

    public NextActionSpec(ConfirmStatusSpecAssociation confirmStatusSpecAssociation, PostConfirmStatusSpecAssociation postConfirmStatusSpecAssociation) {
        this.confirmResponseStatusSpecs = confirmStatusSpecAssociation;
        this.postConfirmHandlingPiStatusSpecs = postConfirmStatusSpecAssociation;
    }

    public /* synthetic */ NextActionSpec(ConfirmStatusSpecAssociation confirmStatusSpecAssociation, PostConfirmStatusSpecAssociation postConfirmStatusSpecAssociation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : confirmStatusSpecAssociation, (i & 2) != 0 ? null : postConfirmStatusSpecAssociation);
    }
}
