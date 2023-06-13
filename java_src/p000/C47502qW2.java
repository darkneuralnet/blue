package p000;

import com.polidea.rxandroidble2.exceptions.BleGattException;
import io.reactivex.Observable;
import io.reactivex.disposables.C23469g;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.functions.C23506a;
/* renamed from: qW2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47502qW2 implements InterfaceC52518yy0, InterfaceC46316oW2, InterfaceC23484g<Integer> {

    /* renamed from: b */
    public Integer f105364b;

    /* renamed from: c */
    public final Observable<Integer> f105365c;

    /* renamed from: d */
    public final C23469g f105366d = new C23469g();

    /* renamed from: qW2$a */
    /* loaded from: classes6.dex */
    public class C27611a implements InterfaceC23494q<Throwable> {
        public C27611a() {
        }

        @Override // io.reactivex.functions.InterfaceC23494q
        /* renamed from: a */
        public boolean test(Throwable th) {
            if ((th instanceof BleGattException) && ((BleGattException) th).m45869b() == C29202uU.f112447l) {
                return true;
            }
            return false;
        }
    }

    public C47502qW2(C50544ve5 c50544ve5, int i) {
        this.f105365c = c50544ve5.m8316f().retry(new C27611a());
        this.f105364b = Integer.valueOf(i);
    }

    @Override // io.reactivex.functions.InterfaceC23484g
    /* renamed from: a */
    public void accept(Integer num) {
        this.f105364b = num;
    }

    @Override // p000.InterfaceC52518yy0
    /* renamed from: b */
    public void mo2205b() {
        this.f105366d.dispose();
    }

    @Override // p000.InterfaceC52518yy0
    /* renamed from: c */
    public void mo2204c() {
        this.f105366d.m33017a(this.f105365c.subscribe(this, C23506a.m32967g()));
    }
}
