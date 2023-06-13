package p000;

import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000e"}, m28432d2 = {"Ltp1;", "Lsp1;", "", "b", C17296a.f69688o, "LEa;", "LEa;", "analyticsManager", "Ljava/util/Stack;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "Ljava/util/Stack;", "stack", "<init>", "(LEa;)V", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tp1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49465tp1 implements InterfaceC48872sp1 {

    /* renamed from: a */
    public final InterfaceC1880Ea f111065a;

    /* renamed from: b */
    public final Stack<AnalyticsEvent> f111066b;

    public C49465tp1(InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f111065a = analyticsManager;
        this.f111066b = new Stack<>();
    }

    @Override // p000.InterfaceC48872sp1
    /* renamed from: a */
    public void mo11729a() {
        if ((!this.f111066b.isEmpty()) && (this.f111066b.peek() instanceof C42915im3)) {
            this.f111066b.pop();
            this.f111065a.mo55905y(new C42322hm3(null, null, null, 7, null));
        }
    }

    @Override // p000.InterfaceC48872sp1
    /* renamed from: b */
    public void mo11728b() {
        this.f111066b.push(new C42915im3(null, null, null, 7, null));
        this.f111065a.mo55905y(new C42915im3(null, null, null, 7, null));
    }
}
