package p000;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014J\f\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¨\u0006\u0019"}, m28432d2 = {"Lr70;", "LKj2;", "", "LC24;", "", "Ln70;", "", "v", "y", "w", "LTt0;", "decoder", "index", "builder", "", "checkIndex", "", "x", "LUt0;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: r70  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47865r70 extends C24<Byte, byte[], C45493n70> {

    /* renamed from: c */
    public static final C47865r70 f106480c = new C47865r70();

    private C47865r70() {
        super(C38330b40.m65014w(ByteCompanionObject.INSTANCE));
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: v */
    public int mo5868e(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // p000.C24
    /* renamed from: w */
    public byte[] mo5865r() {
        return new byte[0];
    }

    @Override // p000.AbstractC42319hm0, p000.AbstractC25581l0
    /* renamed from: x */
    public void mo5867h(InterfaceC36230Tt0 decoder, int i, C45493n70 builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m24318e(decoder.mo3326A(getDescriptor(), i));
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: y */
    public C45493n70 mo5866k(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new C45493n70(bArr);
    }

    @Override // p000.C24
    /* renamed from: z */
    public void mo5864u(InterfaceC36464Ut0 encoder, byte[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo1171G(getDescriptor(), i2, content[i2]);
        }
    }
}