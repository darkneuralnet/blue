package p000;

import co.bird.android.model.RideTitle;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"LwQ2;", "", "Lco/bird/android/model/RideTitle;", "title", "", "quantity", "", C17296a.f69688o, "(Lco/bird/android/model/RideTitle;Ljava/lang/Integer;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wQ2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC51004wQ2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wQ2$a */
    /* loaded from: classes2.dex */
    public static final class C29876a {
        public static /* synthetic */ void setTitle$default(InterfaceC51004wQ2 interfaceC51004wQ2, RideTitle rideTitle, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTitle");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            interfaceC51004wQ2.mo5281a(rideTitle, num);
        }
    }

    /* renamed from: a */
    void mo5281a(RideTitle rideTitle, Integer num);
}
