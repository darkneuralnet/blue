package co.bird.android.navigator;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/navigator/AutoPayV2Answer;", "Lco/bird/android/navigator/ActivityResult;", "", "acceptedPlanId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Ljava/lang/String;", "getAcceptedPlanId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "navigator_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AutoPayV2Answer extends ActivityResult {
    public static final Parcelable.Creator<AutoPayV2Answer> CREATOR = new C16260a();

    /* renamed from: b */
    public final String f66781b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.navigator.AutoPayV2Answer$a */
    /* loaded from: classes4.dex */
    public static final class C16260a implements Parcelable.Creator<AutoPayV2Answer> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AutoPayV2Answer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoPayV2Answer(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final AutoPayV2Answer[] newArray(int i) {
            return new AutoPayV2Answer[i];
        }
    }

    public AutoPayV2Answer(String str) {
        super(null);
        this.f66781b = str;
    }

    public static /* synthetic */ AutoPayV2Answer copy$default(AutoPayV2Answer autoPayV2Answer, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoPayV2Answer.f66781b;
        }
        return autoPayV2Answer.m55408a(str);
    }

    /* renamed from: a */
    public final AutoPayV2Answer m55408a(String str) {
        return new AutoPayV2Answer(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoPayV2Answer) && Intrinsics.areEqual(this.f66781b, ((AutoPayV2Answer) obj).f66781b);
    }

    public int hashCode() {
        String str = this.f66781b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f66781b;
        return "AutoPayV2Answer(acceptedPlanId=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66781b);
    }
}
