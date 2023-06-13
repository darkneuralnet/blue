package p000;

import android.annotation.SuppressLint;
import android.media.Image;
import androidx.camera.core.C11154e;
import androidx.camera.core.InterfaceC11183i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.C50784w26;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lzd3;", "Landroidx/camera/core/e$a;", "Landroidx/camera/core/i;", "imageProxy", "", DateTokenConverter.CONVERTER_KEY, "LZ84;", "Lco/bird/android/buava/Optional;", "Lp06;", C17296a.f69688o, "Lkotlin/Lazy;", "m", "()LZ84;", "results", "Lv26;", "b", "Lv26;", "recognizer", "La94;", "c", "La94;", "mutableScanResults", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOCRAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OCRAnalyzer.kt\nco/bird/android/widget/scan/analyzer/OCRAnalyzer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* renamed from: zd3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52904zd3 implements C11154e.InterfaceC11155a {

    /* renamed from: a */
    public final Lazy f121658a;

    /* renamed from: b */
    public final InterfaceC50191v26 f121659b;

    /* renamed from: c */
    public final C37791a94<Optional<C46615p06>> f121660c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lp06;", "kotlin.jvm.PlatformType", Entry.TYPE_TEXT, "", C17296a.f69688o, "(Lp06;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zd3$a */
    /* loaded from: classes4.dex */
    public static final class C31064a extends Lambda implements Function1<C46615p06, Unit> {
        public C31064a() {
            super(1);
        }

        /* renamed from: a */
        public final void m958a(C46615p06 text) {
            C37791a94 c37791a94 = C52904zd3.this.f121660c;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(text, "text");
            c37791a94.accept(c14443a.m59032c(text));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C46615p06 c46615p06) {
            m958a(c46615p06);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lp06;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zd3$b */
    /* loaded from: classes4.dex */
    public static final class C31065b extends Lambda implements Function0<Z84<Optional<C46615p06>>> {
        public C31065b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<C46615p06>> invoke() {
            return Z84.f47888d.m73663b(C52904zd3.this.f121660c);
        }
    }

    public C52904zd3() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C31065b());
        this.f121658a = lazy;
        InterfaceC50191v26 m10948a = C49599u26.m10948a(new C50784w26.C29743a().m7544a());
        Intrinsics.checkNotNullExpressionValue(m10948a, "getClient(TextRecognizerOptions.Builder().build())");
        this.f121659b = m10948a;
        this.f121660c = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
    }

    /* renamed from: i */
    public static final void m963i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m962j(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        C41318g46.m40159e(exception);
    }

    /* renamed from: k */
    public static final void m961k(InterfaceC11183i imageProxy, Task it) {
        Intrinsics.checkNotNullParameter(imageProxy, "$imageProxy");
        Intrinsics.checkNotNullParameter(it, "it");
        imageProxy.close();
    }

    /* renamed from: l */
    public static final void m960l(InterfaceC11183i imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "$imageProxy");
        imageProxy.close();
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
                C41318g46.m40163a("computed image from image proxy", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(m40246c, "try {\n          InputIma…         return\n        }");
                Task<C46615p06> mo9280h = this.f121659b.mo9280h(m40246c);
                final C31064a c31064a = new C31064a();
                mo9280h.addOnSuccessListener(new OnSuccessListener() { // from class: vd3
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        C52904zd3.m963i(Function1.this, obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: wd3
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        C52904zd3.m962j(exc);
                    }
                }).addOnCompleteListener(new OnCompleteListener() { // from class: xd3
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C52904zd3.m961k(InterfaceC11183i.this, task);
                    }
                }).addOnCanceledListener(new OnCanceledListener() { // from class: yd3
                    @Override // com.google.android.gms.tasks.OnCanceledListener
                    public final void onCanceled() {
                        C52904zd3.m960l(InterfaceC11183i.this);
                    }
                });
            } catch (Exception e) {
                C41318g46.m40158f(e, "error in ocr analyzer while decoding media image", new Object[0]);
                imageProxy.close();
            }
        }
    }

    /* renamed from: m */
    public final Z84<Optional<C46615p06>> m959m() {
        return (Z84) this.f121658a.getValue();
    }
}
