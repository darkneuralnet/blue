package co.bird.android.navigator;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/navigator/PurchasePaymentActivityResult;", "Lco/bird/android/navigator/ActivityResult;", "", "message", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "navigator_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PurchasePaymentActivityResult extends ActivityResult {
    public static final Parcelable.Creator<PurchasePaymentActivityResult> CREATOR = new C16267a();

    /* renamed from: b */
    public final String f66794b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.navigator.PurchasePaymentActivityResult$a */
    /* loaded from: classes4.dex */
    public static final class C16267a implements Parcelable.Creator<PurchasePaymentActivityResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PurchasePaymentActivityResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PurchasePaymentActivityResult(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final PurchasePaymentActivityResult[] newArray(int i) {
            return new PurchasePaymentActivityResult[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasePaymentActivityResult(String message) {
        super(null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f66794b = message;
    }

    public static /* synthetic */ PurchasePaymentActivityResult copy$default(PurchasePaymentActivityResult purchasePaymentActivityResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchasePaymentActivityResult.f66794b;
        }
        return purchasePaymentActivityResult.m55386a(str);
    }

    /* renamed from: a */
    public final PurchasePaymentActivityResult m55386a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new PurchasePaymentActivityResult(message);
    }

    /* renamed from: b */
    public final String m55385b() {
        return this.f66794b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchasePaymentActivityResult) && Intrinsics.areEqual(this.f66794b, ((PurchasePaymentActivityResult) obj).f66794b);
    }

    public int hashCode() {
        return this.f66794b.hashCode();
    }

    public String toString() {
        String str = this.f66794b;
        return "PurchasePaymentActivityResult(message=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66794b);
    }
}
