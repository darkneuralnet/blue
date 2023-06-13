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
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 E2\u00020\u0001:\u0002FEBC\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b?\u0010@Bo\b\u0017\u0012\u0006\u0010A\u001a\u00020\u001d\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\b?\u0010DJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\tHÆ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010#\u001a\u00020\u001dHÖ\u0001J\u0019\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001dHÖ\u0001R \u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010(\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010*R \u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010/\u0012\u0004\b2\u0010,\u001a\u0004\b0\u00101R \u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010(\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010*R \u0010\u0018\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00105\u0012\u0004\b8\u0010,\u001a\u0004\b6\u00107R \u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00109\u0012\u0004\b<\u0010,\u001a\u0004\b:\u0010;R \u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010(\u0012\u0004\b>\u0010,\u001a\u0004\b=\u0010*¨\u0006G"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/ConsentPane;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "component2", "Lcom/stripe/android/financialconnections/model/ConsentPaneBody;", "component3", "component4", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "component5", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "component6", "component7", "aboveCta", "belowCta", "body", "cta", "dataAccessNotice", "legalDetailsNotice", "title", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "getAboveCta", "()Ljava/lang/String;", "getAboveCta$annotations", "()V", "getBelowCta", "getBelowCta$annotations", "Lcom/stripe/android/financialconnections/model/ConsentPaneBody;", "getBody", "()Lcom/stripe/android/financialconnections/model/ConsentPaneBody;", "getBody$annotations", "getCta", "getCta$annotations", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getDataAccessNotice$annotations", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "getLegalDetailsNotice", "()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "getLegalDetailsNotice$annotations", "getTitle", "getTitle$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ConsentPane implements Parcelable {
    private final String aboveCta;
    private final String belowCta;
    private final ConsentPaneBody body;
    private final String cta;
    private final DataAccessNotice dataAccessNotice;
    private final LegalDetailsNotice legalDetailsNotice;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ConsentPane> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/ConsentPane$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<ConsentPane> serializer() {
            return ConsentPane$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ConsentPane> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsentPane createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentPane(parcel.readString(), parcel.readString(), ConsentPaneBody.CREATOR.createFromParcel(parcel), parcel.readString(), DataAccessNotice.CREATOR.createFromParcel(parcel), LegalDetailsNotice.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsentPane[] newArray(int i) {
            return new ConsentPane[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ConsentPane(int i, @InterfaceC36694Vs5("above_cta") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str, @InterfaceC36694Vs5("below_cta") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str2, @InterfaceC36694Vs5("body") ConsentPaneBody consentPaneBody, @InterfaceC36694Vs5("cta") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str3, @InterfaceC36694Vs5("data_access_notice") DataAccessNotice dataAccessNotice, @InterfaceC36694Vs5("legal_details_notice") LegalDetailsNotice legalDetailsNotice, @InterfaceC36694Vs5("title") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str4, C38819bt5 c38819bt5) {
        if (125 != (i & 125)) {
            C52838zW3.m1275b(i, 125, ConsentPane$$serializer.INSTANCE.getDescriptor());
        }
        this.aboveCta = str;
        if ((i & 2) == 0) {
            this.belowCta = null;
        } else {
            this.belowCta = str2;
        }
        this.body = consentPaneBody;
        this.cta = str3;
        this.dataAccessNotice = dataAccessNotice;
        this.legalDetailsNotice = legalDetailsNotice;
        this.title = str4;
    }

    public static /* synthetic */ ConsentPane copy$default(ConsentPane consentPane, String str, String str2, ConsentPaneBody consentPaneBody, String str3, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consentPane.aboveCta;
        }
        if ((i & 2) != 0) {
            str2 = consentPane.belowCta;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            consentPaneBody = consentPane.body;
        }
        ConsentPaneBody consentPaneBody2 = consentPaneBody;
        if ((i & 8) != 0) {
            str3 = consentPane.cta;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            dataAccessNotice = consentPane.dataAccessNotice;
        }
        DataAccessNotice dataAccessNotice2 = dataAccessNotice;
        if ((i & 32) != 0) {
            legalDetailsNotice = consentPane.legalDetailsNotice;
        }
        LegalDetailsNotice legalDetailsNotice2 = legalDetailsNotice;
        if ((i & 64) != 0) {
            str4 = consentPane.title;
        }
        return consentPane.copy(str, str5, consentPaneBody2, str6, dataAccessNotice2, legalDetailsNotice2, str4);
    }

    @InterfaceC36694Vs5("above_cta")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getAboveCta$annotations() {
    }

    @InterfaceC36694Vs5("below_cta")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getBelowCta$annotations() {
    }

    @InterfaceC36694Vs5("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @InterfaceC36694Vs5("cta")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getCta$annotations() {
    }

    @InterfaceC36694Vs5("data_access_notice")
    public static /* synthetic */ void getDataAccessNotice$annotations() {
    }

    @InterfaceC36694Vs5("legal_details_notice")
    public static /* synthetic */ void getLegalDetailsNotice$annotations() {
    }

    @InterfaceC36694Vs5("title")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final void write$Self(ConsentPane self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        boolean z = false;
        output.mo1126y(serialDesc, 0, markdownToHtmlSerializer, self.aboveCta);
        if (output.mo1132s(serialDesc, 1) || self.belowCta != null) {
            z = true;
        }
        if (z) {
            output.mo1173E(serialDesc, 1, markdownToHtmlSerializer, self.belowCta);
        }
        output.mo1126y(serialDesc, 2, ConsentPaneBody$$serializer.INSTANCE, self.body);
        output.mo1126y(serialDesc, 3, markdownToHtmlSerializer, self.cta);
        output.mo1126y(serialDesc, 4, DataAccessNotice$$serializer.INSTANCE, self.dataAccessNotice);
        output.mo1126y(serialDesc, 5, LegalDetailsNotice$$serializer.INSTANCE, self.legalDetailsNotice);
        output.mo1126y(serialDesc, 6, markdownToHtmlSerializer, self.title);
    }

    public final String component1() {
        return this.aboveCta;
    }

    public final String component2() {
        return this.belowCta;
    }

    public final ConsentPaneBody component3() {
        return this.body;
    }

    public final String component4() {
        return this.cta;
    }

    public final DataAccessNotice component5() {
        return this.dataAccessNotice;
    }

    public final LegalDetailsNotice component6() {
        return this.legalDetailsNotice;
    }

    public final String component7() {
        return this.title;
    }

    public final ConsentPane copy(String aboveCta, String str, ConsentPaneBody body, String cta, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String title) {
        Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(dataAccessNotice, "dataAccessNotice");
        Intrinsics.checkNotNullParameter(legalDetailsNotice, "legalDetailsNotice");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ConsentPane(aboveCta, str, body, cta, dataAccessNotice, legalDetailsNotice, title);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentPane) {
            ConsentPane consentPane = (ConsentPane) obj;
            return Intrinsics.areEqual(this.aboveCta, consentPane.aboveCta) && Intrinsics.areEqual(this.belowCta, consentPane.belowCta) && Intrinsics.areEqual(this.body, consentPane.body) && Intrinsics.areEqual(this.cta, consentPane.cta) && Intrinsics.areEqual(this.dataAccessNotice, consentPane.dataAccessNotice) && Intrinsics.areEqual(this.legalDetailsNotice, consentPane.legalDetailsNotice) && Intrinsics.areEqual(this.title, consentPane.title);
        }
        return false;
    }

    public final String getAboveCta() {
        return this.aboveCta;
    }

    public final String getBelowCta() {
        return this.belowCta;
    }

    public final ConsentPaneBody getBody() {
        return this.body;
    }

    public final String getCta() {
        return this.cta;
    }

    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    public final LegalDetailsNotice getLegalDetailsNotice() {
        return this.legalDetailsNotice;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.aboveCta.hashCode() * 31;
        String str = this.belowCta;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.body.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.dataAccessNotice.hashCode()) * 31) + this.legalDetailsNotice.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        String str = this.aboveCta;
        String str2 = this.belowCta;
        ConsentPaneBody consentPaneBody = this.body;
        String str3 = this.cta;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
        String str4 = this.title;
        return "ConsentPane(aboveCta=" + str + ", belowCta=" + str2 + ", body=" + consentPaneBody + ", cta=" + str3 + ", dataAccessNotice=" + dataAccessNotice + ", legalDetailsNotice=" + legalDetailsNotice + ", title=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.aboveCta);
        out.writeString(this.belowCta);
        this.body.writeToParcel(out, i);
        out.writeString(this.cta);
        this.dataAccessNotice.writeToParcel(out, i);
        this.legalDetailsNotice.writeToParcel(out, i);
        out.writeString(this.title);
    }

    public ConsentPane(String aboveCta, String str, ConsentPaneBody body, String cta, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String title) {
        Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(dataAccessNotice, "dataAccessNotice");
        Intrinsics.checkNotNullParameter(legalDetailsNotice, "legalDetailsNotice");
        Intrinsics.checkNotNullParameter(title, "title");
        this.aboveCta = aboveCta;
        this.belowCta = str;
        this.body = body;
        this.cta = cta;
        this.dataAccessNotice = dataAccessNotice;
        this.legalDetailsNotice = legalDetailsNotice;
        this.title = title;
    }

    public /* synthetic */ ConsentPane(String str, String str2, ConsentPaneBody consentPaneBody, String str3, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, consentPaneBody, str3, dataAccessNotice, legalDetailsNotice, str4);
    }
}
