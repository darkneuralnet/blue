package com.stripe.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\t\u0010'\u001a\u00020\nHÖ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u00063"}, m28432d2 = {"Lcom/stripe/android/core/model/StripeFile;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", AnalyticsRequestV2.PARAM_CREATED, "", "filename", "purpose", "Lcom/stripe/android/core/model/StripeFilePurpose;", "size", "", "title", "type", "url", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/core/model/StripeFilePurpose;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreated", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFilename", "()Ljava/lang/String;", "getId", "getPurpose", "()Lcom/stripe/android/core/model/StripeFilePurpose;", "getSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getType", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/core/model/StripeFilePurpose;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/model/StripeFile;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class StripeFile implements StripeModel {
    public static final Parcelable.Creator<StripeFile> CREATOR = new Creator();
    private final Long created;
    private final String filename;

    /* renamed from: id */
    private final String f75296id;
    private final StripeFilePurpose purpose;
    private final Integer size;
    private final String title;
    private final String type;
    private final String url;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<StripeFile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StripeFile createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StripeFile(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : StripeFilePurpose.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StripeFile[] newArray(int i) {
            return new StripeFile[i];
        }
    }

    public StripeFile() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.f75296id;
    }

    public final Long component2() {
        return this.created;
    }

    public final String component3() {
        return this.filename;
    }

    public final StripeFilePurpose component4() {
        return this.purpose;
    }

    public final Integer component5() {
        return this.size;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.type;
    }

    public final String component8() {
        return this.url;
    }

    public final StripeFile copy(String str, Long l, String str2, StripeFilePurpose stripeFilePurpose, Integer num, String str3, String str4, String str5) {
        return new StripeFile(str, l, str2, stripeFilePurpose, num, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeFile) {
            StripeFile stripeFile = (StripeFile) obj;
            return Intrinsics.areEqual(this.f75296id, stripeFile.f75296id) && Intrinsics.areEqual(this.created, stripeFile.created) && Intrinsics.areEqual(this.filename, stripeFile.filename) && this.purpose == stripeFile.purpose && Intrinsics.areEqual(this.size, stripeFile.size) && Intrinsics.areEqual(this.title, stripeFile.title) && Intrinsics.areEqual(this.type, stripeFile.type) && Intrinsics.areEqual(this.url, stripeFile.url);
        }
        return false;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getId() {
        return this.f75296id;
    }

    public final StripeFilePurpose getPurpose() {
        return this.purpose;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.f75296id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.created;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.filename;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StripeFilePurpose stripeFilePurpose = this.purpose;
        int hashCode4 = (hashCode3 + (stripeFilePurpose == null ? 0 : stripeFilePurpose.hashCode())) * 31;
        Integer num = this.size;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.title;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.f75296id;
        Long l = this.created;
        String str2 = this.filename;
        StripeFilePurpose stripeFilePurpose = this.purpose;
        Integer num = this.size;
        String str3 = this.title;
        String str4 = this.type;
        String str5 = this.url;
        return "StripeFile(id=" + str + ", created=" + l + ", filename=" + str2 + ", purpose=" + stripeFilePurpose + ", size=" + num + ", title=" + str3 + ", type=" + str4 + ", url=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75296id);
        Long l = this.created;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        out.writeString(this.filename);
        StripeFilePurpose stripeFilePurpose = this.purpose;
        if (stripeFilePurpose == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(stripeFilePurpose.name());
        }
        Integer num = this.size;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.title);
        out.writeString(this.type);
        out.writeString(this.url);
    }

    public StripeFile(String str, Long l, String str2, StripeFilePurpose stripeFilePurpose, Integer num, String str3, String str4, String str5) {
        this.f75296id = str;
        this.created = l;
        this.filename = str2;
        this.purpose = stripeFilePurpose;
        this.size = num;
        this.title = str3;
        this.type = str4;
        this.url = str5;
    }

    public /* synthetic */ StripeFile(String str, Long l, String str2, StripeFilePurpose stripeFilePurpose, Integer num, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : stripeFilePurpose, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) == 0 ? str5 : null);
    }
}
