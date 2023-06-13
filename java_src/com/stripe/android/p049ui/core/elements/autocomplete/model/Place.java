package com.stripe.android.p049ui.core.elements.autocomplete.model;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0003! \"B\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB-\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u001b\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "component1", "addressComponents", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "getAddressComponents", "()Ljava/util/List;", "getAddressComponents$annotations", "()V", "<init>", "(Ljava/util/List;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/util/List;Lbt5;)V", "Companion", "$serializer", "Type", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.Place */
/* loaded from: classes7.dex */
public final class Place {
    private final List<AddressComponent> addressComponents;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.Place$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<Place> serializer() {
            return Place$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADMINISTRATIVE_AREA_LEVEL_1", "ADMINISTRATIVE_AREA_LEVEL_2", "ADMINISTRATIVE_AREA_LEVEL_3", "ADMINISTRATIVE_AREA_LEVEL_4", "COUNTRY", "LOCALITY", "NEIGHBORHOOD", "POSTAL_TOWN", "POSTAL_CODE", "PREMISE", "ROUTE", "STREET_NUMBER", "SUBLOCALITY", "SUBLOCALITY_LEVEL_1", "SUBLOCALITY_LEVEL_2", "SUBLOCALITY_LEVEL_3", "SUBLOCALITY_LEVEL_4", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.Place$Type */
    /* loaded from: classes7.dex */
    public enum Type {
        ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),
        ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),
        ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),
        ADMINISTRATIVE_AREA_LEVEL_4("administrative_area_level_4"),
        COUNTRY("country"),
        LOCALITY("locality"),
        NEIGHBORHOOD("neighborhood"),
        POSTAL_TOWN("postal_town"),
        POSTAL_CODE("postal_code"),
        PREMISE("premise"),
        ROUTE("route"),
        STREET_NUMBER("street_number"),
        SUBLOCALITY("sublocality"),
        SUBLOCALITY_LEVEL_1("sublocality_level_1"),
        SUBLOCALITY_LEVEL_2("sublocality_level_2"),
        SUBLOCALITY_LEVEL_3("sublocality_level_3"),
        SUBLOCALITY_LEVEL_4("sublocality_level_4");
        
        private final String value;

        Type(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Place(int i, @InterfaceC36694Vs5("address_components") List list, C38819bt5 c38819bt5) {
        if (1 != (i & 1)) {
            C52838zW3.m1275b(i, 1, Place$$serializer.INSTANCE.getDescriptor());
        }
        this.addressComponents = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Place copy$default(Place place, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = place.addressComponents;
        }
        return place.copy(list);
    }

    @InterfaceC36694Vs5("address_components")
    public static /* synthetic */ void getAddressComponents$annotations() {
    }

    @JvmStatic
    public static final void write$Self(Place self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1173E(serialDesc, 0, new C27999ro(AddressComponent$$serializer.INSTANCE), self.addressComponents);
    }

    public final List<AddressComponent> component1() {
        return this.addressComponents;
    }

    public final Place copy(List<AddressComponent> list) {
        return new Place(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Place) && Intrinsics.areEqual(this.addressComponents, ((Place) obj).addressComponents);
    }

    public final List<AddressComponent> getAddressComponents() {
        return this.addressComponents;
    }

    public int hashCode() {
        List<AddressComponent> list = this.addressComponents;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<AddressComponent> list = this.addressComponents;
        return "Place(addressComponents=" + list + ")";
    }

    public Place(List<AddressComponent> list) {
        this.addressComponents = list;
    }
}
