package com.stripe.android.p049ui.core.elements.autocomplete.model;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;", "", "locality", "", "country", "addressLine1", "addressLine2", "administrativeArea", "dependentLocality", "postalCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLine1", "()Ljava/lang/String;", "setAddressLine1", "(Ljava/lang/String;)V", "getAddressLine2", "setAddressLine2", "getAdministrativeArea", "setAdministrativeArea", "getCountry", "setCountry", "getDependentLocality", "setDependentLocality", "getLocality", "setLocality", "getPostalCode", "setPostalCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.Address */
/* loaded from: classes7.dex */
public final class Address {
    private String addressLine1;
    private String addressLine2;
    private String administrativeArea;
    private String country;
    private String dependentLocality;
    private String locality;
    private String postalCode;

    public Address() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.locality;
        }
        if ((i & 2) != 0) {
            str2 = address.country;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = address.addressLine1;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = address.addressLine2;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = address.administrativeArea;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = address.dependentLocality;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = address.postalCode;
        }
        return address.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.locality;
    }

    public final String component2() {
        return this.country;
    }

    public final String component3() {
        return this.addressLine1;
    }

    public final String component4() {
        return this.addressLine2;
    }

    public final String component5() {
        return this.administrativeArea;
    }

    public final String component6() {
        return this.dependentLocality;
    }

    public final String component7() {
        return this.postalCode;
    }

    public final Address copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new Address(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return Intrinsics.areEqual(this.locality, address.locality) && Intrinsics.areEqual(this.country, address.country) && Intrinsics.areEqual(this.addressLine1, address.addressLine1) && Intrinsics.areEqual(this.addressLine2, address.addressLine2) && Intrinsics.areEqual(this.administrativeArea, address.administrativeArea) && Intrinsics.areEqual(this.dependentLocality, address.dependentLocality) && Intrinsics.areEqual(this.postalCode, address.postalCode);
        }
        return false;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAdministrativeArea() {
        return this.administrativeArea;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDependentLocality() {
        return this.dependentLocality;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public int hashCode() {
        String str = this.locality;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.administrativeArea;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dependentLocality;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.postalCode;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAddressLine1(String str) {
        this.addressLine1 = str;
    }

    public final void setAddressLine2(String str) {
        this.addressLine2 = str;
    }

    public final void setAdministrativeArea(String str) {
        this.administrativeArea = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setDependentLocality(String str) {
        this.dependentLocality = str;
    }

    public final void setLocality(String str) {
        this.locality = str;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public String toString() {
        String str = this.locality;
        String str2 = this.country;
        String str3 = this.addressLine1;
        String str4 = this.addressLine2;
        String str5 = this.administrativeArea;
        String str6 = this.dependentLocality;
        String str7 = this.postalCode;
        return "Address(locality=" + str + ", country=" + str2 + ", addressLine1=" + str3 + ", addressLine2=" + str4 + ", administrativeArea=" + str5 + ", dependentLocality=" + str6 + ", postalCode=" + str7 + ")";
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.locality = str;
        this.country = str2;
        this.addressLine1 = str3;
        this.addressLine2 = str4;
        this.administrativeArea = str5;
        this.dependentLocality = str6;
        this.postalCode = str7;
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
