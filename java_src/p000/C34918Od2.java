package p000;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.feature.filters.operator.p012v2.view.LogicOperatorView;
/* renamed from: Od2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34918Od2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f26948a;

    /* renamed from: b */
    public final CheckBox f26949b;

    /* renamed from: c */
    public final ImageView f26950c;

    /* renamed from: d */
    public final LogicOperatorView f26951d;

    /* renamed from: e */
    public final Space f26952e;

    /* renamed from: f */
    public final TextView f26953f;

    public C34918Od2(ConstraintLayout constraintLayout, CheckBox checkBox, ImageView imageView, LogicOperatorView logicOperatorView, Space space, TextView textView) {
        this.f26948a = constraintLayout;
        this.f26949b = checkBox;
        this.f26950c = imageView;
        this.f26951d = logicOperatorView;
        this.f26952e = space;
        this.f26953f = textView;
    }

    /* renamed from: a */
    public static C34918Od2 m91784a(View view) {
        int i = C45238mh4.checkbox;
        CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
        if (checkBox != null) {
            i = C45238mh4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C45238mh4.logicOperator;
                LogicOperatorView logicOperatorView = (LogicOperatorView) C34328Lp6.m96312a(view, i);
                if (logicOperatorView != null) {
                    i = C45238mh4.space;
                    Space space = (Space) C34328Lp6.m96312a(view, i);
                    if (space != null) {
                        i = C45238mh4.title;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            return new C34918Od2((ConstraintLayout) view, checkBox, imageView, logicOperatorView, space, textView);
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
        return this.f26948a;
    }
}
