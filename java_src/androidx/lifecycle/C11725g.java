package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11725g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"Landroidx/lifecycle/g;", "", "", "b", "Landroidx/lifecycle/f;", C17296a.f69688o, "Landroidx/lifecycle/f;", "lifecycle", "Landroidx/lifecycle/f$b;", "Landroidx/lifecycle/f$b;", "minState", "LK41;", "c", "LK41;", "dispatchQueue", "Landroidx/lifecycle/i;", DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/i;", "observer", "Lzh2;", "parentJob", "<init>", "(Landroidx/lifecycle/f;Landroidx/lifecycle/f$b;LK41;Lzh2;)V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
/* renamed from: androidx.lifecycle.g */
/* loaded from: classes.dex */
public final class C11725g {

    /* renamed from: a */
    public final AbstractC11719f f54918a;

    /* renamed from: b */
    public final AbstractC11719f.EnumC11724b f54919b;

    /* renamed from: c */
    public final K41 f54920c;

    /* renamed from: d */
    public final InterfaceC11728i f54921d;

    public C11725g(AbstractC11719f lifecycle, AbstractC11719f.EnumC11724b minState, K41 dispatchQueue, final InterfaceC52943zh2 parentJob) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minState, "minState");
        Intrinsics.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        this.f54918a = lifecycle;
        this.f54919b = minState;
        this.f54920c = dispatchQueue;
        InterfaceC11728i interfaceC11728i = new InterfaceC11728i() { // from class: yq2
            @Override // androidx.lifecycle.InterfaceC11728i
            public final void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                C11725g.m67010c(C11725g.this, parentJob, lifecycleOwner, enumC11720a);
            }
        };
        this.f54921d = interfaceC11728i;
        if (lifecycle.mo67007b() == AbstractC11719f.EnumC11724b.DESTROYED) {
            InterfaceC52943zh2.C31478a.m550a(parentJob, null, 1, null);
            m67011b();
            return;
        }
        lifecycle.mo67008a(interfaceC11728i);
    }

    /* renamed from: c */
    public static final void m67010c(C11725g this$0, InterfaceC52943zh2 parentJob, LifecycleOwner source, AbstractC11719f.EnumC11720a enumC11720a) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parentJob, "$parentJob");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(enumC11720a, "<anonymous parameter 1>");
        if (source.getLifecycle().mo67007b() == AbstractC11719f.EnumC11724b.DESTROYED) {
            InterfaceC52943zh2.C31478a.m550a(parentJob, null, 1, null);
            this$0.m67011b();
        } else if (source.getLifecycle().mo67007b().compareTo(this$0.f54919b) < 0) {
            this$0.f54920c.m99264h();
        } else {
            this$0.f54920c.m99263i();
        }
    }

    /* renamed from: b */
    public final void m67011b() {
        this.f54918a.mo67006d(this.f54921d);
        this.f54920c.m99265g();
    }
}
