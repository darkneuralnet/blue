package p000;

import android.bluetooth.BluetoothGatt;
import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import p000.InterfaceC41846gy0;
/* renamed from: Ly0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34403Ly0 implements InterfaceC33233Gy0 {

    /* renamed from: a */
    public final InterfaceC34043Kk0 f22344a;

    /* renamed from: b */
    public final InterfaceC41846gy0.InterfaceC22520a f22345b;

    /* renamed from: c */
    public final AbstractC23437E f22346c;

    public C34403Ly0(InterfaceC34043Kk0 interfaceC34043Kk0, InterfaceC41846gy0.InterfaceC22520a interfaceC22520a, AbstractC23437E abstractC23437E) {
        this.f22344a = interfaceC34043Kk0;
        this.f22345b = interfaceC22520a;
        this.f22346c = abstractC23437E;
    }

    /* renamed from: f */
    public static /* synthetic */ void m96058f(Set set, InterfaceC23465c interfaceC23465c) throws Exception {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC52518yy0) it.next()).mo2204c();
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m96057g(Set set) throws Exception {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC52518yy0) it.next()).mo2205b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ InterfaceC23434B m96056h(C51332wy0 c51332wy0) throws Exception {
        InterfaceC41846gy0 build = this.f22345b.mo37279a(c51332wy0.f116897a).mo37277c(c51332wy0.f116898b).mo37278b(c51332wy0.f116899c).build();
        final Set<InterfaceC52518yy0> mo37283a = build.mo37283a();
        return m96054j(build).mergeWith(m96055i(build)).delaySubscription(m96059e(build)).doOnSubscribe(new InterfaceC23484g() { // from class: Iy0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34403Ly0.m96058f(mo37283a, (InterfaceC23465c) obj);
            }
        }).doFinally(new InterfaceC23478a() { // from class: Jy0
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C34403Ly0.m96057g(mo37283a);
            }
        }).subscribeOn(this.f22346c).unsubscribeOn(this.f22346c);
    }

    /* renamed from: i */
    public static Observable<InterfaceC44023ke5> m96055i(InterfaceC41846gy0 interfaceC41846gy0) {
        return interfaceC41846gy0.mo37282b().m8311k();
    }

    /* renamed from: j */
    public static Observable<InterfaceC44023ke5> m96054j(final InterfaceC41846gy0 interfaceC41846gy0) {
        Objects.requireNonNull(interfaceC41846gy0);
        return Observable.fromCallable(new Callable() { // from class: Ky0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InterfaceC41846gy0.this.mo37281c();
            }
        });
    }

    @Override // p000.InterfaceC33233Gy0
    /* renamed from: a */
    public Observable<InterfaceC44023ke5> mo96063a(final C51332wy0 c51332wy0) {
        return Observable.defer(new Callable() { // from class: Hy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m96056h;
                m96056h = C34403Ly0.this.m96056h(c51332wy0);
                return m96056h;
            }
        });
    }

    /* renamed from: e */
    public Observable<BluetoothGatt> m96059e(InterfaceC41846gy0 interfaceC41846gy0) {
        return this.f22344a.mo14979a(interfaceC41846gy0.mo37280d());
    }
}
