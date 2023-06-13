package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0013j\u0002`\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR'\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0013j\u0002`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LL74;", "Ljava/io/FilterInputStream;", "", "readlimit", "", "mark", "reset", "", "n", "skip", "", "b", "off", "len", "read", "J", "position", "c", "markedPosition", "Lkotlin/Function1;", "Lcom/github/kittinunf/fuel/util/ReadProgress;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "getOnProgress", "()Lkotlin/jvm/functions/Function1;", "onProgress", "Ljava/io/InputStream;", "stream", "<init>", "(Ljava/io/InputStream;Lkotlin/jvm/functions/Function1;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: L74 */
/* loaded from: classes5.dex */
public final class L74 extends FilterInputStream {

    /* renamed from: b */
    public long f20785b;

    /* renamed from: c */
    public long f20786c;

    /* renamed from: d */
    public final Function1<Long, Unit> f20787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L74(InputStream stream, Function1<? super Long, Unit> onProgress) {
        super(stream);
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.f20787d = onProgress;
        this.f20786c = -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        super.mark(i);
        this.f20786c = this.f20785b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        long max = this.f20785b + Math.max(read, 0);
        this.f20785b = max;
        this.f20787d.invoke(Long.valueOf(max));
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        this.f20785b = this.f20786c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return super.skip(j);
    }
}
