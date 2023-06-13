package p000;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WirePhysicalLockReplacementType;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0002R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006%"}, m28432d2 = {"LBG4;", "LxE;", "LzG4;", "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "lockType", "", "Z7", "Lio/reactivex/Observable;", "b8", "Ne", "", "U7", "yg", "O8", "", "isEnabled", "qb", "isComplete", "P2", "doCombinationsMatch", "Pe", "hb", "Rl", "Ln5;", "b", "Ln5;", "binding", "Landroid/graphics/drawable/Drawable;", "c", "Landroid/graphics/drawable/Drawable;", "selectedCheckDrawable", DateTokenConverter.CONVERTER_KEY, "deSelectedCheckDrawable", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ln5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BG4 */
/* loaded from: classes2.dex */
public final class BG4 extends AbstractC30071xE implements InterfaceC52695zG4 {

    /* renamed from: b */
    public final C26358n5 f2162b;

    /* renamed from: c */
    public Drawable f2163c;

    /* renamed from: d */
    public Drawable f2164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BG4(final BaseActivity activity, C26358n5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f2162b = binding;
        binding.f99314b.setTransformationMethod(null);
        binding.f99316d.setTransformationMethod(null);
        binding.f99317e.setEnabled(false);
        binding.f99314b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: AG4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BG4.m114147Ql(BG4.this, activity);
            }
        });
    }

    /* renamed from: Ql */
    public static final void m114147Ql(BG4 this$0, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        int height = this$0.f2162b.f99314b.getHeight();
        EditText editText = this$0.f2162b.f99314b;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.enterCombination");
        int m11247d = height - (C49520tu6.m11247d(editText, 16) * 2);
        Drawable m94299e = NA0.m94299e(activity, C48193rg4.ic_check_selected);
        this$0.f2163c = m94299e;
        if (m94299e != null) {
            m94299e.setBounds(0, 0, m11247d, m11247d);
        }
        Drawable m94299e2 = NA0.m94299e(activity, C48193rg4.ic_check_deselected);
        this$0.f2164d = m94299e2;
        if (m94299e2 != null) {
            m94299e2.setBounds(0, 0, m11247d, m11247d);
        }
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: Ne */
    public Observable<Unit> mo1586Ne() {
        Button button = this.f2162b.f99317e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.saveButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: O8 */
    public Observable<String> mo1585O8() {
        EditText editText = this.f2162b.f99316d;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.reEnterCombination");
        return C44626lf5.textChanges$default(editText, 0, false, 2, null);
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: P2 */
    public void mo1584P2(boolean z) {
        if (z) {
            this.f2162b.f99314b.setCompoundDrawablesRelative(null, null, this.f2163c, null);
        } else {
            this.f2162b.f99314b.setCompoundDrawablesRelative(null, null, this.f2164d, null);
        }
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: Pe */
    public void mo1583Pe(boolean z) {
        this.f2162b.f99317e.setEnabled(z);
        if (z) {
            this.f2162b.f99316d.setCompoundDrawablesRelative(null, null, this.f2163c, null);
        } else {
            this.f2162b.f99316d.setCompoundDrawablesRelative(null, null, this.f2164d, null);
        }
    }

    /* renamed from: Rl */
    public final void m114146Rl() {
        this.f2162b.f99314b.setEnabled(true);
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: U7 */
    public Observable<String> mo1582U7() {
        EditText editText = this.f2162b.f99314b;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.enterCombination");
        return C44626lf5.textChanges$default(editText, 0, false, 2, null);
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: Z7 */
    public void mo1581Z7(WirePhysicalLockReplacementType lockType) {
        Intrinsics.checkNotNullParameter(lockType, "lockType");
        this.f2162b.f99315c.setText(lockType.getName());
        m114146Rl();
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: b8 */
    public Observable<Unit> mo1580b8() {
        TextView textView = this.f2162b.f99315c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.lockType");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: hb */
    public void mo1579hb() {
        this.f2162b.f99316d.getText().clear();
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: qb */
    public void mo1578qb(boolean z) {
        this.f2162b.f99316d.setEnabled(z);
    }

    @Override // p000.InterfaceC52695zG4
    /* renamed from: yg */
    public String mo1577yg() {
        return this.f2162b.f99314b.getText().toString();
    }
}
