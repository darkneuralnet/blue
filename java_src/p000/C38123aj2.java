package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"Laj2;", "LE0;", "LMs5;", "descriptor", "", "q", "", "tag", "Lxi2;", "g0", "LYi2;", "f", "LYi2;", "x0", "()LYi2;", "value", "Lbi2;", "json", "<init>", "(Lbi2;LYi2;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonPrimitiveDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"})
/* renamed from: aj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C38123aj2 extends AbstractC1694E0 {

    /* renamed from: f */
    public final AbstractC37303Yi2 f51011f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38123aj2(AbstractC38706bi2 json, AbstractC37303Yi2 value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f51011f = value;
        m3301Z("primitive");
    }

    @Override // p000.AbstractC1694E0
    /* renamed from: g0 */
    public AbstractC51767xi2 mo11844g0(String tag) {
        boolean z;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo11842v0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: q */
    public int mo11843q(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // p000.AbstractC1694E0
    /* renamed from: x0 */
    public AbstractC37303Yi2 mo11842v0() {
        return this.f51011f;
    }
}
