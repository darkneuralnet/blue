package co.bird.android.feature.scrap;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.model.PhotoSavedModel;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/feature/scrap/ScrapActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lnp5;", "B", "Lnp5;", "j0", "()Lnp5;", "setPresenter", "(Lnp5;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapActivity.kt\nco/bird/android/feature/scrap/ScrapActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n44#2:115\n1#3:116\n*S KotlinDebug\n*F\n+ 1 ScrapActivity.kt\nco/bird/android/feature/scrap/ScrapActivity\n*L\n50#1:115\n*E\n"})
/* loaded from: classes3.dex */
public final class ScrapActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC45912np5 f65194B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/scrap/ScrapActivity$a;", "", "Lco/bird/android/feature/scrap/ScrapActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class, InterfaceC47078pn5.class}, modules = {AbstractC15522b.class})
    /* renamed from: co.bird.android.feature.scrap.ScrapActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15520a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JJ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/scrap/ScrapActivity$a$a;", "", "LlG2;", "mainComponent", "Lpn5;", "scrapComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "submit", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "Lco/bird/android/feature/scrap/ScrapActivity$a;", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.scrap.ScrapActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15521a {
            /* renamed from: a */
            InterfaceC15520a mo56980a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC47078pn5 interfaceC47078pn5, @BindsInstance BaseActivity baseActivity, @BindsInstance RecyclerView recyclerView, @BindsInstance Button button, @BindsInstance ScopeProvider scopeProvider, @BindsInstance PhotoBannerViewModel photoBannerViewModel);
        }

        /* renamed from: a */
        void mo56979a(ScrapActivity scrapActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/scrap/ScrapActivity$b;", "", "LJp5;", "impl", "LIp5;", "c", "LCp5;", "Lnp5;", "b", "Ltn5;", "Lrn5;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.scrap.ScrapActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15522b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC48264rn5 m56984a(C49449tn5 c49449tn5);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC45912np5 m56983b(C32221Cp5 c32221Cp5);

        @Binds
        /* renamed from: c */
        public abstract InterfaceC33625Ip5 m56982c(C33859Jp5 c33859Jp5);
    }

    public ScrapActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC45912np5 m56985j0() {
        InterfaceC45912np5 interfaceC45912np5 = this.f65194B;
        if (interfaceC45912np5 != null) {
            return interfaceC45912np5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        PhotoSavedModel photoSavedModel;
        super.onActivityResult(i, i2, intent);
        if (i == 10026 && i2 == -1 && intent != null && (photoSavedModel = (PhotoSavedModel) intent.getParcelableExtra("photo_saved_model")) != null) {
            m56985j0().mo22333a(new File(photoSavedModel.getPhotoPath()));
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C34272Lj4.activity_scrap);
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        InterfaceC15520a.InterfaceC15521a m56981a = C15523a.m56981a();
        InterfaceC47078pn5 mo18688a = C38534bQ0.m64555a().mo18688a(m21419a);
        View findViewById = findViewById(C37296Yh4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = findViewById(C37296Yh4.submit);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.submit)");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56981a.mo56980a(m21419a, mo18688a, this, recyclerView, (Button) findViewById2, m45197b, new PhotoBannerViewModel(null, null, Integer.valueOf(C48193rg4.ic_issue_triangle), Integer.valueOf(C32364Df4.birdNewRoad), null, Integer.valueOf(C45871nl4.scrap_photo_info_view_body), null, null, null, 467, null)).mo56979a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        VehicleScrapRequest vehicleScrapRequest = (VehicleScrapRequest) getIntent().getParcelableExtra("scrap_request");
        if (wireBird != null) {
            m56985j0().mo22332b(wireBird, vehicleScrapRequest);
            return;
        }
        throw new IllegalArgumentException("Cannot show Scrap Inspection without a Bird".toString());
    }
}
