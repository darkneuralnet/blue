package co.bird.android.app.push.worker;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.AbstractC12126c;
import androidx.work.C12124b;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import p000.C38054ac3;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/push/worker/ScheduledNotificationWorker;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "q", "Landroid/content/Context;", "g", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "h", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "i", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ScheduledNotificationWorker extends Worker {

    /* renamed from: i */
    public static final C14423a f63000i = new C14423a(null);

    /* renamed from: j */
    public static final int f63001j = 8;

    /* renamed from: g */
    public final Context f63002g;

    /* renamed from: h */
    public final WorkerParameters f63003h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/push/worker/ScheduledNotificationWorker$a;", "", "", "CHANNEL_ID_KEY", "Ljava/lang/String;", "ONE_OFF_WORKER_ID_PREFIX", "TEXT_KEY", "TITLE_KEY", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.push.worker.ScheduledNotificationWorker$a */
    /* loaded from: classes2.dex */
    public static final class C14423a {
        public /* synthetic */ C14423a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14423a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledNotificationWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f63002g = context;
        this.f63003h = params;
    }

    @Override // androidx.work.Worker
    /* renamed from: q */
    public AbstractC12126c.AbstractC12127a mo59117q() {
        C12124b m65613d = this.f63003h.m65613d();
        String m65585i = m65613d.m65585i("title");
        if (m65585i == null) {
            AbstractC12126c.AbstractC12127a m65564a = AbstractC12126c.AbstractC12127a.m65564a();
            Intrinsics.checkNotNullExpressionValue(m65564a, "failure()");
            return m65564a;
        }
        Intrinsics.checkNotNullExpressionValue(m65585i, "getString(TITLE_KEY) ?: return Result.failure()");
        String m65585i2 = m65613d.m65585i(Entry.TYPE_TEXT);
        if (m65585i2 == null) {
            AbstractC12126c.AbstractC12127a m65564a2 = AbstractC12126c.AbstractC12127a.m65564a();
            Intrinsics.checkNotNullExpressionValue(m65564a2, "failure()");
            return m65564a2;
        }
        Intrinsics.checkNotNullExpressionValue(m65585i2, "getString(TEXT_KEY) ?: return Result.failure()");
        String m65585i3 = m65613d.m65585i("channel_id");
        if (m65585i3 == null) {
            AbstractC12126c.AbstractC12127a m65564a3 = AbstractC12126c.AbstractC12127a.m65564a();
            Intrinsics.checkNotNullExpressionValue(m65564a3, "failure()");
            return m65564a3;
        }
        Intrinsics.checkNotNullExpressionValue(m65585i3, "getString(CHANNEL_ID_KEY…: return Result.failure()");
        C38054ac3.C10770e m71036x = new C38054ac3.C10770e(this.f63002g, m65585i3).m71047m(m65585i).m71048l(m65585i2).m71036x(0);
        Intrinsics.checkNotNullExpressionValue(m71036x, "Builder(context, channel…nCompat.PRIORITY_DEFAULT)");
        NotificationManagerCompat.from(this.f63002g).notify(Random.Default.nextInt(), m71036x.m71057c());
        AbstractC12126c.AbstractC12127a m65562c = AbstractC12126c.AbstractC12127a.m65562c();
        Intrinsics.checkNotNullExpressionValue(m65562c, "success()");
        return m65562c;
    }
}
