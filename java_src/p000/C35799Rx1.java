package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.bluetooth.internal.C16098a;
import co.bird.android.manager.bluetooth.internal.C16112d;
import co.bird.android.model.AlarmType;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBirdKt;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0004\b0\u00101J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020.0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,¨\u00062"}, m28432d2 = {"LRx1;", "Lsm6;", "Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/F;", "i", "", C17296a.f69688o, "j", "o", "lightOn", "c", "q", "", "minutes", "n", "f", "s", "b", "r", "Lio/reactivex/Observable;", "p", "Lco/bird/android/model/AlarmType;", "type", "h", "enabled", "m", "ecuType", "maxSpeed", "g", "", "release", "Lco/bird/android/model/Vehicle$ConnectionState;", "e", DateTokenConverter.CONVERTER_KEY, "k", "l", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LaY;", "LaY;", "scheduler", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "vehicles", "Ljava/util/concurrent/Semaphore;", "locks", "<init>", "(Landroid/content/Context;LaY;)V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rx1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35799Rx1 implements InterfaceC48847sm6 {

    /* renamed from: a */
    public final Context f32936a;

    /* renamed from: b */
    public final InterfaceC10732aY f32937b;

    /* renamed from: c */
    public final ConcurrentHashMap<Vehicle, InterfaceC48847sm6> f32938c;

    /* renamed from: d */
    public final ConcurrentHashMap<Vehicle, Semaphore> f32939d;

    public C35799Rx1(Context context, InterfaceC10732aY scheduler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f32936a = context;
        this.f32937b = scheduler;
        this.f32938c = new ConcurrentHashMap<>();
        this.f32939d = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Boolean> mo13697a(Vehicle vehicle) {
        AbstractC23442F<Boolean> m33153M;
        AbstractC23442F<Boolean> mo13697a;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13697a = interfaceC48847sm6.mo13697a(vehicle)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13697a, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13696b(Vehicle vehicle) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13696b;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13696b = interfaceC48847sm6.mo13696b(vehicle)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13696b, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r2 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13695c(Vehicle vehicle, boolean z) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13695c;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13695c = interfaceC48847sm6.mo13695c(vehicle, z)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13695c, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: d */
    public synchronized Vehicle.ConnectionState mo13694d(Vehicle vehicle) {
        Vehicle.ConnectionState connectionState;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 == null || (connectionState = interfaceC48847sm6.mo13694d(vehicle)) == null) {
            connectionState = Vehicle.ConnectionState.DISCONNECTED;
        }
        return connectionState;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: e */
    public synchronized Observable<Vehicle.ConnectionState> mo13693e(Vehicle vehicle) {
        Observable<Vehicle.ConnectionState> just;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 == null || (just = interfaceC48847sm6.mo13693e(vehicle)) == null) {
            just = Observable.just(Vehicle.ConnectionState.DISCONNECTED);
            Intrinsics.checkNotNullExpressionValue(just, "just(Vehicle.ConnectionState.DISCONNECTED)");
        }
        return just;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13692f(Vehicle vehicle) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13692f;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13692f = interfaceC48847sm6.mo13692f(vehicle)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13692f, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r2 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13691g(Vehicle vehicle, int i, int i2) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13691g;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13691g = interfaceC48847sm6.mo13691g(vehicle, i, i2)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13691g, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r2 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13690h(Vehicle vehicle, AlarmType type) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13690h;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Intrinsics.checkNotNullParameter(type, "type");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13690h = interfaceC48847sm6.mo13690h(vehicle, type)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13690h, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r5 == null) goto L38;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13689i(Vehicle vehicle) {
        Vehicle.ConnectionState connectionState;
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13689i;
        InterfaceC48847sm6 c16112d;
        InterfaceC48847sm6 remove;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        Vehicle.ConnectionState connectionState2 = null;
        if (interfaceC48847sm6 != null) {
            connectionState = interfaceC48847sm6.mo13694d(vehicle);
        } else {
            connectionState = null;
        }
        if (connectionState == Vehicle.ConnectionState.CONNECTED) {
            AbstractC23442F<Vehicle> m33158H = AbstractC23442F.m33158H(vehicle);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(vehicle)");
            return m33158H;
        }
        InterfaceC48847sm6 interfaceC48847sm62 = this.f32938c.get(vehicle);
        if (interfaceC48847sm62 != null) {
            connectionState2 = interfaceC48847sm62.mo13694d(vehicle);
        }
        if (connectionState2 == Vehicle.ConnectionState.CLOSED && (remove = this.f32938c.remove(vehicle)) != null) {
            remove.release();
        }
        if (this.f32938c.get(vehicle) == null) {
            ConcurrentHashMap<Vehicle, InterfaceC48847sm6> concurrentHashMap = this.f32938c;
            if (WireBirdKt.isBdCompatible(vehicle.getBird())) {
                c16112d = new C16098a(this.f32936a, this.f32937b);
            } else {
                c16112d = new C16112d(this.f32936a, this.f32937b);
            }
            concurrentHashMap.put(vehicle, c16112d);
        }
        if (this.f32939d.get(vehicle) == null) {
            this.f32939d.put(vehicle, new Semaphore(1));
        }
        InterfaceC48847sm6 interfaceC48847sm63 = this.f32938c.get(vehicle);
        if (interfaceC48847sm63 != null && (mo13689i = interfaceC48847sm63.mo13689i(vehicle)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13689i, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13688j(Vehicle vehicle) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13688j;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13688j = interfaceC48847sm6.mo13688j(vehicle)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13688j, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: k */
    public synchronized Observable<Unit> mo13687k(Vehicle vehicle) {
        Observable<Unit> empty;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 == null || (empty = interfaceC48847sm6.mo13687k(vehicle)) == null) {
            empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
        }
        return empty;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: l */
    public synchronized Observable<Unit> mo13686l(Vehicle vehicle) {
        Observable<Unit> never;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 == null || (never = interfaceC48847sm6.mo13686l(vehicle)) == null) {
            never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "never()");
        }
        return never;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: m */
    public AbstractC23442F<Vehicle> mo13685m(Vehicle vehicle, boolean z) {
        AbstractC23442F<Vehicle> mo13685m;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13685m = interfaceC48847sm6.mo13685m(vehicle, z)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            AbstractC23442F<Vehicle> m99283f = K36.m99283f(mo13685m, semaphore);
            if (m99283f != null) {
                return m99283f;
            }
        }
        AbstractC23442F<Vehicle> m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r2 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13684n(Vehicle vehicle, int i) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13684n;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13684n = interfaceC48847sm6.mo13684n(vehicle, i)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13684n, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13683o(Vehicle vehicle) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13683o;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13683o = interfaceC48847sm6.mo13683o(vehicle)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13683o, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: p */
    public synchronized Observable<Vehicle> mo13682p(Vehicle vehicle) {
        Observable<Vehicle> empty;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 == null || (empty = interfaceC48847sm6.mo13682p(vehicle)) == null) {
            empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
        }
        return empty;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r2 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13681q(Vehicle vehicle, boolean z) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13681q;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13681q = interfaceC48847sm6.mo13681q(vehicle, z)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13681q, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13680r(Vehicle vehicle) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13680r;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13680r = interfaceC48847sm6.mo13680r(vehicle)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13680r, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    @Override // p000.InterfaceC48847sm6
    public synchronized void release() {
        for (Map.Entry<Vehicle, InterfaceC48847sm6> entry : this.f32938c.entrySet()) {
            entry.getValue().release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == null) goto L12;
     */
    @Override // p000.InterfaceC48847sm6
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized AbstractC23442F<Vehicle> mo13679s(Vehicle vehicle) {
        AbstractC23442F<Vehicle> m33153M;
        AbstractC23442F<Vehicle> mo13679s;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        InterfaceC48847sm6 interfaceC48847sm6 = this.f32938c.get(vehicle);
        if (interfaceC48847sm6 != null && (mo13679s = interfaceC48847sm6.mo13679s(vehicle)) != null) {
            Semaphore semaphore = this.f32939d.get(vehicle);
            Intrinsics.checkNotNull(semaphore);
            m33153M = K36.m99283f(mo13679s, semaphore);
        }
        m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }
}
