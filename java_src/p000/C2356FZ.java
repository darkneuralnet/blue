package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.viewmodel.BottomSheetAlertDialog;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0006\u0010\t\u001a\u00020\u0004R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006&"}, m28432d2 = {"LFZ;", "", "LNy;", "alert", "", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "b", C17296a.f69688o, "c", "Landroid/app/Activity;", "Landroid/app/Activity;", "activity", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Landroid/content/DialogInterface;", "Landroid/content/DialogInterface;", "dialog", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "icon1", "e", "icon2", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "title", "g", "message", "Landroid/widget/Button;", "h", "Landroid/widget/Button;", "confirm", "i", "cancel", "<init>", "(Landroid/app/Activity;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/content/DialogInterface;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomSheetAlertUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetAlertUi.kt\nco/bird/android/core/base/bottomsheetalert/BottomSheetAlertUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
/* renamed from: FZ */
/* loaded from: classes2.dex */
public final class C2356FZ {

    /* renamed from: a */
    public final Activity f9666a;

    /* renamed from: b */
    public final ConstraintLayout f9667b;

    /* renamed from: c */
    public final DialogInterface f9668c;

    /* renamed from: d */
    public final ImageView f9669d;

    /* renamed from: e */
    public final ImageView f9670e;

    /* renamed from: f */
    public final TextView f9671f;

    /* renamed from: g */
    public final TextView f9672g;

    /* renamed from: h */
    public final Button f9673h;

    /* renamed from: i */
    public final Button f9674i;

    public C2356FZ(Activity activity, ConstraintLayout root, DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f9666a = activity;
        this.f9667b = root;
        this.f9668c = dialog;
        View findViewById = root.findViewById(C37287Yg4.icon1);
        Intrinsics.checkNotNullExpressionValue(findViewById, "root.findViewById(R.id.icon1)");
        this.f9669d = (ImageView) findViewById;
        this.f9670e = (ImageView) C49520tu6.m11238m(root, C37287Yg4.icon2);
        View findViewById2 = root.findViewById(C37287Yg4.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "root.findViewById(R.id.title)");
        this.f9671f = (TextView) findViewById2;
        View findViewById3 = root.findViewById(C37287Yg4.message);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "root.findViewById(R.id.message)");
        this.f9672g = (TextView) findViewById3;
        View findViewById4 = root.findViewById(C37287Yg4.confirm);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "root.findViewById(R.id.confirm)");
        this.f9673h = (Button) findViewById4;
        View findViewById5 = root.findViewById(C37287Yg4.cancel);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "root.findViewById(R.id.cancel)");
        this.f9674i = (Button) findViewById5;
    }

    /* renamed from: a */
    public final Observable<Unit> m106953a() {
        return C44626lf5.clicksThrottle$default(this.f9674i, 0L, 1, null);
    }

    /* renamed from: b */
    public final Observable<Unit> m106952b() {
        return C44626lf5.clicksThrottle$default(this.f9673h, 0L, 1, null);
    }

    /* renamed from: c */
    public final void m106951c() {
        this.f9668c.dismiss();
    }

    /* renamed from: d */
    public final void m106950d(AbstractC5751Ny alert) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        String string;
        ColorStateList valueOf;
        ColorStateList valueOf2;
        ColorStateList valueOf3;
        ColorStateList valueOf4;
        Intrinsics.checkNotNullParameter(alert, "alert");
        Unit unit = null;
        if (alert instanceof BottomSheetAlertDialog) {
            BottomSheetAlertDialog bottomSheetAlertDialog = (BottomSheetAlertDialog) alert;
            Drawable mo59005g = bottomSheetAlertDialog.mo59005g(this.f9666a);
            if (mo59005g != null) {
                this.f9669d.setImageDrawable(mo59005g);
                Unit unit2 = Unit.INSTANCE;
                C49520tu6.m11233r(this.f9669d);
            }
            Integer m59018i = bottomSheetAlertDialog.m59018i(this.f9666a);
            if (m59018i != null && (valueOf4 = ColorStateList.valueOf(m59018i.intValue())) != null) {
                this.f9669d.setImageTintList(valueOf4);
            }
            Integer m59019h = bottomSheetAlertDialog.m59019h(this.f9666a);
            if (m59019h != null && (valueOf3 = ColorStateList.valueOf(m59019h.intValue())) != null) {
                this.f9669d.setBackgroundTintList(valueOf3);
            }
            if (!bottomSheetAlertDialog.mo59021c()) {
                this.f9669d.setPadding(0, 0, 0, 0);
            }
            if (!bottomSheetAlertDialog.mo59022b()) {
                this.f9669d.setBackground(null);
            }
            if (this.f9670e != null) {
                Drawable mo59004j = bottomSheetAlertDialog.mo59004j(this.f9666a);
                if (mo59004j != null) {
                    this.f9670e.setImageDrawable(mo59004j);
                    Unit unit3 = Unit.INSTANCE;
                    C49520tu6.m11233r(this.f9670e);
                }
                Integer mo59009l = bottomSheetAlertDialog.mo59009l(this.f9666a);
                if (mo59009l != null && (valueOf2 = ColorStateList.valueOf(mo59009l.intValue())) != null) {
                    this.f9670e.setImageTintList(valueOf2);
                }
                Integer mo59010k = bottomSheetAlertDialog.mo59010k(this.f9666a);
                if (mo59010k != null && (valueOf = ColorStateList.valueOf(mo59010k.intValue())) != null) {
                    this.f9670e.setBackgroundTintList(valueOf);
                }
                if (!bottomSheetAlertDialog.mo59011e()) {
                    this.f9670e.setPadding(0, 0, 0, 0);
                }
                if (!bottomSheetAlertDialog.m59020d()) {
                    this.f9670e.setBackground(null);
                }
            }
            if (bottomSheetAlertDialog.mo59005g(this.f9666a) == null || bottomSheetAlertDialog.mo59004j(this.f9666a) == null) {
                if (bottomSheetAlertDialog.mo59005g(this.f9666a) != null) {
                    C11515b c11515b = new C11515b();
                    c11515b.m67813o(this.f9666a, C33804Jj4.bottom_sheet_alert_icon_1_only);
                    c11515b.m67819i(this.f9667b);
                } else if (bottomSheetAlertDialog.mo59004j(this.f9666a) != null) {
                    C11515b c11515b2 = new C11515b();
                    c11515b2.m67813o(this.f9666a, C33804Jj4.bottom_sheet_alert_icon_2_only);
                    c11515b2.m67819i(this.f9667b);
                }
            }
        } else if (alert instanceof QM4) {
            this.f9669d.setImageResource(((QM4) alert).mo27707d());
            C49520tu6.m11233r(this.f9669d);
            ImageView imageView = this.f9670e;
            if (imageView != null) {
                C49520tu6.m11239l(imageView);
            }
        }
        this.f9671f.setText(alert.title(this.f9666a));
        this.f9672g.setText(alert.message(this.f9666a));
        Button button = this.f9673h;
        Integer mo3215a = alert.mo3215a();
        if (mo3215a != null) {
            str = this.f9666a.getString(mo3215a.intValue());
        } else {
            str = null;
        }
        button.setText(str);
        Integer negativeText = alert.getNegativeText();
        if (negativeText != null && (string = this.f9666a.getString(negativeText.intValue())) != null) {
            this.f9674i.setText(string);
            unit = Unit.INSTANCE;
        }
        if (unit == null && (layoutParams = this.f9674i.getLayoutParams()) != null) {
            layoutParams.height = 0;
        }
    }
}
