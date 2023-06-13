package pl.charmas.android.reactivelocation2;

import com.google.android.gms.common.data.AbstractDataBuffer;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.disposables.C23466d;
import io.reactivex.functions.InterfaceC23478a;
import java.util.Iterator;
/* loaded from: classes8.dex */
public final class DataBufferObservable {
    private DataBufferObservable() {
    }

    public static <T> Observable<T> from(final AbstractDataBuffer<T> abstractDataBuffer) {
        return Observable.create(new InterfaceC24579z<T>() { // from class: pl.charmas.android.reactivelocation2.DataBufferObservable.1
            @Override // io.reactivex.InterfaceC24579z
            public void subscribe(InterfaceC24578y<T> interfaceC24578y) {
                Iterator it = AbstractDataBuffer.this.iterator();
                while (it.hasNext()) {
                    interfaceC24578y.onNext(it.next());
                }
                interfaceC24578y.mo11915b(C23466d.m33021c(new InterfaceC23478a() { // from class: pl.charmas.android.reactivelocation2.DataBufferObservable.1.1
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public void run() throws Exception {
                        AbstractDataBuffer.this.release();
                    }
                }));
            }
        });
    }
}
