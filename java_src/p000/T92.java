package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R5\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LT92;", "LMc0;", "", "cause", "", C17296a.f69688o, "", "toString", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "b", "Lkotlin/jvm/functions/Function1;", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: T92 */
/* loaded from: classes8.dex */
public final class T92 extends AbstractC34439Mc0 {

    /* renamed from: b */
    public final Function1<Throwable, Unit> f34846b;

    /* JADX WARN: Multi-variable type inference failed */
    public T92(Function1<? super Throwable, Unit> function1) {
        this.f34846b = function1;
    }

    @Override // p000.AbstractC34673Nc0
    /* renamed from: a */
    public void mo14797a(Throwable th) {
        this.f34846b.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo14797a(th);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "InvokeOnCancel[" + C39783dV0.m44216a(this.f34846b) + '@' + C39783dV0.m44215b(this) + ']';
    }
}
