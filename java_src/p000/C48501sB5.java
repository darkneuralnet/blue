package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23490m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJv\u0010\r\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\f0\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00030\u0006H\u0007J\u0090\u0001\u0010\u0011\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00100\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00030\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00040\u0006H\u0007JÞ\u0001\u0010\u0019\u001a8\u00124\u00122\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u00180\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u000e\"\u0004\b\u0005\u0010\u0012\"\u0004\b\u0006\u0010\u0013\"\u0004\b\u0007\u0010\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00030\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00040\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00050\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00060\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00070\u0006H\u0007¨\u0006\u001c"}, m28432d2 = {"LsB5;", "", "T1", "T2", "T3", "T4", "Lio/reactivex/K;", "s1", "s2", "s3", "s4", "Lio/reactivex/F;", "Lwb4;", DateTokenConverter.CONVERTER_KEY, "T5", "s5", "LRe4;", "e", "T6", "T7", "T8", "s6", "s7", "s8", "Lje3;", "f", "<init>", "()V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sB5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48501sB5 {

    /* renamed from: a */
    public static final C48501sB5 f108430a = new C48501sB5();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sB5$a */
    /* loaded from: classes3.dex */
    public static final class C28230a extends Lambda implements Function4<T1, T2, T3, T4, C51106wb4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> {

        /* renamed from: g */
        public static final C28230a f108431g = new C28230a();

        public C28230a() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> invoke(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sB5$b */
    /* loaded from: classes3.dex */
    public static final class C28231b extends Lambda implements Function5<T1, T2, T3, T4, T5, C35631Re4<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> {

        /* renamed from: g */
        public static final C28231b f108432g = new C28231b();

        public C28231b() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0011\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u0005\"\u0004\b\u0006\u0010\u0006\"\u0004\b\u0007\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u00042\u0006\u0010\r\u001a\u00028\u00052\u0006\u0010\u000e\u001a\u00028\u00062\u0006\u0010\u000f\u001a\u00028\u0007H\n¢\u0006\u0004\b\u0011\u0010\u0012"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "t1", "t2", "t3", "t4", "t5", "t6", "t7", "t8", "Lje3;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lje3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sB5$c */
    /* loaded from: classes3.dex */
    public static final class C28232c extends Lambda implements Function8<T1, T2, T3, T4, T5, T6, T7, T8, C43428je3<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> {

        /* renamed from: g */
        public static final C28232c f108433g = new C28232c();

        public C28232c() {
            super(8);
        }

        @Override // kotlin.jvm.functions.Function8
        /* renamed from: a */
        public final C43428je3<T1, T2, T3, T4, T5, T6, T7, T8> invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
            return new C43428je3<>(t1, t2, t3, t4, t5, t6, t7, t8);
        }
    }

    private C48501sB5() {
    }

    /* renamed from: g */
    public static final C51106wb4 m14576g(Function4 tmp0, Object obj, Object obj2, Object obj3, Object obj4) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C51106wb4) tmp0.invoke(obj, obj2, obj3, obj4);
    }

    /* renamed from: h */
    public static final C35631Re4 m14575h(Function5 tmp0, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C35631Re4) tmp0.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: i */
    public static final C43428je3 m14574i(Function8 tmp0, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C43428je3) tmp0.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    /* renamed from: d */
    public final <T1, T2, T3, T4> AbstractC23442F<C51106wb4<T1, T2, T3, T4>> m14579d(InterfaceC23447K<T1> s1, InterfaceC23447K<T2> s2, InterfaceC23447K<T3> s3, InterfaceC23447K<T4> s4) {
        Intrinsics.checkNotNullParameter(s1, "s1");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Intrinsics.checkNotNullParameter(s3, "s3");
        Intrinsics.checkNotNullParameter(s4, "s4");
        final C28230a c28230a = C28230a.f108431g;
        AbstractC23442F<C51106wb4<T1, T2, T3, T4>> m33113p0 = AbstractC23442F.m33113p0(s1, s2, s3, s4, new InterfaceC23486i() { // from class: qB5
            @Override // io.reactivex.functions.InterfaceC23486i
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                C51106wb4 m14576g;
                m14576g = C48501sB5.m14576g(Function4.this, obj, obj2, obj3, obj4);
                return m14576g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33113p0, "zip(s1, s2, s3, s4, { t1…> Quad(t1, t2, t3, t4) })");
        return m33113p0;
    }

    /* renamed from: e */
    public final <T1, T2, T3, T4, T5> AbstractC23442F<C35631Re4<T1, T2, T3, T4, T5>> m14578e(InterfaceC23447K<T1> s1, InterfaceC23447K<T2> s2, InterfaceC23447K<T3> s3, InterfaceC23447K<T4> s4, InterfaceC23447K<T5> s5) {
        Intrinsics.checkNotNullParameter(s1, "s1");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Intrinsics.checkNotNullParameter(s3, "s3");
        Intrinsics.checkNotNullParameter(s4, "s4");
        Intrinsics.checkNotNullParameter(s5, "s5");
        final C28231b c28231b = C28231b.f108432g;
        AbstractC23442F<C35631Re4<T1, T2, T3, T4, T5>> m33115o0 = AbstractC23442F.m33115o0(s1, s2, s3, s4, s5, new InterfaceC23487j() { // from class: pB5
            @Override // io.reactivex.functions.InterfaceC23487j
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                C35631Re4 m14575h;
                m14575h = C48501sB5.m14575h(Function5.this, obj, obj2, obj3, obj4, obj5);
                return m14575h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33115o0, "zip(s1, s2, s3, s4, s5, …nt(t1, t2, t3, t4, t5) })");
        return m33115o0;
    }

    /* renamed from: f */
    public final <T1, T2, T3, T4, T5, T6, T7, T8> AbstractC23442F<C43428je3<T1, T2, T3, T4, T5, T6, T7, T8>> m14577f(InterfaceC23447K<T1> s1, InterfaceC23447K<T2> s2, InterfaceC23447K<T3> s3, InterfaceC23447K<T4> s4, InterfaceC23447K<T5> s5, InterfaceC23447K<T6> s6, InterfaceC23447K<T7> s7, InterfaceC23447K<T8> s8) {
        Intrinsics.checkNotNullParameter(s1, "s1");
        Intrinsics.checkNotNullParameter(s2, "s2");
        Intrinsics.checkNotNullParameter(s3, "s3");
        Intrinsics.checkNotNullParameter(s4, "s4");
        Intrinsics.checkNotNullParameter(s5, "s5");
        Intrinsics.checkNotNullParameter(s6, "s6");
        Intrinsics.checkNotNullParameter(s7, "s7");
        Intrinsics.checkNotNullParameter(s8, "s8");
        final C28232c c28232c = C28232c.f108433g;
        AbstractC23442F<C43428je3<T1, T2, T3, T4, T5, T6, T7, T8>> m33117n0 = AbstractC23442F.m33117n0(s1, s2, s3, s4, s5, s6, s7, s8, new InterfaceC23490m() { // from class: rB5
            @Override // io.reactivex.functions.InterfaceC23490m
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                C43428je3 m14574i;
                m14574i = C48501sB5.m14574i(Function8.this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
                return m14574i;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33117n0, "zip(s1, s2, s3, s4, s5, …3, t4, t5, t6, t7, t8) })");
        return m33117n0;
    }
}
