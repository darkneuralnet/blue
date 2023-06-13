package p000;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J-\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, m28432d2 = {"LRc6;", "LKj2;", "Lkotlin/UIntArray;", "LC24;", "Lkotlin/UInt;", "LQc6;", "", "v", "([I)I", "y", "([I)LQc6;", "w", "()[I", "LTt0;", "decoder", "index", "builder", "", "checkIndex", "", "x", "LUt0;", "encoder", "content", "size", "z", "(LUt0;[II)V", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@ExperimentalUnsignedTypes
/* renamed from: Rc6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35615Rc6 extends C24<UInt, UIntArray, C35381Qc6> {

    /* renamed from: c */
    public static final C35615Rc6 f32318c = new C35615Rc6();

    private C35615Rc6() {
        super(C38330b40.m65019r(UInt.Companion));
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo5868e(Object obj) {
        return m86549v(((UIntArray) obj).m116947unboximpl());
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo5866k(Object obj) {
        return m86546y(((UIntArray) obj).m116947unboximpl());
    }

    @Override // p000.C24
    /* renamed from: r */
    public /* bridge */ /* synthetic */ UIntArray mo5865r() {
        return UIntArray.m116931boximpl(m86548w());
    }

    @Override // p000.C24
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo5864u(InterfaceC36464Ut0 interfaceC36464Ut0, UIntArray uIntArray, int i) {
        m86545z(interfaceC36464Ut0, uIntArray.m116947unboximpl(), i);
    }

    /* renamed from: v */
    public int m86549v(int[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UIntArray.m116939getSizeimpl(collectionSize);
    }

    /* renamed from: w */
    public int[] m86548w() {
        return UIntArray.m116932constructorimpl(0);
    }

    @Override // p000.AbstractC42319hm0, p000.AbstractC25581l0
    /* renamed from: x */
    public void mo5867h(InterfaceC36230Tt0 decoder, int i, C35381Qc6 builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m88320e(UInt.m116878constructorimpl(decoder.mo3284r(getDescriptor(), i).mo3280w()));
    }

    /* renamed from: y */
    public C35381Qc6 m86546y(int[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new C35381Qc6(toBuilder, null);
    }

    /* renamed from: z */
    public void m86545z(InterfaceC36464Ut0 encoder, int[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo1172F(getDescriptor(), i2).mo1135p(UIntArray.m116938getpVg5ArA(content, i2));
        }
    }
}
