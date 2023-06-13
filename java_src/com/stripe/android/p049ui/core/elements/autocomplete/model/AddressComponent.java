package com.stripe.android.p049ui.core.elements.autocomplete.model;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.p049ui.core.elements.autocomplete.model.Place;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B'\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b&\u0010'BE\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010HÆ\u0003J/\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0010HÆ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001dR&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u0012\u0004\b%\u0010\u001f\u001a\u0004\b#\u0010$¨\u0006."}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;", "type", "", "contains", "", "component1", "component2", "", "component3", "shortName", "longName", "types", "copy", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getShortName", "()Ljava/lang/String;", "getShortName$annotations", "()V", "getLongName", "getLongName$annotations", "Ljava/util/List;", "getTypes", "()Ljava/util/List;", "getTypes$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.AddressComponent */
/* loaded from: classes7.dex */
public final class AddressComponent {
    private final String longName;
    private final String shortName;
    private final List<String> types;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.AddressComponent$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<AddressComponent> serializer() {
            return AddressComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AddressComponent(int i, @InterfaceC36694Vs5("short_name") String str, @InterfaceC36694Vs5("long_name") String str2, @InterfaceC36694Vs5("types") List list, C38819bt5 c38819bt5) {
        if (7 != (i & 7)) {
            C52838zW3.m1275b(i, 7, AddressComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.shortName = str;
        this.longName = str2;
        this.types = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressComponent copy$default(AddressComponent addressComponent, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressComponent.shortName;
        }
        if ((i & 2) != 0) {
            str2 = addressComponent.longName;
        }
        if ((i & 4) != 0) {
            list = addressComponent.types;
        }
        return addressComponent.copy(str, str2, list);
    }

    @InterfaceC36694Vs5("long_name")
    public static /* synthetic */ void getLongName$annotations() {
    }

    @InterfaceC36694Vs5("short_name")
    public static /* synthetic */ void getShortName$annotations() {
    }

    @InterfaceC36694Vs5("types")
    public static /* synthetic */ void getTypes$annotations() {
    }

    @JvmStatic
    public static final void write$Self(AddressComponent self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        C41539gS5 c41539gS5 = C41539gS5.f82260a;
        output.mo1173E(serialDesc, 0, c41539gS5, self.shortName);
        output.mo1128w(serialDesc, 1, self.longName);
        output.mo1126y(serialDesc, 2, new C27999ro(c41539gS5), self.types);
    }

    public final String component1() {
        return this.shortName;
    }

    public final String component2() {
        return this.longName;
    }

    public final List<String> component3() {
        return this.types;
    }

    public final boolean contains(Place.Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.types.contains(type.getValue());
    }

    public final AddressComponent copy(String str, String longName, List<String> types) {
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(types, "types");
        return new AddressComponent(str, longName, types);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressComponent) {
            AddressComponent addressComponent = (AddressComponent) obj;
            return Intrinsics.areEqual(this.shortName, addressComponent.shortName) && Intrinsics.areEqual(this.longName, addressComponent.longName) && Intrinsics.areEqual(this.types, addressComponent.types);
        }
        return false;
    }

    public final String getLongName() {
        return this.longName;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public int hashCode() {
        String str = this.shortName;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.longName.hashCode()) * 31) + this.types.hashCode();
    }

    public String toString() {
        String str = this.shortName;
        String str2 = this.longName;
        List<String> list = this.types;
        return "AddressComponent(shortName=" + str + ", longName=" + str2 + ", types=" + list + ")";
    }

    public AddressComponent(String str, String longName, List<String> types) {
        Intrinsics.checkNotNullParameter(longName, "longName");
        Intrinsics.checkNotNullParameter(types, "types");
        this.shortName = str;
        this.longName = longName;
        this.types = types;
    }
}
