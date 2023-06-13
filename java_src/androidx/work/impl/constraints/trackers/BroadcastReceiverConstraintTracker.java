package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m28432d2 = {"Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "T", "Ldz0;", "Landroid/content/Intent;", "intent", "", "k", "h", "i", "Landroid/content/BroadcastReceiver;", "f", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/IntentFilter;", "j", "()Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LmZ5;", "taskExecutor", "<init>", "(Landroid/content/Context;LmZ5;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends AbstractC40077dz0<T> {

    /* renamed from: f */
    public final BroadcastReceiver f56285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(Context context, InterfaceC45160mZ5 taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f56285f = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1

            /* renamed from: a */
            public final /* synthetic */ BroadcastReceiverConstraintTracker<T> f56286a;

            {
                this.f56286a = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.f56286a.mo41367k(intent);
            }
        };
    }

    @Override // p000.AbstractC40077dz0
    /* renamed from: h */
    public void mo43448h() {
        String str;
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        str = N20.f23991a;
        m113272e.mo113269a(str, getClass().getSimpleName() + ": registering receiver");
        m43451d().registerReceiver(this.f56285f, mo41368j());
    }

    @Override // p000.AbstractC40077dz0
    /* renamed from: i */
    public void mo43447i() {
        String str;
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        str = N20.f23991a;
        m113272e.mo113269a(str, getClass().getSimpleName() + ": unregistering receiver");
        m43451d().unregisterReceiver(this.f56285f);
    }

    /* renamed from: j */
    public abstract IntentFilter mo41368j();

    /* renamed from: k */
    public abstract void mo41367k(Intent intent);
}
