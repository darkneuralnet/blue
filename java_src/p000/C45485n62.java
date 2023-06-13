package p000;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C9459Xi;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dB\u0013\b\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001c\u0010 B\u001d\b\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\"B'\b\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\u001c\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\"\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J$\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002J.\u0010\u0012\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0013\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J+\u0010\u0014\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0006R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006("}, m28432d2 = {"Ln62;", "", "", "eventName", "Landroid/os/Bundle;", "parameters", "", "e", "", "valueToSum", DateTokenConverter.CONVERTER_KEY, "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", "currency", "k", "buttonText", "f", "j", "g", "i", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "h", "c", C17296a.f69688o, "LYi;", "LYi;", "loggerImpl", "<init>", "(LYi;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", NamedConstantsKt.APPLICATION_ID, "(Landroid/content/Context;Ljava/lang/String;)V", "activityName", "Lcom/facebook/AccessToken;", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "b", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: n62  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45485n62 {

    /* renamed from: b */
    public static final C26406a f99442b = new C26406a(null);

    /* renamed from: a */
    public final C9916Yi f99443a;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\n2\u0018\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\bH\u0007¨\u0006\u000e"}, m28432d2 = {"Ln62$a;", "", "LXi$a;", "b", "Ljava/util/concurrent/Executor;", C17296a.f69688o, "", "c", "", "ud", "", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: n62$a */
    /* loaded from: classes5.dex */
    public static final class C26406a {
        private C26406a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final Executor m24333a() {
            Executor m74457d = C9916Yi.m74457d();
            Intrinsics.checkNotNullExpressionValue(m74457d, "AppEventsLoggerImpl.getAnalyticsExecutor()");
            return m74457d;
        }

        @JvmStatic
        /* renamed from: b */
        public final C9459Xi.EnumC9460a m24332b() {
            C9459Xi.EnumC9460a m74455f = C9916Yi.m74455f();
            Intrinsics.checkNotNullExpressionValue(m74455f, "AppEventsLoggerImpl.getFlushBehavior()");
            return m74455f;
        }

        @JvmStatic
        /* renamed from: c */
        public final String m24331c() {
            return C9916Yi.m74453h();
        }

        @JvmStatic
        /* renamed from: d */
        public final void m24330d(Map<String, String> map) {
            C36353Ug6.m81183i(map);
        }

        public /* synthetic */ C26406a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C45485n62(C9916Yi loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.f99443a = loggerImpl;
    }

    @JvmStatic
    /* renamed from: b */
    public static final Executor m24344b() {
        return f99442b.m24333a();
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m24334l(Map<String, String> map) {
        f99442b.m24330d(map);
    }

    /* renamed from: a */
    public final void m24345a() {
        this.f99443a.m74458c();
    }

    /* renamed from: c */
    public final void m24343c(Bundle parameters) {
        boolean z;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if ((parameters.getInt("previous") & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C17216a.m52736j()) {
            this.f99443a.m74445p("fb_sdk_settings_changed", null, parameters);
        }
    }

    /* renamed from: d */
    public final void m24342d(String str, double d, Bundle bundle) {
        if (C17216a.m52736j()) {
            this.f99443a.m74449l(str, d, bundle);
        }
    }

    /* renamed from: e */
    public final void m24341e(String str, Bundle bundle) {
        if (C17216a.m52736j()) {
            this.f99443a.m74448m(str, bundle);
        }
    }

    /* renamed from: f */
    public final void m24340f(String str, String str2) {
        this.f99443a.m74446o(str, str2);
    }

    /* renamed from: g */
    public final void m24339g(String str) {
        if (C17216a.m52736j()) {
            this.f99443a.m74445p(str, null, null);
        }
    }

    /* renamed from: h */
    public final void m24338h(String str, Bundle bundle) {
        if (C17216a.m52736j()) {
            this.f99443a.m74445p(str, null, bundle);
        }
    }

    /* renamed from: i */
    public final void m24337i(String str, Double d, Bundle bundle) {
        if (C17216a.m52736j()) {
            this.f99443a.m74445p(str, d, bundle);
        }
    }

    /* renamed from: j */
    public final void m24336j(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C17216a.m52736j()) {
            this.f99443a.m74444q(str, bigDecimal, currency, bundle);
        }
    }

    /* renamed from: k */
    public final void m24335k(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C17216a.m52736j()) {
            this.f99443a.m74442s(bigDecimal, currency, bundle);
        }
    }

    public C45485n62(Context context) {
        this(new C9916Yi(context, (String) null, (AccessToken) null));
    }

    public C45485n62(Context context, String str) {
        this(new C9916Yi(context, str, (AccessToken) null));
    }

    public C45485n62(String str, String str2, AccessToken accessToken) {
        this(new C9916Yi(str, str2, accessToken));
    }
}
