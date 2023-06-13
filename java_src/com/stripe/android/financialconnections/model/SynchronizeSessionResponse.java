package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 32\u00020\u0001:\u000243B#\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b-\u0010.B?\b\u0017\u0012\u0006\u0010/\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b-\u00102J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015HÖ\u0001R \u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+¨\u00065"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "component1", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "component2", "Lcom/stripe/android/financialconnections/model/VisualUpdate;", "component3", "manifest", Entry.TYPE_TEXT, "visual", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "getManifest", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "getManifest$annotations", "()V", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "getText", "()Lcom/stripe/android/financialconnections/model/TextUpdate;", "getText$annotations", "Lcom/stripe/android/financialconnections/model/VisualUpdate;", "getVisual", "()Lcom/stripe/android/financialconnections/model/VisualUpdate;", "getVisual$annotations", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/VisualUpdate;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/VisualUpdate;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class SynchronizeSessionResponse implements Parcelable {
    private final FinancialConnectionsSessionManifest manifest;
    private final TextUpdate text;
    private final VisualUpdate visual;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SynchronizeSessionResponse> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<SynchronizeSessionResponse> serializer() {
            return SynchronizeSessionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<SynchronizeSessionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SynchronizeSessionResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SynchronizeSessionResponse(FinancialConnectionsSessionManifest.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel), VisualUpdate.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SynchronizeSessionResponse[] newArray(int i) {
            return new SynchronizeSessionResponse[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SynchronizeSessionResponse(int i, @InterfaceC36694Vs5("manifest") FinancialConnectionsSessionManifest financialConnectionsSessionManifest, @InterfaceC36694Vs5("text") TextUpdate textUpdate, @InterfaceC36694Vs5("visual") VisualUpdate visualUpdate, C38819bt5 c38819bt5) {
        if (5 != (i & 5)) {
            C52838zW3.m1275b(i, 5, SynchronizeSessionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.manifest = financialConnectionsSessionManifest;
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = textUpdate;
        }
        this.visual = visualUpdate;
    }

    public static /* synthetic */ SynchronizeSessionResponse copy$default(SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, VisualUpdate visualUpdate, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
        }
        if ((i & 2) != 0) {
            textUpdate = synchronizeSessionResponse.text;
        }
        if ((i & 4) != 0) {
            visualUpdate = synchronizeSessionResponse.visual;
        }
        return synchronizeSessionResponse.copy(financialConnectionsSessionManifest, textUpdate, visualUpdate);
    }

    @InterfaceC36694Vs5("manifest")
    public static /* synthetic */ void getManifest$annotations() {
    }

    @InterfaceC36694Vs5(Entry.TYPE_TEXT)
    public static /* synthetic */ void getText$annotations() {
    }

    @InterfaceC36694Vs5("visual")
    public static /* synthetic */ void getVisual$annotations() {
    }

    @JvmStatic
    public static final void write$Self(SynchronizeSessionResponse self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z = false;
        output.mo1126y(serialDesc, 0, FinancialConnectionsSessionManifest$$serializer.INSTANCE, self.manifest);
        if (output.mo1132s(serialDesc, 1) || self.text != null) {
            z = true;
        }
        if (z) {
            output.mo1173E(serialDesc, 1, TextUpdate$$serializer.INSTANCE, self.text);
        }
        output.mo1126y(serialDesc, 2, VisualUpdate$$serializer.INSTANCE, self.visual);
    }

    public final FinancialConnectionsSessionManifest component1() {
        return this.manifest;
    }

    public final TextUpdate component2() {
        return this.text;
    }

    public final VisualUpdate component3() {
        return this.visual;
    }

    public final SynchronizeSessionResponse copy(FinancialConnectionsSessionManifest manifest, TextUpdate textUpdate, VisualUpdate visual) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(visual, "visual");
        return new SynchronizeSessionResponse(manifest, textUpdate, visual);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SynchronizeSessionResponse) {
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
            return Intrinsics.areEqual(this.manifest, synchronizeSessionResponse.manifest) && Intrinsics.areEqual(this.text, synchronizeSessionResponse.text) && Intrinsics.areEqual(this.visual, synchronizeSessionResponse.visual);
        }
        return false;
    }

    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    public final TextUpdate getText() {
        return this.text;
    }

    public final VisualUpdate getVisual() {
        return this.visual;
    }

    public int hashCode() {
        int hashCode = this.manifest.hashCode() * 31;
        TextUpdate textUpdate = this.text;
        return ((hashCode + (textUpdate == null ? 0 : textUpdate.hashCode())) * 31) + this.visual.hashCode();
    }

    public String toString() {
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = this.manifest;
        TextUpdate textUpdate = this.text;
        VisualUpdate visualUpdate = this.visual;
        return "SynchronizeSessionResponse(manifest=" + financialConnectionsSessionManifest + ", text=" + textUpdate + ", visual=" + visualUpdate + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.manifest.writeToParcel(out, i);
        TextUpdate textUpdate = this.text;
        if (textUpdate == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textUpdate.writeToParcel(out, i);
        }
        this.visual.writeToParcel(out, i);
    }

    public SynchronizeSessionResponse(FinancialConnectionsSessionManifest manifest, TextUpdate textUpdate, VisualUpdate visual) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(visual, "visual");
        this.manifest = manifest;
        this.text = textUpdate;
        this.visual = visual;
    }

    public /* synthetic */ SynchronizeSessionResponse(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, VisualUpdate visualUpdate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(financialConnectionsSessionManifest, (i & 2) != 0 ? null : textUpdate, visualUpdate);
    }
}
