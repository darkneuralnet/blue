package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002R\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lh06;", "LAN5;", "Li30;", "sink", "", "byteCount", "read", "", "close", "LJ46;", "timeout", "bytesRead", C17296a.f69688o, "b", "LAN5;", "upstream", "LwB5;", "c", "LwB5;", "sideStream", DateTokenConverter.CONVERTER_KEY, "Li30;", "tempBuffer", "", "e", "Z", "isFailure", "<init>", "(LAN5;LwB5;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: h06  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41871h06 implements AN5 {

    /* renamed from: b */
    public final AN5 f84591b;

    /* renamed from: c */
    public final InterfaceC50872wB5 f84592c;

    /* renamed from: d */
    public final C42488i30 f84593d;

    /* renamed from: e */
    public boolean f84594e;

    public C41871h06(AN5 upstream, InterfaceC50872wB5 sideStream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(sideStream, "sideStream");
        this.f84591b = upstream;
        this.f84592c = sideStream;
        this.f84593d = new C42488i30();
    }

    /* renamed from: a */
    public final void m37231a(C42488i30 c42488i30, long j) {
        c42488i30.m34553l(this.f84593d, c42488i30.size() - j, j);
        try {
            this.f84592c.write(this.f84593d, j);
        } catch (IOException unused) {
            this.f84594e = true;
            m37230b();
        }
    }

    /* renamed from: b */
    public final void m37230b() {
        try {
            this.f84592c.close();
        } catch (IOException unused) {
            this.f84594e = true;
        }
    }

    @Override // p000.AN5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m37230b();
        this.f84591b.close();
    }

    @Override // p000.AN5
    public long read(C42488i30 sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long read = this.f84591b.read(sink, j);
        if (read == -1) {
            m37230b();
            return -1L;
        }
        if (!this.f84594e) {
            m37231a(sink, read);
        }
        return read;
    }

    @Override // p000.AN5
    public J46 timeout() {
        return this.f84591b.timeout();
    }
}
