package co.bird.android.feature.frequentFlyer;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireFrequentFlyerView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LfA1;", "B", "LfA1;", "j0", "()LfA1;", "setPresenter", "(LfA1;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FrequentFlyerActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC40780fA1 f64015B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$a;", "", "Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity;", "activity", "", C17296a.f69688o, "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14843b.class})
    /* renamed from: co.bird.android.feature.frequentFlyer.FrequentFlyerActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14841a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$a;", C17296a.f69688o, "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.frequentFlyer.FrequentFlyerActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14842a {
            /* renamed from: a */
            InterfaceC14841a mo58145a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity);
        }

        /* renamed from: a */
        void mo58144a(FrequentFlyerActivity frequentFlyerActivity);
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H'¨\u0006\r"}, m28432d2 = {"Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b;", "", "LjA1;", "presenter", "LfA1;", "b", "LoA1;", "ui", "LnA1;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", C17296a.f69688o, "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.frequentFlyer.FrequentFlyerActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14843b {

        /* renamed from: a */
        public static final C14844a f64016a = new C14844a(null);

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$b$a;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/model/wire/WireFrequentFlyerView;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "b", "<init>", "()V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        @SourceDebugExtension({"SMAP\nFrequentFlyerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerActivity.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$FrequentFlyerActivityModule$Companion\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,93:1\n44#2:94\n*S KotlinDebug\n*F\n+ 1 FrequentFlyerActivity.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerActivity$FrequentFlyerActivityModule$Companion\n*L\n72#1:94\n*E\n"})
        /* renamed from: co.bird.android.feature.frequentFlyer.FrequentFlyerActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class C14844a {
            public /* synthetic */ C14844a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Provides
            @JvmStatic
            /* renamed from: a */
            public final WireFrequentFlyerView m58148a(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Parcelable parcelableExtra = activity.getIntent().getParcelableExtra("frequent_flyer_data");
                Intrinsics.checkNotNull(parcelableExtra);
                return (WireFrequentFlyerView) parcelableExtra;
            }

            @Provides
            @JvmStatic
            /* renamed from: b */
            public final ScopeProvider m58147b(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(activity);
                Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
                return m45197b;
            }

            private C14844a() {
            }
        }

        @Provides
        @JvmStatic
        /* renamed from: a */
        public static final WireFrequentFlyerView m58152a(BaseActivity baseActivity) {
            return f64016a.m58148a(baseActivity);
        }

        @Provides
        @JvmStatic
        /* renamed from: c */
        public static final ScopeProvider m58150c(BaseActivity baseActivity) {
            return f64016a.m58147b(baseActivity);
        }

        @Binds
        /* renamed from: b */
        public abstract InterfaceC40780fA1 m58151b(C43152jA1 c43152jA1);

        @Binds
        /* renamed from: d */
        public abstract InterfaceC45524nA1 m58149d(C46117oA1 c46117oA1);
    }

    public FrequentFlyerActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC40780fA1 m58153j0() {
        InterfaceC40780fA1 interfaceC40780fA1 = this.f64015B;
        if (interfaceC40780fA1 != null) {
            return interfaceC40780fA1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C39922dj4.activity_frequent_flyer);
        InterfaceC14841a.InterfaceC14842a m58146a = C14845a.m58146a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m58146a.mo58145a(c46172oG2.m21419a(application), this).mo58144a(this);
        m58153j0().mo31045a();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C34749Nk4.menu_frequent_flyer, menu);
        return true;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C47610qh4.faq) {
            m58153j0().mo31044b();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
