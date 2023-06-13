package zendesk.belvedere;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes8.dex */
public class MediaIntent implements Parcelable {
    public static final Parcelable.Creator<MediaIntent> CREATOR = new C31089a();

    /* renamed from: b */
    public final boolean f121775b;

    /* renamed from: c */
    public final int f121776c;

    /* renamed from: d */
    public final Intent f121777d;

    /* renamed from: e */
    public final String f121778e;

    /* renamed from: f */
    public final int f121779f;

    /* renamed from: zendesk.belvedere.MediaIntent$a */
    /* loaded from: classes8.dex */
    public static class C31089a implements Parcelable.Creator<MediaIntent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaIntent createFromParcel(Parcel parcel) {
            return new MediaIntent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaIntent[] newArray(int i) {
            return new MediaIntent[i];
        }
    }

    /* renamed from: zendesk.belvedere.MediaIntent$b */
    /* loaded from: classes8.dex */
    public static class C31090b {

        /* renamed from: a */
        public final EP2 f121780a;

        /* renamed from: b */
        public final Y52 f121781b;

        /* renamed from: c */
        public final int f121782c;

        /* renamed from: d */
        public boolean f121783d = false;

        public C31090b(int i, EP2 ep2, Y52 y52) {
            this.f121782c = i;
            this.f121780a = ep2;
            this.f121781b = y52;
        }

        /* renamed from: a */
        public MediaIntent m791a() {
            C48526sE3<MediaIntent, MediaResult> m109043c = this.f121780a.m109043c(this.f121782c);
            MediaIntent mediaIntent = m109043c.f108491a;
            MediaResult mediaResult = m109043c.f108492b;
            if (mediaIntent.m796d()) {
                this.f121781b.m75756e(this.f121782c, mediaResult);
            }
            return mediaIntent;
        }
    }

    /* renamed from: zendesk.belvedere.MediaIntent$c */
    /* loaded from: classes8.dex */
    public static class C31091c {

        /* renamed from: a */
        public final EP2 f121784a;

        /* renamed from: b */
        public final int f121785b;

        /* renamed from: c */
        public String f121786c = "*/*";

        /* renamed from: d */
        public List<String> f121787d = new ArrayList();

        /* renamed from: e */
        public boolean f121788e = false;

        public C31091c(int i, EP2 ep2) {
            this.f121784a = ep2;
            this.f121785b = i;
        }

        /* renamed from: a */
        public C31091c m790a(boolean z) {
            this.f121788e = z;
            return this;
        }

        /* renamed from: b */
        public MediaIntent m789b() {
            return this.f121784a.m109040f(this.f121785b, this.f121786c, this.f121788e, this.f121787d);
        }

        /* renamed from: c */
        public C31091c m788c(String str) {
            this.f121786c = str;
            this.f121787d = new ArrayList();
            return this;
        }
    }

    public MediaIntent(int i, Intent intent, String str, boolean z, int i2) {
        this.f121776c = i;
        this.f121777d = intent;
        this.f121778e = str;
        this.f121775b = z;
        this.f121779f = i2;
    }

    /* renamed from: e */
    public static MediaIntent m795e() {
        return new MediaIntent(-1, null, null, false, -1);
    }

    /* renamed from: a */
    public Intent m799a() {
        return this.f121777d;
    }

    /* renamed from: b */
    public String m798b() {
        return this.f121778e;
    }

    /* renamed from: c */
    public int m797c() {
        return this.f121779f;
    }

    /* renamed from: d */
    public boolean m796d() {
        return this.f121775b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public void m794g(Fragment fragment) {
        fragment.startActivityForResult(this.f121777d, this.f121776c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121776c);
        parcel.writeParcelable(this.f121777d, i);
        parcel.writeString(this.f121778e);
        parcel.writeBooleanArray(new boolean[]{this.f121775b});
        parcel.writeInt(this.f121779f);
    }

    public MediaIntent(Parcel parcel) {
        this.f121776c = parcel.readInt();
        this.f121777d = (Intent) parcel.readParcelable(MediaIntent.class.getClassLoader());
        this.f121778e = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f121775b = zArr[0];
        this.f121779f = parcel.readInt();
    }
}
