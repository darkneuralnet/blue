package p000;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0015"}, m28432d2 = {"LPb5;", "LOb5;", "LgV2$c;", "LQb5;", "event", "", "u", "l", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "e0", "(Lkotlin/jvm/functions/Function1;)V", "onEvent", "m", "getOnPreEvent", "f0", "onPreEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35137Pb5 extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC34903Ob5 {

    /* renamed from: l */
    public Function1<? super C35371Qb5, Boolean> f28740l;

    /* renamed from: m */
    public Function1<? super C35371Qb5, Boolean> f28741m;

    public C35137Pb5(Function1<? super C35371Qb5, Boolean> function1, Function1<? super C35371Qb5, Boolean> function12) {
        this.f28740l = function1;
        this.f28741m = function12;
    }

    /* renamed from: e0 */
    public final void m90076e0(Function1<? super C35371Qb5, Boolean> function1) {
        this.f28740l = function1;
    }

    /* renamed from: f0 */
    public final void m90075f0(Function1<? super C35371Qb5, Boolean> function1) {
        this.f28741m = function1;
    }

    @Override // p000.InterfaceC34903Ob5
    /* renamed from: l */
    public boolean mo90074l(C35371Qb5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1<? super C35371Qb5, Boolean> function1 = this.f28741m;
        if (function1 != null) {
            return function1.invoke(event).booleanValue();
        }
        return false;
    }

    @Override // p000.InterfaceC34903Ob5
    /* renamed from: u */
    public boolean mo90073u(C35371Qb5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1<? super C35371Qb5, Boolean> function1 = this.f28740l;
        if (function1 != null) {
            return function1.invoke(event).booleanValue();
        }
        return false;
    }
}
