package no.nordicsemi.android.support.v18.scanner;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import kotlin.KotlinVersion;
/* loaded from: classes8.dex */
public final class ScanSettings implements Parcelable {
    public static final Parcelable.Creator<ScanSettings> CREATOR = new C26701a();

    /* renamed from: b */
    public final long f100791b;

    /* renamed from: c */
    public final long f100792c;

    /* renamed from: d */
    public final int f100793d;

    /* renamed from: e */
    public final int f100794e;

    /* renamed from: f */
    public final long f100795f;

    /* renamed from: g */
    public final int f100796g;

    /* renamed from: h */
    public final int f100797h;

    /* renamed from: i */
    public final boolean f100798i;

    /* renamed from: j */
    public final boolean f100799j;

    /* renamed from: k */
    public boolean f100800k;

    /* renamed from: l */
    public final long f100801l;

    /* renamed from: m */
    public final long f100802m;

    /* renamed from: n */
    public final boolean f100803n;

    /* renamed from: o */
    public final int f100804o;

    /* renamed from: no.nordicsemi.android.support.v18.scanner.ScanSettings$a */
    /* loaded from: classes8.dex */
    public class C26701a implements Parcelable.Creator<ScanSettings> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ScanSettings createFromParcel(Parcel parcel) {
            return new ScanSettings(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ScanSettings[] newArray(int i) {
            return new ScanSettings[i];
        }
    }

    /* renamed from: no.nordicsemi.android.support.v18.scanner.ScanSettings$b */
    /* loaded from: classes8.dex */
    public static final class C26702b {

        /* renamed from: a */
        public int f100805a = 0;

        /* renamed from: b */
        public int f100806b = 1;

        /* renamed from: c */
        public long f100807c = 0;

        /* renamed from: d */
        public int f100808d = 1;

        /* renamed from: e */
        public int f100809e = 3;

        /* renamed from: f */
        public boolean f100810f = true;

        /* renamed from: g */
        public int f100811g = KotlinVersion.MAX_COMPONENT_VALUE;

        /* renamed from: h */
        public boolean f100812h = true;

        /* renamed from: i */
        public boolean f100813i = true;

        /* renamed from: j */
        public boolean f100814j = true;

        /* renamed from: k */
        public long f100815k = AbstractComponentTracker.LINGERING_TIMEOUT;

        /* renamed from: l */
        public long f100816l = AbstractComponentTracker.LINGERING_TIMEOUT;

        /* renamed from: m */
        public long f100817m = 0;

        /* renamed from: n */
        public long f100818n = 0;

        /* renamed from: a */
        public ScanSettings m22412a() {
            if (this.f100817m == 0 && this.f100818n == 0) {
                m22399n();
            }
            return new ScanSettings(this.f100805a, this.f100806b, this.f100807c, this.f100808d, this.f100809e, this.f100810f, this.f100811g, this.f100812h, this.f100813i, this.f100814j, this.f100815k, this.f100816l, this.f100818n, this.f100817m, null);
        }

        /* renamed from: b */
        public final boolean m22411b(int i) {
            return i == 1 || i == 2 || i == 4 || i == 6;
        }

        /* renamed from: c */
        public C26702b m22410c(int i) {
            if (m22411b(i)) {
                this.f100806b = i;
                return this;
            }
            throw new IllegalArgumentException("invalid callback type - " + i);
        }

        /* renamed from: d */
        public C26702b m22409d(boolean z) {
            this.f100810f = z;
            return this;
        }

        /* renamed from: e */
        public C26702b m22408e(int i) {
            if (i >= 1 && i <= 2) {
                this.f100808d = i;
                return this;
            }
            throw new IllegalArgumentException("invalid matchMode " + i);
        }

        /* renamed from: f */
        public C26702b m22407f(long j, long j2) {
            if (j > 0 && j2 > 0) {
                this.f100815k = j;
                this.f100816l = j2;
                return this;
            }
            throw new IllegalArgumentException("maxDeviceAgeMillis and taskIntervalMillis must be > 0");
        }

        /* renamed from: g */
        public C26702b m22406g(int i) {
            if (i >= 1 && i <= 3) {
                this.f100809e = i;
                return this;
            }
            throw new IllegalArgumentException("invalid numOfMatches " + i);
        }

        /* renamed from: h */
        public C26702b m22405h(int i) {
            this.f100811g = i;
            return this;
        }

        /* renamed from: i */
        public C26702b m22404i(long j) {
            if (j >= 0) {
                this.f100807c = j;
                return this;
            }
            throw new IllegalArgumentException("reportDelay must be > 0");
        }

