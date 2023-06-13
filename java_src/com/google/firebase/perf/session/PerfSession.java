package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.Detail;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p000.C45670nQ3;
/* loaded from: classes6.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new C18372a();

    /* renamed from: b */
    public final String f74399b;

    /* renamed from: c */
    public final Timer f74400c;

    /* renamed from: d */
    public boolean f74401d;

    /* renamed from: com.google.firebase.perf.session.PerfSession$a */
    /* loaded from: classes6.dex */
    public class C18372a implements Parcelable.Creator<PerfSession> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel, (C18372a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    public /* synthetic */ PerfSession(Parcel parcel, C18372a c18372a) {
        this(parcel);
    }

    /* renamed from: b */
    public static C45670nQ3[] m47054b(List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        C45670nQ3[] c45670nQ3Arr = new C45670nQ3[list.size()];
        C45670nQ3 m47055a = list.get(0).m47055a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            C45670nQ3 m47055a2 = list.get(i).m47055a();
            if (!z && list.get(i).m47049h()) {
                c45670nQ3Arr[0] = m47055a2;
                c45670nQ3Arr[i] = m47055a;
                z = true;
            } else {
                c45670nQ3Arr[i] = m47055a2;
            }
        }
        if (!z) {
            c45670nQ3Arr[0] = m47055a;
        }
        return c45670nQ3Arr;
    }

    /* renamed from: c */
    public static PerfSession m47053c() {
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replace(Detail.EMPTY_CHAR, ""), new C38141al0());
        perfSession.m47047j(m47046k());
        return perfSession;
    }

    /* renamed from: k */
    public static boolean m47046k() {
        C32036Bv0 m113351g = C32036Bv0.m113351g();
        if (m113351g.m113363K() && Math.random() < m113351g.m113370D()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C45670nQ3 m47055a() {
        C45670nQ3.C26502c m23796N = C45670nQ3.m23800a0().m23796N(this.f74399b);
        if (this.f74401d) {
            m23796N.m23797M(EnumC34147Kv5.GAUGES_AND_SYSTEM_EVENTS);
        }
        return m23796N.build();
    }

    /* renamed from: d */
    public Timer m47052d() {
        return this.f74400c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean m47051e() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.f74400c.m47036c()) > C32036Bv0.m113351g().m113373A()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m47050g() {
        return this.f74401d;
    }

    /* renamed from: h */
    public boolean m47049h() {
        return this.f74401d;
    }

    /* renamed from: i */
    public String m47048i() {
        return this.f74399b;
    }

    /* renamed from: j */
    public void m47047j(boolean z) {
        this.f74401d = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74399b);
        parcel.writeByte(this.f74401d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f74400c, 0);
    }

    public PerfSession(String str, C38141al0 c38141al0) {
        this.f74401d = false;
        this.f74399b = str;
        this.f74400c = c38141al0.m70796a();
    }

    public PerfSession(Parcel parcel) {
        this.f74401d = false;
        this.f74399b = parcel.readString();
        this.f74401d = parcel.readByte() != 0;
        this.f74400c = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
