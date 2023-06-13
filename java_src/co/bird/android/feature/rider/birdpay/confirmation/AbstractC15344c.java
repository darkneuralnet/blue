package co.bird.android.feature.rider.birdpay.confirmation;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.birdpay.confirmation.C15347e;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH'¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/confirmation/c;", "", "LgM3;", "impl", "LcM3;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/feature/rider/birdpay/confirmation/e;", "LSL3;", "b", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "c", "<init>", "()V", C17296a.f69688o, "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: co.bird.android.feature.rider.birdpay.confirmation.c */
/* loaded from: classes3.dex */
public abstract class AbstractC15344c {

    /* renamed from: a */
    public static final C15345a f64887a = new C15345a(null);

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/confirmation/c$a;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/feature/rider/birdpay/confirmation/e$b;", C17296a.f69688o, "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.c$a */
    /* loaded from: classes3.dex */
    public static final class C15345a {
        public /* synthetic */ C15345a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        @JvmStatic
        /* renamed from: a */
        public final C15347e.C15349b m57353a(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = activity.getIntent();
            boolean booleanExtra = intent.getBooleanExtra("new_transaction", false);
            String stringExtra = intent.getStringExtra("transaction_id");
            Intrinsics.checkNotNull(stringExtra);
            String stringExtra2 = intent.getStringExtra("merchant_site_id");
            Intrinsics.checkNotNull(stringExtra2);
            long longExtra = intent.getLongExtra("transaction_amount", 0L);
            long longExtra2 = intent.getLongExtra("transaction_amount_billed", -1L);
            String stringExtra3 = intent.getStringExtra("transaction_currency");
            Intrinsics.checkNotNull(stringExtra3);
            Serializable serializableExtra = intent.getSerializableExtra("transaction_date_time");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type org.joda.time.DateTime");
            return new C15347e.C15349b(booleanExtra, stringExtra, stringExtra2, longExtra, longExtra2, stringExtra3, (DateTime) serializableExtra, intent.getStringExtra("merchant_placard_id"), intent.getLongExtra("transaction_tip_amount", 0L));
        }

        private C15345a() {
        }
    }

    @Provides
    @JvmStatic
    /* renamed from: a */
    public static final C15347e.C15349b m57357a(BaseActivity baseActivity) {
        return f64887a.m57353a(baseActivity);
    }

    @Binds
    /* renamed from: b */
    public abstract SL3 m57356b(C15347e c15347e);

    @Binds
    /* renamed from: c */
    public abstract ScopeProvider m57355c(BaseActivity baseActivity);

    @Binds
    /* renamed from: d */
    public abstract InterfaceC39094cM3 m57354d(C41483gM3 c41483gM3);
}
