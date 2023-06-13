package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.StripeIntent;
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
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BO\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b0\u00101Bc\b\u0017\u0012\u0006\u00102\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\"\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010#R\"\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010!\u0012\u0004\b/\u0010%\u001a\u0004\b.\u0010#¨\u00068"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/model/StripeIntent$Status;", "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;", "getMap", "component1", "component2", "component3", "component4", "component5", "component6", "requiresPaymentMethod", "requiresConfirmation", "requiresAction", BaseSheetViewModel.SAVE_PROCESSING, "succeeded", "canceled", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;", "getRequiresPaymentMethod", "()Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;", "getRequiresPaymentMethod$annotations", "()V", "getRequiresConfirmation", "getRequiresConfirmation$annotations", "getRequiresAction", "getRequiresAction$annotations", "getProcessing", "getProcessing$annotations", "getSucceeded", "getSucceeded$annotations", "getCanceled", "getCanceled$annotations", "<init>", "(Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.PostConfirmStatusSpecAssociation */
/* loaded from: classes7.dex */
public final class PostConfirmStatusSpecAssociation {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final PostConfirmHandlingPiStatusSpecs canceled;
    private final PostConfirmHandlingPiStatusSpecs processing;
    private final PostConfirmHandlingPiStatusSpecs requiresAction;
    private final PostConfirmHandlingPiStatusSpecs requiresConfirmation;
    private final PostConfirmHandlingPiStatusSpecs requiresPaymentMethod;
    private final PostConfirmHandlingPiStatusSpecs succeeded;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.PostConfirmStatusSpecAssociation$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<PostConfirmStatusSpecAssociation> serializer() {
            return PostConfirmStatusSpecAssociation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PostConfirmStatusSpecAssociation() {
        this((PostConfirmHandlingPiStatusSpecs) null, (PostConfirmHandlingPiStatusSpecs) null, (PostConfirmHandlingPiStatusSpecs) null, (PostConfirmHandlingPiStatusSpecs) null, (PostConfirmHandlingPiStatusSpecs) null, (PostConfirmHandlingPiStatusSpecs) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PostConfirmStatusSpecAssociation copy$default(PostConfirmStatusSpecAssociation postConfirmStatusSpecAssociation, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs2, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs3, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs4, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs5, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs6, int i, Object obj) {
        if ((i & 1) != 0) {
            postConfirmHandlingPiStatusSpecs = postConfirmStatusSpecAssociation.requiresPaymentMethod;
        }
        if ((i & 2) != 0) {
            postConfirmHandlingPiStatusSpecs2 = postConfirmStatusSpecAssociation.requiresConfirmation;
        }
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs7 = postConfirmHandlingPiStatusSpecs2;
        if ((i & 4) != 0) {
            postConfirmHandlingPiStatusSpecs3 = postConfirmStatusSpecAssociation.requiresAction;
        }
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs8 = postConfirmHandlingPiStatusSpecs3;
        if ((i & 8) != 0) {
            postConfirmHandlingPiStatusSpecs4 = postConfirmStatusSpecAssociation.processing;
        }
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs9 = postConfirmHandlingPiStatusSpecs4;
        if ((i & 16) != 0) {
            postConfirmHandlingPiStatusSpecs5 = postConfirmStatusSpecAssociation.succeeded;
        }
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs10 = postConfirmHandlingPiStatusSpecs5;
        if ((i & 32) != 0) {
            postConfirmHandlingPiStatusSpecs6 = postConfirmStatusSpecAssociation.canceled;
        }
        return postConfirmStatusSpecAssociation.copy(postConfirmHandlingPiStatusSpecs, postConfirmHandlingPiStatusSpecs7, postConfirmHandlingPiStatusSpecs8, postConfirmHandlingPiStatusSpecs9, postConfirmHandlingPiStatusSpecs10, postConfirmHandlingPiStatusSpecs6);
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
    public static final void write$Self(PostConfirmStatusSpecAssociation self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
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
            output.mo1173E(serialDesc, 0, PostConfirmHandlingPiStatusSpecsSerializer.INSTANCE, self.requiresPaymentMethod);
        }
        if (output.mo1132s(serialDesc, 1) || self.requiresConfirmation != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 1, PostConfirmHandlingPiStatusSpecsSerializer.INSTANCE, self.requiresConfirmation);
        }
        if (output.mo1132s(serialDesc, 2) || self.requiresAction != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo1173E(serialDesc, 2, PostConfirmHandlingPiStatusSpecsSerializer.INSTANCE, self.requiresAction);
        }
        if (output.mo1132s(serialDesc, 3) || self.processing != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo1173E(serialDesc, 3, PostConfirmHandlingPiStatusSpecsSerializer.INSTANCE, self.processing);
        }
        if (output.mo1132s(serialDesc, 4) || self.succeeded != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            output.mo1173E(serialDesc, 4, PostConfirmHandlingPiStatusSpecsSerializer.INSTANCE, self.succeeded);
        }
        if (output.mo1132s(serialDesc, 5) || self.canceled != null) {
            z6 = true;
        }
        if (z6) {
            output.mo1173E(serialDesc, 5, PostConfirmHandlingPiStatusSpecsSerializer.INSTANCE, self.canceled);
        }
    }

    public final PostConfirmHandlingPiStatusSpecs component1() {
        return this.requiresPaymentMethod;
    }

    public final PostConfirmHandlingPiStatusSpecs component2() {
        return this.requiresConfirmation;
    }

    public final PostConfirmHandlingPiStatusSpecs component3() {
        return this.requiresAction;
    }

    public final PostConfirmHandlingPiStatusSpecs component4() {
        return this.processing;
    }

    public final PostConfirmHandlingPiStatusSpecs component5() {
        return this.succeeded;
    }

    public final PostConfirmHandlingPiStatusSpecs component6() {
        return this.canceled;
    }

    public final PostConfirmStatusSpecAssociation copy(PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs2, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs3, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs4, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs5, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs6) {
        return new PostConfirmStatusSpecAssociation(postConfirmHandlingPiStatusSpecs, postConfirmHandlingPiStatusSpecs2, postConfirmHandlingPiStatusSpecs3, postConfirmHandlingPiStatusSpecs4, postConfirmHandlingPiStatusSpecs5, postConfirmHandlingPiStatusSpecs6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostConfirmStatusSpecAssociation) {
            PostConfirmStatusSpecAssociation postConfirmStatusSpecAssociation = (PostConfirmStatusSpecAssociation) obj;
            return Intrinsics.areEqual(this.requiresPaymentMethod, postConfirmStatusSpecAssociation.requiresPaymentMethod) && Intrinsics.areEqual(this.requiresConfirmation, postConfirmStatusSpecAssociation.requiresConfirmation) && Intrinsics.areEqual(this.requiresAction, postConfirmStatusSpecAssociation.requiresAction) && Intrinsics.areEqual(this.processing, postConfirmStatusSpecAssociation.processing) && Intrinsics.areEqual(this.succeeded, postConfirmStatusSpecAssociation.succeeded) && Intrinsics.areEqual(this.canceled, postConfirmStatusSpecAssociation.canceled);
        }
        return false;
    }

    public final PostConfirmHandlingPiStatusSpecs getCanceled() {
        return this.canceled;
    }

    public final Map<StripeIntent.Status, PostConfirmHandlingPiStatusSpecs> getMap() {
        Map mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(StripeIntent.Status.RequiresPaymentMethod, this.requiresPaymentMethod), TuplesKt.m28425to(StripeIntent.Status.RequiresConfirmation, this.requiresConfirmation), TuplesKt.m28425to(StripeIntent.Status.RequiresAction, this.requiresAction), TuplesKt.m28425to(StripeIntent.Status.Processing, this.processing), TuplesKt.m28425to(StripeIntent.Status.Succeeded, this.succeeded), TuplesKt.m28425to(StripeIntent.Status.Canceled, this.canceled));
        return NextActionSpecKt.filterNotNullValues(mapOf);
    }

    public final PostConfirmHandlingPiStatusSpecs getProcessing() {
        return this.processing;
    }

    public final PostConfirmHandlingPiStatusSpecs getRequiresAction() {
        return this.requiresAction;
    }

    public final PostConfirmHandlingPiStatusSpecs getRequiresConfirmation() {
        return this.requiresConfirmation;
    }

    public final PostConfirmHandlingPiStatusSpecs getRequiresPaymentMethod() {
        return this.requiresPaymentMethod;
    }

    public final PostConfirmHandlingPiStatusSpecs getSucceeded() {
        return this.succeeded;
    }

    public int hashCode() {
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs = this.requiresPaymentMethod;
        int hashCode = (postConfirmHandlingPiStatusSpecs == null ? 0 : postConfirmHandlingPiStatusSpecs.hashCode()) * 31;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs2 = this.requiresConfirmation;
        int hashCode2 = (hashCode + (postConfirmHandlingPiStatusSpecs2 == null ? 0 : postConfirmHandlingPiStatusSpecs2.hashCode())) * 31;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs3 = this.requiresAction;
        int hashCode3 = (hashCode2 + (postConfirmHandlingPiStatusSpecs3 == null ? 0 : postConfirmHandlingPiStatusSpecs3.hashCode())) * 31;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs4 = this.processing;
        int hashCode4 = (hashCode3 + (postConfirmHandlingPiStatusSpecs4 == null ? 0 : postConfirmHandlingPiStatusSpecs4.hashCode())) * 31;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs5 = this.succeeded;
        int hashCode5 = (hashCode4 + (postConfirmHandlingPiStatusSpecs5 == null ? 0 : postConfirmHandlingPiStatusSpecs5.hashCode())) * 31;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs6 = this.canceled;
        return hashCode5 + (postConfirmHandlingPiStatusSpecs6 != null ? postConfirmHandlingPiStatusSpecs6.hashCode() : 0);
    }

    public String toString() {
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs = this.requiresPaymentMethod;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs2 = this.requiresConfirmation;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs3 = this.requiresAction;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs4 = this.processing;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs5 = this.succeeded;
        PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs6 = this.canceled;
        return "PostConfirmStatusSpecAssociation(requiresPaymentMethod=" + postConfirmHandlingPiStatusSpecs + ", requiresConfirmation=" + postConfirmHandlingPiStatusSpecs2 + ", requiresAction=" + postConfirmHandlingPiStatusSpecs3 + ", processing=" + postConfirmHandlingPiStatusSpecs4 + ", succeeded=" + postConfirmHandlingPiStatusSpecs5 + ", canceled=" + postConfirmHandlingPiStatusSpecs6 + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PostConfirmStatusSpecAssociation(int i, @InterfaceC36694Vs5("requires_payment_method") PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs, @InterfaceC36694Vs5("requires_confirmation") PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs2, @InterfaceC36694Vs5("requires_action") PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs3, @InterfaceC36694Vs5("processing") PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs4, @InterfaceC36694Vs5("succeeded") PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs5, @InterfaceC36694Vs5("canceled") PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs6, C38819bt5 c38819bt5) {
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, PostConfirmStatusSpecAssociation$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.requiresPaymentMethod = null;
        } else {
            this.requiresPaymentMethod = postConfirmHandlingPiStatusSpecs;
        }
        if ((i & 2) == 0) {
            this.requiresConfirmation = null;
        } else {
            this.requiresConfirmation = postConfirmHandlingPiStatusSpecs2;
        }
        if ((i & 4) == 0) {
            this.requiresAction = null;
        } else {
            this.requiresAction = postConfirmHandlingPiStatusSpecs3;
        }
        if ((i & 8) == 0) {
            this.processing = null;
        } else {
            this.processing = postConfirmHandlingPiStatusSpecs4;
        }
        if ((i & 16) == 0) {
            this.succeeded = null;
        } else {
            this.succeeded = postConfirmHandlingPiStatusSpecs5;
        }
        if ((i & 32) == 0) {
            this.canceled = null;
        } else {
            this.canceled = postConfirmHandlingPiStatusSpecs6;
        }
    }

    public PostConfirmStatusSpecAssociation(PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs2, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs3, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs4, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs5, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs6) {
        this.requiresPaymentMethod = postConfirmHandlingPiStatusSpecs;
        this.requiresConfirmation = postConfirmHandlingPiStatusSpecs2;
        this.requiresAction = postConfirmHandlingPiStatusSpecs3;
        this.processing = postConfirmHandlingPiStatusSpecs4;
        this.succeeded = postConfirmHandlingPiStatusSpecs5;
        this.canceled = postConfirmHandlingPiStatusSpecs6;
    }

    public /* synthetic */ PostConfirmStatusSpecAssociation(PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs2, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs3, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs4, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs5, PostConfirmHandlingPiStatusSpecs postConfirmHandlingPiStatusSpecs6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : postConfirmHandlingPiStatusSpecs, (i & 2) != 0 ? null : postConfirmHandlingPiStatusSpecs2, (i & 4) != 0 ? null : postConfirmHandlingPiStatusSpecs3, (i & 8) != 0 ? null : postConfirmHandlingPiStatusSpecs4, (i & 16) != 0 ? null : postConfirmHandlingPiStatusSpecs5, (i & 32) != 0 ? null : postConfirmHandlingPiStatusSpecs6);
    }
}
