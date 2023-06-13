package p000;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"Lv84;", "Lw1;", "", "onAttachedToWindow", "Lco/bird/android/core/mvp/BaseActivity;", "b", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LTq4;", "c", "LTq4;", "reactiveConfig", "LV74;", DateTokenConverter.CONVERTER_KEY, "LV74;", "promoManager", "LEa;", "e", "LEa;", "analyticsManager", "LMe2;", "f", "LMe2;", "binding", "Lu84;", "g", "Lu84;", "ui", "Lyz1;", "h", "Lyz1;", "presenter", "Landroid/view/View;", "view", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LTq4;LV74;LEa;Landroid/view/View;)V", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPromotionsCenterFreeRideViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionsCenterFreeRideViewHolder.kt\nco/bird/android/feature/promotions/PromotionsCenterFreeRideViewHolder\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,59:1\n41#2:60\n*S KotlinDebug\n*F\n+ 1 PromotionsCenterFreeRideViewHolder.kt\nco/bird/android/feature/promotions/PromotionsCenterFreeRideViewHolder\n*L\n36#1:60\n*E\n"})
/* renamed from: v84  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50249v84 extends C29735w1 {

    /* renamed from: b */
    public final BaseActivity f113587b;

    /* renamed from: c */
    public final C36207Tq4 f113588c;

    /* renamed from: d */
    public final V74 f113589d;

    /* renamed from: e */
    public final InterfaceC1880Ea f113590e;

    /* renamed from: f */
    public final C34459Me2 f113591f;

    /* renamed from: g */
    public final C49657u84 f113592g;

    /* renamed from: h */
    public final C52529yz1 f113593h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50249v84(BaseActivity activity, C36207Tq4 reactiveConfig, V74 promoManager, InterfaceC1880Ea analyticsManager, View view) {
        super(view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f113587b = activity;
        this.f113588c = reactiveConfig;
        this.f113589d = promoManager;
        this.f113590e = analyticsManager;
        C34459Me2 m95092a = C34459Me2.m95092a(view);
        Intrinsics.checkNotNullExpressionValue(m95092a, "bind(view)");
        this.f113591f = m95092a;
        C49657u84 c49657u84 = new C49657u84(activity, m95092a);
        this.f113592g = c49657u84;
        ScopeProvider m45202a = ViewScopeProvider.m45202a(view);
        Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
        this.f113593h = new C52529yz1(m45202a, c49657u84, activity, reactiveConfig, promoManager, analyticsManager);
    }

    @Override // p000.C29735w1
    public void onAttachedToWindow() {
        this.f113593h.mo2173a();
    }
}
