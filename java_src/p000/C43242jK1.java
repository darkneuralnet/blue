package p000;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0019\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0010\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0010\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000bJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0017\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u0014R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010)\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0011\u0010+\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010$¨\u00061"}, m28432d2 = {"LjK1;", "LxE;", "LH31;", "Lh56;", "", "url", "", "Vl", "", "res", "Wl", "", "show", "Yl", "Lio/reactivex/Observable;", "z5", "am", "bm", "Zl", "Ql", "LjK1$a;", TransferTable.COLUMN_STATE, "startingLease", "cm", "r0", "errorMessageResId", "Xl", "(Ljava/lang/Integer;)V", "Lkotlin/Pair;", "Landroid/widget/CheckBox;", "Pl", "LM3;", "b", "LM3;", "binding", "Rl", "()Landroid/widget/CheckBox;", "checkbox1", "Sl", "checkbox2", "Tl", "checkbox3", "Ul", "checkbox4", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LM3;)V", C17296a.f69688o, "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetLeaseSolebeScannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseSolebeScannerUi.kt\nco/bird/android/feature/itemlease/solebe/HelmetLeaseSolebeScannerUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
/* renamed from: jK1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43242jK1 extends AbstractC30071xE {

    /* renamed from: b */
    public final C5159M3 f92546b;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m28432d2 = {"LjK1$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jK1$a */
    /* loaded from: classes3.dex */
    public enum EnumC24808a {
        VERIFYING_CONNECTION,
        VERIFY_FAILED,
        HELMET_STATE_INCORRECT,
        LEASE_ACTION,
        LEASE_ACTION_ERROR,
        OPENING_LOCK,
        LOCK_OPENED,
        LEASE_ENDED,
        UNKNOWN_ERROR
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jK1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24809b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC24808a.values().length];
            try {
                iArr[EnumC24808a.VERIFYING_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24808a.VERIFY_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24808a.HELMET_STATE_INCORRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC24808a.LEASE_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC24808a.LEASE_ACTION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC24808a.OPENING_LOCK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC24808a.LOCK_OPENED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC24808a.LEASE_ENDED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC24808a.UNKNOWN_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43242jK1(BaseActivity activity, C5159M3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f92546b = binding;
    }

    public static /* synthetic */ void showContinueButton$default(C43242jK1 c43242jK1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c43242jK1.m30778Yl(z);
    }

    public static /* synthetic */ void showContinueWithoutHelmetButton$default(C43242jK1 c43242jK1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c43242jK1.m30777Zl(z);
    }

    public static /* synthetic */ void showTryAgainButton$default(C43242jK1 c43242jK1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c43242jK1.m30776am(z);
    }

    public static /* synthetic */ void updateSolebeUnlockingState$default(C43242jK1 c43242jK1, EnumC24808a enumC24808a, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c43242jK1.m30774cm(enumC24808a, z);
    }

    /* renamed from: Pl */
    public final Pair<CheckBox, CheckBox> m30787Pl(EnumC24808a enumC24808a) {
        Intrinsics.checkNotNullParameter(enumC24808a, "<this>");
        switch (C24809b.$EnumSwitchMapping$0[enumC24808a.ordinal()]) {
            case 1:
                return TuplesKt.m28425to(null, m30785Rl());
            case 2:
                return TuplesKt.m28425to(null, m30785Rl());
            case 3:
                return TuplesKt.m28425to(null, m30785Rl());
            case 4:
                return TuplesKt.m28425to(m30785Rl(), m30784Sl());
            case 5:
                return TuplesKt.m28425to(m30785Rl(), m30784Sl());
            case 6:
                return TuplesKt.m28425to(m30784Sl(), m30783Tl());
            case 7:
                return TuplesKt.m28425to(m30783Tl(), m30782Ul());
            case 8:
                return TuplesKt.m28425to(m30784Sl(), m30783Tl());
            case 9:
                return TuplesKt.m28425to(null, m30785Rl());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: Ql */
    public final Observable<Unit> m30786Ql() {
        Button button = this.f92546b.f22501i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueWithoutHelmetButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Rl */
    public final CheckBox m30785Rl() {
        CheckBox checkBox = this.f92546b.f22496d;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox1");
        return checkBox;
    }

    /* renamed from: Sl */
    public final CheckBox m30784Sl() {
        CheckBox checkBox = this.f92546b.f22497e;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox2");
        return checkBox;
    }

    /* renamed from: Tl */
    public final CheckBox m30783Tl() {
        CheckBox checkBox = this.f92546b.f22498f;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox3");
        return checkBox;
    }

    /* renamed from: Ul */
    public final CheckBox m30782Ul() {
        CheckBox checkBox = this.f92546b.f22499g;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox4");
        return checkBox;
    }

    /* renamed from: Vl */
    public final void m30781Vl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f92546b.f22504l.setAnimationFromUrl(url);
    }

    /* renamed from: Wl */
    public final void m30780Wl(int i) {
        ConstraintLayout.LayoutParams layoutParams;
        this.f92546b.f22504l.setImageResource(i);
        ViewGroup.LayoutParams layoutParams2 = this.f92546b.f22504l.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
            layoutParams.f53974b0 = true;
            layoutParams.f53953I = "375:281";
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        }
    }

    /* renamed from: Xl */
    public final void m30779Xl(Integer num) {
        boolean z;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        if (num != null) {
            TextView textView = this.f92546b.f22494b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.bluetoothUnavailableMessageText");
            textView.setText(num.intValue());
        }
        TextView textView2 = this.f92546b.f22495c;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.bluetoothUnavailableTitleText");
        C49520tu6.show$default(textView2, z, 0, 2, null);
        TextView textView3 = this.f92546b.f22494b;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.bluetoothUnavailableMessageText");
        C49520tu6.show$default(textView3, z, 0, 2, null);
    }

    /* renamed from: Yl */
    public final void m30778Yl(boolean z) {
        Button button = this.f92546b.f22500h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: Zl */
    public final void m30777Zl(boolean z) {
        Button button = this.f92546b.f22501i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueWithoutHelmetButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: am */
    public final void m30776am(boolean z) {
        Button button = this.f92546b.f22506n;
        Intrinsics.checkNotNullExpressionValue(button, "binding.tryAgainButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: bm */
    public final Observable<Unit> m30775bm() {
        Button button = this.f92546b.f22506n;
        Intrinsics.checkNotNullExpressionValue(button, "binding.tryAgainButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: cm */
    public final void m30774cm(EnumC24808a state, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(state, "state");
        Pair<CheckBox, CheckBox> m30787Pl = m30787Pl(state);
        CheckBox component1 = m30787Pl.component1();
        CheckBox component2 = m30787Pl.component2();
        if (Intrinsics.areEqual(component2, m30783Tl())) {
            C49520tu6.m11239l(m30782Ul());
        } else if (Intrinsics.areEqual(component2, m30784Sl())) {
            C49520tu6.m11239l(m30783Tl());
            C49520tu6.m11239l(m30782Ul());
        } else if (Intrinsics.areEqual(component2, m30785Rl())) {
            C49520tu6.m11239l(m30784Sl());
            C49520tu6.m11239l(m30783Tl());
            C49520tu6.m11239l(m30782Ul());
        }
        if (component1 != null) {
            C49520tu6.m11233r(component1);
        }
        C49520tu6.m11233r(component2);
        switch (C24809b.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                component2.setText(C45871nl4.solebe_unlock_step_verify_lock_exists);
                component2.setButtonDrawable(C48193rg4.ic_more);
                component2.setButtonTintList(null);
                return;
            case 2:
                if (z) {
                    i = C45871nl4.solebe_unlock_step_verify_lock_exists_failed;
                } else {
                    i = C45871nl4.solebe_return_step_verify_lock_exists_failed;
                }
                component2.setText(i);
                component2.setButtonDrawable(C48193rg4.ic_check_circle);
                component2.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdRed)));
                return;
            case 3:
                if (z) {
                    i2 = C45871nl4.solebe_unlock_step_verify_lock_exists_already_open;
                } else {
                    i2 = C45871nl4.solebe_return_step_verify_lock_exists_not_locked;
                }
                component2.setText(i2);
                component2.setButtonDrawable(C48193rg4.ic_x_circle);
                component2.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdRed)));
                return;
            case 4:
                if (z) {
                    i3 = C45871nl4.solebe_unlock_step_starting_lease;
                } else {
                    i3 = C45871nl4.solebe_return_step_ending_lease;
                }
                if (component1 != null) {
                    component1.setButtonDrawable(C48193rg4.ic_check_circle);
                }
                if (component1 != null) {
                    component1.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdGreen)));
                }
                component2.setText(i3);
                component2.setButtonDrawable(C48193rg4.ic_more);
                component2.setButtonTintList(null);
                return;
            case 5:
                if (z) {
                    i4 = C45871nl4.solebe_unlock_step_starting_lease_failed;
                } else {
                    i4 = C45871nl4.solebe_return_step_ending_lease_failed;
                }
                component2.setText(i4);
                component2.setButtonDrawable(C48193rg4.ic_x_circle);
                component2.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdRed)));
                return;
            case 6:
                if (component1 != null) {
                    component1.setButtonDrawable(C48193rg4.ic_check_circle);
                }
                if (component1 != null) {
                    component1.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdGreen)));
                }
                component2.setText(C45871nl4.solebe_unlock_step_opening_lock);
                component2.setButtonDrawable(C48193rg4.ic_more);
                component2.setButtonTintList(null);
                return;
            case 7:
                if (component1 != null) {
                    component1.setButtonDrawable(C48193rg4.ic_check_circle);
                }
                if (component1 != null) {
                    component1.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdGreen)));
                }
                component2.setText(C45871nl4.solebe_unlock_step_opening_lock_succeeded);
                component2.setButtonDrawable(C48193rg4.ic_check_circle);
                component2.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdGreen)));
                return;
            case 8:
                if (component1 != null) {
                    component1.setButtonDrawable(C48193rg4.ic_check_circle);
                }
                if (component1 != null) {
                    component1.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdGreen)));
                }
                component2.setText(C45871nl4.solebe_return_step_ending_lease_succeeded);
                component2.setButtonDrawable(C48193rg4.ic_check_circle);
                component2.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdGreen)));
                return;
            case 9:
                component2.setText(C45871nl4.an_unknown_bluetooth_error_occurred);
                component2.setButtonDrawable(C48193rg4.ic_x_circle);
                component2.setButtonTintList(ColorStateList.valueOf(getColor(C32364Df4.birdRed)));
                return;
            default:
                return;
        }
    }

    /* renamed from: r0 */
    public final Observable<Unit> m30773r0() {
        Button button = this.f92546b.f22503k;
        Intrinsics.checkNotNullExpressionValue(button, "binding.helpButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: z5 */
    public final Observable<Unit> m30772z5() {
        Button button = this.f92546b.f22500h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
