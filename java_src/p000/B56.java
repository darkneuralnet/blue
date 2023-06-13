package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: B56 */
/* loaded from: classes6.dex */
public class B56 {

    /* renamed from: a */
    public static final Comparator<View> f1822a = new C0520a();

    /* renamed from: B56$a */
    /* loaded from: classes6.dex */
    public class C0520a implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private B56() {
    }

    /* renamed from: a */
    public static ActionMenuView m114371a(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ImageView m114370b(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static ImageView m114369c(Toolbar toolbar) {
        return m114370b(toolbar, toolbar.m69798B());
    }

    /* renamed from: d */
    public static ImageButton m114368d(Toolbar toolbar) {
        Drawable m69794F = toolbar.m69794F();
        if (m69794F == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == m69794F) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public static TextView m114367e(Toolbar toolbar) {
        List<TextView> m114366f = m114366f(toolbar, toolbar.m69793G());
        if (m114366f.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(m114366f, f1822a);
    }

    /* renamed from: f */
    public static List<TextView> m114366f(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static TextView m114365g(Toolbar toolbar) {
        List<TextView> m114366f = m114366f(toolbar, toolbar.m69792H());
        if (m114366f.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(m114366f, f1822a);
    }
}
