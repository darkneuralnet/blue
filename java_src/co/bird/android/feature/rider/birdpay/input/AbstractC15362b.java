package co.bird.android.feature.rider.birdpay.input;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.birdpay.input.C15365d;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/input/b;", "", "LgO;", "impl", "LbO;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/feature/rider/birdpay/input/d;", "LiN;", "b", "Lco/bird/android/core/mvp/BaseActivity;", "Lcom/uber/autodispose/ScopeProvider;", "c", "<init>", "()V", C17296a.f69688o, "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: co.bird.android.feature.rider.birdpay.input.b */
/* loaded from: classes3.dex */
public abstract class AbstractC15362b {

    /* renamed from: a */
    public static final C15363a f64933a = new C15363a(null);

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/input/b$a;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/feature/rider/birdpay/input/d$a;", C17296a.f69688o, "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.rider.birdpay.input.b$a */
    /* loaded from: classes3.dex */
    public static final class C15363a {
        public /* synthetic */ C15363a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        @JvmStatic
        /* renamed from: a */
        public final C15365d.C15383a m57307a(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = activity.getIntent();
            String stringExtra = intent.getStringExtra("merchant_site_id");
            Intrinsics.checkNotNull(stringExtra);
            return new C15365d.C15383a(stringExtra, intent.getStringExtra("merchant_placard_id"), intent.getBooleanExtra("from_ride_scan", false));
        }

        private C15363a() {
        }
    }

    @Provides
    @JvmStatic
    /* renamed from: a */
    public static final C15365d.C15383a m57311a(BaseActivity baseActivity) {
        return f64933a.m57307a(baseActivity);
    }

    @Binds
    /* renamed from: b */
    public abstract InterfaceC23223iN m57310b(C15365d c15365d);

    @Binds
    /* renamed from: c */
    public abstract ScopeProvider m57309c(BaseActivity baseActivity);

    @Binds
    /* renamed from: d */
    public abstract InterfaceC12377bO m57308d(C20835gO c20835gO);
}