        /* renamed from: j */
        public C26702b m22403j(int i) {
            if (i >= -1 && i <= 2) {
                this.f100805a = i;
                return this;
            }
            throw new IllegalArgumentException("invalid scan mode " + i);
        }

        /* renamed from: k */
        public C26702b m22402k(boolean z) {
            this.f100813i = z;
            return this;
        }

        /* renamed from: l */
        public C26702b m22401l(boolean z) {
            this.f100814j = z;
            return this;
        }

        /* renamed from: m */
        public C26702b m22400m(boolean z) {
            this.f100812h = z;
            return this;
        }

        /* renamed from: n */
        public final void m22399n() {
            int i = this.f100805a;
            if (i != 1) {
                if (i != 2) {
                    this.f100818n = 500L;
                    this.f100817m = 4500L;
                    return;
                }
                this.f100818n = 0L;
                this.f100817m = 0L;
                return;
            }
            this.f100818n = 2000L;
            this.f100817m = 3000L;
        }
    }

    public /* synthetic */ ScanSettings(int i, int i2, long j, int i3, int i4, boolean z, int i5, boolean z2, boolean z3, boolean z4, long j2, long j3, long j4, long j5, C26701a c26701a) {
        this(i, i2, j, i3, i4, z, i5, z2, z3, z4, j2, j3, j4, j5);
    }

    /* renamed from: a */
    public void m22427a() {
        this.f100800k = false;
    }

    /* renamed from: b */
    public int m22426b() {
        return this.f100794e;
    }

    /* renamed from: c */
    public boolean m22425c() {
        return this.f100803n;
    }

    /* renamed from: d */
    public long m22424d() {
        return this.f100801l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long m22423e() {
        return this.f100802m;
    }

    /* renamed from: g */
    public int m22422g() {
        return this.f100796g;
    }

    /* renamed from: h */
    public int m22421h() {
        return this.f100797h;
    }

    /* renamed from: i */
    public int m22420i() {
        return this.f100804o;
    }

    /* renamed from: j */
    public long m22419j() {
        return this.f100795f;
    }

    /* renamed from: k */
    public int m22418k() {
        return this.f100793d;
    }

    /* renamed from: l */
    public boolean m22417l() {
        return this.f100799j;
    }

    /* renamed from: m */
    public boolean m22416m() {
        return this.f100800k;
    }

    /* renamed from: n */
    public boolean m22415n() {
        return this.f100798i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f100793d);
        parcel.writeInt(this.f100794e);
        parcel.writeLong(this.f100795f);
        parcel.writeInt(this.f100796g);
        parcel.writeInt(this.f100797h);
        parcel.writeInt(this.f100803n ? 1 : 0);
        parcel.writeInt(this.f100804o);
        parcel.writeInt(this.f100798i ? 1 : 0);
        parcel.writeInt(this.f100799j ? 1 : 0);
        parcel.writeLong(this.f100801l);
        parcel.writeLong(this.f100802m);
        parcel.writeLong(this.f100791b);
        parcel.writeLong(this.f100792c);
    }

    public /* synthetic */ ScanSettings(Parcel parcel, C26701a c26701a) {
        this(parcel);
    }

    public ScanSettings(int i, int i2, long j, int i3, int i4, boolean z, int i5, boolean z2, boolean z3, boolean z4, long j2, long j3, long j4, long j5) {
        this.f100793d = i;
        this.f100794e = i2;
        this.f100795f = j;
        this.f100797h = i4;
        this.f100796g = i3;
        this.f100803n = z;
        this.f100804o = i5;
        this.f100798i = z2;
        this.f100799j = z3;
        this.f100800k = z4;
        this.f100801l = 1000000 * j2;
        this.f100802m = j3;
        this.f100791b = j4;
        this.f100792c = j5;
    }

    public ScanSettings(Parcel parcel) {
        this.f100793d = parcel.readInt();
        this.f100794e = parcel.readInt();
        this.f100795f = parcel.readLong();
        this.f100796g = parcel.readInt();
        this.f100797h = parcel.readInt();
        this.f100803n = parcel.readInt() != 0;
        this.f100804o = parcel.readInt();
        this.f100798i = parcel.readInt() == 1;
        this.f100799j = parcel.readInt() == 1;
        this.f100801l = parcel.readLong();
        this.f100802m = parcel.readLong();
        this.f100791b = parcel.readLong();
        this.f100792c = parcel.readLong();
    }
}
