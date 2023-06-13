package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b%\u0010&B7\b\u0017\u0012\u0006\u0010'\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u000e\u001a\u00020\t\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012HÖ\u0001R \u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010!\u0012\u0004\b$\u0010 \u001a\u0004\b\"\u0010#¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/VisualUpdate;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "", "", "component2", "reducedBranding", "merchantLogos", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Z", "getReducedBranding", "()Z", "getReducedBranding$annotations", "()V", "Ljava/util/List;", "getMerchantLogos", "()Ljava/util/List;", "getMerchantLogos$annotations", "<init>", "(ZLjava/util/List;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(IZLjava/util/List;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class VisualUpdate implements Parcelable {
    private final List<String> merchantLogos;
    private final boolean reducedBranding;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VisualUpdate> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/VisualUpdate$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/VisualUpdate;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<VisualUpdate> serializer() {
            return VisualUpdate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<VisualUpdate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VisualUpdate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VisualUpdate(parcel.readInt() != 0, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VisualUpdate[] newArray(int i) {
            return new VisualUpdate[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ VisualUpdate(int i, @InterfaceC36694Vs5("reduced_branding") boolean z, @InterfaceC36694Vs5("merchant_logo") List list, C38819bt5 c38819bt5) {
        if (3 != (i & 3)) {
            C52838zW3.m1275b(i, 3, VisualUpdate$$serializer.INSTANCE.getDescriptor());
        }
        this.reducedBranding = z;
        this.merchantLogos = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisualUpdate copy$default(VisualUpdate visualUpdate, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = visualUpdate.reducedBranding;
        }
        if ((i & 2) != 0) {
            list = visualUpdate.merchantLogos;
        }
        return visualUpdate.copy(z, list);
    }

    @InterfaceC36694Vs5("merchant_logo")
    public static /* synthetic */ void getMerchantLogos$annotations() {
    }

    @InterfaceC36694Vs5("reduced_branding")
    public static /* synthetic */ void getReducedBranding$annotations() {
    }

    @JvmStatic
    public static final void write$Self(VisualUpdate self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1129v(serialDesc, 0, self.reducedBranding);
        output.mo1126y(serialDesc, 1, new C27999ro(C41539gS5.f82260a), self.merchantLogos);
    }

    public final boolean component1() {
        return this.reducedBranding;
    }

    public final List<String> component2() {
        return this.merchantLogos;
    }

    public final VisualUpdate copy(boolean z, List<String> merchantLogos) {
        Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
        return new VisualUpdate(z, merchantLogos);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VisualUpdate) {
            VisualUpdate visualUpdate = (VisualUpdate) obj;
            return this.reducedBranding == visualUpdate.reducedBranding && Intrinsics.areEqual(this.merchantLogos, visualUpdate.merchantLogos);
        }
        return false;
    }

    public final List<String> getMerchantLogos() {
        return this.merchantLogos;
    }

    public final boolean getReducedBranding() {
        return this.reducedBranding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.reducedBranding;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.merchantLogos.hashCode();
    }

    public String toString() {
        boolean z = this.reducedBranding;
        List<String> list = this.merchantLogos;
        return "VisualUpdate(reducedBranding=" + z + ", merchantLogos=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.reducedBranding ? 1 : 0);
        out.writeStringList(this.merchantLogos);
    }

    public VisualUpdate(boolean z, List<String> merchantLogos) {
        Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
        this.reducedBranding = z;
        this.merchantLogos = merchantLogos;
    }
}
