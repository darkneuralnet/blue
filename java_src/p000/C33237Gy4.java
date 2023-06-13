package p000;

import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"LGy4;", "", "LEa;", "analyticsManager", "LaG6;", "workOrderManager", "LCy4;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: Gy4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33237Gy4 {
    @Provides
    /* renamed from: a */
    public final InterfaceC32301Cy4 m104542a(InterfaceC1880Ea analyticsManager, InterfaceC37857aG6 workOrderManager) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        return new C33003Fy4(analyticsManager, workOrderManager);
    }
}
