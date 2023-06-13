package p000;

import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.IssueStatus;
import co.bird.android.widget.standardcomponents.CheckableItemView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00040\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, m28432d2 = {"Lwa2;", "LxE;", "Lva2;", "Lio/reactivex/Observable;", "Lco/bird/android/model/IssueStatus;", "P", "", "m0", "status", "mh", "", "enabled", "ri", "visible", "Vf", "A7", "La4;", "b", "La4;", "binding", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "statusSubject", "", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", DateTokenConverter.CONVERTER_KEY, "[Lco/bird/android/widget/standardcomponents/CheckableItemView;", "checkableItems", "wa2$b", "e", "Lwa2$b;", "checkListener", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;La4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIssueStatusUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueStatusUi.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusUiImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,83:1\n13579#2,2:84\n*S KotlinDebug\n*F\n+ 1 IssueStatusUi.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusUiImpl\n*L\n52#1:84,2\n*E\n"})
/* renamed from: wa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51094wa2 extends AbstractC30071xE implements InterfaceC50501va2 {

    /* renamed from: b */
    public final C10556a4 f116224b;

    /* renamed from: c */
    public final C24552a<IssueStatus> f116225c;

    /* renamed from: d */
    public final CheckableItemView[] f116226d;

    /* renamed from: e */
    public final C29919b f116227e;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wa2$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29918a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IssueStatus.values().length];
            try {
                iArr[IssueStatus.RESOLVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssueStatus.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IssueStatus.DISPUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"wa2$b", "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "view", "", "isChecked", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIssueStatusUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueStatusUi.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusUiImpl$checkListener$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n4117#2:84\n4217#2,2:85\n1855#3,2:87\n*S KotlinDebug\n*F\n+ 1 IssueStatusUi.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusUiImpl$checkListener$1\n*L\n36#1:84\n36#1:85,2\n37#1:87,2\n*E\n"})
    /* renamed from: wa2$b */
    /* loaded from: classes3.dex */
    public static final class C29919b implements CheckableItemView.InterfaceC16699b {
        public C29919b() {
        }

        @Override // co.bird.android.widget.standardcomponents.CheckableItemView.InterfaceC16699b
        /* renamed from: a */
        public void mo3842a(CheckableItemView view, boolean z) {
            IssueStatus issueStatus;
            Intrinsics.checkNotNullParameter(view, "view");
            if (z) {
                CheckableItemView[] checkableItemViewArr = C51094wa2.this.f116226d;
                ArrayList<CheckableItemView> arrayList = new ArrayList();
                for (CheckableItemView checkableItemView : checkableItemViewArr) {
                    if (!Intrinsics.areEqual(checkableItemView, view)) {
                        arrayList.add(checkableItemView);
                    }
                }
                for (CheckableItemView checkableItemView2 : arrayList) {
                    checkableItemView2.setChecked(false);
                }
                if (Intrinsics.areEqual(view, C51094wa2.this.f116224b.f49767d)) {
                    issueStatus = IssueStatus.RESOLVED;
                } else if (Intrinsics.areEqual(view, C51094wa2.this.f116224b.f49766c)) {
                    issueStatus = IssueStatus.OPEN;
                } else if (Intrinsics.areEqual(view, C51094wa2.this.f116224b.f49765b)) {
                    issueStatus = IssueStatus.DISPUTED;
                } else {
                    issueStatus = IssueStatus.OPEN;
                }
                C51094wa2.this.f116225c.onNext(issueStatus);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51094wa2(BaseActivity activity, C10556a4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f116224b = binding;
        C24552a<IssueStatus> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<IssueStatus>()");
        this.f116225c = m31922e;
        CheckableItemView[] checkableItemViewArr = {binding.f49767d, binding.f49766c, binding.f49765b};
        this.f116226d = checkableItemViewArr;
        this.f116227e = new C29919b();
        for (CheckableItemView checkableItemView : checkableItemViewArr) {
            checkableItemView.setCanUncheck(false);
            checkableItemView.setOnCheckChangedListener(this.f116227e);
        }
    }

    @Override // p000.InterfaceC50501va2
    /* renamed from: A7 */
    public void mo6633A7(boolean z) {
        CheckableItemView checkableItemView = this.f116224b.f49765b;
        Intrinsics.checkNotNullExpressionValue(checkableItemView, "binding.dispute");
        C49520tu6.show$default(checkableItemView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC50501va2
    /* renamed from: P */
    public Observable<IssueStatus> mo6632P() {
        Observable<IssueStatus> hide = this.f116225c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "statusSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC50501va2
    /* renamed from: Vf */
    public void mo6631Vf(boolean z) {
        CheckableItemView checkableItemView = this.f116224b.f49767d;
        Intrinsics.checkNotNullExpressionValue(checkableItemView, "binding.resolve");
        C49520tu6.show$default(checkableItemView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC50501va2
    /* renamed from: m0 */
    public Observable<Unit> mo6630m0() {
        Button button = this.f116224b.f49768e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.update");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC50501va2
    /* renamed from: mh */
    public void mo6629mh(IssueStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        int i = C29918a.$EnumSwitchMapping$0[status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f116224b.f49765b.setChecked(true);
                    return;
                }
                return;
            }
            this.f116224b.f49766c.setChecked(true);
            return;
        }
        this.f116224b.f49767d.setChecked(true);
    }

    @Override // p000.InterfaceC50501va2
    /* renamed from: ri */
    public void mo6628ri(boolean z) {
        this.f116224b.f49768e.setEnabled(z);
    }
}
