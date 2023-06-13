package p000;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J-\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, m28432d2 = {"Lmd6;", "LKj2;", "Lkotlin/UShortArray;", "LC24;", "Lkotlin/UShort;", "Lld6;", "", "v", "([S)I", "y", "([S)Lld6;", "w", "()[S", "LTt0;", "decoder", "index", "builder", "", "checkIndex", "", "x", "LUt0;", "encoder", "content", "size", "z", "(LUt0;[SI)V", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@ExperimentalUnsignedTypes
/* renamed from: md6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45200md6 extends C24<UShort, UShortArray, C44607ld6> {

    /* renamed from: c */
    public static final C45200md6 f98458c = new C45200md6();

    private C45200md6() {
        super(C38330b40.m65017t(UShort.Companion));
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo5868e(Object obj) {
        return m25301v(((UShortArray) obj).m117131unboximpl());
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo5866k(Object obj) {
        return m25298y(((UShortArray) obj).m117131unboximpl());
    }

    @Override // p000.C24
    /* renamed from: r */
    public /* bridge */ /* synthetic */ UShortArray mo5865r() {
        return UShortArray.m117115boximpl(m25300w());
    }

    @Override // p000.C24
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo5864u(InterfaceC36464Ut0 interfaceC36464Ut0, UShortArray uShortArray, int i) {
        m25297z(interfaceC36464Ut0, uShortArray.m117131unboximpl(), i);
    }

    /* renamed from: v */
    public int m25301v(short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UShortArray.m117123getSizeimpl(collectionSize);
    }

    /* renamed from: w */
    public short[] m25300w() {
        return UShortArray.m117116constructorimpl(0);
    }

    @Override // p000.AbstractC42319hm0, p000.AbstractC25581l0
    /* renamed from: x */
    public void mo5867h(InterfaceC36230Tt0 decoder, int i, C44607ld6 builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m27066e(UShort.m117064constructorimpl(decoder.mo3284r(getDescriptor(), i).mo3289l()));
    }

    /* renamed from: y */
    public C44607ld6 m25298y(short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new C44607ld6(toBuilder, null);
    }

    /* renamed from: z */
    public void m25297z(InterfaceC36464Ut0 encoder, short[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo1172F(getDescriptor(), i2).mo1139k(UShortArray.m117122getMh2AYeg(content, i2));
        }
    }
}
