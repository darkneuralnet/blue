package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, m28432d2 = {"LPc6;", "LKj2;", "Lkotlin/UByte;", "Lrb1;", "encoder", "value", "", "b", "(Lrb1;B)V", "LGV0;", "decoder", C17296a.f69688o, "(LGV0;)B", "LMs5;", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: Pc6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35147Pc6 implements InterfaceC34036Kj2<UByte> {

    /* renamed from: a */
    public static final C35147Pc6 f28748a = new C35147Pc6();

    /* renamed from: b */
    public static final InterfaceC34588Ms5 f28749b = J22.m101283a("kotlin.UByte", C38330b40.m65014w(ByteCompanionObject.INSTANCE));

    private C35147Pc6() {
    }

    /* renamed from: a */
    public byte m90059a(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UByte.m116801constructorimpl(decoder.mo3294g(getDescriptor()).mo3321F());
    }

    /* renamed from: b */
    public void m90058b(InterfaceC48140rb1 encoder, byte b) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo1130u(getDescriptor()).mo1143g(b);
    }

    @Override // p000.E01
    public /* bridge */ /* synthetic */ Object deserialize(GV0 gv0) {
        return UByte.m116795boximpl(m90059a(gv0));
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return f28749b;
    }

    @Override // p000.InterfaceC40615et5
    public /* bridge */ /* synthetic */ void serialize(InterfaceC48140rb1 interfaceC48140rb1, Object obj) {
        m90058b(interfaceC48140rb1, ((UByte) obj).m116851unboximpl());
    }
}
