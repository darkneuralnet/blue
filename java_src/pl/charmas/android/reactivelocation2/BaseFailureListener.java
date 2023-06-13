package pl.charmas.android.reactivelocation2;

import com.google.android.gms.tasks.OnFailureListener;
import io.reactivex.InterfaceC24578y;
/* loaded from: classes8.dex */
public class BaseFailureListener<T> implements OnFailureListener {
    private final InterfaceC24578y<? super T> emitter;

    public BaseFailureListener(InterfaceC24578y<? super T> interfaceC24578y) {
        this.emitter = interfaceC24578y;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        if (this.emitter.mo1769e()) {
            return;
        }
        this.emitter.onError(exc);
        this.emitter.onComplete();
    }
}
