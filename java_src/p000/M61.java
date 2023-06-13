package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u000f\u0010\rJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R3\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LM61;", "LgV2$c;", "LE61;", "LiA0;", "", "y", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "l", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "e0", "(Lkotlin/jvm/functions/Function1;)V", "onDraw", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: M61 */
/* loaded from: classes.dex */
public final class M61 extends InterfaceC41563gV2.AbstractC20914c implements E61 {

    /* renamed from: l */
    public Function1<? super InterfaceC42558iA0, Unit> f22628l;

    public M61(Function1<? super InterfaceC42558iA0, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.f22628l = onDraw;
    }

    /* renamed from: e0 */
    public final void m95825e0(Function1<? super InterfaceC42558iA0, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f22628l = function1;
    }

    @Override // p000.E61
    /* renamed from: y */
    public void mo4144y(InterfaceC42558iA0 interfaceC42558iA0) {
        Intrinsics.checkNotNullParameter(interfaceC42558iA0, "<this>");
        this.f22628l.invoke(interfaceC42558iA0);
    }
}
