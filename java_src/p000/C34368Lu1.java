package p000;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.FragmentManager;
import co.bird.android.library.flow.FlowActivity;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34368Lu1;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fJ\u001a\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LLu1;", "LxE;", "LDi0;", "node", "", "isRoot", "", "Rl", "Ql", "", "", "Pl", "Lio/reactivex/Observable;", "Tl", "Lkotlin/Function1;", "Landroid/content/Context;", "titleProvider", "Sl", "Lco/bird/android/library/flow/FlowActivity;", "b", "Lco/bird/android/library/flow/FlowActivity;", "flowActivity", "Landroidx/fragment/app/FragmentManager;", "c", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Lco/bird/android/library/flow/FlowActivity;Landroidx/fragment/app/FragmentManager;)V", "flow_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlowCoordinatingUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoordinatingUi.kt\nco/bird/android/library/flow/FlowCoordinatingUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* renamed from: Lu1 */
/* loaded from: classes3.dex */
public final class C34368Lu1 extends AbstractC30071xE {

    /* renamed from: b */
    public final FlowActivity f22226b;

    /* renamed from: c */
    public final FragmentManager f22227c;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/y;", "", "emitter", "", "b", "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Lu1$a */
    /* loaded from: classes3.dex */
    public static final class C5124a extends Lambda implements Function1<InterfaceC24578y<String>, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5124a() {
            super(1);
            C34368Lu1.this = r1;
        }

        /* renamed from: c */
        public static final void m96210c(C34368Lu1 this$0, InterfaceC24578y emitter) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            int m67301t0 = this$0.f22227c.m67301t0() - 1;
            if (m67301t0 >= 0) {
                String name = this$0.f22227c.m67304s0(m67301t0).getName();
                if (name == null) {
                    name = "";
                }
                emitter.onNext(name);
            }
        }

        /* renamed from: b */
        public final void m96211b(final InterfaceC24578y<String> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            FragmentManager fragmentManager = C34368Lu1.this.f22227c;
            final C34368Lu1 c34368Lu1 = C34368Lu1.this;
            fragmentManager.m67326l(new FragmentManager.InterfaceC11640n() { // from class: Ku1
                @Override // androidx.fragment.app.FragmentManager.InterfaceC11640n
                public final void onBackStackChanged() {
                    C34368Lu1.C5124a.m96210c(C34368Lu1.this, emitter);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<String> interfaceC24578y) {
            m96211b(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34368Lu1(FlowActivity flowActivity, FragmentManager fragmentManager) {
        super(flowActivity);
        Intrinsics.checkNotNullParameter(flowActivity, "flowActivity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f22226b = flowActivity;
        this.f22227c = fragmentManager;
    }

    public static /* synthetic */ void pushNode$default(C34368Lu1 c34368Lu1, C32387Di0 c32387Di0, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c34368Lu1.m96215Rl(c32387Di0, z);
    }

    /* renamed from: Pl */
    public final List<String> m96217Pl() {
        ArrayList arrayList = new ArrayList();
        int m67301t0 = this.f22227c.m67301t0();
        for (int i = 0; i < m67301t0; i++) {
            String name = this.f22227c.m67304s0(i).getName();
            if (name == null) {
                name = "";
            }
            arrayList.add(name);
        }
        return arrayList;
    }

    /* renamed from: Ql */
    public final boolean m96216Ql(C32387Di0 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (this.f22227c.m67370U0() || !this.f22227c.m67327k1(node.m110000b(), 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: Rl */
    public final void m96215Rl(C32387Di0 node, boolean z) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (this.f22227c.m67370U0()) {
            return;
        }
        C36474Uu1 c36474Uu1 = new C36474Uu1();
        Bundle bundle = new Bundle();
        bundle.putString("node_id", node.m110000b());
        c36474Uu1.setArguments(bundle);
        AbstractC11685m m67117g = this.f22227c.m67311q().m67117g(node.m110000b());
        Intrinsics.checkNotNullExpressionValue(m67117g, "fragmentManager\n      .b… .addToBackStack(node.id)");
        if (!z && node.m110001a().invoke().booleanValue()) {
            m67117g.m67100x(C39882df4.slide_in_left, C39882df4.slide_out_left, C39882df4.slide_in_right, C39882df4.slide_out_right);
        }
        m67117g.m67103u(C49398ti4.rootContainer, c36474Uu1, node.m110000b()).mo67115i();
    }

    /* renamed from: Sl */
    public final void m96214Sl(Function1<? super Context, String> titleProvider) {
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        ActionBar supportActionBar = this.f22226b.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(titleProvider.invoke(this.f22226b));
        }
    }

    /* renamed from: Tl */
    public final Observable<String> m96213Tl() {
        return C45832nh5.m23307i(new C5124a());
    }
}
