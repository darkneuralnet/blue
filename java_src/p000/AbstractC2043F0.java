package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.AbstractC36226Ts5;
import p000.RS5;
@Metadata(m28433d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002\u0005\n\b3\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010C\u001a\u00020?\u0012\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00130D¢\u0006\u0004\bQ\u0010RJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0014J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u001c\u001a\u00020\u0011H&J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u000eH\u0014J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\"H\u0014J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020$H\u0014J\u0018\u0010'\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020&H\u0014J\u0018\u0010)\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020(H\u0014J+\u0010-\u001a\u00020\u0013\"\u0004\b\u0000\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020/H\u0014J\u0018\u00101\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0015H\u0014J\u0018\u00103\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u000202H\u0014J\u0018\u00104\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0014J \u00107\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\u000eH\u0014J\u0018\u00109\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u000208H\u0014J\u0018\u0010;\u001a\u00020:2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0014J\u0010\u0010=\u001a\u00020<2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010>\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\bH\u0014R\u0017\u0010C\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b=\u0010@\u001a\u0004\bA\u0010BR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00130D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020H8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bA\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0011\u0010P\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bE\u0010O\u0082\u0001\u0003STU¨\u0006V"}, m28432d2 = {"LF0;", "LpY2;", "LDi2;", "", "tag", "F0$c", "x0", "(Ljava/lang/String;)LF0$c;", "LMs5;", "inlineDescriptor", "F0$b", "w0", "(Ljava/lang/String;LMs5;)LF0$b;", "descriptor", "", "index", "e0", "Lxi2;", "element", "", "m", "", "s", "parentName", "childName", "d0", "key", "y0", "v0", "D", "A", "r0", "value", "p0", "", "j0", "", "s0", "", "q0", "", "n0", "T", "Let5;", "serializer", "B", "(Let5;Ljava/lang/Object;)V", "", "l0", "i0", "", "k0", "t0", "enumDescriptor", "ordinal", "m0", "", AbstractC26684u0.f100690q, "Lrb1;", "o0", "LUt0;", "b", "X", "Lbi2;", "Lbi2;", DateTokenConverter.CONVERTER_KEY, "()Lbi2;", "json", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "nodeConsumer", "Lji2;", "Lji2;", "configuration", "e", "Ljava/lang/String;", "polymorphicDiscriminator", "Lkt5;", "()Lkt5;", "serializersModule", "<init>", "(Lbi2;Lkotlin/jvm/functions/Function1;)V", "Lbj2;", "Lqj2;", "Lsj2;", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,255:1\n20#2,12:256\n36#3,9:268\n*S KotlinDebug\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n*L\n80#1:256,12\n139#1:268,9\n*E\n"})
/* renamed from: F0 */
/* loaded from: classes8.dex */
public abstract class AbstractC2043F0 extends AbstractC46927pY2 implements InterfaceC32389Di2 {

    /* renamed from: b */
    public final AbstractC38706bi2 f8411b;

    /* renamed from: c */
    public final Function1<AbstractC51767xi2, Unit> f8412c;
    @JvmField

    /* renamed from: d */
    public final C43467ji2 f8413d;

    /* renamed from: e */
    public String f8414e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lxi2;", "node", "", C17296a.f69688o, "(Lxi2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F0$a */
    /* loaded from: classes8.dex */
    public static final class C2044a extends Lambda implements Function1<AbstractC51767xi2, Unit> {
        public C2044a() {
            super(1);
        }

        /* renamed from: a */
        public final void m108128a(AbstractC51767xi2 node) {
            Intrinsics.checkNotNullParameter(node, "node");
            AbstractC2043F0 abstractC2043F0 = AbstractC2043F0.this;
            abstractC2043F0.mo9826y0(AbstractC2043F0.m108144h0(abstractC2043F0), node);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC51767xi2 abstractC51767xi2) {
            m108128a(abstractC51767xi2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"F0$b", "Ls0;", "", "value", "", "q", "Lkt5;", "c", "()Lkt5;", "serializersModule", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: F0$b */
    /* loaded from: classes8.dex */
    public static final class C2045b extends AbstractC28150s0 {

        /* renamed from: b */
        public final /* synthetic */ String f8417b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC34588Ms5 f8418c;

        public C2045b(String str, InterfaceC34588Ms5 interfaceC34588Ms5) {
            this.f8417b = str;
            this.f8418c = interfaceC34588Ms5;
        }

        @Override // p000.InterfaceC48140rb1
        /* renamed from: c */
        public AbstractC44173kt5 mo1147c() {
            return AbstractC2043F0.this.mo102403d().m64101f();
        }

        @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
        /* renamed from: q */
        public void mo1134q(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            AbstractC2043F0.this.mo9826y0(this.f8417b, new C34027Ki2(value, false, this.f8418c));
        }
    }

    @Metadata(m28433d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rH\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m28432d2 = {"F0$c", "Ls0;", "", "s", "", "K", "", "value", "p", "", "x", "", "g", "", "k", "Lkt5;", C17296a.f69688o, "Lkt5;", "c", "()Lkt5;", "serializersModule", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: F0$c */
    /* loaded from: classes8.dex */
    public static final class C2046c extends AbstractC28150s0 {

        /* renamed from: a */
        public final AbstractC44173kt5 f8419a;

        /* renamed from: c */
        public final /* synthetic */ String f8421c;

        public C2046c(String str) {
            this.f8421c = str;
            this.f8419a = AbstractC2043F0.this.mo102403d().m64101f();
        }

        /* renamed from: K */
        public final void m108127K(String s) {
            Intrinsics.checkNotNullParameter(s, "s");
            AbstractC2043F0.this.mo9826y0(this.f8421c, new C34027Ki2(s, false, null, 4, null));
        }

        @Override // p000.InterfaceC48140rb1
        /* renamed from: c */
        public AbstractC44173kt5 mo1147c() {
            return this.f8419a;
        }

        @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
        /* renamed from: g */
        public void mo1143g(byte b) {
            m108127K(UByte.m116845toStringimpl(UByte.m116801constructorimpl(b)));
        }

        @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
        /* renamed from: k */
        public void mo1139k(short s) {
            m108127K(UShort.m117108toStringimpl(UShort.m117064constructorimpl(s)));
        }

        @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
        /* renamed from: p */
        public void mo1135p(int i) {
            String l;
            l = Long.toString(UInt.m116878constructorimpl(i) & 4294967295L, 10);
            m108127K(l);
        }

        @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
        /* renamed from: x */
        public void mo1127x(long j) {
            String m103086a;
            m103086a = C3310I0.m103086a(ULong.m116957constructorimpl(j), 10);
            m108127K(m103086a);
        }
    }

    public /* synthetic */ AbstractC2043F0(AbstractC38706bi2 abstractC38706bi2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC38706bi2, function1);
    }

    /* renamed from: h0 */
    public static final /* synthetic */ String m108144h0(AbstractC2043F0 abstractC2043F0) {
        return abstractC2043F0.m1153Y();
    }

    @Override // p000.AbstractC52858zY5, p000.InterfaceC48140rb1
    /* renamed from: A */
    public void mo1177A() {
        String m1152Z = m1152Z();
        if (m1152Z == null) {
            this.f8412c.invoke(C35197Pi2.INSTANCE);
        } else {
            mo1158T(m1152Z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC52858zY5, p000.InterfaceC48140rb1
    /* renamed from: B */
    public <T> void mo1176B(InterfaceC40615et5<? super T> serializer, T t) {
        boolean m23495b;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (m1152Z() == null) {
            m23495b = C45763na6.m23495b(C43813kH6.m29104a(serializer.getDescriptor(), mo1147c()));
            if (m23495b) {
                C38716bj2 c38716bj2 = new C38716bj2(this.f8411b, this.f8412c);
                c38716bj2.mo1176B(serializer, t);
                c38716bj2.mo1154X(serializer.getDescriptor());
                return;
            }
        }
        if ((serializer instanceof AbstractC12270b1) && !mo102403d().m64102e().m30062l()) {
            AbstractC12270b1 abstractC12270b1 = (AbstractC12270b1) serializer;
            String m90160c = PX3.m90160c(serializer.getDescriptor(), mo102403d());
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlin.Any");
            InterfaceC40615et5 m86630b = RX3.m86630b(abstractC12270b1, this, t);
            PX3.m90157f(abstractC12270b1, m86630b, m90160c);
            PX3.m90161b(m86630b.getDescriptor().getKind());
            this.f8414e = m90160c;
            m86630b.serialize(this, t);
            return;
        }
        serializer.serialize(this, t);
    }

    @Override // p000.AbstractC52858zY5, p000.InterfaceC48140rb1
    /* renamed from: D */
    public void mo1174D() {
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: X */
    public void mo1154X(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f8412c.invoke(mo9827v0());
    }

    @Override // p000.AbstractC52858zY5, p000.InterfaceC48140rb1
    /* renamed from: b */
    public InterfaceC36464Ut0 mo1149b(InterfaceC34588Ms5 descriptor) {
        Function1 c2044a;
        boolean z;
        AbstractC2043F0 c47628qj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (m1152Z() == null) {
            c2044a = this.f8412c;
        } else {
            c2044a = new C2044a();
        }
        AbstractC36226Ts5 kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, RS5.C7172b.f32057a)) {
            z = true;
        } else {
            z = kind instanceof OX3;
        }
        if (z) {
            c47628qj2 = new C48813sj2(this.f8411b, c2044a);
        } else if (Intrinsics.areEqual(kind, RS5.C7173c.f32058a)) {
            AbstractC38706bi2 abstractC38706bi2 = this.f8411b;
            InterfaceC34588Ms5 m29104a = C43813kH6.m29104a(descriptor.mo10460d(0), abstractC38706bi2.m64101f());
            AbstractC36226Ts5 kind2 = m29104a.getKind();
            if (!(kind2 instanceof E24) && !Intrinsics.areEqual(kind2, AbstractC36226Ts5.C8136b.f36382a)) {
                if (abstractC38706bi2.m64102e().m30072b()) {
                    c47628qj2 = new C48813sj2(this.f8411b, c2044a);
                } else {
                    throw C32857Fi2.m106732d(m29104a);
                }
            } else {
                c47628qj2 = new C49999uj2(this.f8411b, c2044a);
            }
        } else {
            c47628qj2 = new C47628qj2(this.f8411b, c2044a);
        }
        String str = this.f8414e;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            c47628qj2.mo9826y0(str, C52953zi2.m530c(descriptor.mo10456h()));
            this.f8414e = null;
        }
        return c47628qj2;
    }

    @Override // p000.AbstractC52858zY5, p000.InterfaceC48140rb1
    /* renamed from: c */
    public final AbstractC44173kt5 mo1147c() {
        return this.f8411b.m64101f();
    }

    @Override // p000.InterfaceC32389Di2
    /* renamed from: d */
    public final AbstractC38706bi2 mo102403d() {
        return this.f8411b;
    }

    @Override // p000.AbstractC46927pY2
    /* renamed from: d0 */
    public String mo19130d0(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // p000.AbstractC46927pY2
    /* renamed from: e0 */
    public String mo13778e0(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return C34729Ni2.m93557f(descriptor, this.f8411b, i);
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: i0 */
    public void mo1168J(String tag, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo9826y0(tag, C52953zi2.m532a(Boolean.valueOf(z)));
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: j0 */
    public void mo1167K(String tag, byte b) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo9826y0(tag, C52953zi2.m531b(Byte.valueOf(b)));
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: k0 */
    public void mo1166L(String tag, char c) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo9826y0(tag, C52953zi2.m530c(String.valueOf(c)));
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: l0 */
    public void mo1165M(String tag, double d) {
        boolean z;
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo9826y0(tag, C52953zi2.m531b(Double.valueOf(d)));
        if (!this.f8413d.m30073a()) {
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw C32857Fi2.m106733c(Double.valueOf(d), tag, mo9827v0().toString());
            }
        }
    }

    @Override // p000.InterfaceC32389Di2
    /* renamed from: m */
    public void mo102402m(AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        mo1176B(C31921Bi2.f2710a, element);
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: m0 */
    public void mo1164N(String tag, InterfaceC34588Ms5 enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo9826y0(tag, C52953zi2.m530c(enumDescriptor.mo10458f(i)));
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: n0 */
    public void mo1163O(String tag, float f) {
        boolean z;
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo9826y0(tag, C52953zi2.m531b(Float.valueOf(f)));
        if (!this.f8413d.m30073a()) {
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw C32857Fi2.m106733c(Float.valueOf(f), tag, mo9827v0().toString());
            }
        }
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: o0 */
    public InterfaceC48140rb1 mo1162P(String tag, InterfaceC34588Ms5 inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (JR5.m100461b(inlineDescriptor)) {
            return m108129x0(tag);
        }
        if (JR5.m100462a(inlineDescriptor)) {
            return m108130w0(tag, inlineDescriptor);
        }
        return super.mo1162P(tag, inlineDescriptor);
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: p0 */
    public void mo1161Q(String tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo9826y0(tag, C52953zi2.m531b(Integer.valueOf(i)));
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: q0 */
    public void mo1160R(String tag, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo9826y0(tag, C52953zi2.m531b(Long.valueOf(j)));
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: r0 */
    public void mo1158T(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo9826y0(tag, C35197Pi2.INSTANCE);
    }

    @Override // p000.AbstractC52858zY5, p000.InterfaceC36464Ut0
    /* renamed from: s */
    public boolean mo1132s(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f8413d.m30069e();
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: s0 */
    public void mo1157U(String tag, short s) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo9826y0(tag, C52953zi2.m531b(Short.valueOf(s)));
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: t0 */
    public void mo1156V(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        mo9826y0(tag, C52953zi2.m530c(value));
    }

    @Override // p000.AbstractC52858zY5
    /* renamed from: u0 */
    public void mo1155W(String tag, Object value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        mo9826y0(tag, C52953zi2.m530c(value.toString()));
    }

    /* renamed from: v0 */
    public abstract AbstractC51767xi2 mo9827v0();

    /* renamed from: w0 */
    public final C2045b m108130w0(String str, InterfaceC34588Ms5 interfaceC34588Ms5) {
        return new C2045b(str, interfaceC34588Ms5);
    }

    /* renamed from: x0 */
    public final C2046c m108129x0(String str) {
        return new C2046c(str);
    }

    /* renamed from: y0 */
    public abstract void mo9826y0(String str, AbstractC51767xi2 abstractC51767xi2);

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2043F0(AbstractC38706bi2 abstractC38706bi2, Function1<? super AbstractC51767xi2, Unit> function1) {
        this.f8411b = abstractC38706bi2;
        this.f8412c = function1;
        this.f8413d = abstractC38706bi2.m64102e();
    }
}
