package p000;

import co.bird.android.model.BarcodeDriversLicense;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lr71;", "", "LNy;", C17296a.f69688o, "Lco/bird/android/model/BarcodeDriversLicense;", "b", "errorDialog", "driverLicense", "c", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LNy;", "getErrorDialog", "()LNy;", "Lco/bird/android/model/BarcodeDriversLicense;", "getDriverLicense", "()Lco/bird/android/model/BarcodeDriversLicense;", "<init>", "(LNy;Lco/bird/android/model/BarcodeDriversLicense;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: r71  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47866r71 {

    /* renamed from: a */
    public final AbstractC5751Ny f106481a;

    /* renamed from: b */
    public final BarcodeDriversLicense f106482b;

    public C47866r71(AbstractC5751Ny abstractC5751Ny, BarcodeDriversLicense barcodeDriversLicense) {
        this.f106481a = abstractC5751Ny;
        this.f106482b = barcodeDriversLicense;
    }

    public static /* synthetic */ C47866r71 copy$default(C47866r71 c47866r71, AbstractC5751Ny abstractC5751Ny, BarcodeDriversLicense barcodeDriversLicense, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC5751Ny = c47866r71.f106481a;
        }
        if ((i & 2) != 0) {
            barcodeDriversLicense = c47866r71.f106482b;
        }
        return c47866r71.m16466c(abstractC5751Ny, barcodeDriversLicense);
    }

    /* renamed from: a */
    public final AbstractC5751Ny m16468a() {
        return this.f106481a;
    }

    /* renamed from: b */
    public final BarcodeDriversLicense m16467b() {
        return this.f106482b;
    }

    /* renamed from: c */
    public final C47866r71 m16466c(AbstractC5751Ny abstractC5751Ny, BarcodeDriversLicense barcodeDriversLicense) {
        return new C47866r71(abstractC5751Ny, barcodeDriversLicense);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47866r71) {
            C47866r71 c47866r71 = (C47866r71) obj;
            return Intrinsics.areEqual(this.f106481a, c47866r71.f106481a) && Intrinsics.areEqual(this.f106482b, c47866r71.f106482b);
        }
        return false;
    }

    public int hashCode() {
        AbstractC5751Ny abstractC5751Ny = this.f106481a;
        int hashCode = (abstractC5751Ny == null ? 0 : abstractC5751Ny.hashCode()) * 31;
        BarcodeDriversLicense barcodeDriversLicense = this.f106482b;
        return hashCode + (barcodeDriversLicense != null ? barcodeDriversLicense.hashCode() : 0);
    }

    public String toString() {
        AbstractC5751Ny abstractC5751Ny = this.f106481a;
        BarcodeDriversLicense barcodeDriversLicense = this.f106482b;
        return "DriverLicenseScanResult(errorDialog=" + abstractC5751Ny + ", driverLicense=" + barcodeDriversLicense + ")";
    }
}
