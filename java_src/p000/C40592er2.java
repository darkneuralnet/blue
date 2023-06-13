package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"Ler2;", "LPx1;", "Li30;", "sink", "", "byteCount", "read", "b", "J", "bytesCountThreshold", "c", "bytesRead", "", C17296a.f69688o, "()Z", "isThresholdReached", "LAN5;", "delegate", "<init>", "(LAN5;J)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLimitingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitingSource.kt\ncom/chuckerteam/chucker/internal/support/LimitingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
/* renamed from: er2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40592er2 extends AbstractC35331Px1 {

    /* renamed from: b */
    public final long f79022b;

    /* renamed from: c */
    public long f79023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40592er2(AN5 delegate, long j) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f79022b = j;
    }

    /* renamed from: a */
    public final boolean m42482a() {
        return this.f79023c >= this.f79022b;
    }

    @Override // p000.AbstractC35331Px1, p000.AN5
    public long read(C42488i30 sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!m42482a()) {
            long read = super.read(sink, j);
            this.f79023c += read;
            return read;
        }
        return -1L;
    }
}
