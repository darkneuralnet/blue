package p000;

import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"Luj2;", "Lqj2;", "", "key", "Lxi2;", "element", "", "y0", "v0", "g", "Ljava/lang/String;", "tag", "", "h", "Z", "isKey", "Lbi2;", "json", "Lkotlin/Function1;", "nodeConsumer", "<init>", "(Lbi2;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49999uj2 extends C47628qj2 {

    /* renamed from: g */
    public String f112803g;

    /* renamed from: h */
    public boolean f112804h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49999uj2(AbstractC38706bi2 json, Function1<? super AbstractC51767xi2, Unit> nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f112804h = true;
    }

    @Override // p000.C47628qj2, p000.AbstractC2043F0
    /* renamed from: v0 */
    public AbstractC51767xi2 mo9827v0() {
        return new C35899Si2(m17182z0());
    }

    @Override // p000.C47628qj2, p000.AbstractC2043F0
    /* renamed from: y0 */
    public void mo9826y0(String key, AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f112804h) {
            if (element instanceof AbstractC37303Yi2) {
                this.f112803g = ((AbstractC37303Yi2) element).mo74434a();
                this.f112804h = false;
                return;
            } else if (!(element instanceof C35899Si2)) {
                if (element instanceof C40502ei2) {
                    throw C32857Fi2.m106732d(C41688gi2.f84048a.getDescriptor());
                }
                throw new NoWhenBranchMatchedException();
            } else {
                throw C32857Fi2.m106732d(C36601Vi2.f39503a.getDescriptor());
            }
        }
        Map<String, AbstractC51767xi2> m17182z0 = m17182z0();
        String str = this.f112803g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tag");
            str = null;
        }
        m17182z0.put(str, element);
        this.f112804h = true;
    }
}
