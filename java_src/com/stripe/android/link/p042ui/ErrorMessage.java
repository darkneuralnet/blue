package com.stripe.android.link.p042ui;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/link/ui/ErrorMessage;", "Landroid/os/Parcelable;", "()V", "getMessage", "", "resources", "Landroid/content/res/Resources;", "FromResources", "Raw", "Lcom/stripe/android/link/ui/ErrorMessage$FromResources;", "Lcom/stripe/android/link/ui/ErrorMessage$Raw;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.ErrorMessage */
/* loaded from: classes7.dex */
public abstract class ErrorMessage implements Parcelable {

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/link/ui/ErrorMessage$FromResources;", "Lcom/stripe/android/link/ui/ErrorMessage;", "stringResId", "", "(I)V", "getStringResId", "()I", "component1", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "getMessage", "", "resources", "Landroid/content/res/Resources;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.ErrorMessage$FromResources */
    /* loaded from: classes7.dex */
    public static final class FromResources extends ErrorMessage {
        public static final int $stable = 0;
        public static final Parcelable.Creator<FromResources> CREATOR = new Creator();
        private final int stringResId;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.link.ui.ErrorMessage$FromResources$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<FromResources> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromResources createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromResources(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromResources[] newArray(int i) {
                return new FromResources[i];
            }
        }

        public FromResources(int i) {
            super(null);
            this.stringResId = i;
        }

        public static /* synthetic */ FromResources copy$default(FromResources fromResources, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fromResources.stringResId;
            }
            return fromResources.copy(i);
        }

        public final int component1() {
            return this.stringResId;
        }

        public final FromResources copy(int i) {
            return new FromResources(i);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FromResources) && this.stringResId == ((FromResources) obj).stringResId;
        }

        @Override // com.stripe.android.link.p042ui.ErrorMessage
        public String getMessage(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            String string = resources.getString(this.stringResId);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(stringResId)");
            return string;
        }

        public final int getStringResId() {
            return this.stringResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.stringResId);
        }

        public String toString() {
            int i = this.stringResId;
            return "FromResources(stringResId=" + i + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.stringResId);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\nHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/link/ui/ErrorMessage$Raw;", "Lcom/stripe/android/link/ui/ErrorMessage;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "getMessage", "resources", "Landroid/content/res/Resources;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.ErrorMessage$Raw */
    /* loaded from: classes7.dex */
    public static final class Raw extends ErrorMessage {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Raw> CREATOR = new Creator();
        private final String errorMessage;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.link.ui.ErrorMessage$Raw$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Raw> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Raw createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Raw(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Raw[] newArray(int i) {
                return new Raw[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Raw(String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ Raw copy$default(Raw raw, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = raw.errorMessage;
            }
            return raw.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Raw copy(String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new Raw(errorMessage);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Raw) && Intrinsics.areEqual(this.errorMessage, ((Raw) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.stripe.android.link.p042ui.ErrorMessage
        public String getMessage(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            String str = this.errorMessage;
            return "Raw(errorMessage=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.errorMessage);
        }
    }

    public /* synthetic */ ErrorMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getMessage(Resources resources);

    private ErrorMessage() {
    }
}
