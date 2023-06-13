package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
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
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J$\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030!8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\"\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"Lpn2;", "Lon2;", "LRn2;", "", "index", "", "f", "(ILEt0;I)V", "", C17296a.f69688o, "c", "Ltn2;", "LdE1;", "g", "(Ltn2;I)J", "LR62;", "Lkn2;", "LR62;", "intervals", "", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "hasCustomSpans", "LFn2;", "LFn2;", "i", "()LFn2;", "spanLayoutProvider", "getItemCount", "()I", "itemCount", "", "()Ljava/util/Map;", "keyToIndexMap", "LGn2;", TransferTable.COLUMN_STATE, "Lkotlin/ranges/IntRange;", "nearestItemsRange", "<init>", "(LR62;ZLGn2;Lkotlin/ranges/IntRange;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47075pn2 implements InterfaceC46482on2, InterfaceC35710Rn2 {

    /* renamed from: a */
    public final R62<C44110kn2> f104085a;

    /* renamed from: b */
    public final boolean f104086b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC35710Rn2 f104087c;

    /* renamed from: d */
    public final C32902Fn2 f104088d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LR62$a;", "Lkn2;", "interval", "", "index", "", C17296a.f69688o, "(LR62$a;ILEt0;I)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pn2$a */
    /* loaded from: classes.dex */
    public static final class C27388a extends Lambda implements Function4<R62.C7065a<? extends C44110kn2>, Integer, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C33136Gn2 f104089g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: pn2$a$a */
        /* loaded from: classes.dex */
        public static final class C27389a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ R62.C7065a<C44110kn2> f104090g;

            /* renamed from: h */
            public final /* synthetic */ int f104091h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27389a(R62.C7065a<C44110kn2> c7065a, int i) {
                super(2);
                this.f104090g = c7065a;
                this.f104091h = i;
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
                    C35528Qt0.m87816Z(-269692885, i, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyGridItemProvider.kt:95)");
                }
                this.f104090g.m87319c().m28443a().invoke(C48853sn2.f109239a, Integer.valueOf(this.f104091h), interfaceC32720Et0, 6);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27388a(C33136Gn2 c33136Gn2) {
            super(4);
            this.f104089g = c33136Gn2;
        }

        /* renamed from: a */
        public final void m18702a(R62.C7065a<C44110kn2> interval, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
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
                C35528Qt0.m87816Z(-1961468361, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous> (LazyGridItemProvider.kt:89)");
            }
            int m87320b = i - interval.m87320b();
            Function1<Integer, Object> key = interval.m87319c().getKey();
            if (key != null) {
                obj = key.invoke(Integer.valueOf(m87320b));
            } else {
                obj = null;
            }
            C37348Yn2.m74227a(obj, i, this.f104089g.m104734q(), C43575jt0.m29791b(interfaceC32720Et0, -269692885, true, new C27389a(interval, m87320b)), interfaceC32720Et0, (i3 & 112) | 3592);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(R62.C7065a<? extends C44110kn2> c7065a, Integer num, InterfaceC32720Et0 interfaceC32720Et0, Integer num2) {
            m18702a(c7065a, num.intValue(), interfaceC32720Et0, num2.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pn2$b */
    /* loaded from: classes.dex */
    public static final class C27390b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f104093h;

        /* renamed from: i */
        public final /* synthetic */ int f104094i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27390b(int i, int i2) {
            super(2);
            this.f104093h = i;
            this.f104094i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C47075pn2.this.mo15367f(this.f104093h, interfaceC32720Et0, C47127ps4.m18626a(this.f104094i | 1));
        }
    }

    public C47075pn2(R62<C44110kn2> intervals, boolean z, C33136Gn2 state, IntRange nearestItemsRange) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        this.f104085a = intervals;
        this.f104086b = z;
        this.f104087c = C35944Sn2.m84828b(intervals, nearestItemsRange, C43575jt0.m29790c(-1961468361, true, new C27388a(state)));
        this.f104088d = new C32902Fn2(this);
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: a */
    public Object mo15371a(int i) {
        return this.f104087c.mo15371a(i);
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: b */
    public Map<Object, Integer> mo15370b() {
        return this.f104087c.mo15370b();
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: c */
    public Object mo15369c(int i) {
        return this.f104087c.mo15369c(i);
    }

    @Override // p000.InterfaceC46482on2
    /* renamed from: d */
    public boolean mo17076d() {
        return this.f104086b;
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: f */
    public void mo15367f(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1355196996);
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
                C35528Qt0.m87816Z(1355196996, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:-1)");
            }
            this.f104087c.mo15367f(i, mo89518u, i3 & 14);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new C27390b(i, i2));
    }

    @Override // p000.InterfaceC46482on2
    /* renamed from: g */
    public long mo17075g(InterfaceC49446tn2 getSpan, int i) {
        Intrinsics.checkNotNullParameter(getSpan, "$this$getSpan");
        R62.C7065a<C44110kn2> c7065a = this.f104085a.get(i);
        return c7065a.m87319c().m28442b().invoke(getSpan, Integer.valueOf(i - c7065a.m87320b())).m44512g();
    }

    @Override // p000.InterfaceC35710Rn2
    public int getItemCount() {
        return this.f104087c.getItemCount();
    }

    @Override // p000.InterfaceC46482on2
    /* renamed from: i */
    public C32902Fn2 mo17074i() {
        return this.f104088d;
    }
}
