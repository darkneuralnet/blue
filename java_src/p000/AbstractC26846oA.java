package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.CommandMethod;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.VehicleCommandKt;
import co.bird.android.model.WakeCommand;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\f\u001a\u00020\u000bH\u0017J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0017R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000fj\b\u0012\u0004\u0012\u00020\t`\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\t0\t0\u00168\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, m28432d2 = {"LoA;", "LUl0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "Lco/bird/android/model/VehicleCommand;", "x", "", "w", "command", "B", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "c", "Ljava/util/HashSet;", "A", "()Ljava/util/HashSet;", "commandsInProgress", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "y", "()Lio/reactivex/subjects/d;", "commandSubject", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oA */
/* loaded from: classes2.dex */
public abstract class AbstractC26846oA extends AbstractC36392Ul0 {

    /* renamed from: c */
    public final HashSet<VehicleCommand> f101526c = new HashSet<>();

    /* renamed from: d */
    public final C24558d<VehicleCommand> f101527d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LoA$a;", "Lw1;", "", "position", "", "bind", "Lqb2;", "b", "Lqb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LoA;Landroid/view/View;)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseCommandAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n18#2:136\n18#2:151\n9#3,4:137\n9#3,4:152\n1603#4,9:141\n1855#4:150\n1856#4:157\n1612#4:158\n1747#4,3:159\n223#4,2:162\n1#5:156\n*S KotlinDebug\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder\n*L\n91#1:136\n104#1:151\n91#1:137,4\n104#1:152,4\n104#1:141,9\n104#1:150\n104#1:157\n104#1:158\n106#1:159,3\n119#1:162,2\n104#1:156\n*E\n"})
    /* renamed from: oA$a */
    /* loaded from: classes2.dex */
    public final class C26847a extends C29735w1 {

        /* renamed from: b */
        public final C47548qb2 f101528b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC26846oA f101529c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBaseCommandAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,135:1\n18#2:136\n9#3,4:137\n*S KotlinDebug\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder$1\n*L\n56#1:136\n56#1:137,4\n*E\n"})
        /* renamed from: oA$a$a */
        /* loaded from: classes2.dex */
        public static final class C26848a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC26846oA f101530g;

            /* renamed from: h */
            public final /* synthetic */ C26847a f101531h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26848a(AbstractC26846oA abstractC26846oA, C26847a c26847a) {
                super(1);
                this.f101530g = abstractC26846oA;
                this.f101531h = c26847a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f101530g.m94545o().m109394h().get(this.f101531h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof VehicleCommand)) {
                    m105816c = null;
                }
                VehicleCommand vehicleCommand = (VehicleCommand) m105816c;
                if (vehicleCommand == null) {
                    return;
                }
                vehicleCommand.setMethod(CommandMethod.BLUETOOTH);
                this.f101530g.m21703y().onNext(vehicleCommand);
                this.f101530g.m21707A().add(vehicleCommand);
                this.f101531h.f101528b.f105454b.setText((CharSequence) null);
                ProgressBar progressBar = this.f101531h.f101528b.f105455c;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding.bluetoothProgressBar");
                C49520tu6.m11233r(progressBar);
                this.f101531h.f101528b.f105454b.setEnabled(false);
                this.f101531h.f101528b.f105456d.setEnabled(false);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBaseCommandAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,135:1\n18#2:136\n9#3,4:137\n*S KotlinDebug\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder$2\n*L\n72#1:136\n72#1:137,4\n*E\n"})
        /* renamed from: oA$a$b */
        /* loaded from: classes2.dex */
        public static final class C26849b extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ AbstractC26846oA f101533h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26849b(AbstractC26846oA abstractC26846oA) {
                super(1);
                this.f101533h = abstractC26846oA;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C26847a.this.getAdapterPosition();
                if (adapterPosition == -1) {
                    return;
                }
                Object m105816c = this.f101533h.m94545o().m109394h().get(adapterPosition).m105816c();
                if (!(m105816c instanceof VehicleCommand)) {
                    m105816c = null;
                }
                VehicleCommand vehicleCommand = (VehicleCommand) m105816c;
                if (vehicleCommand == null) {
                    return;
                }
                vehicleCommand.setMethod(CommandMethod.CELLULAR);
                this.f101533h.m21703y().onNext(vehicleCommand);
                this.f101533h.m21707A().add(vehicleCommand);
                C26847a.this.f101528b.f105456d.setText((CharSequence) null);
                ProgressBar progressBar = C26847a.this.f101528b.f105457e;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding.cellularProgressBar");
                C49520tu6.m11233r(progressBar);
                C26847a.this.f101528b.f105454b.setEnabled(false);
                C26847a.this.f101528b.f105456d.setEnabled(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26847a(AbstractC26846oA abstractC26846oA, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f101529c = abstractC26846oA;
            C47548qb2 m17352a = C47548qb2.m17352a(view);
            Intrinsics.checkNotNullExpressionValue(m17352a, "bind(view)");
            this.f101528b = m17352a;
            Button button = m17352a.f105454b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.bluetooth");
            C34585Ms2.m94661j(button, new C26848a(abstractC26846oA, this));
            Button button2 = m17352a.f105456d;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.cellular");
            C34585Ms2.m94661j(button2, new C26849b(abstractC26846oA));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            ProgressBar progressBar = this.f101528b.f105455c;
            Intrinsics.checkNotNullExpressionValue(progressBar, "binding.bluetoothProgressBar");
            C49520tu6.m11232s(progressBar, false, 4);
            ProgressBar progressBar2 = this.f101528b.f105457e;
            Intrinsics.checkNotNullExpressionValue(progressBar2, "binding.cellularProgressBar");
            C49520tu6.m11232s(progressBar2, false, 4);
            C2637G6 c2637g6 = this.f101529c.m94545o().m109394h().get(i);
            Object m105816c = c2637g6.m105816c();
            if (!(m105816c instanceof VehicleCommand)) {
                m105816c = null;
            }
            VehicleCommand vehicleCommand = (VehicleCommand) m105816c;
            if (vehicleCommand != null) {
                this.f101528b.f105459g.setImageDrawable(NA0.m94299e(this.itemView.getContext(), vehicleCommand.getIcon()));
                this.f101528b.f105458f.setText(vehicleCommand.getTitle());
                this.f101528b.f105454b.setText(this.itemView.getContext().getString(C45871nl4.command_center_command_bluetooth_format, vehicleCommand.getCommand()));
                this.f101528b.f105456d.setText(this.itemView.getContext().getString(C45871nl4.command_center_command_cellular_format, vehicleCommand.getCommand()));
                Button button = this.f101528b.f105454b;
                Intrinsics.checkNotNullExpressionValue(button, "binding.bluetooth");
                C49520tu6.show$default(button, vehicleCommand.getBluetooth(), 0, 2, null);
                Button button2 = this.f101528b.f105456d;
                Intrinsics.checkNotNullExpressionValue(button2, "binding.cellular");
                C49520tu6.show$default(button2, vehicleCommand.getCellular(), 0, 2, null);
                if (!(vehicleCommand instanceof WakeCommand)) {
                    ArrayList<VehicleCommand> arrayList = new ArrayList();
                    for (C2637G6 c2637g62 : this.f101529c.m94545o().m109393i(c2637g6).m104410c()) {
                        Object m105816c2 = c2637g62.m105816c();
                        if (!(m105816c2 instanceof VehicleCommand)) {
                            m105816c2 = null;
                        }
                        VehicleCommand vehicleCommand2 = (VehicleCommand) m105816c2;
                        if (vehicleCommand2 != null) {
                            arrayList.add(vehicleCommand2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        for (VehicleCommand vehicleCommand3 : arrayList) {
                            if (vehicleCommand3 instanceof WakeCommand) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    this.f101528b.f105454b.setEnabled(!z);
                    this.f101528b.f105456d.setEnabled(!z);
                } else {
                    WakeCommand wakeCommand = (WakeCommand) vehicleCommand;
                    this.f101528b.f105454b.setEnabled(wakeCommand.getBluetooth());
                    this.f101528b.f105456d.setEnabled(wakeCommand.getCellular());
                }
                if (this.f101529c.m21707A().contains(vehicleCommand)) {
                    for (VehicleCommand vehicleCommand4 : this.f101529c.m21707A()) {
                        if (Intrinsics.areEqual(vehicleCommand4, vehicleCommand)) {
                            this.f101528b.f105454b.setEnabled(false);
                            this.f101528b.f105456d.setEnabled(false);
                            if (VehicleCommandKt.isBluetooth(vehicleCommand4.getMethod())) {
                                this.f101528b.f105454b.setText((CharSequence) null);
                                ProgressBar progressBar3 = this.f101528b.f105455c;
                                Intrinsics.checkNotNullExpressionValue(progressBar3, "binding.bluetoothProgressBar");
                                C49520tu6.m11233r(progressBar3);
                                return;
                            }
                            this.f101528b.f105456d.setText((CharSequence) null);
                            ProgressBar progressBar4 = this.f101528b.f105457e;
                            Intrinsics.checkNotNullExpressionValue(progressBar4, "binding.cellularProgressBar");
                            C49520tu6.m11233r(progressBar4);
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
    }

    public AbstractC26846oA() {
        C24558d<VehicleCommand> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<VehicleCommand>()");
        this.f101527d = m31902e;
    }

    /* renamed from: A */
    public final HashSet<VehicleCommand> m21707A() {
        return this.f101526c;
    }

    /* renamed from: B */
    public void mo21706B(VehicleCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f101526c.remove(command);
    }

    /* renamed from: w */
    public void mo21705w() {
        this.f101526c.clear();
    }

    /* renamed from: x */
    public final Observable<VehicleCommand> m21704x() {
        Observable<VehicleCommand> hide = this.f101527d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "commandSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final C24558d<VehicleCommand> m21703y() {
        return this.f101527d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C45851nj4.item_command_center_command ? new C26847a(this, m41761u) : new C29735w1(m41761u);
    }
}
