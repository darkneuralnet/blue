package p000;

import co.bird.android.model.AlarmOption;
import co.bird.android.model.CommandCenterButton;
import co.bird.android.model.VehicleCommand;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC44721lp0;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H&¨\u0006\u000b"}, m28432d2 = {"Lpl6;", "Llp0;", "LaM5;", "LS74;", "LLo6;", "LH31;", "Lio/reactivex/Observable;", "Lco/bird/android/model/CommandCenterButton;", "B1", "", "K", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pl6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC47059pl6 extends InterfaceC44721lp0, InterfaceC37910aM5, S74, InterfaceC34319Lo6, H31 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pl6$a */
    /* loaded from: classes3.dex */
    public static final class C27384a {
        /* renamed from: a */
        public static void m18794a(InterfaceC47059pl6 interfaceC47059pl6) {
            InterfaceC44721lp0.C25796a.m26778b(interfaceC47059pl6);
        }

        /* renamed from: b */
        public static Observable<VehicleCommand> m18793b(InterfaceC47059pl6 interfaceC47059pl6) {
            return InterfaceC44721lp0.C25796a.m26777c(interfaceC47059pl6);
        }

        /* renamed from: c */
        public static void m18792c(InterfaceC47059pl6 interfaceC47059pl6, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            InterfaceC44721lp0.C25796a.m26776d(interfaceC47059pl6, command);
        }

        /* renamed from: d */
        public static void m18791d(InterfaceC47059pl6 interfaceC47059pl6, Collection<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            InterfaceC44721lp0.C25796a.m26775e(interfaceC47059pl6, sections);
        }

        /* renamed from: e */
        public static AbstractC24507p<Integer> m18790e(InterfaceC47059pl6 interfaceC47059pl6, List<AlarmOption> options) {
            Intrinsics.checkNotNullParameter(options, "options");
            return InterfaceC44721lp0.C25796a.m26774f(interfaceC47059pl6, options);
        }

        /* renamed from: f */
        public static void m18789f(InterfaceC47059pl6 interfaceC47059pl6, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            InterfaceC44721lp0.C25796a.m26772h(interfaceC47059pl6, command);
        }

        /* renamed from: g */
        public static void m18788g(InterfaceC47059pl6 interfaceC47059pl6, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            InterfaceC44721lp0.C25796a.m26771i(interfaceC47059pl6, command);
        }
    }

    /* renamed from: B1 */
    Observable<CommandCenterButton> mo17129B1();

    /* renamed from: K */
    Observable<Unit> mo17127K();
}
