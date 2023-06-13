package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LHt0;", "LFt0;", "", "value", "", "m", "", "c", "Z", "forceQuoting", "LDj2;", "writer", "<init>", "(LDj2;Z)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ht0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C33422Ht0 extends C32954Ft0 {

    /* renamed from: c */
    public final boolean f14137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33422Ht0(InterfaceC32398Dj2 writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f14137c = z;
    }

    @Override // p000.C32954Ft0
    /* renamed from: m */
    public void mo103244m(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f14137c) {
            super.mo103244m(value);
        } else {
            super.m106325j(value);
        }
    }
}
