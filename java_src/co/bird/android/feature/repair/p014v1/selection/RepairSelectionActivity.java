package co.bird.android.feature.repair.p014v1.selection;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/selection/RepairSelectionActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LfD4;", "B", "LfD4;", "j0", "()LfD4;", "setPresenter", "(LfD4;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "b", "c", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSelectionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionActivity.kt\nco/bird/android/feature/repair/v1/selection/RepairSelectionActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,89:1\n44#2:90\n*S KotlinDebug\n*F\n+ 1 RepairSelectionActivity.kt\nco/bird/android/feature/repair/v1/selection/RepairSelectionActivity\n*L\n43#1:90\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v1.selection.RepairSelectionActivity */
/* loaded from: classes3.dex */
public final class RepairSelectionActivity extends BaseActivity {

    /* renamed from: C */
    public static final C15205a f64624C = new C15205a(null);

    /* renamed from: B */
    public InterfaceC40810fD4 f64625B;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/selection/RepairSelectionActivity$a;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.repair.v1.selection.RepairSelectionActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15205a {
        public /* synthetic */ C15205a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15205a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/selection/RepairSelectionActivity$b;", "", "Lco/bird/android/feature/repair/v1/selection/RepairSelectionActivity;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15208c.class})
    /* renamed from: co.bird.android.feature.repair.v1.selection.RepairSelectionActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15206b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/selection/RepairSelectionActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lj5;", "binding", "Lco/bird/android/feature/repair/v1/selection/RepairSelectionActivity$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.v1.selection.RepairSelectionActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15207a {
            /* renamed from: a */
            InterfaceC15206b mo57553a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C24709j5 c24709j5);
        }

        /* renamed from: a */
        void mo57552a(RepairSelectionActivity repairSelectionActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/repair/v1/selection/RepairSelectionActivity$c;", "", "LoD4;", "impl", "LnD4;", "c", "LlD4;", "LfD4;", C17296a.f69688o, "LdD4;", "LbD4;", "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.repair.v1.selection.RepairSelectionActivity$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC15208c {
        @Binds
        /* renamed from: a */
        InterfaceC40810fD4 m57557a(C44368lD4 c44368lD4);

        @Binds
        /* renamed from: b */
        InterfaceC38421bD4 m57556b(C39625dD4 c39625dD4);

        @Binds
        /* renamed from: c */
        InterfaceC45554nD4 m57555c(C46147oD4 c46147oD4);
    }

    public RepairSelectionActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC40810fD4 m57558j0() {
        InterfaceC40810fD4 interfaceC40810fD4 = this.f64625B;
        if (interfaceC40810fD4 != null) {
            return interfaceC40810fD4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C24709j5 m31152c = C24709j5.m31152c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m31152c, "inflate(layoutInflater)");
        setContentView(m31152c.getRoot());
        mo58977D();
        InterfaceC15206b.InterfaceC15207a m57554a = C15209a.m57554a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(applicationContext);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57554a.mo57553a(m21419a, this, m45197b, m31152c).mo57552a(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("issue");
        Intrinsics.checkNotNull(parcelableExtra);
        Issue issue = (Issue) parcelableExtra;
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("repairs");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("previously_selected_repairs");
        Intrinsics.checkNotNull(parcelableArrayListExtra2);
        m57558j0().mo27669a(issue, parcelableArrayListExtra, parcelableArrayListExtra2);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(issue.getDisplay());
        }
    }
}
