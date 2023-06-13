package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC11685m;
import androidx.lifecycle.AbstractC11719f;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C11607a();

    /* renamed from: b */
    public final int[] f54481b;

    /* renamed from: c */
    public final ArrayList<String> f54482c;

    /* renamed from: d */
    public final int[] f54483d;

    /* renamed from: e */
    public final int[] f54484e;

    /* renamed from: f */
    public final int f54485f;

    /* renamed from: g */
    public final String f54486g;

    /* renamed from: h */
    public final int f54487h;

    /* renamed from: i */
    public final int f54488i;

    /* renamed from: j */
    public final CharSequence f54489j;

    /* renamed from: k */
    public final int f54490k;

    /* renamed from: l */
    public final CharSequence f54491l;

    /* renamed from: m */
    public final ArrayList<String> f54492m;

    /* renamed from: n */
    public final ArrayList<String> f54493n;

    /* renamed from: o */
    public final boolean f54494o;

    /* renamed from: androidx.fragment.app.BackStackRecordState$a */
    /* loaded from: classes.dex */
    public class C11607a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(C11647a c11647a) {
        int size = c11647a.f54750c.size();
        this.f54481b = new int[size * 6];
        if (c11647a.f54756i) {
            this.f54482c = new ArrayList<>(size);
            this.f54483d = new int[size];
            this.f54484e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                AbstractC11685m.C11686a c11686a = c11647a.f54750c.get(i);
                int i3 = i2 + 1;
                this.f54481b[i2] = c11686a.f54767a;
                ArrayList<String> arrayList = this.f54482c;
                Fragment fragment = c11686a.f54768b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f54481b;
                int i4 = i3 + 1;
                iArr[i3] = c11686a.f54769c ? 1 : 0;
                int i5 = i4 + 1;
                iArr[i4] = c11686a.f54770d;
                int i6 = i5 + 1;
                iArr[i5] = c11686a.f54771e;
                int i7 = i6 + 1;
                iArr[i6] = c11686a.f54772f;
                iArr[i7] = c11686a.f54773g;
                this.f54483d[i] = c11686a.f54774h.ordinal();
                this.f54484e[i] = c11686a.f54775i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f54485f = c11647a.f54755h;
            this.f54486g = c11647a.f54758k;
            this.f54487h = c11647a.f54648v;
            this.f54488i = c11647a.f54759l;
            this.f54489j = c11647a.f54760m;
            this.f54490k = c11647a.f54761n;
            this.f54491l = c11647a.f54762o;
            this.f54492m = c11647a.f54763p;
            this.f54493n = c11647a.f54764q;
            this.f54494o = c11647a.f54765r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public final void m67445a(C11647a c11647a) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.f54481b.length) {
                AbstractC11685m.C11686a c11686a = new AbstractC11685m.C11686a();
                int i3 = i + 1;
                c11686a.f54767a = this.f54481b[i];
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "Instantiate " + c11647a + " op #" + i2 + " base fragment #" + this.f54481b[i3]);
                }
                c11686a.f54774h = AbstractC11719f.EnumC11724b.values()[this.f54483d[i2]];
                c11686a.f54775i = AbstractC11719f.EnumC11724b.values()[this.f54484e[i2]];
                int[] iArr = this.f54481b;
                int i4 = i3 + 1;
                if (iArr[i3] == 0) {
                    z = false;
                }
                c11686a.f54769c = z;
                int i5 = i4 + 1;
                int i6 = iArr[i4];
                c11686a.f54770d = i6;
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                c11686a.f54771e = i8;
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                c11686a.f54772f = i10;
                int i11 = iArr[i9];
                c11686a.f54773g = i11;
                c11647a.f54751d = i6;
                c11647a.f54752e = i8;
                c11647a.f54753f = i10;
                c11647a.f54754g = i11;
                c11647a.m67118f(c11686a);
                i2++;
                i = i9 + 1;
            } else {
                c11647a.f54755h = this.f54485f;
                c11647a.f54758k = this.f54486g;
                c11647a.f54756i = true;
                c11647a.f54759l = this.f54488i;
                c11647a.f54760m = this.f54489j;
                c11647a.f54761n = this.f54490k;
                c11647a.f54762o = this.f54491l;
                c11647a.f54763p = this.f54492m;
                c11647a.f54764q = this.f54493n;
                c11647a.f54765r = this.f54494o;
                return;
            }
        }
    }

    /* renamed from: b */
    public C11647a m67444b(FragmentManager fragmentManager) {
        C11647a c11647a = new C11647a(fragmentManager);
        m67445a(c11647a);
        c11647a.f54648v = this.f54487h;
        for (int i = 0; i < this.f54482c.size(); i++) {
            String str = this.f54482c.get(i);
            if (str != null) {
                c11647a.f54750c.get(i).f54768b = fragmentManager.m67334i0(str);
            }
        }
        c11647a.m67248B(1);
        return c11647a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f54481b);
        parcel.writeStringList(this.f54482c);
        parcel.writeIntArray(this.f54483d);
        parcel.writeIntArray(this.f54484e);
        parcel.writeInt(this.f54485f);
        parcel.writeString(this.f54486g);
        parcel.writeInt(this.f54487h);
        parcel.writeInt(this.f54488i);
        TextUtils.writeToParcel(this.f54489j, parcel, 0);
        parcel.writeInt(this.f54490k);
        TextUtils.writeToParcel(this.f54491l, parcel, 0);
        parcel.writeStringList(this.f54492m);
        parcel.writeStringList(this.f54493n);
        parcel.writeInt(this.f54494o ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f54481b = parcel.createIntArray();
        this.f54482c = parcel.createStringArrayList();
        this.f54483d = parcel.createIntArray();
        this.f54484e = parcel.createIntArray();
        this.f54485f = parcel.readInt();
        this.f54486g = parcel.readString();
        this.f54487h = parcel.readInt();
        this.f54488i = parcel.readInt();
        this.f54489j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f54490k = parcel.readInt();
        this.f54491l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f54492m = parcel.createStringArrayList();
        this.f54493n = parcel.createStringArrayList();
        this.f54494o = parcel.readInt() != 0;
    }
}
