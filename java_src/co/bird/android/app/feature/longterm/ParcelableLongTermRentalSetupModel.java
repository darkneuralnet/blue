package co.bird.android.app.feature.longterm;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RentalPeriod;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.constant.RentalStatus;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0010)\u001a\u00020\t\u0012\b\u0010,\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010-\u001a\u0004\u0018\u00010\t\u0012\b\u0010/\u001a\u0004\u0018\u00010\t\u0012\b\u00104\u001a\u0004\u0018\u000100\u0012\b\u00109\u001a\u0004\u0018\u000105¢\u0006\u0004\b:\u0010;J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\rR\u0019\u0010,\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b\n\u0010+R\u0019\u0010-\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0019\u0010/\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b\"\u0010\rR\u0019\u00104\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b'\u00103R\u0019\u00109\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b\u0010\u00108¨\u0006<"}, m28432d2 = {"Lco/bird/android/app/feature/longterm/ParcelableLongTermRentalSetupModel;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "rentalId", "", "c", "Z", "i", "()Z", "isCancelable", DateTokenConverter.CONVERTER_KEY, "j", "isEnded", "Lco/bird/android/model/wire/WireLocation;", "Lco/bird/android/model/wire/WireLocation;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "location", "f", "getAddress", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "Lco/bird/android/model/RentalPlan;", "g", "Ljava/util/List;", C17296a.f69688o, "()Ljava/util/List;", "availablePlans", "h", "getNotes", "notes", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "birdCare", "deliveryWindowId", "k", "rentalPlanId", "Lco/bird/android/model/constant/RentalStatus;", "l", "Lco/bird/android/model/constant/RentalStatus;", "()Lco/bird/android/model/constant/RentalStatus;", "status", "Lco/bird/android/model/RentalPeriod;", "m", "Lco/bird/android/model/RentalPeriod;", "()Lco/bird/android/model/RentalPeriod;", "currentRentalPeriod", "<init>", "(Ljava/lang/String;ZZLco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RentalStatus;Lco/bird/android/model/RentalPeriod;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ParcelableLongTermRentalSetupModel implements Parcelable {
    public static final Parcelable.Creator<ParcelableLongTermRentalSetupModel> CREATOR = new C13770a();

    /* renamed from: b */
    public final String f61542b;

    /* renamed from: c */
    public final boolean f61543c;

    /* renamed from: d */
    public final boolean f61544d;

    /* renamed from: e */
    public final WireLocation f61545e;

    /* renamed from: f */
    public final String f61546f;

    /* renamed from: g */
    public final List<RentalPlan> f61547g;

    /* renamed from: h */
    public final String f61548h;

    /* renamed from: i */
    public final Boolean f61549i;

    /* renamed from: j */
    public final String f61550j;

    /* renamed from: k */
    public final String f61551k;

    /* renamed from: l */
    public final RentalStatus f61552l;

    /* renamed from: m */
    public final RentalPeriod f61553m;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.longterm.ParcelableLongTermRentalSetupModel$a */
    /* loaded from: classes2.dex */
    public static final class C13770a implements Parcelable.Creator<ParcelableLongTermRentalSetupModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ParcelableLongTermRentalSetupModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            WireLocation wireLocation = (WireLocation) parcel.readParcelable(ParcelableLongTermRentalSetupModel.class.getClassLoader());
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(ParcelableLongTermRentalSetupModel.class.getClassLoader()));
            }
            return new ParcelableLongTermRentalSetupModel(readString, z, z2, wireLocation, readString2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RentalStatus.valueOf(parcel.readString()), (RentalPeriod) parcel.readParcelable(ParcelableLongTermRentalSetupModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ParcelableLongTermRentalSetupModel[] newArray(int i) {
            return new ParcelableLongTermRentalSetupModel[i];
        }
    }

    public ParcelableLongTermRentalSetupModel(String str, boolean z, boolean z2, WireLocation wireLocation, String str2, List<RentalPlan> availablePlans, String notes, Boolean bool, String str3, String str4, RentalStatus rentalStatus, RentalPeriod rentalPeriod) {
        Intrinsics.checkNotNullParameter(availablePlans, "availablePlans");
        Intrinsics.checkNotNullParameter(notes, "notes");
        this.f61542b = str;
        this.f61543c = z;
        this.f61544d = z2;
        this.f61545e = wireLocation;
        this.f61546f = str2;
        this.f61547g = availablePlans;
        this.f61548h = notes;
        this.f61549i = bool;
        this.f61550j = str3;
        this.f61551k = str4;
        this.f61552l = rentalStatus;
        this.f61553m = rentalPeriod;
    }

    /* renamed from: a */
    public final List<RentalPlan> m60586a() {
        return this.f61547g;
    }

    /* renamed from: b */
    public final Boolean m60585b() {
        return this.f61549i;
    }

    /* renamed from: c */
    public final RentalPeriod m60584c() {
        return this.f61553m;
    }

    /* renamed from: d */
    public final String m60583d() {
        return this.f61550j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m60582e() {
        return this.f61542b;
    }

    /* renamed from: g */
    public final String m60581g() {
        return this.f61551k;
    }

    public final String getAddress() {
        return this.f61546f;
    }

    public final WireLocation getLocation() {
        return this.f61545e;
    }

    public final String getNotes() {
        return this.f61548h;
    }

    /* renamed from: h */
    public final RentalStatus m60580h() {
        return this.f61552l;
    }

    /* renamed from: i */
    public final boolean m60579i() {
        return this.f61543c;
    }

    /* renamed from: j */
    public final boolean m60578j() {
        return this.f61544d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f61542b);
        out.writeInt(this.f61543c ? 1 : 0);
        out.writeInt(this.f61544d ? 1 : 0);
        out.writeParcelable(this.f61545e, i);
        out.writeString(this.f61546f);
        List<RentalPlan> list = this.f61547g;
        out.writeInt(list.size());
        for (RentalPlan rentalPlan : list) {
            out.writeParcelable(rentalPlan, i);
        }
        out.writeString(this.f61548h);
        Boolean bool = this.f61549i;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeString(this.f61550j);
        out.writeString(this.f61551k);
        RentalStatus rentalStatus = this.f61552l;
        if (rentalStatus == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(rentalStatus.name());
        }
        out.writeParcelable(this.f61553m, i);
    }
}
