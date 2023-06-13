package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016JA\u0010\u0011\u001a\u00020\u0006\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0004H\u0016R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, m28432d2 = {"Lqj2;", "LF0;", "", "key", "Lxi2;", "element", "", "y0", "", "T", "LMs5;", "descriptor", "", "index", "Let5;", "serializer", "value", "E", "(LMs5;ILet5;Ljava/lang/Object;)V", "v0", "", "f", "Ljava/util/Map;", "z0", "()Ljava/util/Map;", "content", "Lbi2;", "json", "Lkotlin/Function1;", "nodeConsumer", "<init>", "(Lbi2;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47628qj2 extends AbstractC2043F0 {

    /* renamed from: f */
    public final Map<String, AbstractC51767xi2> f105684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47628qj2(AbstractC38706bi2 json, Function1<? super AbstractC51767xi2, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f105684f = new LinkedHashMap();
    }

    @Override // p000.AbstractC52858zY5, p000.InterfaceC36464Ut0
    /* renamed from: E */
    public <T> void mo1173E(InterfaceC34588Ms5 descriptor, int i, InterfaceC40615et5<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (t != null || this.f8413d.m30068f()) {
            super.mo1173E(descriptor, i, serializer, t);
        }
    }

    @Override // p000.AbstractC2043F0
    /* renamed from: v0 */
    public AbstractC51767xi2 mo9827v0() {
        return new C35899Si2(this.f105684f);
    }

    @Override // p000.AbstractC2043F0
    /* renamed from: y0 */
    public void mo9826y0(String key, AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f105684f.put(key, element);
    }

    /* renamed from: z0 */
    public final Map<String, AbstractC51767xi2> m17182z0() {
        return this.f105684f;
    }
}
