package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C11643a();

    /* renamed from: b */
    public ArrayList<String> f54612b;

    /* renamed from: c */
    public ArrayList<String> f54613c;

    /* renamed from: d */
    public BackStackRecordState[] f54614d;

    /* renamed from: e */
    public int f54615e;

    /* renamed from: f */
    public String f54616f;

    /* renamed from: g */
    public ArrayList<String> f54617g;

    /* renamed from: h */
    public ArrayList<BackStackState> f54618h;

    /* renamed from: i */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f54619i;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    /* loaded from: classes.dex */
    public class C11643a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f54616f = null;
        this.f54617g = new ArrayList<>();
        this.f54618h = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f54612b);
        parcel.writeStringList(this.f54613c);
        parcel.writeTypedArray(this.f54614d, i);
        parcel.writeInt(this.f54615e);
        parcel.writeString(this.f54616f);
        parcel.writeStringList(this.f54617g);
        parcel.writeTypedList(this.f54618h);
        parcel.writeTypedList(this.f54619i);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f54616f = null;
        this.f54617g = new ArrayList<>();
        this.f54618h = new ArrayList<>();
        this.f54612b = parcel.createStringArrayList();
        this.f54613c = parcel.createStringArrayList();
        this.f54614d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f54615e = parcel.readInt();
        this.f54616f = parcel.readString();
        this.f54617g = parcel.createStringArrayList();
        this.f54618h = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f54619i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
