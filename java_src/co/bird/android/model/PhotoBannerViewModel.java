package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011Jx\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011¨\u00062"}, m28432d2 = {"Lco/bird/android/model/PhotoBannerViewModel;", "Landroid/os/Parcelable;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/PhotoBannerContext;", "infoText", "", "infoViewIcon", "infoIconTint", "infoViewTitle", "infoViewBody", "infoViewIconAfter", "infoViewTitleAfter", "infoViewBodyAfter", "(Lco/bird/android/model/PhotoBannerContext;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getContext", "()Lco/bird/android/model/PhotoBannerContext;", "getInfoIconTint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInfoText", "getInfoViewBody", "getInfoViewBodyAfter", "getInfoViewIcon", "getInfoViewIconAfter", "getInfoViewTitle", "getInfoViewTitleAfter", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lco/bird/android/model/PhotoBannerContext;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/PhotoBannerViewModel;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PhotoBannerViewModel implements Parcelable {
    public static final Parcelable.Creator<PhotoBannerViewModel> CREATOR = new Creator();
    private final PhotoBannerContext context;
    private final Integer infoIconTint;
    private final Integer infoText;
    private final Integer infoViewBody;
    private final Integer infoViewBodyAfter;
    private final Integer infoViewIcon;
    private final Integer infoViewIconAfter;
    private final Integer infoViewTitle;
    private final Integer infoViewTitleAfter;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<PhotoBannerViewModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoBannerViewModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhotoBannerViewModel(PhotoBannerContext.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoBannerViewModel[] newArray(int i) {
            return new PhotoBannerViewModel[i];
        }
    }

    public PhotoBannerViewModel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final PhotoBannerContext component1() {
        return this.context;
    }

    public final Integer component2() {
        return this.infoText;
    }

    public final Integer component3() {
        return this.infoViewIcon;
    }

    public final Integer component4() {
        return this.infoIconTint;
    }

    public final Integer component5() {
        return this.infoViewTitle;
    }

    public final Integer component6() {
        return this.infoViewBody;
    }

    public final Integer component7() {
        return this.infoViewIconAfter;
    }

    public final Integer component8() {
        return this.infoViewTitleAfter;
    }

    public final Integer component9() {
        return this.infoViewBodyAfter;
    }

    public final PhotoBannerViewModel copy(PhotoBannerContext context, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new PhotoBannerViewModel(context, num, num2, num3, num4, num5, num6, num7, num8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhotoBannerViewModel) {
            PhotoBannerViewModel photoBannerViewModel = (PhotoBannerViewModel) obj;
            return this.context == photoBannerViewModel.context && Intrinsics.areEqual(this.infoText, photoBannerViewModel.infoText) && Intrinsics.areEqual(this.infoViewIcon, photoBannerViewModel.infoViewIcon) && Intrinsics.areEqual(this.infoIconTint, photoBannerViewModel.infoIconTint) && Intrinsics.areEqual(this.infoViewTitle, photoBannerViewModel.infoViewTitle) && Intrinsics.areEqual(this.infoViewBody, photoBannerViewModel.infoViewBody) && Intrinsics.areEqual(this.infoViewIconAfter, photoBannerViewModel.infoViewIconAfter) && Intrinsics.areEqual(this.infoViewTitleAfter, photoBannerViewModel.infoViewTitleAfter) && Intrinsics.areEqual(this.infoViewBodyAfter, photoBannerViewModel.infoViewBodyAfter);
        }
        return false;
    }

    public final PhotoBannerContext getContext() {
        return this.context;
    }

    public final Integer getInfoIconTint() {
        return this.infoIconTint;
    }

    public final Integer getInfoText() {
        return this.infoText;
    }

    public final Integer getInfoViewBody() {
        return this.infoViewBody;
    }

    public final Integer getInfoViewBodyAfter() {
        return this.infoViewBodyAfter;
    }

    public final Integer getInfoViewIcon() {
        return this.infoViewIcon;
    }

    public final Integer getInfoViewIconAfter() {
        return this.infoViewIconAfter;
    }

    public final Integer getInfoViewTitle() {
        return this.infoViewTitle;
    }

    public final Integer getInfoViewTitleAfter() {
        return this.infoViewTitleAfter;
    }

    public int hashCode() {
        int hashCode = this.context.hashCode() * 31;
        Integer num = this.infoText;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.infoViewIcon;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.infoIconTint;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.infoViewTitle;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.infoViewBody;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.infoViewIconAfter;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.infoViewTitleAfter;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.infoViewBodyAfter;
        return hashCode8 + (num8 != null ? num8.hashCode() : 0);
    }

    public String toString() {
        PhotoBannerContext photoBannerContext = this.context;
        Integer num = this.infoText;
        Integer num2 = this.infoViewIcon;
        Integer num3 = this.infoIconTint;
        Integer num4 = this.infoViewTitle;
        Integer num5 = this.infoViewBody;
        Integer num6 = this.infoViewIconAfter;
        Integer num7 = this.infoViewTitleAfter;
        Integer num8 = this.infoViewBodyAfter;
        return "PhotoBannerViewModel(context=" + photoBannerContext + ", infoText=" + num + ", infoViewIcon=" + num2 + ", infoIconTint=" + num3 + ", infoViewTitle=" + num4 + ", infoViewBody=" + num5 + ", infoViewIconAfter=" + num6 + ", infoViewTitleAfter=" + num7 + ", infoViewBodyAfter=" + num8 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.context.name());
        Integer num = this.infoText;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.infoViewIcon;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.infoIconTint;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.infoViewTitle;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.infoViewBody;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
        Integer num6 = this.infoViewIconAfter;
        if (num6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num6.intValue());
        }
        Integer num7 = this.infoViewTitleAfter;
        if (num7 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num7.intValue());
        }
        Integer num8 = this.infoViewBodyAfter;
        if (num8 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num8.intValue());
    }

    public PhotoBannerViewModel(PhotoBannerContext context, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.infoText = num;
        this.infoViewIcon = num2;
        this.infoIconTint = num3;
        this.infoViewTitle = num4;
        this.infoViewBody = num5;
        this.infoViewIconAfter = num6;
        this.infoViewTitleAfter = num7;
        this.infoViewBodyAfter = num8;
    }

    public /* synthetic */ PhotoBannerViewModel(PhotoBannerContext photoBannerContext, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PhotoBannerContext.UNKNOWN : photoBannerContext, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? null : num7, (i & 256) == 0 ? num8 : null);
    }
}
