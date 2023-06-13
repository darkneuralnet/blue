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
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&B3\b\u0017\u0012\u0006\u0010'\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011HÖ\u0001R \u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR \u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010!\u0012\u0004\b$\u0010 \u001a\u0004\b\"\u0010#¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PartnerNotice;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/Image;", "component1", "", "component2", "partnerIcon", Entry.TYPE_TEXT, "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/Image;", "getPartnerIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getPartnerIcon$annotations", "()V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getText$annotations", "<init>", "(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PartnerNotice implements Parcelable {
    private final Image partnerIcon;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PartnerNotice> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PartnerNotice$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/domain/PartnerNotice;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<PartnerNotice> serializer() {
            return PartnerNotice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<PartnerNotice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerNotice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PartnerNotice(Image.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerNotice[] newArray(int i) {
            return new PartnerNotice[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PartnerNotice(int i, @InterfaceC36694Vs5("partner_icon") Image image, @InterfaceC36694Vs5("text") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str, C38819bt5 c38819bt5) {
        if (3 != (i & 3)) {
            C52838zW3.m1275b(i, 3, PartnerNotice$$serializer.INSTANCE.getDescriptor());
        }
        this.partnerIcon = image;
        this.text = str;
    }

    public static /* synthetic */ PartnerNotice copy$default(PartnerNotice partnerNotice, Image image, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            image = partnerNotice.partnerIcon;
        }
        if ((i & 2) != 0) {
            str = partnerNotice.text;
        }
        return partnerNotice.copy(image, str);
    }

    @InterfaceC36694Vs5("partner_icon")
    public static /* synthetic */ void getPartnerIcon$annotations() {
    }

    @InterfaceC36694Vs5(Entry.TYPE_TEXT)
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getText$annotations() {
    }

    @JvmStatic
    public static final void write$Self(PartnerNotice self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1126y(serialDesc, 0, Image$$serializer.INSTANCE, self.partnerIcon);
        output.mo1126y(serialDesc, 1, MarkdownToHtmlSerializer.INSTANCE, self.text);
    }

    public final Image component1() {
        return this.partnerIcon;
    }

    public final String component2() {
        return this.text;
    }

    public final PartnerNotice copy(Image partnerIcon, String text) {
        Intrinsics.checkNotNullParameter(partnerIcon, "partnerIcon");
        Intrinsics.checkNotNullParameter(text, "text");
        return new PartnerNotice(partnerIcon, text);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerNotice) {
            PartnerNotice partnerNotice = (PartnerNotice) obj;
            return Intrinsics.areEqual(this.partnerIcon, partnerNotice.partnerIcon) && Intrinsics.areEqual(this.text, partnerNotice.text);
        }
        return false;
    }

    public final Image getPartnerIcon() {
        return this.partnerIcon;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.partnerIcon.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        Image image = this.partnerIcon;
        String str = this.text;
        return "PartnerNotice(partnerIcon=" + image + ", text=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.partnerIcon.writeToParcel(out, i);
        out.writeString(this.text);
    }

    public PartnerNotice(Image partnerIcon, String text) {
        Intrinsics.checkNotNullParameter(partnerIcon, "partnerIcon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.partnerIcon = partnerIcon;
        this.text = text;
    }
}
