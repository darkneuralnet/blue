package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.camera.core.C11164h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RequirementsResult;
import co.bird.android.widget.scan.C16689a;
import co.bird.android.widget.scan.GraphicOverlay;
import co.bird.android.widget.scan.IdentificationScanView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.C42290hj1;
import p000.TV1;
import p000.US1;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010C\u001a\u00020@¢\u0006\u0004\bS\u0010TJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J2\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ8\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00120\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bJ\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014J+\u0010\u001c\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019\"\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019\"\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0004J\u0010\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0010J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0004J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060%J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060%J!\u0010,\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J6\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00142\b\b\u0002\u00102\u001a\u00020\u0017J$\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0014J\u0010\u00106\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0014J*\u0010;\u001a\u00020\u00062\u0018\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00170\u0012072\b\u0010:\u001a\u0004\u0018\u000108J\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010<\u001a\u00020\u0010J\f\u0010?\u001a\u000208*\u00020>H\u0002R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR#\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0K0J8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006U"}, m28432d2 = {"LTV1;", "LxE;", "LH31;", "Lh56;", "", "useFront", "", "hm", "Lkotlin/Function1;", "LUS1$c;", "Lco/bird/android/model/RequirementsResult;", "requirementsPredicate", "Lio/reactivex/F;", "Lkotlin/Triple;", "Landroid/graphics/Bitmap;", "jm", "Landroid/net/Uri;", "uri", "Lkotlin/Pair;", "Ql", "", "instructions", "am", "", "statusTextRes", "", "", "formatArgs", "cm", "(Ljava/lang/Integer;[Ljava/lang/Object;)V", "bm", "show", "dm", "imageUri", "Ul", "enabled", "Yl", "Lio/reactivex/Observable;", "G2", "Sl", "Vl", "", "aspectRatio", "isSelfie", "Zl", "(Ljava/lang/Double;Z)V", "bitmap", "directory", "filePrefix", "fileExt", "jpegQuality", "Wl", "fm", Entry.TYPE_TEXT, "em", "", "Landroid/graphics/Rect;", "list", "imageRect", "Xl", "fileUri", "im", "Landroid/view/View;", "Rl", "LS3;", "b", "LS3;", "binding", "Lgj1;", "c", "Lkotlin/Lazy;", "Tl", "()Lgj1;", "faceDetector", "LZ84;", "Lco/bird/android/buava/Optional;", DateTokenConverter.CONVERTER_KEY, "LZ84;", "getAnalyzerResults", "()LZ84;", "analyzerResults", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LS3;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationScannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationScannerUi.kt\nco/bird/android/feature/identification/IdentificationScannerUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
/* renamed from: TV1 */
/* loaded from: classes3.dex */
public final class TV1 extends AbstractC30071xE {

    /* renamed from: b */
    public final C7319S3 f35554b;

    /* renamed from: c */
    public final Lazy f35555c;

    /* renamed from: d */
    public final Z84<Optional<US1.C8284c>> f35556d;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lgj1;", "b", "()Lgj1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TV1$a */
    /* loaded from: classes3.dex */
    public static final class C7855a extends Lambda implements Function0<InterfaceC41697gj1> {

        /* renamed from: g */
        public static final C7855a f35557g = new C7855a();

        public C7855a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC41697gj1 invoke() {
            return C41104fj1.m40998a(new C42290hj1.C22712a().m35943e(2).m35946b(2).m35944d(2).m35947a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Landroid/net/Uri;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TV1$b */
    /* loaded from: classes3.dex */
    public static final class C7856b extends Lambda implements Function1<InterfaceC23444H<Uri>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f35558g;

        /* renamed from: h */
        public final /* synthetic */ String f35559h;

        /* renamed from: i */
        public final /* synthetic */ String f35560i;

        /* renamed from: j */
        public final /* synthetic */ TV1 f35561j;

        /* renamed from: k */
        public final /* synthetic */ Bitmap f35562k;

        /* renamed from: l */
        public final /* synthetic */ int f35563l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7856b(String str, String str2, String str3, TV1 tv1, Bitmap bitmap, int i) {
            super(1);
            this.f35558g = str;
            this.f35559h = str2;
            this.f35560i = str3;
            this.f35561j = tv1;
            this.f35562k = bitmap;
            this.f35563l = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Uri> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(InterfaceC23444H<Uri> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            File file = new File(this.f35558g);
            if (!file.exists()) {
                try {
                    file.mkdirs();
                } catch (Exception e) {
                    C41318g46.m40158f(e, "Could not create directories for storing identification photo", new Object[0]);
                    emitter.onError(e);
                    return;
                }
            }
            Uri uri = Uri.fromFile(File.createTempFile(this.f35559h, this.f35560i, file));
            BaseActivity activity = this.f35561j.getActivity();
            Bitmap bitmap = this.f35562k;
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            if (C25708lU.m27246c(activity, bitmap, uri, Bitmap.CompressFormat.JPEG, this.f35563l)) {
                emitter.onSuccess(uri);
                return;
            }
            emitter.onError(new Throwable("Could not compress bitmap to uri: " + uri));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroidx/camera/core/h$o;", "results", "Lio/reactivex/K;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroidx/camera/core/h$o;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationScannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationScannerUi.kt\nco/bird/android/feature/identification/IdentificationScannerUi$takePhoto$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
    /* renamed from: TV1$c */
    /* loaded from: classes3.dex */
    public static final class C7857c extends Lambda implements Function1<C11164h.C11182o, InterfaceC23447K<? extends Uri>> {

        /* renamed from: g */
        public final /* synthetic */ File f35564g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7857c(File file) {
            super(1);
            this.f35564g = file;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Uri> invoke(C11164h.C11182o results) {
            AbstractC23442F m33158H;
            boolean z;
            Intrinsics.checkNotNullParameter(results, "results");
            Uri m69481a = results.m69481a();
            if (m69481a == null) {
                m69481a = Uri.fromFile(this.f35564g);
                File file = this.f35564g;
                if (file.exists() && file.canRead()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    m69481a = null;
                }
            }
            if (m69481a == null || (m33158H = AbstractC23442F.m33158H(m69481a)) == null) {
                return AbstractC23442F.m33100x(new NullPointerException("Could not find file with saved image data"));
            }
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TV1$d */
    /* loaded from: classes3.dex */
    public static final class C7858d extends Lambda implements Function1<InterfaceC23444H<Boolean>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Uri f35566h;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Ldj1;", "kotlin.jvm.PlatformType", "", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TV1$d$a */
        /* loaded from: classes3.dex */
        public static final class C7859a extends Lambda implements Function1<List<C39919dj1>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<Boolean> f35567g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7859a(InterfaceC23444H<Boolean> interfaceC23444H) {
                super(1);
                this.f35567g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<C39919dj1> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(List<C39919dj1> list) {
                this.f35567g.onSuccess(Boolean.valueOf(list.size() > 0));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7858d(Uri uri) {
            super(1);
            TV1.this = r1;
            this.f35566h = uri;
        }

        /* renamed from: e */
        public static final void m83513e(InterfaceC23444H emitter, Exception it) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40159e(it);
            emitter.onSuccess(Boolean.FALSE);
        }

        /* renamed from: f */
        public static final void m83512f(InterfaceC23444H emitter) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onSuccess(Boolean.FALSE);
        }

        /* renamed from: g */
        public static final void m83511g(InterfaceC23444H emitter, Task it) {
            boolean z;
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(it, "it");
            if (((List) it.getResult()).size() > 0) {
                z = true;
            } else {
                z = false;
            }
            emitter.onSuccess(Boolean.valueOf(z));
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Boolean> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(final InterfaceC23444H<Boolean> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            try {
                C41304g32 m40247b = C41304g32.m40247b(TV1.this.getActivity(), this.f35566h);
                Intrinsics.checkNotNullExpressionValue(m40247b, "fromFilePath(activity, fileUri)");
                Task<List<C39919dj1>> mo37869h = TV1.this.m83536Tl().mo37869h(m40247b);
                final C7859a c7859a = new C7859a(emitter);
                mo37869h.addOnSuccessListener(new OnSuccessListener() { // from class: UV1
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        TV1.C7858d.invoke$lambda$0(Function1.this, obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: VV1
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        TV1.C7858d.m83513e(InterfaceC23444H.this, exc);
                    }
                }).addOnCanceledListener(new OnCanceledListener() { // from class: WV1
                    @Override // com.google.android.gms.tasks.OnCanceledListener
                    public final void onCanceled() {
                        TV1.C7858d.m83512f(InterfaceC23444H.this);
                    }
                }).addOnCompleteListener(new OnCompleteListener() { // from class: XV1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        TV1.C7858d.m83511g(InterfaceC23444H.this, task);
                    }
                });
            } catch (Exception e) {
                C41318g46.m40159e(e);
                emitter.onSuccess(Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TV1(BaseActivity activity, C7319S3 binding) {
        super(activity);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f35554b = binding;
        lazy = LazyKt__LazyJVMKt.lazy(C7855a.f35557g);
        this.f35555c = lazy;
        this.f35556d = binding.f33082o.mo53987t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC23442F analyzeManualImage$default(TV1 tv1, Uri uri, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return tv1.m83539Ql(uri, function1);
    }

    /* renamed from: gm */
    public static final InterfaceC23447K m83523gm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    public static /* synthetic */ AbstractC23442F saveBitmapToFile$default(TV1 tv1, Bitmap bitmap, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 80;
        }
        return tv1.m83533Wl(bitmap, str, str2, str3, i);
    }

    public static /* synthetic */ void setFrameGuideIfNecessary$default(TV1 tv1, Double d, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        tv1.m83530Zl(d, z);
    }

    /* renamed from: G2 */
    public final Observable<Unit> m83541G2() {
        Button button = this.f35554b.f33085r;
        Intrinsics.checkNotNullExpressionValue(button, "binding.takePhotoButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final AbstractC23442F<Pair<US1.C8284c, RequirementsResult>> m83539Ql(Uri uri, Function1<? super US1.C8284c, RequirementsResult> function1) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return this.f35554b.f33082o.m54015x(uri, function1);
    }

    /* renamed from: Rl */
    public final Rect m83538Rl(View view) {
        return new Rect(0, 0, view.getWidth(), view.getHeight());
    }

    /* renamed from: Sl */
    public final Observable<Unit> m83537Sl() {
        Button button = this.f35554b.f33087t;
        Intrinsics.checkNotNullExpressionValue(button, "binding.usePhotoButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Tl */
    public final InterfaceC41697gj1 m83536Tl() {
        return (InterfaceC41697gj1) this.f35555c.getValue();
    }

    /* renamed from: Ul */
    public final void m83535Ul(Uri uri) {
        boolean z;
        this.f35554b.f33072e.setImageURI(uri);
        Group group = this.f35554b.f33071d;
        Intrinsics.checkNotNullExpressionValue(group, "binding.confirmImageGroup");
        if (uri != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(group, z, 0, 2, null);
    }

    /* renamed from: Vl */
    public final Observable<Unit> m83534Vl() {
        Button button = this.f35554b.f33081n;
        Intrinsics.checkNotNullExpressionValue(button, "binding.retakeButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Wl */
    public final AbstractC23442F<Uri> m83533Wl(Bitmap bitmap, String directory, String filePrefix, String fileExt, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(filePrefix, "filePrefix");
        Intrinsics.checkNotNullParameter(fileExt, "fileExt");
        return C45832nh5.m23305k(new C7856b(directory, filePrefix, fileExt, this, bitmap, i));
    }

    /* renamed from: Xl */
    public final void m83532Xl(List<Pair<Rect, Integer>> list, Rect rect) {
        Rect rect2;
        float max;
        float min;
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f35554b.f33077j.m54029b();
        IdentificationScanView identificationScanView = this.f35554b.f33082o;
        Intrinsics.checkNotNullExpressionValue(identificationScanView, "binding.scanView");
        Rect m83538Rl = m83538Rl(identificationScanView);
        for (Pair<Rect, Integer> pair : list) {
            Rect component1 = pair.component1();
            int intValue = pair.component2().intValue();
            if (rect != null) {
                if (m83538Rl.width() <= m83538Rl.height()) {
                    max = Math.min(rect.width(), rect.height());
                } else {
                    max = Math.max(rect.width(), rect.height());
                }
                if (m83538Rl.width() <= m83538Rl.height()) {
                    min = Math.max(rect.width(), rect.height());
                } else {
                    min = Math.min(rect.width(), rect.height());
                }
                float width = m83538Rl.width() / max;
                float height = m83538Rl.height() / min;
                roundToInt = MathKt__MathJVMKt.roundToInt(component1.left * width);
                roundToInt2 = MathKt__MathJVMKt.roundToInt(component1.top * height);
                roundToInt3 = MathKt__MathJVMKt.roundToInt(component1.right * height);
                roundToInt4 = MathKt__MathJVMKt.roundToInt(component1.bottom * height);
                rect2 = new Rect(roundToInt, roundToInt2, roundToInt3, roundToInt4);
            } else {
                rect2 = component1;
            }
            GraphicOverlay graphicOverlay = this.f35554b.f33077j;
            GraphicOverlay graphicOverlay2 = this.f35554b.f33077j;
            Intrinsics.checkNotNullExpressionValue(graphicOverlay2, "binding.graphicOverlay");
            graphicOverlay.m54030a(new C16689a(graphicOverlay2, rect2, getColor(intValue), 0.0f, 8, null));
        }
    }

    /* renamed from: Yl */
    public final void m83531Yl(boolean z) {
        this.f35554b.f33087t.setEnabled(z);
    }

    /* renamed from: Zl */
    public final void m83530Zl(Double d, boolean z) {
        ConstraintLayout.LayoutParams layoutParams;
        String valueOf;
        int i;
        float f;
        boolean z2;
        ViewGroup.LayoutParams layoutParams2 = this.f35554b.f33088u.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (z) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(d);
        }
        if (z) {
            i = C34245Lg4.selfie_frame;
        } else {
            i = C34245Lg4.aspect_ratio_frame;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 0.5f;
        }
        if (layoutParams != null) {
            layoutParams.f53953I = valueOf;
        }
        this.f35554b.f33088u.setBackgroundResource(i);
        Group group = this.f35554b.f33089v;
        Intrinsics.checkNotNullExpressionValue(group, "binding.viewfinderGroup");
        if (d == null && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        C49520tu6.show$default(group, z2, 0, 2, null);
        this.f35554b.f33084q.setAlpha(f);
        this.f35554b.f33074g.setAlpha(f);
        this.f35554b.f33086s.setAlpha(f);
        this.f35554b.f33069b.setAlpha(f);
    }

    /* renamed from: am */
    public final void m83529am(String instructions) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.f35554b.f33079l.setText(instructions);
    }

    /* renamed from: bm */
    public final void m83528bm(Integer num, Object... formatArgs) {
        Unit unit;
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (num != null) {
            this.f35554b.f33083p.setText(getString(num.intValue(), Arrays.copyOf(formatArgs, formatArgs.length)));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f35554b.f33083p.setText("");
        }
    }

    /* renamed from: cm */
    public final void m83527cm(Integer num, Object... formatArgs) {
        Unit unit;
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (num != null) {
            this.f35554b.f33076i.setText(getString(num.intValue(), Arrays.copyOf(formatArgs, formatArgs.length)));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f35554b.f33076i.setText("");
        }
    }

    /* renamed from: dm */
    public final void m83526dm(boolean z) {
        Button button = this.f35554b.f33085r;
        Intrinsics.checkNotNullExpressionValue(button, "binding.takePhotoButton");
        C49520tu6.m11232s(button, z, 4);
    }

    /* renamed from: em */
    public final void m83525em(String str) {
        this.f35554b.f33073f.setText(str);
    }

    /* renamed from: fm */
    public final AbstractC23442F<Uri> m83524fm(String directory, String filePrefix, String fileExt) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(filePrefix, "filePrefix");
        Intrinsics.checkNotNullParameter(fileExt, "fileExt");
        File file = new File(directory);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception e) {
                C41318g46.m40158f(e, "Could not create directories for storing identification photo", new Object[0]);
                AbstractC23442F<Uri> m33100x = AbstractC23442F.m33100x(e);
                Intrinsics.checkNotNullExpressionValue(m33100x, "error(e)");
                return m33100x;
            }
        }
        File createTempFile = File.createTempFile(filePrefix, fileExt, file);
        C11164h.C11180n m69483a = new C11164h.C11180n.C11181a(createTempFile).m69483a();
        Intrinsics.checkNotNullExpressionValue(m69483a, "Builder(file).build()");
        AbstractC23442F<C11164h.C11182o> m54020B = this.f35554b.f33082o.m54020B(m69483a);
        final C7857c c7857c = new C7857c(createTempFile);
        AbstractC23442F m33165A = m54020B.m33165A(new InterfaceC23492o() { // from class: SV1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m83523gm;
                m83523gm = TV1.m83523gm(Function1.this, obj);
                return m83523gm;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "file = File.createTempFi…ved image data\"))\n      }");
        return m33165A;
    }

    /* renamed from: hm */
    public final void m83522hm(boolean z) {
        this.f35554b.f33082o.m54019C(z);
    }

    /* renamed from: im */
    public final AbstractC23442F<Boolean> m83521im(Uri fileUri) {
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        return C45832nh5.m23305k(new C7858d(fileUri));
    }

    /* renamed from: jm */
    public final AbstractC23442F<Triple<US1.C8284c, RequirementsResult, Bitmap>> m83520jm(Function1<? super US1.C8284c, RequirementsResult> requirementsPredicate) {
        Intrinsics.checkNotNullParameter(requirementsPredicate, "requirementsPredicate");
        return this.f35554b.f33082o.m54018D(requirementsPredicate);
    }
}
