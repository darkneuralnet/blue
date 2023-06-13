package p000;

import android.os.Looper;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.C23466d;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¨\u0006\u0004"}, m28432d2 = {"Lio/reactivex/D;", "observer", "", C17296a.f69688o, "rxbinding_release"}, m28431k = 2, m28430mv = {1, 4, 0})
@JvmName(name = "Preconditions")
/* renamed from: GZ3 */
/* loaded from: classes6.dex */
public final class GZ3 {
    /* renamed from: a */
    public static final boolean m105004a(InterfaceC23436D<?> interfaceC23436D) {
        if (!(!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()))) {
            return true;
        }
        interfaceC23436D.onSubscribe(C23466d.m33022b());
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called on the main thread but was ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        interfaceC23436D.onError(new IllegalStateException(sb.toString()));
        return false;
    }
}
