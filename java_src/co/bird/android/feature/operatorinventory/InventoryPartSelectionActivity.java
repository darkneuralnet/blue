package co.bird.android.feature.operatorinventory;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.HealthStatus;
import co.bird.android.model.wire.WirePartCategory;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/operatorinventory/InventoryPartSelectionActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Lv92;", "B", "Lv92;", "j0", "()Lv92;", "setPresenter", "(Lv92;)V", "presenter", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryPartSelectionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryPartSelectionActivity.kt\nco/bird/android/feature/operatorinventory/InventoryPartSelectionActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,73:1\n44#2:74\n6#3:75\n1#4:76\n13#5,2:77\n15#5,2:81\n1109#6,2:79\n*S KotlinDebug\n*F\n+ 1 InventoryPartSelectionActivity.kt\nco/bird/android/feature/operatorinventory/InventoryPartSelectionActivity\n*L\n36#1:74\n43#1:75\n43#1:76\n43#1:77,2\n43#1:81,2\n43#1:79,2\n*E\n"})
/* loaded from: classes3.dex */
public final class InventoryPartSelectionActivity extends BaseActivity {

    /* renamed from: B */
    public C50257v92 f64322B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/operatorinventory/InventoryPartSelectionActivity$a;", "", "Lco/bird/android/feature/operatorinventory/InventoryPartSelectionActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.operatorinventory.InventoryPartSelectionActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15045a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/operatorinventory/InventoryPartSelectionActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LY3;", "inventoryPartBinding", "LTm2;", "searchHeaderBinding", "Lco/bird/android/feature/operatorinventory/InventoryPartSelectionActivity$a;", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.operatorinventory.InventoryPartSelectionActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15046a {
            /* renamed from: a */
            InterfaceC15045a mo57833a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C9606Y3 c9606y3, @BindsInstance C36169Tm2 c36169Tm2);
        }

        /* renamed from: a */
        void mo57832a(InventoryPartSelectionActivity inventoryPartSelectionActivity);
    }

    public InventoryPartSelectionActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C50257v92 m57841j0() {
        C50257v92 c50257v92 = this.f64322B;
        if (c50257v92 != null) {
            return c50257v92;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Enum r7;
        boolean equals;
        super.onCreate(bundle);
        C9606Y3 m75797c = C9606Y3.m75797c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m75797c, "inflate(layoutInflater)");
        C36169Tm2 m82980a = C36169Tm2.m82980a(m75797c.getRoot());
        Intrinsics.checkNotNullExpressionValue(m82980a, "bind(binding.root)");
        setContentView(m75797c.getRoot());
        InterfaceC15045a.InterfaceC15046a m57834a = C15050b.m57834a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m57834a.mo57833a(m21419a, this, m45197b, m75797c, m82980a).mo57832a(this);
        WirePartCategory wirePartCategory = (WirePartCategory) getIntent().getParcelableExtra("category");
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String stringExtra = intent.getStringExtra("health_status");
        if (stringExtra != null) {
            try {
                Object[] enumConstants = HealthStatus.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r7 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = HealthStatus.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r7 = (Enum) obj2;
                    if (Intrinsics.areEqual(r7.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r7 = null;
        HealthStatus healthStatus = (HealthStatus) r7;
        if (wirePartCategory != null) {
            m57841j0().m9081w(wirePartCategory);
        } else if (healthStatus != null) {
            m57841j0().m9124A(healthStatus);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57841j0().m9118G();
    }
}
