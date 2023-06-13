package p000;

import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.camera.core.C11164h;
import androidx.constraintlayout.widget.Group;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.scan.C16689a;
import co.bird.android.widget.scan.GraphicOverlay;
import co.bird.android.widget.scan.HelmetLeaseReturnScanView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.C39065cJ1;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b8\u00109J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J+\u0010\r\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u0010\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0004J,\u0010'\u001a\u00020\u00062\u001a\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\b0#0\"2\b\u0010&\u001a\u0004\u0018\u00010$J\f\u0010)\u001a\u00020$*\u00020(H\u0002R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u0006:"}, m28432d2 = {"LSJ1;", "LxE;", "LH31;", "Lh56;", "", "instructions", "", "Wl", "", "statusTextRes", "", "", "formatArgs", "Yl", "(Ljava/lang/Integer;[Ljava/lang/Object;)V", "Xl", "", "show", "Zl", "bm", "Landroid/net/Uri;", "imageUri", "Tl", "Lio/reactivex/Observable;", "G2", "Rl", "Ul", "directory", "filePrefix", "fileExt", "Lio/reactivex/F;", "cm", Entry.TYPE_TEXT, "am", "", "Lkotlin/Pair;", "Landroid/graphics/Rect;", "list", "imageRect", "Vl", "Landroid/view/View;", "Ql", "LL3;", "b", "LL3;", "binding", "LZ84;", "Lco/bird/android/buava/Optional;", "LcJ1$b;", "c", "LZ84;", "Sl", "()LZ84;", "analyzerResults", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LL3;)V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetLeaseReturnScannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseReturnScannerUi.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* renamed from: SJ1 */
/* loaded from: classes3.dex */
public final class SJ1 extends AbstractC30071xE {

    /* renamed from: b */
    public final C4694L3 f33461b;

    /* renamed from: c */
    public final Z84<Optional<C39065cJ1.C13488b>> f33462c;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroidx/camera/core/h$o;", "results", "Lio/reactivex/K;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroidx/camera/core/h$o;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHelmetLeaseReturnScannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseReturnScannerUi.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerUi$takePhoto$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
    /* renamed from: SJ1$a */
    /* loaded from: classes3.dex */
    public static final class C7374a extends Lambda implements Function1<C11164h.C11182o, InterfaceC23447K<? extends Uri>> {

