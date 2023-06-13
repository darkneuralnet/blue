package p000;

import androidx.compose.p003ui.draw.C11289a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC34649Mz3;
import p000.C46390oe0;
import p000.C48841sm0;
import p000.C5016LW;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a1\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0012\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002\u001a:\u0010\u001d\u001a\u00020\u0014*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u001aW\u0010#\u001a\u00020\u0014*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001aA\u0010&\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a(\u0010,\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a\u0018\u0010.\u001a\u00020*2\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0002\u001a!\u00101\u001a\u00020/*\u00020/2\u0006\u00100\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, m28432d2 = {"LgV2;", "LeZ;", "border", "Lhy5;", "shape", "f", "Lk61;", "width", "Lpm0;", "color", "g", "(LgV2;FJLhy5;)LgV2;", "La30;", "brush", "h", "(LgV2;FLa30;Lhy5;)LgV2;", "Lkt4;", "LbZ;", "o", "Le80;", "LH61;", "k", "borderCacheRef", "LMz3$a;", "outline", "", "fillArea", "", "strokeWidth", "l", "LMz3$c;", "LCe3;", "topLeft", "LxB5;", "borderSize", "n", "(Le80;Lkt4;La30;LMz3$c;JJZF)LH61;", "strokeWidthPx", "m", "(Le80;La30;JJZF)LH61;", "LcJ3;", "targetPath", "LWb5;", "roundedRect", "j", "widthPx", "i", "LLC0;", "value", "p", "(JF)J", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 5 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n135#2:460\n1#3:461\n1#3:487\n181#4,25:462\n206#4,4:488\n215#4,6:501\n221#4:528\n222#4,2:537\n558#5,9:492\n567#5,8:529\n120#6,2:507\n173#6,6:509\n261#6,11:515\n122#6,2:526\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n149#1:460\n290#1:487\n290#1:462,25\n290#1:488,4\n290#1:501,6\n290#1:528\n290#1:537,2\n290#1:492,9\n290#1:529,8\n296#1:507,2\n304#1:509,6\n304#1:515,11\n296#1:526,2\n*E\n"})
/* renamed from: dZ */
/* loaded from: classes.dex */
public final class C19783dZ {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$border$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,459:1\n25#2:460\n1114#3,6:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$border$2\n*L\n98#1:460\n98#1:461,6\n*E\n"})
    /* renamed from: dZ$a */
    /* loaded from: classes.dex */
    public static final class C19784a extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ float f76762g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC42444hy5 f76763h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC37727a30 f76764i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: dZ$a$a */
        /* loaded from: classes.dex */
        public static final class C19785a extends Lambda implements Function1<C40166e80, H61> {

            /* renamed from: g */
            public final /* synthetic */ float f76765g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC42444hy5 f76766h;

            /* renamed from: i */
            public final /* synthetic */ C44172kt4<C12444bZ> f76767i;

