package p000;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014J\f\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0004H\u0014J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¨\u0006\u0018"}, m28432d2 = {"LXY;", "LKj2;", "", "LC24;", "", "LWY;", "", "v", "y", "w", "LTt0;", "decoder", "index", "builder", "checkIndex", "", "x", "LUt0;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: XY */
/* loaded from: classes8.dex */
public final class C9425XY extends C24<Boolean, boolean[], C9081WY> {

    /* renamed from: c */
    public static final C9425XY f43377c = new C9425XY();

    private C9425XY() {
        super(C38330b40.m65015v(BooleanCompanionObject.INSTANCE));
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: v */
    public int mo5868e(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // p000.C24
    /* renamed from: w */
    public boolean[] mo5865r() {
        return new boolean[0];
    }

    @Override // p000.AbstractC42319hm0, p000.AbstractC25581l0
    /* renamed from: x */
    public void mo5867h(InterfaceC36230Tt0 decoder, int i, C9081WY builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m78243e(decoder.mo3322E(getDescriptor(), i));
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: y */
    public C9081WY mo5866k(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new C9081WY(zArr);
    }

    @Override // p000.C24
    /* renamed from: z */
    public void mo5864u(InterfaceC36464Ut0 encoder, boolean[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo1129v(getDescriptor(), i2, content[i2]);
        }
    }
}