        /* renamed from: g */
        public final /* synthetic */ File f33463g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7374a(File file) {
            super(1);
            this.f33463g = file;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Uri> invoke(C11164h.C11182o results) {
            AbstractC23442F m33158H;
            boolean z;
            Intrinsics.checkNotNullParameter(results, "results");
            Uri m69481a = results.m69481a();
            if (m69481a == null) {
                m69481a = Uri.fromFile(this.f33463g);
                File file = this.f33463g;
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
    public SJ1(BaseActivity activity, C4694L3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f33461b = binding;
        this.f33462c = binding.f20641o.mo53987t();
    }

    /* renamed from: dm */
    public static final InterfaceC23447K m85746dm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G2 */
    public final Observable<Unit> m85761G2() {
        Button button = this.f33461b.f20643q;
        Intrinsics.checkNotNullExpressionValue(button, "binding.takePhotoButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final Rect m85759Ql(View view) {
        return new Rect(0, 0, view.getWidth(), view.getHeight());
    }

    /* renamed from: Rl */
    public final Observable<Unit> m85758Rl() {
        Button button = this.f33461b.f20644r;
        Intrinsics.checkNotNullExpressionValue(button, "binding.usePhotoButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Sl */
    public final Z84<Optional<C39065cJ1.C13488b>> m85757Sl() {
        return this.f33462c;
    }

    /* renamed from: Tl */
    public final void m85756Tl(Uri uri) {
        boolean z;
        this.f33461b.f20630d.setImageURI(uri);
        Group group = this.f33461b.f20629c;
        Intrinsics.checkNotNullExpressionValue(group, "binding.confirmImageGroup");
        if (uri != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(group, z, 0, 2, null);
    }

    /* renamed from: Ul */
    public final Observable<Unit> m85755Ul() {
        Button button = this.f33461b.f20640n;
        Intrinsics.checkNotNullExpressionValue(button, "binding.retakeButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Vl */
    public final void m85754Vl(List<Pair<Rect, Integer>> list, Rect rect) {
        float max;
        float min;
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f33461b.f20634h.m54029b();
        HelmetLeaseReturnScanView helmetLeaseReturnScanView = this.f33461b.f20641o;
        Intrinsics.checkNotNullExpressionValue(helmetLeaseReturnScanView, "binding.scanView");
        Rect m85759Ql = m85759Ql(helmetLeaseReturnScanView);
        for (Pair<Rect, Integer> pair : list) {
            Rect component1 = pair.component1();
            int intValue = pair.component2().intValue();
            if (component1 != null) {
                if (rect != null) {
                    if (m85759Ql.width() <= m85759Ql.height()) {
                        max = Math.min(rect.width(), rect.height());
                    } else {
                        max = Math.max(rect.width(), rect.height());
                    }
                    if (m85759Ql.width() <= m85759Ql.height()) {
                        min = Math.max(rect.width(), rect.height());
                    } else {
                        min = Math.min(rect.width(), rect.height());
                    }
                    float width = m85759Ql.width() / max;
                    float height = m85759Ql.height() / min;
                    roundToInt = MathKt__MathJVMKt.roundToInt(component1.left * width);
                    roundToInt2 = MathKt__MathJVMKt.roundToInt(component1.top * height);
                    roundToInt3 = MathKt__MathJVMKt.roundToInt(component1.right * height);
                    roundToInt4 = MathKt__MathJVMKt.roundToInt(component1.bottom * height);
                    component1 = new Rect(roundToInt, roundToInt2, roundToInt3, roundToInt4);
                }
                GraphicOverlay graphicOverlay = this.f33461b.f20634h;
                GraphicOverlay graphicOverlay2 = this.f33461b.f20634h;
                Intrinsics.checkNotNullExpressionValue(graphicOverlay2, "binding.graphicOverlay");
                graphicOverlay.m54030a(new C16689a(graphicOverlay2, component1, getColor(intValue), 4.0f));
            }
        }
    }

    /* renamed from: Wl */
    public final void m85753Wl(String instructions) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.f33461b.f20636j.setText(instructions);
    }

    /* renamed from: Xl */
    public final void m85752Xl(Integer num, Object... formatArgs) {
        Unit unit;
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (num != null) {
            this.f33461b.f20642p.setText(getString(num.intValue(), Arrays.copyOf(formatArgs, formatArgs.length)));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f33461b.f20642p.setText("");
        }
    }

    /* renamed from: Yl */
    public final void m85751Yl(Integer num, Object... formatArgs) {
        Unit unit;
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (num != null) {
            this.f33461b.f20633g.setText(getString(num.intValue(), Arrays.copyOf(formatArgs, formatArgs.length)));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f33461b.f20633g.setText("");
        }
    }

    /* renamed from: Zl */
    public final void m85750Zl(boolean z) {
        Button button = this.f33461b.f20643q;
        Intrinsics.checkNotNullExpressionValue(button, "binding.takePhotoButton");
        C49520tu6.m11232s(button, z, 4);
    }

    /* renamed from: am */
    public final void m85749am(String str) {
        this.f33461b.f20631e.setText(str);
    }

    /* renamed from: bm */
    public final void m85748bm(boolean z) {
        ImageView imageView = this.f33461b.f20638l;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.qrCodeOverlay1");
        C49520tu6.m11232s(imageView, z, 4);
        ImageView imageView2 = this.f33461b.f20639m;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.qrCodeOverlay2");
        C49520tu6.m11232s(imageView2, z, 4);
    }

    /* renamed from: cm */
    public final AbstractC23442F<Uri> m85747cm(String directory, String filePrefix, String fileExt) {
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
        AbstractC23442F<C11164h.C11182o> m54024z = this.f33461b.f20641o.m54024z(m69483a);
        final C7374a c7374a = new C7374a(createTempFile);
        AbstractC23442F m33165A = m54024z.m33165A(new InterfaceC23492o() { // from class: RJ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m85746dm;
                m85746dm = SJ1.m85746dm(Function1.this, obj);
                return m85746dm;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "file = File.createTempFi…ved image data\"))\n      }");
        return m33165A;
    }
}
