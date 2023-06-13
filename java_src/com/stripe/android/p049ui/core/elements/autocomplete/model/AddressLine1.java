package com.stripe.android.p049ui.core.elements.autocomplete.model;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;", "", "streetNumber", "", "route", "subLocalityLevel2", "subLocalityLevel3", "subLocalityLevel4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "setRoute", "(Ljava/lang/String;)V", "getStreetNumber", "setStreetNumber", "getSubLocalityLevel2", "setSubLocalityLevel2", "getSubLocalityLevel3", "setSubLocalityLevel3", "getSubLocalityLevel4", "setSubLocalityLevel4", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.AddressLine1 */
/* loaded from: classes7.dex */
public final class AddressLine1 {
    private String route;
    private String streetNumber;
    private String subLocalityLevel2;
    private String subLocalityLevel3;
    private String subLocalityLevel4;

    public AddressLine1() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AddressLine1 copy$default(AddressLine1 addressLine1, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressLine1.streetNumber;
        }
        if ((i & 2) != 0) {
            str2 = addressLine1.route;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = addressLine1.subLocalityLevel2;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = addressLine1.subLocalityLevel3;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = addressLine1.subLocalityLevel4;
        }
        return addressLine1.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.streetNumber;
    }

    public final String component2() {
        return this.route;
    }

    public final String component3() {
        return this.subLocalityLevel2;
    }

    public final String component4() {
        return this.subLocalityLevel3;
    }

    public final String component5() {
        return this.subLocalityLevel4;
    }

    public final AddressLine1 copy(String str, String str2, String str3, String str4, String str5) {
        return new AddressLine1(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressLine1) {
            AddressLine1 addressLine1 = (AddressLine1) obj;
            return Intrinsics.areEqual(this.streetNumber, addressLine1.streetNumber) && Intrinsics.areEqual(this.route, addressLine1.route) && Intrinsics.areEqual(this.subLocalityLevel2, addressLine1.subLocalityLevel2) && Intrinsics.areEqual(this.subLocalityLevel3, addressLine1.subLocalityLevel3) && Intrinsics.areEqual(this.subLocalityLevel4, addressLine1.subLocalityLevel4);
        }
        return false;
    }

    public final String getRoute() {
        return this.route;
    }

    public final String getStreetNumber() {
        return this.streetNumber;
    }

    public final String getSubLocalityLevel2() {
        return this.subLocalityLevel2;
    }

    public final String getSubLocalityLevel3() {
        return this.subLocalityLevel3;
    }

    public final String getSubLocalityLevel4() {
        return this.subLocalityLevel4;
    }

    public int hashCode() {
        String str = this.streetNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.route;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subLocalityLevel2;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subLocalityLevel3;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subLocalityLevel4;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setRoute(String str) {
        this.route = str;
    }

    public final void setStreetNumber(String str) {
        this.streetNumber = str;
    }

    public final void setSubLocalityLevel2(String str) {
        this.subLocalityLevel2 = str;
    }

    public final void setSubLocalityLevel3(String str) {
        this.subLocalityLevel3 = str;
    }

    public final void setSubLocalityLevel4(String str) {
        this.subLocalityLevel4 = str;
    }

    public String toString() {
        String str = this.streetNumber;
        String str2 = this.route;
        String str3 = this.subLocalityLevel2;
        String str4 = this.subLocalityLevel3;
        String str5 = this.subLocalityLevel4;
        return "AddressLine1(streetNumber=" + str + ", route=" + str2 + ", subLocalityLevel2=" + str3 + ", subLocalityLevel3=" + str4 + ", subLocalityLevel4=" + str5 + ")";
    }

    public AddressLine1(String str, String str2, String str3, String str4, String str5) {
        this.streetNumber = str;
        this.route = str2;
        this.subLocalityLevel2 = str3;
        this.subLocalityLevel3 = str4;
        this.subLocalityLevel4 = str5;
    }

    public /* synthetic */ AddressLine1(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
