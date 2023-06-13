package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0012"}, m28432d2 = {"Lbj2;", "LF0;", "", "key", "Lxi2;", "element", "", "y0", "v0", "f", "Lxi2;", "content", "Lbi2;", "json", "Lkotlin/Function1;", "nodeConsumer", "<init>", "(Lbi2;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/JsonPrimitiveEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
/* renamed from: bj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C38716bj2 extends AbstractC2043F0 {

    /* renamed from: f */
    public AbstractC51767xi2 f58004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38716bj2(AbstractC38706bi2 json, Function1<? super AbstractC51767xi2, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        m1146c0("primitive");
    }

    @Override // p000.AbstractC2043F0
    /* renamed from: v0 */
    public AbstractC51767xi2 mo9827v0() {
        AbstractC51767xi2 abstractC51767xi2 = this.f58004f;
        if (abstractC51767xi2 != null) {
            return abstractC51767xi2;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // p000.AbstractC2043F0
    /* renamed from: y0 */
    public void mo9826y0(String key, AbstractC51767xi2 element) {
        boolean z;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        boolean z2 = true;
        if (key == "primitive") {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f58004f != null) {
                z2 = false;
            }
            if (z2) {
                this.f58004f = element;
                return;
            }
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
    }
}
