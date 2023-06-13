package com.stripe.android.link.p042ui.paymentmethod;

import android.content.res.Resources;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.PrimaryButtonKt;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.elements.FormItemSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0001\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#BI\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H&R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bj\u0002\b!j\u0002\b\"¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;", "", "type", "", "formSpec", "", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "nameResourceId", "", "iconResourceId", "primaryButtonStartIconResourceId", "primaryButtonEndIconResourceId", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IILjava/lang/Integer;Ljava/lang/Integer;)V", "getFormSpec", "()Ljava/util/List;", "getIconResourceId", "()I", "getNameResourceId", "getPrimaryButtonEndIconResourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrimaryButtonStartIconResourceId", "showsForm", "", "getShowsForm", "()Z", "getType", "()Ljava/lang/String;", "primaryButtonLabel", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "resources", "Landroid/content/res/Resources;", "Card", "BankAccount", "Companion", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSupportedPaymentMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethod.kt\ncom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,72:1\n11335#2:73\n11670#2,3:74\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethod.kt\ncom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod\n*L\n69#1:73\n69#1:74,3\n*E\n"})
/* renamed from: com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod */
/* loaded from: classes7.dex */
public enum SupportedPaymentMethod {
    Card { // from class: com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod.Card
        @Override // com.stripe.android.link.p042ui.paymentmethod.SupportedPaymentMethod
        public String primaryButtonLabel(StripeIntent stripeIntent, Resources resources) {
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(resources, "resources");
            return PrimaryButtonKt.completePaymentButtonLabel(stripeIntent, resources);
        }
    },
    BankAccount { // from class: com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod.BankAccount
        @Override // com.stripe.android.link.p042ui.paymentmethod.SupportedPaymentMethod
        public String primaryButtonLabel(StripeIntent stripeIntent, Resources resources) {
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(resources, "resources");
            String string = resources.getString(C18975R.string.add_bank_account);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.add_bank_account)");
            return string;
        }
    };
    
    public static final Companion Companion = new Companion(null);
    private static final Set<String> allTypes;
    private final List<FormItemSpec> formSpec;
    private final int iconResourceId;
    private final int nameResourceId;
    private final Integer primaryButtonEndIconResourceId;
    private final Integer primaryButtonStartIconResourceId;
    private final boolean showsForm;
    private final String type;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Companion;", "", "()V", "allTypes", "", "", "getAllTypes", "()Ljava/util/Set;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getAllTypes() {
            return SupportedPaymentMethod.allTypes;
        }

        private Companion() {
        }
    }

    static {
        Set<String> set;
        SupportedPaymentMethod[] values = values();
        ArrayList arrayList = new ArrayList(values.length);
        for (SupportedPaymentMethod supportedPaymentMethod : values) {
            arrayList.add(supportedPaymentMethod.type);
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        allTypes = set;
    }

    SupportedPaymentMethod(String str, List list, int i, int i2, Integer num, Integer num2) {
        this.type = str;
        this.formSpec = list;
        this.nameResourceId = i;
        this.iconResourceId = i2;
        this.primaryButtonStartIconResourceId = num;
        this.primaryButtonEndIconResourceId = num2;
        this.showsForm = !list.isEmpty();
    }

    public final List<FormItemSpec> getFormSpec() {
        return this.formSpec;
    }

    public final int getIconResourceId() {
        return this.iconResourceId;
    }

    public final int getNameResourceId() {
        return this.nameResourceId;
    }

    public final Integer getPrimaryButtonEndIconResourceId() {
        return this.primaryButtonEndIconResourceId;
    }

    public final Integer getPrimaryButtonStartIconResourceId() {
        return this.primaryButtonStartIconResourceId;
    }

    public final boolean getShowsForm() {
        return this.showsForm;
    }

    public final String getType() {
        return this.type;
    }

    public abstract String primaryButtonLabel(StripeIntent stripeIntent, Resources resources);

    /* synthetic */ SupportedPaymentMethod(String str, List list, int i, int i2, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, i2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2);
    }
}
