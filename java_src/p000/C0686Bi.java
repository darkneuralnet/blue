package p000;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* renamed from: Bi */
/* loaded from: classes.dex */
public final class C0686Bi {

    /* renamed from: a */
    public TextView f2700a;

    /* renamed from: b */
    public TextClassifier f2701b;

    /* renamed from: Bi$a */
    /* loaded from: classes.dex */
    public static final class C0687a {
        private C0687a() {
        }

        /* renamed from: a */
        public static TextClassifier m113663a(TextView textView) {
            TextClassifier textClassifier;
            TextClassifier textClassifier2;
            TextClassificationManager m2894a = C30681yi.m2894a(textView.getContext().getSystemService(TextClassificationManager.class));
            if (m2894a != null) {
                textClassifier2 = m2894a.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
    }

    public C0686Bi(TextView textView) {
        this.f2700a = (TextView) HZ3.m103731g(textView);
    }

    /* renamed from: a */
    public TextClassifier m113665a() {
        TextClassifier textClassifier = this.f2701b;
        if (textClassifier == null) {
            return C0687a.m113663a(this.f2700a);
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void m113664b(TextClassifier textClassifier) {
        this.f2701b = textClassifier;
    }
}
