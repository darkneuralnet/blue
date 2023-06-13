package p000;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.analytics.RentalDeliveryNotesShown;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LTA2;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Lio/reactivex/Observable;", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "LEa;", "b", "LEa;", "analyticsManager", "LQA2;", "c", "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/widget/EditText;", "e", "Landroid/widget/EditText;", "editText", "<init>", "(LEa;LQA2;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/EditText;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupNotesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupNotesPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupNotesPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,64:1\n180#2:65\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupNotesPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupNotesPresenter\n*L\n46#1:65\n*E\n"})
/* renamed from: TA2 */
/* loaded from: classes2.dex */
public final class TA2 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final InterfaceC1880Ea f34856b;

    /* renamed from: c */
    public final QA2 f34857c;

    /* renamed from: d */
    public final ScopeProvider f34858d;

    /* renamed from: e */
    public final EditText f34859e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TA2$a */
    /* loaded from: classes2.dex */
    public static final class C7675a extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C7675a f34860g = new C7675a();

        public C7675a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "LEi0;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)LEi0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TA2$b */
    /* loaded from: classes2.dex */
    public static final class C7676b extends Lambda implements Function1<String, EnumC32621Ei0> {

        /* renamed from: g */
        public static final C7676b f34861g = new C7676b();

        public C7676b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final EnumC32621Ei0 invoke(String it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return EnumC32621Ei0.SKIP;
            }
            return EnumC32621Ei0.NEXT;
        }
    }

    public TA2(InterfaceC1880Ea analyticsManager, QA2 model, ScopeProvider scopeProvider, EditText editText) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f34856b = analyticsManager;
        this.f34857c = model;
        this.f34858d = scopeProvider;
        this.f34859e = editText;
    }

    /* renamed from: c */
    public static final String m84262c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: d */
    public static final EnumC32621Ei0 m84261d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC32621Ei0) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        return InterfaceC44782lv1.C25814a.m26672k(this);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: g7 */
    public Observable<Boolean> mo14g7() {
        Observable<Boolean> just = Observable.just(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(just, "just(true)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        C0058AG<String> m88825n = this.f34857c.m88825n();
        final C7676b c7676b = C7676b.f34861g;
        Observable map = m88825n.map(new InterfaceC23492o() { // from class: SA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EnumC32621Ei0 m84261d;
                m84261d = TA2.m84261d(Function1.this, obj);
                return m84261d;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.notes.map {\n      …edType.NEXT\n      }\n    }");
        return map;
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26680c(this, bundle);
        this.f34856b.mo55956N(new RentalDeliveryNotesShown());
    }

    @Override // p000.UX0
    public void onDestroy() {
        InterfaceC44782lv1.C25814a.m26679d(this);
    }

    @Override // p000.UX0
    public void onLowMemory() {
        InterfaceC44782lv1.C25814a.m26678e(this);
    }

    @Override // p000.UX0
    public void onPause() {
        InterfaceC44782lv1.C25814a.m26677f(this);
    }

    @Override // p000.UX0
    public void onResume() {
        this.f34859e.setText(this.f34857c.m88825n().getValue());
        AbstractC49595u22<CharSequence> m42643d = C40475ef5.m42643d(this.f34859e);
        final C7675a c7675a = C7675a.f34860g;
        Observable<R> map = m42643d.map(new InterfaceC23492o() { // from class: RA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m84262c;
                m84262c = TA2.m84262c(Function1.this, obj);
                return m84262c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "editText\n      .textChan…   .map { it.toString() }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f34858d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f34857c.m88825n());
    }

    @Override // p000.UX0
    public void onSaveInstanceState(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26675h(this, bundle);
    }

    @Override // p000.UX0
    public void onStart() {
        InterfaceC44782lv1.C25814a.m26674i(this);
    }

    @Override // p000.UX0
    public void onStop() {
        InterfaceC44782lv1.C25814a.m26673j(this);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: rc */
    public Observable<EnumC33089Gi0> mo11rc() {
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.BACK);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.BACK)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
