package co.bird.android.app.feature.locale;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.coreinterface.core.job.Payload;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/app/feature/locale/LocaleChangedPayload;", "Lco/bird/android/coreinterface/core/job/Payload;", "Landroid/os/Parcelable;", "", "locale", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Ljava/lang/String;", "getLocale", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LocaleChangedPayload implements Payload, Parcelable {
    public static final Parcelable.Creator<LocaleChangedPayload> CREATOR = new C13768a();

    /* renamed from: b */
    public final String f61536b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.locale.LocaleChangedPayload$a */
    /* loaded from: classes2.dex */
    public static final class C13768a implements Parcelable.Creator<LocaleChangedPayload> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LocaleChangedPayload createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocaleChangedPayload(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final LocaleChangedPayload[] newArray(int i) {
            return new LocaleChangedPayload[i];
        }
    }

    public LocaleChangedPayload(String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f61536b = locale;
    }

    public static /* synthetic */ LocaleChangedPayload copy$default(LocaleChangedPayload localeChangedPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localeChangedPayload.f61536b;
        }
        return localeChangedPayload.m60595a(str);
    }

    /* renamed from: a */
    public final LocaleChangedPayload m60595a(String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        return new LocaleChangedPayload(locale);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleChangedPayload) && Intrinsics.areEqual(this.f61536b, ((LocaleChangedPayload) obj).f61536b);
    }

    public final String getLocale() {
        return this.f61536b;
    }

    public int hashCode() {
        return this.f61536b.hashCode();
    }

    public String toString() {
        String str = this.f61536b;
        return "LocaleChangedPayload(locale=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f61536b);
    }
}
