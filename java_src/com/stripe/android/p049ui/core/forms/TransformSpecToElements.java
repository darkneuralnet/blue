package com.stripe.android.p049ui.core.forms;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.elements.AddressSpec;
import com.stripe.android.p049ui.core.elements.AffirmTextSpec;
import com.stripe.android.p049ui.core.elements.AfterpayClearpayTextSpec;
import com.stripe.android.p049ui.core.elements.AuBankAccountNumberSpec;
import com.stripe.android.p049ui.core.elements.AuBecsDebitMandateTextSpec;
import com.stripe.android.p049ui.core.elements.BsbSpec;
import com.stripe.android.p049ui.core.elements.CardBillingSpec;
import com.stripe.android.p049ui.core.elements.CardDetailsSectionSpec;
import com.stripe.android.p049ui.core.elements.CountrySpec;
import com.stripe.android.p049ui.core.elements.DropdownSpec;
import com.stripe.android.p049ui.core.elements.EmailSpec;
import com.stripe.android.p049ui.core.elements.EmptyFormElement;
import com.stripe.android.p049ui.core.elements.EmptyFormSpec;
import com.stripe.android.p049ui.core.elements.FormItemSpec;
import com.stripe.android.p049ui.core.elements.IbanSpec;
import com.stripe.android.p049ui.core.elements.KlarnaCountrySpec;
import com.stripe.android.p049ui.core.elements.KlarnaHeaderStaticTextSpec;
import com.stripe.android.p049ui.core.elements.MandateTextSpec;
import com.stripe.android.p049ui.core.elements.NameSpec;
import com.stripe.android.p049ui.core.elements.OTPSpec;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseSpec;
import com.stripe.android.p049ui.core.elements.SepaMandateTextSpec;
import com.stripe.android.p049ui.core.elements.SimpleTextSpec;
import com.stripe.android.p049ui.core.elements.StaticTextSpec;
import com.stripe.android.p049ui.core.elements.UpiSpec;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/TransformSpecToElements;", "", "addressRepository", "Lcom/stripe/android/uicore/address/AddressRepository;", NamedConstantsKt.INITIAL_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.SHIPPING_VALUES, "amount", "Lcom/stripe/android/ui/core/Amount;", "saveForFutureUseInitialValue", "", "merchantName", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "viewOnlyFields", "", "(Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Ljava/util/Map;Lcom/stripe/android/ui/core/Amount;ZLjava/lang/String;Landroid/content/Context;Ljava/util/Set;)V", "transform", "", "Lcom/stripe/android/uicore/elements/FormElement;", "list", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nTransformSpecToElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformSpecToElements.kt\ncom/stripe/android/ui/core/forms/TransformSpecToElements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n1#3:100\n*S KotlinDebug\n*F\n+ 1 TransformSpecToElements.kt\ncom/stripe/android/ui/core/forms/TransformSpecToElements\n*L\n56#1:96\n56#1:97,3\n*E\n"})
/* renamed from: com.stripe.android.ui.core.forms.TransformSpecToElements */
/* loaded from: classes7.dex */
public final class TransformSpecToElements {
    public static final int $stable = 8;
    private final AddressRepository addressRepository;
    private final Amount amount;
    private final Context context;
    private final Map<IdentifierSpec, String> initialValues;
    private final String merchantName;
    private final boolean saveForFutureUseInitialValue;
    private final Map<IdentifierSpec, String> shippingValues;
    private final Set<IdentifierSpec> viewOnlyFields;

