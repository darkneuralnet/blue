package p000;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.C11154e;
import androidx.camera.core.InterfaceC11183i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C37791a94;
import p000.C39065cJ1;
import p000.C9555Xx;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u001bB\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b\"\u0004\b\u0000\u0010\r2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000eH\u0002R'\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"LcJ1;", "Landroidx/camera/core/e$a;", "Landroidx/camera/core/i;", "imageProxy", "", DateTokenConverter.CONVERTER_KEY, "Lg32;", Entry.TYPE_IMAGE, "Lio/reactivex/F;", "LcJ1$a;", "", "LBx;", "m", "T", "Lkotlin/Function0;", "Lcom/google/android/gms/tasks/Task;", "task", "n", "LZ84;", "Lco/bird/android/buava/Optional;", "LcJ1$b;", C17296a.f69688o, "Lkotlin/Lazy;", "l", "()LZ84;", "results", "La94;", "b", "La94;", "mutableScanResults", "LUx;", "c", "k", "()LUx;", "barcodeScanner", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cJ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39065cJ1 implements C11154e.InterfaceC11155a {

    /* renamed from: a */
    public final Lazy f60372a;

    /* renamed from: b */
    public final C37791a94<Optional<C13488b>> f60373b;

    /* renamed from: c */
    public final Lazy f60374c;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LcJ1$b;", "", "Landroid/graphics/Rect;", "imageSize", "", "LBx;", "barcodes", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/graphics/Rect;", "c", "()Landroid/graphics/Rect;", "b", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Landroid/graphics/Rect;Ljava/util/List;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: cJ1$b */
    /* loaded from: classes4.dex */
    public static final class C13488b {

        /* renamed from: a */
        public final Rect f60377a;

        /* renamed from: b */
        public final List<C0774Bx> f60378b;

        public C13488b() {
            this(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C13488b copy$default(C13488b c13488b, Rect rect, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                rect = c13488b.f60377a;
            }
            if ((i & 2) != 0) {
                list = c13488b.f60378b;
            }
            return c13488b.m61595a(rect, list);
        }

        /* renamed from: a */
        public final C13488b m61595a(Rect imageSize, List<? extends C0774Bx> barcodes) {
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(barcodes, "barcodes");
            return new C13488b(imageSize, barcodes);
        }

        /* renamed from: b */
        public final List<C0774Bx> m61594b() {
            return this.f60378b;
        }

        /* renamed from: c */
        public final Rect m61593c() {
            return this.f60377a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13488b) {
                C13488b c13488b = (C13488b) obj;
                return Intrinsics.areEqual(this.f60377a, c13488b.f60377a) && Intrinsics.areEqual(this.f60378b, c13488b.f60378b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f60377a.hashCode() * 31) + this.f60378b.hashCode();
        }

        public String toString() {
            Rect rect = this.f60377a;
            List<C0774Bx> list = this.f60378b;
            return "Result(imageSize=" + rect + ", barcodes=" + list + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C13488b(Rect imageSize, List<? extends C0774Bx> barcodes) {
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(barcodes, "barcodes");
            this.f60377a = imageSize;
            this.f60378b = barcodes;
        }

        public /* synthetic */ C13488b(Rect rect, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Rect() : rect, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LcJ1$a;", "", "LBx;", "barcodes", "LcJ1$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LcJ1$a;)LcJ1$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cJ1$c */
    /* loaded from: classes4.dex */
    public static final class C13489c extends Lambda implements Function1<C13487a<List<? extends C0774Bx>>, C13488b> {

        /* renamed from: g */
        public final /* synthetic */ C41304g32 f60379g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13489c(C41304g32 c41304g32) {
            super(1);
            this.f60379g = c41304g32;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C13488b invoke(C13487a<List<C0774Bx>> barcodes) {
            Intrinsics.checkNotNullParameter(barcodes, "barcodes");
            Rect rect = new Rect(0, 0, this.f60379g.m40237l(), this.f60379g.m40241h());
            List<C0774Bx> m61596a = barcodes.m61596a();
            if (m61596a == null) {
                m61596a = CollectionsKt__CollectionsKt.emptyList();
            }
            return new C13488b(rect, m61596a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LcJ1$b;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LcJ1$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cJ1$d */
    /* loaded from: classes4.dex */
    public static final class C13490d extends Lambda implements Function1<C13488b, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC11183i f60381h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13490d(InterfaceC11183i interfaceC11183i) {
            super(1);
            this.f60381h = interfaceC11183i;
        }

        /* renamed from: a */
        public final void m61591a(C13488b it) {
            C37791a94 c37791a94 = C39065cJ1.this.f60373b;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c37791a94.accept(c14443a.m59032c(it));
            this.f60381h.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13488b c13488b) {
            m61591a(c13488b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cJ1$e */
    /* loaded from: classes4.dex */
    public static final class C13491e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC11183i f60383h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13491e(InterfaceC11183i interfaceC11183i) {
            super(1);
            this.f60383h = interfaceC11183i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while processing image", new Object[0]);
            C39065cJ1.this.f60373b.accept(Optional.f63040c.m59034a());
            this.f60383h.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LUx;", "b", "()LUx;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cJ1$f */
    /* loaded from: classes4.dex */
    public static final class C13492f extends Lambda implements Function0<InterfaceC8509Ux> {

        /* renamed from: g */
        public static final C13492f f60384g = new C13492f();

        public C13492f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC8509Ux invoke() {
            C9555Xx m76027a = new C9555Xx.C9556a().m76026b(256, new int[0]).m76027a();
            Intrinsics.checkNotNullExpressionValue(m76027a, "Builder()\n      .setBarc…T_QR_CODE)\n      .build()");
            return C29998wy.m6058b(m76027a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/android/gms/tasks/Task;", "", "LBx;", "b", "()Lcom/google/android/gms/tasks/Task;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cJ1$g */
    /* loaded from: classes4.dex */
    public static final class C13493g extends Lambda implements Function0<Task<List<? extends C0774Bx>>> {

        /* renamed from: h */
        public final /* synthetic */ C41304g32 f60386h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13493g(C41304g32 c41304g32) {
            super(0);
            this.f60386h = c41304g32;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Task<List<C0774Bx>> invoke() {
            Task<List<C0774Bx>> mo46763h = C39065cJ1.this.m61600k().mo46763h(this.f60386h);
            Intrinsics.checkNotNullExpressionValue(mo46763h, "barcodeScanner.process(image)");
            return mo46763h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/H;", "LcJ1$a;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cJ1$h */
    /* loaded from: classes4.dex */
    public static final class C13494h extends Lambda implements Function1<InterfaceC23444H<C13487a<T>>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Task<T>> f60387g;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: cJ1$h$a */
        /* loaded from: classes4.dex */
        public static final class C13495a extends Lambda implements Function1<T, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<C13487a<T>> f60388g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13495a(InterfaceC23444H<C13487a<T>> interfaceC23444H) {
                super(1);
                this.f60388g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C13495a) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                this.f60388g.onSuccess(new C13487a(t, null, 2, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13494h(Function0<? extends Task<T>> function0) {
            super(1);
            this.f60387g = function0;
        }

        /* renamed from: c */
        public static final void m61586c(InterfaceC23444H emitter, Exception it) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40159e(it);
            emitter.onSuccess(new C13487a(null, it));
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((InterfaceC23444H) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(final InterfaceC23444H<C13487a<T>> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            final C13495a c13495a = new C13495a(emitter);
            ((Task) this.f60387g.invoke()).addOnSuccessListener(new OnSuccessListener() { // from class: dJ1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C39065cJ1.C13494h.invoke$lambda$0(Function1.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: eJ1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    C39065cJ1.C13494h.m61586c(InterfaceC23444H.this, exc);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "LcJ1$b;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cJ1$i */
    /* loaded from: classes4.dex */
    public static final class C13496i extends Lambda implements Function0<Z84<Optional<C13488b>>> {
        public C13496i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<C13488b>> invoke() {
            return Z84.f47888d.m73663b(C39065cJ1.this.f60373b);
        }
    }

    public C39065cJ1() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new C13496i());
        this.f60372a = lazy;
        this.f60373b = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        lazy2 = LazyKt__LazyJVMKt.lazy(C13492f.f60384g);
        this.f60374c = lazy2;
    }

    /* renamed from: h */
    public static final C13488b m61603h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C13488b) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m61602i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m61601j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.camera.core.C11154e.InterfaceC11155a
    @SuppressLint({"UnsafeExperimentalUsageError", "CheckResult"})
    /* renamed from: d */
    public void mo968d(InterfaceC11183i imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Image mo69479k3 = imageProxy.mo69479k3();
        if (mo69479k3 != null) {
            try {
                C41304g32 m40246c = C41304g32.m40246c(mo69479k3, imageProxy.mo40428i1().mo3253c());
                Intrinsics.checkNotNullExpressionValue(m40246c, "try {\n          InputIma…         return\n        }");
                AbstractC23442F<C13487a<List<C0774Bx>>> m61598m = m61598m(m40246c);
                final C13489c c13489c = new C13489c(m40246c);
                AbstractC23442F m33148R = m61598m.m33157I(new InterfaceC23492o() { // from class: ZI1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        C39065cJ1.C13488b m61603h;
                        m61603h = C39065cJ1.m61603h(Function1.this, obj);
                        return m61603h;
                    }
                }).m33140a0(500L, TimeUnit.MILLISECONDS).m33148R(new C13488b(null, null, 3, null));
                final C13490d c13490d = new C13490d(imageProxy);
                InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: aJ1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C39065cJ1.m61602i(Function1.this, obj);
                    }
                };
                final C13491e c13491e = new C13491e(imageProxy);
                m33148R.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: bJ1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C39065cJ1.m61601j(Function1.this, obj);
                    }
                });
            } catch (Exception e) {
                C41318g46.m40160d("error in identification analyzer while decoding media image", e);
                imageProxy.close();
            }
        }
    }

    /* renamed from: k */
    public final InterfaceC8509Ux m61600k() {
        return (InterfaceC8509Ux) this.f60374c.getValue();
    }

    /* renamed from: l */
    public final Z84<Optional<C13488b>> m61599l() {
        return (Z84) this.f60372a.getValue();
    }

    /* renamed from: m */
    public final AbstractC23442F<C13487a<List<C0774Bx>>> m61598m(C41304g32 c41304g32) {
        return m61597n(new C13493g(c41304g32));
    }

    /* renamed from: n */
    public final <T> AbstractC23442F<C13487a<T>> m61597n(Function0<? extends Task<T>> function0) {
        return C45832nh5.m23305k(new C13494h(function0));
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\b\u0010\r\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LcJ1$a;", "T", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/Object;", "()Ljava/lang/Object;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "b", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "exception", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: cJ1$a */
    /* loaded from: classes4.dex */
    public static final class C13487a<T> {

        /* renamed from: a */
        public final T f60375a;

        /* renamed from: b */
        public final Throwable f60376b;

        public C13487a(T t, Throwable th) {
            this.f60375a = t;
            this.f60376b = th;
        }

        /* renamed from: a */
        public final T m61596a() {
            return this.f60375a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13487a) {
                C13487a c13487a = (C13487a) obj;
                return Intrinsics.areEqual(this.f60375a, c13487a.f60375a) && Intrinsics.areEqual(this.f60376b, c13487a.f60376b);
            }
            return false;
        }

        public int hashCode() {
            T t = this.f60375a;
            int hashCode = (t == null ? 0 : t.hashCode()) * 31;
            Throwable th = this.f60376b;
            return hashCode + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            T t = this.f60375a;
            Throwable th = this.f60376b;
            return "ProcessResult(result=" + t + ", exception=" + th + ")";
        }

        public /* synthetic */ C13487a(Object obj, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? null : th);
        }
    }
}
