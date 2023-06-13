package p000;

import co.bird.android.model.User;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&R.\u0010\f\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m28432d2 = {"Liy2;", "", "", "skipAuthTokenRefresh", "Lio/reactivex/F;", "Lco/bird/android/model/User;", "b", "Lio/reactivex/functions/o;", "Lio/reactivex/k;", "", C17296a.f69688o, "()Lio/reactivex/functions/o;", "retryWhen", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iy2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC43034iy2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iy2$a */
    /* loaded from: classes2.dex */
    public static final class C24653a {
        public static /* synthetic */ AbstractC23442F verifyLogin$default(InterfaceC43034iy2 interfaceC43034iy2, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return interfaceC43034iy2.mo24621b(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyLogin");
        }
    }

    /* renamed from: a */
    InterfaceC23492o<AbstractC24490k<? extends Throwable>, AbstractC24490k<Object>> mo24622a();

    /* renamed from: b */
    AbstractC23442F<User> mo24621b(boolean z);
}
