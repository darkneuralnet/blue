package com.stripe.android.p049ui.core.elements;

import android.content.res.Resources;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.Source;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.elements.Controller;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.format.CurrencyFormatter;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B#\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\t\u0010\u0007\u001a\u00020\u0006HÂ\u0003J \u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t0\bH\u0016J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u001a\u0010\u0014\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "Lqv2;", "locale", "", "getLocaleString", "Lcom/stripe/android/ui/core/Amount;", "component2", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "Landroid/content/res/Resources;", "resources", "getLabel", "component1", "Lcom/stripe/android/uicore/elements/Controller;", "component3", "identifier", "amount", "controller", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/ui/core/Amount;", "Lcom/stripe/android/uicore/elements/Controller;", "getController", "()Lcom/stripe/android/uicore/elements/Controller;", "getInfoUrl", "()Ljava/lang/String;", "infoUrl", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/uicore/elements/Controller;)V", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.AfterpayClearpayHeaderElement */
/* loaded from: classes7.dex */
public final class AfterpayClearpayHeaderElement implements FormElement {
    public static final String NO_BREAK_SPACE = " ";
    public static final String url = "https://static.afterpay.com/modal/%s.html";
    private final Amount amount;
    private final Controller controller;
    private final IdentifierSpec identifier;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement$Companion;", "", "()V", "NO_BREAK_SPACE", "", "url", "isClearpay", "", "isClearpay$payments_ui_core_release", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.AfterpayClearpayHeaderElement$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isClearpay$payments_ui_core_release() {
            Set of;
            of = SetsKt__SetsKt.setOf((Object[]) new String[]{"GB", "ES", "FR", "IT"});
            return of.contains(C47748qv2.f106064b.m16784a().m16786c());
        }

        private Companion() {
        }
    }

    public AfterpayClearpayHeaderElement(IdentifierSpec identifier, Amount amount, Controller controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.identifier = identifier;
        this.amount = amount;
        this.controller = controller;
    }

    private final Amount component2() {
        return this.amount;
    }

    public static /* synthetic */ AfterpayClearpayHeaderElement copy$default(AfterpayClearpayHeaderElement afterpayClearpayHeaderElement, IdentifierSpec identifierSpec, Amount amount, Controller controller, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = afterpayClearpayHeaderElement.getIdentifier();
        }
        if ((i & 2) != 0) {
            amount = afterpayClearpayHeaderElement.amount;
        }
        if ((i & 4) != 0) {
            controller = afterpayClearpayHeaderElement.getController();
        }
        return afterpayClearpayHeaderElement.copy(identifierSpec, amount, controller);
    }

    private final String getLocaleString(C47748qv2 c47748qv2) {
        String m16788a = c47748qv2.m16788a();
        Locale locale = Locale.ROOT;
        String lowerCase = m16788a.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String upperCase = c47748qv2.m16786c().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return lowerCase + "_" + upperCase;
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final Controller component3() {
        return getController();
    }

    public final AfterpayClearpayHeaderElement copy(IdentifierSpec identifier, Amount amount, Controller controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new AfterpayClearpayHeaderElement(identifier, amount, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AfterpayClearpayHeaderElement) {
            AfterpayClearpayHeaderElement afterpayClearpayHeaderElement = (AfterpayClearpayHeaderElement) obj;
            return Intrinsics.areEqual(getIdentifier(), afterpayClearpayHeaderElement.getIdentifier()) && Intrinsics.areEqual(this.amount, afterpayClearpayHeaderElement.amount) && Intrinsics.areEqual(getController(), afterpayClearpayHeaderElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public Controller getController() {
        return this.controller;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        List emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return C50405vP5.m8742a(emptyList);
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final String getInfoUrl() {
        String format = String.format(url, Arrays.copyOf(new Object[]{getLocaleString(C47748qv2.f106064b.m16784a())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }

    public final String getLabel(Resources resources) {
        int i;
        String replace$default;
        String replace$default2;
        String replace$default3;
        Intrinsics.checkNotNullParameter(resources, "resources");
        String lowerCase = this.amount.getCurrencyCode().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (Intrinsics.areEqual(lowerCase, Source.EURO)) {
            i = 3;
        } else {
            i = 4;
        }
        String string = resources.getString(C19369R.string.afterpay_clearpay_message);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …learpay_message\n        )");
        replace$default = StringsKt__StringsJVMKt.replace$default(string, "<num_installments/>", String.valueOf(i), false, 4, (Object) null);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "<installment_price/>", CurrencyFormatter.format$default(CurrencyFormatter.INSTANCE, this.amount.getValue() / i, this.amount.getCurrencyCode(), (Locale) null, 4, (Object) null), false, 4, (Object) null);
        String infoUrl = getInfoUrl();
        replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, "<img/>", "<img/> <a href=\"" + infoUrl + "\"><b>ⓘ</b></a>", false, 4, (Object) null);
        return replace$default3;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public int hashCode() {
        return (((getIdentifier().hashCode() * 31) + this.amount.hashCode()) * 31) + (getController() == null ? 0 : getController().hashCode());
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        Amount amount = this.amount;
        Controller controller = getController();
        return "AfterpayClearpayHeaderElement(identifier=" + identifier + ", amount=" + amount + ", controller=" + controller + ")";
    }

    public /* synthetic */ AfterpayClearpayHeaderElement(IdentifierSpec identifierSpec, Amount amount, Controller controller, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, amount, (i & 4) != 0 ? null : controller);
    }
}
