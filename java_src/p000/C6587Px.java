package p000;

import android.annotation.SuppressLint;
import android.media.Image;
import androidx.camera.core.C11154e;
import androidx.camera.core.InterfaceC11183i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C37791a94;
import p000.C50784w26;
import p000.C9555Xx;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003¢\u0006\u0004\b3\u00104J\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\rR-\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00110\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R4\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00050&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b0\u00101¨\u00065"}, m28432d2 = {"LPx;", "Landroidx/camera/core/e$a;", "", "", "formats", "", "J", "Landroidx/camera/core/i;", "imageProxy", DateTokenConverter.CONVERTER_KEY, "Landroid/media/Image;", "mediaImage", "rotationDegrees", "", "includeTextResults", "r", "LZ84;", "Lco/bird/android/buava/Optional;", "", "LBx;", C17296a.f69688o, "Lkotlin/Lazy;", "G", "()LZ84;", "results", "Lp06;", "b", "I", "textResults", "La94;", "c", "La94;", "mutableScanResults", "mutableScanTextResults", "LUx;", "e", "LUx;", "scanner", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/Function1;", "F", "()Lkotlin/jvm/functions/Function1;", "K", "(Lkotlin/jvm/functions/Function1;)V", "onScanSuccess", "Lv26;", "g", "H", "()Lv26;", "textRecognizer", "<init>", "([I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Px */
/* loaded from: classes4.dex */
public final class C6587Px implements C11154e.InterfaceC11155a {

    /* renamed from: a */
    public final Lazy f29444a;

    /* renamed from: b */
    public final Lazy f29445b;

    /* renamed from: c */
    public final C37791a94<Optional<List<C0774Bx>>> f29446c;

    /* renamed from: d */
    public final C37791a94<Optional<C46615p06>> f29447d;

    /* renamed from: e */
    public InterfaceC8509Ux f29448e;

    /* renamed from: f */
    public Function1<? super List<? extends C0774Bx>, Unit> f29449f;

