package p000;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.api.Environment;
import com.facebook.share.internal.C17296a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C37681Zy2;
import p000.C40672ez2;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H\u0007J4\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H\u0007R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00160\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001b"}, m28432d2 = {"LzX1;", "", "", "txVariant", "Landroid/widget/ImageView;", "view", "", "placeholder", "errorFallback", "", DateTokenConverter.CONVERTER_KEY, "txSubVariant", "e", "LZy2;", C17296a.f69688o, "LZy2;", "logoApi", "", "Lez2$b;", "b", "Ljava/util/Map;", "callbacks", "Ljava/lang/ref/WeakReference;", "c", "imageViews", "<init>", "(LZy2;)V", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: zX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52845zX1 {

    /* renamed from: d */
    public static final C31036b f121488d = new C31036b(null);

    /* renamed from: e */
    public static final String f121489e;

    /* renamed from: a */
    public final C37681Zy2 f121490a;

    /* renamed from: b */
    public final Map<String, C40672ez2.InterfaceC20160b> f121491b;

    /* renamed from: c */
    public final Map<String, WeakReference<ImageView>> f121492c;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, m28432d2 = {"zX1$a", "Lez2$b;", "Landroid/graphics/drawable/BitmapDrawable;", "drawable", "", "b", C17296a.f69688o, "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: zX1$a */
    /* loaded from: classes.dex */
    public static final class C31035a implements C40672ez2.InterfaceC20160b {

        /* renamed from: b */
        public final /* synthetic */ String f121494b;

        /* renamed from: c */
        public final /* synthetic */ int f121495c;

        public C31035a(String str, int i) {
            this.f121494b = str;
            this.f121495c = i;
        }

        @Override // p000.C40672ez2.InterfaceC20160b
        /* renamed from: a */
        public void mo1249a() {
            ImageView imageView;
            WeakReference weakReference = (WeakReference) C52845zX1.this.f121492c.get(this.f121494b);
            if (weakReference == null) {
                imageView = null;
            } else {
                imageView = (ImageView) weakReference.get();
            }
            if (imageView != null) {
                imageView.setImageResource(this.f121495c);
            } else {
                C32290Cx2.m111212c(C52845zX1.f121489e, Intrinsics.stringPlus("ImageView is null for failed Logo - ", this.f121494b));
            }
            C52845zX1.this.f121491b.remove(this.f121494b);
            C52845zX1.this.f121492c.remove(this.f121494b);
        }

        @Override // p000.C40672ez2.InterfaceC20160b
        /* renamed from: b */
        public void mo1248b(BitmapDrawable drawable) {
            ImageView imageView;
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            WeakReference weakReference = (WeakReference) C52845zX1.this.f121492c.get(this.f121494b);
            if (weakReference == null) {
                imageView = null;
            } else {
                imageView = (ImageView) weakReference.get();
            }
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                C32290Cx2.m111212c(C52845zX1.f121489e, Intrinsics.stringPlus("ImageView is null for received Logo - ", this.f121494b));
            }
            C52845zX1.this.f121491b.remove(this.f121494b);
            C52845zX1.this.f121492c.remove(this.f121494b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"LzX1$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/adyen/checkout/core/api/Environment;", "environment", "LzX1;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: zX1$b */
    /* loaded from: classes.dex */
    public static final class C31036b {
        public /* synthetic */ C31036b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C52845zX1 m1247a(Context context, Environment environment) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(environment, "environment");
            C37681Zy2.C10476a c10476a = C37681Zy2.f49588e;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "context.resources.displayMetrics");
            return new C52845zX1(c10476a.m72170b(environment, displayMetrics));
        }

        private C31036b() {
        }
    }

    static {
        String m9434c = C50139ux2.m9434c();
        Intrinsics.checkNotNullExpressionValue(m9434c, "getTag()");
        f121489e = m9434c;
    }

    public C52845zX1(C37681Zy2 logoApi) {
        Intrinsics.checkNotNullParameter(logoApi, "logoApi");
        this.f121490a = logoApi;
        this.f121491b = new HashMap();
        this.f121492c = new HashMap();
    }

    @JvmOverloads
    /* renamed from: d */
    public final void m1251d(String txVariant, ImageView view, int i, int i2) {
        Intrinsics.checkNotNullParameter(txVariant, "txVariant");
        Intrinsics.checkNotNullParameter(view, "view");
        m1250e(txVariant, "", view, i, i2);
    }

    @JvmOverloads
    /* renamed from: e */
    public final void m1250e(String txVariant, String txSubVariant, ImageView view, int i, int i2) {
        Intrinsics.checkNotNullParameter(txVariant, "txVariant");
        Intrinsics.checkNotNullParameter(txSubVariant, "txSubVariant");
        Intrinsics.checkNotNullParameter(view, "view");
        if (i != 0) {
            view.setImageResource(i);
        }
        String str = txVariant + txSubVariant + view.hashCode();
        if (this.f121491b.containsKey(str)) {
            this.f121491b.remove(str);
            this.f121492c.remove(str);
        }
        C31035a c31035a = new C31035a(str, i2);
        this.f121492c.put(str, new WeakReference<>(view));
        this.f121491b.put(str, c31035a);
        this.f121490a.m72175h(txVariant, txSubVariant, null, c31035a);
    }
}
