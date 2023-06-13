package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 H2\u00020\u0001:\u0002IHBW\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bB\u0010CBw\b\u0017\u0012\u0006\u0010D\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0016\u001a\u00020\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0018\u001a\u00020\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bB\u0010GJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jh\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0012HÖ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010%\u001a\u00020\u0012HÖ\u0001J\u0019\u0010)\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0012HÖ\u0001R \u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R \u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R \u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010*\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010,R \u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010/\u0012\u0004\b6\u0010.\u001a\u0004\b5\u00101R\"\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R\"\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00107\u0012\u0004\b<\u0010.\u001a\u0004\b;\u00109R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010=\u0012\u0004\b?\u0010.\u001a\u0004\b>\u0010\u0014R\"\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010/\u0012\u0004\bA\u0010.\u001a\u0004\b@\u00101¨\u0006J"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "Lcom/stripe/android/financialconnections/model/Image;", "component5", "component6", "", "component7", "()Ljava/lang/Integer;", "component8", "featured", "id", "mobileHandoffCapable", "name", "icon", "logo", "featuredOrder", "url", "copy", "(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Z", "getFeatured", "()Z", "getFeatured$annotations", "()V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "getMobileHandoffCapable", "getMobileHandoffCapable$annotations", "getName", "getName$annotations", "Lcom/stripe/android/financialconnections/model/Image;", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getIcon$annotations", "getLogo", "getLogo$annotations", "Ljava/lang/Integer;", "getFeaturedOrder", "getFeaturedOrder$annotations", "getUrl", "getUrl$annotations", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(IZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsInstitution implements Parcelable {
    private final boolean featured;
    private final Integer featuredOrder;
    private final Image icon;

    /* renamed from: id */
    private final String f75309id;
    private final Image logo;
    private final boolean mobileHandoffCapable;
    private final String name;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsInstitution> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<FinancialConnectionsInstitution> serializer() {
            return FinancialConnectionsInstitution$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsInstitution> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsInstitution createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialConnectionsInstitution(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsInstitution[] newArray(int i) {
            return new FinancialConnectionsInstitution[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FinancialConnectionsInstitution(int i, @InterfaceC36694Vs5("featured") boolean z, @InterfaceC36694Vs5("id") String str, @InterfaceC36694Vs5("mobile_handoff_capable") boolean z2, @InterfaceC36694Vs5("name") String str2, @InterfaceC36694Vs5("icon") Image image, @InterfaceC36694Vs5("logo") Image image2, @InterfaceC36694Vs5("featured_order") Integer num, @InterfaceC36694Vs5("url") String str3, C38819bt5 c38819bt5) {
        if (15 != (i & 15)) {
            C52838zW3.m1275b(i, 15, FinancialConnectionsInstitution$$serializer.INSTANCE.getDescriptor());
        }
        this.featured = z;
        this.f75309id = str;
        this.mobileHandoffCapable = z2;
        this.name = str2;
        if ((i & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        if ((i & 32) == 0) {
            this.logo = null;
        } else {
            this.logo = image2;
        }
        if ((i & 64) == 0) {
            this.featuredOrder = null;
        } else {
            this.featuredOrder = num;
        }
        if ((i & 128) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    @InterfaceC36694Vs5("featured")
    public static /* synthetic */ void getFeatured$annotations() {
    }

    @InterfaceC36694Vs5("featured_order")
    public static /* synthetic */ void getFeaturedOrder$annotations() {
    }

    @InterfaceC36694Vs5("icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC36694Vs5("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC36694Vs5("logo")
    public static /* synthetic */ void getLogo$annotations() {
    }

    @InterfaceC36694Vs5("mobile_handoff_capable")
    public static /* synthetic */ void getMobileHandoffCapable$annotations() {
    }

    @InterfaceC36694Vs5("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @InterfaceC36694Vs5("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @JvmStatic
    public static final void write$Self(FinancialConnectionsInstitution self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z4 = false;
        output.mo1129v(serialDesc, 0, self.featured);
        output.mo1128w(serialDesc, 1, self.f75309id);
        output.mo1129v(serialDesc, 2, self.mobileHandoffCapable);
        output.mo1128w(serialDesc, 3, self.name);
        if (output.mo1132s(serialDesc, 4) || self.icon != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 4, Image$$serializer.INSTANCE, self.icon);
        }
        if (output.mo1132s(serialDesc, 5) || self.logo != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 5, Image$$serializer.INSTANCE, self.logo);
        }
        if (output.mo1132s(serialDesc, 6) || self.featuredOrder != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo1173E(serialDesc, 6, F52.f8705a, self.featuredOrder);
        }
        if (output.mo1132s(serialDesc, 7) || self.url != null) {
            z4 = true;
        }
        if (z4) {
            output.mo1173E(serialDesc, 7, C41539gS5.f82260a, self.url);
        }
    }

    public final boolean component1() {
        return this.featured;
    }

    public final String component2() {
        return this.f75309id;
    }

    public final boolean component3() {
        return this.mobileHandoffCapable;
    }

    public final String component4() {
        return this.name;
    }

    public final Image component5() {
        return this.icon;
    }

    public final Image component6() {
        return this.logo;
    }

    public final Integer component7() {
        return this.featuredOrder;
    }

    public final String component8() {
        return this.url;
    }

    public final FinancialConnectionsInstitution copy(boolean z, String id, boolean z2, String name, Image image, Image image2, Integer num, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new FinancialConnectionsInstitution(z, id, z2, name, image, image2, num, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsInstitution) {
            FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) obj;
            return this.featured == financialConnectionsInstitution.featured && Intrinsics.areEqual(this.f75309id, financialConnectionsInstitution.f75309id) && this.mobileHandoffCapable == financialConnectionsInstitution.mobileHandoffCapable && Intrinsics.areEqual(this.name, financialConnectionsInstitution.name) && Intrinsics.areEqual(this.icon, financialConnectionsInstitution.icon) && Intrinsics.areEqual(this.logo, financialConnectionsInstitution.logo) && Intrinsics.areEqual(this.featuredOrder, financialConnectionsInstitution.featuredOrder) && Intrinsics.areEqual(this.url, financialConnectionsInstitution.url);
        }
        return false;
    }

    public final boolean getFeatured() {
        return this.featured;
    }

    public final Integer getFeaturedOrder() {
        return this.featuredOrder;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f75309id;
    }

    public final Image getLogo() {
        return this.logo;
    }

    public final boolean getMobileHandoffCapable() {
        return this.mobileHandoffCapable;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z = this.featured;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.f75309id.hashCode()) * 31;
        boolean z2 = this.mobileHandoffCapable;
        int hashCode2 = (((hashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.name.hashCode()) * 31;
        Image image = this.icon;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.logo;
        int hashCode4 = (hashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.featuredOrder;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.url;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.featured;
        String str = this.f75309id;
        boolean z2 = this.mobileHandoffCapable;
        String str2 = this.name;
        Image image = this.icon;
        Image image2 = this.logo;
        Integer num = this.featuredOrder;
        String str3 = this.url;
        return "FinancialConnectionsInstitution(featured=" + z + ", id=" + str + ", mobileHandoffCapable=" + z2 + ", name=" + str2 + ", icon=" + image + ", logo=" + image2 + ", featuredOrder=" + num + ", url=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.featured ? 1 : 0);
        out.writeString(this.f75309id);
        out.writeInt(this.mobileHandoffCapable ? 1 : 0);
        out.writeString(this.name);
        Image image = this.icon;
        if (image == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image.writeToParcel(out, i);
        }
        Image image2 = this.logo;
        if (image2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image2.writeToParcel(out, i);
        }
        Integer num = this.featuredOrder;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.url);
    }

    public FinancialConnectionsInstitution(boolean z, String id, boolean z2, String name, Image image, Image image2, Integer num, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.featured = z;
        this.f75309id = id;
        this.mobileHandoffCapable = z2;
        this.name = name;
        this.icon = image;
        this.logo = image2;
        this.featuredOrder = num;
        this.url = str;
    }

    public /* synthetic */ FinancialConnectionsInstitution(boolean z, String str, boolean z2, String str2, Image image, Image image2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, z2, str2, (i & 16) != 0 ? null : image, (i & 32) != 0 ? null : image2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str3);
    }
}
