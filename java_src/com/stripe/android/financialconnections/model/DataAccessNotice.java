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
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B?\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b5\u00106Bc\b\u0017\u0012\u0006\u00107\u001a\u00020\u0019\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b5\u0010:J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0018\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0019HÖ\u0001J\u0019\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0019HÖ\u0001R \u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R\"\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010)\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010+R \u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010)\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010+R \u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010)\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010+R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010)\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010+¨\u0006="}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;", "component1", "", "component2", "component3", "component4", "component5", "component6", "body", "title", "subtitle", "cta", "learnMore", "connectedAccountNotice", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;", "getBody", "()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;", "getBody$annotations", "()V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getCta", "getCta$annotations", "getLearnMore", "getLearnMore$annotations", "getConnectedAccountNotice", "getConnectedAccountNotice$annotations", "<init>", "(Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class DataAccessNotice implements Parcelable {
    private final DataAccessNoticeBody body;
    private final String connectedAccountNotice;
    private final String cta;
    private final String learnMore;
    private final String subtitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DataAccessNotice> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<DataAccessNotice> serializer() {
            return DataAccessNotice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<DataAccessNotice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataAccessNotice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataAccessNotice(DataAccessNoticeBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataAccessNotice[] newArray(int i) {
            return new DataAccessNotice[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DataAccessNotice(int i, @InterfaceC36694Vs5("body") DataAccessNoticeBody dataAccessNoticeBody, @InterfaceC36694Vs5("title") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str, @InterfaceC36694Vs5("subtitle") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str2, @InterfaceC36694Vs5("cta") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str3, @InterfaceC36694Vs5("learn_more") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str4, @InterfaceC36694Vs5("connected_account_notice") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str5, C38819bt5 c38819bt5) {
        if (27 != (i & 27)) {
            C52838zW3.m1275b(i, 27, DataAccessNotice$$serializer.INSTANCE.getDescriptor());
        }
        this.body = dataAccessNoticeBody;
        this.title = str;
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        this.cta = str3;
        this.learnMore = str4;
        if ((i & 32) == 0) {
            this.connectedAccountNotice = null;
        } else {
            this.connectedAccountNotice = str5;
        }
    }

    public static /* synthetic */ DataAccessNotice copy$default(DataAccessNotice dataAccessNotice, DataAccessNoticeBody dataAccessNoticeBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            dataAccessNoticeBody = dataAccessNotice.body;
        }
        if ((i & 2) != 0) {
            str = dataAccessNotice.title;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = dataAccessNotice.subtitle;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = dataAccessNotice.cta;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = dataAccessNotice.learnMore;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = dataAccessNotice.connectedAccountNotice;
        }
        return dataAccessNotice.copy(dataAccessNoticeBody, str6, str7, str8, str9, str5);
    }

    @InterfaceC36694Vs5("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @InterfaceC36694Vs5("connected_account_notice")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getConnectedAccountNotice$annotations() {
    }

    @InterfaceC36694Vs5("cta")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getCta$annotations() {
    }

    @InterfaceC36694Vs5("learn_more")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getLearnMore$annotations() {
    }

    @InterfaceC36694Vs5("subtitle")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC36694Vs5("title")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final void write$Self(DataAccessNotice self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        output.mo1126y(serialDesc, 0, DataAccessNoticeBody$$serializer.INSTANCE, self.body);
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        output.mo1126y(serialDesc, 1, markdownToHtmlSerializer, self.title);
        if (output.mo1132s(serialDesc, 2) || self.subtitle != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 2, markdownToHtmlSerializer, self.subtitle);
        }
        output.mo1126y(serialDesc, 3, markdownToHtmlSerializer, self.cta);
        output.mo1126y(serialDesc, 4, markdownToHtmlSerializer, self.learnMore);
        if (output.mo1132s(serialDesc, 5) || self.connectedAccountNotice != null) {
            z2 = true;
        }
        if (z2) {
            output.mo1173E(serialDesc, 5, markdownToHtmlSerializer, self.connectedAccountNotice);
        }
    }

    public final DataAccessNoticeBody component1() {
        return this.body;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.cta;
    }

    public final String component5() {
        return this.learnMore;
    }

    public final String component6() {
        return this.connectedAccountNotice;
    }

    public final DataAccessNotice copy(DataAccessNoticeBody body, String title, String str, String cta, String learnMore, String str2) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        return new DataAccessNotice(body, title, str, cta, learnMore, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataAccessNotice) {
            DataAccessNotice dataAccessNotice = (DataAccessNotice) obj;
            return Intrinsics.areEqual(this.body, dataAccessNotice.body) && Intrinsics.areEqual(this.title, dataAccessNotice.title) && Intrinsics.areEqual(this.subtitle, dataAccessNotice.subtitle) && Intrinsics.areEqual(this.cta, dataAccessNotice.cta) && Intrinsics.areEqual(this.learnMore, dataAccessNotice.learnMore) && Intrinsics.areEqual(this.connectedAccountNotice, dataAccessNotice.connectedAccountNotice);
        }
        return false;
    }

    public final DataAccessNoticeBody getBody() {
        return this.body;
    }

    public final String getConnectedAccountNotice() {
        return this.connectedAccountNotice;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getLearnMore() {
        return this.learnMore;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.body.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.subtitle;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cta.hashCode()) * 31) + this.learnMore.hashCode()) * 31;
        String str2 = this.connectedAccountNotice;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        DataAccessNoticeBody dataAccessNoticeBody = this.body;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.cta;
        String str4 = this.learnMore;
        String str5 = this.connectedAccountNotice;
        return "DataAccessNotice(body=" + dataAccessNoticeBody + ", title=" + str + ", subtitle=" + str2 + ", cta=" + str3 + ", learnMore=" + str4 + ", connectedAccountNotice=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.body.writeToParcel(out, i);
        out.writeString(this.title);
        out.writeString(this.subtitle);
        out.writeString(this.cta);
        out.writeString(this.learnMore);
        out.writeString(this.connectedAccountNotice);
    }

    public DataAccessNotice(DataAccessNoticeBody body, String title, String str, String cta, String learnMore, String str2) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        this.body = body;
        this.title = title;
        this.subtitle = str;
        this.cta = cta;
        this.learnMore = learnMore;
        this.connectedAccountNotice = str2;
    }

    public /* synthetic */ DataAccessNotice(DataAccessNoticeBody dataAccessNoticeBody, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataAccessNoticeBody, str, (i & 4) != 0 ? null : str2, str3, str4, (i & 32) != 0 ? null : str5);
    }
}
