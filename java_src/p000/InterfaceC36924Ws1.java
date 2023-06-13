package p000;

import co.bird.android.model.AlarmOption;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.persistence.Bird;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC44721lp0;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\fH&J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\nH\u0016¨\u0006\u001a"}, m28432d2 = {"LWs1;", "LS74;", "LaM5;", "Llp0;", "LH31;", "Lio/reactivex/Observable;", "Lco/bird/android/model/FlightSheetButton;", "O6", "Lco/bird/android/model/persistence/Bird;", "bird", "", "ui", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Qh", "", "LH6;", "sections", "be", "", "Qc", "Pd", "", "birdId", "K5", "q2", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ws1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC36924Ws1 extends S74, InterfaceC37910aM5, InterfaceC44721lp0, H31 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ws1$a */
    /* loaded from: classes3.dex */
    public static final class C9191a {
        /* renamed from: a */
        public static void m77774a(InterfaceC36924Ws1 interfaceC36924Ws1) {
            InterfaceC44721lp0.C25796a.m26778b(interfaceC36924Ws1);
        }

        /* renamed from: b */
        public static void m77773b(InterfaceC36924Ws1 interfaceC36924Ws1) {
        }

        /* renamed from: c */
        public static Observable<VehicleCommand> m77772c(InterfaceC36924Ws1 interfaceC36924Ws1) {
            return InterfaceC44721lp0.C25796a.m26777c(interfaceC36924Ws1);
        }

        /* renamed from: d */
        public static void m77771d(InterfaceC36924Ws1 interfaceC36924Ws1, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            InterfaceC44721lp0.C25796a.m26776d(interfaceC36924Ws1, command);
        }

        /* renamed from: e */
        public static void m77770e(InterfaceC36924Ws1 interfaceC36924Ws1, Collection<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            InterfaceC44721lp0.C25796a.m26775e(interfaceC36924Ws1, sections);
        }

        /* renamed from: f */
        public static AbstractC24507p<Integer> m77769f(InterfaceC36924Ws1 interfaceC36924Ws1, List<AlarmOption> options) {
            Intrinsics.checkNotNullParameter(options, "options");
            return InterfaceC44721lp0.C25796a.m26774f(interfaceC36924Ws1, options);
        }

        /* renamed from: g */
        public static void m77768g(InterfaceC36924Ws1 interfaceC36924Ws1, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            InterfaceC44721lp0.C25796a.m26772h(interfaceC36924Ws1, command);
        }

        /* renamed from: h */
        public static void m77767h(InterfaceC36924Ws1 interfaceC36924Ws1, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            InterfaceC44721lp0.C25796a.m26771i(interfaceC36924Ws1, command);
        }
    }

    /* renamed from: K5 */
    void mo45097K5(String str);

    /* renamed from: O6 */
    Observable<FlightSheetButton> mo45096O6();

    /* renamed from: Pd */
    AbstractC23442F<Unit> mo45095Pd();

    /* renamed from: Qc */
    Observable<Boolean> mo45093Qc();

    /* renamed from: Qh */
    AbstractC23442F<DialogResponse> mo45092Qh();

    /* renamed from: be */
    void mo45079be(List<C3023H6> list);

    /* renamed from: q2 */
    void mo45077q2();

    /* renamed from: ui */
    void mo45075ui(Bird bird);
}