            /* renamed from: j */
            public final /* synthetic */ AbstractC37727a30 f76768j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19785a(float f, InterfaceC42444hy5 interfaceC42444hy5, C44172kt4<C12444bZ> c44172kt4, AbstractC37727a30 abstractC37727a30) {
                super(1);
                this.f76765g = f;
                this.f76766h = interfaceC42444hy5;
                this.f76767i = c44172kt4;
                this.f76768j = abstractC37727a30;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final H61 invoke(C40166e80 drawWithCache) {
                boolean z;
                float ceil;
                boolean z2;
                Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                if (drawWithCache.mo3411T0(this.f76765g) >= 0.0f && C51465xB5.m5731h(drawWithCache.m43232h()) > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return C19783dZ.m44151k(drawWithCache);
                }
                if (C43705k61.m29301i(this.f76765g, C43705k61.f93903c.m29297a())) {
                    ceil = 1.0f;
                } else {
                    ceil = (float) Math.ceil(drawWithCache.mo3411T0(this.f76765g));
                }
                float f = 2;
                float min = Math.min(ceil, (float) Math.ceil(C51465xB5.m5731h(drawWithCache.m43232h()) / f));
                float f2 = min / f;
                long m104938a = C33056Ge3.m104938a(f2, f2);
                long m112663a = CB5.m112663a(C51465xB5.m5730i(drawWithCache.m43232h()) - min, C51465xB5.m5732g(drawWithCache.m43232h()) - min);
                if (f * min > C51465xB5.m5731h(drawWithCache.m43232h())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AbstractC34649Mz3 mo35430a = this.f76766h.mo35430a(drawWithCache.m43232h(), drawWithCache.getLayoutDirection(), drawWithCache);
                if (mo35430a instanceof AbstractC34649Mz3.C5445a) {
                    return C19783dZ.m44150l(drawWithCache, this.f76767i, this.f76768j, (AbstractC34649Mz3.C5445a) mo35430a, z2, min);
                }
                if (mo35430a instanceof AbstractC34649Mz3.C5447c) {
                    return C19783dZ.m44148n(drawWithCache, this.f76767i, this.f76768j, (AbstractC34649Mz3.C5447c) mo35430a, m104938a, m112663a, z2, min);
                }
                if (mo35430a instanceof AbstractC34649Mz3.C5446b) {
                    return C19783dZ.m44149m(drawWithCache, this.f76768j, m104938a, m112663a, z2, min);
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19784a(float f, InterfaceC42444hy5 interfaceC42444hy5, AbstractC37727a30 abstractC37727a30) {
            super(3);
            this.f76762g = f;
            this.f76763h = interfaceC42444hy5;
            this.f76764i = abstractC37727a30;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m44145a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-1498088849);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1498088849, i, -1, "androidx.compose.foundation.border.<anonymous> (Border.kt:93)");
            }
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C44172kt4();
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 mo39266t0 = composed.mo39266t0(C11289a.m68866b(InterfaceC41563gV2.f82354b0, new C19785a(this.f76762g, this.f76763h, (C44172kt4) mo89635G, this.f76764i)));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return mo39266t0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m44145a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n1#1,170:1\n150#2,10:171\n*E\n"})
    /* renamed from: dZ$b */
    /* loaded from: classes.dex */
    public static final class C19786b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f76769g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC37727a30 f76770h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC42444hy5 f76771i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19786b(float f, AbstractC37727a30 abstractC37727a30, InterfaceC42444hy5 interfaceC42444hy5) {
            super(1);
            this.f76769g = f;
            this.f76770h = abstractC37727a30;
            this.f76771i = interfaceC42444hy5;
        }

        /* renamed from: a */
        public final void m44143a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("border");
            s42.m86038a().m104824a("width", C43705k61.m29306d(this.f76769g));
            if (this.f76770h instanceof C46831pN5) {
                s42.m86038a().m104824a("color", C47063pm0.m18747i(((C46831pN5) this.f76770h).m19361b()));
                s42.m86036c(C47063pm0.m18747i(((C46831pN5) this.f76770h).m19361b()));
            } else {
                s42.m86038a().m104824a("brush", this.f76770h);
            }
            s42.m86038a().m104824a("shape", this.f76771i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m44143a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LiA0;", "", C17296a.f69688o, "(LiA0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dZ$c */
    /* loaded from: classes.dex */
    public static final class C19787c extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

        /* renamed from: g */
        public static final C19787c f76772g = new C19787c();

        public C19787c() {
            super(1);
        }

        /* renamed from: a */
        public final void m44142a(InterfaceC42558iA0 onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.mo34387n0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
            m44142a(interfaceC42558iA0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LiA0;", "", C17296a.f69688o, "(LiA0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dZ$d */
    /* loaded from: classes.dex */
    public static final class C19788d extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC34649Mz3.C5445a f76773g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC37727a30 f76774h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19788d(AbstractC34649Mz3.C5445a c5445a, AbstractC37727a30 abstractC37727a30) {
            super(1);
            this.f76773g = c5445a;
            this.f76774h = abstractC37727a30;
        }

        /* renamed from: a */
        public final void m44141a(InterfaceC42558iA0 onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.mo34387n0();
            I61.m102954J0(onDrawWithContent, this.f76773g.m94528a(), this.f76774h, 0.0f, null, null, 0, 60, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
            m44141a(interfaceC42558iA0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LiA0;", "", C17296a.f69688o, "(LiA0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawGenericBorder$3\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n120#2,4:460\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawGenericBorder$3\n*L\n317#1:460,4\n*E\n"})
    /* renamed from: dZ$e */
    /* loaded from: classes.dex */
    public static final class C19789e extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C35055Os4 f76775g;

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<MW1> f76776h;

        /* renamed from: i */
        public final /* synthetic */ long f76777i;

        /* renamed from: j */
        public final /* synthetic */ C48841sm0 f76778j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19789e(C35055Os4 c35055Os4, Ref.ObjectRef<MW1> objectRef, long j, C48841sm0 c48841sm0) {
            super(1);
            this.f76775g = c35055Os4;
            this.f76776h = objectRef;
            this.f76777i = j;
            this.f76778j = c48841sm0;
        }

        /* renamed from: a */
        public final void m44140a(InterfaceC42558iA0 onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.mo34387n0();
            float m91258i = this.f76775g.m91258i();
            float m91255l = this.f76775g.m91255l();
            Ref.ObjectRef<MW1> objectRef = this.f76776h;
            long j = this.f76777i;
            C48841sm0 c48841sm0 = this.f76778j;
            onDrawWithContent.mo20750d0().mo20722c().mo19027b(m91258i, m91255l);
            I61.m102953K0(onDrawWithContent, objectRef.element, 0L, j, 0L, 0L, 0.0f, null, c48841sm0, 0, 0, 890, null);
            onDrawWithContent.mo20750d0().mo20722c().mo19027b(-m91258i, -m91255l);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
            m44140a(interfaceC42558iA0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LiA0;", "", C17296a.f69688o, "(LiA0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dZ$f */
    /* loaded from: classes.dex */
    public static final class C19790f extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC37727a30 f76779g;

        /* renamed from: h */
        public final /* synthetic */ long f76780h;

        /* renamed from: i */
        public final /* synthetic */ long f76781i;

        /* renamed from: j */
        public final /* synthetic */ J61 f76782j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19790f(AbstractC37727a30 abstractC37727a30, long j, long j2, J61 j61) {
            super(1);
            this.f76779g = abstractC37727a30;
            this.f76780h = j;
            this.f76781i = j2;
            this.f76782j = j61;
        }

        /* renamed from: a */
        public final void m44139a(InterfaceC42558iA0 onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.mo34387n0();
            I61.m102948b0(onDrawWithContent, this.f76779g, this.f76780h, this.f76781i, 0.0f, this.f76782j, null, 0, 104, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
            m44139a(interfaceC42558iA0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LiA0;", "", C17296a.f69688o, "(LiA0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawRoundRectBorder$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n221#2:460\n261#2,11:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawRoundRectBorder$1\n*L\n353#1:460\n353#1:461,11\n*E\n"})
    /* renamed from: dZ$g */
    /* loaded from: classes.dex */
    public static final class C19791g extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f76783g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC37727a30 f76784h;

        /* renamed from: i */
        public final /* synthetic */ long f76785i;

        /* renamed from: j */
        public final /* synthetic */ float f76786j;

        /* renamed from: k */
        public final /* synthetic */ float f76787k;

        /* renamed from: l */
        public final /* synthetic */ long f76788l;

        /* renamed from: m */
        public final /* synthetic */ long f76789m;

        /* renamed from: n */
        public final /* synthetic */ KS5 f76790n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19791g(boolean z, AbstractC37727a30 abstractC37727a30, long j, float f, float f2, long j2, long j3, KS5 ks5) {
            super(1);
            this.f76783g = z;
            this.f76784h = abstractC37727a30;
            this.f76785i = j;
            this.f76786j = f;
            this.f76787k = f2;
            this.f76788l = j2;
            this.f76789m = j3;
            this.f76790n = ks5;
        }

        /* renamed from: a */
        public final void m44138a(InterfaceC42558iA0 onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.mo34387n0();
            if (this.f76783g) {
                I61.m102950W(onDrawWithContent, this.f76784h, 0L, 0L, this.f76785i, 0.0f, null, null, 0, 246, null);
                return;
            }
            float m97601d = LC0.m97601d(this.f76785i);
            float f = this.f76786j;
            if (m97601d < f) {
                float f2 = this.f76787k;
                float m5730i = C51465xB5.m5730i(onDrawWithContent.mo96360h()) - this.f76787k;
                float m5732g = C51465xB5.m5732g(onDrawWithContent.mo96360h()) - this.f76787k;
                int m86405a = C35681Rk0.f32493a.m86405a();
                AbstractC37727a30 abstractC37727a30 = this.f76784h;
                long j = this.f76785i;
                C61 mo20750d0 = onDrawWithContent.mo20750d0();
                long mo20721h = mo20750d0.mo20721h();
                mo20750d0.mo20724a().mo25245v();
                mo20750d0.mo20722c().mo19028a(f2, f2, m5730i, m5732g, m86405a);
                I61.m102950W(onDrawWithContent, abstractC37727a30, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
                mo20750d0.mo20724a().mo25251p();
                mo20750d0.mo20723b(mo20721h);
                return;
            }
            I61.m102950W(onDrawWithContent, this.f76784h, this.f76788l, this.f76789m, C19783dZ.m44146p(this.f76785i, f), 0.0f, this.f76790n, null, 0, 208, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
            m44138a(interfaceC42558iA0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LiA0;", "", C17296a.f69688o, "(LiA0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dZ$h */
    /* loaded from: classes.dex */
    public static final class C19792h extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39067cJ3 f76791g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC37727a30 f76792h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19792h(InterfaceC39067cJ3 interfaceC39067cJ3, AbstractC37727a30 abstractC37727a30) {
            super(1);
            this.f76791g = interfaceC39067cJ3;
            this.f76792h = abstractC37727a30;
        }

        /* renamed from: a */
        public final void m44137a(InterfaceC42558iA0 onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.mo34387n0();
            I61.m102954J0(onDrawWithContent, this.f76791g, this.f76792h, 0.0f, null, null, 0, 60, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
            m44137a(interfaceC42558iA0);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: f */
    public static final InterfaceC41563gV2 m44156f(InterfaceC41563gV2 interfaceC41563gV2, C20064eZ border, InterfaceC42444hy5 shape) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m44154h(interfaceC41563gV2, border.m42791b(), border.m42792a(), shape);
    }

    /* renamed from: g */
    public static final InterfaceC41563gV2 m44155g(InterfaceC41563gV2 border, float f, long j, InterfaceC42444hy5 shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m44154h(border, f, new C46831pN5(j, null), shape);
    }

    /* renamed from: h */
    public static final InterfaceC41563gV2 m44154h(InterfaceC41563gV2 border, float f, AbstractC37727a30 brush, InterfaceC42444hy5 shape) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (K32.m99301c()) {
            m99303a = new C19786b(f, brush, shape);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(border, m99303a, new C19784a(f, shape, brush));
    }

    /* renamed from: i */
    public static final C36775Wb5 m44153i(float f, C36775Wb5 c36775Wb5) {
        return new C36775Wb5(f, f, c36775Wb5.m78150j() - f, c36775Wb5.m78156d() - f, m44146p(c36775Wb5.m78152h(), f), m44146p(c36775Wb5.m78151i(), f), m44146p(c36775Wb5.m78157c(), f), m44146p(c36775Wb5.m78158b(), f), null);
    }

    /* renamed from: j */
    public static final InterfaceC39067cJ3 m44152j(InterfaceC39067cJ3 interfaceC39067cJ3, C36775Wb5 c36775Wb5, float f, boolean z) {
        interfaceC39067cJ3.reset();
        interfaceC39067cJ3.mo20784g(c36775Wb5);
        if (!z) {
            InterfaceC39067cJ3 m12007a = C28793td.m12007a();
            m12007a.mo20784g(m44153i(f, c36775Wb5));
            interfaceC39067cJ3.mo20782i(interfaceC39067cJ3, m12007a, C47979rJ3.f106848a.m16069a());
        }
        return interfaceC39067cJ3;
    }

    /* renamed from: k */
    public static final H61 m44151k(C40166e80 c40166e80) {
        return c40166e80.m43235d(C19787c.f76772g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
        if (p000.NW1.m93823h(r13, r3) != false) goto L35;
     */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, MW1] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final H61 m44150l(C40166e80 c40166e80, C44172kt4<C12444bZ> c44172kt4, AbstractC37727a30 abstractC37727a30, AbstractC34649Mz3.C5445a c5445a, boolean z, float f) {
        int m93817b;
        C48841sm0 c48841sm0;
        MW1 mw1;
        InterfaceC45204me0 interfaceC45204me0;
        NW1 nw1;
        boolean m93822i;
        ?? r11;
        InterfaceC45204me0 interfaceC45204me02;
        C46390oe0 c46390oe0;
        if (z) {
            return c40166e80.m43235d(new C19788d(c5445a, abstractC37727a30));
        }
        NW1 nw12 = null;
        if (abstractC37727a30 instanceof C46831pN5) {
            m93817b = NW1.f24729b.m93818a();
            c48841sm0 = C48841sm0.C28383a.m13699b(C48841sm0.f109227b, ((C46831pN5) abstractC37727a30).m19361b(), 0, 2, null);
        } else {
            m93817b = NW1.f24729b.m93817b();
            c48841sm0 = null;
        }
        C35055Os4 bounds = c5445a.m94528a().getBounds();
        C12444bZ m44147o = m44147o(c44172kt4);
        InterfaceC39067cJ3 m64369g = m44147o.m64369g();
        m64369g.reset();
        m64369g.mo20783h(bounds);
        m64369g.mo20782i(m64369g, c5445a.m94528a(), C47979rJ3.f106848a.m16069a());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        long m104430a = H52.m104430a((int) Math.ceil(bounds.m91252o()), (int) Math.ceil(bounds.m91259h()));
        mw1 = m44147o.f57686a;
        interfaceC45204me0 = m44147o.f57687b;
        if (mw1 != null) {
            nw1 = NW1.m93825f(mw1.mo93708b());
        } else {
            nw1 = null;
        }
        int m93817b2 = NW1.f24729b.m93817b();
        boolean z2 = false;
        if (nw1 == null) {
            m93822i = false;
        } else {
            m93822i = NW1.m93822i(nw1.m93819l(), m93817b2);
        }
        if (!m93822i) {
            if (mw1 != null) {
                nw12 = NW1.m93825f(mw1.mo93708b());
            }
        }
        z2 = true;
        if (mw1 != null && interfaceC45204me0 != null && C51465xB5.m5730i(c40166e80.m43232h()) <= mw1.getWidth() && C51465xB5.m5732g(c40166e80.m43232h()) <= mw1.getHeight() && z2) {
            r11 = mw1;
            interfaceC45204me02 = interfaceC45204me0;
        } else {
            MW1 m92123b = OW1.m92123b(G52.m105829g(m104430a), G52.m105830f(m104430a), m93817b, false, null, 24, null);
            m44147o.f57686a = m92123b;
            InterfaceC45204me0 m13917a = C48761se0.m13917a(m92123b);
            m44147o.f57687b = m13917a;
            r11 = m92123b;
            interfaceC45204me02 = m13917a;
        }
        c46390oe0 = m44147o.f57688c;
        if (c46390oe0 == null) {
            c46390oe0 = new C46390oe0();
            m44147o.f57688c = c46390oe0;
        }
        C46390oe0 c46390oe02 = c46390oe0;
        long m104428c = H52.m104428c(m104430a);
        EnumC47065pm2 layoutDirection = c40166e80.getLayoutDirection();
        C46390oe0.C27018a m20741o = c46390oe02.m20741o();
        InterfaceC41273g01 m20736a = m20741o.m20736a();
        EnumC47065pm2 m20735b = m20741o.m20735b();
        InterfaceC45204me0 m20734c = m20741o.m20734c();
        long m20733d = m20741o.m20733d();
        C46390oe0.C27018a m20741o2 = c46390oe02.m20741o();
        m20741o2.m20727j(c40166e80);
        m20741o2.m20726k(layoutDirection);
        m20741o2.m20728i(interfaceC45204me02);
        m20741o2.m20725l(m104428c);
        interfaceC45204me02.mo25245v();
        long m18732a = C47063pm0.f104050b.m18732a();
        C5016LW.C5017a c5017a = C5016LW.f21593b;
        I61.m102945z0(c46390oe02, m18732a, 0L, m104428c, 0.0f, null, null, c5017a.m96746a(), 58, null);
        float f2 = -bounds.m91258i();
        float f3 = -bounds.m91255l();
        c46390oe02.mo20750d0().mo20722c().mo19027b(f2, f3);
        I61.m102954J0(c46390oe02, c5445a.m94528a(), abstractC37727a30, 0.0f, new KS5(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f4 = 1;
        float m5730i = (C51465xB5.m5730i(c46390oe02.mo96360h()) + f4) / C51465xB5.m5730i(c46390oe02.mo96360h());
        float m5732g = (C51465xB5.m5732g(c46390oe02.mo96360h()) + f4) / C51465xB5.m5732g(c46390oe02.mo96360h());
        long mo96359l0 = c46390oe02.mo96359l0();
        C61 mo20750d0 = c46390oe02.mo20750d0();
        long mo20721h = mo20750d0.mo20721h();
        mo20750d0.mo20724a().mo25245v();
        mo20750d0.mo20722c().mo19025d(m5730i, m5732g, mo96359l0);
        I61.m102954J0(c46390oe02, m64369g, abstractC37727a30, 0.0f, null, null, c5017a.m96746a(), 28, null);
        mo20750d0.mo20724a().mo25251p();
        mo20750d0.mo20723b(mo20721h);
        c46390oe02.mo20750d0().mo20722c().mo19027b(-f2, -f3);
        interfaceC45204me02.mo25251p();
        C46390oe0.C27018a m20741o3 = c46390oe02.m20741o();
        m20741o3.m20727j(m20736a);
        m20741o3.m20726k(m20735b);
        m20741o3.m20728i(m20734c);
        m20741o3.m20725l(m20733d);
        r11.mo93709a();
        objectRef.element = r11;
        return c40166e80.m43235d(new C19789e(bounds, objectRef, m104430a, c48841sm0));
    }

    /* renamed from: m */
    public static final H61 m44149m(C40166e80 c40166e80, AbstractC37727a30 abstractC37727a30, long j, long j2, boolean z, float f) {
        long j3;
        long j4;
        J61 ks5;
        if (z) {
            j3 = C32120Ce3.f4427b.m111932c();
        } else {
            j3 = j;
        }
        if (z) {
            j4 = c40166e80.m43232h();
        } else {
            j4 = j2;
        }
        if (z) {
            ks5 = C52982zl1.f122162a;
        } else {
            ks5 = new KS5(f, 0.0f, 0, 0, null, 30, null);
        }
        return c40166e80.m43235d(new C19790f(abstractC37727a30, j3, j4, ks5));
    }

    /* renamed from: n */
    public static final H61 m44148n(C40166e80 c40166e80, C44172kt4<C12444bZ> c44172kt4, AbstractC37727a30 abstractC37727a30, AbstractC34649Mz3.C5447c c5447c, long j, long j2, boolean z, float f) {
        if (C37477Zb5.m72899d(c5447c.m94526a())) {
            return c40166e80.m43235d(new C19791g(z, abstractC37727a30, c5447c.m94526a().m78152h(), f / 2, f, j, j2, new KS5(f, 0.0f, 0, 0, null, 30, null)));
        }
        return c40166e80.m43235d(new C19792h(m44152j(m44147o(c44172kt4).m64369g(), c5447c.m94526a(), f, z), abstractC37727a30));
    }

    /* renamed from: o */
    public static final C12444bZ m44147o(C44172kt4<C12444bZ> c44172kt4) {
        C12444bZ m28238a = c44172kt4.m28238a();
        if (m28238a == null) {
            C12444bZ c12444bZ = new C12444bZ(null, null, null, null, 15, null);
            c44172kt4.m28237b(c12444bZ);
            return c12444bZ;
        }
        return m28238a;
    }

    /* renamed from: p */
    public static final long m44146p(long j, float f) {
        return MC0.m95599a(Math.max(0.0f, LC0.m97601d(j) - f), Math.max(0.0f, LC0.m97600e(j) - f));
    }
}
