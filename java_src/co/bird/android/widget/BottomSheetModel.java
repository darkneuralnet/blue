package co.bird.android.widget;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.widget.BottomSheetOptionLayout;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b'\u0010(JE\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&¨\u0006)"}, m28432d2 = {"Lco/bird/android/widget/BottomSheetModel;", "Landroid/os/Parcelable;", "Lco/bird/android/widget/BottomSheetOptionLayout$a;", "bottomSheetLayout", "", "title", "subtitle", "", "headerGravity", "", "Lco/bird/android/widget/ParcelableBottomSheetOption;", "options", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Lco/bird/android/widget/BottomSheetOptionLayout$a;", "()Lco/bird/android/widget/BottomSheetOptionLayout$a;", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "I", "()I", "f", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Lco/bird/android/widget/BottomSheetOptionLayout$a;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BottomSheetModel implements Parcelable {
    public static final Parcelable.Creator<BottomSheetModel> CREATOR = new C16468a();

    /* renamed from: b */
    public final BottomSheetOptionLayout.EnumC16469a f67200b;

    /* renamed from: c */
    public final String f67201c;

    /* renamed from: d */
    public final String f67202d;

    /* renamed from: e */
    public final int f67203e;

    /* renamed from: f */
    public final List<ParcelableBottomSheetOption> f67204f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.BottomSheetModel$a */
    /* loaded from: classes4.dex */
    public static final class C16468a implements Parcelable.Creator<BottomSheetModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BottomSheetModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BottomSheetOptionLayout.EnumC16469a valueOf = BottomSheetOptionLayout.EnumC16469a.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(ParcelableBottomSheetOption.CREATOR.createFromParcel(parcel));
            }
            return new BottomSheetModel(valueOf, readString, readString2, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final BottomSheetModel[] newArray(int i) {
            return new BottomSheetModel[i];
        }
    }

    public BottomSheetModel() {
        this(null, null, null, 0, null, 31, null);
    }

    public static /* synthetic */ BottomSheetModel copy$default(BottomSheetModel bottomSheetModel, BottomSheetOptionLayout.EnumC16469a enumC16469a, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            enumC16469a = bottomSheetModel.f67200b;
        }
        if ((i2 & 2) != 0) {
            str = bottomSheetModel.f67201c;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = bottomSheetModel.f67202d;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            i = bottomSheetModel.f67203e;
        }
        int i3 = i;
        List<ParcelableBottomSheetOption> list2 = list;
        if ((i2 & 16) != 0) {
            list2 = bottomSheetModel.f67204f;
        }
        return bottomSheetModel.m54723a(enumC16469a, str3, str4, i3, list2);
    }

    /* renamed from: a */
    public final BottomSheetModel m54723a(BottomSheetOptionLayout.EnumC16469a bottomSheetLayout, String str, String str2, int i, List<ParcelableBottomSheetOption> options) {
        Intrinsics.checkNotNullParameter(bottomSheetLayout, "bottomSheetLayout");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BottomSheetModel(bottomSheetLayout, str, str2, i, options);
    }

    /* renamed from: b */
    public final BottomSheetOptionLayout.EnumC16469a m54722b() {
        return this.f67200b;
    }

    /* renamed from: c */
    public final int m54721c() {
        return this.f67203e;
    }

    /* renamed from: d */
    public final List<ParcelableBottomSheetOption> m54720d() {
        return this.f67204f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m54719e() {
        return this.f67202d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BottomSheetModel) {
            BottomSheetModel bottomSheetModel = (BottomSheetModel) obj;
            return this.f67200b == bottomSheetModel.f67200b && Intrinsics.areEqual(this.f67201c, bottomSheetModel.f67201c) && Intrinsics.areEqual(this.f67202d, bottomSheetModel.f67202d) && this.f67203e == bottomSheetModel.f67203e && Intrinsics.areEqual(this.f67204f, bottomSheetModel.f67204f);
        }
        return false;
    }

    /* renamed from: g */
    public final String m54718g() {
        return this.f67201c;
    }

    public int hashCode() {
        int hashCode = this.f67200b.hashCode() * 31;
        String str = this.f67201c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f67202d;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.f67203e)) * 31) + this.f67204f.hashCode();
    }

    public String toString() {
        BottomSheetOptionLayout.EnumC16469a enumC16469a = this.f67200b;
        String str = this.f67201c;
        String str2 = this.f67202d;
        int i = this.f67203e;
        List<ParcelableBottomSheetOption> list = this.f67204f;
        return "BottomSheetModel(bottomSheetLayout=" + enumC16469a + ", title=" + str + ", subtitle=" + str2 + ", headerGravity=" + i + ", options=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f67200b.name());
        out.writeString(this.f67201c);
        out.writeString(this.f67202d);
        out.writeInt(this.f67203e);
        List<ParcelableBottomSheetOption> list = this.f67204f;
        out.writeInt(list.size());
        for (ParcelableBottomSheetOption parcelableBottomSheetOption : list) {
            parcelableBottomSheetOption.writeToParcel(out, i);
        }
    }

    public BottomSheetModel(BottomSheetOptionLayout.EnumC16469a bottomSheetLayout, String str, String str2, int i, List<ParcelableBottomSheetOption> options) {
        Intrinsics.checkNotNullParameter(bottomSheetLayout, "bottomSheetLayout");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f67200b = bottomSheetLayout;
        this.f67201c = str;
        this.f67202d = str2;
        this.f67203e = i;
        this.f67204f = options;
    }

    public /* synthetic */ BottomSheetModel(BottomSheetOptionLayout.EnumC16469a enumC16469a, String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BottomSheetOptionLayout.EnumC16469a.NORMAL : enumC16469a, (i2 & 2) != 0 ? null : str, (i2 & 4) == 0 ? str2 : null, (i2 & 8) != 0 ? 8388611 : i, (i2 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
