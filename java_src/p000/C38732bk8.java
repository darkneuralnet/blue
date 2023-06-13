package p000;

import com.google.android.gms.common.internal.Preconditions;
/* renamed from: bk8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38732bk8 extends C50303vE2 {

    /* renamed from: i */
    public final /* synthetic */ C34987Ok8 f58031i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38732bk8(C34987Ok8 c34987Ok8, int i) {
        super(20);
        this.f58031i = c34987Ok8;
    }

    @Override // p000.C50303vE2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8996a(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return C34987Ok8.m91568p(this.f58031i, str);
    }
}
