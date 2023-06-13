package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, m28432d2 = {"LSc6;", "LKj2;", "Lkotlin/UInt;", "Lrb1;", "encoder", "value", "", "b", "(Lrb1;I)V", "LGV0;", "decoder", C17296a.f69688o, "(LGV0;)I", "LMs5;", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: Sc6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35849Sc6 implements InterfaceC34036Kj2<UInt> {

    /* renamed from: a */
    public static final C35849Sc6 f33965a = new C35849Sc6();

    /* renamed from: b */
    public static final InterfaceC34588Ms5 f33966b = J22.m101283a("kotlin.UInt", C38330b40.m65041A(IntCompanionObject.INSTANCE));

    private C35849Sc6() {
    }

    /* renamed from: a */
    public int m85185a(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UInt.m116878constructorimpl(decoder.mo3294g(getDescriptor()).mo3280w());
    }

    /* renamed from: b */
    public void m85184b(InterfaceC48140rb1 encoder, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo1130u(getDescriptor()).mo1135p(i);
    }

    @Override // p000.E01
    public /* bridge */ /* synthetic */ Object deserialize(GV0 gv0) {
        return UInt.m116872boximpl(m85185a(gv0));
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return f33966b;
    }

    @Override // p000.InterfaceC40615et5
    public /* bridge */ /* synthetic */ void serialize(InterfaceC48140rb1 interfaceC48140rb1, Object obj) {
        m85184b(interfaceC48140rb1, ((UInt) obj).m116930unboximpl());
    }
}
