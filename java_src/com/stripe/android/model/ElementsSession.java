package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/model/ElementsSession;", "Lcom/stripe/android/core/model/StripeModel;", "linkSettings", "Lcom/stripe/android/model/ElementsSession$LinkSettings;", "paymentMethodSpecs", "", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "(Lcom/stripe/android/model/ElementsSession$LinkSettings;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V", "getLinkSettings", "()Lcom/stripe/android/model/ElementsSession$LinkSettings;", "getPaymentMethodSpecs", "()Ljava/lang/String;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "LinkSettings", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ElementsSession implements StripeModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ElementsSession> CREATOR = new Creator();
    private final LinkSettings linkSettings;
    private final String paymentMethodSpecs;
    private final StripeIntent stripeIntent;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ElementsSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ElementsSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ElementsSession(parcel.readInt() == 0 ? null : LinkSettings.CREATOR.createFromParcel(parcel), parcel.readString(), (StripeIntent) parcel.readParcelable(ElementsSession.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ElementsSession[] newArray(int i) {
            return new ElementsSession[i];
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/model/ElementsSession$LinkSettings;", "Lcom/stripe/android/core/model/StripeModel;", "linkFundingSources", "", "", "(Ljava/util/List;)V", "getLinkFundingSources", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class LinkSettings implements StripeModel {
        public static final int $stable = 8;
        public static final Parcelable.Creator<LinkSettings> CREATOR = new Creator();
        private final List<String> linkFundingSources;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<LinkSettings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkSettings createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkSettings(parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkSettings[] newArray(int i) {
                return new LinkSettings[i];
            }
        }

        public LinkSettings(List<String> linkFundingSources) {
            Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
            this.linkFundingSources = linkFundingSources;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LinkSettings copy$default(LinkSettings linkSettings, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = linkSettings.linkFundingSources;
            }
            return linkSettings.copy(list);
        }

        public final List<String> component1() {
            return this.linkFundingSources;
        }

        public final LinkSettings copy(List<String> linkFundingSources) {
            Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
            return new LinkSettings(linkFundingSources);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkSettings) && Intrinsics.areEqual(this.linkFundingSources, ((LinkSettings) obj).linkFundingSources);
        }

        public final List<String> getLinkFundingSources() {
            return this.linkFundingSources;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            return this.linkFundingSources.hashCode();
        }

        public String toString() {
            List<String> list = this.linkFundingSources;
            return "LinkSettings(linkFundingSources=" + list + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeStringList(this.linkFundingSources);
        }
    }

    public ElementsSession(LinkSettings linkSettings, String str, StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        this.linkSettings = linkSettings;
        this.paymentMethodSpecs = str;
        this.stripeIntent = stripeIntent;
    }

    public static /* synthetic */ ElementsSession copy$default(ElementsSession elementsSession, LinkSettings linkSettings, String str, StripeIntent stripeIntent, int i, Object obj) {
        if ((i & 1) != 0) {
            linkSettings = elementsSession.linkSettings;
        }
        if ((i & 2) != 0) {
            str = elementsSession.paymentMethodSpecs;
        }
        if ((i & 4) != 0) {
            stripeIntent = elementsSession.stripeIntent;
        }
        return elementsSession.copy(linkSettings, str, stripeIntent);
    }

    public final LinkSettings component1() {
        return this.linkSettings;
    }

    public final String component2() {
        return this.paymentMethodSpecs;
    }

    public final StripeIntent component3() {
        return this.stripeIntent;
    }

    public final ElementsSession copy(LinkSettings linkSettings, String str, StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        return new ElementsSession(linkSettings, str, stripeIntent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ElementsSession) {
            ElementsSession elementsSession = (ElementsSession) obj;
            return Intrinsics.areEqual(this.linkSettings, elementsSession.linkSettings) && Intrinsics.areEqual(this.paymentMethodSpecs, elementsSession.paymentMethodSpecs) && Intrinsics.areEqual(this.stripeIntent, elementsSession.stripeIntent);
        }
        return false;
    }

    public final LinkSettings getLinkSettings() {
        return this.linkSettings;
    }

    public final String getPaymentMethodSpecs() {
        return this.paymentMethodSpecs;
    }

    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        LinkSettings linkSettings = this.linkSettings;
        int hashCode = (linkSettings == null ? 0 : linkSettings.hashCode()) * 31;
        String str = this.paymentMethodSpecs;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.stripeIntent.hashCode();
    }

    public String toString() {
        LinkSettings linkSettings = this.linkSettings;
        String str = this.paymentMethodSpecs;
        StripeIntent stripeIntent = this.stripeIntent;
        return "ElementsSession(linkSettings=" + linkSettings + ", paymentMethodSpecs=" + str + ", stripeIntent=" + stripeIntent + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        LinkSettings linkSettings = this.linkSettings;
        if (linkSettings == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkSettings.writeToParcel(out, i);
        }
        out.writeString(this.paymentMethodSpecs);
        out.writeParcelable(this.stripeIntent, i);
    }
}
