package p000;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.LocalAsset;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.IssueStatusReason;
import co.bird.android.model.constant.TaskPriority;
import co.bird.android.model.extension.IssueStatus_Kt;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C53094zw3;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002BQ\b\u0007\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010'\u001a\u00020%\u0012\b\b\u0001\u0010\r\u001a\u00020(\u0012\b\b\u0001\u0010,\u001a\u00020(\u0012\u0006\u00100\u001a\u00020-\u0012\b\b\u0001\u00104\u001a\u000201\u0012\b\b\u0001\u00106\u001a\u000201\u0012\u0006\u0010:\u001a\u000207¢\u0006\u0004\bA\u0010BJ\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u0016J\u001e\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0016\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J$\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00040\u00032\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0014\u0010\r\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006C"}, m28432d2 = {"LGz4;", "LxE;", "LFz4;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "T1", "Lco/bird/android/model/Issue;", "K0", "", "Tj", "C0", "supertype", "", "Lco/bird/android/model/RepairTypeLock;", "selectedRepairs", "p6", "LH6;", "sections", "b", "enabled", "ge", "", "numRepairs", "W6", "issue", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "je", "repairCount", "o0", "", "idToolDisplay", "g2", "li", "h7", "Lsu2;", "Lsu2;", "localAssetManager", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "repaired", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "asset", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "logRepairs", "g", "reroute", "Landroidx/recyclerview/widget/RecyclerView;", "h", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LSy4;", "i", "LSy4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lsu2;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/Button;Landroid/widget/Button;Landroidx/recyclerview/widget/RecyclerView;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSubtypesUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesUi.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,162:1\n1774#2,3:163\n1747#2,3:166\n1777#2:169\n1774#2,4:170\n41#3:174\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesUi.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesUiImpl\n*L\n83#1:163,3\n85#1:166,3\n83#1:169\n92#1:170,4\n103#1:174\n*E\n"})
/* renamed from: Gz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33246Gz4 extends AbstractC30071xE implements InterfaceC33012Fz4 {

    /* renamed from: b */
    public final InterfaceC48923su2 f12692b;

    /* renamed from: c */
    public final TextView f12693c;

    /* renamed from: d */
    public final TextView f12694d;

    /* renamed from: e */
    public final ImageView f12695e;

    /* renamed from: f */
    public final Button f12696f;

    /* renamed from: g */
    public final Button f12697g;

    /* renamed from: h */
    public final RecyclerView f12698h;

    /* renamed from: i */
    public final C36045Sy4 f12699i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33246Gz4(BaseActivity activity, InterfaceC48923su2 localAssetManager, TextView supertype, TextView repaired, ImageView asset, Button logRepairs, Button reroute, RecyclerView recyclerView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(repaired, "repaired");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(logRepairs, "logRepairs");
        Intrinsics.checkNotNullParameter(reroute, "reroute");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f12692b = localAssetManager;
        this.f12693c = supertype;
        this.f12694d = repaired;
        this.f12695e = asset;
        this.f12696f = logRepairs;
        this.f12697g = reroute;
        this.f12698h = recyclerView;
        C36045Sy4 c36045Sy4 = new C36045Sy4();
        this.f12699i = c36045Sy4;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c36045Sy4);
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: C0 */
    public Observable<Unit> mo104535C0() {
        return C44626lf5.clicksThrottle$default(this.f12697g, 0L, 1, null);
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: K0 */
    public Observable<Issue> mo104534K0() {
        return this.f12699i.m84524v();
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: T1 */
    public Observable<Pair<RepairType, Boolean>> mo104533T1() {
        return this.f12699i.m84523w();
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: Tj */
    public Observable<Unit> mo104532Tj() {
        return C44626lf5.clicksThrottle$default(this.f12696f, 0L, 1, null);
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: W6 */
    public void mo104531W6(int i) {
        this.f12696f.setText(getActivity().getString(C45871nl4.repair_log_repairs_format, Integer.valueOf(i)));
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: b */
    public void mo104530b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f12699i.mo24871u(sections);
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: g2 */
    public Observable<Unit> mo104529g2(String idToolDisplay) {
        Intrinsics.checkNotNullParameter(idToolDisplay, "idToolDisplay");
        C38535bQ1 m64550a = C38535bQ1.f57472d.m64550a(idToolDisplay);
        m64550a.show(getActivity().getSupportFragmentManager(), "IdToolPromptBottomSheetFragment");
        return m64550a.m64551a5();
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: ge */
    public void mo104528ge(boolean z) {
        this.f12696f.setEnabled(z);
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: h7 */
    public void mo104527h7(String idToolDisplay) {
        Intrinsics.checkNotNullParameter(idToolDisplay, "idToolDisplay");
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.repair_id_tools_success_toast, idToolDisplay);
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.repai…ess_toast, idToolDisplay)");
        C53094zw3.C31593a.makeText$default(c31593a, activity, string, 0, 48, null, 16, null).show();
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: je */
    public Observable<Pair<IssueStatus, IssueStatusReason>> mo104526je(Issue issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        C38664be0 m64228a = C38664be0.f57795d.m64228a(issue);
        m64228a.setCancelable(false);
        m64228a.show(getActivity().getSupportFragmentManager(), "CantRepairBottomSheetFragment");
        return m64228a.m64234P();
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: li */
    public void mo104525li() {
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.repair_id_tools_incorrect_part);
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.repair_id_tools_incorrect_part)");
        C53094zw3.C31593a.makeText$default(c31593a, activity, string, 0, 48, null, 16, null).show();
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: o0 */
    public void mo104524o0(int i) {
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.repair_logged_toast, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.repai…ogged_toast, repairCount)");
        C53094zw3.C31593a.makeText$default(c31593a, activity, string, 0, 48, null, 16, null).show();
    }

    @Override // p000.InterfaceC33012Fz4
    /* renamed from: p6 */
    public void mo104523p6(Issue supertype, List<RepairTypeLock> selectedRepairs) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        String string;
        String assetId;
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        List<Issue> subtypes = supertype.getSubtypes();
        if ((subtypes instanceof Collection) && subtypes.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Issue issue : subtypes) {
                if (issue.getStatus() != IssueStatus.ABANDONED) {
                    List<RepairTypeLock> list = selectedRepairs;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (RepairTypeLock repairTypeLock : list) {
                            if (Intrinsics.areEqual(repairTypeLock.component1().getIssueTypeId(), issue.getIssueTypeId())) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        z = true;
                        if (z && (i = i + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                z = false;
                if (z) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.f12693c.setText(supertype.getDisplay());
        TextView textView = this.f12694d;
        if (i > 0) {
            string = getActivity().getString(C45871nl4.repair_repaired_format, Integer.valueOf(i));
        } else {
            List<Issue> subtypes2 = supertype.getSubtypes();
            if ((subtypes2 instanceof Collection) && subtypes2.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (Issue issue2 : subtypes2) {
                    IssueStatus status = issue2.getStatus();
                    if (status != null && !IssueStatus_Kt.isPassedStatus(status)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            string = getActivity().getString(C45871nl4.repair_repairs_needed_format, Integer.valueOf(i2));
        }
        textView.setText(string);
        if (this.f12695e.getDrawable() == null && (assetId = supertype.getAssetId()) != null) {
            AbstractC23442F<LocalAsset> mo13534a = this.f12692b.mo13534a(assetId, AssetManagerType.REPAIR, TaskPriority.IMMEDIATE);
            ImageView imageView = this.f12695e;
            ScopeProvider m45202a = ViewScopeProvider.m45202a(imageView);
            Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
            C37279Yf5.m74583L(mo13534a, imageView, m45202a);
        }
    }
}
