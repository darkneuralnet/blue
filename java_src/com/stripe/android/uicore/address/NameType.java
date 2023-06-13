package com.stripe.android.uicore.address;

import com.stripe.android.uicore.C19423R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/uicore/address/NameType;", "", "stringResId", "", "(Ljava/lang/String;II)V", "getStringResId", "()I", "Area", "Cedex", "City", "Country", "County", "Department", "District", "DoSi", "Eircode", "Emirate", "Island", "Neighborhood", "Oblast", "Parish", "Pin", "PostTown", "Postal", "Perfecture", "Province", "State", "Suburb", "SuburbOrCity", "Townload", "VillageTownship", "Zip", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum NameType {
    Area(C19423R.string.address_label_hk_area),
    Cedex(C19423R.string.address_label_cedex),
    City(C19423R.string.address_label_city),
    Country(C19423R.string.address_label_country_or_region),
    County(C19423R.string.address_label_county),
    Department(C19423R.string.address_label_department),
    District(C19423R.string.address_label_district),
    DoSi(C19423R.string.address_label_kr_do_si),
    Eircode(C19423R.string.address_label_ie_eircode),
    Emirate(C19423R.string.address_label_ae_emirate),
    Island(C19423R.string.address_label_island),
    Neighborhood(C19423R.string.address_label_neighborhood),
    Oblast(C19423R.string.address_label_oblast),
    Parish(C19423R.string.address_label_bb_jm_parish),
    Pin(C19423R.string.address_label_in_pin),
    PostTown(C19423R.string.address_label_post_town),
    Postal(C19423R.string.address_label_postal_code),
    Perfecture(C19423R.string.address_label_jp_prefecture),
    Province(C19423R.string.address_label_province),
    State(C19423R.string.address_label_state),
    Suburb(C19423R.string.address_label_suburb),
    SuburbOrCity(C19423R.string.address_label_au_suburb_or_city),
    Townload(C19423R.string.address_label_ie_townland),
    VillageTownship(C19423R.string.address_label_village_township),
    Zip(C19423R.string.address_label_zip_code);
    
    private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final int stringResId;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/address/NameType$Companion;", "", "LKj2;", "Lcom/stripe/android/uicore/address/NameType;", "serializer", "<init>", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return NameType.$cachedSerializer$delegate;
        }

        public final InterfaceC34036Kj2<NameType> serializer() {
            return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
        }

        private Companion() {
        }
    }

    static {
        Lazy<InterfaceC34036Kj2<Object>> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) NameType$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = lazy;
    }

    NameType(int i) {
        this.stringResId = i;
    }

    public final int getStringResId() {
        return this.stringResId;
    }
}
