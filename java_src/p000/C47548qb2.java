package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: qb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47548qb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f105453a;

    /* renamed from: b */
    public final Button f105454b;

    /* renamed from: c */
    public final ProgressBar f105455c;

    /* renamed from: d */
    public final Button f105456d;

    /* renamed from: e */
    public final ProgressBar f105457e;

    /* renamed from: f */
    public final TextView f105458f;

    /* renamed from: g */
    public final ImageView f105459g;

    public C47548qb2(ConstraintLayout constraintLayout, Button button, ProgressBar progressBar, Button button2, ProgressBar progressBar2, TextView textView, ImageView imageView) {
        this.f105453a = constraintLayout;
        this.f105454b = button;
        this.f105455c = progressBar;
        this.f105456d = button2;
        this.f105457e = progressBar2;
        this.f105458f = textView;
        this.f105459g = imageView;
    }

    /* renamed from: a */
    public static C47548qb2 m17352a(View view) {
        int i = C36819Wg4.bluetooth;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36819Wg4.bluetoothProgressBar;
            ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
            if (progressBar != null) {
                i = C36819Wg4.cellular;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C36819Wg4.cellularProgressBar;
                    ProgressBar progressBar2 = (ProgressBar) C34328Lp6.m96312a(view, i);
                    if (progressBar2 != null) {
                        i = C36819Wg4.command;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C36819Wg4.icon;
                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView != null) {
                                return new C47548qb2((ConstraintLayout) view, button, progressBar, button2, progressBar2, textView, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f105453a;
    }
}
