package p000;

import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"LkD2;", "LxE;", "LjD2;", "Landroid/view/MenuItem;", "menuItem", "", "t0", "", "enabled", "L1", "found", "P1", "Lio/reactivex/Observable;", "w0", "", "O1", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "search", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "greenCheckmark", DateTokenConverter.CONVERTER_KEY, "redCheckmark", "e", "Landroid/view/MenuItem;", "next", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kD2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43773kD2 extends AbstractC30071xE implements InterfaceC43180jD2 {

    /* renamed from: b */
    public final EditText f94085b;

    /* renamed from: c */
    public final ImageView f94086c;

    /* renamed from: d */
    public final ImageView f94087d;

    /* renamed from: e */
    public MenuItem f94088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43773kD2(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f94085b = (EditText) C40788fB0.m41779c(activity, C36585Vg4.search);
        this.f94086c = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.correct);
        this.f94087d = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.incorrect);
    }

    @Override // p000.InterfaceC43180jD2
    /* renamed from: L1 */
    public void mo29192L1(boolean z) {
        MenuItem menuItem = this.f94088e;
        if (menuItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("next");
            menuItem = null;
        }
        menuItem.setVisible(z);
    }

    @Override // p000.InterfaceC43180jD2
    /* renamed from: O1 */
    public Observable<String> mo29191O1() {
        return C44626lf5.textChanges$default(this.f94085b, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, false, 2, null);
    }

    @Override // p000.InterfaceC43180jD2
    /* renamed from: P1 */
    public void mo29190P1(boolean z) {
        C49520tu6.show$default(this.f94086c, z, 0, 2, null);
        C49520tu6.show$default(this.f94087d, !z, 0, 2, null);
    }

    @Override // p000.InterfaceC43180jD2
    /* renamed from: t0 */
    public void mo29189t0(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        this.f94088e = menuItem;
    }

    @Override // p000.InterfaceC43180jD2
    /* renamed from: w0 */
    public Observable<Unit> mo29188w0() {
        MenuItem menuItem = this.f94088e;
        if (menuItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("next");
            menuItem = null;
        }
        return C44626lf5.m27018b(menuItem);
    }
}
