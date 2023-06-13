package co.bird.android.app.feature.nest.photo;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.nest.photo.PhotoViewActivity;
import co.bird.android.core.mvp.BaseActivity;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.share.internal.C17296a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\r"}, m28432d2 = {"Lco/bird/android/app/feature/nest/photo/PhotoViewActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "k0", "", "m0", "<init>", "()V", "B", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PhotoViewActivity extends BaseActivity {

    /* renamed from: B */
    public static final C13913a f61666B = new C13913a(null);

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/nest/photo/PhotoViewActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "url", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.nest.photo.PhotoViewActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13913a {
        public /* synthetic */ C13913a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60332a(Context context, String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent(context, PhotoViewActivity.class);
            intent.putExtra("url", url);
            return intent;
        }

        private C13913a() {
        }
    }

    @Metadata(m28433d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J>\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J4\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, m28432d2 = {"co/bird/android/app/feature/nest/photo/PhotoViewActivity$b", "LTI4;", "Landroid/graphics/drawable/Drawable;", "resource", "", RequestHeadersFactory.MODEL, "LLY5;", "target", "LZS0;", "dataSource", "", "isFirstResource", "b", "Lcom/bumptech/glide/load/engine/GlideException;", "e", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.nest.photo.PhotoViewActivity$b */
    /* loaded from: classes2.dex */
    public static final class C13914b implements TI4<Drawable> {

        /* renamed from: b */
        public final /* synthetic */ C27482q4 f61667b;

        public C13914b(C27482q4 c27482q4) {
            this.f61667b = c27482q4;
        }

        @Override // p000.TI4
        /* renamed from: a */
        public boolean mo6879a(GlideException glideException, Object obj, LY5<Drawable> ly5, boolean z) {
            CircularProgressIndicator circularProgressIndicator = this.f61667b.f104620c;
            Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.progressBar");
            C49520tu6.show$default(circularProgressIndicator, false, 0, 2, null);
            return false;
        }

        @Override // p000.TI4
        /* renamed from: b */
        public boolean onResourceReady(Drawable drawable, Object obj, LY5<Drawable> ly5, ZS0 zs0, boolean z) {
            CircularProgressIndicator circularProgressIndicator = this.f61667b.f104620c;
            Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.progressBar");
            C49520tu6.show$default(circularProgressIndicator, false, 0, 2, null);
            return false;
        }
    }

    public PhotoViewActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: n0 */
    public static final void m60333n0(PhotoViewActivity this$0, ImageView imageView, float f, float f2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m60335k0();
    }

    /* renamed from: k0 */
    public final void m60335k0() {
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        if (m60334m0()) {
            C41318g46.m40157g("Turning immersive mode mode off.", new Object[0]);
        } else {
            C41318g46.m40157g("Turning immersive mode mode on.", new Object[0]);
        }
        getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* renamed from: m0 */
    public final boolean m60334m0() {
        return false;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27482q4 m18242c = C27482q4.m18242c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m18242c, "inflate(layoutInflater)");
        setContentView(m18242c.getRoot());
        String stringExtra = getIntent().getStringExtra("url");
        CircularProgressIndicator circularProgressIndicator = m18242c.f104620c;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.progressBar");
        C49520tu6.show$default(circularProgressIndicator, true, 0, 2, null);
        ComponentCallbacks2C17096a.m53136v(this).m81653k(stringExtra).m16083f1(0.1f).m16094T0(new C13914b(m18242c)).m16096R0(m18242c.f104619b);
        m18242c.f104619b.setOnPhotoTapListener(new InterfaceC38104ah3() { // from class: mS3
            @Override // p000.InterfaceC38104ah3
            /* renamed from: a */
            public final void mo25606a(ImageView imageView, float f, float f2) {
                PhotoViewActivity.m60333n0(PhotoViewActivity.this, imageView, f, f2);
            }
        });
    }
}
