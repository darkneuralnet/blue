package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.MissingFieldException;
import p000.AbstractC36226Ts5;
@Metadata(m28433d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001 B1\u0012\u0006\u0010?\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020@\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bW\u0010XJ\u0016\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J#\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\n\u0010#\u001a\u0004\u0018\u00010\"H\u0016J=\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\b\u0010$\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020\u0007H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020\u000eH\u0016J\b\u0010/\u001a\u00020.H\u0016J\b\u00101\u001a\u000200H\u0016J\b\u00103\u001a\u000202H\u0016J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\u0010\u00108\u001a\u0002072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\tH\u0016R\u0017\u0010?\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b \u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010AR\u0014\u0010F\u001a\u00020C8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010J\u001a\u00020G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010H\u001a\u0004\bD\u0010IR\u0016\u0010M\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010NR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010QR\u0016\u0010V\u001a\u0004\u0018\u00010S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006Y"}, m28432d2 = {"LHR5;", "Lsi2;", "", "Lr0;", "LHR5$a;", "", "unknownKey", "", "S", "LMs5;", "descriptor", "", "R", "K", "", "N", "index", "L", "O", "key", "Q", "M", "P", "Lxi2;", "v", "T", "LE01;", "deserializer", "B", "(LE01;)Ljava/lang/Object;", "LTt0;", "b", C17296a.f69688o, "D", "", "f", "previousValue", "s", "(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;", "q", "z", "", "F", "", "l", "w", "", "j", "", "x", "", "n", "", "o", "t", "LGV0;", "g", "enumDescriptor", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lbi2;", "Lbi2;", DateTokenConverter.CONVERTER_KEY, "()Lbi2;", "json", "LjH6;", "LjH6;", "mode", "LC0;", "c", "LC0;", "lexer", "Lkt5;", "Lkt5;", "()Lkt5;", "serializersModule", "e", "I", "currentIndex", "LHR5$a;", "discriminatorHolder", "Lji2;", "Lji2;", "configuration", "LAi2;", "h", "LAi2;", "elementMarker", "<init>", "(Lbi2;LjH6;LC0;LMs5;LHR5$a;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 4 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,393:1\n517#2,3:394\n517#2,3:397\n105#3,15:400\n386#4,5:415\n386#4,5:420\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n196#1:394,3\n197#1:397,3\n209#1:400,15\n311#1:415,5\n318#1:420,5\n*E\n"})
/* renamed from: HR5 */
/* loaded from: classes8.dex */
public class HR5 extends AbstractC27747r0 implements InterfaceC48803si2 {

    /* renamed from: a */
    public final AbstractC38706bi2 f13395a;

    /* renamed from: b */
    public final EnumC43220jH6 f13396b;
    @JvmField

    /* renamed from: c */
    public final AbstractC0809C0 f13397c;

    /* renamed from: d */
    public final AbstractC44173kt5 f13398d;

    /* renamed from: e */
    public int f13399e;

    /* renamed from: f */
    public C3146a f13400f;

    /* renamed from: g */
    public final C43467ji2 f13401g;

    /* renamed from: h */
    public final C31687Ai2 f13402h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"LHR5$a;", "", "", C17296a.f69688o, "Ljava/lang/String;", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HR5$a */
    /* loaded from: classes8.dex */
    public static final class C3146a {
        @JvmField

        /* renamed from: a */
        public String f13403a;

        public C3146a(String str) {
            this.f13403a = str;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HR5$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C3147b {
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
            try {
                iArr[EnumC43220jH6.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HR5(AbstractC38706bi2 json, EnumC43220jH6 mode, AbstractC0809C0 lexer, InterfaceC34588Ms5 descriptor, C3146a c3146a) {
        C31687Ai2 c31687Ai2;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f13395a = json;
        this.f13396b = mode;
        this.f13397c = lexer;
        this.f13398d = json.m64101f();
        this.f13399e = -1;
        this.f13400f = c3146a;
        C43467ji2 m64102e = json.m64102e();
        this.f13401g = m64102e;
        if (m64102e.m30068f()) {
            c31687Ai2 = null;
        } else {
            c31687Ai2 = new C31687Ai2(descriptor);
        }
        this.f13402h = c31687Ai2;
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: B */
    public <T> T mo3325B(E01<? extends T> deserializer) {
        E01<T> e01;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC12270b1) && !this.f13395a.m64102e().m30062l()) {
                String m90160c = PX3.m90160c(deserializer.getDescriptor(), this.f13395a);
                String mo78440l = this.f13397c.mo78440l(m90160c, this.f13401g.m30061m());
                if (mo78440l != null) {
                    e01 = ((AbstractC12270b1) deserializer).mo29846c(this, mo78440l);
                } else {
                    e01 = null;
                }
                if (e01 == null) {
                    return (T) PX3.m90159d(this, deserializer);
                }
                this.f13400f = new C3146a(m90160c);
                return e01.deserialize(this);
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e) {
            List<String> m28398a = e.m28398a();
            throw new MissingFieldException(m28398a, e.getMessage() + " at path: " + this.f13397c.f3199b.m76546a(), e);
        }
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: C */
    public int mo3324C(InterfaceC34588Ms5 enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        AbstractC38706bi2 abstractC38706bi2 = this.f13395a;
        String mo3282t = mo3282t();
        return C34729Ni2.m93554i(enumDescriptor, abstractC38706bi2, mo3282t, " at path " + this.f13397c.f3199b.m76546a());
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: D */
    public boolean mo3323D() {
        C31687Ai2 c31687Ai2 = this.f13402h;
        return ((c31687Ai2 != null ? c31687Ai2.m115378b() : false) || AbstractC0809C0.m113136N(this.f13397c, false, 1, null)) ? false : true;
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: F */
    public byte mo3321F() {
        long m113123p = this.f13397c.m113123p();
        byte b = (byte) m113123p;
        if (m113123p == b) {
            return b;
        }
        AbstractC0809C0 abstractC0809C0 = this.f13397c;
        AbstractC0809C0.m113114y(abstractC0809C0, "Failed to parse byte for input '" + m113123p + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: K */
    public final void m103866K() {
        if (this.f13397c.m113142E() != 4) {
            return;
        }
        AbstractC0809C0.m113114y(this.f13397c, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: L */
    public final boolean m103865L(InterfaceC34588Ms5 interfaceC34588Ms5, int i) {
        String m113141F;
        AbstractC38706bi2 abstractC38706bi2 = this.f13395a;
        InterfaceC34588Ms5 mo10460d = interfaceC34588Ms5.mo10460d(i);
        if (!mo10460d.mo10462b() && this.f13397c.m113137M(true)) {
            return true;
        }
        if (!Intrinsics.areEqual(mo10460d.getKind(), AbstractC36226Ts5.C8136b.f36382a) || ((mo10460d.mo10462b() && this.f13397c.m113137M(false)) || (m113141F = this.f13397c.m113141F(this.f13401g.m30061m())) == null || C34729Ni2.m93556g(mo10460d, abstractC38706bi2, m113141F) != -3)) {
            return false;
        }
        this.f13397c.m113122q();
        return true;
    }

    /* renamed from: M */
    public final int m103864M() {
        boolean mo78444L = this.f13397c.mo78444L();
        if (this.f13397c.mo78442f()) {
            int i = this.f13399e;
            if (i != -1 && !mo78444L) {
                AbstractC0809C0.m113114y(this.f13397c, "Expected end of the array or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            int i2 = i + 1;
            this.f13399e = i2;
            return i2;
        } else if (!mo78444L) {
            return -1;
        } else {
            AbstractC0809C0.m113114y(this.f13397c, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: N */
    public final int m103863N() {
        boolean z;
        int i;
        int i2;
        int i3 = this.f13399e;
        boolean z2 = false;
        if (i3 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i3 != -1) {
                z2 = this.f13397c.mo78444L();
            }
        } else {
            this.f13397c.mo78438o(CoreConstants.COLON_CHAR);
        }
        if (this.f13397c.mo78442f()) {
            if (z) {
                if (this.f13399e == -1) {
                    AbstractC0809C0 abstractC0809C0 = this.f13397c;
                    boolean z3 = !z2;
                    i2 = abstractC0809C0.f3198a;
                    if (!z3) {
                        AbstractC0809C0.m113114y(abstractC0809C0, "Unexpected trailing comma", i2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    AbstractC0809C0 abstractC0809C02 = this.f13397c;
                    i = abstractC0809C02.f3198a;
                    if (!z2) {
                        AbstractC0809C0.m113114y(abstractC0809C02, "Expected comma after the key-value pair", i, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            int i4 = this.f13399e + 1;
            this.f13399e = i4;
            return i4;
        } else if (!z2) {
            return -1;
        } else {
            AbstractC0809C0.m113114y(this.f13397c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: O */
    public final int m103862O(InterfaceC34588Ms5 interfaceC34588Ms5) {
        boolean z;
        boolean mo78444L = this.f13397c.mo78444L();
        while (this.f13397c.mo78442f()) {
            String m103861P = m103861P();
            this.f13397c.mo78438o(CoreConstants.COLON_CHAR);
            int m93556g = C34729Ni2.m93556g(interfaceC34588Ms5, this.f13395a, m103861P);
            boolean z2 = false;
            if (m93556g != -3) {
                if (this.f13401g.m30070d() && m103865L(interfaceC34588Ms5, m93556g)) {
                    z = this.f13397c.mo78444L();
                } else {
                    C31687Ai2 c31687Ai2 = this.f13402h;
                    if (c31687Ai2 != null) {
                        c31687Ai2.m115377c(m93556g);
                    }
                    return m93556g;
                }
            } else {
                z2 = true;
                z = false;
            }
            if (z2) {
                mo78444L = m103860Q(m103861P);
            } else {
                mo78444L = z;
            }
        }
        if (!mo78444L) {
            C31687Ai2 c31687Ai22 = this.f13402h;
            if (c31687Ai22 != null) {
                return c31687Ai22.m115376d();
            }
            return -1;
        }
        AbstractC0809C0.m113114y(this.f13397c, "Unexpected trailing comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: P */
    public final String m103861P() {
        if (this.f13401g.m30061m()) {
            return this.f13397c.m113119t();
        }
        return this.f13397c.mo78441k();
    }

    /* renamed from: Q */
    public final boolean m103860Q(String str) {
        if (!this.f13401g.m30067g() && !m103858S(this.f13400f, str)) {
            this.f13397c.m113145A(str);
        } else {
            this.f13397c.m113140H(this.f13401g.m30061m());
        }
        return this.f13397c.mo78444L();
    }

    /* renamed from: R */
    public final void m103859R(InterfaceC34588Ms5 interfaceC34588Ms5) {
        do {
        } while (mo11843q(interfaceC34588Ms5) != -1);
    }

    /* renamed from: S */
    public final boolean m103858S(C3146a c3146a, String str) {
        if (c3146a == null || !Intrinsics.areEqual(c3146a.f13403a, str)) {
            return false;
        }
        c3146a.f13403a = null;
        return true;
    }

    @Override // p000.AbstractC27747r0, p000.InterfaceC36230Tt0
    /* renamed from: a */
    public void mo3300a(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f13395a.m64102e().m30067g() && descriptor.mo10459e() == 0) {
            m103859R(descriptor);
        }
        this.f13397c.mo78438o(this.f13396b.f92431c);
        this.f13397c.f3199b.m76545b();
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: b */
    public InterfaceC36230Tt0 mo3298b(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        EnumC43220jH6 m29103b = C43813kH6.m29103b(this.f13395a, descriptor);
        this.f13397c.f3199b.m76544c(descriptor);
        this.f13397c.mo78438o(m29103b.f92430b);
        m103866K();
        int i = C3147b.$EnumSwitchMapping$0[m29103b.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (this.f13396b == m29103b && this.f13395a.m64102e().m30068f()) {
                return this;
            }
            return new HR5(this.f13395a, m29103b, this.f13397c, descriptor, this.f13400f);
        }
        return new HR5(this.f13395a, m29103b, this.f13397c, descriptor, this.f13400f);
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: c */
    public AbstractC44173kt5 mo3297c() {
        return this.f13398d;
    }

    @Override // p000.InterfaceC48803si2
    /* renamed from: d */
    public final AbstractC38706bi2 mo13803d() {
        return this.f13395a;
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: f */
    public Void mo3295f() {
        return null;
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: g */
    public GV0 mo3294g(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (JR5.m100461b(descriptor)) {
            return new C49396ti2(this.f13397c, this.f13395a);
        }
        return super.mo3294g(descriptor);
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: j */
    public long mo3291j() {
        return this.f13397c.m113123p();
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: l */
    public short mo3289l() {
        long m113123p = this.f13397c.m113123p();
        short s = (short) m113123p;
        if (m113123p == s) {
            return s;
        }
        AbstractC0809C0 abstractC0809C0 = this.f13397c;
        AbstractC0809C0.m113114y(abstractC0809C0, "Failed to parse short for input '" + m113123p + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: n */
    public double mo3287n() {
        boolean z;
        AbstractC0809C0 abstractC0809C0 = this.f13397c;
        String m113120s = abstractC0809C0.m113120s();
        try {
            double parseDouble = Double.parseDouble(m113120s);
            if (!this.f13395a.m64102e().m30073a()) {
                if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C32857Fi2.m106726j(this.f13397c, Double.valueOf(parseDouble));
                    throw new KotlinNothingValueException();
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractC0809C0.m113114y(abstractC0809C0, "Failed to parse type 'double' for input '" + m113120s + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: o */
    public char mo3286o() {
        String m113120s = this.f13397c.m113120s();
        if (m113120s.length() == 1) {
            return m113120s.charAt(0);
        }
        AbstractC0809C0 abstractC0809C0 = this.f13397c;
        AbstractC0809C0.m113114y(abstractC0809C0, "Expected single char, but got '" + m113120s + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: q */
    public int mo11843q(InterfaceC34588Ms5 descriptor) {
        int m103863N;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = C3147b.$EnumSwitchMapping$0[this.f13396b.ordinal()];
        if (i != 2) {
            if (i != 4) {
                m103863N = m103864M();
            } else {
                m103863N = m103862O(descriptor);
            }
        } else {
            m103863N = m103863N();
        }
        if (this.f13396b != EnumC43220jH6.MAP) {
            this.f13397c.f3199b.m76540g(m103863N);
        }
        return m103863N;
    }

    @Override // p000.AbstractC27747r0, p000.InterfaceC36230Tt0
    /* renamed from: s */
    public <T> T mo3283s(InterfaceC34588Ms5 descriptor, int i, E01<? extends T> deserializer, T t) {
        boolean z;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (this.f13396b == EnumC43220jH6.MAP && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f13397c.f3199b.m76543d();
        }
        T t2 = (T) super.mo3283s(descriptor, i, deserializer, t);
        if (z) {
            this.f13397c.f3199b.m76541f(t2);
        }
        return t2;
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: t */
    public String mo3282t() {
        if (this.f13401g.m30061m()) {
            return this.f13397c.m113119t();
        }
        return this.f13397c.m113122q();
    }

    @Override // p000.InterfaceC48803si2
    /* renamed from: v */
    public AbstractC51767xi2 mo13802v() {
        return new C51184wj2(this.f13395a.m64102e(), this.f13397c).m6438e();
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: w */
    public int mo3280w() {
        long m113123p = this.f13397c.m113123p();
        int i = (int) m113123p;
        if (m113123p == i) {
            return i;
        }
        AbstractC0809C0 abstractC0809C0 = this.f13397c;
        AbstractC0809C0.m113114y(abstractC0809C0, "Failed to parse int for input '" + m113123p + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: x */
    public float mo3279x() {
        boolean z;
        AbstractC0809C0 abstractC0809C0 = this.f13397c;
        String m113120s = abstractC0809C0.m113120s();
        try {
            float parseFloat = Float.parseFloat(m113120s);
            if (!this.f13395a.m64102e().m30073a()) {
                if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C32857Fi2.m106726j(this.f13397c, Float.valueOf(parseFloat));
                    throw new KotlinNothingValueException();
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractC0809C0.m113114y(abstractC0809C0, "Failed to parse type 'float' for input '" + m113120s + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: z */
    public boolean mo3277z() {
        if (this.f13401g.m30061m()) {
            return this.f13397c.m113126i();
        }
        return this.f13397c.m113128g();
    }
}
