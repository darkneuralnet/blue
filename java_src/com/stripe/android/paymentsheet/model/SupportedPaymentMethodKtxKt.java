package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.elements.LayoutFormDescriptor;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.forms.Delayed;
import com.stripe.android.paymentsheet.forms.PIRequirement;
import com.stripe.android.paymentsheet.forms.SIRequirement;
import com.stripe.android.paymentsheet.forms.ShippingAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0005\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\"\u0010\f\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\u001e\u0010\u0016\u001a\u00020\u0017*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a \u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u001e\u0010\u0019\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\u001e\u0010\u001a\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\u001e\u0010\u001b\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\u0016\u0010\u001c\u001a\u00020\u0001*\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001d"}, m28432d2 = {"containsValidShippingInfo", "", "Lcom/stripe/android/model/PaymentIntent;", "getContainsValidShippingInfo", "(Lcom/stripe/android/model/PaymentIntent;)Z", "checkPaymentIntentRequirements", "requirements", "", "Lcom/stripe/android/paymentsheet/forms/PIRequirement;", "paymentIntent", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "checkSetupIntentRequirements", "Lcom/stripe/android/paymentsheet/forms/SIRequirement;", "getPMsToAdd", "", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "lpmRepository", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "getSupportedSavedCustomerPMs", "getPMAddForm", "Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;", "getSpecWithFullfilledRequirements", "supportsPaymentIntentSfuNotSettable", "supportsPaymentIntentSfuSet", "supportsPaymentIntentSfuSettable", "supportsSetupIntent", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSupportedPaymentMethodKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethodKtx.kt\ncom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1549#2:218\n1620#2,3:219\n1549#2:222\n1620#2,3:223\n1603#2,9:226\n1855#2:235\n1856#2:237\n1612#2:238\n766#2:239\n857#2,2:240\n1603#2,9:242\n1855#2:251\n1856#2:253\n1612#2:254\n766#2:255\n857#2,2:256\n819#2:258\n847#2,2:259\n1#3:236\n1#3:252\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethodKtx.kt\ncom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt\n*L\n149#1:218\n149#1:219,3\n164#1:222\n164#1:223,3\n191#1:226,9\n191#1:235\n191#1:237\n191#1:238\n193#1:239\n193#1:240,2\n206#1:242,9\n206#1:251\n206#1:253\n206#1:254\n208#1:255\n208#1:256,2\n213#1:258\n213#1:259,2\n191#1:236\n206#1:252\n*E\n"})
/* loaded from: classes7.dex */
public final class SupportedPaymentMethodKtxKt {
    private static final boolean checkPaymentIntentRequirements(Set<? extends PIRequirement> set, PaymentIntent paymentIntent, PaymentSheet.Configuration configuration) {
        int collectionSizeOrDefault;
        boolean z;
        if (set == null) {
            return false;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = set.iterator();
        while (true) {
            boolean z2 = true;
            if (it.hasNext()) {
                PIRequirement pIRequirement = (PIRequirement) it.next();
                if (Intrinsics.areEqual(pIRequirement, Delayed.INSTANCE)) {
                    if (configuration != null && configuration.getAllowsDelayedPaymentMethods()) {
                    }
                    z2 = false;
                } else if (Intrinsics.areEqual(pIRequirement, ShippingAddress.INSTANCE)) {
                    if (configuration != null && configuration.getAllowsPaymentMethodsRequiringShippingAddress()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!getContainsValidShippingInfo(paymentIntent)) {
                        if (z) {
                        }
                        z2 = false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(Boolean.valueOf(z2));
            } else if (arrayList.contains(Boolean.FALSE)) {
                return false;
            } else {
                return true;
            }
        }
    }

    private static final boolean checkSetupIntentRequirements(Set<? extends SIRequirement> set, PaymentSheet.Configuration configuration) {
        int collectionSizeOrDefault;
        if (set == null) {
            return false;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = set.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                if (Intrinsics.areEqual((SIRequirement) it.next(), Delayed.INSTANCE)) {
                    if (configuration == null || !configuration.getAllowsDelayedPaymentMethods()) {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (arrayList.contains(Boolean.FALSE)) {
                return false;
            } else {
                return true;
            }
        }
    }

    private static final boolean getContainsValidShippingInfo(PaymentIntent paymentIntent) {
        String str;
        String str2;
        String str3;
        Address address;
        Address address2;
        Address address3;
        PaymentIntent.Shipping shipping = paymentIntent.getShipping();
        String str4 = null;
        if (shipping != null) {
            str = shipping.getName();
        } else {
            str = null;
        }
        if (str != null) {
            PaymentIntent.Shipping shipping2 = paymentIntent.getShipping();
            if (shipping2 != null && (address3 = shipping2.getAddress()) != null) {
                str2 = address3.getLine1();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                PaymentIntent.Shipping shipping3 = paymentIntent.getShipping();
                if (shipping3 != null && (address2 = shipping3.getAddress()) != null) {
                    str3 = address2.getCountry();
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    PaymentIntent.Shipping shipping4 = paymentIntent.getShipping();
                    if (shipping4 != null && (address = shipping4.getAddress()) != null) {
                        str4 = address.getPostalCode();
                    }
                    if (str4 != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final LayoutFormDescriptor getPMAddForm(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, StripeIntent stripeIntent, PaymentSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(supportedPaymentMethod, "<this>");
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        LayoutFormDescriptor specWithFullfilledRequirements = getSpecWithFullfilledRequirements(supportedPaymentMethod, stripeIntent, configuration);
        if (specWithFullfilledRequirements != null) {
            return specWithFullfilledRequirements;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final List<LpmRepository.SupportedPaymentMethod> getPMsToAdd(StripeIntent stripeIntent, PaymentSheet.Configuration configuration, LpmRepository lpmRepository) {
        List<LpmRepository.SupportedPaymentMethod> emptyList;
        List<String> paymentMethodTypes;
        boolean z;
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        if (stripeIntent != null && (paymentMethodTypes = stripeIntent.getPaymentMethodTypes()) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : paymentMethodTypes) {
                LpmRepository.SupportedPaymentMethod fromCode = lpmRepository.fromCode(str);
                if (fromCode != null) {
                    arrayList.add(fromCode);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (getSpecWithFullfilledRequirements((LpmRepository.SupportedPaymentMethod) next, stripeIntent, configuration) == null) {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                LpmRepository.SupportedPaymentMethod supportedPaymentMethod = (LpmRepository.SupportedPaymentMethod) obj;
                if (stripeIntent.isLiveMode() && stripeIntent.getUnactivatedPaymentMethods().contains(supportedPaymentMethod.getCode())) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList3.add(obj);
                }
            }
            return arrayList3;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (supportsPaymentIntentSfuSet(r6, r7, r8) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (supportsSetupIntent(r6, r8) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LayoutFormDescriptor getSpecWithFullfilledRequirements(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, StripeIntent stripeIntent, PaymentSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(supportedPaymentMethod, "<this>");
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        LayoutSpec formSpec = supportedPaymentMethod.getFormSpec();
        LayoutFormDescriptor layoutFormDescriptor = new LayoutFormDescriptor(formSpec, false, false);
        LayoutFormDescriptor layoutFormDescriptor2 = new LayoutFormDescriptor(formSpec, false, true);
        LayoutFormDescriptor layoutFormDescriptor3 = new LayoutFormDescriptor(formSpec, true, false);
        if (!stripeIntent.getPaymentMethodTypes().contains(supportedPaymentMethod.getCode())) {
            return null;
        }
        if (stripeIntent instanceof PaymentIntent) {
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            if (!paymentIntent.isLpmLevelSetupFutureUsageSet(supportedPaymentMethod.getCode())) {
                if (supportsPaymentIntentSfuSettable(supportedPaymentMethod, paymentIntent, configuration)) {
                    return layoutFormDescriptor3;
                }
                if (supportsPaymentIntentSfuNotSettable(supportedPaymentMethod, paymentIntent, configuration)) {
                    return layoutFormDescriptor;
                }
            }
            return null;
        } else if (!(stripeIntent instanceof SetupIntent)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final List<LpmRepository.SupportedPaymentMethod> getSupportedSavedCustomerPMs(StripeIntent stripeIntent, PaymentSheet.Configuration configuration, LpmRepository lpmRepository) {
        List<LpmRepository.SupportedPaymentMethod> emptyList;
        List<String> paymentMethodTypes;
        boolean z;
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        if (stripeIntent != null && (paymentMethodTypes = stripeIntent.getPaymentMethodTypes()) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : paymentMethodTypes) {
                LpmRepository.SupportedPaymentMethod fromCode = lpmRepository.fromCode(str);
                if (fromCode != null) {
                    arrayList.add(fromCode);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                LpmRepository.SupportedPaymentMethod supportedPaymentMethod = (LpmRepository.SupportedPaymentMethod) obj;
                if (supportedPaymentMethod.supportsCustomerSavedPM() && getSpecWithFullfilledRequirements(supportedPaymentMethod, stripeIntent, configuration) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    private static final boolean supportsPaymentIntentSfuNotSettable(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, PaymentIntent paymentIntent, PaymentSheet.Configuration configuration) {
        return checkPaymentIntentRequirements(supportedPaymentMethod.getRequirement().getPiRequirements(), paymentIntent, configuration);
    }

    private static final boolean supportsPaymentIntentSfuSet(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, PaymentIntent paymentIntent, PaymentSheet.Configuration configuration) {
        if (supportedPaymentMethod.getRequirement().getConfirmPMFromCustomer(supportedPaymentMethod.getCode()) && checkSetupIntentRequirements(supportedPaymentMethod.getRequirement().getSiRequirements(), configuration) && checkPaymentIntentRequirements(supportedPaymentMethod.getRequirement().getPiRequirements(), paymentIntent, configuration)) {
            return true;
        }
        return false;
    }

    private static final boolean supportsPaymentIntentSfuSettable(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, PaymentIntent paymentIntent, PaymentSheet.Configuration configuration) {
        PaymentSheet.CustomerConfiguration customerConfiguration;
        if (configuration != null) {
            customerConfiguration = configuration.getCustomer();
        } else {
            customerConfiguration = null;
        }
        if (customerConfiguration != null && supportedPaymentMethod.getRequirement().getConfirmPMFromCustomer(supportedPaymentMethod.getCode()) && checkPaymentIntentRequirements(supportedPaymentMethod.getRequirement().getPiRequirements(), paymentIntent, configuration) && checkSetupIntentRequirements(supportedPaymentMethod.getRequirement().getSiRequirements(), configuration)) {
            return true;
        }
        return false;
    }

    private static final boolean supportsSetupIntent(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, PaymentSheet.Configuration configuration) {
        if (supportedPaymentMethod.getRequirement().getConfirmPMFromCustomer(supportedPaymentMethod.getCode()) && checkSetupIntentRequirements(supportedPaymentMethod.getRequirement().getSiRequirements(), configuration)) {
            return true;
        }
        return false;
    }
}
