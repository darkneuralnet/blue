package p000;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000ej\b\u0012\u0004\u0012\u00020\t`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m28432d2 = {"Lsj2;", "LF0;", "LMs5;", "descriptor", "", "index", "", "e0", "key", "Lxi2;", "element", "", "y0", "v0", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "Ljava/util/ArrayList;", "array", "Lbi2;", "json", "Lkotlin/Function1;", "nodeConsumer", "<init>", "(Lbi2;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48813sj2 extends AbstractC2043F0 {

    /* renamed from: f */
    public final ArrayList<AbstractC51767xi2> f109154f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48813sj2(AbstractC38706bi2 json, Function1<? super AbstractC51767xi2, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f109154f = new ArrayList<>();
    }

    @Override // p000.AbstractC2043F0, p000.AbstractC46927pY2
    /* renamed from: e0 */
    public String mo13778e0(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // p000.AbstractC2043F0
    /* renamed from: v0 */
    public AbstractC51767xi2 mo9827v0() {
        return new C40502ei2(this.f109154f);
    }

    @Override // p000.AbstractC2043F0
    /* renamed from: y0 */
    public void mo9826y0(String key, AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f109154f.add(Integer.parseInt(key), element);
    }
}
