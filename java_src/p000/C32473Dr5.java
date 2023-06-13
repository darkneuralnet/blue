package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Warehouse;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LDr5;", "LxE;", "LCr5;", "", "Lco/bird/android/model/Warehouse;", "warehouses", "", "Xe", "Lio/reactivex/Observable;", "V1", "LZ5;", "b", "LZ5;", "binding", "LFt5;", "c", "LFt5;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LZ5;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectServiceCenterUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectServiceCenterUi.kt\nco/bird/android/feature/servicecenter/SelectServiceCenterUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1549#2:46\n1620#2,3:47\n*S KotlinDebug\n*F\n+ 1 SelectServiceCenterUi.kt\nco/bird/android/feature/servicecenter/SelectServiceCenterUiImpl\n*L\n36#1:46\n36#1:47,3\n*E\n"})
/* renamed from: Dr5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32473Dr5 extends AbstractC30071xE implements InterfaceC32239Cr5 {

    /* renamed from: b */
    public final C10113Z5 f6433b;

    /* renamed from: c */
    public final C32959Ft5 f6434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32473Dr5(BaseActivity activity, C10113Z5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f6433b = binding;
        C32959Ft5 c32959Ft5 = new C32959Ft5();
        this.f6434c = c32959Ft5;
        binding.f47831b.setLayoutManager(new LinearLayoutManager(activity));
        binding.f47831b.setItemAnimator(new C11894g());
        binding.f47831b.setAdapter(c32959Ft5);
    }

    @Override // p000.InterfaceC32239Cr5
    /* renamed from: V1 */
    public Observable<Warehouse> mo109849V1() {
        return this.f6434c.m106292o();
    }

    @Override // p000.InterfaceC32239Cr5
    /* renamed from: Xe */
    public void mo109848Xe(List<Warehouse> warehouses) {
        int collectionSizeOrDefault;
        List<C3023H6> mutableListOf;
        Intrinsics.checkNotNullParameter(warehouses, "warehouses");
        ArrayList arrayList = new ArrayList();
        List<Warehouse> list = warehouses;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Warehouse warehouse : list) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new C2637G6(warehouse, C34740Nj4.view_service_center, false, 4, null))));
        }
        C32959Ft5 c32959Ft5 = this.f6434c;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C3023H6(arrayList, null, null, 6, null));
        c32959Ft5.m106291p(mutableListOf);
    }
}