    /* renamed from: g */
    public final Lazy f29450g;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LBx;", "kotlin.jvm.PlatformType", "", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Px$a */
    /* loaded from: classes4.dex */
    public static final class C6588a extends Lambda implements Function1<List<C0774Bx>, Unit> {
        public C6588a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<C0774Bx> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C0774Bx> it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (!it.isEmpty()) {
                C41318g46.m40163a("non-empty list returned in success of barcode analyzer " + it, new Object[0]);
                C6587Px.this.m89286F().invoke(it);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LBx;", "kotlin.jvm.PlatformType", "", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Px$b */
    /* loaded from: classes4.dex */
    public static final class C6589b extends Lambda implements Function1<List<C0774Bx>, Unit> {
        public C6589b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<C0774Bx> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C0774Bx> it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (!it.isEmpty()) {
                C41318g46.m40163a("non-empty list returned in success of barcode analyzer " + it, new Object[0]);
                C6587Px.this.m89286F().invoke(it);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lp06;", "kotlin.jvm.PlatformType", Entry.TYPE_TEXT, "", C17296a.f69688o, "(Lp06;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Px$c */
    /* loaded from: classes4.dex */
    public static final class C6590c extends Lambda implements Function1<C46615p06, Unit> {
        public C6590c() {
            super(1);
        }

        /* renamed from: a */
        public final void m89258a(C46615p06 text) {
            C37791a94 c37791a94 = C6587Px.this.f29447d;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(text, "text");
            c37791a94.accept(c14443a.m59032c(text));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C46615p06 c46615p06) {
            m89258a(c46615p06);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "LBx;", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Px$d */
    /* loaded from: classes4.dex */
    public static final class C6591d extends Lambda implements Function1<List<? extends C0774Bx>, Unit> {
        public C6591d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C0774Bx> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends C0774Bx> it) {
            List list;
            Intrinsics.checkNotNullParameter(it, "it");
            C37791a94 c37791a94 = C6587Px.this.f29446c;
            Optional.C14443a c14443a = Optional.f63040c;
            list = CollectionsKt___CollectionsKt.toList(it);
            c37791a94.accept(c14443a.m59032c(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "", "LBx;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Px$e */
    /* loaded from: classes4.dex */
    public static final class C6592e extends Lambda implements Function0<Z84<Optional<List<? extends C0774Bx>>>> {
        public C6592e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Optional<List<? extends C0774Bx>>> invoke2() {
            return Z84.f47888d.m73663b(C6587Px.this.f29446c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lv26;", "b", "()Lv26;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Px$f */
    /* loaded from: classes4.dex */
    public static final class C6593f extends Lambda implements Function0<InterfaceC50191v26> {

        /* renamed from: g */
        public static final C6593f f29456g = new C6593f();

        public C6593f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC50191v26 invoke() {
            return C49599u26.m10948a(new C50784w26.C29743a().m7544a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lp06;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Px$g */
    /* loaded from: classes4.dex */
    public static final class C6594g extends Lambda implements Function0<Z84<Optional<C46615p06>>> {
        public C6594g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<C46615p06>> invoke() {
            return Z84.f47888d.m73663b(C6587Px.this.f29447d);
        }
    }

    public C6587Px() {
        this(null, 1, null);
    }

    /* renamed from: A */
    public static final void m89291A(Image mediaImage) {
        Intrinsics.checkNotNullParameter(mediaImage, "$mediaImage");
        mediaImage.close();
    }

    /* renamed from: B */
    public static final void m89290B(InterfaceC11183i imageProxy, Task it) {
        Intrinsics.checkNotNullParameter(imageProxy, "$imageProxy");
        Intrinsics.checkNotNullParameter(it, "it");
        imageProxy.close();
    }

    /* renamed from: C */
    public static final void m89289C(InterfaceC11183i imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "$imageProxy");
        imageProxy.close();
    }

    /* renamed from: D */
    public static final void m89288D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m89287E(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C41318g46.m40161c(it, "error in barcode analyzer", new Object[0]);
    }

    public static /* synthetic */ void analyze$default(C6587Px c6587Px, Image image, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        c6587Px.m89267r(image, i, z);
    }

    /* renamed from: s */
    public static final void m89266s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m89265t(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C41318g46.m40161c(it, "error in barcode analyzer", new Object[0]);
    }

    /* renamed from: u */
    public static final Task m89264u(C6587Px this$0, C41304g32 image, final Image mediaImage, Task it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(image, "$image");
        Intrinsics.checkNotNullParameter(mediaImage, "$mediaImage");
        Intrinsics.checkNotNullParameter(it, "it");
        Task<C46615p06> addOnFailureListener = this$0.m89284H().mo9280h(image).addOnFailureListener(new OnFailureListener() { // from class: Kx
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C6587Px.m89263v(exc);
            }
        });
        final C6590c c6590c = new C6590c();
        return addOnFailureListener.addOnSuccessListener(new OnSuccessListener() { // from class: Lx
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C6587Px.m89262w(Function1.this, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: Mx
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C6587Px.m89261x(mediaImage, task);
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: Nx
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                C6587Px.m89260y(mediaImage);
            }
        });
    }

    /* renamed from: v */
    public static final void m89263v(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C41318g46.m40161c(it, "error in ocr analyzer: ", new Object[0]);
    }

    /* renamed from: w */
    public static final void m89262w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m89261x(Image mediaImage, Task it) {
        Intrinsics.checkNotNullParameter(mediaImage, "$mediaImage");
        Intrinsics.checkNotNullParameter(it, "it");
        mediaImage.close();
    }

    /* renamed from: y */
    public static final void m89260y(Image mediaImage) {
        Intrinsics.checkNotNullParameter(mediaImage, "$mediaImage");
        mediaImage.close();
    }

    /* renamed from: z */
    public static final void m89259z(Image mediaImage, Task it) {
        Intrinsics.checkNotNullParameter(mediaImage, "$mediaImage");
        Intrinsics.checkNotNullParameter(it, "it");
        mediaImage.close();
    }

    /* renamed from: F */
    public final Function1<List<? extends C0774Bx>, Unit> m89286F() {
        return this.f29449f;
    }

    /* renamed from: G */
    public final Z84<Optional<List<C0774Bx>>> m89285G() {
        return (Z84) this.f29444a.getValue();
    }

    /* renamed from: H */
    public final InterfaceC50191v26 m89284H() {
        return (InterfaceC50191v26) this.f29450g.getValue();
    }

    /* renamed from: I */
    public final Z84<Optional<C46615p06>> m89283I() {
        return (Z84) this.f29445b.getValue();
    }

    /* renamed from: J */
    public final void m89282J(int... formats) {
        String joinToString$default;
        Integer firstOrNull;
        int i;
        int first;
        int[] copyOfRange;
        Intrinsics.checkNotNullParameter(formats, "formats");
        joinToString$default = ArraysKt___ArraysKt.joinToString$default(formats, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        C41318g46.m40163a("Setting formats count: " + joinToString$default, new Object[0]);
        C9555Xx.C9556a c9556a = new C9555Xx.C9556a();
        if (formats.length <= 1) {
            firstOrNull = ArraysKt___ArraysKt.firstOrNull(formats);
            if (firstOrNull != null) {
                i = firstOrNull.intValue();
            } else {
                i = 0;
            }
            c9556a.m76026b(i, new int[0]);
        } else {
            first = ArraysKt___ArraysKt.first(formats);
            copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(formats, 1, formats.length);
            c9556a.m76026b(first, Arrays.copyOf(copyOfRange, copyOfRange.length));
        }
        InterfaceC8509Ux m6058b = C29998wy.m6058b(c9556a.m76027a());
        Intrinsics.checkNotNullExpressionValue(m6058b, "getClient(builder.build())");
        this.f29448e = m6058b;
    }

    /* renamed from: K */
    public final void m89281K(Function1<? super List<? extends C0774Bx>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f29449f = function1;
    }

    @Override // androidx.camera.core.C11154e.InterfaceC11155a
    @SuppressLint({"UnsafeExperimentalUsageError"})
    /* renamed from: d */
    public void mo968d(final InterfaceC11183i imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Image mo69479k3 = imageProxy.mo69479k3();
        if (mo69479k3 != null) {
            try {
                C41304g32 m40246c = C41304g32.m40246c(mo69479k3, imageProxy.mo40428i1().mo3253c());
                Intrinsics.checkNotNullExpressionValue(m40246c, "try {\n          InputIma…         return\n        }");
                Task<List<C0774Bx>> mo46763h = this.f29448e.mo46763h(m40246c);
                final C6588a c6588a = new C6588a();
                mo46763h.addOnSuccessListener(new OnSuccessListener() { // from class: Ox
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        C6587Px.m89266s(Function1.this, obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: Dx
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        C6587Px.m89265t(exc);
                    }
                }).addOnCompleteListener(new OnCompleteListener() { // from class: Ex
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C6587Px.m89290B(InterfaceC11183i.this, task);
                    }
                }).addOnCanceledListener(new OnCanceledListener() { // from class: Fx
                    @Override // com.google.android.gms.tasks.OnCanceledListener
                    public final void onCanceled() {
                        C6587Px.m89289C(InterfaceC11183i.this);
                    }
                });
            } catch (Exception e) {
                C41318g46.m40161c(e, "error in barcode analyzer while decoding media image", new Object[0]);
                imageProxy.close();
            }
        }
    }

    /* renamed from: r */
    public final void m89267r(final Image mediaImage, int i, boolean z) {
        Intrinsics.checkNotNullParameter(mediaImage, "mediaImage");
        try {
            final C41304g32 m40246c = C41304g32.m40246c(mediaImage, i);
            Intrinsics.checkNotNullExpressionValue(m40246c, "try {\n        InputImage…\")\n        return\n      }");
            Task<List<C0774Bx>> mo46763h = this.f29448e.mo46763h(m40246c);
            final C6589b c6589b = new C6589b();
            Task<List<C0774Bx>> addOnFailureListener = mo46763h.addOnSuccessListener(new OnSuccessListener() { // from class: Cx
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C6587Px.m89288D(Function1.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: Gx
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    C6587Px.m89287E(exc);
                }
            });
            if (z) {
                addOnFailureListener.continueWithTask(new Continuation() { // from class: Hx
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        Task m89264u;
                        m89264u = C6587Px.m89264u(C6587Px.this, m40246c, mediaImage, task);
                        return m89264u;
                    }
                });
            } else {
                addOnFailureListener.addOnCompleteListener(new OnCompleteListener() { // from class: Ix
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C6587Px.m89259z(mediaImage, task);
                    }
                }).addOnCanceledListener(new OnCanceledListener() { // from class: Jx
                    @Override // com.google.android.gms.tasks.OnCanceledListener
                    public final void onCanceled() {
                        C6587Px.m89291A(mediaImage);
                    }
                });
            }
        } catch (Exception e) {
            C41318g46.m40161c(e, "error in barcode analyzer while decoding media image", new Object[0]);
        }
    }

    public C6587Px(int... formats) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(formats, "formats");
        lazy = LazyKt__LazyJVMKt.lazy(new C6592e());
        this.f29444a = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C6594g());
        this.f29445b = lazy2;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f29446c = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f29447d = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        InterfaceC8509Ux m6059a = C29998wy.m6059a();
        Intrinsics.checkNotNullExpressionValue(m6059a, "getClient()");
        this.f29448e = m6059a;
        this.f29449f = new C6591d();
        lazy3 = LazyKt__LazyJVMKt.lazy(C6593f.f29456g);
        this.f29450g = lazy3;
        m89282J(Arrays.copyOf(formats, formats.length));
    }

    public /* synthetic */ C6587Px(int[] iArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new int[]{256, 1, 2048, 512} : iArr);
    }
}
