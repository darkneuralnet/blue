package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0010j\u0002`\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0010j\u0002`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"LO74;", "Ljava/io/FilterOutputStream;", "", "b", "", "off", "len", "", "write", "", "J", "getPosition", "()J", "setPosition", "(J)V", "position", "Lkotlin/Function1;", "Lcom/github/kittinunf/fuel/util/WriteProgress;", "c", "Lkotlin/jvm/functions/Function1;", "getOnProgress", "()Lkotlin/jvm/functions/Function1;", "onProgress", "Ljava/io/OutputStream;", "stream", "<init>", "(Ljava/io/OutputStream;Lkotlin/jvm/functions/Function1;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: O74 */
/* loaded from: classes5.dex */
public final class O74 extends FilterOutputStream {

    /* renamed from: b */
    public long f25924b;

    /* renamed from: c */
    public final Function1<Long, Unit> f25925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O74(OutputStream stream, Function1<? super Long, Unit> onProgress) {
        super(stream);
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.f25925c = onProgress;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        long j = this.f25924b + i2;
        this.f25924b = j;
        this.f25925c.invoke(Long.valueOf(j));
    }
}
