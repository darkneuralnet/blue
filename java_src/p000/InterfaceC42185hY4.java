package p000;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0004H&J\u0014\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0014\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0014\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\"\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH&R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m28432d2 = {"LhY4;", "", "Landroid/content/Intent;", "intent", "", C17296a.f69688o, "onDestroy", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "onResume", "onPause", "Lco/bird/android/model/wire/WireRide;", "rideOverride", "g", "b", "j", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "", "onBackPressed", "Landroid/view/Menu;", "menu", DateTokenConverter.CONVERTER_KEY, "Landroid/view/MenuItem;", "item", "c", "LZ84;", "e", "()LZ84;", "requirementBannerShown", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hY4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC42185hY4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hY4$a */
    /* loaded from: classes2.dex */
    public static final class C22678a {
        public static /* synthetic */ void onEndRideClick$default(InterfaceC42185hY4 interfaceC42185hY4, WireRide wireRide, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEndRideClick");
            }
            if ((i & 1) != 0) {
                wireRide = null;
            }
            interfaceC42185hY4.mo34973j(wireRide);
        }

        public static /* synthetic */ void onLockClick$default(InterfaceC42185hY4 interfaceC42185hY4, WireRide wireRide, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLockClick");
            }
            if ((i & 1) != 0) {
                wireRide = null;
            }
            interfaceC42185hY4.mo35061b(wireRide);
        }

        public static /* synthetic */ void onUnlockClick$default(InterfaceC42185hY4 interfaceC42185hY4, WireRide wireRide, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onUnlockClick");
            }
            if ((i & 1) != 0) {
                wireRide = null;
            }
            interfaceC42185hY4.mo35006g(wireRide);
        }
    }

    /* renamed from: a */
    void mo35072a(Intent intent);

    /* renamed from: b */
    void mo35061b(WireRide wireRide);

    /* renamed from: c */
    boolean mo35050c(MenuItem menuItem);

    /* renamed from: d */
    void mo35039d(Menu menu);

    /* renamed from: e */
    Z84<Boolean> mo35028e();

    /* renamed from: g */
    void mo35006g(WireRide wireRide);

    /* renamed from: j */
    void mo34973j(WireRide wireRide);

    void onActivityResult(int i, int i2, Intent intent);

    boolean onBackPressed();

    void onDestroy();

    void onPause();

    void onResume(ScopeProvider scopeProvider);
}
