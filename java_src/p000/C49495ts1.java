package p000;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.model.constant.FlightSheetContext;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00182\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m28432d2 = {"Lts1;", "Lhc5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "LDs1;", "e", "LDs1;", "a5", "()LDs1;", "setPresenter", "(LDs1;)V", "presenter", "<init>", "()V", "f", C17296a.f69688o, "b", "c", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetBottomSheetFragment.kt\nco/bird/android/flightsheet/dialogs/FlightSheetBottomSheetFragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n64#2:125\n1#3:126\n*S KotlinDebug\n*F\n+ 1 FlightSheetBottomSheetFragment.kt\nco/bird/android/flightsheet/dialogs/FlightSheetBottomSheetFragment\n*L\n64#1:125\n*E\n"})
/* renamed from: ts1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49495ts1 extends AbstractC42224hc5 {

    /* renamed from: f */
    public static final C28846a f111173f = new C28846a(null);

    /* renamed from: e */
    public C32478Ds1 f111174e;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m28432d2 = {"Lts1$a;", "", "", "birdId", "", "inRepairFlow", "Lts1;", C17296a.f69688o, "REPAIR_FLOW", "Ljava/lang/String;", "TAG", "<init>", "()V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ts1$a */
    /* loaded from: classes3.dex */
    public static final class C28846a {
        public /* synthetic */ C28846a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C49495ts1 newInstance$default(C28846a c28846a, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return c28846a.m11545a(str, z);
        }

        /* renamed from: a */
        public final C49495ts1 m11545a(String birdId, boolean z) {
            Intrinsics.checkNotNullParameter(birdId, "birdId");
            C49495ts1 c49495ts1 = new C49495ts1();
            Bundle bundle = new Bundle();
            bundle.putBoolean("repair_flow", z);
            bundle.putString("bird", birdId);
            c49495ts1.setArguments(bundle);
            return c49495ts1;
        }

        private C28846a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lts1$b;", "", "Lts1;", "activity", "", C17296a.f69688o, "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C28850c.class})
    /* renamed from: ts1$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC28847b {

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JT\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014"}, m28432d2 = {"Lts1$b$a;", "", "LlG2;", "mainComponent", "Lts1$c;", "flightSheetBottomSheetModule", "Lco/bird/android/core/base/BaseCoreActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LPZ;", "binding", "LYs1;", "v2Adapter", "", "repairFlow", "Lco/bird/android/model/constant/FlightSheetContext;", "flightSheetContext", "Lts1$b;", C17296a.f69688o, "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Factory
        /* renamed from: ts1$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC28848a {

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: ts1$b$a$a */
            /* loaded from: classes3.dex */
            public static final class C28849a {
                public static /* synthetic */ InterfaceC28847b create$default(InterfaceC28848a interfaceC28848a, InterfaceC44393lG2 interfaceC44393lG2, C28850c c28850c, BaseCoreActivity baseCoreActivity, ScopeProvider scopeProvider, C6408PZ c6408pz, C37392Ys1 c37392Ys1, boolean z, FlightSheetContext flightSheetContext, int i, Object obj) {
                    FlightSheetContext flightSheetContext2;
                    if (obj == null) {
                        if ((i & 128) != 0) {
                            flightSheetContext2 = FlightSheetContext.STANDARD;
                        } else {
                            flightSheetContext2 = flightSheetContext;
                        }
                        return interfaceC28848a.mo11543a(interfaceC44393lG2, c28850c, baseCoreActivity, scopeProvider, c6408pz, c37392Ys1, z, flightSheetContext2);
                    }
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
                }
            }

            /* renamed from: a */
            InterfaceC28847b mo11543a(InterfaceC44393lG2 interfaceC44393lG2, C28850c c28850c, @BindsInstance BaseCoreActivity baseCoreActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C6408PZ c6408pz, @BindsInstance C37392Ys1 c37392Ys1, @BindsInstance boolean z, @BindsInstance FlightSheetContext flightSheetContext);
        }

        /* renamed from: a */
        void mo11544a(C49495ts1 c49495ts1);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lts1$c;", "", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "<init>", "(LTq4;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {InterfaceC28851a.class})
    /* renamed from: ts1$c */
    /* loaded from: classes3.dex */
    public static final class C28850c {

        /* renamed from: a */
        public final C36207Tq4 f111175a;

        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH'J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0010H'¨\u0006\u0013"}, m28432d2 = {"Lts1$c$a;", "", "LFs1;", "ui", "LWs1;", "c", "Llp0;", "e", "LAo0;", "impl", "Luo0;", C17296a.f69688o, "LQt1;", "v2", "LAs1;", "b", "LYs1;", "LoA;", DateTokenConverter.CONVERTER_KEY, "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        /* renamed from: ts1$c$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC28851a {
            @Binds
            /* renamed from: a */
            InterfaceC50047uo0 m11542a(C31739Ao0 c31739Ao0);

            @Binds
            /* renamed from: b */
            InterfaceC31776As1 m11541b(C35529Qt1 c35529Qt1);

            @Binds
            /* renamed from: c */
            InterfaceC36924Ws1 m11540c(C32946Fs1 c32946Fs1);

            @Binds
            /* renamed from: d */
            AbstractC26846oA m11539d(C37392Ys1 c37392Ys1);

            @Binds
            /* renamed from: e */
            InterfaceC44721lp0 m11538e(C32946Fs1 c32946Fs1);
        }

        public C28850c(C36207Tq4 reactiveConfig) {
            Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
            this.f111175a = reactiveConfig;
        }
    }

    /* renamed from: a5 */
    public final C32478Ds1 m11546a5() {
        C32478Ds1 c32478Ds1 = this.f111174e;
        if (c32478Ds1 != null) {
            return c32478Ds1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C6408PZ.m90114c(inflater).getRoot();
    }

    @Override // p000.AbstractC45245mi1, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m11546a5().onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseCoreActivity baseCoreActivity;
        boolean z;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseCoreActivity) {
            baseCoreActivity = (BaseCoreActivity) activity;
        } else {
            baseCoreActivity = null;
        }
        if (baseCoreActivity == null) {
            return;
        }
        C6408PZ m90116a = C6408PZ.m90116a(view);
        Intrinsics.checkNotNullExpressionValue(m90116a, "bind(view)");
        InterfaceC28847b.InterfaceC28848a m105517a = GJ0.m105517a();
        Intrinsics.checkNotNullExpressionValue(m105517a, "factory()");
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseCoreActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        C28850c c28850c = new C28850c(baseCoreActivity.mo58955y());
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        C37392Ys1 c37392Ys1 = new C37392Ys1(null, null, 3, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("repair_flow", false);
        } else {
            z = false;
        }
        InterfaceC28847b.InterfaceC28848a.C28849a.create$default(m105517a, m21419a, c28850c, baseCoreActivity, m45195i, m90116a, c37392Ys1, z, null, 128, null).mo11544a(this);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("bird")) != null) {
            m11546a5().m109837b(string);
        }
    }
}
