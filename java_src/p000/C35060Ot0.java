package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"LOt0;", "LFt0;", "", "v", "", "h", "", "i", "", DateTokenConverter.CONVERTER_KEY, "", "k", "", "c", "Z", "forceQuoting", "LDj2;", "writer", "<init>", "(LDj2;Z)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ot0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35060Ot0 extends C32954Ft0 {

    /* renamed from: c */
    public final boolean f27526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35060Ot0(InterfaceC32398Dj2 writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f27526c = z;
    }

    @Override // p000.C32954Ft0
    /* renamed from: d */
    public void mo91211d(byte b) {
        boolean z = this.f27526c;
        String m116845toStringimpl = UByte.m116845toStringimpl(UByte.m116801constructorimpl(b));
        if (z) {
            mo103244m(m116845toStringimpl);
        } else {
            m106325j(m116845toStringimpl);
        }
    }

    @Override // p000.C32954Ft0
    /* renamed from: h */
    public void mo91210h(int i) {
        String l;
        String l2;
        boolean z = this.f27526c;
        int m116878constructorimpl = UInt.m116878constructorimpl(i);
        if (z) {
            l2 = Long.toString(m116878constructorimpl & 4294967295L, 10);
            mo103244m(l2);
            return;
        }
        l = Long.toString(m116878constructorimpl & 4294967295L, 10);
        m106325j(l);
    }

    @Override // p000.C32954Ft0
    /* renamed from: i */
    public void mo91209i(long j) {
        String m94636a;
        String m93234a;
        boolean z = this.f27526c;
        long m116957constructorimpl = ULong.m116957constructorimpl(j);
        if (z) {
            m93234a = C34826Nt0.m93234a(m116957constructorimpl, 10);
            mo103244m(m93234a);
            return;
        }
        m94636a = C34592Mt0.m94636a(m116957constructorimpl, 10);
        m106325j(m94636a);
    }

    @Override // p000.C32954Ft0
    /* renamed from: k */
    public void mo91208k(short s) {
        boolean z = this.f27526c;
        String m117108toStringimpl = UShort.m117108toStringimpl(UShort.m117064constructorimpl(s));
        if (z) {
            mo103244m(m117108toStringimpl);
        } else {
            m106325j(m117108toStringimpl);
        }
    }
}
