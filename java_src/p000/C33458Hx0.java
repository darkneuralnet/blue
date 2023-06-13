package p000;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.BaseCoreActivity;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.C17714b;
import com.google.android.material.bottomsheet.DialogC17707a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.subjects.C24558d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 02\u00020\u0001:\u00021\u0012B\u0007¢\u0006\u0004\b.\u0010/J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\b\u0010\u0010\u001a\u00020\u000fH\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u000b0\u000b0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00062"}, m28432d2 = {"LHx0;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/app/Dialog;", "onCreateDialog", "", "getTheme", "LNx0;", "b", "LNx0;", "a5", "()LNx0;", "setPresenter", "(LNx0;)V", "presenter", "", "Lkotlin/Pair;", "", "", "c", "Ljava/util/List;", "lineItems", "", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "metadata", "LTx0;", "e", "LTx0;", "confirmPurchaseOnClickListener", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/d;", "dismissSubject", "<init>", "()V", "g", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfirmPurchaseBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPurchaseBottomSheetDialog.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseBottomSheetDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,114:1\n64#2:115\n*S KotlinDebug\n*F\n+ 1 ConfirmPurchaseBottomSheetDialog.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseBottomSheetDialog\n*L\n71#1:115\n*E\n"})
/* renamed from: Hx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33458Hx0 extends C17714b {

    /* renamed from: g */
    public static final C3278a f14202g = new C3278a(null);

    /* renamed from: b */
    public C34862Nx0 f14203b;

    /* renamed from: c */
    public List<Pair<String, Long>> f14204c;

    /* renamed from: d */
    public final Map<String, Object> f14205d;

    /* renamed from: e */
    public InterfaceC36266Tx0 f14206e;

    /* renamed from: f */
    public final C24558d<Unit> f14207f;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b0\u0007R\u0014\u0010\r\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LHx0$a;", "", "", "", "metadata", "LTx0;", "confirmPurchaseOnClickListener", "", "Lkotlin/Pair;", "", "lineItems", "LHx0;", C17296a.f69688o, "TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfirmPurchaseBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPurchaseBottomSheetDialog.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseBottomSheetDialog$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1855#2,2:115\n*S KotlinDebug\n*F\n+ 1 ConfirmPurchaseBottomSheetDialog.kt\nco/bird/android/feature/payment/bottomsheet/ConfirmPurchaseBottomSheetDialog$Companion\n*L\n41#1:115,2\n*E\n"})
    /* renamed from: Hx0$a */
    /* loaded from: classes3.dex */
    public static final class C3278a {
        public /* synthetic */ C3278a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C33458Hx0 newInstance$default(C3278a c3278a, Map map, InterfaceC36266Tx0 interfaceC36266Tx0, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                map = MapsKt__MapsKt.emptyMap();
            }
            return c3278a.m103202a(map, interfaceC36266Tx0, list);
        }

        /* renamed from: a */
        public final C33458Hx0 m103202a(Map<String, ? extends Object> metadata, InterfaceC36266Tx0 confirmPurchaseOnClickListener, List<Pair<String, Long>> lineItems) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(confirmPurchaseOnClickListener, "confirmPurchaseOnClickListener");
            Intrinsics.checkNotNullParameter(lineItems, "lineItems");
            C33458Hx0 c33458Hx0 = new C33458Hx0();
            c33458Hx0.f14206e = confirmPurchaseOnClickListener;
            Iterator<T> it = metadata.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object value = entry.getValue();
                c33458Hx0.f14205d.put((String) entry.getKey(), value);
            }
            c33458Hx0.f14204c = lineItems;
            return c33458Hx0;
        }

        private C3278a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LHx0$b;", "", "LHx0;", "dialog", "", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: Hx0$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC3279b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"LHx0$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/base/BaseCoreActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LLZ;", "binding", "Landroid/content/DialogInterface;", "dialog", "LHx0$b;", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Hx0$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC3280a {
            /* renamed from: a */
            InterfaceC3279b mo30884a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseCoreActivity baseCoreActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C5029LZ c5029lz, @BindsInstance DialogInterface dialogInterface);
        }

        /* renamed from: a */
        void mo30890a(C33458Hx0 c33458Hx0);
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hx0$c */
    /* loaded from: classes3.dex */
    public static final class C3281c extends Lambda implements Function1<View, Unit> {
        public C3281c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            Dialog dialog = C33458Hx0.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public C33458Hx0() {
        List<Pair<String, Long>> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f14204c = emptyList;
        this.f14205d = new LinkedHashMap();
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f14207f = m31902e;
    }

    /* renamed from: a5 */
    public final C34862Nx0 m103203a5() {
        C34862Nx0 c34862Nx0 = this.f14203b;
        if (c34862Nx0 != null) {
            return c34862Nx0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public int getTheme() {
        return C32184Cl4.RoundedBottomSheet;
    }

    @Override // com.google.android.material.bottomsheet.C17714b, p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    @SuppressLint({"ResourceType"})
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC17707a(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setCancelable(false);
        return C5029LZ.m96636c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseCoreActivity baseCoreActivity;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C5029LZ m96638a = C5029LZ.m96638a(view);
        Intrinsics.checkNotNullExpressionValue(m96638a, "bind(view)");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseCoreActivity) {
            baseCoreActivity = (BaseCoreActivity) activity;
        } else {
            baseCoreActivity = null;
        }
        BaseCoreActivity baseCoreActivity2 = baseCoreActivity;
        if (baseCoreActivity2 == null) {
            return;
        }
        InterfaceC3279b.InterfaceC3280a m30891a = C43223jI0.m30891a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireContext().applicationContext");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(applicationContext);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m30891a.mo30884a(m21419a, baseCoreActivity2, m45195i, m96638a, dialog).mo30890a(this);
        Button button = m96638a.f21666d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancelButton");
        C34585Ms2.m94661j(button, new C3281c());
        InterfaceC36266Tx0 interfaceC36266Tx0 = this.f14206e;
        if (interfaceC36266Tx0 != null) {
            m103203a5().m93174l(this.f14205d, interfaceC36266Tx0, this.f14204c);
            return;
        }
        throw new IllegalStateException("Missing confirmPurchaseOnClickListener for ConfirmPurchaseBottomSheetDialog");
    }
}
