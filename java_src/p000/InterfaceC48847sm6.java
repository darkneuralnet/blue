package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AlarmType;
import co.bird.android.model.Vehicle;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0006H&J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H&J\b\u0010\u001a\u001a\u00020\u0019H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H&J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0015H&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006%"}, m28432d2 = {"Lsm6;", "", "Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/F;", "i", "", C17296a.f69688o, "j", "o", "lightOn", "c", "s", "b", "Lio/reactivex/Observable;", "p", "Lco/bird/android/model/AlarmType;", "type", "h", "enabled", "m", "", "ecuType", "maxSpeed", "g", "", "release", "Lco/bird/android/model/Vehicle$ConnectionState;", "e", DateTokenConverter.CONVERTER_KEY, "l", "k", "q", "minutes", "n", "f", "r", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sm6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC48847sm6 {
    /* renamed from: a */
    AbstractC23442F<Boolean> mo13697a(Vehicle vehicle);

    /* renamed from: b */
    AbstractC23442F<Vehicle> mo13696b(Vehicle vehicle);

    /* renamed from: c */
    AbstractC23442F<Vehicle> mo13695c(Vehicle vehicle, boolean z);

    /* renamed from: d */
    Vehicle.ConnectionState mo13694d(Vehicle vehicle);

    /* renamed from: e */
    Observable<Vehicle.ConnectionState> mo13693e(Vehicle vehicle);

    /* renamed from: f */
    AbstractC23442F<Vehicle> mo13692f(Vehicle vehicle);

    /* renamed from: g */
    AbstractC23442F<Vehicle> mo13691g(Vehicle vehicle, int i, int i2);

    /* renamed from: h */
    AbstractC23442F<Vehicle> mo13690h(Vehicle vehicle, AlarmType alarmType);

    /* renamed from: i */
    AbstractC23442F<Vehicle> mo13689i(Vehicle vehicle);

    /* renamed from: j */
    AbstractC23442F<Vehicle> mo13688j(Vehicle vehicle);

    /* renamed from: k */
    Observable<Unit> mo13687k(Vehicle vehicle);

    /* renamed from: l */
    Observable<Unit> mo13686l(Vehicle vehicle);

    /* renamed from: m */
    AbstractC23442F<Vehicle> mo13685m(Vehicle vehicle, boolean z);

    /* renamed from: n */
    AbstractC23442F<Vehicle> mo13684n(Vehicle vehicle, int i);

    /* renamed from: o */
    AbstractC23442F<Vehicle> mo13683o(Vehicle vehicle);

    /* renamed from: p */
    Observable<Vehicle> mo13682p(Vehicle vehicle);

    /* renamed from: q */
    AbstractC23442F<Vehicle> mo13681q(Vehicle vehicle, boolean z);

    /* renamed from: r */
    AbstractC23442F<Vehicle> mo13680r(Vehicle vehicle);

    void release();

    /* renamed from: s */
    AbstractC23442F<Vehicle> mo13679s(Vehicle vehicle);
}
