package p000;

import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0013\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0015\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0017\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0019\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e¨\u0006\u001e"}, m28432d2 = {"LgL5;", "LfL5;", "LxE;", "Lio/reactivex/Observable;", "", "u8", "Aa", C8329Uc.f37649d, "Na", "k9", "Rd", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "b", "Landroid/view/ViewGroup;", "associateToolCard", "c", "associateToolV2Card", DateTokenConverter.CONVERTER_KEY, "testToolCard", "e", "standaloneToolCard", "f", "unlockSmartLockToolCard", "g", "legacyComboLockToolCard", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gL5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41476gL5 extends AbstractC30071xE implements InterfaceC40883fL5 {

    /* renamed from: b */
    public final ViewGroup f82009b;

    /* renamed from: c */
    public final ViewGroup f82010c;

    /* renamed from: d */
    public final ViewGroup f82011d;

    /* renamed from: e */
    public final ViewGroup f82012e;

    /* renamed from: f */
    public final ViewGroup f82013f;

    /* renamed from: g */
    public final ViewGroup f82014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41476gL5(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f82009b = (ViewGroup) activity.findViewById(C36585Vg4.associationTool);
        this.f82010c = (ViewGroup) activity.findViewById(C36585Vg4.associationToolV2);
        this.f82011d = (ViewGroup) activity.findViewById(C36585Vg4.testTool);
        this.f82012e = (ViewGroup) activity.findViewById(C36585Vg4.standaloneAssociationTool);
        this.f82013f = (ViewGroup) activity.findViewById(C36585Vg4.unlockSmartLockToolCard);
        this.f82014g = (ViewGroup) activity.findViewById(C36585Vg4.legacyComboLockToolCard);
    }

    @Override // p000.InterfaceC40883fL5
    /* renamed from: Aa */
    public Observable<Unit> mo39602Aa() {
        ViewGroup associateToolV2Card = this.f82010c;
        Intrinsics.checkNotNullExpressionValue(associateToolV2Card, "associateToolV2Card");
        return C44626lf5.clicksThrottle$default(associateToolV2Card, 0L, 1, null);
    }

    @Override // p000.InterfaceC40883fL5
    /* renamed from: Na */
    public Observable<Unit> mo39601Na() {
        ViewGroup standaloneToolCard = this.f82012e;
        Intrinsics.checkNotNullExpressionValue(standaloneToolCard, "standaloneToolCard");
        return C44626lf5.clicksThrottle$default(standaloneToolCard, 0L, 1, null);
    }

    @Override // p000.InterfaceC40883fL5
    /* renamed from: Rd */
    public Observable<Unit> mo39600Rd() {
        ViewGroup legacyComboLockToolCard = this.f82014g;
        Intrinsics.checkNotNullExpressionValue(legacyComboLockToolCard, "legacyComboLockToolCard");
        return C44626lf5.clicksThrottle$default(legacyComboLockToolCard, 0L, 1, null);
    }

    @Override // p000.InterfaceC40883fL5
    /* renamed from: Uc */
    public Observable<Unit> mo39599Uc() {
        ViewGroup testToolCard = this.f82011d;
        Intrinsics.checkNotNullExpressionValue(testToolCard, "testToolCard");
        return C44626lf5.clicksThrottle$default(testToolCard, 0L, 1, null);
    }

    @Override // p000.InterfaceC40883fL5
    /* renamed from: k9 */
    public Observable<Unit> mo39598k9() {
        ViewGroup unlockSmartLockToolCard = this.f82013f;
        Intrinsics.checkNotNullExpressionValue(unlockSmartLockToolCard, "unlockSmartLockToolCard");
        return C44626lf5.clicksThrottle$default(unlockSmartLockToolCard, 0L, 1, null);
    }

    @Override // p000.InterfaceC40883fL5
    /* renamed from: u8 */
    public Observable<Unit> mo39597u8() {
        ViewGroup associateToolCard = this.f82009b;
        Intrinsics.checkNotNullExpressionValue(associateToolCard, "associateToolCard");
        return C44626lf5.clicksThrottle$default(associateToolCard, 0L, 1, null);
    }
}
