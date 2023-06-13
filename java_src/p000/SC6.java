package p000;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C12149a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
/* renamed from: SC6 */
/* loaded from: classes.dex */
public class SC6 implements InterfaceC48952sx1 {

    /* renamed from: d */
    public static final String f33318d = AbstractC32056Bx2.m113270i("WMFgUpdater");

    /* renamed from: a */
    public final InterfaceC45160mZ5 f33319a;

    /* renamed from: b */
    public final InterfaceC37662Zw1 f33320b;

    /* renamed from: c */
    public final IG6 f33321c;

    /* renamed from: SC6$a */
    /* loaded from: classes.dex */
    public class RunnableC7355a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C40645ew5 f33322b;

        /* renamed from: c */
        public final /* synthetic */ UUID f33323c;

        /* renamed from: d */
        public final /* synthetic */ C37428Yw1 f33324d;

        /* renamed from: e */
        public final /* synthetic */ Context f33325e;

        public RunnableC7355a(C40645ew5 c40645ew5, UUID uuid, C37428Yw1 c37428Yw1, Context context) {
            this.f33322b = c40645ew5;
            this.f33323c = uuid;
            this.f33324d = c37428Yw1;
            this.f33325e = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f33322b.isCancelled()) {
                    String uuid = this.f33323c.toString();
                    HG6 mo100756l = SC6.this.f33321c.mo100756l(uuid);
                    if (mo100756l != null && !mo100756l.f13192b.m81823b()) {
                        SC6.this.f33320b.mo34428a(uuid, this.f33324d);
                        this.f33325e.startService(C12149a.m65487c(this.f33325e, KG6.m99055a(mo100756l), this.f33324d));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f33322b.mo7594p(null);
            } catch (Throwable th) {
                this.f33322b.mo7593q(th);
            }
        }
    }

    public SC6(WorkDatabase workDatabase, InterfaceC37662Zw1 interfaceC37662Zw1, InterfaceC45160mZ5 interfaceC45160mZ5) {
        this.f33320b = interfaceC37662Zw1;
        this.f33319a = interfaceC45160mZ5;
        this.f33321c = workDatabase.mo65549I();
    }

    @Override // p000.InterfaceC48952sx1
    /* renamed from: a */
    public ListenableFuture<Void> mo13369a(Context context, UUID uuid, C37428Yw1 c37428Yw1) {
        C40645ew5 m42377t = C40645ew5.m42377t();
        this.f33319a.m25427a(new RunnableC7355a(m42377t, uuid, c37428Yw1, context));
        return m42377t;
    }
}
