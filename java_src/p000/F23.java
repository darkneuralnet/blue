package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import androidx.fragment.app.FragmentActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LF23;", "Landroidx/fragment/app/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lz31;", "b", "Lz31;", "binding", "<init>", "()V", "c", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestClaimSuccessDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestClaimSuccessDialogFragment.kt\nco/bird/android/app/feature/operator/dialogs/nest/claim/NestClaimSuccessDialogFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,80:1\n64#2:81\n180#3:82\n*S KotlinDebug\n*F\n+ 1 NestClaimSuccessDialogFragment.kt\nco/bird/android/app/feature/operator/dialogs/nest/claim/NestClaimSuccessDialogFragment\n*L\n74#1:81\n74#1:82\n*E\n"})
/* renamed from: F23 */
/* loaded from: classes2.dex */
public final class F23 extends DialogInterface$OnCancelListenerC11663c {

    /* renamed from: c */
    public static final C2058a f8483c = new C2058a(null);

    /* renamed from: d */
    public static final int f8484d = 8;

    /* renamed from: b */
    public C52568z31 f8485b;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"LF23$a;", "", "", "spaces", "totalDurationMinutes", "Lorg/joda/time/DateTime;", "expiresAt", "LF23;", C17296a.f69688o, "", "EXPIRES_AT", "Ljava/lang/String;", "SPACES", "TAG", "TOTAL_DURATION_MINUTES", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: F23$a */
    /* loaded from: classes2.dex */
    public static final class C2058a {
        public /* synthetic */ C2058a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final F23 m108086a(int i, int i2, DateTime expiresAt) {
            Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
            F23 f23 = new F23();
            Bundle bundle = new Bundle();
            bundle.putInt("spaces", i);
            bundle.putInt("total_duration_minutes", i2);
            bundle.putLong("expires_at", expiresAt.getMillis());
            f23.setArguments(bundle);
            return f23;
        }

        private C2058a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F23$b */
    /* loaded from: classes2.dex */
    public static final class C2059b extends Lambda implements Function1<View, Unit> {
        public C2059b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            Dialog dialog = F23.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F23$c */
    /* loaded from: classes2.dex */
    public static final class C2060c extends Lambda implements Function1<Long, Unit> {

        /* renamed from: h */
        public final /* synthetic */ DateTime f8488h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2060c(DateTime dateTime) {
            super(1);
            this.f8488h = dateTime;
        }

        /* renamed from: a */
        public final void m108085a(Long l) {
            C52568z31 c52568z31 = F23.this.f8485b;
            if (c52568z31 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c52568z31 = null;
            }
            c52568z31.f120688e.setText(C46880pT0.m19260b(this.f8488h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m108085a(l);
            return Unit.INSTANCE;
        }
    }

    public static final void onViewCreated$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C52568z31 binding = C52568z31.m1899c(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(binding, "binding");
        this.f8485b = binding;
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "inflate(inflater, contai…     binding.root\n      }");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Integer num2;
        long currentTimeMillis;
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C52568z31 c52568z31 = this.f8485b;
        C52568z31 c52568z312 = null;
        if (c52568z31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c52568z31 = null;
        }
        Button button = c52568z31.f120687d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        C34585Ms2.m94661j(button, new C2059b());
        Bundle arguments = getArguments();
        if (arguments != null) {
            num = Integer.valueOf(arguments.getInt("spaces", 0));
        } else {
            num = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            num2 = Integer.valueOf(arguments2.getInt("total_duration_minutes", 0));
        } else {
            num2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            currentTimeMillis = arguments3.getLong("expires_at");
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        DateTime dateTime = new DateTime(currentTimeMillis);
        C52568z31 c52568z313 = this.f8485b;
        if (c52568z313 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c52568z313 = null;
        }
        TextView textView = c52568z313.f120685b;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            str = activity.getString(C45871nl4.nest_claim_success_body, num, num2);
        } else {
            str = null;
        }
        textView.setText(str);
        C52568z31 c52568z314 = this.f8485b;
        if (c52568z314 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c52568z312 = c52568z314;
        }
        c52568z312.f120688e.setText(C46880pT0.m19260b(dateTime));
        Observable<Long> observeOn = Observable.interval(1L, TimeUnit.SECONDS).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "interval(1L, TimeUnit.SE…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m45195i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2060c c2060c = new C2060c(dateTime);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: E23
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F23.onViewCreated$lambda$1(Function1.this, obj);
            }
        });
    }
}
