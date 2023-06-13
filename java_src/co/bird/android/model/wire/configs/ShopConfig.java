package co.bird.android.model.wire.configs;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ShopConfig;", "Landroid/os/Parcelable;", "byobShowSideMenu", "", "byobMenuName", "", "byobShopUrl", "(ZLjava/lang/String;Ljava/lang/String;)V", "getByobMenuName", "()Ljava/lang/String;", "getByobShopUrl", "getByobShowSideMenu", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ShopConfig implements Parcelable {
    public static final Parcelable.Creator<ShopConfig> CREATOR = new Creator();
    @JsonProperty("buy_a_bird_menu_name")
    @InterfaceC41208ft5("buy_a_bird_menu_name")
    private final String byobMenuName;
    @JsonProperty("buy_a_bird_shop_url")
    @InterfaceC41208ft5("buy_a_bird_shop_url")
    private final String byobShopUrl;
    @JsonProperty("buy_a_bird_in_side_menu")
    @InterfaceC41208ft5("buy_a_bird_in_side_menu")
    private final boolean byobShowSideMenu;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ShopConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopConfig(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopConfig[] newArray(int i) {
            return new ShopConfig[i];
        }
    }

    public ShopConfig() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ ShopConfig copy$default(ShopConfig shopConfig, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shopConfig.byobShowSideMenu;
        }
        if ((i & 2) != 0) {
            str = shopConfig.byobMenuName;
        }
        if ((i & 4) != 0) {
            str2 = shopConfig.byobShopUrl;
        }
        return shopConfig.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.byobShowSideMenu;
    }

    public final String component2() {
        return this.byobMenuName;
    }

    public final String component3() {
        return this.byobShopUrl;
    }

    public final ShopConfig copy(boolean z, String byobMenuName, String str) {
        Intrinsics.checkNotNullParameter(byobMenuName, "byobMenuName");
        return new ShopConfig(z, byobMenuName, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShopConfig) {
            ShopConfig shopConfig = (ShopConfig) obj;
            return this.byobShowSideMenu == shopConfig.byobShowSideMenu && Intrinsics.areEqual(this.byobMenuName, shopConfig.byobMenuName) && Intrinsics.areEqual(this.byobShopUrl, shopConfig.byobShopUrl);
        }
        return false;
    }

    public final String getByobMenuName() {
        return this.byobMenuName;
    }

    public final String getByobShopUrl() {
        return this.byobShopUrl;
    }

    public final boolean getByobShowSideMenu() {
        return this.byobShowSideMenu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.byobShowSideMenu;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.byobMenuName.hashCode()) * 31;
        String str = this.byobShopUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.byobShowSideMenu;
        String str = this.byobMenuName;
        String str2 = this.byobShopUrl;
        return "ShopConfig(byobShowSideMenu=" + z + ", byobMenuName=" + str + ", byobShopUrl=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.byobShowSideMenu ? 1 : 0);
        out.writeString(this.byobMenuName);
        out.writeString(this.byobShopUrl);
    }

    public ShopConfig(boolean z, String byobMenuName, String str) {
        Intrinsics.checkNotNullParameter(byobMenuName, "byobMenuName");
        this.byobShowSideMenu = z;
        this.byobMenuName = byobMenuName;
        this.byobShopUrl = str;
    }

    public /* synthetic */ ShopConfig(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "Bird One" : str, (i & 4) != 0 ? null : str2);
    }
}
