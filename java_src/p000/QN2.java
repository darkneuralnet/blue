package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.AbstractC11719f;
import com.facebook.share.internal.C17296a;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", C17296a.f69688o, "Ljava/util/HashSet;", "pendingInvalidates", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: QN2 */
/* loaded from: classes2.dex */
public final class QN2 {

    /* renamed from: a */
    public static final HashSet<Integer> f30291a = new HashSet<>();

    /* renamed from: b */
    public static final Handler f30292b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: PN2
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m88536d;
            m88536d = QN2.m88536d(message);
            return m88536d;
        }
    });

    /* renamed from: d */
    public static final boolean m88536d(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Object obj = message.obj;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.airbnb.mvrx.MavericksView");
        NN2 nn2 = (NN2) obj;
        f30291a.remove(Integer.valueOf(System.identityHashCode(nn2)));
        if (nn2.getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
            nn2.invalidate();
            return true;
        }
        return true;
    }
}
