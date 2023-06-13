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
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 B'\b\u0017\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/TextUpdate;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "component1", "consent", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "getConsent", "()Lcom/stripe/android/financialconnections/model/ConsentPane;", "getConsent$annotations", "()V", "<init>", "(Lcom/stripe/android/financialconnections/model/ConsentPane;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/ConsentPane;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class TextUpdate implements Parcelable {
    private final ConsentPane consent;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TextUpdate> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<TextUpdate> serializer() {
            return TextUpdate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<TextUpdate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextUpdate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextUpdate(parcel.readInt() == 0 ? null : ConsentPane.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextUpdate[] newArray(int i) {
            return new TextUpdate[i];
        }
    }

    public TextUpdate() {
        this((ConsentPane) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TextUpdate copy$default(TextUpdate textUpdate, ConsentPane consentPane, int i, Object obj) {
        if ((i & 1) != 0) {
            consentPane = textUpdate.consent;
        }
        return textUpdate.copy(consentPane);
    }

    @InterfaceC36694Vs5("consent_pane")
    public static /* synthetic */ void getConsent$annotations() {
    }

    @JvmStatic
    public static final void write$Self(TextUpdate self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z = true;
        if (!output.mo1132s(serialDesc, 0) && self.consent == null) {
            z = false;
        }
        if (z) {
            output.mo1173E(serialDesc, 0, ConsentPane$$serializer.INSTANCE, self.consent);
        }
    }

    public final ConsentPane component1() {
        return this.consent;
    }

    public final TextUpdate copy(ConsentPane consentPane) {
        return new TextUpdate(consentPane);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextUpdate) && Intrinsics.areEqual(this.consent, ((TextUpdate) obj).consent);
    }

    public final ConsentPane getConsent() {
        return this.consent;
    }

    public int hashCode() {
        ConsentPane consentPane = this.consent;
        if (consentPane == null) {
            return 0;
        }
        return consentPane.hashCode();
    }

    public String toString() {
        ConsentPane consentPane = this.consent;
        return "TextUpdate(consent=" + consentPane + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        ConsentPane consentPane = this.consent;
        if (consentPane == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        consentPane.writeToParcel(out, i);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TextUpdate(int i, @InterfaceC36694Vs5("consent_pane") ConsentPane consentPane, C38819bt5 c38819bt5) {
        if ((i & 0) != 0) {
            C52838zW3.m1275b(i, 0, TextUpdate$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.consent = null;
        } else {
            this.consent = consentPane;
        }
    }

    public TextUpdate(ConsentPane consentPane) {
        this.consent = consentPane;
    }

    public /* synthetic */ TextUpdate(ConsentPane consentPane, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : consentPane);
    }
}
