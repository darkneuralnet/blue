package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bV\u0010WJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019J\u0006\u0010\u001d\u001a\u00020\u0005J\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u0011R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010!R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R*\u0010;\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000309\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010:R$\u0010@\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010C\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u0011\u0010E\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bD\u0010=R\u0011\u0010G\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bF\u0010=R$\u0010J\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010=\"\u0004\bI\u0010?R$\u0010M\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010=\"\u0004\bL\u0010?R$\u0010P\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R$\u0010S\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010=\"\u0004\bR\u0010?R\u0011\u0010U\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bT\u0010=¨\u0006X"}, m28432d2 = {"Los4;", "LWm5;", "Lns4;", "LEt0;", "composer", "", "h", "", "value", "Lo72;", "t", "x", "Lcu0;", "composition", "g", "invalidate", "Lkotlin/Function2;", "", "block", C17296a.f69688o, "token", "H", "z", "instance", "w", "LlW1;", "instances", "", "v", "y", "Lkotlin/Function1;", "LXt0;", "i", "I", "flags", "<set-?>", "b", "Lcu0;", "l", "()Lcu0;", "Ldb;", "c", "Ldb;", "j", "()Ldb;", "A", "(Ldb;)V", "anchor", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "e", "currentToken", "LjW1;", "f", "LjW1;", "trackedInstances", "LkW1;", "Lu01;", "LkW1;", "trackedDependencies", "p", "()Z", "E", "(Z)V", "rereading", "q", "F", "skipped", "s", "valid", "k", "canRecompose", "r", "G", "used", "m", "B", "defaultsInScope", "n", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "defaultsInvalid", "o", "D", "requiresRecompose", "u", "isConditional", "<init>", "(Lcu0;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,349:1\n1#2:350\n1726#3,3:351\n159#4,4:354\n152#4,4:358\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n280#1:351,3\n298#1:354,4\n321#1:358,4\n*E\n"})
/* renamed from: os4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46534os4 implements InterfaceC36874Wm5, InterfaceC45941ns4 {

    /* renamed from: a */
    public int f102678a;

    /* renamed from: b */
    public C39435cu0 f102679b;

    /* renamed from: c */
    public C19797db f102680c;

    /* renamed from: d */
    public Function2<? super InterfaceC32720Et0, ? super Integer, Unit> f102681d;

    /* renamed from: e */
    public int f102682e;

    /* renamed from: f */
    public C43350jW1 f102683f;

    /* renamed from: g */
    public C43943kW1<InterfaceC49574u01<?>, Object> f102684g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LXt0;", "composition", "", C17296a.f69688o, "(LXt0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,349:1\n132#2,18:350\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n327#1:350,18\n*E\n"})
    /* renamed from: os4$a */
    /* loaded from: classes.dex */
    public static final class C27086a extends Lambda implements Function1<InterfaceC37166Xt0, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f102686h;

        /* renamed from: i */
        public final /* synthetic */ C43350jW1 f102687i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27086a(int i, C43350jW1 c43350jW1) {
            super(1);
            this.f102686h = i;
            this.f102687i = c43350jW1;
        }

        /* renamed from: a */
        public final void m20379a(InterfaceC37166Xt0 composition) {
            boolean z;
            InterfaceC49574u01<?> interfaceC49574u01;
            Intrinsics.checkNotNullParameter(composition, "composition");
            if (C46534os4.this.f102682e == this.f102686h && Intrinsics.areEqual(this.f102687i, C46534os4.this.f102683f) && (composition instanceof C39435cu0)) {
                C43350jW1 c43350jW1 = this.f102687i;
                int i = this.f102686h;
                C46534os4 c46534os4 = C46534os4.this;
                int m30400e = c43350jW1.m30400e();
                int i2 = 0;
                for (int i3 = 0; i3 < m30400e; i3++) {
                    Object obj = c43350jW1.m30401d()[i3];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i4 = c43350jW1.m30399f()[i3];
                    if (i4 != i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C39435cu0 c39435cu0 = (C39435cu0) composition;
                        c39435cu0.m44881E(obj, c46534os4);
                        if (obj instanceof InterfaceC49574u01) {
                            interfaceC49574u01 = (InterfaceC49574u01) obj;
                        } else {
                            interfaceC49574u01 = null;
                        }
                        if (interfaceC49574u01 != null) {
                            c39435cu0.m44882D(interfaceC49574u01);
                            C43943kW1 c43943kW1 = c46534os4.f102684g;
                            if (c43943kW1 != null) {
                                c43943kW1.m28892j(interfaceC49574u01);
                                if (c43943kW1.m28895g() == 0) {
                                    c46534os4.f102684g = null;
                                }
                            }
                        }
                    }
                    if (!z) {
                        if (i2 != i3) {
                            c43350jW1.m30401d()[i2] = obj;
                            c43350jW1.m30399f()[i2] = i4;
                        }
                        i2++;
                    }
                }
                int m30400e2 = c43350jW1.m30400e();
                for (int i5 = i2; i5 < m30400e2; i5++) {
                    c43350jW1.m30401d()[i5] = null;
                }
                c43350jW1.m30398g(i2);
                if (this.f102687i.m30400e() == 0) {
                    C46534os4.this.f102683f = null;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37166Xt0 interfaceC37166Xt0) {
            m20379a(interfaceC37166Xt0);
            return Unit.INSTANCE;
        }
    }

    public C46534os4(C39435cu0 c39435cu0) {
        this.f102679b = c39435cu0;
    }

    /* renamed from: A */
    public final void m20413A(C19797db c19797db) {
        this.f102680c = c19797db;
    }

    /* renamed from: B */
    public final void m20412B(boolean z) {
        if (z) {
            this.f102678a |= 2;
        } else {
            this.f102678a &= -3;
        }
    }

    /* renamed from: C */
    public final void m20411C(boolean z) {
        if (z) {
            this.f102678a |= 4;
        } else {
            this.f102678a &= -5;
        }
    }

    /* renamed from: D */
    public final void m20410D(boolean z) {
        if (z) {
            this.f102678a |= 8;
        } else {
            this.f102678a &= -9;
        }
    }

    /* renamed from: E */
    public final void m20409E(boolean z) {
        if (z) {
            this.f102678a |= 32;
        } else {
            this.f102678a &= -33;
        }
    }

    /* renamed from: F */
    public final void m20408F(boolean z) {
        if (z) {
            this.f102678a |= 16;
        } else {
            this.f102678a &= -17;
        }
    }

    /* renamed from: G */
    public final void m20407G(boolean z) {
        if (z) {
            this.f102678a |= 1;
        } else {
            this.f102678a &= -2;
        }
    }

    /* renamed from: H */
    public final void m20406H(int i) {
        this.f102682e = i;
        m20408F(false);
    }

    @Override // p000.InterfaceC36874Wm5
    /* renamed from: a */
    public void mo20405a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f102681d = block;
    }

    /* renamed from: g */
    public final void m20399g(C39435cu0 composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.f102679b = composition;
    }

    /* renamed from: h */
    public final void m20398h(InterfaceC32720Et0 composer) {
        Unit unit;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2 = this.f102681d;
        if (function2 != null) {
            function2.invoke(composer, 1);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new IllegalStateException("Invalid restart scope".toString());
    }

    /* renamed from: i */
    public final Function1<InterfaceC37166Xt0, Unit> m20397i(int i) {
        boolean z;
        C43350jW1 c43350jW1 = this.f102683f;
        if (c43350jW1 == null || m20389q()) {
            return null;
        }
        int m30400e = c43350jW1.m30400e();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= m30400e) {
                break;
            }
            Intrinsics.checkNotNull(c43350jW1.m30401d()[i2], "null cannot be cast to non-null type kotlin.Any");
            if (c43350jW1.m30399f()[i2] != i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (!z2) {
            return null;
        }
        return new C27086a(i, c43350jW1);
    }

    @Override // p000.InterfaceC45941ns4
    public void invalidate() {
        C39435cu0 c39435cu0 = this.f102679b;
        if (c39435cu0 != null) {
            c39435cu0.m44885A(this, null);
        }
    }

    /* renamed from: j */
    public final C19797db m20396j() {
        return this.f102680c;
    }

    /* renamed from: k */
    public final boolean m20395k() {
        return this.f102681d != null;
    }

    /* renamed from: l */
    public final C39435cu0 m20394l() {
        return this.f102679b;
    }

    /* renamed from: m */
    public final boolean m20393m() {
        return (this.f102678a & 2) != 0;
    }

    /* renamed from: n */
    public final boolean m20392n() {
        return (this.f102678a & 4) != 0;
    }

    /* renamed from: o */
    public final boolean m20391o() {
        return (this.f102678a & 8) != 0;
    }

    /* renamed from: p */
    public final boolean m20390p() {
        return (this.f102678a & 32) != 0;
    }

    /* renamed from: q */
    public final boolean m20389q() {
        return (this.f102678a & 16) != 0;
    }

    /* renamed from: r */
    public final boolean m20388r() {
        return (this.f102678a & 1) != 0;
    }

    /* renamed from: s */
    public final boolean m20387s() {
        if (this.f102679b != null) {
            C19797db c19797db = this.f102680c;
            return c19797db != null ? c19797db.m44094b() : false;
        }
        return false;
    }

    /* renamed from: t */
    public final EnumC46088o72 m20386t(Object obj) {
        EnumC46088o72 m44885A;
        C39435cu0 c39435cu0 = this.f102679b;
        return (c39435cu0 == null || (m44885A = c39435cu0.m44885A(this, obj)) == null) ? EnumC46088o72.IGNORED : m44885A;
    }

    /* renamed from: u */
    public final boolean m20385u() {
        return this.f102684g != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m20384v(C44536lW1<Object> c44536lW1) {
        C43943kW1<InterfaceC49574u01<?>, Object> c43943kW1;
        boolean z;
        boolean z2;
        if (c44536lW1 != null && (c43943kW1 = this.f102684g) != null && c44536lW1.m27193h()) {
            if (!c44536lW1.isEmpty()) {
                for (Object obj : c44536lW1) {
                    if (obj instanceof InterfaceC49574u01) {
                        InterfaceC49574u01<?> interfaceC49574u01 = (InterfaceC49574u01) obj;
                        EM5<?> mo11110a = interfaceC49574u01.mo11110a();
                        if (mo11110a == null) {
                            mo11110a = GM5.m105191p();
                        }
                        if (mo11110a.mo26703a(interfaceC49574u01.mo11109d(), c43943kW1.m28897e(interfaceC49574u01))) {
                            z = true;
                            continue;
                            if (!z) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z = false;
                    continue;
                    if (!z) {
                    }
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public final void m20383w(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (m20390p()) {
            return;
        }
        C43350jW1 c43350jW1 = this.f102683f;
        if (c43350jW1 == null) {
            c43350jW1 = new C43350jW1();
            this.f102683f = c43350jW1;
        }
        c43350jW1.m30404a(instance, this.f102682e);
        if (instance instanceof InterfaceC49574u01) {
            C43943kW1<InterfaceC49574u01<?>, Object> c43943kW1 = this.f102684g;
            if (c43943kW1 == null) {
                c43943kW1 = new C43943kW1<>(0, 1, null);
                this.f102684g = c43943kW1;
            }
            c43943kW1.m28891k(instance, ((InterfaceC49574u01) instance).mo11109d());
        }
    }

    /* renamed from: x */
    public final void m20382x() {
        this.f102679b = null;
        this.f102683f = null;
        this.f102684g = null;
    }

    /* renamed from: y */
    public final void m20381y() {
        C43350jW1 c43350jW1;
        C39435cu0 c39435cu0 = this.f102679b;
        if (c39435cu0 != null && (c43350jW1 = this.f102683f) != null) {
            m20409E(true);
            try {
                int m30400e = c43350jW1.m30400e();
                for (int i = 0; i < m30400e; i++) {
                    Object obj = c43350jW1.m30401d()[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i2 = c43350jW1.m30399f()[i];
                    c39435cu0.mo24217p(obj);
                }
            } finally {
                m20409E(false);
            }
        }
    }

    /* renamed from: z */
    public final void m20380z() {
        m20408F(true);
    }
}
