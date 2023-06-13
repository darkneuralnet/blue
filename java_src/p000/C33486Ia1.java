package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C11581c;
/* renamed from: Ia1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33486Ia1 {

    /* renamed from: a */
    public final C3712b f15907a;

    /* renamed from: Ia1$a */
    /* loaded from: classes.dex */
    public static class C3711a extends C3712b {

        /* renamed from: a */
        public final TextView f15908a;

        /* renamed from: b */
        public final C32550Ea1 f15909b;

        /* renamed from: c */
        public boolean f15910c = true;

        public C3711a(TextView textView) {
            this.f15908a = textView;
            this.f15909b = new C32550Ea1(textView);
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: a */
        public InputFilter[] mo101911a(InputFilter[] inputFilterArr) {
            if (!this.f15910c) {
                return m101917h(inputFilterArr);
            }
            return m101919f(inputFilterArr);
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: b */
        public boolean mo101910b() {
            return this.f15910c;
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: c */
        public void mo101909c(boolean z) {
            if (z) {
                m101913l();
            }
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: d */
        public void mo101908d(boolean z) {
            this.f15910c = z;
            m101913l();
            m101914k();
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: e */
        public TransformationMethod mo101907e(TransformationMethod transformationMethod) {
            if (this.f15910c) {
                return m101912m(transformationMethod);
            }
            return m101915j(transformationMethod);
        }

        /* renamed from: f */
        public final InputFilter[] m101919f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f15909b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f15909b;
            return inputFilterArr2;
        }

        /* renamed from: g */
        public final SparseArray<InputFilter> m101918g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C32550Ea1) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: h */
        public final InputFilter[] m101917h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> m101918g = m101918g(inputFilterArr);
            if (m101918g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - m101918g.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (m101918g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: i */
        public void m101916i(boolean z) {
            this.f15910c = z;
        }

        /* renamed from: j */
        public final TransformationMethod m101915j(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C33954Ka1) {
                return ((C33954Ka1) transformationMethod).m98728a();
            }
            return transformationMethod;
        }

        /* renamed from: k */
        public final void m101914k() {
            this.f15908a.setFilters(mo101911a(this.f15908a.getFilters()));
        }

        /* renamed from: l */
        public void m101913l() {
            this.f15908a.setTransformationMethod(mo101907e(this.f15908a.getTransformationMethod()));
        }

        /* renamed from: m */
        public final TransformationMethod m101912m(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C33954Ka1) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new C33954Ka1(transformationMethod);
        }
    }

    /* renamed from: Ia1$b */
    /* loaded from: classes.dex */
    public static class C3712b {
        /* renamed from: a */
        public InputFilter[] mo101911a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* renamed from: b */
        public boolean mo101910b() {
            return false;
        }

        /* renamed from: c */
        public void mo101909c(boolean z) {
        }

        /* renamed from: d */
        public void mo101908d(boolean z) {
        }

        /* renamed from: e */
        public TransformationMethod mo101907e(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    /* renamed from: Ia1$c */
    /* loaded from: classes.dex */
    public static class C3713c extends C3712b {

        /* renamed from: a */
        public final C3711a f15911a;

        public C3713c(TextView textView) {
            this.f15911a = new C3711a(textView);
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: a */
        public InputFilter[] mo101911a(InputFilter[] inputFilterArr) {
            if (m101906f()) {
                return inputFilterArr;
            }
            return this.f15911a.mo101911a(inputFilterArr);
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: b */
        public boolean mo101910b() {
            return this.f15911a.mo101910b();
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: c */
        public void mo101909c(boolean z) {
            if (m101906f()) {
                return;
            }
            this.f15911a.mo101909c(z);
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: d */
        public void mo101908d(boolean z) {
            if (m101906f()) {
                this.f15911a.m101916i(z);
            } else {
                this.f15911a.mo101908d(z);
            }
        }

        @Override // p000.C33486Ia1.C3712b
        /* renamed from: e */
        public TransformationMethod mo101907e(TransformationMethod transformationMethod) {
            if (m101906f()) {
                return transformationMethod;
            }
            return this.f15911a.mo101907e(transformationMethod);
        }

        /* renamed from: f */
        public final boolean m101906f() {
            return !C11581c.m67521k();
        }
    }

    public C33486Ia1(TextView textView, boolean z) {
        HZ3.m103730h(textView, "textView cannot be null");
        if (!z) {
            this.f15907a = new C3713c(textView);
        } else {
            this.f15907a = new C3711a(textView);
        }
    }

    /* renamed from: a */
    public InputFilter[] m101924a(InputFilter[] inputFilterArr) {
        return this.f15907a.mo101911a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m101923b() {
        return this.f15907a.mo101910b();
    }

    /* renamed from: c */
    public void m101922c(boolean z) {
        this.f15907a.mo101909c(z);
    }

    /* renamed from: d */
    public void m101921d(boolean z) {
        this.f15907a.mo101908d(z);
    }

    /* renamed from: e */
    public TransformationMethod m101920e(TransformationMethod transformationMethod) {
        return this.f15907a.mo101907e(transformationMethod);
    }
}
