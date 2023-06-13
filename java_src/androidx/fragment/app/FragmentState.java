package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC11719f;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C11644a();

    /* renamed from: b */
    public final String f54620b;

    /* renamed from: c */
    public final String f54621c;

    /* renamed from: d */
    public final boolean f54622d;

    /* renamed from: e */
    public final int f54623e;

    /* renamed from: f */
    public final int f54624f;

    /* renamed from: g */
    public final String f54625g;

    /* renamed from: h */
    public final boolean f54626h;

    /* renamed from: i */
    public final boolean f54627i;

    /* renamed from: j */
    public final boolean f54628j;

    /* renamed from: k */
    public final Bundle f54629k;

    /* renamed from: l */
    public final boolean f54630l;

    /* renamed from: m */
    public final int f54631m;

    /* renamed from: n */
    public Bundle f54632n;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    /* loaded from: classes.dex */
    public class C11644a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f54620b = fragment.getClass().getName();
        this.f54621c = fragment.mWho;
        this.f54622d = fragment.mFromLayout;
        this.f54623e = fragment.mFragmentId;
        this.f54624f = fragment.mContainerId;
        this.f54625g = fragment.mTag;
        this.f54626h = fragment.mRetainInstance;
        this.f54627i = fragment.mRemoving;
        this.f54628j = fragment.mDetached;
        this.f54629k = fragment.mArguments;
        this.f54630l = fragment.mHidden;
        this.f54631m = fragment.mMaxState.ordinal();
    }

    /* renamed from: a */
    public Fragment m67258a(C11672e c11672e, ClassLoader classLoader) {
        Fragment instantiate = c11672e.instantiate(classLoader, this.f54620b);
        Bundle bundle = this.f54629k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        instantiate.setArguments(this.f54629k);
        instantiate.mWho = this.f54621c;
        instantiate.mFromLayout = this.f54622d;
        instantiate.mRestored = true;
        instantiate.mFragmentId = this.f54623e;
        instantiate.mContainerId = this.f54624f;
        instantiate.mTag = this.f54625g;
        instantiate.mRetainInstance = this.f54626h;
        instantiate.mRemoving = this.f54627i;
        instantiate.mDetached = this.f54628j;
        instantiate.mHidden = this.f54630l;
        instantiate.mMaxState = AbstractC11719f.EnumC11724b.values()[this.f54631m];
        Bundle bundle2 = this.f54632n;
        if (bundle2 != null) {
            instantiate.mSavedFragmentState = bundle2;
        } else {
            instantiate.mSavedFragmentState = new Bundle();
        }
        return instantiate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f54620b);
        sb.append(" (");
        sb.append(this.f54621c);
        sb.append(")}:");
        if (this.f54622d) {
            sb.append(" fromLayout");
        }
        if (this.f54624f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f54624f));
        }
        String str = this.f54625g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f54625g);
        }
        if (this.f54626h) {
            sb.append(" retainInstance");
        }
        if (this.f54627i) {
            sb.append(" removing");
        }
        if (this.f54628j) {
            sb.append(" detached");
        }
        if (this.f54630l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f54620b);
        parcel.writeString(this.f54621c);
        parcel.writeInt(this.f54622d ? 1 : 0);
        parcel.writeInt(this.f54623e);
        parcel.writeInt(this.f54624f);
        parcel.writeString(this.f54625g);
        parcel.writeInt(this.f54626h ? 1 : 0);
        parcel.writeInt(this.f54627i ? 1 : 0);
        parcel.writeInt(this.f54628j ? 1 : 0);
        parcel.writeBundle(this.f54629k);
        parcel.writeInt(this.f54630l ? 1 : 0);
        parcel.writeBundle(this.f54632n);
        parcel.writeInt(this.f54631m);
    }

    public FragmentState(Parcel parcel) {
        this.f54620b = parcel.readString();
        this.f54621c = parcel.readString();
        this.f54622d = parcel.readInt() != 0;
        this.f54623e = parcel.readInt();
        this.f54624f = parcel.readInt();
        this.f54625g = parcel.readString();
        this.f54626h = parcel.readInt() != 0;
        this.f54627i = parcel.readInt() != 0;
        this.f54628j = parcel.readInt() != 0;
        this.f54629k = parcel.readBundle();
        this.f54630l = parcel.readInt() != 0;
        this.f54632n = parcel.readBundle();
        this.f54631m = parcel.readInt();
    }
}
