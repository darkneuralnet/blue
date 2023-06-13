package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010(\u001a\u00020!\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R.\u0010.\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b\u001b\u0010+\"\u0004\b,\u0010-R+\u00102\u001a\u00020/8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b)\u0010\u0006\"\u0004\b0\u00101R+\u00106\u001a\u0002038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u00101R+\u0010<\u001a\u00020\n2\u0006\u00107\u001a\u00020\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u00108\u001a\u0004\b\u0003\u00109\"\u0004\b:\u0010;R+\u0010>\u001a\u00020\n2\u0006\u00107\u001a\u00020\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u00108\u001a\u0004\b\u0013\u00109\"\u0004\b=\u0010;\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, m28432d2 = {"LF26;", "", "", C17296a.f69688o, "J", "h", "()J", "selectableId", "Lkotlin/Function1;", "Li26;", "", "b", "Lkotlin/jvm/functions/Function1;", "e", "()Lkotlin/jvm/functions/Function1;", "n", "(Lkotlin/jvm/functions/Function1;)V", "onTextLayout", "LFr5;", "c", "LFr5;", "g", "()LFr5;", "p", "(LFr5;)V", "selectable", "Lnm2;", DateTokenConverter.CONVERTER_KEY, "Lnm2;", "()Lnm2;", "k", "(Lnm2;)V", "layoutCoordinates", "LT06;", "value", "LT06;", "i", "()LT06;", "r", "(LT06;)V", "textDelegate", "f", "Li26;", "()Li26;", "m", "(Li26;)V", "layoutResult", "LCe3;", "o", "(J)V", "previousGlobalPosition", "Lpm0;", "getSelectionBackgroundColor-0d7_KjU", "q", "selectionBackgroundColor", "<set-?>", "LEX2;", "()Lkotlin/Unit;", "j", "(Lkotlin/Unit;)V", "drawScopeInvalidation", "l", "layoutInvalidation", "<init>", "(LT06;J)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,702:1\n76#2:703\n102#2,2:704\n76#2:706\n102#2,2:707\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextState\n*L\n579#1:703\n579#1:704,2\n581#1:706\n581#1:707,2\n*E\n"})
/* renamed from: F26 */
/* loaded from: classes.dex */
public final class F26 {

    /* renamed from: a */
    public final long f8490a;

    /* renamed from: b */
    public Function1<? super C42484i26, Unit> f8491b;

    /* renamed from: c */
    public InterfaceC32941Fr5 f8492c;

    /* renamed from: d */
    public InterfaceC45879nm2 f8493d;

    /* renamed from: e */
    public T06 f8494e;

    /* renamed from: f */
    public C42484i26 f8495f;

    /* renamed from: g */
    public long f8496g;

    /* renamed from: h */
    public long f8497h;

    /* renamed from: i */
    public final EX2 f8498i;

    /* renamed from: j */
    public final EX2 f8499j;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Li26;", "it", "", "invoke", "(Li26;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F26$a */
    /* loaded from: classes.dex */
    public static final class C2061a extends Lambda implements Function1<C42484i26, Unit> {

        /* renamed from: g */
        public static final C2061a f8500g = new C2061a();

        public C2061a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C42484i26 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42484i26 c42484i26) {
            invoke2(c42484i26);
            return Unit.INSTANCE;
        }
    }

    public F26(T06 textDelegate, long j) {
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        this.f8490a = j;
        this.f8491b = C2061a.f8500g;
        this.f8494e = textDelegate;
        this.f8496g = C32120Ce3.f4427b.m111932c();
        this.f8497h = C47063pm0.f104050b.m18726g();
        Unit unit = Unit.INSTANCE;
        this.f8498i = GM5.m105200g(unit, GM5.m105198i());
        this.f8499j = GM5.m105200g(unit, GM5.m105198i());
    }

    /* renamed from: a */
    public final Unit m108084a() {
        this.f8498i.getValue();
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final InterfaceC45879nm2 m108083b() {
        return this.f8493d;
    }

    /* renamed from: c */
    public final Unit m108082c() {
        this.f8499j.getValue();
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public final C42484i26 m108081d() {
        return this.f8495f;
    }

    /* renamed from: e */
    public final Function1<C42484i26, Unit> m108080e() {
        return this.f8491b;
    }

    /* renamed from: f */
    public final long m108079f() {
        return this.f8496g;
    }

    /* renamed from: g */
    public final InterfaceC32941Fr5 m108078g() {
        return this.f8492c;
    }

    /* renamed from: h */
    public final long m108077h() {
        return this.f8490a;
    }

    /* renamed from: i */
    public final T06 m108076i() {
        return this.f8494e;
    }

    /* renamed from: j */
    public final void m108075j(Unit unit) {
        this.f8498i.setValue(unit);
    }

    /* renamed from: k */
    public final void m108074k(InterfaceC45879nm2 interfaceC45879nm2) {
        this.f8493d = interfaceC45879nm2;
    }

    /* renamed from: l */
    public final void m108073l(Unit unit) {
        this.f8499j.setValue(unit);
    }

    /* renamed from: m */
    public final void m108072m(C42484i26 c42484i26) {
        m108075j(Unit.INSTANCE);
        this.f8495f = c42484i26;
    }

    /* renamed from: n */
    public final void m108071n(Function1<? super C42484i26, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f8491b = function1;
    }

    /* renamed from: o */
    public final void m108070o(long j) {
        this.f8496g = j;
    }

    /* renamed from: p */
    public final void m108069p(InterfaceC32941Fr5 interfaceC32941Fr5) {
        this.f8492c = interfaceC32941Fr5;
    }

    /* renamed from: q */
    public final void m108068q(long j) {
        this.f8497h = j;
    }

    /* renamed from: r */
    public final void m108067r(T06 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m108073l(Unit.INSTANCE);
        this.f8494e = value;
    }
}
