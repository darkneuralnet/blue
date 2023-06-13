package co.bird.android.widget;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.widget.InterfaceC16662d;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b+\u0010,J|\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b$\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b(\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b\"\u0010*¨\u0006-"}, m28432d2 = {"Lco/bird/android/widget/ParcelableBottomSheetOption;", "Lco/bird/android/widget/d;", "Landroid/os/Parcelable;", "", Entry.TYPE_TEXT, "subText", "color", "icon", "iconEnd", "iconTintColor", "", "textString", "subtitleStr", "iconUrl", "j", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/widget/ParcelableBottomSheetOption;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "c", "i", DateTokenConverter.CONVERTER_KEY, "getColor", "e", "getIcon", "f", "h", "g", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ParcelableBottomSheetOption implements InterfaceC16662d, Parcelable {
    public static final Parcelable.Creator<ParcelableBottomSheetOption> CREATOR = new C16548a();

    /* renamed from: b */
    public final Integer f67435b;

    /* renamed from: c */
    public final Integer f67436c;

    /* renamed from: d */
    public final Integer f67437d;

    /* renamed from: e */
    public final Integer f67438e;

    /* renamed from: f */
    public final Integer f67439f;

    /* renamed from: g */
    public final Integer f67440g;

    /* renamed from: h */
    public final String f67441h;

    /* renamed from: i */
    public final String f67442i;

    /* renamed from: j */
    public final String f67443j;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.ParcelableBottomSheetOption$a */
    /* loaded from: classes4.dex */
    public static final class C16548a implements Parcelable.Creator<ParcelableBottomSheetOption> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ParcelableBottomSheetOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ParcelableBottomSheetOption(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ParcelableBottomSheetOption[] newArray(int i) {
            return new ParcelableBottomSheetOption[i];
        }
    }

    public ParcelableBottomSheetOption(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3) {
        this.f67435b = num;
        this.f67436c = num2;
        this.f67437d = num3;
        this.f67438e = num4;
        this.f67439f = num5;
        this.f67440g = num6;
        this.f67441h = str;
        this.f67442i = str2;
        this.f67443j = str3;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: a */
    public Integer mo13236a() {
        return this.f67435b;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: b */
    public boolean mo13235b() {
        return InterfaceC16662d.C16663a.m54052a(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: c */
    public Integer mo13234c() {
        return this.f67440g;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: d */
    public String mo13233d() {
        return this.f67443j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: e */
    public String mo13232e() {
        return this.f67441h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelableBottomSheetOption) {
            ParcelableBottomSheetOption parcelableBottomSheetOption = (ParcelableBottomSheetOption) obj;
            return Intrinsics.areEqual(this.f67435b, parcelableBottomSheetOption.f67435b) && Intrinsics.areEqual(this.f67436c, parcelableBottomSheetOption.f67436c) && Intrinsics.areEqual(this.f67437d, parcelableBottomSheetOption.f67437d) && Intrinsics.areEqual(this.f67438e, parcelableBottomSheetOption.f67438e) && Intrinsics.areEqual(this.f67439f, parcelableBottomSheetOption.f67439f) && Intrinsics.areEqual(this.f67440g, parcelableBottomSheetOption.f67440g) && Intrinsics.areEqual(this.f67441h, parcelableBottomSheetOption.f67441h) && Intrinsics.areEqual(this.f67442i, parcelableBottomSheetOption.f67442i) && Intrinsics.areEqual(this.f67443j, parcelableBottomSheetOption.f67443j);
        }
        return false;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: g */
    public String mo13230g() {
        return this.f67442i;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getColor() {
        return this.f67437d;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getIcon() {
        return this.f67438e;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: h */
    public Integer mo13229h() {
        return this.f67439f;
    }

    public int hashCode() {
        Integer num = this.f67435b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f67436c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f67437d;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f67438e;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f67439f;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f67440g;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.f67441h;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f67442i;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67443j;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: i */
    public Integer mo13228i() {
        return this.f67436c;
    }

    /* renamed from: j */
    public final ParcelableBottomSheetOption m54515j(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3) {
        return new ParcelableBottomSheetOption(num, num2, num3, num4, num5, num6, str, str2, str3);
    }

    public String toString() {
        Integer num = this.f67435b;
        Integer num2 = this.f67436c;
        Integer num3 = this.f67437d;
        Integer num4 = this.f67438e;
        Integer num5 = this.f67439f;
        Integer num6 = this.f67440g;
        String str = this.f67441h;
        String str2 = this.f67442i;
        String str3 = this.f67443j;
        return "ParcelableBottomSheetOption(text=" + num + ", subText=" + num2 + ", color=" + num3 + ", icon=" + num4 + ", iconEnd=" + num5 + ", iconTintColor=" + num6 + ", textString=" + str + ", subtitleStr=" + str2 + ", iconUrl=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Integer num = this.f67435b;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f67436c;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.f67437d;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.f67438e;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.f67439f;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
        Integer num6 = this.f67440g;
        if (num6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num6.intValue());
        }
        out.writeString(this.f67441h);
        out.writeString(this.f67442i);
        out.writeString(this.f67443j);
    }
}
