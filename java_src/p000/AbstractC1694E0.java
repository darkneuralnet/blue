package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.AbstractC36226Ts5;
import p000.RS5;
@Metadata(m28433d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010<\u001a\u000207\u0012\u0006\u0010@\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016J#\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0014J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0005H\u0004J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0005H$J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0016H\u0014J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010)\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010*\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010.\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00100\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00102\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00103\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0018\u00106\u001a\u0002052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0016H\u0014R\u001a\u0010<\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010@\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010F\u0082\u0001\u0003JKL¨\u0006M"}, m28432d2 = {"LE0;", "LoY2;", "Lsi2;", "Lxi2;", "h0", "", "primitive", "", "w0", "LYi2;", "type", "LKi2;", "f0", "v", "T", "LE01;", "deserializer", "B", "(LE01;)Ljava/lang/Object;", "parentName", "childName", "b0", "LMs5;", "descriptor", "LTt0;", "b", "", C17296a.f69688o, "", "D", "tag", AbstractC26684u0.f100690q, "g0", "enumDescriptor", "", "m0", "r0", "i0", "", "j0", "", "s0", "p0", "", "q0", "", "n0", "", "l0", "", "k0", "t0", "inlineDescriptor", "LGV0;", "o0", "Lbi2;", "c", "Lbi2;", DateTokenConverter.CONVERTER_KEY, "()Lbi2;", "json", "Lxi2;", "v0", "()Lxi2;", "value", "Lji2;", "e", "Lji2;", "configuration", "Lkt5;", "()Lkt5;", "serializersModule", "<init>", "(Lbi2;Lxi2;)V", "Laj2;", "Lpj2;", "Lrj2;", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 4 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,327:1\n138#1,4:365\n138#1,4:369\n138#1,4:373\n138#1,4:377\n138#1,4:381\n138#1,4:385\n138#1,4:389\n138#1,4:393\n1#2:328\n247#3,7:329\n247#3,7:341\n247#3,7:350\n247#3,7:358\n36#4,5:336\n41#4,2:348\n44#4:357\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n*L\n101#1:365,4\n106#1:369,4\n112#1:373,4\n118#1:377,4\n119#1:381,4\n122#1:385,4\n129#1:389,4\n135#1:393,4\n60#1:329,7\n63#1:341,7\n64#1:350,7\n66#1:358,7\n61#1:336,5\n61#1:348,2\n61#1:357\n*E\n"})
/* renamed from: E0 */
/* loaded from: classes8.dex */
public abstract class AbstractC1694E0 extends AbstractC46334oY2 implements InterfaceC48803si2 {

    /* renamed from: c */
    public final AbstractC38706bi2 f6809c;

    /* renamed from: d */
    public final AbstractC51767xi2 f6810d;
    @JvmField

    /* renamed from: e */
    public final C43467ji2 f6811e;

    public /* synthetic */ AbstractC1694E0(AbstractC38706bi2 abstractC38706bi2, AbstractC51767xi2 abstractC51767xi2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC38706bi2, abstractC51767xi2);
    }

    @Override // p000.AbstractC52265yY5, p000.GV0
    /* renamed from: B */
    public <T> T mo3325B(E01<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) PX3.m90159d(this, deserializer);
    }

    @Override // p000.AbstractC52265yY5, p000.GV0
    /* renamed from: D */
    public boolean mo3323D() {
        return !(m109519h0() instanceof C35197Pi2);
    }

    @Override // p000.AbstractC52265yY5, p000.InterfaceC36230Tt0
    /* renamed from: a */
    public void mo3300a(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // p000.AbstractC52265yY5, p000.GV0
    /* renamed from: b */
    public InterfaceC36230Tt0 mo3298b(InterfaceC34588Ms5 descriptor) {
        boolean z;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        AbstractC51767xi2 m109519h0 = m109519h0();
        AbstractC36226Ts5 kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, RS5.C7172b.f32057a)) {
            z = true;
        } else {
            z = kind instanceof OX3;
        }
        if (z) {
            AbstractC38706bi2 mo13803d = mo13803d();
            if (m109519h0 instanceof C40502ei2) {
                return new C48221rj2(mo13803d, (C40502ei2) m109519h0);
            }
            throw C32857Fi2.m106731e(-1, "Expected " + Reflection.getOrCreateKotlinClass(C40502ei2.class) + " as the serialized body of " + descriptor.mo10456h() + ", but had " + Reflection.getOrCreateKotlinClass(m109519h0.getClass()));
        } else if (Intrinsics.areEqual(kind, RS5.C7173c.f32058a)) {
            AbstractC38706bi2 mo13803d2 = mo13803d();
            InterfaceC34588Ms5 m29104a = C43813kH6.m29104a(descriptor.mo10460d(0), mo13803d2.m64101f());
            AbstractC36226Ts5 kind2 = m29104a.getKind();
            if (!(kind2 instanceof E24) && !Intrinsics.areEqual(kind2, AbstractC36226Ts5.C8136b.f36382a)) {
                if (mo13803d2.m64102e().m30072b()) {
                    AbstractC38706bi2 mo13803d3 = mo13803d();
                    if (m109519h0 instanceof C40502ei2) {
                        return new C48221rj2(mo13803d3, (C40502ei2) m109519h0);
                    }
                    throw C32857Fi2.m106731e(-1, "Expected " + Reflection.getOrCreateKotlinClass(C40502ei2.class) + " as the serialized body of " + descriptor.mo10456h() + ", but had " + Reflection.getOrCreateKotlinClass(m109519h0.getClass()));
                }
                throw C32857Fi2.m106732d(m29104a);
            }
            AbstractC38706bi2 mo13803d4 = mo13803d();
            if (m109519h0 instanceof C35899Si2) {
                return new C49406tj2(mo13803d4, (C35899Si2) m109519h0);
            }
            throw C32857Fi2.m106731e(-1, "Expected " + Reflection.getOrCreateKotlinClass(C35899Si2.class) + " as the serialized body of " + descriptor.mo10456h() + ", but had " + Reflection.getOrCreateKotlinClass(m109519h0.getClass()));
        } else {
            AbstractC38706bi2 mo13803d5 = mo13803d();
            if (m109519h0 instanceof C35899Si2) {
                return new C47035pj2(mo13803d5, (C35899Si2) m109519h0, null, null, 12, null);
            }
            throw C32857Fi2.m106731e(-1, "Expected " + Reflection.getOrCreateKotlinClass(C35899Si2.class) + " as the serialized body of " + descriptor.mo10456h() + ", but had " + Reflection.getOrCreateKotlinClass(m109519h0.getClass()));
        }
    }

    @Override // p000.AbstractC46334oY2
    /* renamed from: b0 */
    public String mo20910b0(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // p000.AbstractC52265yY5, p000.InterfaceC36230Tt0
    /* renamed from: c */
    public AbstractC44173kt5 mo3297c() {
        return mo13803d().m64101f();
    }

    @Override // p000.InterfaceC48803si2
    /* renamed from: d */
    public AbstractC38706bi2 mo13803d() {
        return this.f6809c;
    }

    /* renamed from: f0 */
    public final C34027Ki2 m109520f0(AbstractC37303Yi2 abstractC37303Yi2, String str) {
        C34027Ki2 c34027Ki2 = abstractC37303Yi2 instanceof C34027Ki2 ? (C34027Ki2) abstractC37303Yi2 : null;
        if (c34027Ki2 != null) {
            return c34027Ki2;
        }
        throw C32857Fi2.m106731e(-1, "Unexpected 'null' when " + str + " was expected");
    }

    /* renamed from: g0 */
    public abstract AbstractC51767xi2 mo11844g0(String str);

    /* renamed from: h0 */
    public final AbstractC51767xi2 m109519h0() {
        AbstractC51767xi2 mo11844g0;
        String m3304W = m3304W();
        return (m3304W == null || (mo11844g0 = mo11844g0(m3304W)) == null) ? mo11842v0() : mo11844g0;
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: i0 */
    public boolean mo3317J(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        AbstractC37303Yi2 m109506u0 = m109506u0(tag);
        if (!mo13803d().m64102e().m30061m() && m109520f0(m109506u0, "boolean").m98484c()) {
            throw C32857Fi2.m106730f(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", m109519h0().toString());
        }
        try {
            Boolean m528e = C52953zi2.m528e(m109506u0);
            if (m528e != null) {
                return m528e.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            m109505w0("boolean");
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: j0 */
    public byte mo3316K(String tag) {
        Byte b;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int m523j = C52953zi2.m523j(m109506u0(tag));
            boolean z = false;
            if (-128 <= m523j && m523j <= 127) {
                z = true;
            }
            if (z) {
                b = Byte.valueOf((byte) m523j);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            m109505w0("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            m109505w0("byte");
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: k0 */
    public char mo3315L(String tag) {
        char single;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            single = StringsKt___StringsKt.single(m109506u0(tag).mo74434a());
            return single;
        } catch (IllegalArgumentException unused) {
            m109505w0("char");
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: l0 */
    public double mo3314M(String tag) {
        boolean z;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            double m526g = C52953zi2.m526g(m109506u0(tag));
            if (!mo13803d().m64102e().m30073a()) {
                if (!Double.isInfinite(m526g) && !Double.isNaN(m526g)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw C32857Fi2.m106735a(Double.valueOf(m526g), tag, m109519h0().toString());
                }
            }
            return m526g;
        } catch (IllegalArgumentException unused) {
            m109505w0("double");
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: m0 */
    public int mo3313N(String tag, InterfaceC34588Ms5 enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return C34729Ni2.m93553j(enumDescriptor, mo13803d(), m109506u0(tag).mo74434a(), null, 4, null);
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: n0 */
    public float mo3312O(String tag) {
        boolean z;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            float m524i = C52953zi2.m524i(m109506u0(tag));
            if (!mo13803d().m64102e().m30073a()) {
                if (!Float.isInfinite(m524i) && !Float.isNaN(m524i)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw C32857Fi2.m106735a(Float.valueOf(m524i), tag, m109519h0().toString());
                }
            }
            return m524i;
        } catch (IllegalArgumentException unused) {
            m109505w0("float");
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: o0 */
    public GV0 mo3311P(String tag, InterfaceC34588Ms5 inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (JR5.m100461b(inlineDescriptor)) {
            return new C49396ti2(new WR5(m109506u0(tag).mo74434a()), mo13803d());
        }
        return super.mo3311P(tag, inlineDescriptor);
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: p0 */
    public int mo3310Q(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return C52953zi2.m523j(m109506u0(tag));
        } catch (IllegalArgumentException unused) {
            m109505w0("int");
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: q0 */
    public long mo3309R(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return C52953zi2.m519n(m109506u0(tag));
        } catch (IllegalArgumentException unused) {
            m109505w0("long");
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: r0 */
    public boolean mo3308S(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (mo11844g0(tag) != C35197Pi2.INSTANCE) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: s0 */
    public short mo3307T(String tag) {
        Short sh;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int m523j = C52953zi2.m523j(m109506u0(tag));
            boolean z = false;
            if (-32768 <= m523j && m523j <= 32767) {
                z = true;
            }
            if (z) {
                sh = Short.valueOf((short) m523j);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            m109505w0("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            m109505w0("short");
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC52265yY5
    /* renamed from: t0 */
    public String mo3306U(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        AbstractC37303Yi2 m109506u0 = m109506u0(tag);
        if (!mo13803d().m64102e().m30061m() && !m109520f0(m109506u0, "string").m98484c()) {
            throw C32857Fi2.m106730f(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", m109519h0().toString());
        } else if (!(m109506u0 instanceof C35197Pi2)) {
            return m109506u0.mo74434a();
        } else {
            throw C32857Fi2.m106730f(-1, "Unexpected 'null' value instead of string literal", m109519h0().toString());
        }
    }

    /* renamed from: u0 */
    public final AbstractC37303Yi2 m109506u0(String tag) {
        AbstractC37303Yi2 abstractC37303Yi2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        AbstractC51767xi2 mo11844g0 = mo11844g0(tag);
        if (mo11844g0 instanceof AbstractC37303Yi2) {
            abstractC37303Yi2 = (AbstractC37303Yi2) mo11844g0;
        } else {
            abstractC37303Yi2 = null;
        }
        if (abstractC37303Yi2 != null) {
            return abstractC37303Yi2;
        }
        throw C32857Fi2.m106730f(-1, "Expected JsonPrimitive at " + tag + ", found " + mo11844g0, m109519h0().toString());
    }

    @Override // p000.InterfaceC48803si2
    /* renamed from: v */
    public AbstractC51767xi2 mo13802v() {
        return m109519h0();
    }

    /* renamed from: v0 */
    public AbstractC51767xi2 mo11842v0() {
        return this.f6810d;
    }

    /* renamed from: w0 */
    public final Void m109505w0(String str) {
        throw C32857Fi2.m106730f(-1, "Failed to parse '" + str + CoreConstants.SINGLE_QUOTE_CHAR, m109519h0().toString());
    }

    public AbstractC1694E0(AbstractC38706bi2 abstractC38706bi2, AbstractC51767xi2 abstractC51767xi2) {
        this.f6809c = abstractC38706bi2;
        this.f6810d = abstractC51767xi2;
        this.f6811e = mo13803d().m64102e();
    }
}
