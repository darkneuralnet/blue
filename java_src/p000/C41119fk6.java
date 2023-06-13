package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b>\u0010?J_\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000426\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\u0003\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u000e\u001a\u00020\t*\u00020\rH\u0014J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0014J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u001526\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\u0003\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR4\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010)\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00108@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010-R+\u00101\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00104R(\u0010;\u001a\u0004\u0018\u00010\u00122\b\u00106\u001a\u0004\u0018\u00010\u00128@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001d\u0010=\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b<\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, m28432d2 = {"Lfk6;", "LnE3;", "", "name", "", "viewportWidth", "viewportHeight", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "content", C17296a.f69688o, "(Ljava/lang/String;FFLkotlin/jvm/functions/Function4;LEt0;I)V", "LI61;", "onDraw", "alpha", "", "applyAlpha", "Lsm0;", "colorFilter", "applyColorFilter", "LYt0;", "parent", "composable", "LXt0;", DateTokenConverter.CONVERTER_KEY, "(LYt0;Lkotlin/jvm/functions/Function4;)LXt0;", "LxB5;", "<set-?>", "b", "LEX2;", "f", "()J", "k", "(J)V", "size", "c", "e", "()Z", "h", "(Z)V", "autoMirror", "LTj6;", "LTj6;", "vector", "LXt0;", "composition", "g", "i", "isDirty", "F", "currentAlpha", "Lsm0;", "currentColorFilter", "value", "getIntrinsicColorFilter$ui_release", "()Lsm0;", "j", "(Lsm0;)V", "intrinsicColorFilter", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n76#2:421\n102#2,2:422\n76#2:424\n102#2,2:425\n76#2:427\n102#2,2:428\n281#3:430\n282#3:448\n173#4,6:431\n261#4,11:437\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n178#1:421\n178#1:422,2\n180#1:424\n180#1:425,2\n219#1:427\n219#1:428,2\n255#1:430\n255#1:448\n255#1:431,6\n255#1:437,11\n*E\n"})
/* renamed from: fk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41119fk6 extends AbstractC45562nE3 {

    /* renamed from: i */
    public static final int f80533i = 8;

    /* renamed from: b */
    public final EX2 f80534b;

    /* renamed from: c */
    public final EX2 f80535c;

    /* renamed from: d */
    public final C36146Tj6 f80536d;

    /* renamed from: e */
    public InterfaceC37166Xt0 f80537e;

    /* renamed from: f */
    public final EX2 f80538f;

    /* renamed from: g */
    public float f80539g;

    /* renamed from: h */
    public C48841sm0 f80540h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,420:1\n62#2,5:421\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n*L\n239#1:421,5\n*E\n"})
    /* renamed from: fk6$a */
    /* loaded from: classes.dex */
    public static final class C20499a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC37166Xt0 f80541g;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"fk6$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n*L\n1#1,484:1\n240#2,2:485\n*E\n"})
        /* renamed from: fk6$a$a */
        /* loaded from: classes.dex */
        public static final class C20500a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC37166Xt0 f80542a;

            public C20500a(InterfaceC37166Xt0 interfaceC37166Xt0) {
                this.f80542a = interfaceC37166Xt0;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f80542a.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20499a(InterfaceC37166Xt0 interfaceC37166Xt0) {
            super(1);
            this.f80541g = interfaceC37166Xt0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C20500a(this.f80541g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fk6$b */
    /* loaded from: classes.dex */
    public static final class C20501b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f80544h;

        /* renamed from: i */
        public final /* synthetic */ float f80545i;

        /* renamed from: j */
        public final /* synthetic */ float f80546j;

        /* renamed from: k */
        public final /* synthetic */ Function4<Float, Float, InterfaceC32720Et0, Integer, Unit> f80547k;

        /* renamed from: l */
        public final /* synthetic */ int f80548l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20501b(String str, float f, float f2, Function4<? super Float, ? super Float, ? super InterfaceC32720Et0, ? super Integer, Unit> function4, int i) {
            super(2);
            this.f80544h = str;
            this.f80545i = f;
            this.f80546j = f2;
            this.f80547k = function4;
            this.f80548l = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C41119fk6.this.m40930a(this.f80544h, this.f80545i, this.f80546j, this.f80547k, interfaceC32720Et0, C47127ps4.m18626a(this.f80548l | 1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fk6$c */
    /* loaded from: classes.dex */
    public static final class C20502c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function4<Float, Float, InterfaceC32720Et0, Integer, Unit> f80549g;

        /* renamed from: h */
        public final /* synthetic */ C41119fk6 f80550h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20502c(Function4<? super Float, ? super Float, ? super InterfaceC32720Et0, ? super Integer, Unit> function4, C41119fk6 c41119fk6) {
            super(2);
            this.f80549g = function4;
            this.f80550h = c41119fk6;
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
                C35528Qt0.m87816Z(-1916507005, i, -1, "androidx.compose.ui.graphics.vector.VectorPainter.composeVector.<anonymous> (VectorPainter.kt:212)");
            }
            this.f80549g.invoke(Float.valueOf(this.f80550h.f80536d.m83054l()), Float.valueOf(this.f80550h.f80536d.m83055k()), interfaceC32720Et0, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fk6$d */
    /* loaded from: classes.dex */
    public static final class C20503d extends Lambda implements Function0<Unit> {
        public C20503d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C41119fk6.this.m40922i(true);
        }
    }

    public C41119fk6() {
        EX2 m97025e;
        EX2 m97025e2;
        EX2 m97025e3;
        m97025e = LM5.m97025e(C51465xB5.m5736c(C51465xB5.f117175b.m5723b()), null, 2, null);
        this.f80534b = m97025e;
        m97025e2 = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f80535c = m97025e2;
        C36146Tj6 c36146Tj6 = new C36146Tj6();
        c36146Tj6.m83052n(new C20503d());
        this.f80536d = c36146Tj6;
        m97025e3 = LM5.m97025e(Boolean.TRUE, null, 2, null);
        this.f80538f = m97025e3;
        this.f80539g = 1.0f;
    }

    /* renamed from: a */
    public final void m40930a(String name, float f, float f2, Function4<? super Float, ? super Float, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1264894527);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1264894527, i, -1, "androidx.compose.ui.graphics.vector.VectorPainter.RenderVector (VectorPainter.kt:221)");
        }
        C36146Tj6 c36146Tj6 = this.f80536d;
        c36146Tj6.m83051o(name);
        c36146Tj6.m83049q(f);
        c36146Tj6.m83050p(f2);
        InterfaceC37166Xt0 m40927d = m40927d(C52468yt0.m2334d(mo89518u, 0), content);
        Y91.m75536c(m40927d, new C20499a(m40927d), mo89518u, 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C20501b(name, f, f2, content, i));
        }
    }

    @Override // p000.AbstractC45562nE3
    public boolean applyAlpha(float f) {
        this.f80539g = f;
        return true;
    }

    @Override // p000.AbstractC45562nE3
    public boolean applyColorFilter(C48841sm0 c48841sm0) {
        this.f80540h = c48841sm0;
        return true;
    }

    /* renamed from: d */
    public final InterfaceC37166Xt0 m40927d(AbstractC37400Yt0 abstractC37400Yt0, Function4<? super Float, ? super Float, ? super InterfaceC32720Et0, ? super Integer, Unit> function4) {
        InterfaceC37166Xt0 interfaceC37166Xt0 = this.f80537e;
        if (interfaceC37166Xt0 == null || interfaceC37166Xt0.mo44877e()) {
            interfaceC37166Xt0 = C40027du0.m43531a(new C35912Sj6(this.f80536d.m83056j()), abstractC37400Yt0);
        }
        this.f80537e = interfaceC37166Xt0;
        interfaceC37166Xt0.mo44876f(C43575jt0.m29790c(-1916507005, true, new C20502c(function4, this)));
        return interfaceC37166Xt0;
    }

    /* renamed from: e */
    public final boolean m40926e() {
        return ((Boolean) this.f80535c.getValue()).booleanValue();
    }

    /* renamed from: f */
    public final long m40925f() {
        return ((C51465xB5) this.f80534b.getValue()).m5725n();
    }

    /* renamed from: g */
    public final boolean m40924g() {
        return ((Boolean) this.f80538f.getValue()).booleanValue();
    }

    @Override // p000.AbstractC45562nE3
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo116236getIntrinsicSizeNHjbRc() {
        return m40925f();
    }

    /* renamed from: h */
    public final void m40923h(boolean z) {
        this.f80535c.setValue(Boolean.valueOf(z));
    }

    /* renamed from: i */
    public final void m40922i(boolean z) {
        this.f80538f.setValue(Boolean.valueOf(z));
    }

    /* renamed from: j */
    public final void m40921j(C48841sm0 c48841sm0) {
        this.f80536d.m83053m(c48841sm0);
    }

    /* renamed from: k */
    public final void m40920k(long j) {
        this.f80534b.setValue(C51465xB5.m5736c(j));
    }

    @Override // p000.AbstractC45562nE3
    public void onDraw(I61 i61) {
        Intrinsics.checkNotNullParameter(i61, "<this>");
        C36146Tj6 c36146Tj6 = this.f80536d;
        C48841sm0 c48841sm0 = this.f80540h;
        if (c48841sm0 == null) {
            c48841sm0 = c36146Tj6.m83058h();
        }
        if (m40926e() && i61.getLayoutDirection() == EnumC47065pm2.Rtl) {
            long mo96359l0 = i61.mo96359l0();
            C61 mo20750d0 = i61.mo20750d0();
            long mo20721h = mo20750d0.mo20721h();
            mo20750d0.mo20724a().mo25245v();
            mo20750d0.mo20722c().mo19025d(-1.0f, 1.0f, mo96359l0);
            c36146Tj6.m83059g(i61, this.f80539g, c48841sm0);
            mo20750d0.mo20724a().mo25251p();
            mo20750d0.mo20723b(mo20721h);
        } else {
            c36146Tj6.m83059g(i61, this.f80539g, c48841sm0);
        }
        if (m40924g()) {
            m40922i(false);
        }
    }
}
