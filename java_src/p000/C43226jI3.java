package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.AbstractC24507p;
import io.reactivex.subjects.C24556c;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fR\"\u0010\u0015\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\r0\r0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006 "}, m28432d2 = {"LjI3;", "LcE;", "LqI3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lio/reactivex/p;", "Lco/bird/android/model/wire/WirePart;", "N6", "e", "LqI3;", "a5", "()LqI3;", "t8", "(LqI3;)V", "presenter", "Lio/reactivex/subjects/c;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/c;", "partSubject", "<init>", "()V", "g", C17296a.f69688o, "b", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartScanBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartScanBottomSheet.kt\nco/bird/android/vehiclescanner/parts/PartScanBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,100:1\n64#2:101\n6#3:102\n1#4:103\n13#5,2:104\n15#5,2:108\n1109#6,2:106\n*S KotlinDebug\n*F\n+ 1 PartScanBottomSheet.kt\nco/bird/android/vehiclescanner/parts/PartScanBottomSheet\n*L\n58#1:101\n66#1:102\n66#1:103\n66#1:104,2\n66#1:108,2\n66#1:106,2\n*E\n"})
/* renamed from: jI3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43226jI3 extends AbstractC13474cE<C47377qI3> {

    /* renamed from: g */
    public static final C24799a f92490g = new C24799a(null);

    /* renamed from: e */
    public C47377qI3 f92491e;

    /* renamed from: f */
    public final C24556c<WirePart> f92492f;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"LjI3$a;", "", "Lco/bird/android/model/constant/PartKind;", "kind", "", "instructions", "", "warehouseSpecific", "LjI3;", C17296a.f69688o, "INSTRUCTIONS", "Ljava/lang/String;", "TAG", "WAREHOUSE_SPECIFIC", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jI3$a */
    /* loaded from: classes4.dex */
    public static final class C24799a {
        public /* synthetic */ C24799a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C43226jI3 newInstance$default(C24799a c24799a, PartKind partKind, String str, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return c24799a.m30813a(partKind, str, z);
        }

        /* renamed from: a */
        public final C43226jI3 m30813a(PartKind kind, String instructions, boolean z) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            C43226jI3 c43226jI3 = new C43226jI3();
            Bundle bundle = new Bundle();
            C40749f70.m42020a(bundle, "part_kind", kind);
            bundle.putString("instructions", instructions);
            bundle.putBoolean("warehouse_specific", z);
            c43226jI3.setArguments(bundle);
            return c43226jI3;
        }

        private C24799a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LjI3$b;", "", "LjI3;", "activity", "", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: jI3$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC24800b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JR\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0013"}, m28432d2 = {"LjI3$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lf00;", "binding", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/subjects/c;", "Lco/bird/android/model/wire/WirePart;", "partSubject", "Ldm5;", "navigator", "LjI3$b;", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: jI3$b$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC24801a {
            /* renamed from: a */
            InterfaceC24800b mo19393a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C40679f00 c40679f00, @BindsInstance DialogInterface dialogInterface, @BindsInstance C24556c<WirePart> c24556c, @BindsInstance InterfaceC39953dm5 interfaceC39953dm5);
        }

        /* renamed from: a */
        void mo19392a(C43226jI3 c43226jI3);
    }

    public C43226jI3() {
        C24556c<WirePart> m31906k0 = C24556c.m31906k0();
        Intrinsics.checkNotNullExpressionValue(m31906k0, "create<WirePart>()");
        this.f92492f = m31906k0;
    }

    /* renamed from: N6 */
    public final AbstractC24507p<WirePart> m30816N6() {
        AbstractC24507p<WirePart> m32070E = this.f92492f.m32070E();
        Intrinsics.checkNotNullExpressionValue(m32070E, "partSubject.hide()");
        return m32070E;
    }

    @Override // p000.AbstractC13474cE
    /* renamed from: a5 */
    public C47377qI3 getPresenter() {
        C47377qI3 c47377qI3 = this.f92491e;
        if (c47377qI3 != null) {
            return c47377qI3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f92492f.onComplete();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        Enum r5;
        boolean equals;
        Intrinsics.checkNotNullParameter(view, "view");
        C40679f00 m42293a = C40679f00.m42293a(view);
        Intrinsics.checkNotNullExpressionValue(m42293a, "bind(view)");
        FragmentActivity activity = getActivity();
        String str = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC24800b.InterfaceC24801a m19394a = C46826pN0.m19394a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m19394a.mo19393a(m21419a, baseActivity, m45195i, m42293a, dialog, this.f92492f, this).mo19392a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("part_kind");
            boolean z = false;
            if (string != null) {
                try {
                    Object[] enumConstants = PartKind.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                    for (Object obj : enumConstants) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), string, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            r5 = (Enum) obj;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused) {
                    Object[] enumConstants2 = PartKind.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj2 : enumConstants2) {
                        r5 = (Enum) obj2;
                        if (Intrinsics.areEqual(r5.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            r5 = null;
            PartKind partKind = (PartKind) r5;
            if (partKind != null) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    str = arguments2.getString("instructions");
                }
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    z = arguments3.getBoolean("warehouse_specific");
                }
                getPresenter().m17668r(partKind, str, z);
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot start this BottomSheet without a PartKind");
    }

    /* renamed from: t8 */
    public void setPresenter(C47377qI3 c47377qI3) {
        Intrinsics.checkNotNullParameter(c47377qI3, "<set-?>");
        this.f92491e = c47377qI3;
    }
}
