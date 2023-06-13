package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\u0010\u0010\u000eJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R3\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Ly61;", "LgV2$c;", "LE61;", "LiA0;", "", "y", "Lkotlin/Function1;", "LI61;", "Lkotlin/ExtensionFunctionType;", "l", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "e0", "(Lkotlin/jvm/functions/Function1;)V", "onDraw", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: y61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52005y61 extends InterfaceC41563gV2.AbstractC20914c implements E61 {

    /* renamed from: l */
    public Function1<? super I61, Unit> f118750l;

    public C52005y61(Function1<? super I61, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.f118750l = onDraw;
    }

    /* renamed from: e0 */
    public final void m4145e0(Function1<? super I61, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f118750l = function1;
    }

    @Override // p000.E61
    /* renamed from: y */
    public void mo4144y(InterfaceC42558iA0 interfaceC42558iA0) {
        Intrinsics.checkNotNullParameter(interfaceC42558iA0, "<this>");
        this.f118750l.invoke(interfaceC42558iA0);
        interfaceC42558iA0.mo34387n0();
    }
}
