package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.bluetooth.job.DeepSleepJobConsumer;
import co.bird.android.app.feature.locale.LocaleChangedJobConsumer;
import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"LNh2;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LQh2;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: Nh2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34720Nh2 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"LNh2$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Nh2$a */
    /* loaded from: classes4.dex */
    public enum EnumC5654a {
        ZERO,
        ONE
    }

    @Provides
    /* renamed from: a */
    public final InterfaceC35422Qh2 m93572a(Context context) {
        Map mapOf;
        Intrinsics.checkNotNullParameter(context, "context");
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(DeepSleepJobConsumer.class), Integer.valueOf(EnumC5654a.ZERO.ordinal())), TuplesKt.m28425to(Reflection.getOrCreateKotlinClass(LocaleChangedJobConsumer.class), Integer.valueOf(EnumC5654a.ONE.ordinal())));
        return new C35656Rh2(context, mapOf);
    }
}
