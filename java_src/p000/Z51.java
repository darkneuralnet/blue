package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import p000.E24;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LZ51;", "LKj2;", "", "Lrb1;", "encoder", "value", "", "b", "LGV0;", "decoder", C17296a.f69688o, "(LGV0;)Ljava/lang/Double;", "LMs5;", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: Z51 */
/* loaded from: classes8.dex */
public final class Z51 implements InterfaceC34036Kj2<Double> {

    /* renamed from: a */
    public static final Z51 f47834a = new Z51();

    /* renamed from: b */
    public static final InterfaceC34588Ms5 f47835b = new I24("kotlin.Double", E24.C1716d.f6868a);

    private Z51() {
    }

    @Override // p000.E01
    /* renamed from: a */
    public Double deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.mo3287n());
    }

    /* renamed from: b */
    public void m73740b(InterfaceC48140rb1 encoder, double d) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo1131t(d);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return f47835b;
    }

    @Override // p000.InterfaceC40615et5
    public /* bridge */ /* synthetic */ void serialize(InterfaceC48140rb1 interfaceC48140rb1, Object obj) {
        m73740b(interfaceC48140rb1, ((Number) obj).doubleValue());
    }
}