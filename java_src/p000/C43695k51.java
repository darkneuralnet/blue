package p000;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R%\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lk51;", "LPv4;", "", "onRemembered", "onForgotten", "onAbandoned", "Lkotlin/Function1;", "Lm51;", "Ll51;", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function1;", "effect", "c", "Ll51;", "onDispose", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43695k51 implements InterfaceC35316Pv4 {

    /* renamed from: b */
    public final Function1<C44881m51, InterfaceC44288l51> f93881b;

    /* renamed from: c */
    public InterfaceC44288l51 f93882c;

    /* JADX WARN: Multi-variable type inference failed */
    public C43695k51(Function1<? super C44881m51, ? extends InterfaceC44288l51> effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f93881b = effect;
    }

    @Override // p000.InterfaceC35316Pv4
    public void onAbandoned() {
    }

    @Override // p000.InterfaceC35316Pv4
    public void onForgotten() {
        InterfaceC44288l51 interfaceC44288l51 = this.f93882c;
        if (interfaceC44288l51 != null) {
            interfaceC44288l51.dispose();
        }
        this.f93882c = null;
    }

    @Override // p000.InterfaceC35316Pv4
    public void onRemembered() {
        C44881m51 c44881m51;
        Function1<C44881m51, InterfaceC44288l51> function1 = this.f93881b;
        c44881m51 = Y91.f44702a;
        this.f93882c = function1.invoke(c44881m51);
    }
}
