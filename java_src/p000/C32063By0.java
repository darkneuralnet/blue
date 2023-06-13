package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.common.ConstantsKt;
/* renamed from: By0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32063By0 {

    /* renamed from: a */
    public NetworkInfo.State f3106a;

    /* renamed from: b */
    public NetworkInfo.DetailedState f3107b;

    /* renamed from: c */
    public int f3108c;

    /* renamed from: d */
    public int f3109d;

    /* renamed from: e */
    public boolean f3110e;

    /* renamed from: f */
    public boolean f3111f;

    /* renamed from: g */
    public boolean f3112g;

    /* renamed from: h */
    public String f3113h;

    /* renamed from: i */
    public String f3114i;

    /* renamed from: j */
    public String f3115j;

    /* renamed from: k */
    public String f3116k;

    /* renamed from: By0$b */
    /* loaded from: classes5.dex */
    public static final class C0779b {

        /* renamed from: a */
        public NetworkInfo.State f3117a = NetworkInfo.State.DISCONNECTED;

        /* renamed from: b */
        public NetworkInfo.DetailedState f3118b = NetworkInfo.DetailedState.IDLE;

        /* renamed from: c */
        public int f3119c = -1;

        /* renamed from: d */
        public int f3120d = -1;

        /* renamed from: e */
        public boolean f3121e = false;

        /* renamed from: f */
        public boolean f3122f = false;

        /* renamed from: g */
        public boolean f3123g = false;

        /* renamed from: h */
        public String f3124h = ConstantsKt.NONE;

        /* renamed from: i */
        public String f3125i = ConstantsKt.NONE;

        /* renamed from: j */
        public String f3126j = "";

        /* renamed from: k */
        public String f3127k = "";

        /* renamed from: l */
        public C0779b m113229l(boolean z) {
            this.f3121e = z;
            return this;
        }

        /* renamed from: m */
        public C32063By0 m113228m() {
            return new C32063By0(this);
        }

        /* renamed from: n */
        public C0779b m113227n(NetworkInfo.DetailedState detailedState) {
            this.f3118b = detailedState;
            return this;
        }

        /* renamed from: o */
        public C0779b m113226o(String str) {
            this.f3127k = str;
            return this;
        }

        /* renamed from: p */
        public C0779b m113225p(boolean z) {
            this.f3122f = z;
            return this;
        }

        /* renamed from: q */
        public C0779b m113224q(String str) {
            this.f3126j = str;
            return this;
        }

        /* renamed from: r */
        public C0779b m113223r(boolean z) {
            this.f3123g = z;
            return this;
        }

        /* renamed from: s */
        public C0779b m113222s(NetworkInfo.State state) {
            this.f3117a = state;
            return this;
        }

        /* renamed from: t */
        public C0779b m113221t(int i) {
            this.f3120d = i;
            return this;
        }

        /* renamed from: u */
        public C0779b m113220u(String str) {
            this.f3125i = str;
            return this;
        }

        /* renamed from: v */
        public C0779b m113219v(int i) {
            this.f3119c = i;
            return this;
        }

        /* renamed from: w */
        public C0779b m113218w(String str) {
            this.f3124h = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C0779b m113251a() {
        return new C0779b();
    }

    /* renamed from: b */
    public static C32063By0 m113250b() {
        return m113251a().m113228m();
    }

    /* renamed from: c */
    public static C32063By0 m113249c(Context context) {
        BZ3.m113862c(context, "context == null");
        return m113248d(context, m113245g(context));
    }

    /* renamed from: d */
    public static C32063By0 m113248d(Context context, ConnectivityManager connectivityManager) {
        BZ3.m113862c(context, "context == null");
        if (connectivityManager == null) {
            return m113250b();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return m113250b();
        }
        return m113247e(activeNetworkInfo);
    }

    /* renamed from: e */
    public static C32063By0 m113247e(NetworkInfo networkInfo) {
        return new C0779b().m113222s(networkInfo.getState()).m113227n(networkInfo.getDetailedState()).m113219v(networkInfo.getType()).m113221t(networkInfo.getSubtype()).m113229l(networkInfo.isAvailable()).m113225p(networkInfo.isFailover()).m113223r(networkInfo.isRoaming()).m113218w(networkInfo.getTypeName()).m113220u(networkInfo.getSubtypeName()).m113224q(networkInfo.getReason()).m113226o(networkInfo.getExtraInfo()).m113228m();
    }

    /* renamed from: g */
    public static ConnectivityManager m113245g(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C32063By0.class != obj.getClass()) {
            return false;
        }
        C32063By0 c32063By0 = (C32063By0) obj;
        if (this.f3108c != c32063By0.f3108c || this.f3109d != c32063By0.f3109d || this.f3110e != c32063By0.f3110e || this.f3111f != c32063By0.f3111f || this.f3112g != c32063By0.f3112g || this.f3106a != c32063By0.f3106a || this.f3107b != c32063By0.f3107b || !this.f3113h.equals(c32063By0.f3113h)) {
            return false;
        }
        String str = this.f3114i;
        if (str == null ? c32063By0.f3114i != null : !str.equals(c32063By0.f3114i)) {
            return false;
        }
        String str2 = this.f3115j;
        if (str2 == null ? c32063By0.f3115j != null : !str2.equals(c32063By0.f3115j)) {
            return false;
        }
        String str3 = this.f3116k;
        String str4 = c32063By0.f3116k;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public NetworkInfo.DetailedState m113246f() {
        return this.f3107b;
    }

    /* renamed from: h */
    public NetworkInfo.State m113244h() {
        return this.f3106a;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = this.f3106a.hashCode() * 31;
        NetworkInfo.DetailedState detailedState = this.f3107b;
        int i4 = 0;
        if (detailedState != null) {
            i = detailedState.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((((((((((hashCode + i) * 31) + this.f3108c) * 31) + this.f3109d) * 31) + (this.f3110e ? 1 : 0)) * 31) + (this.f3111f ? 1 : 0)) * 31) + (this.f3112g ? 1 : 0)) * 31) + this.f3113h.hashCode()) * 31;
        String str = this.f3114i;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode2 + i2) * 31;
        String str2 = this.f3115j;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        String str3 = this.f3116k;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i6 + i4;
    }

    /* renamed from: i */
    public String m113243i() {
        return this.f3114i;
    }

    /* renamed from: j */
    public int m113242j() {
        return this.f3108c;
    }

    /* renamed from: k */
    public String m113241k() {
        return this.f3113h;
    }

    public String toString() {
        return "Connectivity{state=" + this.f3106a + ", detailedState=" + this.f3107b + ", type=" + this.f3108c + ", subType=" + this.f3109d + ", available=" + this.f3110e + ", failover=" + this.f3111f + ", roaming=" + this.f3112g + ", typeName='" + this.f3113h + CoreConstants.SINGLE_QUOTE_CHAR + ", subTypeName='" + this.f3114i + CoreConstants.SINGLE_QUOTE_CHAR + ", reason='" + this.f3115j + CoreConstants.SINGLE_QUOTE_CHAR + ", extraInfo='" + this.f3116k + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }

    public C32063By0(C0779b c0779b) {
        this.f3106a = c0779b.f3117a;
        this.f3107b = c0779b.f3118b;
        this.f3108c = c0779b.f3119c;
        this.f3109d = c0779b.f3120d;
        this.f3110e = c0779b.f3121e;
        this.f3111f = c0779b.f3122f;
        this.f3112g = c0779b.f3123g;
        this.f3113h = c0779b.f3124h;
        this.f3114i = c0779b.f3125i;
        this.f3115j = c0779b.f3126j;
        this.f3116k = c0779b.f3127k;
    }

    private C32063By0() {
        this(m113251a());
    }
}
