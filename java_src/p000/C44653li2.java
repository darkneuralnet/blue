package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0006\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001b\u0010\t\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\f"}, m28432d2 = {"Lli2;", "", "LoE1;", "b", "Lkotlin/Lazy;", "()LoE1;", "nonNullSerializerInstance", "c", C17296a.f69688o, "instance", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: li2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44653li2 {

    /* renamed from: a */
    public static final C44653li2 f96593a = new C44653li2();

    /* renamed from: b */
    public static final Lazy f96594b;

    /* renamed from: c */
    public static final Lazy f96595c;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LoE1;", "kotlin.jvm.PlatformType", "b", "()LoE1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: li2$a */
    /* loaded from: classes5.dex */
    public static final class C25767a extends Lambda implements Function0<C46153oE1> {

        /* renamed from: g */
        public static final C25767a f96596g = new C25767a();

        public C25767a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C46153oE1 invoke() {
            return C44653li2.f96593a.m26933b().m21549t().m19802h().m19808b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LoE1;", "kotlin.jvm.PlatformType", "b", "()LoE1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: li2$b */
    /* loaded from: classes5.dex */
    public static final class C25768b extends Lambda implements Function0<C46153oE1> {

        /* renamed from: g */
        public static final C25768b f96597g = new C25768b();

        public C25768b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C46153oE1 invoke() {
            return new C46746pE1().m19807c().m19798l().m19808b();
        }
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(C25768b.f96597g);
        f96594b = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(C25767a.f96596g);
        f96595c = lazy2;
    }

    private C44653li2() {
    }

    /* renamed from: a */
    public final C46153oE1 m26934a() {
        Object value = f96595c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-instance>(...)");
        return (C46153oE1) value;
    }

    /* renamed from: b */
    public final C46153oE1 m26933b() {
        Object value = f96594b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-nonNullSerializerInstance>(...)");
        return (C46153oE1) value;
    }
}
