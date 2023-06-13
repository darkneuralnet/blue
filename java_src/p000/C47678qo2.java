package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import p000.R62;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00198VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001a¨\u0006%"}, m28432d2 = {"Lqo2;", "Lpo2;", "LRn2;", "", "index", "", "f", "(ILEt0;I)V", "", C17296a.f69688o, "c", "", "Ljava/util/List;", "h", "()Ljava/util/List;", "headerIndexes", "LMn2;", "b", "LMn2;", "e", "()LMn2;", "itemScope", "getItemCount", "()I", "itemCount", "", "()Ljava/util/Map;", "keyToIndexMap", "LR62;", "Llo2;", "intervals", "Lkotlin/ranges/IntRange;", "nearestItemsRange", "LCo2;", TransferTable.COLUMN_STATE, "<init>", "(LR62;Lkotlin/ranges/IntRange;Ljava/util/List;LMn2;LCo2;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47678qo2 implements InterfaceC47085po2, InterfaceC35710Rn2 {

    /* renamed from: a */
    public final List<Integer> f105832a;

    /* renamed from: b */
    public final C34540Mn2 f105833b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC35710Rn2 f105834c;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LR62$a;", "Llo2;", "interval", "", "index", "", C17296a.f69688o, "(LR62$a;ILEt0;I)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qo2$a */
    /* loaded from: classes.dex */
    public static final class C27691a extends Lambda implements Function4<R62.C7065a<? extends C44713lo2>, Integer, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C32209Co2 f105835g;

        /* renamed from: h */
        public final /* synthetic */ C34540Mn2 f105836h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: qo2$a$a */
        /* loaded from: classes.dex */
        public static final class C27692a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ R62.C7065a<C44713lo2> f105837g;

            /* renamed from: h */
            public final /* synthetic */ C34540Mn2 f105838h;

            /* renamed from: i */
            public final /* synthetic */ int f105839i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27692a(R62.C7065a<C44713lo2> c7065a, C34540Mn2 c34540Mn2, int i) {
                super(2);
                this.f105837g = c7065a;
                this.f105838h = c34540Mn2;
                this.f105839i = i;
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
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1210565839, i, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyListItemProvider.kt:87)");
                }
                this.f105837g.m87319c().m26789a().invoke(this.f105838h, Integer.valueOf(this.f105839i), interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27691a(C32209Co2 c32209Co2, C34540Mn2 c34540Mn2) {
            super(4);
            this.f105835g = c32209Co2;
            this.f105836h = c34540Mn2;
        }

        /* renamed from: a */
        public final void m16966a(R62.C7065a<C44713lo2> interval, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
            int i3;
            Object obj;
            int i4;
            int i5;
            Intrinsics.checkNotNullParameter(interval, "interval");
            if ((i2 & 14) == 0) {
                if (interfaceC32720Et0.mo89539n(interval)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
                i3 = i5 | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                if (interfaceC32720Et0.mo89527r(i)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i3 & 731) == 146 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2070454083, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous> (LazyListItemProvider.kt:81)");
            }
            int m87320b = i - interval.m87320b();
            Function1<Integer, Object> key = interval.m87319c().getKey();
            if (key != null) {
                obj = key.invoke(Integer.valueOf(m87320b));
            } else {
                obj = null;
            }
            C37348Yn2.m74227a(obj, i, this.f105835g.m111534s(), C43575jt0.m29791b(interfaceC32720Et0, 1210565839, true, new C27692a(interval, this.f105836h, m87320b)), interfaceC32720Et0, (i3 & 112) | 3592);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(R62.C7065a<? extends C44713lo2> c7065a, Integer num, InterfaceC32720Et0 interfaceC32720Et0, Integer num2) {
            m16966a(c7065a, num.intValue(), interfaceC32720Et0, num2.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qo2$b */
    /* loaded from: classes.dex */
    public static final class C27693b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f105841h;

        /* renamed from: i */
        public final /* synthetic */ int f105842i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27693b(int i, int i2) {
            super(2);
            this.f105841h = i;
            this.f105842i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C47678qo2.this.mo15367f(this.f105841h, interfaceC32720Et0, C47127ps4.m18626a(this.f105842i | 1));
        }
    }

    public C47678qo2(R62<C44713lo2> intervals, IntRange nearestItemsRange, List<Integer> headerIndexes, C34540Mn2 itemScope, C32209Co2 state) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(itemScope, "itemScope");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f105832a = headerIndexes;
        this.f105833b = itemScope;
        this.f105834c = C35944Sn2.m84828b(intervals, nearestItemsRange, C43575jt0.m29790c(2070454083, true, new C27691a(state, itemScope)));
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: a */
    public Object mo15371a(int i) {
        return this.f105834c.mo15371a(i);
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: b */
    public Map<Object, Integer> mo15370b() {
        return this.f105834c.mo15370b();
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: c */
    public Object mo15369c(int i) {
        return this.f105834c.mo15369c(i);
    }

    @Override // p000.InterfaceC47085po2
    /* renamed from: e */
    public C34540Mn2 mo15368e() {
        return this.f105833b;
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: f */
    public void mo15367f(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1645068522);
        if ((i2 & 14) == 0) {
            i3 = (mo89518u.mo89527r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= mo89518u.mo89539n(this) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1645068522, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:-1)");
            }
            this.f105834c.mo15367f(i, mo89518u, i3 & 14);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new C27693b(i, i2));
    }

    @Override // p000.InterfaceC35710Rn2
    public int getItemCount() {
        return this.f105834c.getItemCount();
    }

    @Override // p000.InterfaceC47085po2
    /* renamed from: h */
    public List<Integer> mo15366h() {
        return this.f105832a;
    }
}
