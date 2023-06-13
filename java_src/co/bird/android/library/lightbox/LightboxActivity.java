package co.bird.android.library.lightbox;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0014B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/library/lightbox/LightboxActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LQq2;", "B", "LQq2;", "j0", "()LQq2;", "setPresenter", "(LQq2;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "b", "c", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class LightboxActivity extends BaseActivity {

    /* renamed from: C */
    public static final C16039a f66103C = new C16039a(null);

    /* renamed from: B */
    public InterfaceC35503Qq2 f66104B;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/library/lightbox/LightboxActivity$a;", "", "Landroid/app/Activity;", "activity", "Ljava/util/ArrayList;", "Lco/bird/android/library/lightbox/LightboxImage;", "Lkotlin/collections/ArrayList;", "images", "", "index", "Landroid/content/Intent;", C17296a.f69688o, "", "KEY_IMAGES", "Ljava/lang/String;", "KEY_INDEX", "<init>", "()V", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.library.lightbox.LightboxActivity$a */
    /* loaded from: classes3.dex */
    public static final class C16039a {
        public /* synthetic */ C16039a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent create$default(C16039a c16039a, Activity activity, ArrayList arrayList, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return c16039a.m56037a(activity, arrayList, i);
        }

        @JvmStatic
        /* renamed from: a */
        public final Intent m56037a(Activity activity, ArrayList<LightboxImage> images, int i) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(images, "images");
            Intent intent = new Intent(activity, LightboxActivity.class);
            intent.putExtra("key_images", images);
            intent.putExtra("key_index", i);
            return intent;
        }

        private C16039a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/library/lightbox/LightboxActivity$b;", "", "Lco/bird/android/library/lightbox/LightboxActivity;", "activity", "", C17296a.f69688o, "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC16042c.class})
    /* renamed from: co.bird.android.library.lightbox.LightboxActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC16040b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lco/bird/android/library/lightbox/LightboxActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/library/lightbox/LightboxActivity$b;", C17296a.f69688o, "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.library.lightbox.LightboxActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC16041a {
            /* renamed from: a */
            InterfaceC16040b mo56026a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity);
        }

        /* renamed from: a */
        void mo56025a(LightboxActivity lightboxActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/library/lightbox/LightboxActivity$c;", "", "LUq2;", "impl", "LTq2;", "c", "LSq2;", "LQq2;", C17296a.f69688o, "<init>", "()V", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.library.lightbox.LightboxActivity$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC16042c {

        /* renamed from: a */
        public static final C16043a f66105a = new C16043a(null);

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/library/lightbox/LightboxActivity$c$a;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "<init>", "()V", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        @SourceDebugExtension({"SMAP\nLightboxActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightboxActivity.kt\nco/bird/android/library/lightbox/LightboxActivity$LightboxModule$Companion\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,95:1\n44#2:96\n*S KotlinDebug\n*F\n+ 1 LightboxActivity.kt\nco/bird/android/library/lightbox/LightboxActivity$LightboxModule$Companion\n*L\n74#1:96\n*E\n"})
        /* renamed from: co.bird.android.library.lightbox.LightboxActivity$c$a */
        /* loaded from: classes3.dex */
        public static final class C16043a {
            public /* synthetic */ C16043a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Provides
            @JvmStatic
            /* renamed from: a */
            public final ScopeProvider m56033a(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(activity);
                Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
                return m45197b;
            }

            private C16043a() {
            }
        }

        @Provides
        @JvmStatic
        /* renamed from: b */
        public static final ScopeProvider m56035b(BaseActivity baseActivity) {
            return f66105a.m56033a(baseActivity);
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC35503Qq2 m56036a(C35971Sq2 c35971Sq2);

        @Binds
        /* renamed from: c */
        public abstract InterfaceC36205Tq2 m56034c(C36439Uq2 c36439Uq2);
    }

    public LightboxActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: j0 */
    public final InterfaceC35503Qq2 m56038j0() {
        InterfaceC35503Qq2 interfaceC35503Qq2 = this.f66104B;
        if (interfaceC35503Qq2 != null) {
            return interfaceC35503Qq2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m56038j0().onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39321ck4.activity_lightbox);
        InterfaceC16040b.InterfaceC16041a m56027a = C16045a.m56027a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m56027a.mo56026a(c46172oG2.m21419a(application), this).mo56025a(this);
        InterfaceC35503Qq2 m56038j0 = m56038j0();
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_images");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        m56038j0.mo84799a(parcelableArrayListExtra, getIntent().getIntExtra("key_index", 0));
    }
}
