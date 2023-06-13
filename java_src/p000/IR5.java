package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00107\u001a\u000203\u0012\u0006\u0010;\u001a\u000208\u0012\u0010\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010<¢\u0006\u0004\bM\u0010NB1\b\u0010\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u00107\u001a\u000203\u0012\u0006\u0010;\u001a\u000208\u0012\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010<¢\u0006\u0004\bM\u0010QJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J+\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016JA\u0010\u0018\u001a\u00020\u0005\"\b\b\u0000\u0010\r*\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020#H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020+H\u0016J\u0018\u0010.\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u001a\u00107\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010=R\u001a\u0010C\u001a\u00020?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b9\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006R"}, m28432d2 = {"LIR5;", "LDi2;", "Ls0;", "Lxi2;", "element", "", "m", "LMs5;", "descriptor", "", "index", "", "s", "T", "Let5;", "serializer", "value", "B", "(Let5;Ljava/lang/Object;)V", "LUt0;", "b", C17296a.f69688o, "H", "", "E", "(LMs5;ILet5;Ljava/lang/Object;)V", "Lrb1;", "u", "A", "l", "", "g", "", "k", "p", "", "x", "", "n", "", "t", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "q", "enumDescriptor", "i", "K", "LFt0;", "LFt0;", "composer", "Lbi2;", "Lbi2;", DateTokenConverter.CONVERTER_KEY, "()Lbi2;", "json", "LjH6;", "c", "LjH6;", "mode", "", "[LDi2;", "modeReuseCache", "Lkt5;", "e", "Lkt5;", "()Lkt5;", "serializersModule", "Lji2;", "f", "Lji2;", "configuration", "Z", "forceQuoting", "h", "Ljava/lang/String;", "polymorphicDiscriminator", "<init>", "(LFt0;Lbi2;LjH6;[LDi2;)V", "LDj2;", "output", "(LDj2;Lbi2;LjH6;[LDi2;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n*L\n1#1,226:1\n172#1,2:239\n172#1,2:241\n20#2,12:227\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n163#1:239,2\n164#1:241,2\n66#1:227,12\n*E\n"})
/* renamed from: IR5 */
/* loaded from: classes8.dex */
public final class IR5 extends AbstractC28150s0 implements InterfaceC32389Di2 {

    /* renamed from: a */
    public final C32954Ft0 f15481a;

    /* renamed from: b */
    public final AbstractC38706bi2 f15482b;

    /* renamed from: c */
    public final EnumC43220jH6 f15483c;

    /* renamed from: d */
    public final InterfaceC32389Di2[] f15484d;

    /* renamed from: e */
    public final AbstractC44173kt5 f15485e;

    /* renamed from: f */
    public final C43467ji2 f15486f;

    /* renamed from: g */
    public boolean f15487g;

