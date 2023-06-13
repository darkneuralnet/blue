package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new C18374a();

    /* renamed from: b */
    public long f74403b;

    /* renamed from: c */
    public long f74404c;

    /* renamed from: com.google.firebase.perf.util.Timer$a */
    /* loaded from: classes6.dex */
    public class C18374a implements Parcelable.Creator<Timer> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (C18374a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Timer[] newArray(int i) {
            return new Timer[i];
        }
    }

    public /* synthetic */ Timer(Parcel parcel, C18374a c18374a) {
        this(parcel);
    }

    /* renamed from: a */
    public static long m47038a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* renamed from: g */
    public static Timer m47033g(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new Timer(m47031i() + (micros - m47038a()), micros);
    }

    /* renamed from: i */
    public static long m47031i() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    /* renamed from: b */
    public long m47037b() {
        return this.f74403b + m47036c();
    }

    /* renamed from: c */
    public long m47036c() {
        return m47035d(new Timer());
    }

    /* renamed from: d */
    public long m47035d(Timer timer) {
        return timer.f74404c - this.f74404c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long m47034e() {
        return this.f74403b;
    }

    /* renamed from: h */
    public void m47032h() {
        this.f74403b = m47031i();
        this.f74404c = m47038a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f74403b);
        parcel.writeLong(this.f74404c);
    }

    public Timer() {
        this(m47031i(), m47038a());
    }

    @VisibleForTesting
    public Timer(long j, long j2) {
        this.f74403b = j;
        this.f74404c = j2;
    }

    public Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
