package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b)\u0010*B?\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010 ¨\u00061"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/Bullet;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "Lcom/stripe/android/financialconnections/model/Image;", "component2", "component3", "content", "icon", "title", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "getContent$annotations", "()V", "Lcom/stripe/android/financialconnections/model/Image;", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getIcon$annotations", "getTitle", "getTitle$annotations", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Bullet implements Parcelable {
    private final String content;
    private final Image icon;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Bullet> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/Bullet$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/Bullet;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<Bullet> serializer() {
            return Bullet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Bullet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Bullet createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Bullet(parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Bullet[] newArray(int i) {
            return new Bullet[i];
        }
    }

    public Bullet() {
        this((String) null, (Image) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Bullet copy$default(Bullet bullet, String str, Image image, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bullet.content;
        }
        if ((i & 2) != 0) {
            image = bullet.icon;
        }
        if ((i & 4) != 0) {
            str2 = bullet.title;
        }
        return bullet.copy(str, image, str2);
    }

    @InterfaceC36694Vs5("content")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getContent$annotations() {
    }

    @InterfaceC36694Vs5("icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC36694Vs5("title")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final void write$Self(Bullet self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z3 = false;
        if (output.mo1132s(serialDesc, 0) || self.content != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 0, MarkdownToHtmlSerializer.INSTANCE, self.content);
        }
        if (output.mo1132s(serialDesc, 1) || self.icon != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 1, Image$$serializer.INSTANCE, self.icon);
        }
        if (output.mo1132s(serialDesc, 2) || self.title != null) {
            z3 = true;
        }
        if (z3) {
            output.mo1173E(serialDesc, 2, MarkdownToHtmlSerializer.INSTANCE, self.title);
        }
    }

    public final String component1() {
        return this.content;
    }

    public final Image component2() {
        return this.icon;
    }

    public final String component3() {
        return this.title;
    }

    public final Bullet copy(String str, Image image, String str2) {
        return new Bullet(str, image, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Bullet) {
            Bullet bullet = (Bullet) obj;
            return Intrinsics.areEqual(this.content, bullet.content) && Intrinsics.areEqual(this.icon, bullet.icon) && Intrinsics.areEqual(this.title, bullet.title);
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.content;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.icon;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.title;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.content;
        Image image = this.icon;
        String str2 = this.title;
        return "Bullet(content=" + str + ", icon=" + image + ", title=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.content);
        Image image = this.icon;
        if (image == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image.writeToParcel(out, i);
        }
        out.writeString(this.title);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Bullet(int i, @InterfaceC36694Vs5("content") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str, @InterfaceC36694Vs5("icon") Image image, @InterfaceC36694Vs5("title") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str2, C38819bt5 c38819bt5) {
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, Bullet$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
    }

    public Bullet(String str, Image image, String str2) {
        this.content = str;
        this.icon = image;
        this.title = str2;
    }

    public /* synthetic */ Bullet(String str, Image image, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : image, (i & 4) != 0 ? null : str2);
    }
}
