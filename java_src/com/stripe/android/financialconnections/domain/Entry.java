package com.stripe.android.financialconnections.domain;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.Image$$serializer;
import com.stripe.android.financialconnections.model.serializer.EntrySerializer;
import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5(with = EntrySerializer.class)
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/Entry;", "Landroid/os/Parcelable;", "()V", "Companion", "Image", "Text", "Lcom/stripe/android/financialconnections/domain/Entry$Image;", "Lcom/stripe/android/financialconnections/domain/Entry$Text;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class Entry implements Parcelable {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_TEXT = "text";

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/Entry$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/domain/Entry;", "serializer", "", "TYPE_IMAGE", "Ljava/lang/String;", "TYPE_TEXT", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<Entry> serializer() {
            return EntrySerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002%$B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fB%\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/Entry$Image;", "Lcom/stripe/android/financialconnections/domain/Entry;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/Image;", "component1", "content", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/Image;", "getContent", "()Lcom/stripe/android/financialconnections/model/Image;", "<init>", "(Lcom/stripe/android/financialconnections/model/Image;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/Image;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @InterfaceC36928Ws5
    /* loaded from: classes7.dex */
    public static final class Image extends Entry {
        private final com.stripe.android.financialconnections.model.Image content;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/Entry$Image$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/domain/Entry$Image;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC34036Kj2<Image> serializer() {
                return Entry$Image$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Image(com.stripe.android.financialconnections.model.Image.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i) {
                return new Image[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Image(int i, com.stripe.android.financialconnections.model.Image image, C38819bt5 c38819bt5) {
            super(null);
            if (1 != (i & 1)) {
                C52838zW3.m1275b(i, 1, Entry$Image$$serializer.INSTANCE.getDescriptor());
            }
            this.content = image;
        }

        public static /* synthetic */ Image copy$default(Image image, com.stripe.android.financialconnections.model.Image image2, int i, Object obj) {
            if ((i & 1) != 0) {
                image2 = image.content;
            }
            return image.copy(image2);
        }

        @JvmStatic
        public static final void write$Self(Image self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.mo1126y(serialDesc, 0, Image$$serializer.INSTANCE, self.content);
        }

        public final com.stripe.android.financialconnections.model.Image component1() {
            return this.content;
        }

        public final Image copy(com.stripe.android.financialconnections.model.Image content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Image(content);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && Intrinsics.areEqual(this.content, ((Image) obj).content);
        }

        public final com.stripe.android.financialconnections.model.Image getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            com.stripe.android.financialconnections.model.Image image = this.content;
            return "Image(content=" + image + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.content.writeToParcel(out, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(com.stripe.android.financialconnections.model.Image content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }

    @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002&%B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 B'\b\u0017\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/Entry$Text;", "Lcom/stripe/android/financialconnections/domain/Entry;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "content", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "getContent$annotations", "()V", "<init>", "(Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @InterfaceC36928Ws5
    /* loaded from: classes7.dex */
    public static final class Text extends Entry {
        private final String content;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Text> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/Entry$Text$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/domain/Entry$Text;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC34036Kj2<Text> serializer() {
                return Entry$Text$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Text> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i) {
                return new Text[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Text(int i, @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str, C38819bt5 c38819bt5) {
            super(null);
            if (1 != (i & 1)) {
                C52838zW3.m1275b(i, 1, Entry$Text$$serializer.INSTANCE.getDescriptor());
            }
            this.content = str;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.content;
            }
            return text.copy(str);
        }

        @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
        public static /* synthetic */ void getContent$annotations() {
        }

        @JvmStatic
        public static final void write$Self(Text self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.mo1126y(serialDesc, 0, MarkdownToHtmlSerializer.INSTANCE, self.content);
        }

        public final String component1() {
            return this.content;
        }

        public final Text copy(String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Text(content);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && Intrinsics.areEqual(this.content, ((Text) obj).content);
        }

        public final String getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            String str = this.content;
            return "Text(content=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.content);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }

    public /* synthetic */ Entry(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Entry() {
    }
}
