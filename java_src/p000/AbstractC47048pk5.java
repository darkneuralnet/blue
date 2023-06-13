package p000;

import android.os.DeadObjectException;
import com.polidea.rxandroidble2.exceptions.BleException;
import com.polidea.rxandroidble2.exceptions.BleScanException;
import io.reactivex.InterfaceC24578y;
import io.reactivex.functions.InterfaceC23483f;
/* renamed from: pk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC47048pk5<SCAN_RESULT_TYPE, SCAN_CALLBACK_TYPE> extends AbstractC38658bd4<SCAN_RESULT_TYPE> {

    /* renamed from: b */
    public final C46978pd5 f104001b;

    /* renamed from: pk5$a */
    /* loaded from: classes6.dex */
    public class C27347a implements InterfaceC23483f {

        /* renamed from: b */
        public final /* synthetic */ Object f104002b;

        public C27347a(Object obj) {
            this.f104002b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23483f
        public void cancel() {
            C52323ye5.m3118k("Scan operation is requested to stop.", new Object[0]);
            AbstractC47048pk5 abstractC47048pk5 = AbstractC47048pk5.this;
            abstractC47048pk5.mo15480f(abstractC47048pk5.f104001b, this.f104002b);
        }
    }

    public AbstractC47048pk5(C46978pd5 c46978pd5) {
        this.f104001b = c46978pd5;
    }

    @Override // p000.AbstractC38658bd4
    /* renamed from: b */
    public final void mo14813b(InterfaceC24578y<SCAN_RESULT_TYPE> interfaceC24578y, InterfaceC39862dd4 interfaceC39862dd4) {
        SCAN_CALLBACK_TYPE mo15482d = mo15482d(interfaceC24578y);
        try {
            interfaceC24578y.mo11916a(new C27347a(mo15482d));
            C52323ye5.m3118k("Scan operation is requested to start.", new Object[0]);
            if (!mo15481e(this.f104001b, mo15482d)) {
                interfaceC24578y.mo11914c(new BleScanException(0));
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p000.AbstractC38658bd4
    /* renamed from: c */
    public BleException mo14812c(DeadObjectException deadObjectException) {
        return new BleScanException(1, deadObjectException);
    }

    /* renamed from: d */
    public abstract SCAN_CALLBACK_TYPE mo15482d(InterfaceC24578y<SCAN_RESULT_TYPE> interfaceC24578y);

    /* renamed from: e */
    public abstract boolean mo15481e(C46978pd5 c46978pd5, SCAN_CALLBACK_TYPE scan_callback_type);

    /* renamed from: f */
    public abstract void mo15480f(C46978pd5 c46978pd5, SCAN_CALLBACK_TYPE scan_callback_type);
}
