package p000;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C47826r31;
import p000.C51382x31;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28432d2 = {"Lx31;", "dialogNavigator", "", C17296a.f69688o, "(Lx31;LEt0;I)V", "", "LAY2;", "", "transitionsInProgress", "c", "(Ljava/util/List;Ljava/util/Collection;LEt0;I)V", "LMM5;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Collection;LEt0;I)LMM5;", "navigation-compose_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: r31  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47826r31 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r31$a */
    /* loaded from: classes.dex */
    public static final class C27827a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C51382x31 f106331g;

        /* renamed from: h */
        public final /* synthetic */ AY2 f106332h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27827a(C51382x31 c51382x31, AY2 ay2) {
            super(0);
            this.f106331g = c51382x31;
            this.f106332h = ay2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f106331g.m5896m(this.f106332h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r31$b */
    /* loaded from: classes.dex */
    public static final class C27828b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AY2 f106333g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC32626Ei5 f106334h;

        /* renamed from: i */
        public final /* synthetic */ C51382x31 f106335i;

        /* renamed from: j */
        public final /* synthetic */ C51382x31.C30030b f106336j;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: r31$b$a */
        /* loaded from: classes.dex */
        public static final class C27829a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

            /* renamed from: g */
            public final /* synthetic */ C51382x31 f106337g;

            /* renamed from: h */
            public final /* synthetic */ AY2 f106338h;

            @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"r31$b$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
            /* renamed from: r31$b$a$a */
            /* loaded from: classes.dex */
            public static final class C27830a implements InterfaceC44288l51 {

                /* renamed from: a */
                public final /* synthetic */ C51382x31 f106339a;

                /* renamed from: b */
                public final /* synthetic */ AY2 f106340b;

                public C27830a(C51382x31 c51382x31, AY2 ay2) {
                    this.f106339a = c51382x31;
                    this.f106340b = ay2;
                }

                @Override // p000.InterfaceC44288l51
                public void dispose() {
                    this.f106339a.m5894o(this.f106340b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27829a(C51382x31 c51382x31, AY2 ay2) {
                super(1);
                this.f106337g = c51382x31;
                this.f106338h = ay2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                return new C27830a(this.f106337g, this.f106338h);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: r31$b$b */
        /* loaded from: classes.dex */
        public static final class C27831b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C51382x31.C30030b f106341g;

            /* renamed from: h */
            public final /* synthetic */ AY2 f106342h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27831b(C51382x31.C30030b c30030b, AY2 ay2) {
                super(2);
                this.f106341g = c30030b;
                this.f106342h = ay2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                } else {
                    this.f106341g.m5893F().invoke(this.f106342h, interfaceC32720Et0, 8);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27828b(AY2 ay2, InterfaceC32626Ei5 interfaceC32626Ei5, C51382x31 c51382x31, C51382x31.C30030b c30030b) {
            super(2);
            this.f106333g = ay2;
            this.f106334h = interfaceC32626Ei5;
            this.f106335i = c51382x31;
            this.f106336j = c30030b;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            AY2 ay2 = this.f106333g;
            Y91.m75536c(ay2, new C27829a(this.f106335i, ay2), interfaceC32720Et0, 8);
            AY2 ay22 = this.f106333g;
            BY2.m113878a(ay22, this.f106334h, C43575jt0.m29791b(interfaceC32720Et0, -497631156, true, new C27831b(this.f106336j, ay22)), interfaceC32720Et0, 456);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r31$c */
    /* loaded from: classes.dex */
    public static final class C27832c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C51382x31 f106343g;

        /* renamed from: h */
        public final /* synthetic */ int f106344h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27832c(C51382x31 c51382x31, int i) {
            super(2);
            this.f106343g = c51382x31;
            this.f106344h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C47826r31.m16565a(this.f106343g, interfaceC32720Et0, this.f106344h | 1);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r31$d */
    /* loaded from: classes.dex */
    public static final class C27833d extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ AY2 f106345g;

        /* renamed from: h */
        public final /* synthetic */ List<AY2> f106346h;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"r31$d$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: r31$d$a */
        /* loaded from: classes.dex */
        public static final class C27834a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ AY2 f106347a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11728i f106348b;

            public C27834a(AY2 ay2, InterfaceC11728i interfaceC11728i) {
                this.f106347a = ay2;
                this.f106348b = interfaceC11728i;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f106347a.getLifecycle().mo67006d(this.f106348b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27833d(AY2 ay2, List<AY2> list) {
            super(1);
            this.f106345g = ay2;
            this.f106346h = list;
        }

        /* renamed from: b */
        public static final void m16560b(List this_PopulateVisibleList, AY2 entry, LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a event) {
            Intrinsics.checkNotNullParameter(this_PopulateVisibleList, "$this_PopulateVisibleList");
            Intrinsics.checkNotNullParameter(entry, "$entry");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC11719f.EnumC11720a.ON_START && !this_PopulateVisibleList.contains(entry)) {
                this_PopulateVisibleList.add(entry);
            }
            if (event == AbstractC11719f.EnumC11720a.ON_STOP) {
                this_PopulateVisibleList.remove(entry);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final List<AY2> list = this.f106346h;
            final AY2 ay2 = this.f106345g;
            InterfaceC11728i interfaceC11728i = new InterfaceC11728i() { // from class: s31
                @Override // androidx.lifecycle.InterfaceC11728i
                public final void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                    C47826r31.C27833d.m16560b(list, ay2, lifecycleOwner, enumC11720a);
                }
            };
            this.f106345g.getLifecycle().mo67008a(interfaceC11728i);
            return new C27834a(this.f106345g, interfaceC11728i);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: r31$e */
    /* loaded from: classes.dex */
    public static final class C27835e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ List<AY2> f106349g;

        /* renamed from: h */
        public final /* synthetic */ Collection<AY2> f106350h;

        /* renamed from: i */
        public final /* synthetic */ int f106351i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27835e(List<AY2> list, Collection<AY2> collection, int i) {
            super(2);
            this.f106349g = list;
            this.f106350h = collection;
            this.f106351i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C47826r31.m16563c(this.f106349g, this.f106350h, interfaceC32720Et0, this.f106351i | 1);
        }
    }

    /* renamed from: a */
    public static final void m16565a(C51382x31 dialogNavigator, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(dialogNavigator, "dialogNavigator");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(294589392);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(dialogNavigator)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            InterfaceC32626Ei5 m104873a = C33094Gi5.m104873a(mo89518u, 0);
            InterfaceC48627sP5 m105205b = GM5.m105205b(dialogNavigator.m5895n(), null, mo89518u, 8, 1);
            MM5<AY2> m16562d = m16562d(m16564b(m105205b), mo89518u, 8);
            m16563c(m16562d, m16564b(m105205b), mo89518u, 64);
            for (AY2 ay2 : m16562d) {
                C51382x31.C30030b c30030b = (C51382x31.C30030b) ay2.m115582f();
                C1556Dc.m110114a(new C27827a(dialogNavigator, ay2), c30030b.m5892G(), C43575jt0.m29791b(mo89518u, 1129586364, true, new C27828b(ay2, m104873a, dialogNavigator, c30030b)), mo89518u, 384, 0);
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C27832c(dialogNavigator, i));
        }
    }

    /* renamed from: b */
    public static final List<AY2> m16564b(InterfaceC48627sP5<? extends List<AY2>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* renamed from: c */
    public static final void m16563c(List<AY2> list, Collection<AY2> transitionsInProgress, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transitionsInProgress, "transitionsInProgress");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1537894851);
        for (AY2 ay2 : transitionsInProgress) {
            Y91.m75536c(ay2.getLifecycle(), new C27833d(ay2, list), mo89518u, 8);
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C27835e(list, transitionsInProgress, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r0 == p000.InterfaceC32720Et0.f8257a.m108267a()) goto L8;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MM5<AY2> m16562d(Collection<AY2> transitionsInProgress, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(transitionsInProgress, "transitionsInProgress");
        interfaceC32720Et0.mo89638F(467378629);
        interfaceC32720Et0.mo89638F(-3686930);
        boolean mo89539n = interfaceC32720Et0.mo89539n(transitionsInProgress);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (!mo89539n) {
            obj = mo89635G;
        }
        MM5<AY2> m105203d = GM5.m105203d();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : transitionsInProgress) {
            if (((AY2) obj2).getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
                arrayList.add(obj2);
            }
        }
        m105203d.addAll(arrayList);
        interfaceC32720Et0.mo89503z(m105203d);
        obj = m105203d;
        interfaceC32720Et0.mo89605Q();
        MM5<AY2> mm5 = (MM5) obj;
        interfaceC32720Et0.mo89605Q();
        return mm5;
    }
}
