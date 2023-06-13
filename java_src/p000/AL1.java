package p000;

import android.net.Uri;
import android.widget.Button;
import androidx.camera.core.C11164h;
import androidx.constraintlayout.widget.Group;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.US1;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000e\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, m28432d2 = {"LAL1;", "LxE;", "LH31;", "Lh56;", "", "statusText", "", "Tl", "", "useFront", "Xl", "Landroid/net/Uri;", "imageUri", "canSkip", "Rl", "Lio/reactivex/Observable;", "G2", "Ql", "Sl", "Ul", "directory", "filePrefix", "fileExt", "Lio/reactivex/F;", "Vl", "LO3;", "b", "LO3;", "binding", "LZ84;", "Lco/bird/android/buava/Optional;", "LUS1$c;", "c", "LZ84;", "getAnalyzerResults", "()LZ84;", "analyzerResults", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LO3;)V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AL1 */
/* loaded from: classes3.dex */
public final class AL1 extends AbstractC30071xE {

    /* renamed from: b */
    public final C5818O3 f402b;

    /* renamed from: c */
    public final Z84<Optional<US1.C8284c>> f403c;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroidx/camera/core/h$o;", "results", "Lio/reactivex/K;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroidx/camera/core/h$o;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHelmetSelfieConfirmationUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetSelfieConfirmationUi.kt\nco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationUi$takePhoto$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
    /* renamed from: AL1$a */
    /* loaded from: classes3.dex */
    public static final class C0070a extends Lambda implements Function1<C11164h.C11182o, InterfaceC23447K<? extends Uri>> {

        /* renamed from: g */
        public final /* synthetic */ File f404g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0070a(File file) {
            super(1);
            this.f404g = file;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Uri> invoke(C11164h.C11182o results) {
            AbstractC23442F m33158H;
            boolean z;
            Intrinsics.checkNotNullParameter(results, "results");
            Uri m69481a = results.m69481a();
            if (m69481a == null) {
                m69481a = Uri.fromFile(this.f404g);
                File file = this.f404g;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AL1(BaseActivity activity, C5818O3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f402b = binding;
        this.f403c = binding.f25584i.mo53987t();
    }

    /* renamed from: Wl */
    public static final InterfaceC23447K m115903Wl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G2 */
    public final Observable<Unit> m115911G2() {
        Button button = this.f402b.f25587l;
        Intrinsics.checkNotNullExpressionValue(button, "binding.takePhotoButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final Observable<Unit> m115909Ql() {
        Button button = this.f402b.f25586k;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submitPhotoButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Rl */
    public final void m115908Rl(Uri uri, boolean z) {
        boolean z2;
        boolean z3;
        this.f402b.f25580e.setImageURI(uri);
        Group group = this.f402b.f25579d;
        Intrinsics.checkNotNullExpressionValue(group, "binding.confirmGroup");
        boolean z4 = true;
        if (uri != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C49520tu6.show$default(group, z2, 0, 2, null);
        Button button = this.f402b.f25587l;
        Intrinsics.checkNotNullExpressionValue(button, "binding.takePhotoButton");
        if (uri == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C49520tu6.show$default(button, z3, 0, 2, null);
        Button button2 = this.f402b.f25585j;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.skipPhotoButton");
        if (uri != null || !z) {
            z4 = false;
        }
        C49520tu6.show$default(button2, z4, 0, 2, null);
    }

    /* renamed from: Sl */
    public final Observable<Unit> m115907Sl() {
        Button button = this.f402b.f25583h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.retakePhotoButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Tl */
    public final void m115906Tl(String str) {
        this.f402b.f25581f.setText(str);
    }

    /* renamed from: Ul */
    public final Observable<Unit> m115905Ul() {
        Button button = this.f402b.f25585j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.skipPhotoButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Vl */
    public final AbstractC23442F<Uri> m115904Vl(String directory, String filePrefix, String fileExt) {
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
        AbstractC23442F<C11164h.C11182o> m54020B = this.f402b.f25584i.m54020B(m69483a);
        final C0070a c0070a = new C0070a(createTempFile);
        AbstractC23442F m33165A = m54020B.m33165A(new InterfaceC23492o() { // from class: zL1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m115903Wl;
                m115903Wl = AL1.m115903Wl(Function1.this, obj);
                return m115903Wl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "file = File.createTempFi…ved image data\"))\n      }");
        return m33165A;
    }

    /* renamed from: Xl */
    public final void m115902Xl(boolean z) {
        this.f402b.f25584i.m54019C(z);
    }
}
