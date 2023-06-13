package co.bird.android.feature.repair.p015v2.subtypes;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import co.bird.android.model.RepairType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LYy4;", "B", "LYy4;", "j0", "()LYy4;", "setPresenter", "(LYy4;)V", "presenter", "LNy4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LNy4;", "component", "<init>", "()V", "D", C17296a.f69688o, "b", "c", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSubtypesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesActivity.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,136:1\n44#2:137\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesActivity.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity\n*L\n58#1:137\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v2.subtypes.RepairIssueSubtypesActivity */
/* loaded from: classes3.dex */
public final class RepairIssueSubtypesActivity extends BaseActivity {

    /* renamed from: D */
    public static final C15220a f64645D = new C15220a(null);

    /* renamed from: B */
    public InterfaceC37449Yy4 f64646B;

    /* renamed from: C */
    public InterfaceC34875Ny4 f64647C;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$a;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.repair.v2.subtypes.RepairIssueSubtypesActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15220a {
        public /* synthetic */ C15220a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15220a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$b;", "", "Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;", "activity", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class, InterfaceC34875Ny4.class}, modules = {AbstractC15223c.class})
    /* renamed from: co.bird.android.feature.repair.v2.subtypes.RepairIssueSubtypesActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15221b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jh\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$b$a;", "", "LlG2;", "mainComponent", "LNy4;", "repairComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/widget/TextView;", "supertype", "repaired", "Landroid/widget/ImageView;", "asset", "Landroid/widget/Button;", "logRepairs", "reroute", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$b;", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.v2.subtypes.RepairIssueSubtypesActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15222a {
            /* renamed from: a */
            InterfaceC15221b mo57532a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC34875Ny4 interfaceC34875Ny4, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance TextView textView, @BindsInstance TextView textView2, @BindsInstance ImageView imageView, @BindsInstance Button button, @BindsInstance Button button2, @BindsInstance RecyclerView recyclerView);
        }

        /* renamed from: a */
        void mo57531a(RepairIssueSubtypesActivity repairIssueSubtypesActivity);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$c;", "", "LGz4;", "impl", "LFz4;", "c", "Lxz4;", "LYy4;", "b", "LWy4;", "LUy4;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.repair.v2.subtypes.RepairIssueSubtypesActivity$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15223c {

        /* renamed from: a */
        public static final C15224a f64648a = new C15224a(null);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$c$a;", "", "", "LOG_REPAIRS", "Ljava/lang/String;", "REPAIRED", "REROUTE", "SUPERTYPE", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.repair.v2.subtypes.RepairIssueSubtypesActivity$c$a */
        /* loaded from: classes3.dex */
        public static final class C15224a {
            public /* synthetic */ C15224a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C15224a() {
            }
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC36513Uy4 m57536a(C36981Wy4 c36981Wy4);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC37449Yy4 m57535b(C51939xz4 c51939xz4);

        @Binds
        /* renamed from: c */
        public abstract InterfaceC33012Fz4 m57534c(C33246Gz4 c33246Gz4);
    }

    public RepairIssueSubtypesActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC37449Yy4 m57537j0() {
        InterfaceC37449Yy4 interfaceC37449Yy4 = this.f64646B;
        if (interfaceC37449Yy4 != null) {
            return interfaceC37449Yy4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        RepairType repairType;
        WirePart wirePart;
        super.onActivityResult(i, i2, intent);
        if (i != 10002) {
            if (i == 10027 && i2 == -1) {
                mo58957w().mo37050b1(-1);
            }
        } else if (i2 != -1 || intent == null || (repairType = (RepairType) intent.getParcelableExtra("repair_types")) == null || (wirePart = (WirePart) intent.getParcelableExtra("part")) == null) {
        } else {
            m57537j0().mo4327b(repairType, wirePart);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Issue issue;
        ArrayList parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2;
        super.onCreate(bundle);
        setContentView(C32634Ej4.activity_repair_v2_subtypes);
        C35343Py4 c35343Py4 = C35343Py4.f29494b;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        this.f64647C = (InterfaceC34875Ny4) AbstractC31704Ak1.component$default(c35343Py4, application, null, 2, null);
        InterfaceC15221b.InterfaceC15222a m57533a = C15225a.m57533a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application2 = getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application2);
        InterfaceC34875Ny4 interfaceC34875Ny4 = this.f64647C;
        if (interfaceC34875Ny4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            interfaceC34875Ny4 = null;
        }
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        View findViewById = findViewById(C35658Rh4.supertype);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.supertype)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = findViewById(C35658Rh4.repairsNeeded);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.repairsNeeded)");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = findViewById(C35658Rh4.asset);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.asset)");
        ImageView imageView = (ImageView) findViewById3;
        View findViewById4 = findViewById(C35658Rh4.logRepairs);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.logRepairs)");
        Button button = (Button) findViewById4;
        View findViewById5 = findViewById(C35658Rh4.reroute);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.reroute)");
        Button button2 = (Button) findViewById5;
        View findViewById6 = findViewById(C35658Rh4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.recyclerView)");
        m57533a.mo57532a(m21419a, interfaceC34875Ny4, this, m45197b, textView, textView2, imageView, button, button2, (RecyclerView) findViewById6).mo57531a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        if (wireBird == null || (issue = (Issue) getIntent().getParcelableExtra("issue")) == null || (parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("previously_selected_repairs")) == null || (parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("repair_types")) == null) {
            return;
        }
        m57537j0().mo4329a(wireBird, issue, parcelableArrayListExtra, parcelableArrayListExtra2);
    }
}
