package com.stripe.android.p049ui.core.elements.autocomplete.model;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Detail;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.p049ui.core.elements.autocomplete.model.Place;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000:\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a,\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\f\u0010\u000f\u001a\u00020\u000b*\u00020\u000bH\u0000\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0012H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0019"}, m28432d2 = {"STREET_NAME_FIRST_COUNTRIES", "", "", "getSTREET_NAME_FIRST_COUNTRIES", "()Ljava/util/List;", "composeAddressLine1", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "addressLine1", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;", "composeJapaneseAddressLine1", "localityComponent", "premiseComponent", "combineDependentLocalityWithLine2", "filter", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "type", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;", "modifyStripeAddressByCountry", "place", "transformGoogleToStripeAddress", "Lcom/stripe/android/model/Address;", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nTransformGoogleToStripeAddress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGoogleToStripeAddress.kt\ncom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1#2:263\n1855#3,2:264\n*S KotlinDebug\n*F\n+ 1 TransformGoogleToStripeAddress.kt\ncom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt\n*L\n187#1:264,2\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.TransformGoogleToStripeAddressKt */
/* loaded from: classes7.dex */
public final class TransformGoogleToStripeAddressKt {
    private static final List<String> STREET_NAME_FIRST_COUNTRIES;

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"BE", "BR", "CH", "ES", "ID", "IT", "MX", "NL", "NO", "PL", "RU", "SE"});
        STREET_NAME_FIRST_COUNTRIES = listOf;
    }

    public static final Address combineDependentLocalityWithLine2(Address address) {
        String dependentLocality;
        Intrinsics.checkNotNullParameter(address, "<this>");
        Address copy$default = Address.copy$default(address, null, null, null, null, null, null, null, 127, null);
        if (address.getDependentLocality() != null) {
            if (address.getAddressLine2() != null) {
                dependentLocality = address.getAddressLine2() + ", " + address.getDependentLocality();
            } else {
                dependentLocality = address.getDependentLocality();
            }
            copy$default.setAddressLine2(dependentLocality);
        }
        return copy$default;
    }

    public static final String composeAddressLine1(Context context, AddressLine1 addressLine1, Address address) {
        boolean isBlank;
        boolean contains;
        CharSequence trim;
        CharSequence trim2;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        Intrinsics.checkNotNullParameter(address, "address");
        String streetNumber = addressLine1.getStreetNumber();
        if (streetNumber == null) {
            streetNumber = "";
        }
        String route = addressLine1.getRoute();
        if (route == null) {
            route = "";
        }
        String locality = address.getLocality();
        String country = address.getCountry();
        if (Intrinsics.areEqual(country, "JP")) {
            return composeJapaneseAddressLine1(context, addressLine1, locality, address.getAddressLine2());
        }
        isBlank = StringsKt__StringsJVMKt.isBlank(streetNumber);
        if (!(!isBlank)) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(route);
            if (!(!isBlank2)) {
                return "";
            }
        }
        contains = CollectionsKt___CollectionsKt.contains(STREET_NAME_FIRST_COUNTRIES, country);
        if (contains) {
            trim2 = StringsKt__StringsKt.trim((CharSequence) (route + " " + streetNumber));
            return trim2.toString();
        }
        trim = StringsKt__StringsKt.trim((CharSequence) (streetNumber + " " + route));
        return trim.toString();
    }

    public static final String composeJapaneseAddressLine1(Context context, AddressLine1 addressLine1, String str, String str2) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        if (addressLine1.getSubLocalityLevel2() != null && addressLine1.getSubLocalityLevel3() != null && addressLine1.getSubLocalityLevel4() != null) {
            z = true;
        } else {
            z = false;
        }
        String subLocalityLevel3 = addressLine1.getSubLocalityLevel3();
        String subLocalityLevel4 = addressLine1.getSubLocalityLevel4();
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        String subLocalityLevel2 = addressLine1.getSubLocalityLevel2();
        if (Intrinsics.areEqual(context.getResources().getConfiguration().getLocales().get(0), Locale.JAPANESE)) {
            if (z) {
                str3 = subLocalityLevel3 + subLocalityLevel4 + Detail.EMPTY_CHAR + str2;
            }
            return str + subLocalityLevel2 + str3;
        }
        if (z) {
            str3 = subLocalityLevel3 + Detail.EMPTY_CHAR + subLocalityLevel4 + Detail.EMPTY_CHAR + str2;
        }
        return str3 + " " + subLocalityLevel2 + " " + str;
    }

    public static final AddressComponent filter(Place place, Place.Type type) {
        Intrinsics.checkNotNullParameter(place, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List<AddressComponent> addressComponents = place.getAddressComponents();
        Object obj = null;
        if (addressComponents == null) {
            return null;
        }
        Iterator<T> it = addressComponents.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AddressComponent) next).getTypes().contains(type.getValue())) {
                obj = next;
                break;
            }
        }
        return (AddressComponent) obj;
    }

    public static final List<String> getSTREET_NAME_FIRST_COUNTRIES() {
        return STREET_NAME_FIRST_COUNTRIES;
    }

    public static final Address modifyStripeAddressByCountry(Address address, Place place) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(address, "<this>");
        Intrinsics.checkNotNullParameter(place, "place");
        AddressComponent filter = filter(place, Place.Type.ADMINISTRATIVE_AREA_LEVEL_2);
        if (filter != null) {
            str = filter.getShortName();
        } else {
            str = null;
        }
        AddressComponent filter2 = filter(place, Place.Type.ADMINISTRATIVE_AREA_LEVEL_1);
        if (filter2 != null) {
            str2 = filter2.getLongName();
        } else {
            str2 = null;
        }
        Address copy$default = Address.copy$default(address, null, null, null, null, null, null, null, 127, null);
        String country = address.getCountry();
        if (country != null) {
            int hashCode = country.hashCode();
            if (hashCode != 2128) {
                if (hashCode != 2222) {
                    if (hashCode != 2332) {
                        if (hashCode != 2347) {
                            if (hashCode != 2374) {
                                if (hashCode != 2552) {
                                    if (hashCode != 2686) {
                                        if (hashCode != 2855) {
                                            if (hashCode != 2475) {
                                                if (hashCode != 2476 || !country.equals("MY")) {
                                                    return copy$default;
                                                }
                                            } else if (!country.equals("MX")) {
                                                return copy$default;
                                            }
                                        } else if (!country.equals("ZA")) {
                                            return copy$default;
                                        }
                                    } else if (!country.equals("TR")) {
                                        return copy$default;
                                    }
                                } else if (!country.equals("PH")) {
                                    return copy$default;
                                }
                                return combineDependentLocalityWithLine2(copy$default);
                            } else if (country.equals("JP")) {
                                copy$default.setAddressLine2(null);
                                return copy$default;
                            } else {
                                return copy$default;
                            }
                        } else if (!country.equals("IT")) {
                            return copy$default;
                        }
                    } else if (country.equals("IE") && str2 != null) {
                        copy$default.setAdministrativeArea(str2);
                        return combineDependentLocalityWithLine2(copy$default);
                    } else {
                        return copy$default;
                    }
                } else if (!country.equals("ES")) {
                    return copy$default;
                }
                if (str != null) {
                    copy$default.setAdministrativeArea(str);
                    return copy$default;
                }
                return copy$default;
            } else if (!country.equals("BR")) {
                return copy$default;
            }
            if (address.getLocality() == null && str != null) {
                copy$default.setLocality(str);
            }
            return combineDependentLocalityWithLine2(copy$default);
        }
        return copy$default;
    }

    public static final Address transformGoogleToStripeAddress(Place place, Context context) {
        boolean areEqual;
        Intrinsics.checkNotNullParameter(place, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Address address = new Address(null, null, null, null, null, null, null, 127, null);
        AddressLine1 addressLine1 = new AddressLine1(null, null, null, null, null, 31, null);
        List<AddressComponent> addressComponents = place.getAddressComponents();
        if (addressComponents != null) {
            for (AddressComponent addressComponent : addressComponents) {
                String str = addressComponent.getTypes().get(0);
                if (Intrinsics.areEqual(str, Place.Type.STREET_NUMBER.getValue())) {
                    addressLine1.setStreetNumber(addressComponent.getLongName());
                } else if (Intrinsics.areEqual(str, Place.Type.ROUTE.getValue())) {
                    addressLine1.setRoute(addressComponent.getLongName());
                } else if (Intrinsics.areEqual(str, Place.Type.PREMISE.getValue())) {
                    address.setAddressLine2(addressComponent.getLongName());
                } else {
                    boolean z = true;
                    if (Intrinsics.areEqual(str, Place.Type.LOCALITY.getValue())) {
                        areEqual = true;
                    } else {
                        areEqual = Intrinsics.areEqual(str, Place.Type.SUBLOCALITY.getValue());
                    }
                    if (!areEqual) {
                        z = Intrinsics.areEqual(str, Place.Type.POSTAL_TOWN.getValue());
                    }
                    if (z) {
                        address.setLocality(addressComponent.getLongName());
                    } else if (Intrinsics.areEqual(str, Place.Type.ADMINISTRATIVE_AREA_LEVEL_1.getValue())) {
                        address.setAdministrativeArea(addressComponent.getShortName());
                    } else if (Intrinsics.areEqual(str, Place.Type.ADMINISTRATIVE_AREA_LEVEL_3.getValue())) {
                        if (address.getLocality() == null) {
                            address.setLocality(addressComponent.getLongName());
                        }
                    } else if (Intrinsics.areEqual(str, Place.Type.ADMINISTRATIVE_AREA_LEVEL_2.getValue())) {
                        if (address.getAdministrativeArea() == null && address.getDependentLocality() == null) {
                            address.setDependentLocality(addressComponent.getLongName());
                        } else {
                            address.setAdministrativeArea(addressComponent.getShortName());
                        }
                    } else if (Intrinsics.areEqual(str, Place.Type.NEIGHBORHOOD.getValue())) {
                        if (address.getLocality() == null) {
                            address.setLocality(addressComponent.getLongName());
                        } else {
                            address.setDependentLocality(addressComponent.getLongName());
                        }
                    } else if (Intrinsics.areEqual(str, Place.Type.POSTAL_CODE.getValue())) {
                        address.setPostalCode(addressComponent.getLongName());
                    } else if (Intrinsics.areEqual(str, Place.Type.COUNTRY.getValue())) {
                        address.setCountry(addressComponent.getShortName());
                    } else if (Intrinsics.areEqual(str, Place.Type.SUBLOCALITY_LEVEL_1.getValue())) {
                        if (address.getLocality() == null) {
                            address.setDependentLocality(addressComponent.getLongName());
                        } else {
                            address.setLocality(addressComponent.getLongName());
                        }
                    } else if (Intrinsics.areEqual(str, Place.Type.SUBLOCALITY_LEVEL_2.getValue())) {
                        addressLine1.setSubLocalityLevel2(addressComponent.getLongName());
                    } else if (Intrinsics.areEqual(str, Place.Type.SUBLOCALITY_LEVEL_3.getValue())) {
                        addressLine1.setSubLocalityLevel3(addressComponent.getLongName());
                    } else if (Intrinsics.areEqual(str, Place.Type.SUBLOCALITY_LEVEL_4.getValue())) {
                        addressLine1.setSubLocalityLevel4(addressComponent.getLongName());
                    }
                }
            }
        }
        address.setAddressLine1(composeAddressLine1(context, addressLine1, address));
        Address modifyStripeAddressByCountry = modifyStripeAddressByCountry(address, place);
        return new Address.Builder().setLine1(modifyStripeAddressByCountry.getAddressLine1()).setLine2(modifyStripeAddressByCountry.getAddressLine2()).setCity(modifyStripeAddressByCountry.getLocality()).setState(modifyStripeAddressByCountry.getAdministrativeArea()).setCountry(modifyStripeAddressByCountry.getCountry()).setPostalCode(modifyStripeAddressByCountry.getPostalCode()).build();
    }
}
