package p000;

import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lkotlin/Function1;", "LEi5;", "", "content", C17296a.f69688o, "(Lkotlin/jvm/functions/Function3;LEt0;I)V", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,106:1\n76#2:107\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n*L\n43#1:107\n*E\n"})
/* renamed from: Ko2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34081Ko2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ko2$a */
    /* loaded from: classes.dex */
    public static final class C4597a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C33847Jo2 f20235g;

        /* renamed from: h */
        public final /* synthetic */ Function3<InterfaceC32626Ei5, InterfaceC32720Et0, Integer, Unit> f20236h;

        /* renamed from: i */
        public final /* synthetic */ int f20237i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4597a(C33847Jo2 c33847Jo2, Function3<? super InterfaceC32626Ei5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
            super(2);
            this.f20235g = c33847Jo2;
            this.f20236h = function3;
            this.f20237i = i;
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
                C35528Qt0.m87816Z(1863926504, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:48)");
            }
            this.f20235g.m99674i(C33094Gi5.m104873a(interfaceC32720Et0, 0));
            this.f20236h.invoke(this.f20235g, interfaceC32720Et0, Integer.valueOf(((this.f20237i << 3) & 112) | 8));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ko2$b */
    /* loaded from: classes.dex */
    public static final class C4598b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function3<InterfaceC32626Ei5, InterfaceC32720Et0, Integer, Unit> f20238g;

        /* renamed from: h */
        public final /* synthetic */ int f20239h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4598b(Function3<? super InterfaceC32626Ei5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
            super(2);
            this.f20238g = function3;
            this.f20239h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C34081Ko2.m98278a(this.f20238g, interfaceC32720Et0, C47127ps4.m18626a(this.f20239h | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ko2$c */
    /* loaded from: classes.dex */
    public static final class C4599c extends Lambda implements Function0<C33847Jo2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC33328Hi5 f20240g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4599c(InterfaceC33328Hi5 interfaceC33328Hi5) {
            super(0);
            this.f20240g = interfaceC33328Hi5;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C33847Jo2 invoke() {
            Map emptyMap;
            InterfaceC33328Hi5 interfaceC33328Hi5 = this.f20240g;
            emptyMap = MapsKt__MapsKt.emptyMap();
            return new C33847Jo2(interfaceC33328Hi5, emptyMap);
        }
    }

    /* renamed from: a */
    public static final void m98278a(Function3<? super InterfaceC32626Ei5, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(674185128);
        if ((i & 14) == 0) {
            if (mo89518u.mo89629I(content)) {
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
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(674185128, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            InterfaceC33328Hi5 interfaceC33328Hi5 = (InterfaceC33328Hi5) mo89518u.mo89572c(C33796Ji5.m99923b());
            C33847Jo2 c33847Jo2 = (C33847Jo2) C35550Qv4.m87571b(new Object[]{interfaceC33328Hi5}, C33847Jo2.f18262d.m99673a(interfaceC33328Hi5), null, new C4599c(interfaceC33328Hi5), mo89518u, 72, 4);
            C41806gu0.m37353a(new W94[]{C33796Ji5.m99923b().m81907c(c33847Jo2)}, C43575jt0.m29791b(mo89518u, 1863926504, true, new C4597a(c33847Jo2, content, i2)), mo89518u, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C4598b(content, i));
        }
    }
}
