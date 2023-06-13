package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ZendeskUrl;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LyA6;", "", "", "url", "title", "", "zendeskRedirect", "", DateTokenConverter.CONVERTER_KEY, "c", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LCA6;", "b", "LCA6;", "ui", "LoI6;", "LoI6;", "zendeskManager", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LCA6;LoI6;)V", "webview_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebViewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewPresenter.kt\nco/bird/android/feature/webview/WebViewPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,41:1\n1#2:42\n199#3:43\n*S KotlinDebug\n*F\n+ 1 WebViewPresenter.kt\nco/bird/android/feature/webview/WebViewPresenter\n*L\n25#1:43\n*E\n"})
/* renamed from: yA6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52050yA6 {

    /* renamed from: a */
    public final ScopeProvider f118914a;

    /* renamed from: b */
    public final CA6 f118915b;

    /* renamed from: c */
    public final InterfaceC46194oI6 f118916c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ZendeskUrl;", "kotlin.jvm.PlatformType", "zendeskUrl", "", C17296a.f69688o, "(Lco/bird/android/model/ZendeskUrl;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA6$a */
    /* loaded from: classes3.dex */
    public static final class C30470a extends Lambda implements Function1<ZendeskUrl, Unit> {
        public C30470a() {
            super(1);
        }

        /* renamed from: a */
        public final void m3894a(ZendeskUrl zendeskUrl) {
            C52050yA6.this.f118915b.m112666Rl(zendeskUrl.getUrl());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ZendeskUrl zendeskUrl) {
            m3894a(zendeskUrl);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA6$b */
    /* loaded from: classes3.dex */
    public static final class C30471b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f118919h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30471b(String str) {
            super(1);
            this.f118919h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C52050yA6.this.f118915b.m112666Rl(this.f118919h);
        }
    }

    public C52050yA6(ScopeProvider scopeProvider, CA6 ui, InterfaceC46194oI6 zendeskManager) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(zendeskManager, "zendeskManager");
        this.f118914a = scopeProvider;
        this.f118915b = ui;
        this.f118916c = zendeskManager;
    }

    /* renamed from: e */
    public static final void m3896e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m3895f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void onCreate$default(C52050yA6 c52050yA6, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c52050yA6.m3897d(str, str2, z);
    }

    /* renamed from: c */
    public final boolean m3898c() {
        return this.f118915b.m112667Ql();
    }

    /* renamed from: d */
    public final void m3897d(String url, String str, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (str != null) {
            this.f118915b.m112668Pl(str);
        }
        if (z) {
            AbstractC23442F m33152N = C28237sD.progress$default(this.f118916c.mo19559a(url), this.f118915b, 0, 2, (Object) null).m33146T(1L).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "zendeskManager.login(url…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f118914a));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30470a c30470a = new C30470a();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: wA6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52050yA6.m3896e(Function1.this, obj);
                }
            };
            final C30471b c30471b = new C30471b(url);
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: xA6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52050yA6.m3895f(Function1.this, obj);
                }
            });
            return;
        }
        this.f118915b.m112666Rl(url);
    }
}
