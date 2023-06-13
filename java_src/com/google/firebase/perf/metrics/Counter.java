package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes6.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new C18369a();

    /* renamed from: b */
    public final String f74382b;

    /* renamed from: c */
    public final AtomicLong f74383c;

    /* renamed from: com.google.firebase.perf.metrics.Counter$a */
    /* loaded from: classes6.dex */
    public class C18369a implements Parcelable.Creator<Counter> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Counter[] newArray(int i) {
            return new Counter[i];
        }
    }

    public /* synthetic */ Counter(Parcel parcel, C18369a c18369a) {
        this(parcel);
    }

    /* renamed from: a */
    public long m47090a() {
        return this.f74383c.get();
    }

    /* renamed from: b */
    public String m47089b() {
        return this.f74382b;
    }

    /* renamed from: c */
    public void m47088c(long j) {
        this.f74383c.addAndGet(j);
    }

    /* renamed from: d */
    public void m47087d(long j) {
        this.f74383c.set(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74382b);
        parcel.writeLong(this.f74383c.get());
    }

    public Counter(String str) {
        this.f74382b = str;
        this.f74383c = new AtomicLong(0L);
    }

    public Counter(Parcel parcel) {
        this.f74382b = parcel.readString();
        this.f74383c = new AtomicLong(parcel.readLong());
    }
}
