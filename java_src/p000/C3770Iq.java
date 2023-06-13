package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010C\u001a\u00020%\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010F\u001a\u00020(¢\u0006\u0004\bG\u0010HJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00108\u001a\u00020%8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b3\u0010&\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010=\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0014\u00109\u001a\u0004\b3\u0010:\"\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010?R\u0014\u0010A\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010B\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006I"}, m28432d2 = {"LIq;", "", "LnV5;", "delegateOpenHelper", "", "k", "V", "Lkotlin/Function1;", "LmV5;", "block", "g", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "j", "e", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Runnable;", "onAutoClose", "l", C17296a.f69688o, "LnV5;", "i", "()LnV5;", "m", "(LnV5;)V", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "c", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "(Ljava/lang/Runnable;)V", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "", "J", "autoCloseTimeoutInMs", "Ljava/util/concurrent/Executor;", "f", "Ljava/util/concurrent/Executor;", "executor", "", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", "h", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "LmV5;", "()LmV5;", "setDelegateDatabase$room_runtime_release", "(LmV5;)V", "delegateDatabase", "", "Z", "manuallyClosed", "executeAutoCloser", "autoCloser", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Iq */
/* loaded from: classes.dex */
public final class C3770Iq {

    /* renamed from: m */
    public static final C3771a f16266m = new C3771a(null);

    /* renamed from: a */
    public InterfaceC45717nV5 f16267a;

    /* renamed from: b */
    public final Handler f16268b;

    /* renamed from: c */
    public Runnable f16269c;

    /* renamed from: d */
    public final Object f16270d;

    /* renamed from: e */
    public long f16271e;

    /* renamed from: f */
    public final Executor f16272f;

    /* renamed from: g */
    public int f16273g;

    /* renamed from: h */
    public long f16274h;

    /* renamed from: i */
    public InterfaceC45124mV5 f16275i;

    /* renamed from: j */
    public boolean f16276j;

    /* renamed from: k */
    public final Runnable f16277k;

    /* renamed from: l */
    public final Runnable f16278l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LIq$a;", "", "", "autoCloseBug", "Ljava/lang/String;", "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Iq$a */
    /* loaded from: classes.dex */
    public static final class C3771a {
        public /* synthetic */ C3771a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3771a() {
        }
    }

    public C3770Iq(long j, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.f16268b = new Handler(Looper.getMainLooper());
        this.f16270d = new Object();
        this.f16271e = autoCloseTimeUnit.toMillis(j);
        this.f16272f = autoCloseExecutor;
        this.f16274h = SystemClock.uptimeMillis();
        this.f16277k = new Runnable() { // from class: Gq
            @Override // java.lang.Runnable
            public final void run() {
                C3770Iq.m101649f(C3770Iq.this);
            }
        };
        this.f16278l = new Runnable() { // from class: Hq
            @Override // java.lang.Runnable
            public final void run() {
                C3770Iq.m101652c(C3770Iq.this);
            }
        };
    }

    /* renamed from: c */
    public static final void m101652c(C3770Iq this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f16270d) {
            if (SystemClock.uptimeMillis() - this$0.f16274h < this$0.f16271e) {
                return;
            }
            if (this$0.f16273g != 0) {
                return;
            }
            Runnable runnable = this$0.f16269c;
            if (runnable != null) {
                runnable.run();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                InterfaceC45124mV5 interfaceC45124mV5 = this$0.f16275i;
                if (interfaceC45124mV5 != null && interfaceC45124mV5.isOpen()) {
                    interfaceC45124mV5.close();
                }
                this$0.f16275i = null;
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
        }
    }

    /* renamed from: f */
    public static final void m101649f(C3770Iq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16272f.execute(this$0.f16278l);
    }

    /* renamed from: d */
    public final void m101651d() throws IOException {
        synchronized (this.f16270d) {
            this.f16276j = true;
            InterfaceC45124mV5 interfaceC45124mV5 = this.f16275i;
            if (interfaceC45124mV5 != null) {
                interfaceC45124mV5.close();
            }
            this.f16275i = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: e */
    public final void m101650e() {
        boolean z;
        synchronized (this.f16270d) {
            int i = this.f16273g;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = i - 1;
                this.f16273g = i2;
                if (i2 == 0) {
                    if (this.f16275i == null) {
                        return;
                    }
                    this.f16268b.postDelayed(this.f16277k, this.f16271e);
                }
                Unit unit = Unit.INSTANCE;
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
        }
    }

    /* renamed from: g */
    public final <V> V m101648g(Function1<? super InterfaceC45124mV5, ? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(m101645j());
        } finally {
            m101650e();
        }
    }

    /* renamed from: h */
    public final InterfaceC45124mV5 m101647h() {
        return this.f16275i;
    }

    /* renamed from: i */
    public final InterfaceC45717nV5 m101646i() {
        InterfaceC45717nV5 interfaceC45717nV5 = this.f16267a;
        if (interfaceC45717nV5 != null) {
            return interfaceC45717nV5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    /* renamed from: j */
    public final InterfaceC45124mV5 m101645j() {
        synchronized (this.f16270d) {
            this.f16268b.removeCallbacks(this.f16277k);
            this.f16273g++;
            if (!this.f16276j) {
                InterfaceC45124mV5 interfaceC45124mV5 = this.f16275i;
                if (interfaceC45124mV5 != null && interfaceC45124mV5.isOpen()) {
                    return interfaceC45124mV5;
                }
                InterfaceC45124mV5 mo6496d1 = m101646i().mo6496d1();
                this.f16275i = mo6496d1;
                return mo6496d1;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    /* renamed from: k */
    public final void m101644k(InterfaceC45717nV5 delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        m101642m(delegateOpenHelper);
    }

    /* renamed from: l */
    public final void m101643l(Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.f16269c = onAutoClose;
    }

    /* renamed from: m */
    public final void m101642m(InterfaceC45717nV5 interfaceC45717nV5) {
        Intrinsics.checkNotNullParameter(interfaceC45717nV5, "<set-?>");
        this.f16267a = interfaceC45717nV5;
    }
}
