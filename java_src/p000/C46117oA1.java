package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.frequentFlyer.view.FrequentFlyerProgressBannerView;
import co.bird.android.model.wire.WireFrequentFlyerProgress;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import p000.C32541Dz1;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR+\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010+\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020%8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00060"}, m28432d2 = {"LoA1;", "LxE;", "LnA1;", "Lco/bird/android/model/wire/WireFrequentFlyerProgress;", "progress", "", "oi", "", "LDz1$a;", "benefits", "k2", "Lio/reactivex/Observable;", "", "fc", "Cf", "m2", "Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerProgressBannerView;", "b", "Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerProgressBannerView;", "progressView", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "scrollableContent", "LDz1;", DateTokenConverter.CONVERTER_KEY, "LDz1;", "adapter", "LDz1$c;", "<set-?>", "e", "Lkotlin/reflect/KMutableProperty0;", "getHeader", "()LDz1$c;", "d9", "(LDz1$c;)V", "header", "LDz1$b;", "f", "getFooter", "()LDz1$b;", "ij", "(LDz1$b;)V", "footer", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oA1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46117oA1 extends AbstractC30071xE implements InterfaceC45524nA1 {

    /* renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f101534g = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(C46117oA1.class, "header", "getHeader()Lco/bird/android/feature/frequentFlyer/adapter/FrequentFlyerAdapter$Header;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(C46117oA1.class, "footer", "getFooter()Lco/bird/android/feature/frequentFlyer/adapter/FrequentFlyerAdapter$Footer;", 0))};

    /* renamed from: b */
    public final FrequentFlyerProgressBannerView f101535b;

    /* renamed from: c */
    public final RecyclerView f101536c;

    /* renamed from: d */
    public final C32541Dz1 f101537d;

    /* renamed from: e */
    public final KMutableProperty0 f101538e;

    /* renamed from: f */
    public final KMutableProperty0 f101539f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46117oA1(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f101535b = (FrequentFlyerProgressBannerView) C40788fB0.m41779c(activity, C47610qh4.progress);
        RecyclerView recyclerView = (RecyclerView) C40788fB0.m41779c(activity, C47610qh4.scrollableContent);
        this.f101536c = recyclerView;
        C32541Dz1 c32541Dz1 = new C32541Dz1();
        this.f101537d = c32541Dz1;
        this.f101538e = new MutablePropertyReference0Impl(c32541Dz1) { // from class: oA1.b
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((C32541Dz1) this.receiver).m109555q();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((C32541Dz1) this.receiver).m109558C((C32541Dz1.C1681c) obj);
            }
        };
        this.f101539f = new MutablePropertyReference0Impl(c32541Dz1) { // from class: oA1.a
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((C32541Dz1) this.receiver).m109556p();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((C32541Dz1) this.receiver).m109559B((C32541Dz1.C1680b) obj);
            }
        };
        recyclerView.setAdapter(c32541Dz1);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(null);
    }

    @Override // p000.InterfaceC45524nA1
    /* renamed from: Cf */
    public Observable<Unit> mo21701Cf() {
        return this.f101537d.m109557o();
    }

    @Override // p000.InterfaceC45524nA1
    /* renamed from: d9 */
    public void mo21700d9(C32541Dz1.C1681c c1681c) {
        Intrinsics.checkNotNullParameter(c1681c, "<set-?>");
        C94.m112730a(this.f101538e, this, f101534g[0], c1681c);
    }

    @Override // p000.InterfaceC45524nA1
    /* renamed from: fc */
    public Observable<Integer> mo21699fc() {
        return this.f101537d.m109554r();
    }

    @Override // p000.InterfaceC45524nA1
    /* renamed from: ij */
    public void mo21698ij(C32541Dz1.C1680b c1680b) {
        Intrinsics.checkNotNullParameter(c1680b, "<set-?>");
        C94.m112730a(this.f101539f, this, f101534g[1], c1680b);
    }

    @Override // p000.InterfaceC45524nA1
    /* renamed from: k2 */
    public void mo21697k2(List<C32541Dz1.C1679a> benefits) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.f101537d.m109560A(benefits);
    }

    @Override // p000.InterfaceC45524nA1
    /* renamed from: m2 */
    public Observable<Unit> mo21696m2() {
        return this.f101537d.m109553t();
    }

    @Override // p000.InterfaceC45524nA1
    /* renamed from: oi */
    public void mo21695oi(WireFrequentFlyerProgress progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f101535b.m58103a(progress);
    }
}
