package p000;

import android.os.DeadObjectException;
import com.polidea.rxandroidble2.exceptions.BleException;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
/* renamed from: bd4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC38658bd4<T> implements InterfaceC37295Yh3<T> {

    /* renamed from: bd4$a */
    /* loaded from: classes6.dex */
    public class C12459a implements InterfaceC24579z<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC39862dd4 f57772b;

        public C12459a(InterfaceC39862dd4 interfaceC39862dd4) {
            this.f57772b = interfaceC39862dd4;
        }

        @Override // io.reactivex.InterfaceC24579z
        public void subscribe(InterfaceC24578y<T> interfaceC24578y) {
            try {
                AbstractC38658bd4.this.mo14813b(interfaceC24578y, this.f57772b);
            } catch (DeadObjectException e) {
                interfaceC24578y.mo11914c(AbstractC38658bd4.this.mo14812c(e));
                C52323ye5.m3124e(e, "QueueOperation terminated with a DeadObjectException", new Object[0]);
            } catch (Throwable th) {
                interfaceC24578y.mo11914c(th);
                C52323ye5.m3124e(th, "QueueOperation terminated with an unexpected exception", new Object[0]);
            }
        }
    }

    @Override // p000.InterfaceC37295Yh3
    /* renamed from: Q */
    public O24 mo64262Q() {
        return O24.f25568c;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(InterfaceC37295Yh3 interfaceC37295Yh3) {
        return interfaceC37295Yh3.mo64262Q().f25570a - mo64262Q().f25570a;
    }

    /* renamed from: b */
    public abstract void mo14813b(InterfaceC24578y<T> interfaceC24578y, InterfaceC39862dd4 interfaceC39862dd4) throws Throwable;

    /* renamed from: c */
    public abstract BleException mo14812c(DeadObjectException deadObjectException);

    @Override // p000.InterfaceC37295Yh3
    /* renamed from: y0 */
    public final Observable<T> mo64260y0(InterfaceC39862dd4 interfaceC39862dd4) {
        return Observable.create(new C12459a(interfaceC39862dd4));
    }
}
