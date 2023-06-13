package p000;

import android.widget.Button;
import co.bird.android.widget.BlockingEnterLocationView;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28432d2 = {"LWW;", "", "Lio/reactivex/Observable;", "", "D0", "", "visible", "rf", "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WW */
/* loaded from: classes4.dex */
public interface InterfaceC9073WW {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WW$a */
    /* loaded from: classes4.dex */
    public static final class C9074a {
        /* renamed from: a */
        public static Observable<Unit> m78262a(InterfaceC9073WW interfaceC9073WW) {
            return C44626lf5.clicksThrottle$default(interfaceC9073WW.mo22204Ra(), 0L, 1, null);
        }

        /* renamed from: b */
        public static void m78261b(InterfaceC9073WW interfaceC9073WW, boolean z) {
            C49520tu6.show$default(interfaceC9073WW.mo22205P9(), z, 0, 2, null);
        }
    }

    /* renamed from: D0 */
    Observable<Unit> mo22210D0();

    /* renamed from: P9 */
    BlockingEnterLocationView mo22205P9();

    /* renamed from: Ra */
    Button mo22204Ra();

    /* renamed from: rf */
    void mo22199rf(boolean z);
}
