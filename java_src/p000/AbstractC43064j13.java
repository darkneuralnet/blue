package p000;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\"\u0010$\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R#\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180%8\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b\u0019\u0010'R#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0%8\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b\u001d\u0010'¨\u0006,"}, m28432d2 = {"Lj13;", "", "LAY2;", "backStackEntry", "", "i", "j", "LHY2;", "destination", "Landroid/os/Bundle;", "arguments", C17296a.f69688o, "popUpTo", "", "saveState", "g", "h", "f", "entry", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "LGX2;", "", "b", "LGX2;", "_backStack", "", "c", "_transitionsInProgress", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "k", "(Z)V", "isNavigating", "LtP5;", "LtP5;", "()LtP5;", "backStack", "transitionsInProgress", "<init>", "()V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: j13  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43064j13 {

    /* renamed from: a */
    public final ReentrantLock f92015a = new ReentrantLock(true);

    /* renamed from: b */
    public final GX2<List<AY2>> f92016b;

    /* renamed from: c */
    public final GX2<Set<AY2>> f92017c;

    /* renamed from: d */
    public boolean f92018d;

    /* renamed from: e */
    public final InterfaceC49220tP5<List<AY2>> f92019e;

    /* renamed from: f */
    public final InterfaceC49220tP5<Set<AY2>> f92020f;

    public AbstractC43064j13() {
        List emptyList;
        Set emptySet;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        GX2<List<AY2>> m8742a = C50405vP5.m8742a(emptyList);
        this.f92016b = m8742a;
        emptySet = SetsKt__SetsKt.emptySet();
        GX2<Set<AY2>> m8742a2 = C50405vP5.m8742a(emptySet);
        this.f92017c = m8742a2;
        this.f92019e = C36708Vu1.m79269b(m8742a);
        this.f92020f = C36708Vu1.m79269b(m8742a2);
    }

    /* renamed from: a */
    public abstract AY2 mo31251a(HY2 hy2, Bundle bundle);

    /* renamed from: b */
    public final InterfaceC49220tP5<List<AY2>> m31250b() {
        return this.f92019e;
    }

    /* renamed from: c */
    public final InterfaceC49220tP5<Set<AY2>> m31249c() {
        return this.f92020f;
    }

    /* renamed from: d */
    public final boolean m31248d() {
        return this.f92018d;
    }

    /* renamed from: e */
    public void mo31247e(AY2 entry) {
        Set<AY2> minus;
        Intrinsics.checkNotNullParameter(entry, "entry");
        GX2<Set<AY2>> gx2 = this.f92017c;
        minus = SetsKt___SetsKt.minus(gx2.getValue(), entry);
        gx2.setValue(minus);
    }

    /* renamed from: f */
    public void m31246f(AY2 backStackEntry) {
        Object last;
        List minus;
        List<AY2> plus;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        GX2<List<AY2>> gx2 = this.f92016b;
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f92016b.getValue());
        minus = CollectionsKt___CollectionsKt.minus(gx2.getValue(), last);
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends AY2>) ((Collection<? extends Object>) minus), backStackEntry);
        gx2.setValue(plus);
    }

    /* renamed from: g */
    public void mo31245g(AY2 popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f92015a;
        reentrantLock.lock();
        try {
            GX2<List<AY2>> gx2 = this.f92016b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : gx2.getValue()) {
                if (!(!Intrinsics.areEqual((AY2) obj, popUpTo))) {
                    break;
                }
                arrayList.add(obj);
            }
            gx2.setValue(arrayList);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public void mo31244h(AY2 popUpTo, boolean z) {
        Set<AY2> plus;
        AY2 ay2;
        Set<AY2> plus2;
        boolean z2;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        GX2<Set<AY2>> gx2 = this.f92017c;
        plus = SetsKt___SetsKt.plus(gx2.getValue(), popUpTo);
        gx2.setValue(plus);
        List<AY2> value = this.f92019e.getValue();
        ListIterator<AY2> listIterator = value.listIterator(value.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                ay2 = listIterator.previous();
                AY2 ay22 = ay2;
                if (!Intrinsics.areEqual(ay22, popUpTo) && this.f92019e.getValue().lastIndexOf(ay22) < this.f92019e.getValue().lastIndexOf(popUpTo)) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            } else {
                ay2 = null;
                break;
            }
        }
        AY2 ay23 = ay2;
        if (ay23 != null) {
            GX2<Set<AY2>> gx22 = this.f92017c;
            plus2 = SetsKt___SetsKt.plus(gx22.getValue(), ay23);
            gx22.setValue(plus2);
        }
        mo31245g(popUpTo, z);
    }

    /* renamed from: i */
    public void mo31243i(AY2 backStackEntry) {
        List<AY2> plus;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f92015a;
        reentrantLock.lock();
        try {
            GX2<List<AY2>> gx2 = this.f92016b;
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends AY2>) ((Collection<? extends Object>) gx2.getValue()), backStackEntry);
            gx2.setValue(plus);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j */
    public void m31242j(AY2 backStackEntry) {
        Object lastOrNull;
        Set<AY2> plus;
        Set<AY2> plus2;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f92019e.getValue());
        AY2 ay2 = (AY2) lastOrNull;
        if (ay2 != null) {
            GX2<Set<AY2>> gx2 = this.f92017c;
            plus2 = SetsKt___SetsKt.plus(gx2.getValue(), ay2);
            gx2.setValue(plus2);
        }
        GX2<Set<AY2>> gx22 = this.f92017c;
        plus = SetsKt___SetsKt.plus(gx22.getValue(), backStackEntry);
        gx22.setValue(plus);
        mo31243i(backStackEntry);
    }

    /* renamed from: k */
    public final void m31241k(boolean z) {
        this.f92018d = z;
    }
}
