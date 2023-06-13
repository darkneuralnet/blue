package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.constant.InspectionContext;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.Observable;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24558d;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0011B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u000e0\u000e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"La42;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "N6", "Lj42;", "b", "Lj42;", "a5", "()Lj42;", "setPresenter", "(Lj42;)V", "presenter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "responseSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInspectionV3CompleteBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3CompleteBottomSheet.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,104:1\n64#2:105\n6#3:106\n1#4:107\n13#5,2:108\n15#5,2:112\n1109#6,2:110\n*S KotlinDebug\n*F\n+ 1 InspectionV3CompleteBottomSheet.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteBottomSheet\n*L\n62#1:105\n72#1:106\n72#1:107\n72#1:108,2\n72#1:112,2\n72#1:110,2\n*E\n"})
/* renamed from: a42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37739a42 extends C17714b {

    /* renamed from: d */
    public static final C10563a f49776d = new C10563a(null);

    /* renamed from: b */
    public C43093j42 f49777b;

    /* renamed from: c */
    public final C24558d<DialogResponse> f49778c;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, m28432d2 = {"La42$a;", "", "Lco/bird/android/model/InspectionFlow;", "inspection", "Lco/bird/android/model/constant/InspectionContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "La42;", C17296a.f69688o, "", "INSPECTION", "Ljava/lang/String;", "TAG", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: a42$a */
    /* loaded from: classes3.dex */
    public static final class C10563a {
        public /* synthetic */ C10563a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37739a42 m71930a(InspectionFlow inspection, InspectionContext context) {
            Intrinsics.checkNotNullParameter(inspection, "inspection");
            Intrinsics.checkNotNullParameter(context, "context");
            C37739a42 c37739a42 = new C37739a42();
            Bundle bundle = new Bundle();
            bundle.putParcelable("inspection", inspection);
            C40749f70.m42020a(bundle, "inspection_context", context);
            c37739a42.setArguments(bundle);
            return c37739a42;
        }

        private C10563a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"La42$b;", "", "La42;", "activity", "", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: a42$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10564b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\\\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014"}, m28432d2 = {"La42$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "primary", "secondary", "Lio/reactivex/subjects/h;", "Lco/bird/android/model/DialogResponse;", "responseSubject", "Landroid/content/DialogInterface;", "dialog", "La42$b;", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: a42$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC10565a {
            /* renamed from: a */
            InterfaceC10564b mo71622a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance RecyclerView recyclerView, @BindsInstance Button button, @BindsInstance Button button2, @BindsInstance AbstractC24569h<DialogResponse> abstractC24569h, @BindsInstance DialogInterface dialogInterface);
        }

        /* renamed from: a */
        void mo71621a(C37739a42 c37739a42);
    }

    public C37739a42() {
        C24558d<DialogResponse> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<DialogResponse>()");
        this.f49778c = m31902e;
    }

    /* renamed from: N6 */
    public final Observable<DialogResponse> m71932N6() {
        Observable<DialogResponse> hide = this.f49778c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "responseSubject.hide()");
        return hide;
    }

    /* renamed from: a5 */
    public final C43093j42 m71931a5() {
        C43093j42 c43093j42 = this.f49777b;
        if (c43093j42 != null) {
            return c43093j42;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C37080Xj4.dialog_inspection_complete_v3, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        InspectionFlow inspectionFlow;
        Bundle arguments;
        boolean equals;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Enum r3 = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC10564b.InterfaceC10565a m71623a = C37896aL0.m71623a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        View findViewById = view.findViewById(C44062ki4.recyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(C44062ki4.primary);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.primary)");
        View findViewById3 = view.findViewById(C44062ki4.secondary);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.secondary)");
        C24558d<DialogResponse> c24558d = this.f49778c;
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m71623a.mo71622a(m21419a, baseActivity, m45195i, recyclerView, (Button) findViewById2, (Button) findViewById3, c24558d, dialog).mo71621a(this);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (inspectionFlow = (InspectionFlow) arguments2.getParcelable("inspection")) != null && (arguments = getArguments()) != null) {
            String string = arguments.getString("inspection_context");
            if (string != null) {
                try {
                    Object[] enumConstants = InspectionContext.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                    for (Object obj : enumConstants) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), string, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            r3 = (Enum) obj;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused) {
                    Object[] enumConstants2 = InspectionContext.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj2 : enumConstants2) {
                        Enum r4 = (Enum) obj2;
                        if (Intrinsics.areEqual(r4.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                            r3 = r4;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            InspectionContext inspectionContext = (InspectionContext) r3;
            if (inspectionContext != null) {
                m71931a5().m31168f(inspectionFlow, inspectionContext);
            }
        }
    }
}
