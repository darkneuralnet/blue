package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m28432d2 = {"Lco/bird/android/model/LegacyRepairType;", "Landroid/os/Parcelable;", "key", "", "display", "subKeys", "", "parentKey", "parentDisplay", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "getKey", "getParentDisplay", "setParentDisplay", "(Ljava/lang/String;)V", "getParentKey", "setParentKey", "getSubKeys", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LegacyRepairType implements Parcelable {
    public static final String OTHER_KEY = "other";
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("key")
    @InterfaceC41208ft5("key")
    private final String key;
    @JsonProperty("parent_display")
    @InterfaceC41208ft5("parent_display")
    private String parentDisplay;
    @JsonProperty("parent_key")
    @InterfaceC41208ft5("parent_key")
    private String parentKey;
    @JsonProperty("sub_keys")
    @InterfaceC41208ft5("sub_keys")
    private final List<LegacyRepairType> subKeys;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LegacyRepairType> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/LegacyRepairType$Companion;", "", "()V", "OTHER_KEY", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<LegacyRepairType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyRepairType createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(LegacyRepairType.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new LegacyRepairType(readString, readString2, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyRepairType[] newArray(int i) {
            return new LegacyRepairType[i];
        }
    }

    public LegacyRepairType() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ LegacyRepairType copy$default(LegacyRepairType legacyRepairType, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legacyRepairType.key;
        }
        if ((i & 2) != 0) {
            str2 = legacyRepairType.display;
        }
        String str5 = str2;
        List<LegacyRepairType> list2 = list;
        if ((i & 4) != 0) {
            list2 = legacyRepairType.subKeys;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            str3 = legacyRepairType.parentKey;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = legacyRepairType.parentDisplay;
        }
        return legacyRepairType.copy(str, str5, list3, str6, str4);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.display;
    }

    public final List<LegacyRepairType> component3() {
        return this.subKeys;
    }

    public final String component4() {
        return this.parentKey;
    }

    public final String component5() {
        return this.parentDisplay;
    }

    public final LegacyRepairType copy(String key, String display, List<LegacyRepairType> list, String str, String str2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(display, "display");
        return new LegacyRepairType(key, display, list, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyRepairType) {
            LegacyRepairType legacyRepairType = (LegacyRepairType) obj;
            return Intrinsics.areEqual(this.key, legacyRepairType.key) && Intrinsics.areEqual(this.display, legacyRepairType.display) && Intrinsics.areEqual(this.subKeys, legacyRepairType.subKeys) && Intrinsics.areEqual(this.parentKey, legacyRepairType.parentKey) && Intrinsics.areEqual(this.parentDisplay, legacyRepairType.parentDisplay);
        }
        return false;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getParentDisplay() {
        return this.parentDisplay;
    }

    public final String getParentKey() {
        return this.parentKey;
    }

    public final List<LegacyRepairType> getSubKeys() {
        return this.subKeys;
    }

    public int hashCode() {
        int hashCode = ((this.key.hashCode() * 31) + this.display.hashCode()) * 31;
        List<LegacyRepairType> list = this.subKeys;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.parentKey;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.parentDisplay;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setParentDisplay(String str) {
        this.parentDisplay = str;
    }

    public final void setParentKey(String str) {
        this.parentKey = str;
    }

    public String toString() {
        String str = this.key;
        String str2 = this.display;
        List<LegacyRepairType> list = this.subKeys;
        String str3 = this.parentKey;
        String str4 = this.parentDisplay;
        return "LegacyRepairType(key=" + str + ", display=" + str2 + ", subKeys=" + list + ", parentKey=" + str3 + ", parentDisplay=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.key);
        out.writeString(this.display);
        List<LegacyRepairType> list = this.subKeys;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (LegacyRepairType legacyRepairType : list) {
                legacyRepairType.writeToParcel(out, i);
            }
        }
        out.writeString(this.parentKey);
        out.writeString(this.parentDisplay);
    }

    public LegacyRepairType(String key, String display, List<LegacyRepairType> list, String str, String str2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(display, "display");
        this.key = key;
        this.display = display;
        this.subKeys = list;
        this.parentKey = str;
        this.parentDisplay = str2;
    }

    public /* synthetic */ LegacyRepairType(String str, String str2, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
