package p000;

import android.graphics.Rect;
import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"LZb;", "LC20;", "Lnm2;", "childCoordinates", "Lkotlin/Function0;", "LOs4;", "boundsProvider", "", C17296a.f69688o, "(Lnm2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/View;", "b", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zb */
/* loaded from: classes.dex */
public final class C10297Zb implements C20 {

    /* renamed from: b */
    public final View f48795b;

    public C10297Zb(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f48795b = view;
    }

    @Override // p000.C20
    /* renamed from: a */
    public Object mo72908a(InterfaceC45879nm2 interfaceC45879nm2, Function0<C35055Os4> function0, Continuation<? super Unit> continuation) {
        C35055Os4 m91248s;
        Rect m97913c;
        long m20516e = C46472om2.m20516e(interfaceC45879nm2);
        C35055Os4 invoke = function0.invoke();
        if (invoke != null && (m91248s = invoke.m91248s(m20516e)) != null) {
            View view = this.f48795b;
            m97913c = L20.m97913c(m91248s);
            view.requestRectangleOnScreen(m97913c, false);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
