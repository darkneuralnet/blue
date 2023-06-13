package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LFM5;", "", "T", "LZD3;", "Lkotlin/Function2;", "Lpt2;", "Lot2;", "", "callback", "w", "", "index", "M", "l", "LZD3;", "pagedList", "", "m", "Z", "J", "()Z", "isImmutable", "n", "I", "isDetached", "A", "()Ljava/lang/Object;", "lastKey", "<init>", "(LZD3;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: FM5 */
/* loaded from: classes.dex */
public final class FM5<T> extends ZD3<T> {

    /* renamed from: l */
    public final ZD3<T> f9247l;

    /* renamed from: m */
    public final boolean f9248m;

    /* renamed from: n */
    public final boolean f9249n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FM5(ZD3<T> pagedList) {
        super(pagedList.mo36684E(), pagedList.m73547z(), pagedList.m73569C(), pagedList.m73565H().m64796I(), pagedList.m73548y());
        Intrinsics.checkNotNullParameter(pagedList, "pagedList");
        this.f9247l = pagedList;
        this.f9248m = true;
        this.f9249n = true;
    }

    @Override // p000.ZD3
    /* renamed from: A */
    public Object mo36685A() {
        return this.f9247l.mo36685A();
    }

    @Override // p000.ZD3
    /* renamed from: I */
    public boolean mo36683I() {
        return this.f9249n;
    }

    @Override // p000.ZD3
    /* renamed from: J */
    public boolean mo73564J() {
        return this.f9248m;
    }

    @Override // p000.ZD3
    /* renamed from: M */
    public void mo36682M(int i) {
    }

    @Override // p000.ZD3
    /* renamed from: w */
    public void mo36664w(Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
