package p000;

import co.bird.android.model.exception.BluetoothException;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24567g;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34533Mm4;
@Metadata(m28433d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\u001a*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\f"}, m28432d2 = {"T", "", "LNm4;", "Lio/reactivex/F;", "raceParticipants", "q", "LvT3;", "piggybackSession", "n", "Lio/reactivex/subjects/g;", "A", "w", "rx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Race.kt\nco/bird/android/library/rx/RaceKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,149:1\n125#2:150\n152#2,3:151\n*S KotlinDebug\n*F\n+ 1 Race.kt\nco/bird/android/library/rx/RaceKt\n*L\n48#1:150\n48#1:151,3\n*E\n"})
/* renamed from: Mm4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34533Mm4 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "requestsStarted", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mm4$a */
    /* loaded from: classes3.dex */
    public static final class C5360a extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ C50439vT3<T> f23539g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC23442F<T> f23540h;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Mm4$a$a */
        /* loaded from: classes3.dex */
        public static final class C5361a extends Lambda implements Function1<T, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C50439vT3<T> f23541g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5361a(C50439vT3<T> c50439vT3) {
                super(1);
                this.f23541g = c50439vT3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C5361a) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                this.f23541g.m8619c().onSuccess(t);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Mm4$a$b */
        /* loaded from: classes3.dex */
        public static final class C5362b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C50439vT3<T> f23542g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5362b(C50439vT3<T> c50439vT3) {
                super(1);
                this.f23542g = c50439vT3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f23542g.m8619c().onError(th);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5360a(C50439vT3<T> c50439vT3, AbstractC23442F<T> abstractC23442F) {
            super(1);
            this.f23539g = c50439vT3;
            this.f23540h = abstractC23442F;
        }

        /* renamed from: d */
        public static final void m94845d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends T> invoke(Boolean requestsStarted) {
            Intrinsics.checkNotNullParameter(requestsStarted, "requestsStarted");
            if (requestsStarted.booleanValue()) {
                return C34533Mm4.m94878A(this.f23539g.m8619c());
            }
            AbstractC23442F<T> abstractC23442F = this.f23540h;
            final C5361a c5361a = new C5361a(this.f23539g);
            AbstractC23442F m33101w = abstractC23442F.m33101w(new InterfaceC23484g() { // from class: Km4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34533Mm4.C5360a.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C5362b c5362b = new C5362b(this.f23539g);
            AbstractC23442F m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: Lm4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34533Mm4.C5360a.m94845d(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33106t, "piggybackSession: Piggyb…t.onError(it)\n          }");
            return C34533Mm4.m94852w(m33106t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mm4$b */
    /* loaded from: classes3.dex */
    public static final class C5363b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EnumC34767Nm4 f23543g;

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<Throwable> f23544h;

        /* renamed from: i */
        public final /* synthetic */ Ref.ObjectRef<String> f23545i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5363b(EnumC34767Nm4 enumC34767Nm4, Ref.ObjectRef<Throwable> objectRef, Ref.ObjectRef<String> objectRef2) {
            super(1);
            this.f23543g = enumC34767Nm4;
            this.f23544h = objectRef;
            this.f23545i = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            EnumC34767Nm4 enumC34767Nm4 = this.f23543g;
            String message = th.getMessage();
            C41318g46.m40163a("Received an error from race. Type: " + enumC34767Nm4 + ". Message: " + message + " ", new Object[0]);
            if (!(th instanceof BluetoothException) || this.f23544h.element == null) {
                this.f23544h.element = th;
                this.f23545i.element = this.f23543g.toString();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mm4$c */
    /* loaded from: classes3.dex */
    public static final class C5364c extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EnumC34767Nm4 f23546g;

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<String> f23547h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5364c(EnumC34767Nm4 enumC34767Nm4, Ref.ObjectRef<String> objectRef) {
            super(1);
            this.f23546g = enumC34767Nm4;
            this.f23547h = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C5364c) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
            EnumC34767Nm4 enumC34767Nm4 = this.f23546g;
            C41318g46.m40163a("Received success from race participant. Type: " + enumC34767Nm4, new Object[0]);
            this.f23547h.element = this.f23546g.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "error", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mm4$d */
    /* loaded from: classes3.dex */
    public static final class C5365d extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<Throwable> f23548g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5365d(Ref.ObjectRef<Throwable> objectRef) {
            super(1);
            this.f23548g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends T> invoke(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C41318g46.m40161c(error, "Unknown Error in Race", new Object[0]);
            Throwable th = this.f23548g.element;
            if (th == null) {
                String message = error.getMessage();
                th = new Throwable("Unknown Error in Race: " + message);
            }
            return AbstractC23442F.m33100x(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mm4$e */
    /* loaded from: classes3.dex */
    public static final class C5366e extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<String> f23549g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5366e(Ref.ObjectRef<String> objectRef) {
            super(1);
            this.f23549g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C5366e) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
            String str = this.f23549g.element;
            C41318g46.m40163a("Received first success from race participants. Type: " + ((Object) str), new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mm4$f */
    /* loaded from: classes3.dex */
    public static final class C5367f extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<String> f23550g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5367f(Ref.ObjectRef<String> objectRef) {
            super(1);
            this.f23550g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String str = this.f23550g.element;
            String message = th.getMessage();
            C41318g46.m40163a("Received last error from race participants, passing along to error handler. Type: " + ((Object) str) + ". Message: " + message + " ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mm4$g */
    /* loaded from: classes3.dex */
    public static final class C5368g extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C5368g f23551g = new C5368g();

        public C5368g() {
            super(1);
        }

        /* renamed from: a */
        public final void m94844a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("performOrPiggyback called and subscribed", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m94844a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mm4$h */
    /* loaded from: classes3.dex */
    public static final class C5369h extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public static final C5369h f23552g = new C5369h();

        public C5369h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C5369h) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
            C41318g46.m40163a("performOrPiggyback called, response received, saving result", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mm4$i */
    /* loaded from: classes3.dex */
    public static final class C5370i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C5370i f23553g = new C5370i();

        public C5370i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40163a("performOrPiggyback called, error received, sending now", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mm4$j */
    /* loaded from: classes3.dex */
    public static final class C5371j extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C5371j f23554g = new C5371j();

        public C5371j() {
            super(1);
        }

        /* renamed from: a */
        public final void m94843a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("Subscribing to piggyback subject for request already in progress", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m94843a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mm4$k */
    /* loaded from: classes3.dex */
    public static final class C5372k extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public static final C5372k f23555g = new C5372k();

        public C5372k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C5372k) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
            C41318g46.m40163a("previous call to performOrPiggyback completed, sending that result now", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mm4$l */
    /* loaded from: classes3.dex */
    public static final class C5373l extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C5373l f23556g = new C5373l();

        public C5373l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40163a("previous call to performOrPiggyback failed, sending that error now", new Object[0]);
        }
    }

    /* renamed from: A */
    public static final <T> AbstractC23442F<T> m94878A(C24567g<T> c24567g) {
        if (c24567g.m31879z0()) {
            C41318g46.m40163a("performOrPiggyback called but we already have a result", new Object[0]);
            return c24567g;
        } else if (c24567g.m31880y0()) {
            C41318g46.m40163a("performOrPiggyback called but we already have an error", new Object[0]);
            return c24567g;
        } else {
            final C5371j c5371j = C5371j.f23554g;
            AbstractC23442F<T> m33102v = c24567g.m33102v(new InterfaceC23484g() { // from class: Im4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34533Mm4.m94876C(Function1.this, obj);
                }
            });
            final C5372k c5372k = C5372k.f23555g;
            AbstractC23442F<T> m33101w = m33102v.m33101w(new InterfaceC23484g() { // from class: Jm4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34533Mm4.m94875D(Function1.this, obj);
                }
            });
            final C5373l c5373l = C5373l.f23556g;
            AbstractC23442F<T> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: ym4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34533Mm4.m94877B(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33106t, "this\n    .doOnSubscribe …ng that error now\")\n    }");
            return m33106t;
        }
    }

    /* renamed from: B */
    public static final void m94877B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m94876C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m94875D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final <T> AbstractC23442F<T> m94861n(AbstractC23442F<T> abstractC23442F, final C50439vT3<T> piggybackSession) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        Intrinsics.checkNotNullParameter(piggybackSession, "piggybackSession");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: zm4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean m94860o;
                m94860o = C34533Mm4.m94860o(C50439vT3.this);
                return m94860o;
            }
        });
        final C5360a c5360a = new C5360a(piggybackSession, abstractC23442F);
        AbstractC23442F<T> m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Am4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m94859p;
                m94859p = C34533Mm4.m94859p(Function1.this, obj);
                return m94859p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "Single<T>.performOrPiggy…thLogging()\n      }\n    }");
        return m33165A;
    }

    /* renamed from: o */
    public static final Boolean m94860o(C50439vT3 piggybackSession) {
        Intrinsics.checkNotNullParameter(piggybackSession, "$piggybackSession");
        return Boolean.valueOf(piggybackSession.m8620b().getAndSet(true));
    }

    /* renamed from: p */
    public static final InterfaceC23447K m94859p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final <T> AbstractC23442F<T> m94858q(Map<EnumC34767Nm4, ? extends AbstractC23442F<T>> raceParticipants) {
        Intrinsics.checkNotNullParameter(raceParticipants, "raceParticipants");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ArrayList arrayList = new ArrayList(raceParticipants.size());
        for (Map.Entry<EnumC34767Nm4, ? extends AbstractC23442F<T>> entry : raceParticipants.entrySet()) {
            EnumC34767Nm4 key = entry.getKey();
            AbstractC23442F<T> m33142Y = entry.getValue().m33142Y(C24542a.m31932c());
            final C5363b c5363b = new C5363b(key, objectRef, objectRef2);
            AbstractC23442F<T> m33106t = m33142Y.m33106t(new InterfaceC23484g() { // from class: xm4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34533Mm4.m94857r(Function1.this, obj);
                }
            });
            final C5364c c5364c = new C5364c(key, objectRef2);
            arrayList.add(m33106t.m33101w(new InterfaceC23484g() { // from class: Bm4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34533Mm4.m94856s(Function1.this, obj);
                }
            }).m33123k0().onErrorResumeNext(Observable.empty()));
        }
        AbstractC23442F<T> firstOrError = Observable.merge(arrayList).firstOrError();
        final C5365d c5365d = new C5365d(objectRef);
        AbstractC23442F<T> m33150P = firstOrError.m33150P(new InterfaceC23492o() { // from class: Cm4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m94855t;
                m94855t = C34533Mm4.m94855t(Function1.this, obj);
                return m94855t;
            }
        });
        final C5366e c5366e = new C5366e(objectRef2);
        AbstractC23442F<T> m33101w = m33150P.m33101w(new InterfaceC23484g() { // from class: Dm4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34533Mm4.m94854u(Function1.this, obj);
            }
        });
        final C5367f c5367f = new C5367f(objectRef2);
        AbstractC23442F<T> m33106t2 = m33101w.m33106t(new InterfaceC23484g() { // from class: Em4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34533Mm4.m94853v(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t2, "lastError: Throwable? = …e: ${it.message} \")\n    }");
        return m33106t2;
    }

    /* renamed from: r */
    public static final void m94857r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m94856s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m94855t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m94854u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m94853v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final <T> AbstractC23442F<T> m94852w(AbstractC23442F<T> abstractC23442F) {
        final C5368g c5368g = C5368g.f23551g;
        AbstractC23442F<T> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: Fm4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34533Mm4.m94851x(Function1.this, obj);
            }
        });
        final C5369h c5369h = C5369h.f23552g;
        AbstractC23442F<T> m33101w = m33102v.m33101w(new InterfaceC23484g() { // from class: Gm4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34533Mm4.m94850y(Function1.this, obj);
            }
        });
        final C5370i c5370i = C5370i.f23553g;
        AbstractC23442F<T> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: Hm4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34533Mm4.m94849z(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "this\n    .doOnSubscribe …ived, sending now\")\n    }");
        return m33106t;
    }

    /* renamed from: x */
    public static final void m94851x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m94850y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m94849z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
