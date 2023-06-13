package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/WireTierView;", "Landroid/os/Parcelable;", "tier", "", "title", "", "benefits", "", "Lco/bird/android/model/wire/WireBenefit;", "(ILjava/lang/String;Ljava/util/List;)V", "getBenefits", "()Ljava/util/List;", "getTier", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireTierView implements Parcelable {
    public static final Parcelable.Creator<WireTierView> CREATOR = new Creator();
    @JsonProperty("benefits")
    @InterfaceC41208ft5("benefits")
    private final List<WireBenefit> benefits;
    @JsonProperty("tier")
    @InterfaceC41208ft5("tier")
    private final int tier;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireTierView> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireTierView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(WireBenefit.CREATOR.createFromParcel(parcel));
            }
            return new WireTierView(readInt, readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireTierView[] newArray(int i) {
            return new WireTierView[i];
        }
    }

    public WireTierView() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireTierView copy$default(WireTierView wireTierView, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireTierView.tier;
        }
        if ((i2 & 2) != 0) {
            str = wireTierView.title;
        }
        if ((i2 & 4) != 0) {
            list = wireTierView.benefits;
        }
        return wireTierView.copy(i, str, list);
    }

    public final int component1() {
        return this.tier;
    }

    public final String component2() {
        return this.title;
    }

    public final List<WireBenefit> component3() {
        return this.benefits;
    }

    public final WireTierView copy(int i, String title, List<WireBenefit> benefits) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        return new WireTierView(i, title, benefits);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireTierView) {
            WireTierView wireTierView = (WireTierView) obj;
            return this.tier == wireTierView.tier && Intrinsics.areEqual(this.title, wireTierView.title) && Intrinsics.areEqual(this.benefits, wireTierView.benefits);
        }
        return false;
    }

    public final List<WireBenefit> getBenefits() {
        return this.benefits;
    }

    public final int getTier() {
        return this.tier;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.tier) * 31) + this.title.hashCode()) * 31) + this.benefits.hashCode();
    }

    public String toString() {
        int i = this.tier;
        String str = this.title;
        List<WireBenefit> list = this.benefits;
        return "WireTierView(tier=" + i + ", title=" + str + ", benefits=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.tier);
        out.writeString(this.title);
        List<WireBenefit> list = this.benefits;
        out.writeInt(list.size());
        for (WireBenefit wireBenefit : list) {
            wireBenefit.writeToParcel(out, i);
        }
    }

    public WireTierView(int i, String title, List<WireBenefit> benefits) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.tier = i;
        this.title = title;
        this.benefits = benefits;
    }

    public /* synthetic */ WireTierView(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
