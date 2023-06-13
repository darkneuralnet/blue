package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Li16;", "", "<init>", "()V", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: i16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42474i16 {

    /* renamed from: a */
    public static final C22861a f86286a = new C22861a(null);

    @Metadata(m28433d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bB\u0010CJK\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010 \u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b \u0010!JC\u0010*\u001a\u00020\u00172\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170'2\b\u0010)\u001a\u0004\u0018\u00010\u001cH\u0001¢\u0006\u0004\b*\u0010+JI\u0010/\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020.2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170'H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100JZ\u00107\u001a\u00020\u001c2\u0006\u00102\u001a\u0002012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170'2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00170'H\u0001ø\u0001\u0001¢\u0006\u0004\b7\u00108JZ\u00109\u001a\u00020\u001c2\u0006\u00102\u001a\u0002012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170'2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00170'H\u0001ø\u0001\u0001¢\u0006\u0004\b9\u00108J3\u0010:\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170'H\u0001¢\u0006\u0004\b:\u0010;J#\u0010@\u001a\u00020>2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006D"}, m28432d2 = {"Li16$a;", "", "LT06;", "textDelegate", "Lkz0;", "constraints", "Lpm2;", "layoutDirection", "Li26;", "prevResultText", "Lkotlin/Triple;", "", "c", "(LT06;JLpm2;Li26;)Lkotlin/Triple;", "Lme0;", "canvas", "LF16;", "value", "LHe3;", "offsetMapping", "textLayoutResult", "LkE3;", "selectionPaint", "", "b", "(Lme0;LF16;LHe3;Li26;LkE3;)V", "Lnm2;", "layoutCoordinates", "La26;", "textInputSession", "", "hasFocus", DateTokenConverter.CONVERTER_KEY, "(LF16;LT06;Li26;Lnm2;La26;ZLHe3;)V", "", "LN91;", "ops", "LP91;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "f", "(Ljava/util/List;LP91;Lkotlin/jvm/functions/Function1;La26;)V", "LCe3;", "position", "Lj26;", "i", "(JLj26;LP91;LHe3;Lkotlin/jvm/functions/Function1;)V", "LU16;", "textInputService", "LGY1;", "imeOptions", "LFY1;", "onImeActionPerformed", "h", "(LU16;LF16;LP91;LGY1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La26;", "g", "e", "(La26;LP91;Lkotlin/jvm/functions/Function1;)V", "Ls26;", "compositionRange", "LA96;", "transformed", C17296a.f69688o, "(JLA96;)LA96;", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: i16$a */
    /* loaded from: classes.dex */
    public static final class C22861a {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "LN91;", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i16$a$a */
        /* loaded from: classes.dex */
        public static final class C22862a extends Lambda implements Function1<List<? extends N91>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ P91 f86287g;

            /* renamed from: h */
            public final /* synthetic */ Function1<F16, Unit> f86288h;

            /* renamed from: i */
            public final /* synthetic */ Ref.ObjectRef<C37723a26> f86289i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C22862a(P91 p91, Function1<? super F16, Unit> function1, Ref.ObjectRef<C37723a26> objectRef) {
                super(1);
                this.f86287g = p91;
                this.f86288h = function1;
                this.f86289i = objectRef;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends N91> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends N91> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C42474i16.f86286a.m35372f(it, this.f86287g, this.f86288h, this.f86289i.element);
            }
        }

        public /* synthetic */ C22861a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final A96 m35377a(long j, A96 transformed) {
            Intrinsics.checkNotNullParameter(transformed, "transformed");
            C1577Df.C1578a c1578a = new C1577Df.C1578a(transformed.m116051b());
            c1578a.m110044c(new GN5(0L, 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, R06.f31395b.m87427d(), (C35335Px5) null, 12287, (DefaultConstructorMarker) null), transformed.m116052a().originalToTransformed(C48413s26.m14832n(j)), transformed.m116052a().originalToTransformed(C48413s26.m14837i(j)));
            return new A96(c1578a.m110035l(), transformed.m116052a());
        }

        @JvmStatic
        /* renamed from: b */
        public final void m35376b(InterfaceC45204me0 canvas, F16 value, InterfaceC33290He3 offsetMapping, C42484i26 textLayoutResult, InterfaceC43783kE3 selectionPaint) {
            int originalToTransformed;
            int originalToTransformed2;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            Intrinsics.checkNotNullParameter(selectionPaint, "selectionPaint");
            if (!C48413s26.m14838h(value.m108103g()) && (originalToTransformed = offsetMapping.originalToTransformed(C48413s26.m14834l(value.m108103g()))) != (originalToTransformed2 = offsetMapping.originalToTransformed(C48413s26.m14835k(value.m108103g())))) {
                canvas.mo25247t(textLayoutResult.m34583y(originalToTransformed, originalToTransformed2), selectionPaint);
            }
            C46635p26.f103035a.m20022a(canvas, textLayoutResult);
        }

        @JvmStatic
        /* renamed from: c */
        public final Triple<Integer, Integer, C42484i26> m35375c(T06 textDelegate, long j, EnumC47065pm2 layoutDirection, C42484i26 c42484i26) {
            Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            C42484i26 m84433m = textDelegate.m84433m(j, layoutDirection, c42484i26);
            return new Triple<>(Integer.valueOf(G52.m105829g(m84433m.m34609A())), Integer.valueOf(G52.m105830f(m84433m.m34609A())), m84433m);
        }

        @JvmStatic
        /* renamed from: d */
        public final void m35374d(F16 value, T06 textDelegate, C42484i26 textLayoutResult, InterfaceC45879nm2 layoutCoordinates, C37723a26 textInputSession, boolean z, InterfaceC33290He3 offsetMapping) {
            C35055Os4 c35055Os4;
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(textInputSession, "textInputSession");
            Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
            if (!z) {
                return;
            }
            int originalToTransformed = offsetMapping.originalToTransformed(C48413s26.m14835k(value.m108103g()));
            if (originalToTransformed < textLayoutResult.m34597k().m40259j().length()) {
                c35055Os4 = textLayoutResult.m34605c(originalToTransformed);
            } else if (originalToTransformed != 0) {
                c35055Os4 = textLayoutResult.m34605c(originalToTransformed - 1);
            } else {
                c35055Os4 = new C35055Os4(0.0f, 0.0f, 1.0f, G52.m105830f(C43067j16.m31239b(textDelegate.m84435k(), textDelegate.m84445a(), textDelegate.m84444b(), null, 0, 24, null)));
            }
            long mo23181y = layoutCoordinates.mo23181y(C33056Ge3.m104938a(c35055Os4.m91258i(), c35055Os4.m91255l()));
            textInputSession.m71960d(C35991Ss4.m84692b(C33056Ge3.m104938a(C32120Ce3.m111944o(mo23181y), C32120Ce3.m111943p(mo23181y)), CB5.m112663a(c35055Os4.m91252o(), c35055Os4.m91259h())));
        }

        @JvmStatic
        /* renamed from: e */
        public final void m35373e(C37723a26 textInputSession, P91 editProcessor, Function1<? super F16, Unit> onValueChange) {
            Intrinsics.checkNotNullParameter(textInputSession, "textInputSession");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            onValueChange.invoke(F16.m108107c(editProcessor.m90632f(), null, 0L, null, 3, null));
            textInputSession.m71963a();
        }

        @JvmStatic
        /* renamed from: f */
        public final void m35372f(List<? extends N91> ops, P91 editProcessor, Function1<? super F16, Unit> onValueChange, C37723a26 c37723a26) {
            Intrinsics.checkNotNullParameter(ops, "ops");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            F16 m90636b = editProcessor.m90636b(ops);
            if (c37723a26 != null) {
                c37723a26.m71958f(null, m90636b);
            }
            onValueChange.invoke(m90636b);
        }

        @JvmStatic
        /* renamed from: g */
        public final C37723a26 m35371g(U16 textInputService, F16 value, P91 editProcessor, GY1 imeOptions, Function1<? super F16, Unit> onValueChange, Function1<? super FY1, Unit> onImeActionPerformed) {
            Intrinsics.checkNotNullParameter(textInputService, "textInputService");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
            return m35370h(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [a26, T] */
        @JvmStatic
        /* renamed from: h */
        public final C37723a26 m35370h(U16 textInputService, F16 value, P91 editProcessor, GY1 imeOptions, Function1<? super F16, Unit> onValueChange, Function1<? super FY1, Unit> onImeActionPerformed) {
            Intrinsics.checkNotNullParameter(textInputService, "textInputService");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? m82104d = textInputService.m82104d(value, imeOptions, new C22862a(editProcessor, onValueChange, objectRef), onImeActionPerformed);
            objectRef.element = m82104d;
            return m82104d;
        }

        @JvmStatic
        /* renamed from: i */
        public final void m35369i(long j, C43077j26 textLayoutResult, P91 editProcessor, InterfaceC33290He3 offsetMapping, Function1<? super F16, Unit> onValueChange) {
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            onValueChange.invoke(F16.m108107c(editProcessor.m90632f(), null, C49006t26.m13201a(offsetMapping.transformedToOriginal(C43077j26.m31226h(textLayoutResult, j, false, 2, null))), null, 5, null));
        }

        private C22861a() {
        }
    }
}
