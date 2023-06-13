package co.bird.android.app.feature.bluetooth.job;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.coreinterface.core.job.Payload;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;", "Lco/bird/android/coreinterface/core/job/Payload;", "Landroid/os/Parcelable;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "enabled", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Lco/bird/android/model/wire/WireBird;", "()Lco/bird/android/model/wire/WireBird;", "c", "Z", "()Z", "<init>", "(Lco/bird/android/model/wire/WireBird;Z)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DeepSleepPayload implements Payload, Parcelable {
    public static final Parcelable.Creator<DeepSleepPayload> CREATOR = new C13695a();

    /* renamed from: b */
    public final WireBird f61331b;

    /* renamed from: c */
    public final boolean f61332c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.bluetooth.job.DeepSleepPayload$a */
    /* loaded from: classes2.dex */
    public static final class C13695a implements Parcelable.Creator<DeepSleepPayload> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DeepSleepPayload createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeepSleepPayload((WireBird) parcel.readParcelable(DeepSleepPayload.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final DeepSleepPayload[] newArray(int i) {
            return new DeepSleepPayload[i];
        }
    }

    public DeepSleepPayload(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f61331b = bird;
        this.f61332c = z;
    }

    public static /* synthetic */ DeepSleepPayload copy$default(DeepSleepPayload deepSleepPayload, WireBird wireBird, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = deepSleepPayload.f61331b;
        }
        if ((i & 2) != 0) {
            z = deepSleepPayload.f61332c;
        }
        return deepSleepPayload.m60776a(wireBird, z);
    }

    /* renamed from: a */
    public final DeepSleepPayload m60776a(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new DeepSleepPayload(bird, z);
    }

    /* renamed from: b */
    public final WireBird m60775b() {
        return this.f61331b;
    }

    /* renamed from: c */
    public final boolean m60774c() {
        return this.f61332c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeepSleepPayload) {
            DeepSleepPayload deepSleepPayload = (DeepSleepPayload) obj;
            return Intrinsics.areEqual(this.f61331b, deepSleepPayload.f61331b) && this.f61332c == deepSleepPayload.f61332c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f61331b.hashCode() * 31;
        boolean z = this.f61332c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        WireBird wireBird = this.f61331b;
        boolean z = this.f61332c;
        return "DeepSleepPayload(bird=" + wireBird + ", enabled=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.f61331b, i);
        out.writeInt(this.f61332c ? 1 : 0);
    }
}
