package p000;

import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.model.AlarmCommand;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.LightsCommand;
import co.bird.android.model.LockCommand;
import co.bird.android.model.SleepCommand;
import co.bird.android.model.SoftResetCommand;
import co.bird.android.model.UnlockBatteryCommand;
import co.bird.android.model.UnlockCableCommand;
import co.bird.android.model.UnlockCommand;
import co.bird.android.model.UnlockHelmetCommand;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.VehicleCommandKt;
import co.bird.android.model.WakeCommand;
import co.bird.android.widget.BottomSheetOptionLayout;
import co.bird.android.widget.C16597a;
import co.bird.android.widget.C16664e;
import co.bird.android.widget.InterfaceC16662d;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C53094zw3;
import p000.InterfaceC44721lp0;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m28432d2 = {"Llp0;", "LH31;", "LLo6;", "LS74;", "Lio/reactivex/Observable;", "Lco/bird/android/model/VehicleCommand;", "B", "", "LH6;", "sections", "", "o", "t1", "command", "Jd", "v9", "M3", "", "Lco/bird/android/model/AlarmOption;", "options", "Lio/reactivex/p;", "", "Sa", "Lco/bird/android/core/base/BaseCoreActivity;", "getActivity", "()Lco/bird/android/core/base/BaseCoreActivity;", "activity", "LoA;", "getAdapter", "()LoA;", "adapter", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lp0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC44721lp0 extends H31, InterfaceC34319Lo6, S74 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCommandUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandUi.kt\nco/bird/android/command/base/CommandUi$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$1\n*L\n1#1,108:1\n1549#2:109\n1620#2,3:110\n819#2:122\n847#2:123\n848#2:125\n64#3,9:113\n73#3,4:126\n66#4:124\n*S KotlinDebug\n*F\n+ 1 CommandUi.kt\nco/bird/android/command/base/CommandUi$DefaultImpls\n*L\n90#1:109\n90#1:110,3\n89#1:122\n89#1:123\n89#1:125\n89#1:113,9\n89#1:126,4\n89#1:124\n*E\n"})
    /* renamed from: lp0$a */
    /* loaded from: classes2.dex */
    public static final class C25796a {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lco/bird/android/widget/d;", "co/bird/android/widget/a$n"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$2$1\n*L\n1#1,108:1\n*E\n"})
        /* renamed from: lp0$a$a */
        /* loaded from: classes2.dex */
        public static final class C25797a extends Lambda implements Function1<Integer, C25118k9> {

            /* renamed from: g */
            public final /* synthetic */ List f96771g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25797a(List list) {
                super(1);
                this.f96771g = list;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [co.bird.android.widget.d, k9] */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C25118k9 invoke(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (InterfaceC16662d) this.f96771g.get(it.intValue());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lk9;", "alarmOption", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lk9;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: lp0$a$b */
        /* loaded from: classes2.dex */
        public static final class C25798b extends Lambda implements Function1<C25118k9, Integer> {

            /* renamed from: g */
            public static final C25798b f96772g = new C25798b();

            public C25798b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Integer invoke(C25118k9 alarmOption) {
                Intrinsics.checkNotNullParameter(alarmOption, "alarmOption");
                return Integer.valueOf(alarmOption.m29240j());
            }
        }

        /* renamed from: b */
        public static void m26778b(InterfaceC44721lp0 interfaceC44721lp0) {
            interfaceC44721lp0.getAdapter().mo21705w();
        }

        /* renamed from: c */
        public static Observable<VehicleCommand> m26777c(InterfaceC44721lp0 interfaceC44721lp0) {
            return interfaceC44721lp0.getAdapter().m21704x();
        }

        /* renamed from: d */
        public static void m26776d(InterfaceC44721lp0 interfaceC44721lp0, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            interfaceC44721lp0.getAdapter().mo21706B(command);
        }

        /* renamed from: e */
        public static void m26775e(InterfaceC44721lp0 interfaceC44721lp0, Collection<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            interfaceC44721lp0.getAdapter().mo24871u(sections);
        }

        /* renamed from: f */
        public static AbstractC24507p<Integer> m26774f(InterfaceC44721lp0 interfaceC44721lp0, List<AlarmOption> options) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(options, "options");
            BaseCoreActivity activity = interfaceC44721lp0.getActivity();
            List<AlarmOption> list = options;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (AlarmOption alarmOption : list) {
                arrayList.add(new C25118k9(alarmOption.getLabel(), alarmOption.getDuration()));
            }
            BottomSheetOptionLayout.EnumC16469a enumC16469a = BottomSheetOptionLayout.EnumC16469a.SMALL_TITLE;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                InterfaceC16662d interfaceC16662d = (InterfaceC16662d) obj;
                arrayList2.add(obj);
            }
            C16664e c16664e = new C16664e();
            c16664e.setArguments(C16597a.m54345a(enumC16469a, null, null, 8388611, arrayList2));
            c16664e.show(activity.getSupportFragmentManager(), "BottomSheetOptionFragment");
            AbstractC24507p<R> m32067H = c16664e.m54040D9().m32067H(new C16597a.C16599b(new C25797a(arrayList2)));
            Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
            final C25798b c25798b = C25798b.f96772g;
            AbstractC24507p<Integer> m32067H2 = m32067H.m32067H(new InterfaceC23492o() { // from class: kp0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    Integer m26773g;
                    m26773g = InterfaceC44721lp0.C25796a.m26773g(Function1.this, obj2);
                    return m26773g;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32067H2, "activity.showBottomSheet…-> alarmOption.duration }");
            return m32067H2;
        }

        /* renamed from: g */
        public static Integer m26773g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Integer) tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static void m26772h(InterfaceC44721lp0 interfaceC44721lp0, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            C46480on0.f102487d.m20498a(command).show(interfaceC44721lp0.getActivity().getSupportFragmentManager(), "command_center_error_dialog");
        }

        /* renamed from: i */
        public static void m26771i(InterfaceC44721lp0 interfaceC44721lp0, VehicleCommand command) {
            boolean z;
            boolean z2;
            int i;
            Intrinsics.checkNotNullParameter(command, "command");
            if (command instanceof LockCommand) {
                if (VehicleCommandKt.isBluetooth(command.getMethod())) {
                    i = C45871nl4.command_center_bluetooth_lock_success;
                } else {
                    i = C45871nl4.command_center_cellular_lock_success;
                }
            } else {
                boolean z3 = true;
                if (command instanceof UnlockCommand) {
                    z = true;
                } else {
                    z = command instanceof UnlockBatteryCommand;
                }
                if (z) {
                    z2 = true;
                } else {
                    z2 = command instanceof UnlockCableCommand;
                }
                if (!z2) {
                    z3 = command instanceof UnlockHelmetCommand;
                }
                if (z3) {
                    if (VehicleCommandKt.isBluetooth(command.getMethod())) {
                        i = C45871nl4.command_center_bluetooth_unlock_success;
                    } else {
                        i = C45871nl4.command_center_cellular_unlock_success;
                    }
                } else if (command instanceof AlarmCommand) {
                    i = C45871nl4.command_center_bluetooth_chirp_success;
                } else if (command instanceof LightsCommand) {
                    i = C45871nl4.command_center_bluetooth_flash_success;
                } else if (command instanceof SleepCommand) {
                    if (VehicleCommandKt.isBluetooth(command.getMethod())) {
                        i = C45871nl4.command_center_bluetooth_sleep_success;
                    } else {
                        i = C45871nl4.command_center_cellular_sleep_success;
                    }
                } else if (command instanceof WakeCommand) {
                    i = C45871nl4.command_center_bluetooth_wake_success;
                } else if (command instanceof SoftResetCommand) {
                    i = C45871nl4.command_center_bluetooth_soft_reset_success;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            C53094zw3.C31593a c31593a = C53094zw3.f122502a;
            BaseCoreActivity activity = interfaceC44721lp0.getActivity();
            String string = interfaceC44721lp0.getActivity().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(messageRes)");
            C53094zw3.C31593a.makeText$default(c31593a, activity, string, 1, 0, null, 24, null).show();
        }
    }

    /* renamed from: B */
    Observable<VehicleCommand> mo17130B();

    /* renamed from: Jd */
    void mo17128Jd(VehicleCommand vehicleCommand);

    /* renamed from: M3 */
    void mo17126M3(VehicleCommand vehicleCommand);

    /* renamed from: Sa */
    AbstractC24507p<Integer> mo17124Sa(List<AlarmOption> list);

    BaseCoreActivity getActivity();

    AbstractC26846oA getAdapter();

    /* renamed from: o */
    void mo17123o(Collection<C3023H6> collection);

    /* renamed from: t1 */
    void mo17122t1();

    /* renamed from: v9 */
    void mo17121v9(VehicleCommand vehicleCommand);
}
