package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import co.bird.android.feature.commandcenter.routing.C14717b;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireBird;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0012\u001a\u00020\u0005*\u0004\u0018\u00010\u000eH\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR.\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006-"}, m28432d2 = {"Lvn0;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "position", "", "getItemId", "itemId", "", "p", "Landroidx/fragment/app/Fragment;", "q", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/constant/ServiceCenterStatus;", "status", "", "P", "Q", "LTq4;", "k", "LTq4;", "reactiveConfig", "", "l", "[J", "pageIds", "m", "I", "itemCount", "n", "Lco/bird/android/model/wire/WireBird;", "value", "o", "Lco/bird/android/model/constant/ServiceCenterStatus;", "getStatus", "()Lco/bird/android/model/constant/ServiceCenterStatus;", "R", "(Lco/bird/android/model/constant/ServiceCenterStatus;)V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LTq4;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterFragmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterFragmentAdapter.kt\nco/bird/android/feature/commandcenter/commandcenter/adapters/CommandCenterFragmentAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
/* renamed from: vn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50629vn0 extends FragmentStateAdapter {

    /* renamed from: k */
    public final C36207Tq4 f114654k;

    /* renamed from: l */
    public final long[] f114655l;

    /* renamed from: m */
    public int f114656m;

    /* renamed from: n */
    public WireBird f114657n;

    /* renamed from: o */
    public ServiceCenterStatus f114658o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50629vn0(FragmentManager fragmentManager, AbstractC11719f lifecycle, C36207Tq4 reactiveConfig) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f114654k = reactiveConfig;
        long[] jArr = new long[2];
        for (int i = 0; i < 2; i++) {
            jArr[i] = 0;
        }
        this.f114655l = jArr;
    }

    /* renamed from: P */
    public final void m8040P(WireBird bird, ServiceCenterStatus serviceCenterStatus) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f114657n = bird;
        m8038R(serviceCenterStatus);
        this.f114656m = 2;
        this.f114655l[1] = bird.hashCode();
        notifyDataSetChanged();
    }

    /* renamed from: Q */
    public final long m8039Q(ServiceCenterStatus serviceCenterStatus) {
        boolean z;
        if (ServiceCenterRoute.Companion.getCHECK_IN_ROUTE_STATUSES().contains(serviceCenterStatus) && this.f114654k.m82623f8().getValue().getServiceCenterConfig().getEntryRouting().getEnabled()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.hashCode(z);
    }

    /* renamed from: R */
    public final void m8038R(ServiceCenterStatus serviceCenterStatus) {
        this.f114658o = serviceCenterStatus;
        if (this.f114655l[0] != m8039Q(serviceCenterStatus)) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f114656m;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                return -1L;
            }
            WireBird wireBird = this.f114657n;
            if (wireBird != null) {
                i2 = wireBird.hashCode();
            } else {
                i2 = 0;
            }
            return i2;
        }
        return m8039Q(this.f114658o);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* renamed from: p */
    public boolean mo8037p(long j) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(this.f114655l, j);
        if (!contains) {
            this.f114655l[0] = m8039Q(this.f114658o);
        }
        return contains;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* renamed from: q */
    public Fragment mo8036q(int i) {
        Fragment m7466a;
        C37091Xk6 m76473a;
        if (i != 0) {
            if (i != 1) {
                return new Fragment();
            }
            WireBird wireBird = this.f114657n;
            if (wireBird == null || (m76473a = C37091Xk6.f43789d.m76473a(wireBird)) == null) {
                return new Fragment();
            }
            return m76473a;
        }
        WireBird wireBird2 = this.f114657n;
        if (wireBird2 != null) {
            if (ServiceCenterRoute.Companion.getCHECK_IN_ROUTE_STATUSES().contains(this.f114658o) && this.f114654k.m82623f8().getValue().getServiceCenterConfig().getEntryRouting().getEnabled()) {
                m7466a = C14717b.f63677c.m58463a(wireBird2);
            } else {
                m7466a = C50804w46.f115247c.m7466a(wireBird2);
            }
            if (m7466a != null) {
                return m7466a;
            }
        }
        return new Fragment();
    }
}
