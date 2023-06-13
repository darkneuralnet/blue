package com.stripe.android.financialconnections.domain;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNotice$$serializer;
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
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 G2\u00020\u0001:\u0002HGBC\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\bA\u0010BBc\b\u0017\u0012\u0006\u0010C\u001a\u00020\u001d\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bA\u0010FJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0013HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010#\u001a\u00020\u001dHÖ\u0001J\u0019\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001dHÖ\u0001R \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R \u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/R\"\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00101\u0012\u0004\b4\u0010,\u001a\u0004\b2\u00103R\"\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00105\u0012\u0004\b8\u0010,\u001a\u0004\b6\u00107R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00109\u0012\u0004\b<\u0010,\u001a\u0004\b:\u0010;R \u0010\u001a\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010=\u0012\u0004\b@\u0010,\u001a\u0004\b>\u0010?¨\u0006I"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/OauthPrepane;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/domain/Body;", "component1", "Lcom/stripe/android/financialconnections/domain/Cta;", "component2", "Lcom/stripe/android/financialconnections/model/Image;", "component3", "Lcom/stripe/android/financialconnections/domain/PartnerNotice;", "component4", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "component5", "", "component6", "body", "cta", "institutionIcon", "partnerNotice", "dataAccessNotice", "title", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/domain/Body;", "getBody", "()Lcom/stripe/android/financialconnections/domain/Body;", "getBody$annotations", "()V", "Lcom/stripe/android/financialconnections/domain/Cta;", "getCta", "()Lcom/stripe/android/financialconnections/domain/Cta;", "getCta$annotations", "Lcom/stripe/android/financialconnections/model/Image;", "getInstitutionIcon", "()Lcom/stripe/android/financialconnections/model/Image;", "getInstitutionIcon$annotations", "Lcom/stripe/android/financialconnections/domain/PartnerNotice;", "getPartnerNotice", "()Lcom/stripe/android/financialconnections/domain/PartnerNotice;", "getPartnerNotice$annotations", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "getDataAccessNotice$annotations", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "<init>", "(Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class OauthPrepane implements Parcelable {
    private final Body body;
    private final Cta cta;
    private final DataAccessNotice dataAccessNotice;
    private final Image institutionIcon;
    private final PartnerNotice partnerNotice;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OauthPrepane> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/OauthPrepane$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/domain/OauthPrepane;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<OauthPrepane> serializer() {
            return OauthPrepane$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OauthPrepane> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OauthPrepane createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OauthPrepane(Body.CREATOR.createFromParcel(parcel), Cta.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PartnerNotice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DataAccessNotice.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OauthPrepane[] newArray(int i) {
            return new OauthPrepane[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ OauthPrepane(int i, @InterfaceC36694Vs5("body") Body body, @InterfaceC36694Vs5("cta") Cta cta, @InterfaceC36694Vs5("institution_icon") Image image, @InterfaceC36694Vs5("partner_notice") PartnerNotice partnerNotice, @InterfaceC36694Vs5("data_access_notice") DataAccessNotice dataAccessNotice, @InterfaceC36694Vs5("title") @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class) String str, C38819bt5 c38819bt5) {
        if (35 != (i & 35)) {
            C52838zW3.m1275b(i, 35, OauthPrepane$$serializer.INSTANCE.getDescriptor());
        }
        this.body = body;
        this.cta = cta;
        if ((i & 4) == 0) {
            this.institutionIcon = null;
        } else {
            this.institutionIcon = image;
        }
        if ((i & 8) == 0) {
            this.partnerNotice = null;
        } else {
            this.partnerNotice = partnerNotice;
        }
        if ((i & 16) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        this.title = str;
    }

    public static /* synthetic */ OauthPrepane copy$default(OauthPrepane oauthPrepane, Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            body = oauthPrepane.body;
        }
        if ((i & 2) != 0) {
            cta = oauthPrepane.cta;
        }
        Cta cta2 = cta;
        if ((i & 4) != 0) {
            image = oauthPrepane.institutionIcon;
        }
        Image image2 = image;
        if ((i & 8) != 0) {
            partnerNotice = oauthPrepane.partnerNotice;
        }
        PartnerNotice partnerNotice2 = partnerNotice;
        if ((i & 16) != 0) {
            dataAccessNotice = oauthPrepane.dataAccessNotice;
        }
        DataAccessNotice dataAccessNotice2 = dataAccessNotice;
        if ((i & 32) != 0) {
            str = oauthPrepane.title;
        }
        return oauthPrepane.copy(body, cta2, image2, partnerNotice2, dataAccessNotice2, str);
    }

    @InterfaceC36694Vs5("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @InterfaceC36694Vs5("cta")
    public static /* synthetic */ void getCta$annotations() {
    }

    @InterfaceC36694Vs5("data_access_notice")
    public static /* synthetic */ void getDataAccessNotice$annotations() {
    }

    @InterfaceC36694Vs5("institution_icon")
    public static /* synthetic */ void getInstitutionIcon$annotations() {
    }

    @InterfaceC36694Vs5("partner_notice")
    public static /* synthetic */ void getPartnerNotice$annotations() {
    }

    @InterfaceC36694Vs5("title")
    @InterfaceC36928Ws5(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final void write$Self(OauthPrepane self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z3 = false;
        output.mo1126y(serialDesc, 0, Body$$serializer.INSTANCE, self.body);
        output.mo1126y(serialDesc, 1, Cta$$serializer.INSTANCE, self.cta);
        if (output.mo1132s(serialDesc, 2) || self.institutionIcon != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 2, Image$$serializer.INSTANCE, self.institutionIcon);
        }
        if (output.mo1132s(serialDesc, 3) || self.partnerNotice != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo1173E(serialDesc, 3, PartnerNotice$$serializer.INSTANCE, self.partnerNotice);
        }
        if (output.mo1132s(serialDesc, 4) || self.dataAccessNotice != null) {
            z3 = true;
        }
        if (z3) {
            output.mo1173E(serialDesc, 4, DataAccessNotice$$serializer.INSTANCE, self.dataAccessNotice);
        }
        output.mo1126y(serialDesc, 5, MarkdownToHtmlSerializer.INSTANCE, self.title);
    }

    public final Body component1() {
        return this.body;
    }

    public final Cta component2() {
        return this.cta;
    }

    public final Image component3() {
        return this.institutionIcon;
    }

    public final PartnerNotice component4() {
        return this.partnerNotice;
    }

    public final DataAccessNotice component5() {
        return this.dataAccessNotice;
    }

    public final String component6() {
        return this.title;
    }

    public final OauthPrepane copy(Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String title) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(title, "title");
        return new OauthPrepane(body, cta, image, partnerNotice, dataAccessNotice, title);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OauthPrepane) {
            OauthPrepane oauthPrepane = (OauthPrepane) obj;
            return Intrinsics.areEqual(this.body, oauthPrepane.body) && Intrinsics.areEqual(this.cta, oauthPrepane.cta) && Intrinsics.areEqual(this.institutionIcon, oauthPrepane.institutionIcon) && Intrinsics.areEqual(this.partnerNotice, oauthPrepane.partnerNotice) && Intrinsics.areEqual(this.dataAccessNotice, oauthPrepane.dataAccessNotice) && Intrinsics.areEqual(this.title, oauthPrepane.title);
        }
        return false;
    }

    public final Body getBody() {
        return this.body;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    public final Image getInstitutionIcon() {
        return this.institutionIcon;
    }

    public final PartnerNotice getPartnerNotice() {
        return this.partnerNotice;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.body.hashCode() * 31) + this.cta.hashCode()) * 31;
        Image image = this.institutionIcon;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        PartnerNotice partnerNotice = this.partnerNotice;
        int hashCode3 = (hashCode2 + (partnerNotice == null ? 0 : partnerNotice.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        return ((hashCode3 + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        Body body = this.body;
        Cta cta = this.cta;
        Image image = this.institutionIcon;
        PartnerNotice partnerNotice = this.partnerNotice;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        String str = this.title;
        return "OauthPrepane(body=" + body + ", cta=" + cta + ", institutionIcon=" + image + ", partnerNotice=" + partnerNotice + ", dataAccessNotice=" + dataAccessNotice + ", title=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.body.writeToParcel(out, i);
        this.cta.writeToParcel(out, i);
        Image image = this.institutionIcon;
        if (image == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image.writeToParcel(out, i);
        }
        PartnerNotice partnerNotice = this.partnerNotice;
        if (partnerNotice == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            partnerNotice.writeToParcel(out, i);
        }
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dataAccessNotice.writeToParcel(out, i);
        }
        out.writeString(this.title);
    }

    public OauthPrepane(Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String title) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(title, "title");
        this.body = body;
        this.cta = cta;
        this.institutionIcon = image;
        this.partnerNotice = partnerNotice;
        this.dataAccessNotice = dataAccessNotice;
        this.title = title;
    }

    public /* synthetic */ OauthPrepane(Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(body, cta, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : partnerNotice, (i & 16) != 0 ? null : dataAccessNotice, str);
    }
}
