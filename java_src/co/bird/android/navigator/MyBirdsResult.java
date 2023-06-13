package co.bird.android.navigator;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/navigator/MyBirdsResult;", "Lco/bird/android/navigator/ActivityResult;", "Lco/bird/android/navigator/MyBirdsResult$a;", "action", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Lco/bird/android/navigator/MyBirdsResult$a;", "()Lco/bird/android/navigator/MyBirdsResult$a;", "<init>", "(Lco/bird/android/navigator/MyBirdsResult$a;)V", "navigator_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MyBirdsResult extends ActivityResult {
    public static final Parcelable.Creator<MyBirdsResult> CREATOR = new C16266b();

    /* renamed from: b */
    public final EnumC16265a f66790b;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/navigator/MyBirdsResult$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "navigator_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.navigator.MyBirdsResult$a */
    /* loaded from: classes4.dex */
    public enum EnumC16265a {
        UNPAIRED,
        NONE
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.navigator.MyBirdsResult$b */
    /* loaded from: classes4.dex */
    public static final class C16266b implements Parcelable.Creator<MyBirdsResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final MyBirdsResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MyBirdsResult(EnumC16265a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final MyBirdsResult[] newArray(int i) {
            return new MyBirdsResult[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBirdsResult(EnumC16265a action) {
        super(null);
        Intrinsics.checkNotNullParameter(action, "action");
        this.f66790b = action;
    }

    public static /* synthetic */ MyBirdsResult copy$default(MyBirdsResult myBirdsResult, EnumC16265a enumC16265a, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC16265a = myBirdsResult.f66790b;
        }
        return myBirdsResult.m55391a(enumC16265a);
    }

    /* renamed from: a */
    public final MyBirdsResult m55391a(EnumC16265a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new MyBirdsResult(action);
    }

    /* renamed from: b */
    public final EnumC16265a m55390b() {
        return this.f66790b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MyBirdsResult) && this.f66790b == ((MyBirdsResult) obj).f66790b;
    }

    public int hashCode() {
        return this.f66790b.hashCode();
    }

    public String toString() {
        EnumC16265a enumC16265a = this.f66790b;
        return "MyBirdsResult(action=" + enumC16265a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66790b.name());
    }
}
