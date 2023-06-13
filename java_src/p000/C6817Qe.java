package p000;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.p003ui.platform.C11411h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C5048Le;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0012\u001aÜ\u0001\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0010\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0011\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\b\r2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a·\u0001\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001f\b\u0002\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0010\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0011\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"I\u0010\"\u001a+\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\t¢\u0006\u0002\b\r0\u001c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\"I\u0010%\u001a+\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\t¢\u0006\u0002\b\r0\u001c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f\"I\u0010)\u001a+\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\t¢\u0006\u0002\b\r0\u001c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001d\u0012\u0004\b(\u0010!\u001a\u0004\b'\u0010\u001f\"I\u0010-\u001a+\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\t¢\u0006\u0002\b\r0\u001c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001d\u0012\u0004\b,\u0010!\u001a\u0004\b+\u0010\u001f¨\u0006."}, m28432d2 = {"LOY2;", "navController", "", "startDestination", "LgV2;", "modifier", "LK9;", "contentAlignment", "route", "Lkotlin/Function1;", "LOe;", "LAY2;", "LZe1;", "Lkotlin/ExtensionFunctionType;", "enterTransition", "Lgi1;", "exitTransition", "popEnterTransition", "popExitTransition", "LKY2;", "", "builder", "b", "(LOY2;Ljava/lang/String;LgV2;LK9;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V", "LJY2;", "graph", C17296a.f69688o, "(LOY2;LJY2;LgV2;LK9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V", "", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "getEnterTransitions$annotations", "()V", "enterTransitions", "f", "getExitTransitions$annotations", "exitTransitions", "c", "g", "getPopEnterTransitions$annotations", "popEnterTransitions", DateTokenConverter.CONVERTER_KEY, "h", "getPopExitTransitions$annotations", "popExitTransitions", "navigation-animation_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Qe */
/* loaded from: classes5.dex */
public final class C6817Qe {

    /* renamed from: a */
    public static final Map<String, Function1<C6080Oe<AY2>, AbstractC37500Ze1>> f30609a = new LinkedHashMap();

    /* renamed from: b */
    public static final Map<String, Function1<C6080Oe<AY2>, AbstractC41687gi1>> f30610b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map<String, Function1<C6080Oe<AY2>, AbstractC37500Ze1>> f30611c = new LinkedHashMap();

    /* renamed from: d */
    public static final Map<String, Function1<C6080Oe<AY2>, AbstractC41687gi1>> f30612d = new LinkedHashMap();

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$a */
    /* loaded from: classes5.dex */
    public static final class C6818a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OY2 f30613g;

        /* renamed from: h */
        public final /* synthetic */ JY2 f30614h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f30615i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4360K9 f30616j;

        /* renamed from: k */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30617k;

        /* renamed from: l */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30618l;

        /* renamed from: m */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30619m;

        /* renamed from: n */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30620n;

        /* renamed from: o */
        public final /* synthetic */ int f30621o;

        /* renamed from: p */
        public final /* synthetic */ int f30622p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6818a(OY2 oy2, JY2 jy2, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 interfaceC4360K9, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function12, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function13, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function14, int i, int i2) {
            super(2);
            this.f30613g = oy2;
            this.f30614h = jy2;
            this.f30615i = interfaceC41563gV2;
            this.f30616j = interfaceC4360K9;
            this.f30617k = function1;
            this.f30618l = function12;
            this.f30619m = function13;
            this.f30620n = function14;
            this.f30621o = i;
            this.f30622p = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C6817Qe.m88304a(this.f30613g, this.f30614h, this.f30615i, this.f30616j, this.f30617k, this.f30618l, this.f30619m, this.f30620n, interfaceC32720Et0, this.f30621o | 1, this.f30622p);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$b */
    /* loaded from: classes5.dex */
    public static final class C6819b extends Lambda implements Function1<C6080Oe<AY2>, AbstractC37500Ze1> {

        /* renamed from: g */
        public static final C6819b f30623g = new C6819b();

        public C6819b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC37500Ze1 invoke(C6080Oe<AY2> c6080Oe) {
            Intrinsics.checkNotNullParameter(c6080Oe, "$this$null");
            return C37266Ye1.m74631t(C26160mf.m25219k(700, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$c */
    /* loaded from: classes5.dex */
    public static final class C6820c extends Lambda implements Function1<C6080Oe<AY2>, AbstractC41687gi1> {

        /* renamed from: g */
        public static final C6820c f30624g = new C6820c();

        public C6820c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC41687gi1 invoke(C6080Oe<AY2> c6080Oe) {
            Intrinsics.checkNotNullParameter(c6080Oe, "$this$null");
            return C37266Ye1.m74629v(C26160mf.m25219k(700, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$d */
    /* loaded from: classes5.dex */
    public static final class C6821d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OY2 f30625g;

        /* renamed from: h */
        public final /* synthetic */ String f30626h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f30627i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4360K9 f30628j;

        /* renamed from: k */
        public final /* synthetic */ String f30629k;

        /* renamed from: l */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30630l;

        /* renamed from: m */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30631m;

        /* renamed from: n */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30632n;

        /* renamed from: o */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30633o;

        /* renamed from: p */
        public final /* synthetic */ Function1<KY2, Unit> f30634p;

        /* renamed from: q */
        public final /* synthetic */ int f30635q;

        /* renamed from: r */
        public final /* synthetic */ int f30636r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6821d(OY2 oy2, String str, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 interfaceC4360K9, String str2, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function12, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function13, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function14, Function1<? super KY2, Unit> function15, int i, int i2) {
            super(2);
            this.f30625g = oy2;
            this.f30626h = str;
            this.f30627i = interfaceC41563gV2;
            this.f30628j = interfaceC4360K9;
            this.f30629k = str2;
            this.f30630l = function1;
            this.f30631m = function12;
            this.f30632n = function13;
            this.f30633o = function14;
            this.f30634p = function15;
            this.f30635q = i;
            this.f30636r = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C6817Qe.m88303b(this.f30625g, this.f30626h, this.f30627i, this.f30628j, this.f30629k, this.f30630l, this.f30631m, this.f30632n, this.f30633o, this.f30634p, interfaceC32720Et0, this.f30635q | 1, this.f30636r);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$e */
    /* loaded from: classes5.dex */
    public static final class C6822e extends Lambda implements Function1<C6080Oe<AY2>, AbstractC37500Ze1> {

        /* renamed from: g */
        public static final C6822e f30637g = new C6822e();

        public C6822e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC37500Ze1 invoke(C6080Oe<AY2> c6080Oe) {
            Intrinsics.checkNotNullParameter(c6080Oe, "$this$null");
            return C37266Ye1.m74631t(C26160mf.m25219k(700, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$f */
    /* loaded from: classes5.dex */
    public static final class C6823f extends Lambda implements Function1<C6080Oe<AY2>, AbstractC41687gi1> {

        /* renamed from: g */
        public static final C6823f f30638g = new C6823f();

        public C6823f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC41687gi1 invoke(C6080Oe<AY2> c6080Oe) {
            Intrinsics.checkNotNullParameter(c6080Oe, "$this$null");
            return C37266Ye1.m74629v(C26160mf.m25219k(700, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$g */
    /* loaded from: classes5.dex */
    public static final class C6824g extends Lambda implements Function1<C6080Oe<AY2>, HA0> {

        /* renamed from: g */
        public final /* synthetic */ C5048Le f30639g;

        /* renamed from: h */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30640h;

        /* renamed from: i */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30641i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC48627sP5<List<AY2>> f30642j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6824g(C5048Le c5048Le, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function12, InterfaceC48627sP5<? extends List<AY2>> interfaceC48627sP5) {
            super(1);
            this.f30639g = c5048Le;
            this.f30640h = function1;
            this.f30641i = function12;
            this.f30642j = interfaceC48627sP5;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final HA0 invoke(C6080Oe<AY2> AnimatedContent) {
            int indexOf;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (this.f30639g.m96524m().getValue().booleanValue()) {
                indexOf = C6817Qe.m88302c(this.f30642j).indexOf(AnimatedContent.getInitialState());
            } else {
                indexOf = C6817Qe.m88302c(this.f30642j).indexOf(AnimatedContent.mo91780b());
            }
            float f = indexOf;
            if (C6817Qe.m88302c(this.f30642j).contains(AnimatedContent.getInitialState())) {
                return new HA0(this.f30640h.invoke(AnimatedContent), this.f30641i.invoke(AnimatedContent), f, null, 8, null);
            }
            return C5326Me.m95097d(AbstractC37500Ze1.f48862a.m72830a(), AbstractC41687gi1.f84046a.m37886a());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$h */
    /* loaded from: classes5.dex */
    public static final class C6825h extends Lambda implements Function1<AY2, Object> {

        /* renamed from: g */
        public static final C6825h f30643g = new C6825h();

        public C6825h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(AY2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m115581g();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$i */
    /* loaded from: classes5.dex */
    public static final class C6826i extends Lambda implements Function4<InterfaceC7907Te, AY2, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC32626Ei5 f30644g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<List<AY2>> f30645h;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: Qe$i$a */
        /* loaded from: classes5.dex */
        public static final class C6827a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AY2 f30646g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC7907Te f30647h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6827a(AY2 ay2, InterfaceC7907Te interfaceC7907Te) {
                super(2);
                this.f30646g = ay2;
                this.f30647h = interfaceC7907Te;
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
                    C35528Qt0.m87816Z(158545465, i, -1, "com.google.accompanist.navigation.animation.AnimatedNavHost.<anonymous>.<anonymous> (AnimatedNavHost.kt:226)");
                }
                HY2 m115582f = this.f30646g.m115582f();
                Intrinsics.checkNotNull(m115582f, "null cannot be cast to non-null type com.google.accompanist.navigation.animation.AnimatedComposeNavigator.Destination");
                ((C5048Le.C5050b) m115582f).m96522F().invoke(this.f30647h, this.f30646g, interfaceC32720Et0, 72);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6826i(InterfaceC32626Ei5 interfaceC32626Ei5, InterfaceC48627sP5<? extends List<AY2>> interfaceC48627sP5) {
            super(4);
            this.f30644g = interfaceC32626Ei5;
            this.f30645h = interfaceC48627sP5;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, AY2 ay2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC7907Te, ay2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC7907Te AnimatedContent, AY2 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Object obj;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(it, "it");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1242637642, i, -1, "com.google.accompanist.navigation.animation.AnimatedNavHost.<anonymous> (AnimatedNavHost.kt:214)");
            }
            List m88302c = C6817Qe.m88302c(this.f30645h);
            ListIterator listIterator = m88302c.listIterator(m88302c.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (Intrinsics.areEqual(it, (AY2) obj)) {
                    break;
                }
            }
            AY2 ay2 = (AY2) obj;
            if (ay2 != null) {
                BY2.m113878a(ay2, this.f30644g, C43575jt0.m29791b(interfaceC32720Et0, 158545465, true, new C6827a(ay2, AnimatedContent)), interfaceC32720Et0, 456);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$j */
    /* loaded from: classes5.dex */
    public static final class C6828j extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OY2 f30648g;

        /* renamed from: h */
        public final /* synthetic */ JY2 f30649h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f30650i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4360K9 f30651j;

        /* renamed from: k */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30652k;

        /* renamed from: l */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30653l;

        /* renamed from: m */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30654m;

        /* renamed from: n */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30655n;

        /* renamed from: o */
        public final /* synthetic */ int f30656o;

        /* renamed from: p */
        public final /* synthetic */ int f30657p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6828j(OY2 oy2, JY2 jy2, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 interfaceC4360K9, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function12, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function13, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function14, int i, int i2) {
            super(2);
            this.f30648g = oy2;
            this.f30649h = jy2;
            this.f30650i = interfaceC41563gV2;
            this.f30651j = interfaceC4360K9;
            this.f30652k = function1;
            this.f30653l = function12;
            this.f30654m = function13;
            this.f30655n = function14;
            this.f30656o = i;
            this.f30657p = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C6817Qe.m88304a(this.f30648g, this.f30649h, this.f30650i, this.f30651j, this.f30652k, this.f30653l, this.f30654m, this.f30655n, interfaceC32720Et0, this.f30656o | 1, this.f30657p);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$k */
    /* loaded from: classes5.dex */
    public static final class C6829k extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OY2 f30658g;

        /* renamed from: h */
        public final /* synthetic */ JY2 f30659h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f30660i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4360K9 f30661j;

        /* renamed from: k */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30662k;

        /* renamed from: l */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30663l;

        /* renamed from: m */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30664m;

        /* renamed from: n */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30665n;

        /* renamed from: o */
        public final /* synthetic */ int f30666o;

        /* renamed from: p */
        public final /* synthetic */ int f30667p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6829k(OY2 oy2, JY2 jy2, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 interfaceC4360K9, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function12, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function13, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function14, int i, int i2) {
            super(2);
            this.f30658g = oy2;
            this.f30659h = jy2;
            this.f30660i = interfaceC41563gV2;
            this.f30661j = interfaceC4360K9;
            this.f30662k = function1;
            this.f30663l = function12;
            this.f30664m = function13;
            this.f30665n = function14;
            this.f30666o = i;
            this.f30667p = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C6817Qe.m88304a(this.f30658g, this.f30659h, this.f30660i, this.f30661j, this.f30662k, this.f30663l, this.f30664m, this.f30665n, interfaceC32720Et0, this.f30666o | 1, this.f30667p);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$l */
    /* loaded from: classes5.dex */
    public static final class C6830l extends Lambda implements Function1<C6080Oe<AY2>, AbstractC37500Ze1> {

        /* renamed from: g */
        public final /* synthetic */ C5048Le f30668g;

        /* renamed from: h */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30669h;

        /* renamed from: i */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC37500Ze1> f30670i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6830l(C5048Le c5048Le, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function12) {
            super(1);
            this.f30668g = c5048Le;
            this.f30669h = function1;
            this.f30670i = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC37500Ze1 invoke(C6080Oe<AY2> c6080Oe) {
            AbstractC37500Ze1 abstractC37500Ze1;
            AbstractC37500Ze1 abstractC37500Ze12;
            Intrinsics.checkNotNullParameter(c6080Oe, "$this$null");
            HY2 m115582f = c6080Oe.mo91780b().m115582f();
            Intrinsics.checkNotNull(m115582f, "null cannot be cast to non-null type com.google.accompanist.navigation.animation.AnimatedComposeNavigator.Destination");
            C5048Le.C5050b c5050b = (C5048Le.C5050b) m115582f;
            AbstractC37500Ze1 abstractC37500Ze13 = null;
            if (this.f30668g.m96524m().getValue().booleanValue()) {
                Iterator<HY2> it = HY2.f13508k.m103766c(c5050b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Function1<C6080Oe<AY2>, AbstractC37500Ze1> function1 = C6817Qe.m88298g().get(it.next().m103771w());
                    if (function1 != null) {
                        abstractC37500Ze12 = function1.invoke(c6080Oe);
                        continue;
                    } else {
                        abstractC37500Ze12 = null;
                        continue;
                    }
                    if (abstractC37500Ze12 != null) {
                        abstractC37500Ze13 = abstractC37500Ze12;
                        break;
                    }
                }
                if (abstractC37500Ze13 == null) {
                    return this.f30669h.invoke(c6080Oe);
                }
                return abstractC37500Ze13;
            }
            Iterator<HY2> it2 = HY2.f13508k.m103766c(c5050b).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Function1<C6080Oe<AY2>, AbstractC37500Ze1> function12 = C6817Qe.m88300e().get(it2.next().m103771w());
                if (function12 != null) {
                    abstractC37500Ze1 = function12.invoke(c6080Oe);
                    continue;
                } else {
                    abstractC37500Ze1 = null;
                    continue;
                }
                if (abstractC37500Ze1 != null) {
                    abstractC37500Ze13 = abstractC37500Ze1;
                    break;
                }
            }
            if (abstractC37500Ze13 == null) {
                return this.f30670i.invoke(c6080Oe);
            }
            return abstractC37500Ze13;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Qe$m */
    /* loaded from: classes5.dex */
    public static final class C6831m extends Lambda implements Function1<C6080Oe<AY2>, AbstractC41687gi1> {

        /* renamed from: g */
        public final /* synthetic */ C5048Le f30671g;

        /* renamed from: h */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30672h;

        /* renamed from: i */
        public final /* synthetic */ Function1<C6080Oe<AY2>, AbstractC41687gi1> f30673i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6831m(C5048Le c5048Le, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function12) {
            super(1);
            this.f30671g = c5048Le;
            this.f30672h = function1;
            this.f30673i = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC41687gi1 invoke(C6080Oe<AY2> c6080Oe) {
            AbstractC41687gi1 abstractC41687gi1;
            AbstractC41687gi1 abstractC41687gi12;
            Intrinsics.checkNotNullParameter(c6080Oe, "$this$null");
            HY2 m115582f = c6080Oe.getInitialState().m115582f();
            Intrinsics.checkNotNull(m115582f, "null cannot be cast to non-null type com.google.accompanist.navigation.animation.AnimatedComposeNavigator.Destination");
            C5048Le.C5050b c5050b = (C5048Le.C5050b) m115582f;
            AbstractC41687gi1 abstractC41687gi13 = null;
            if (this.f30671g.m96524m().getValue().booleanValue()) {
                Iterator<HY2> it = HY2.f13508k.m103766c(c5050b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Function1<C6080Oe<AY2>, AbstractC41687gi1> function1 = C6817Qe.m88297h().get(it.next().m103771w());
                    if (function1 != null) {
                        abstractC41687gi12 = function1.invoke(c6080Oe);
                        continue;
                    } else {
                        abstractC41687gi12 = null;
                        continue;
                    }
                    if (abstractC41687gi12 != null) {
                        abstractC41687gi13 = abstractC41687gi12;
                        break;
                    }
                }
                if (abstractC41687gi13 == null) {
                    return this.f30672h.invoke(c6080Oe);
                }
                return abstractC41687gi13;
            }
            Iterator<HY2> it2 = HY2.f13508k.m103766c(c5050b).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Function1<C6080Oe<AY2>, AbstractC41687gi1> function12 = C6817Qe.m88299f().get(it2.next().m103771w());
                if (function12 != null) {
                    abstractC41687gi1 = function12.invoke(c6080Oe);
                    continue;
                } else {
                    abstractC41687gi1 = null;
                    continue;
                }
                if (abstractC41687gi1 != null) {
                    abstractC41687gi13 = abstractC41687gi1;
                    break;
                }
            }
            if (abstractC41687gi13 == null) {
                return this.f30673i.invoke(c6080Oe);
            }
            return abstractC41687gi13;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Qe$n */
    /* loaded from: classes5.dex */
    public static final class C6832n implements InterfaceC32730Eu1<List<? extends AY2>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f30674b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: Qe$n$a */
        /* loaded from: classes5.dex */
        public static final class C6833a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f30675b;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.google.accompanist.navigation.animation.AnimatedNavHostKt$AnimatedNavHost$lambda$4$$inlined$map$1$2", m28418f = "AnimatedNavHost.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: Qe$n$a$a */
            /* loaded from: classes5.dex */
            public static final class C6834a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f30676h;

                /* renamed from: i */
                public int f30677i;

                public C6834a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f30676h = obj;
                    this.f30677i |= Integer.MIN_VALUE;
                    return C6833a.this.emit(null, this);
                }
            }

            public C6833a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                this.f30675b = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C6834a c6834a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C6834a) {
                    c6834a = (C6834a) continuation;
                    int i2 = c6834a.f30677i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c6834a.f30677i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c6834a.f30676h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c6834a.f30677i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f30675b;
                            ArrayList arrayList = new ArrayList();
                            for (T t : (List) obj) {
                                if (Intrinsics.areEqual(((AY2) t).m115582f().m103773u(), "animatedComposable")) {
                                    arrayList.add(t);
                                }
                            }
                            c6834a.f30677i = 1;
                            if (interfaceC33198Gu1.emit(arrayList, c6834a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c6834a = new C6834a(continuation);
                Object obj22 = c6834a.f30676h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c6834a.f30677i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C6832n(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f30674b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super List<? extends AY2>> interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f30674b.collect(new C6833a(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* renamed from: a */
    public static final void m88304a(OY2 navController, JY2 graph, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 interfaceC4360K9, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function12, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function13, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function14, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function15;
        int i3;
        int i4;
        Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function16;
        List emptyList;
        Object lastOrNull;
        Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function17;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(graph, "graph");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1872959790);
        InterfaceC41563gV2 interfaceC41563gV22 = (i2 & 4) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        InterfaceC4360K9 m99141e = (i2 & 8) != 0 ? InterfaceC4360K9.f19170a.m99141e() : interfaceC4360K9;
        Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function18 = (i2 & 16) != 0 ? C6822e.f30637g : function1;
        Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function19 = (i2 & 32) != 0 ? C6823f.f30638g : function12;
        if ((i2 & 64) != 0) {
            i3 = i & (-3670017);
            function15 = function18;
        } else {
            function15 = function13;
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            i4 = i3 & (-29360129);
            function16 = function19;
        } else {
            i4 = i3;
            function16 = function14;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1872959790, i4, -1, "com.google.accompanist.navigation.animation.AnimatedNavHost (AnimatedNavHost.kt:118)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 8);
        if (m18429a != null) {
            InterfaceC39270cf3 m31645a = C43004iv2.f91709a.m31645a(mo89518u, 8);
            OnBackPressedDispatcher onBackPressedDispatcher = m31645a != null ? m31645a.getOnBackPressedDispatcher() : null;
            navController.mo92021h0(lifecycleOwner);
            C36920Wr6 viewModelStore = m18429a.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStoreOwner.viewModelStore");
            navController.mo92019j0(viewModelStore);
            if (onBackPressedDispatcher != null) {
                navController.mo92020i0(onBackPressedDispatcher);
            }
            navController.m110224f0(graph);
            InterfaceC32626Ei5 m104873a = C33094Gi5.m104873a(mo89518u, 0);
            AbstractC39507d13 m35381e = navController.m110257E().m35381e("animatedComposable");
            C5048Le c5048Le = m35381e instanceof C5048Le ? (C5048Le) m35381e : null;
            if (c5048Le == null) {
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                    return;
                }
                mo89512w.mo20405a(new C6828j(navController, graph, interfaceC41563gV22, m99141e, function18, function19, function15, function16, i, i2));
                return;
            }
            InterfaceC49220tP5<List<AY2>> m110255G = navController.m110255G();
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(m110255G);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C6832n(navController.m110255G());
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            InterfaceC48627sP5 m105206a = GM5.m105206a((InterfaceC32730Eu1) mo89635G, emptyList, null, mo89518u, 8, 2);
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) m88302c(m105206a));
            AY2 ay2 = (AY2) lastOrNull;
            mo89518u.mo89638F(92481982);
            if (ay2 != null) {
                mo89518u.mo89638F(1618982084);
                boolean mo89539n2 = mo89518u.mo89539n(c5048Le) | mo89518u.mo89539n(function15) | mo89518u.mo89539n(function18);
                Object mo89635G2 = mo89518u.mo89635G();
                if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G2 = new C6830l(c5048Le, function15, function18);
                    mo89518u.mo89503z(mo89635G2);
                }
                mo89518u.mo89605Q();
                Function1 function110 = (Function1) mo89635G2;
                mo89518u.mo89638F(1618982084);
                boolean mo89539n3 = mo89518u.mo89539n(c5048Le) | mo89518u.mo89539n(function16) | mo89518u.mo89539n(function19);
                Object mo89635G3 = mo89518u.mo89635G();
                if (mo89539n3 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G3 = new C6831m(c5048Le, function16, function19);
                    mo89518u.mo89503z(mo89635G3);
                }
                mo89518u.mo89605Q();
                Function1 function111 = (Function1) mo89635G3;
                function17 = function16;
                F96 m101071e = J96.m101071e(ay2, "entry", mo89518u, 56, 0);
                Object[] objArr = {c5048Le, m105206a, function110, function111};
                mo89518u.mo89638F(-568225417);
                int i5 = 0;
                boolean z = false;
                for (int i6 = 4; i5 < i6; i6 = 4) {
                    z |= mo89518u.mo89539n(objArr[i5]);
                    i5++;
                }
                Object mo89635G4 = mo89518u.mo89635G();
                if (z || mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G4 = new C6824g(c5048Le, function110, function111, m105206a);
                    mo89518u.mo89503z(mo89635G4);
                }
                mo89518u.mo89605Q();
                C5048Le c5048Le2 = c5048Le;
                C5326Me.m95100a(m101071e, interfaceC41563gV22, mo89635G4, m99141e, C6825h.f30643g, C43575jt0.m29791b(mo89518u, 1242637642, true, new C6826i(m104873a, m105206a)), mo89518u, ((i4 >> 3) & 112) | 221184 | (i4 & 7168), 0);
                if (Intrinsics.areEqual(m101071e.m107535g(), m101071e.m107529m())) {
                    for (AY2 ay22 : m88302c(m105206a)) {
                        c5048Le2.m96523n(ay22);
                    }
                }
            } else {
                function17 = function16;
            }
            mo89518u.mo89605Q();
            AbstractC39507d13 m35381e2 = navController.m110257E().m35381e("dialog");
            C51382x31 c51382x31 = m35381e2 instanceof C51382x31 ? (C51382x31) m35381e2 : null;
            if (c51382x31 == null) {
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                InterfaceC36874Wm5 mo89512w2 = mo89518u.mo89512w();
                if (mo89512w2 == null) {
                    return;
                }
                mo89512w2.mo20405a(new C6829k(navController, graph, interfaceC41563gV22, m99141e, function18, function19, function15, function17, i, i2));
                return;
            }
            C47826r31.m16565a(c51382x31, mo89518u, C51382x31.f117048d);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w3 = mo89518u.mo89512w();
            if (mo89512w3 == null) {
                return;
            }
            mo89512w3.mo20405a(new C6818a(navController, graph, interfaceC41563gV22, m99141e, function18, function19, function15, function17, i, i2));
            return;
        }
        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
    }

    /* renamed from: b */
    public static final void m88303b(OY2 navController, String startDestination, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 interfaceC4360K9, String str, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function1, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function12, Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function13, Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function14, Function1<? super KY2, Unit> builder, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function15;
        int i3;
        int i4;
        Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function16;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1786657914);
        InterfaceC41563gV2 interfaceC41563gV22 = (i2 & 4) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        InterfaceC4360K9 m99141e = (i2 & 8) != 0 ? InterfaceC4360K9.f19170a.m99141e() : interfaceC4360K9;
        String str2 = (i2 & 16) != 0 ? null : str;
        Function1<? super C6080Oe<AY2>, ? extends AbstractC37500Ze1> function17 = (i2 & 32) != 0 ? C6819b.f30623g : function1;
        Function1<? super C6080Oe<AY2>, ? extends AbstractC41687gi1> function18 = (i2 & 64) != 0 ? C6820c.f30624g : function12;
        if ((i2 & 128) != 0) {
            i3 = i & (-29360129);
            function15 = function17;
        } else {
            function15 = function13;
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            i4 = i3 & (-234881025);
            function16 = function18;
        } else {
            i4 = i3;
            function16 = function14;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1786657914, i4, -1, "com.google.accompanist.navigation.animation.AnimatedNavHost (AnimatedNavHost.kt:74)");
        }
        mo89518u.mo89638F(1618982084);
        boolean mo89539n = mo89518u.mo89539n(str2) | mo89518u.mo89539n(startDestination) | mo89518u.mo89539n(builder);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            KY2 ky2 = new KY2(navController.m110257E(), startDestination, str2);
            builder.invoke(ky2);
            mo89635G = ky2.m98781d();
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        int i5 = i4 >> 3;
        m88304a(navController, (JY2) mo89635G, interfaceC41563gV22, m99141e, function17, function18, function15, function16, mo89518u, (i4 & 896) | 72 | (i4 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new C6821d(navController, startDestination, interfaceC41563gV22, m99141e, str2, function17, function18, function15, function16, builder, i, i2));
    }

    /* renamed from: c */
    public static final List<AY2> m88302c(InterfaceC48627sP5<? extends List<AY2>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* renamed from: e */
    public static final Map<String, Function1<C6080Oe<AY2>, AbstractC37500Ze1>> m88300e() {
        return f30609a;
    }

    /* renamed from: f */
    public static final Map<String, Function1<C6080Oe<AY2>, AbstractC41687gi1>> m88299f() {
        return f30610b;
    }

    /* renamed from: g */
    public static final Map<String, Function1<C6080Oe<AY2>, AbstractC37500Ze1>> m88298g() {
        return f30611c;
    }

    /* renamed from: h */
    public static final Map<String, Function1<C6080Oe<AY2>, AbstractC41687gi1>> m88297h() {
        return f30612d;
    }
}
