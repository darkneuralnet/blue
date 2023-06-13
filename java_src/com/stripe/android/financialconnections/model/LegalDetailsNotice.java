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
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 32\u00020\u0001:\u000243B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.BK\b\u0017\u0012\u0006\u0010/\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b-\u00102J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015HÖ\u0001R \u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010%\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010'R \u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010%\u0012\u0004\b,\u0010$\u001a\u0004\b+\u0010'¨\u00065"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/LegalDetailsBody;", "component1", "", "component2", "component3", "component4", "body", "title", "cta", "learnMore", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/LegalDetailsBody;", "getBody", "()Lcom/stripe/android/financialconnections/model/LegalDetailsBody;", "getBody$annotations", "()V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "getCta", "getCta$annotations", "getLearnMore", "getLearnMore$annotations", "<init>", "(Lcom/stripe/android/financialconnections/model/LegalDetailsBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/LegalDetailsBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class LegalDetailsNotice implements Parcelable {
    private final LegalDetailsBody body;
    private final String cta;
    private final String learnMore;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LegalDetailsNotice> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LegalDetailsNotice$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<LegalDetailsNotice> serializer() {
            return LegalDetailsNotice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<LegalDetailsNotice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegalDetailsNotice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LegalDetailsNotice(LegalDetailsBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegalDetailsNotice[] newArray(int i) {
            return new LegalDetailsNotice[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LegalDetailsNotice(int i, @InterfaceC36694Vs5("body") LegalDetailsBody legalDetailsBody, @InterfaceC36694Vs5("title") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str, @InterfaceC36694Vs5("cta") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str2, @InterfaceC36694Vs5("learn_more") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str3, C38819bt5 c38819bt5) {
        if (15 != (i & 15)) {
            C52838zW3.m1275b(i, 15, LegalDetailsNotice$$serializer.INSTANCE.getDescriptor());
        }
        this.body = legalDetailsBody;
        this.title = str;
        this.cta = str2;
        this.learnMore = str3;
    }

    public static /* synthetic */ LegalDetailsNotice copy$default(LegalDetailsNotice legalDetailsNotice, LegalDetailsBody legalDetailsBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            legalDetailsBody = legalDetailsNotice.body;
        }
        if ((i & 2) != 0) {
            str = legalDetailsNotice.title;
        }
        if ((i & 4) != 0) {
            str2 = legalDetailsNotice.cta;
        }
        if ((i & 8) != 0) {
            str3 = legalDetailsNotice.learnMore;
        }
        return legalDetailsNotice.copy(legalDetailsBody, str, str2, str3);
    }

    @InterfaceC36694Vs5("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @InterfaceC36694Vs5("cta")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getCta$annotations() {
    }

    @InterfaceC36694Vs5("learn_more")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getLearnMore$annotations() {
    }

    @InterfaceC36694Vs5("title")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final void write$Self(LegalDetailsNotice self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1126y(serialDesc, 0, LegalDetailsBody$$serializer.INSTANCE, self.body);
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        output.mo1126y(serialDesc, 1, markdownToHtmlSerializer, self.title);
        output.mo1126y(serialDesc, 2, markdownToHtmlSerializer, self.cta);
        output.mo1126y(serialDesc, 3, markdownToHtmlSerializer, self.learnMore);
    }

    public final LegalDetailsBody component1() {
        return this.body;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.cta;
    }

    public final String component4() {
        return this.learnMore;
    }

    public final LegalDetailsNotice copy(LegalDetailsBody body, String title, String cta, String learnMore) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        return new LegalDetailsNotice(body, title, cta, learnMore);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegalDetailsNotice) {
            LegalDetailsNotice legalDetailsNotice = (LegalDetailsNotice) obj;
            return Intrinsics.areEqual(this.body, legalDetailsNotice.body) && Intrinsics.areEqual(this.title, legalDetailsNotice.title) && Intrinsics.areEqual(this.cta, legalDetailsNotice.cta) && Intrinsics.areEqual(this.learnMore, legalDetailsNotice.learnMore);
        }
        return false;
    }

    public final LegalDetailsBody getBody() {
        return this.body;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getLearnMore() {
        return this.learnMore;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.body.hashCode() * 31) + this.title.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.learnMore.hashCode();
    }

    public String toString() {
        LegalDetailsBody legalDetailsBody = this.body;
        String str = this.title;
        String str2 = this.cta;
        String str3 = this.learnMore;
        return "LegalDetailsNotice(body=" + legalDetailsBody + ", title=" + str + ", cta=" + str2 + ", learnMore=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.body.writeToParcel(out, i);
        out.writeString(this.title);
        out.writeString(this.cta);
        out.writeString(this.learnMore);
    }

    public LegalDetailsNotice(LegalDetailsBody body, String title, String cta, String learnMore) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        this.body = body;
        this.title = title;
        this.cta = cta;
        this.learnMore = learnMore;
    }
}
