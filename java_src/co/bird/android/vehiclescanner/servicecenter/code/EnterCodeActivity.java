package co.bird.android.vehiclescanner.servicecenter.code;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.PartKind;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lse1;", "B", "Lse1;", "j0", "()Lse1;", "setPresenter", "(Lse1;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "b", "c", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnterCodeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterCodeActivity.kt\nco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n44#2:80\n6#3:81\n1#4:82\n13#5,2:83\n15#5,2:87\n1109#6,2:85\n1549#7:89\n1620#7,3:90\n*S KotlinDebug\n*F\n+ 1 EnterCodeActivity.kt\nco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity\n*L\n40#1:80\n45#1:81\n45#1:82\n45#1:83,2\n45#1:87,2\n45#1:85,2\n46#1:89\n46#1:90,3\n*E\n"})
/* loaded from: classes4.dex */
public final class EnterCodeActivity extends BaseActivity {

    /* renamed from: C */
    public static final C16430a f67083C = new C16430a(null);

    /* renamed from: B */
    public InterfaceC48762se1 f67084B;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity$a;", "", "", "REQUEST_CODE_BIRD", "I", "REQUEST_CODE_PART", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.EnterCodeActivity$a */
    /* loaded from: classes4.dex */
    public static final class C16430a {
        public /* synthetic */ C16430a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16430a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity$b;", "", "Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity;", "activity", "", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC16433c.class})
    /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.EnterCodeActivity$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC16431b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Ly3;", "binding", "Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity$b;", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.EnterCodeActivity$b$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC16432a {
            /* renamed from: a */
            InterfaceC16431b mo54801a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C30410y3 c30410y3);
        }

        /* renamed from: a */
        void mo54808a(EnterCodeActivity enterCodeActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\t"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity$c;", "", "LVe1;", "impl", "LSe1;", C17296a.f69688o, "LNe1;", "Lse1;", "b", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.vehiclescanner.servicecenter.code.EnterCodeActivity$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC16433c {
        @Binds
        /* renamed from: a */
        InterfaceC35862Se1 m54811a(C36564Ve1 c36564Ve1);

        @Binds
        /* renamed from: b */
        InterfaceC48762se1 m54810b(C34692Ne1 c34692Ne1);
    }

    public EnterCodeActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC48762se1 m54812j0() {
        InterfaceC48762se1 interfaceC48762se1 = this.f67084B;
        if (interfaceC48762se1 != null) {
            return interfaceC48762se1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Enum r7;
        int collectionSizeOrDefault;
        boolean equals;
        super.onCreate(bundle);
        C30410y3 m4221c = C30410y3.m4221c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m4221c, "inflate(layoutInflater)");
        setContentView(m4221c.getRoot());
        InterfaceC16431b.InterfaceC16432a m54809a = C16434a.m54809a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m54809a.mo54801a(m21419a, this, m45197b, m4221c).mo54808a(this);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String stringExtra = intent.getStringExtra("part_kind");
        ArrayList arrayList = null;
        if (stringExtra != null) {
            try {
                Object[] enumConstants = PartKind.class.getEnumConstants();
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
                Object[] enumConstants2 = PartKind.class.getEnumConstants();
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
        PartKind partKind = (PartKind) r7;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("bird_model");
        if (stringArrayListExtra != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(stringArrayListExtra, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (String model : stringArrayListExtra) {
                Intrinsics.checkNotNullExpressionValue(model, "model");
                arrayList.add(BirdModel.valueOf(model));
            }
        }
        m54812j0().mo13916a(arrayList, partKind);
    }
}
