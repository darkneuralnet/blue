package co.bird.android.retakeablephoto;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Folder;
import co.bird.android.model.PhotoBannerViewModel;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00122\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/retakeablephoto/RetakeablePhotoActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "LoN4;", "B", "LoN4;", "j0", "()LoN4;", "setPresenter", "(LoN4;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "b", "c", "retakeable-photo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RetakeablePhotoActivity extends BaseActivity {

    /* renamed from: C */
    public static final C16361a f66975C = new C16361a(null);

    /* renamed from: B */
    public InterfaceC46237oN4 f66976B;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "", "photoStoragePath", "Lco/bird/android/model/Folder;", "destS3Folder", "", "overrideUploadViaSignedUrl", "useAssetId", "Landroid/content/Intent;", C17296a.f69688o, "(Landroid/content/Context;Lco/bird/android/model/PhotoBannerViewModel;Ljava/lang/String;Lco/bird/android/model/Folder;Ljava/lang/Boolean;Z)Landroid/content/Intent;", "<init>", "()V", "retakeable-photo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.retakeablephoto.RetakeablePhotoActivity$a */
    /* loaded from: classes4.dex */
    public static final class C16361a {
        public /* synthetic */ C16361a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent newIntent$default(C16361a c16361a, Context context, PhotoBannerViewModel photoBannerViewModel, String str, Folder folder, Boolean bool, boolean z, int i, Object obj) {
            if ((i & 16) != 0) {
                bool = null;
            }
            return c16361a.m54970a(context, photoBannerViewModel, str, folder, bool, z);
        }

        /* renamed from: a */
        public final Intent m54970a(Context context, PhotoBannerViewModel photoBannerViewModel, String str, Folder folder, Boolean bool, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, RetakeablePhotoActivity.class);
            if (photoBannerViewModel != null) {
                intent.putExtra("photo_banner_view_model", photoBannerViewModel);
            }
            intent.putExtra("photo_storage_path", str);
            intent.putExtra("destination_s3_folder", folder);
            intent.putExtra("override_upload_via_signed_url", bool);
            intent.putExtra("use_asset_id", z);
            return intent;
        }

        private C16361a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$b;", "", "Lco/bird/android/retakeablephoto/RetakeablePhotoActivity;", "activity", "", C17296a.f69688o, "retakeable-photo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC16364c.class})
    /* renamed from: co.bird.android.retakeablephoto.RetakeablePhotoActivity$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC16362b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H&¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "", "overrideUploadViaSignedUrl", "useAssetId", "Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$b;", C17296a.f69688o, "retakeable-photo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.retakeablephoto.RetakeablePhotoActivity$b$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC16363a {
            /* renamed from: a */
            InterfaceC16362b mo54964a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance boolean z, @BindsInstance boolean z2);
        }

        /* renamed from: a */
        void mo54963a(RetakeablePhotoActivity retakeablePhotoActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c;", "", "LGN4;", "impl", "LFN4;", "b", "LEN4;", "LoN4;", C17296a.f69688o, "<init>", "()V", "retakeable-photo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.retakeablephoto.RetakeablePhotoActivity$c */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC16364c {

        /* renamed from: a */
        public static final C16365a f66977a = new C16365a(null);

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c$a;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "<init>", "()V", "retakeable-photo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        @SourceDebugExtension({"SMAP\nRetakeablePhotoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetakeablePhotoActivity.kt\nco/bird/android/retakeablephoto/RetakeablePhotoActivity$RetakeablePhotoModule$Companion\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,125:1\n44#2:126\n*S KotlinDebug\n*F\n+ 1 RetakeablePhotoActivity.kt\nco/bird/android/retakeablephoto/RetakeablePhotoActivity$RetakeablePhotoModule$Companion\n*L\n96#1:126\n*E\n"})
        /* renamed from: co.bird.android.retakeablephoto.RetakeablePhotoActivity$c$a */
        /* loaded from: classes4.dex */
        public static final class C16365a {
            public /* synthetic */ C16365a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Provides
            @JvmStatic
            /* renamed from: a */
            public final ScopeProvider m54966a(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(activity);
                Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
                return m45197b;
            }

            private C16365a() {
            }
        }

        @Provides
        @JvmStatic
        /* renamed from: c */
        public static final ScopeProvider m54967c(BaseActivity baseActivity) {
            return f66977a.m54966a(baseActivity);
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC46237oN4 m54969a(EN4 en4);

        @Binds
        /* renamed from: b */
        public abstract FN4 m54968b(GN4 gn4);
    }

    public RetakeablePhotoActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC46237oN4 m54971j0() {
        InterfaceC46237oN4 interfaceC46237oN4 = this.f66976B;
        if (interfaceC46237oN4 != null) {
            return interfaceC46237oN4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Folder folder;
        super.onCreate(bundle);
        setContentView(C46454ok4.activity_retakeable_photo);
        String stringExtra = getIntent().getStringExtra("photo_storage_path");
        InterfaceC16362b.InterfaceC16363a m54965a = C16366a.m54965a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m54965a.mo54964a(c46172oG2.m21419a(application), this, getIntent().getBooleanExtra("override_upload_via_signed_url", false), getIntent().getBooleanExtra("use_asset_id", false)).mo54963a(this);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getString(C45871nl4.take_a_photo));
        }
        InterfaceC46237oN4 m54971j0 = m54971j0();
        String str = getCacheDir().getAbsolutePath() + "/" + stringExtra;
        PhotoBannerViewModel photoBannerViewModel = (PhotoBannerViewModel) getIntent().getParcelableExtra("photo_banner_view_model");
        Serializable serializableExtra = getIntent().getSerializableExtra("destination_s3_folder");
        if (serializableExtra instanceof Folder) {
            folder = (Folder) serializableExtra;
        } else {
            folder = null;
        }
        m54971j0.mo21247a(str, photoBannerViewModel, folder);
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo70212v(false);
            supportActionBar2.mo70245B(false);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m54971j0().onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m54971j0().onResume();
    }
}
