package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b'\u0010(B\t\b\u0016¢\u0006\u0004\b'\u0010\nJ%\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R1\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR1\u0010\u001e\u001a\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aRK\u0010#\u001a0\u0012\u0004\u0012\u00020\u0015\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0014¢\u0006\u0002\b\u0016\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u00168\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0014\u0010&\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m28432d2 = {"LZS5;", "", "slotId", "Lkotlin/Function0;", "", "content", "LZS5$a;", "j", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LZS5$a;", "e", "()V", DateTokenConverter.CONVERTER_KEY, "LbT5;", C17296a.f69688o, "LbT5;", "slotReusePolicy", "LQm2;", "b", "LQm2;", "_state", "Lkotlin/Function2;", "LJm2;", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function2;", "h", "()Lkotlin/jvm/functions/Function2;", "setRoot", "LYt0;", "f", "setCompositionContext", "LaT5;", "Lkz0;", "LyO2;", "g", "setMeasurePolicy", "i", "()LQm2;", TransferTable.COLUMN_STATE, "<init>", "(LbT5;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZS5 */
/* loaded from: classes.dex */
public final class ZS5 {

    /* renamed from: f */
    public static final int f48612f = 8;

    /* renamed from: a */
    public final InterfaceC38566bT5 f48613a;

    /* renamed from: b */
    public C35467Qm2 f48614b;

    /* renamed from: c */
    public final Function2<C33829Jm2, ZS5, Unit> f48615c;

    /* renamed from: d */
    public final Function2<C33829Jm2, AbstractC37400Yt0, Unit> f48616d;

    /* renamed from: e */
    public final Function2<C33829Jm2, Function2<? super InterfaceC37973aT5, ? super C44228kz0, ? extends InterfaceC52172yO2>, Unit> f48617e;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m28432d2 = {"LZS5$a;", "", "", "dispose", "", "index", "Lkz0;", "constraints", "b", "(IJ)V", C17296a.f69688o, "()I", "placeablesCount", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ZS5$a */
    /* loaded from: classes.dex */
    public interface InterfaceC10277a {
        /* renamed from: a */
        default int mo73078a() {
            return 0;
        }

        /* renamed from: b */
        default void mo73077b(int i, long j) {
        }

        void dispose();
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LJm2;", "LYt0;", "it", "", C17296a.f69688o, "(LJm2;LYt0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZS5$b */
    /* loaded from: classes.dex */
    public static final class C10278b extends Lambda implements Function2<C33829Jm2, AbstractC37400Yt0, Unit> {
        public C10278b() {
            super(2);
        }

        /* renamed from: a */
        public final void m73076a(C33829Jm2 c33829Jm2, AbstractC37400Yt0 it) {
            Intrinsics.checkNotNullParameter(c33829Jm2, "$this$null");
            Intrinsics.checkNotNullParameter(it, "it");
            ZS5.this.m73080i().m87967u(it);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2, AbstractC37400Yt0 abstractC37400Yt0) {
            m73076a(c33829Jm2, abstractC37400Yt0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LJm2;", "Lkotlin/Function2;", "LaT5;", "Lkz0;", "LyO2;", "Lkotlin/ExtensionFunctionType;", "it", "", C17296a.f69688o, "(LJm2;Lkotlin/jvm/functions/Function2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZS5$c */
    /* loaded from: classes.dex */
    public static final class C10279c extends Lambda implements Function2<C33829Jm2, Function2<? super InterfaceC37973aT5, ? super C44228kz0, ? extends InterfaceC52172yO2>, Unit> {
        public C10279c() {
            super(2);
        }

        /* renamed from: a */
        public final void m73075a(C33829Jm2 c33829Jm2, Function2<? super InterfaceC37973aT5, ? super C44228kz0, ? extends InterfaceC52172yO2> it) {
            Intrinsics.checkNotNullParameter(c33829Jm2, "$this$null");
            Intrinsics.checkNotNullParameter(it, "it");
            c33829Jm2.mo99760o(ZS5.this.m73080i().m87977k(it));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2, Function2<? super InterfaceC37973aT5, ? super C44228kz0, ? extends InterfaceC52172yO2> function2) {
            m73075a(c33829Jm2, function2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LJm2;", "LZS5;", "it", "", C17296a.f69688o, "(LJm2;LZS5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZS5$d */
    /* loaded from: classes.dex */
    public static final class C10280d extends Lambda implements Function2<C33829Jm2, ZS5, Unit> {
        public C10280d() {
            super(2);
        }

        /* renamed from: a */
        public final void m73074a(C33829Jm2 c33829Jm2, ZS5 it) {
            Intrinsics.checkNotNullParameter(c33829Jm2, "$this$null");
            Intrinsics.checkNotNullParameter(it, "it");
            ZS5 zs5 = ZS5.this;
            C35467Qm2 m99747s0 = c33829Jm2.m99747s0();
            if (m99747s0 == null) {
                m99747s0 = new C35467Qm2(c33829Jm2, ZS5.this.f48613a);
                c33829Jm2.m99839B1(m99747s0);
            }
            zs5.f48614b = m99747s0;
            ZS5.this.m73080i().m87971q();
            ZS5.this.m73080i().m87966v(ZS5.this.f48613a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2, ZS5 zs5) {
            m73074a(c33829Jm2, zs5);
            return Unit.INSTANCE;
        }
    }

    public ZS5(InterfaceC38566bT5 slotReusePolicy) {
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.f48613a = slotReusePolicy;
        this.f48615c = new C10280d();
        this.f48616d = new C10278b();
        this.f48617e = new C10279c();
    }

    /* renamed from: d */
    public final void m73085d() {
        m73080i().m87975m();
    }

    /* renamed from: e */
    public final void m73084e() {
        m73080i().m87973o();
    }

    /* renamed from: f */
    public final Function2<C33829Jm2, AbstractC37400Yt0, Unit> m73083f() {
        return this.f48616d;
    }

    /* renamed from: g */
    public final Function2<C33829Jm2, Function2<? super InterfaceC37973aT5, ? super C44228kz0, ? extends InterfaceC52172yO2>, Unit> m73082g() {
        return this.f48617e;
    }

    /* renamed from: h */
    public final Function2<C33829Jm2, ZS5, Unit> m73081h() {
        return this.f48615c;
    }

    /* renamed from: i */
    public final C35467Qm2 m73080i() {
        C35467Qm2 c35467Qm2 = this.f48614b;
        if (c35467Qm2 != null) {
            return c35467Qm2;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    /* renamed from: j */
    public final InterfaceC10277a m73079j(Object obj, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return m73080i().m87968t(obj, content);
    }

    public ZS5() {
        this(C52027y83.f118803a);
    }
}