    public TransformSpecToElements(AddressRepository addressRepository, Map<IdentifierSpec, String> initialValues, Map<IdentifierSpec, String> map, Amount amount, boolean z, String merchantName, Context context, Set<IdentifierSpec> viewOnlyFields) {
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewOnlyFields, "viewOnlyFields");
        this.addressRepository = addressRepository;
        this.initialValues = initialValues;
        this.shippingValues = map;
        this.amount = amount;
        this.saveForFutureUseInitialValue = z;
        this.merchantName = merchantName;
        this.context = context;
        this.viewOnlyFields = viewOnlyFields;
    }

    public final List<FormElement> transform(List<? extends FormItemSpec> list) {
        int collectionSizeOrDefault;
        List<FormElement> listOf;
        FormElement transform;
        Intrinsics.checkNotNullParameter(list, "list");
        List<? extends FormItemSpec> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list2.iterator();
        while (true) {
            String str = null;
            if (it.hasNext()) {
                FormItemSpec formItemSpec = (FormItemSpec) it.next();
                if (formItemSpec instanceof SaveForFutureUseSpec) {
                    transform = ((SaveForFutureUseSpec) formItemSpec).transform(this.saveForFutureUseInitialValue, this.merchantName);
                } else if (formItemSpec instanceof StaticTextSpec) {
                    transform = ((StaticTextSpec) formItemSpec).transform();
                } else if (formItemSpec instanceof AfterpayClearpayTextSpec) {
                    AfterpayClearpayTextSpec afterpayClearpayTextSpec = (AfterpayClearpayTextSpec) formItemSpec;
                    Amount amount = this.amount;
                    if (amount != null) {
                        transform = afterpayClearpayTextSpec.transform(amount);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (formItemSpec instanceof AffirmTextSpec) {
                    transform = ((AffirmTextSpec) formItemSpec).transform();
                } else if (formItemSpec instanceof EmptyFormSpec) {
                    transform = new EmptyFormElement(null, null, 3, null);
                } else if (formItemSpec instanceof MandateTextSpec) {
                    transform = ((MandateTextSpec) formItemSpec).transform(this.merchantName);
                } else if (formItemSpec instanceof AuBecsDebitMandateTextSpec) {
                    transform = ((AuBecsDebitMandateTextSpec) formItemSpec).transform(this.merchantName);
                } else if (formItemSpec instanceof CardDetailsSectionSpec) {
                    transform = ((CardDetailsSectionSpec) formItemSpec).transform(this.context, this.initialValues, this.viewOnlyFields);
                } else if (formItemSpec instanceof BsbSpec) {
                    transform = ((BsbSpec) formItemSpec).transform(this.initialValues);
                } else if (formItemSpec instanceof OTPSpec) {
                    transform = ((OTPSpec) formItemSpec).transform();
                } else if (formItemSpec instanceof NameSpec) {
                    transform = ((NameSpec) formItemSpec).transform(this.initialValues);
                } else if (formItemSpec instanceof EmailSpec) {
                    transform = ((EmailSpec) formItemSpec).transform(this.initialValues);
                } else if (formItemSpec instanceof SimpleTextSpec) {
                    transform = ((SimpleTextSpec) formItemSpec).transform(this.initialValues);
                } else if (formItemSpec instanceof AuBankAccountNumberSpec) {
                    transform = ((AuBankAccountNumberSpec) formItemSpec).transform(this.initialValues);
                } else if (formItemSpec instanceof IbanSpec) {
                    transform = ((IbanSpec) formItemSpec).transform(this.initialValues);
                } else if (formItemSpec instanceof KlarnaHeaderStaticTextSpec) {
                    transform = ((KlarnaHeaderStaticTextSpec) formItemSpec).transform();
                } else if (formItemSpec instanceof KlarnaCountrySpec) {
                    KlarnaCountrySpec klarnaCountrySpec = (KlarnaCountrySpec) formItemSpec;
                    Amount amount2 = this.amount;
                    if (amount2 != null) {
                        str = amount2.getCurrencyCode();
                    }
                    transform = klarnaCountrySpec.transform(str, this.initialValues);
                } else if (formItemSpec instanceof DropdownSpec) {
                    transform = ((DropdownSpec) formItemSpec).transform(this.initialValues);
                } else if (formItemSpec instanceof CountrySpec) {
                    transform = ((CountrySpec) formItemSpec).transform(this.initialValues);
                } else if (formItemSpec instanceof AddressSpec) {
                    transform = ((AddressSpec) formItemSpec).transform(this.initialValues, this.addressRepository, this.shippingValues);
                } else if (formItemSpec instanceof CardBillingSpec) {
                    transform = ((CardBillingSpec) formItemSpec).transform(this.initialValues, this.addressRepository, this.shippingValues);
                } else if (formItemSpec instanceof SepaMandateTextSpec) {
                    transform = ((SepaMandateTextSpec) formItemSpec).transform(this.merchantName);
                } else if (formItemSpec instanceof UpiSpec) {
                    transform = ((UpiSpec) formItemSpec).transform();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(transform);
            } else {
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    listOf = CollectionsKt__CollectionsJVMKt.listOf(new EmptyFormElement(null, null, 3, null));
                    return listOf;
                }
                return arrayList;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TransformSpecToElements(AddressRepository addressRepository, Map map, Map map2, Amount amount, boolean z, String str, Context context, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(addressRepository, map, map2, amount, z, str, context, r9);
        Set set2;
        Set emptySet;
        if ((i & 128) != 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            set2 = emptySet;
        } else {
            set2 = set;
        }
    }
}
