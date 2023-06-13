package com.stripe.android.uicore.address;

import com.stripe.android.uicore.elements.IsPlacesAvailable;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;", "", "autocompleteCountries", "", "", "getAutocompleteCountries", "()Ljava/util/Set;", "googleApiKey", "getGoogleApiKey", "()Ljava/lang/String;", "onNavigation", "Lkotlin/Function0;", "", "getOnNavigation", "()Lkotlin/jvm/functions/Function0;", "supportsAutoComplete", "", "country", "isPlacesAvailable", "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface AutocompleteCapableAddressType {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAutocompleteCapableAddressType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteCapableAddressType.kt\ncom/stripe/android/uicore/address/AutocompleteCapableAddressType$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 AutocompleteCapableAddressType.kt\ncom/stripe/android/uicore/address/AutocompleteCapableAddressType$DefaultImpls\n*L\n20#1:28\n20#1:29,3\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean supportsAutoComplete(AutocompleteCapableAddressType autocompleteCapableAddressType, String str, IsPlacesAvailable isPlacesAvailable) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean isBlank;
            int collectionSizeOrDefault;
            String str2;
            boolean contains;
            Intrinsics.checkNotNullParameter(isPlacesAvailable, "isPlacesAvailable");
            Set<String> autocompleteCountries = autocompleteCapableAddressType.getAutocompleteCountries();
            if (autocompleteCountries != null) {
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(autocompleteCountries, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (String str3 : autocompleteCountries) {
                    arrayList.add(XR5.m77009a(str3, C47748qv2.f106064b.m16784a()));
                }
                if (str != null) {
                    str2 = XR5.m77009a(str, C47748qv2.f106064b.m16784a());
                } else {
                    str2 = null;
                }
                contains = CollectionsKt___CollectionsKt.contains(arrayList, str2);
                if (contains) {
                    z = true;
                    if (isPlacesAvailable.invoke()) {
                        String googleApiKey = autocompleteCapableAddressType.getGoogleApiKey();
                        if (googleApiKey != null) {
                            isBlank = StringsKt__StringsJVMKt.isBlank(googleApiKey);
                            if (!isBlank) {
                                z3 = false;
                                if (!z3) {
                                    z2 = true;
                                    if (!z && z2) {
                                        return true;
                                    }
                                    return false;
                                }
                            }
                        }
                        z3 = true;
                        if (!z3) {
                        }
                    }
                    z2 = false;
                    if (!z) {
                    }
                    return false;
                }
            }
            z = false;
            if (isPlacesAvailable.invoke()) {
            }
            z2 = false;
            if (!z) {
            }
            return false;
        }
    }

    Set<String> getAutocompleteCountries();

    String getGoogleApiKey();

    Function0<Unit> getOnNavigation();

    boolean supportsAutoComplete(String str, IsPlacesAvailable isPlacesAvailable);
}
