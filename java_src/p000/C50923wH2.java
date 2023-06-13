package p000;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.material.bottomsheet.C17714b;
import com.google.android.material.bottomsheet.DialogC17707a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001b\u0011\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"LwH2;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "Landroid/app/Dialog;", "onCreateDialog", "LIH2;", "b", "LIH2;", "a5", "()LIH2;", "setPresenter", "(LIH2;)V", "presenter", "<init>", "()V", "c", C17296a.f69688o, "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50923wH2 extends C17714b {

    /* renamed from: c */
    public static final C29851a f115755c = new C29851a(null);

    /* renamed from: b */
    public IH2 f115756b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LwH2$a;", "", "LwH2;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: wH2$a */
    /* loaded from: classes3.dex */
    public static final class C29851a {
        public /* synthetic */ C29851a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C50923wH2 m7049a() {
            return new C50923wH2();
        }

        private C29851a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LwH2$b;", "", "LwH2;", "dialog", "", C17296a.f69688o, "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C29854c.class})
    /* renamed from: wH2$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC29852b {

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, m28432d2 = {"LwH2$b$a;", "", "LwH2$c;", "manageRidesModule", "b", "LlG2;", "mainComponent", C17296a.f69688o, "LwH2$b;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Builder
        /* renamed from: wH2$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC29853a {
            /* renamed from: a */
            InterfaceC29853a mo7047a(InterfaceC44393lG2 interfaceC44393lG2);

            /* renamed from: b */
            InterfaceC29853a mo7046b(C29854c c29854c);

            InterfaceC29852b build();
        }

        /* renamed from: a */
        void mo7048a(C50923wH2 c50923wH2);
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\bH\u0007R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LwH2$c;", "", "Lco/bird/android/core/mvp/BaseActivity;", C17296a.f69688o, "LwH2;", "c", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "LrH2;", "b", "LwH2;", "getDialog", "()LwH2;", "dialog", "<init>", "(LwH2;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    @SourceDebugExtension({"SMAP\nManageRidesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageRidesDialog.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialog$ManageRidesModule\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,96:1\n64#2:97\n*S KotlinDebug\n*F\n+ 1 ManageRidesDialog.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialog$ManageRidesModule\n*L\n73#1:97\n*E\n"})
    /* renamed from: wH2$c */
    /* loaded from: classes3.dex */
    public static final class C29854c {

        /* renamed from: a */
        public final C50923wH2 f115757a;

        public C29854c(C50923wH2 dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.f115757a = dialog;
        }

        @Provides
        /* renamed from: a */
        public final BaseActivity m7045a() {
            FragmentActivity activity = this.f115757a.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity");
            return (BaseActivity) activity;
        }

        @Provides
        /* renamed from: b */
        public final C47960rH2 m7044b() {
            Context context = this.f115757a.getContext();
            Intrinsics.checkNotNull(context);
            return new C47960rH2(context);
        }

        @Provides
        /* renamed from: c */
        public final C50923wH2 m7043c() {
            return this.f115757a;
        }

        @Provides
        /* renamed from: d */
        public final ScopeProvider m7042d() {
            AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this.f115757a, C43626jy1.f93627b);
            Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
            return m45195i;
        }
    }

    /* renamed from: a5 */
    public final IH2 m7050a5() {
        IH2 ih2 = this.f115756b;
        if (ih2 != null) {
            return ih2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // com.google.android.material.bottomsheet.C17714b, p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    @SuppressLint({"ResourceType"})
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC17707a(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C33570Ij4.bottom_sheet_manage_rides_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m7050a5().m102600v();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC29852b.InterfaceC29853a m44367a = C39702dM0.m44367a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context!!.applicationContext");
        m44367a.mo7047a(c46172oG2.m21419a(applicationContext)).mo7046b(new C29854c(this)).build().mo7048a(this);
    }
}
