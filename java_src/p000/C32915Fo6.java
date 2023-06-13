package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;
/* renamed from: Fo6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32915Fo6 extends VersionedParcel {

    /* renamed from: d */
    public final SparseIntArray f10254d;

    /* renamed from: e */
    public final Parcel f10255e;

    /* renamed from: f */
    public final int f10256f;

    /* renamed from: g */
    public final int f10257g;

    /* renamed from: h */
    public final String f10258h;

    /* renamed from: i */
    public int f10259i;

    /* renamed from: j */
    public int f10260j;

    /* renamed from: k */
    public int f10261k;

    public C32915Fo6(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C28385so(), new C28385so(), new C28385so());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: A */
    public void mo65788A(byte[] bArr) {
        if (bArr != null) {
            this.f10255e.writeInt(bArr.length);
            this.f10255e.writeByteArray(bArr);
            return;
        }
        this.f10255e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: C */
    public void mo65786C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f10255e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: E */
    public void mo65784E(int i) {
        this.f10255e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: G */
    public void mo65782G(Parcelable parcelable) {
        this.f10255e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: I */
    public void mo65780I(String str) {
        this.f10255e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo65774a() {
        int i = this.f10259i;
        if (i >= 0) {
            int i2 = this.f10254d.get(i);
            int dataPosition = this.f10255e.dataPosition();
            this.f10255e.setDataPosition(i2);
            this.f10255e.writeInt(dataPosition - i2);
            this.f10255e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: b */
    public VersionedParcel mo65773b() {
        Parcel parcel = this.f10255e;
        int dataPosition = parcel.dataPosition();
        int i = this.f10260j;
        if (i == this.f10256f) {
            i = this.f10257g;
        }
        int i2 = i;
        return new C32915Fo6(parcel, dataPosition, i2, this.f10258h + "  ", this.f56010a, this.f56011b, this.f56012c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: g */
    public boolean mo65768g() {
        return this.f10255e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: i */
    public byte[] mo65766i() {
        int readInt = this.f10255e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f10255e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: k */
    public CharSequence mo65764k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f10255e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: m */
    public boolean mo65762m(int i) {
        while (this.f10260j < this.f10257g) {
            int i2 = this.f10261k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f10255e.setDataPosition(this.f10260j);
            int readInt = this.f10255e.readInt();
            this.f10261k = this.f10255e.readInt();
            this.f10260j += readInt;
        }
        if (this.f10261k == i) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: o */
    public int mo65760o() {
        return this.f10255e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: q */
    public <T extends Parcelable> T mo65758q() {
        return (T) this.f10255e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: s */
    public String mo65756s() {
        return this.f10255e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: w */
    public void mo65752w(int i) {
        mo65774a();
        this.f10259i = i;
        this.f10254d.put(i, this.f10255e.dataPosition());
        mo65784E(0);
        mo65784E(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: y */
    public void mo65750y(boolean z) {
        this.f10255e.writeInt(z ? 1 : 0);
    }

    public C32915Fo6(Parcel parcel, int i, int i2, String str, C28385so<String, Method> c28385so, C28385so<String, Method> c28385so2, C28385so<String, Class> c28385so3) {
        super(c28385so, c28385so2, c28385so3);
        this.f10254d = new SparseIntArray();
        this.f10259i = -1;
        this.f10261k = -1;
        this.f10255e = parcel;
        this.f10256f = i;
        this.f10257g = i2;
        this.f10260j = i;
        this.f10258h = str;
    }
}
