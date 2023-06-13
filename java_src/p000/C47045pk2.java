package p000;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B6\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0007R3\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR3\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"Lpk2;", "Lrk2;", "LgV2$c;", "Lik2;", "event", "", "w", "(Landroid/view/KeyEvent;)Z", "n", "Lkotlin/Function1;", "l", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "e0", "(Lkotlin/jvm/functions/Function1;)V", "onEvent", "m", "getOnPreEvent", "f0", "onPreEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47045pk2 extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC48231rk2 {

    /* renamed from: l */
    public Function1<? super C42894ik2, Boolean> f103998l;

    /* renamed from: m */
    public Function1<? super C42894ik2, Boolean> f103999m;

    public C47045pk2(Function1<? super C42894ik2, Boolean> function1, Function1<? super C42894ik2, Boolean> function12) {
        this.f103998l = function1;
        this.f103999m = function12;
    }

    /* renamed from: e0 */
    public final void m18867e0(Function1<? super C42894ik2, Boolean> function1) {
        this.f103998l = function1;
    }

    /* renamed from: f0 */
    public final void m18866f0(Function1<? super C42894ik2, Boolean> function1) {
        this.f103999m = function1;
    }

    @Override // p000.InterfaceC48231rk2
    /* renamed from: n */
    public boolean mo15484n(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1<? super C42894ik2, Boolean> function1 = this.f103999m;
        if (function1 != null) {
            return function1.invoke(C42894ik2.m33523a(event)).booleanValue();
        }
        return false;
    }

    @Override // p000.InterfaceC48231rk2
    /* renamed from: w */
    public boolean mo15483w(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1<? super C42894ik2, Boolean> function1 = this.f103998l;
        if (function1 != null) {
            return function1.invoke(C42894ik2.m33523a(event)).booleanValue();
        }
        return false;
    }
}
