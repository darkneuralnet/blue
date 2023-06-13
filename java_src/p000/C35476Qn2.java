package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\r\u001a\u00020\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0014R\u00020\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LQn2;", "", "key", "c", "", "index", "Lkotlin/Function0;", "", "b", "(ILjava/lang/Object;)Lkotlin/jvm/functions/Function2;", "LEi5;", C17296a.f69688o, "LEi5;", "saveableStateHolder", "LRn2;", "Lkotlin/jvm/functions/Function0;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/jvm/functions/Function0;", "itemProvider", "", "LQn2$a;", "Ljava/util/Map;", "lambdasCache", "<init>", "(LEi5;Lkotlin/jvm/functions/Function0;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35476Qn2 {

    /* renamed from: a */
    public final InterfaceC32626Ei5 f30933a;

    /* renamed from: b */
    public final Function0<InterfaceC35710Rn2> f30934b;

    /* renamed from: c */
    public final Map<Object, C6901a> f30935c;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005¨\u0006\u001d"}, m28432d2 = {"LQn2$a;", "", "Lkotlin/Function0;", "", "c", "()Lkotlin/jvm/functions/Function2;", C17296a.f69688o, "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "key", "b", "g", "type", "", "<set-?>", "LEX2;", "f", "()I", "h", "(I)V", "lastKnownIndex", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "_content", "content", "initialIndex", "<init>", "(LQn2;ILjava/lang/Object;Ljava/lang/Object;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n76#2:113\n102#2,2:114\n1#3:116\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n*L\n83#1:113\n83#1:114,2\n*E\n"})
    /* renamed from: Qn2$a */
    /* loaded from: classes.dex */
    public final class C6901a {

        /* renamed from: a */
        public final Object f30936a;

        /* renamed from: b */
        public final Object f30937b;

        /* renamed from: c */
        public final EX2 f30938c;

        /* renamed from: d */
        public Function2<? super InterfaceC32720Et0, ? super Integer, Unit> f30939d;

        /* renamed from: e */
        public final /* synthetic */ C35476Qn2 f30940e;

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Qn2$a$a */
        /* loaded from: classes.dex */
        public static final class C6902a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C35476Qn2 f30941g;

            /* renamed from: h */
            public final /* synthetic */ C6901a f30942h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Qn2$a$a$a */
            /* loaded from: classes.dex */
            public static final class C6903a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ InterfaceC35710Rn2 f30943g;

                /* renamed from: h */
                public final /* synthetic */ int f30944h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6903a(InterfaceC35710Rn2 interfaceC35710Rn2, int i) {
                    super(2);
                    this.f30943g = interfaceC35710Rn2;
                    this.f30944h = i;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                    invoke(interfaceC32720Et0, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                    if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                        interfaceC32720Et0.mo89548k();
                        return;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-1238863364, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous>.<anonymous> (LazyLayoutItemContentFactory.kt:97)");
                    }
                    this.f30943g.mo15367f(this.f30944h, interfaceC32720Et0, 0);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,112:1\n62#2,5:113\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n*L\n104#1:113,5\n*E\n"})
            /* renamed from: Qn2$a$a$b */
            /* loaded from: classes.dex */
            public static final class C6904b extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

                /* renamed from: g */
                public final /* synthetic */ C6901a f30945g;

                @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"Qn2$a$a$b$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n*L\n1#1,484:1\n106#2,2:485\n*E\n"})
                /* renamed from: Qn2$a$a$b$a */
                /* loaded from: classes.dex */
                public static final class C6905a implements InterfaceC44288l51 {

                    /* renamed from: a */
                    public final /* synthetic */ C6901a f30946a;

                    public C6905a(C6901a c6901a) {
                        this.f30946a = c6901a;
                    }

                    @Override // p000.InterfaceC44288l51
                    public void dispose() {
                        this.f30946a.f30939d = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6904b(C6901a c6901a) {
                    super(1);
                    this.f30945g = c6901a;
                }

                @Override // kotlin.jvm.functions.Function1
                public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    return new C6905a(this.f30945g);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6902a(C35476Qn2 c35476Qn2, C6901a c6901a) {
                super(2);
                this.f30941g = c35476Qn2;
                this.f30942h = c6901a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                int m87924f;
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1403994769, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:89)");
                }
                InterfaceC35710Rn2 invoke = this.f30941g.m87930d().invoke();
                Integer num = invoke.mo15370b().get(this.f30942h.m87925e());
                if (num != null) {
                    this.f30942h.m87922h(num.intValue());
                    m87924f = num.intValue();
                } else {
                    m87924f = this.f30942h.m87924f();
                }
                interfaceC32720Et0.mo89638F(-715770513);
                if (m87924f < invoke.getItemCount()) {
                    Object mo15369c = invoke.mo15369c(m87924f);
                    if (Intrinsics.areEqual(mo15369c, this.f30942h.m87925e())) {
                        this.f30941g.f30933a.mo99678c(mo15369c, C43575jt0.m29791b(interfaceC32720Et0, -1238863364, true, new C6903a(invoke, m87924f)), interfaceC32720Et0, 568);
                    }
                }
                interfaceC32720Et0.mo89605Q();
                Y91.m75536c(this.f30942h.m87925e(), new C6904b(this.f30942h), interfaceC32720Et0, 8);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        public C6901a(C35476Qn2 c35476Qn2, int i, Object key, Object obj) {
            EX2 m97025e;
            Intrinsics.checkNotNullParameter(key, "key");
            this.f30940e = c35476Qn2;
            this.f30936a = key;
            this.f30937b = obj;
            m97025e = LM5.m97025e(Integer.valueOf(i), null, 2, null);
            this.f30938c = m97025e;
        }

        /* renamed from: c */
        public final Function2<InterfaceC32720Et0, Integer, Unit> m87927c() {
            return C43575jt0.m29790c(1403994769, true, new C6902a(this.f30940e, this));
        }

        /* renamed from: d */
        public final Function2<InterfaceC32720Et0, Integer, Unit> m87926d() {
            Function2 function2 = this.f30939d;
            if (function2 == null) {
                Function2<InterfaceC32720Et0, Integer, Unit> m87927c = m87927c();
                this.f30939d = m87927c;
                return m87927c;
            }
            return function2;
        }

        /* renamed from: e */
        public final Object m87925e() {
            return this.f30936a;
        }

        /* renamed from: f */
        public final int m87924f() {
            return ((Number) this.f30938c.getValue()).intValue();
        }

        /* renamed from: g */
        public final Object m87923g() {
            return this.f30937b;
        }

        /* renamed from: h */
        public final void m87922h(int i) {
            this.f30938c.setValue(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C35476Qn2(InterfaceC32626Ei5 saveableStateHolder, Function0<? extends InterfaceC35710Rn2> itemProvider) {
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.f30933a = saveableStateHolder;
        this.f30934b = itemProvider;
        this.f30935c = new LinkedHashMap();
    }

    /* renamed from: b */
    public final Function2<InterfaceC32720Et0, Integer, Unit> m87932b(int i, Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C6901a c6901a = this.f30935c.get(key);
        Object mo15371a = this.f30934b.invoke().mo15371a(i);
        if (c6901a != null && c6901a.m87924f() == i && Intrinsics.areEqual(c6901a.m87923g(), mo15371a)) {
            return c6901a.m87926d();
        }
        C6901a c6901a2 = new C6901a(this, i, key, mo15371a);
        this.f30935c.put(key, c6901a2);
        return c6901a2.m87926d();
    }

    /* renamed from: c */
    public final Object m87931c(Object obj) {
        C6901a c6901a = this.f30935c.get(obj);
        if (c6901a != null) {
            return c6901a.m87923g();
        }
        InterfaceC35710Rn2 invoke = this.f30934b.invoke();
        Integer num = invoke.mo15370b().get(obj);
        if (num != null) {
            return invoke.mo15371a(num.intValue());
        }
        return null;
    }

    /* renamed from: d */
    public final Function0<InterfaceC35710Rn2> m87930d() {
        return this.f30934b;
    }
}
