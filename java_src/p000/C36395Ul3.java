package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0010\u0010\u0018R\"\u0010\u001f\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0014\u0010\u001e¨\u0006\""}, m28432d2 = {"LUl3;", "LTl3;", "", "e", "", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "b", C17296a.f69688o, "LEa;", "LEa;", "analyticsManager", "Lbn;", "Lbn;", "areaManager", "LTq4;", "c", "LTq4;", "reactiveConfig", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "viewPortWkt", "", "I", "f", "()I", "(I)V", "vehicleCount", "<init>", "(LEa;Lbn;LTq4;)V", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ul3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36395Ul3 implements InterfaceC36161Tl3 {

    /* renamed from: a */
    public final InterfaceC1880Ea f37950a;

    /* renamed from: b */
    public final InterfaceC12495bn f37951b;

    /* renamed from: c */
    public final C36207Tq4 f37952c;

    /* renamed from: d */
    public String f37953d;

    /* renamed from: e */
    public int f37954e;

    public C36395Ul3(InterfaceC1880Ea analyticsManager, InterfaceC12495bn areaManager, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f37950a = analyticsManager;
        this.f37951b = areaManager;
        this.f37952c = reactiveConfig;
        this.f37953d = "";
    }

    @Override // p000.InterfaceC36161Tl3
    /* renamed from: a */
    public void mo80892a(List<? extends OperatorFilter> filters) {
        List filterIsInstance;
        List plus;
        Intrinsics.checkNotNullParameter(filters, "filters");
        filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(filters, OperatorOptionFilter.class);
        C33362Hm3 m2325a = C52473yt5.m2325a(filterIsInstance);
        InterfaceC1880Ea interfaceC1880Ea = this.f37950a;
        String m80886g = m80886g();
        List<C32894Fm3> m103437d = m2325a.m103437d();
        List<C32894Fm3> m103439b = m2325a.m103439b();
        plus = CollectionsKt___CollectionsKt.plus((Collection) m2325a.m103436e(), (Iterable) m2325a.m103438c());
        interfaceC1880Ea.mo55905y(new C34064Km3(null, null, null, m80886g, m103437d, m103439b, plus, Boolean.TRUE, 7, null));
    }

    @Override // p000.InterfaceC36161Tl3
    /* renamed from: b */
    public void mo80891b(List<? extends OperatorFilter> filters) {
        List filterIsInstance;
        Intrinsics.checkNotNullParameter(filters, "filters");
        filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(filters, OperatorOptionFilter.class);
        C33362Hm3 m2325a = C52473yt5.m2325a(filterIsInstance);
        this.f37950a.mo55905y(new C33830Jm3(null, null, null, m80886g(), m2325a.m103437d(), m2325a.m103436e(), Boolean.TRUE, 7, null));
    }

    @Override // p000.InterfaceC36161Tl3
    /* renamed from: c */
    public void mo80890c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f37953d = str;
    }

    @Override // p000.InterfaceC36161Tl3
    /* renamed from: d */
    public void mo80889d(int i) {
        this.f37954e = i;
    }

    @Override // p000.InterfaceC36161Tl3
    /* renamed from: e */
    public void mo80888e() {
        this.f37950a.mo55905y(new C33596Im3(null, null, null, m80886g(), m80887f(), this.f37951b.mo63995r().m73665a().size(), Boolean.TRUE, 7, null));
    }

    /* renamed from: f */
    public int m80887f() {
        return this.f37954e;
    }

    /* renamed from: g */
    public String m80886g() {
        return this.f37953d;
    }
}