    /* renamed from: h */
    public String f15488h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IR5$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C3532a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC43220jH6.values().length];
            try {
                iArr[EnumC43220jH6.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC43220jH6.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC43220jH6.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IR5(C32954Ft0 composer, AbstractC38706bi2 json, EnumC43220jH6 mode, InterfaceC32389Di2[] interfaceC32389Di2Arr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f15481a = composer;
        this.f15482b = json;
        this.f15483c = mode;
        this.f15484d = interfaceC32389Di2Arr;
        this.f15485e = mo102403d().m64101f();
        this.f15486f = mo102403d().m64102e();
        int ordinal = mode.ordinal();
        if (interfaceC32389Di2Arr != null) {
            InterfaceC32389Di2 interfaceC32389Di2 = interfaceC32389Di2Arr[ordinal];
            if (interfaceC32389Di2 == null && interfaceC32389Di2 == this) {
                return;
            }
            interfaceC32389Di2Arr[ordinal] = this;
        }
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: A */
    public void mo1177A() {
        this.f15481a.m106325j("null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: B */
    public <T> void mo1176B(InterfaceC40615et5<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if ((serializer instanceof AbstractC12270b1) && !mo102403d().m64102e().m30062l()) {
            AbstractC12270b1 abstractC12270b1 = (AbstractC12270b1) serializer;
            String m90160c = PX3.m90160c(serializer.getDescriptor(), mo102403d());
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlin.Any");
            InterfaceC40615et5 m86630b = RX3.m86630b(abstractC12270b1, this, t);
            PX3.m90157f(abstractC12270b1, m86630b, m90160c);
            PX3.m90161b(m86630b.getDescriptor().getKind());
            this.f15488h = m90160c;
            m86630b.serialize(this, t);
            return;
        }
        serializer.serialize(this, t);
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: C */
    public void mo1175C(char c) {
        mo1134q(String.valueOf(c));
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC36464Ut0
    /* renamed from: E */
    public <T> void mo1173E(InterfaceC34588Ms5 descriptor, int i, InterfaceC40615et5<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (t != null || this.f15486f.m30068f()) {
            super.mo1173E(descriptor, i, serializer, t);
        }
    }

    @Override // p000.AbstractC28150s0
    /* renamed from: H */
    public boolean mo14902H(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = C3532a.$EnumSwitchMapping$0[this.f15483c.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.f15481a.m106329a()) {
                        this.f15481a.m106328e(CoreConstants.COMMA_CHAR);
                    }
                    this.f15481a.mo86247c();
                    mo1134q(C34729Ni2.m93557f(descriptor, mo102403d(), i));
                    this.f15481a.m106328e(CoreConstants.COLON_CHAR);
                    this.f15481a.mo86246o();
                } else {
                    if (i == 0) {
                        this.f15487g = true;
                    }
                    if (i == 1) {
                        this.f15481a.m106328e(CoreConstants.COMMA_CHAR);
                        this.f15481a.mo86246o();
                        this.f15487g = false;
                    }
                }
            } else if (!this.f15481a.m106329a()) {
                if (i % 2 == 0) {
                    this.f15481a.m106328e(CoreConstants.COMMA_CHAR);
                    this.f15481a.mo86247c();
                    z = true;
                } else {
                    this.f15481a.m106328e(CoreConstants.COLON_CHAR);
                    this.f15481a.mo86246o();
                }
                this.f15487g = z;
            } else {
                this.f15487g = true;
                this.f15481a.mo86247c();
            }
        } else {
            if (!this.f15481a.m106329a()) {
                this.f15481a.m106328e(CoreConstants.COMMA_CHAR);
            }
            this.f15481a.mo86247c();
        }
        return true;
    }

    /* renamed from: K */
    public final void m102404K(InterfaceC34588Ms5 interfaceC34588Ms5) {
        this.f15481a.mo86247c();
        String str = this.f15488h;
        Intrinsics.checkNotNull(str);
        mo1134q(str);
        this.f15481a.m106328e(CoreConstants.COLON_CHAR);
        this.f15481a.mo86246o();
        mo1134q(interfaceC34588Ms5.mo10456h());
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC36464Ut0
    /* renamed from: a */
    public void mo1151a(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f15483c.f92431c != 0) {
            this.f15481a.mo86245p();
            this.f15481a.mo86247c();
            this.f15481a.m106328e(this.f15483c.f92431c);
        }
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: b */
    public InterfaceC36464Ut0 mo1149b(InterfaceC34588Ms5 descriptor) {
        InterfaceC32389Di2 interfaceC32389Di2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        EnumC43220jH6 m29103b = C43813kH6.m29103b(mo102403d(), descriptor);
        char c = m29103b.f92430b;
        if (c != 0) {
            this.f15481a.m106328e(c);
            this.f15481a.mo86248b();
        }
        if (this.f15488h != null) {
            m102404K(descriptor);
            this.f15488h = null;
        }
        if (this.f15483c == m29103b) {
            return this;
        }
        InterfaceC32389Di2[] interfaceC32389Di2Arr = this.f15484d;
        if (interfaceC32389Di2Arr == null || (interfaceC32389Di2 = interfaceC32389Di2Arr[m29103b.ordinal()]) == null) {
            return new IR5(this.f15481a, mo102403d(), m29103b, this.f15484d);
        }
        return interfaceC32389Di2;
    }

    @Override // p000.InterfaceC48140rb1
    /* renamed from: c */
    public AbstractC44173kt5 mo1147c() {
        return this.f15485e;
    }

    @Override // p000.InterfaceC32389Di2
    /* renamed from: d */
    public AbstractC38706bi2 mo102403d() {
        return this.f15482b;
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: g */
    public void mo1143g(byte b) {
        if (this.f15487g) {
            mo1134q(String.valueOf((int) b));
        } else {
            this.f15481a.mo91211d(b);
        }
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: i */
    public void mo1141i(InterfaceC34588Ms5 enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo1134q(enumDescriptor.mo10458f(i));
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: k */
    public void mo1139k(short s) {
        if (this.f15487g) {
            mo1134q(String.valueOf((int) s));
        } else {
            this.f15481a.mo91208k(s);
        }
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: l */
    public void mo1138l(boolean z) {
        if (this.f15487g) {
            mo1134q(String.valueOf(z));
        } else {
            this.f15481a.m106324l(z);
        }
    }

    @Override // p000.InterfaceC32389Di2
    /* renamed from: m */
    public void mo102402m(AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        mo1176B(C31921Bi2.f2710a, element);
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: n */
    public void mo1137n(float f) {
        boolean z;
        if (this.f15487g) {
            mo1134q(String.valueOf(f));
        } else {
            this.f15481a.m106326g(f);
        }
        if (!this.f15486f.m30073a()) {
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw C32857Fi2.m106734b(Float.valueOf(f), this.f15481a.f10407a.toString());
            }
        }
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: p */
    public void mo1135p(int i) {
        if (this.f15487g) {
            mo1134q(String.valueOf(i));
        } else {
            this.f15481a.mo91210h(i);
        }
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: q */
    public void mo1134q(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f15481a.mo103244m(value);
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC36464Ut0
    /* renamed from: s */
    public boolean mo1132s(InterfaceC34588Ms5 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f15486f.m30069e();
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: t */
    public void mo1131t(double d) {
        boolean z;
        if (this.f15487g) {
            mo1134q(String.valueOf(d));
        } else {
            this.f15481a.m106327f(d);
        }
        if (!this.f15486f.m30073a()) {
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw C32857Fi2.m106734b(Double.valueOf(d), this.f15481a.f10407a.toString());
            }
        }
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: u */
    public InterfaceC48140rb1 mo1130u(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (JR5.m100461b(descriptor)) {
            C32954Ft0 c32954Ft0 = this.f15481a;
            if (!(c32954Ft0 instanceof C35060Ot0)) {
                c32954Ft0 = new C35060Ot0(c32954Ft0.f10407a, this.f15487g);
            }
            return new IR5(c32954Ft0, mo102403d(), this.f15483c, (InterfaceC32389Di2[]) null);
        } else if (JR5.m100462a(descriptor)) {
            C32954Ft0 c32954Ft02 = this.f15481a;
            if (!(c32954Ft02 instanceof C33422Ht0)) {
                c32954Ft02 = new C33422Ht0(c32954Ft02.f10407a, this.f15487g);
            }
            return new IR5(c32954Ft02, mo102403d(), this.f15483c, (InterfaceC32389Di2[]) null);
        } else {
            return super.mo1130u(descriptor);
        }
    }

    @Override // p000.AbstractC28150s0, p000.InterfaceC48140rb1
    /* renamed from: x */
    public void mo1127x(long j) {
        if (this.f15487g) {
            mo1134q(String.valueOf(j));
        } else {
            this.f15481a.mo91209i(j);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IR5(InterfaceC32398Dj2 output, AbstractC38706bi2 json, EnumC43220jH6 mode, InterfaceC32389Di2[] modeReuseCache) {
        this(C35996St0.m84689a(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
