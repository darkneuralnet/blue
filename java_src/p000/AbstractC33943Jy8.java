package p000;

import java.util.UUID;
import p000.PC8;
/* renamed from: Jy8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33943Jy8<T extends PC8> implements PC8 {

    /* renamed from: b */
    public final T f18873b;

    /* renamed from: c */
    public final UUID f18874c;

    /* renamed from: d */
    public final String f18875d;

    public AbstractC33943Jy8(String str, T t) {
        str.getClass();
        this.f18875d = str;
        this.f18873b = t;
        this.f18874c = t.zzc();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FE8.m107397f(this);
    }

    public final String toString() {
        return FE8.m107399d(this);
    }

    @Override // p000.PC8
    public final T zza() {
        return this.f18873b;
    }

    @Override // p000.PC8
    public final String zzb() {
        return this.f18875d;
    }

    @Override // p000.PC8
    public final UUID zzc() {
        return this.f18874c;
    }

    public AbstractC33943Jy8(String str, UUID uuid) {
        str.getClass();
        this.f18875d = str;
        this.f18873b = null;
        this.f18874c = uuid;
    }
}
