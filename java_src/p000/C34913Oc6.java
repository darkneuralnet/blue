package p000;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J-\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, m28432d2 = {"LOc6;", "LKj2;", "Lkotlin/UByteArray;", "LC24;", "Lkotlin/UByte;", "LNc6;", "", "v", "([B)I", "y", "([B)LNc6;", "w", "()[B", "LTt0;", "decoder", "index", "builder", "", "checkIndex", "", "x", "LUt0;", "encoder", "content", "size", "z", "(LUt0;[BI)V", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@ExperimentalUnsignedTypes
/* renamed from: Oc6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34913Oc6 extends C24<UByte, UByteArray, C34679Nc6> {

    /* renamed from: c */
    public static final C34913Oc6 f26946c = new C34913Oc6();

    private C34913Oc6() {
        super(C38330b40.m65020q(UByte.Companion));
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo5868e(Object obj) {
        return m91793v(((UByteArray) obj).m116868unboximpl());
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo5866k(Object obj) {
        return m91790y(((UByteArray) obj).m116868unboximpl());
    }

    @Override // p000.C24
    /* renamed from: r */
    public /* bridge */ /* synthetic */ UByteArray mo5865r() {
        return UByteArray.m116852boximpl(m91792w());
    }

    @Override // p000.C24
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo5864u(InterfaceC36464Ut0 interfaceC36464Ut0, UByteArray uByteArray, int i) {
        m91789z(interfaceC36464Ut0, uByteArray.m116868unboximpl(), i);
    }

    /* renamed from: v */
    public int m91793v(byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UByteArray.m116860getSizeimpl(collectionSize);
    }

    /* renamed from: w */
    public byte[] m91792w() {
        return UByteArray.m116853constructorimpl(0);
    }

    @Override // p000.AbstractC42319hm0, p000.AbstractC25581l0
    /* renamed from: x */
    public void mo5867h(InterfaceC36230Tt0 decoder, int i, C34679Nc6 builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m93700e(UByte.m116801constructorimpl(decoder.mo3284r(getDescriptor(), i).mo3321F()));
    }

    /* renamed from: y */
    public C34679Nc6 m91790y(byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new C34679Nc6(toBuilder, null);
    }

    /* renamed from: z */
    public void m91789z(InterfaceC36464Ut0 encoder, byte[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo1172F(getDescriptor(), i2).mo1143g(UByteArray.m116859getw2LRezQ(content, i2));
        }
    }
}
