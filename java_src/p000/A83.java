package p000;

import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import p000.InterfaceC44023ke5;
/* renamed from: A83 */
/* loaded from: classes6.dex */
public class A83 implements InterfaceC44023ke5.InterfaceC25199c {

    /* renamed from: A83$a */
    /* loaded from: classes6.dex */
    public class C0041a implements InterfaceC23492o<InterfaceC44023ke5.InterfaceC25199c.C25200a, Observable<InterfaceC44023ke5.InterfaceC25199c.C25200a>> {
        public C0041a() {
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public Observable<InterfaceC44023ke5.InterfaceC25199c.C25200a> apply(InterfaceC44023ke5.InterfaceC25199c.C25200a c25200a) {
            return Observable.error(c25200a.m28704a());
        }
    }

    @Override // io.reactivex.InterfaceC23435C
    /* renamed from: a */
    public Observable<InterfaceC44023ke5.InterfaceC25199c.C25200a> apply(Observable<InterfaceC44023ke5.InterfaceC25199c.C25200a> observable) {
        return observable.flatMap(new C0041a());
    }
}
