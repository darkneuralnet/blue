package com.stripe.android.financialconnections.domain;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.Image$$serializer;
import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&B3\b\u0017\u0012\u0006\u0010'\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011HÖ\u0001R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR \u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010!\u0012\u0004\b$\u0010 \u001a\u0004\b\"\u0010#¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/Cta;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/Image;", "component1", "", "component2", "icon", Entry.TYPE_TEXT, "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/Image;", "getIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getIcon$annotations", "()V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getText$annotations", "<init>", "(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Cta implements Parcelable {
    private final Image icon;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Cta> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/Cta$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/domain/Cta;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<Cta> serializer() {
            return Cta$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Cta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cta createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Cta(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cta[] newArray(int i) {
            return new Cta[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Cta(int i, @InterfaceC36694Vs5("icon") Image image, @InterfaceC36694Vs5("text") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str, C38819bt5 c38819bt5) {
        if (2 != (i & 2)) {
            C52838zW3.m1275b(i, 2, Cta$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        this.text = str;
    }

    public static /* synthetic */ Cta copy$default(Cta cta, Image image, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            image = cta.icon;
        }
        if ((i & 2) != 0) {
            str = cta.text;
        }
        return cta.copy(image, str);
    }

    @InterfaceC36694Vs5("icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC36694Vs5(Entry.TYPE_TEXT)
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getText$annotations() {
    }

    @JvmStatic
    public static final void write$Self(Cta self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.mo1132s(serialDesc, 0) || self.icon != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 0, Image$$serializer.INSTANCE, self.icon);
        }
        output.mo1126y(serialDesc, 1, MarkdownToHtmlSerializer.INSTANCE, self.text);
    }

    public final Image component1() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final Cta copy(Image image, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new Cta(image, text);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cta) {
            Cta cta = (Cta) obj;
            return Intrinsics.areEqual(this.icon, cta.icon) && Intrinsics.areEqual(this.text, cta.text);
        }
        return false;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        Image image = this.icon;
        return ((image == null ? 0 : image.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        Image image = this.icon;
        String str = this.text;
        return "Cta(icon=" + image + ", text=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Image image = this.icon;
        if (image == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image.writeToParcel(out, i);
        }
        out.writeString(this.text);
    }

    public Cta(Image image, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.icon = image;
        this.text = text;
    }

    public /* synthetic */ Cta(Image image, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : image, str);
    }
}
