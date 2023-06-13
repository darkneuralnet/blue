package bo.app;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.X10;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, m28432d2 = {"Lbo/app/e0;", "LX10;", "", C17296a.f69688o, "()J", "badNetworkFlushIntervalInMilliseconds", "b", "goodNetworkFlushIntervalInMilliseconds", "c", "greatNetworkFlushIntervalInMilliseconds", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.e0 */
/* loaded from: classes.dex */
public final class C12592e0 extends X10 {

    /* renamed from: a */
    public static final C12593a f58374a = new C12593a(null);

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, m28432d2 = {"Lbo/app/e0$a;", "", "", "DEFAULT_BAD_NETWORK_INTERVAL_S", "I", "DEFAULT_GOOD_NETWORK_INTERVAL_S", "DEFAULT_GREAT_NETWORK_INTERVAL_S", "", "MIN_DATA_FLUSH_INTERVAL_MILLIS", "J", "MS_IN_SEC", "NO_DATA_FLUSH_INTERVAL_VALUE", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.e0$a */
    /* loaded from: classes.dex */
    public static final class C12593a {
        public /* synthetic */ C12593a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12593a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12592e0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final long m63825a() {
        return getIntValue(X10.EnumC9269b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.m77562b(), 60) * 1000;
    }

    /* renamed from: b */
    public final long m63824b() {
        return getIntValue(X10.EnumC9269b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.m77562b(), 30) * 1000;
    }

    /* renamed from: c */
    public final long m63823c() {
        return getIntValue(X10.EnumC9269b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.m77562b(), 10) * 1000;
    }
}
