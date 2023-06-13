package p000;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;
/* renamed from: Jo */
/* loaded from: classes.dex */
public final class C4240Jo {

    /* renamed from: a */
    public static final Rational f18254a = new Rational(4, 3);

    /* renamed from: b */
    public static final Rational f18255b = new Rational(3, 4);

    /* renamed from: c */
    public static final Rational f18256c = new Rational(16, 9);

    /* renamed from: d */
    public static final Rational f18257d = new Rational(9, 16);

    /* renamed from: Jo$a */
    /* loaded from: classes.dex */
    public static final class C4241a implements Comparator<Rational> {

        /* renamed from: b */
        public final Rational f18258b;

        /* renamed from: c */
        public final RectF f18259c;

        /* renamed from: d */
        public final Rational f18260d;

        public C4241a(Rational rational, Rational rational2) {
            this.f18258b = rational;
            this.f18260d = rational2 == null ? new Rational(4, 3) : rational2;
            this.f18259c = m99680d(rational);
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF m99680d = m99680d(rational);
            RectF m99680d2 = m99680d(rational2);
            boolean m99679e = m99679e(m99680d, this.f18259c);
            boolean m99679e2 = m99679e(m99680d2, this.f18259c);
            if (m99679e && m99679e2) {
                return (int) Math.signum(m99682b(m99680d) - m99682b(m99680d2));
            }
            if (m99679e) {
                return -1;
            }
            if (m99679e2) {
                return 1;
            }
            return -((int) Math.signum(m99681c(m99680d, this.f18259c) - m99681c(m99680d2, this.f18259c)));
        }

        /* renamed from: b */
        public final float m99682b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        /* renamed from: c */
        public final float m99681c(RectF rectF, RectF rectF2) {
            float width;
            float height;
            if (rectF.width() < rectF2.width()) {
                width = rectF.width();
            } else {
                width = rectF2.width();
            }
            if (rectF.height() < rectF2.height()) {
                height = rectF.height();
            } else {
                height = rectF2.height();
            }
            return width * height;
        }

        /* renamed from: d */
        public final RectF m99680d(Rational rational) {
            if (rational.floatValue() == this.f18260d.floatValue()) {
                return new RectF(0.0f, 0.0f, this.f18260d.getNumerator(), this.f18260d.getDenominator());
            }
            if (rational.floatValue() > this.f18260d.floatValue()) {
                return new RectF(0.0f, 0.0f, this.f18260d.getNumerator(), (rational.getDenominator() * this.f18260d.getNumerator()) / rational.getNumerator());
            }
            return new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f18260d.getDenominator()) / rational.getDenominator(), this.f18260d.getDenominator());
        }

        /* renamed from: e */
        public final boolean m99679e(RectF rectF, RectF rectF2) {
            if (rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height()) {
                return true;
            }
            return false;
        }
    }

    private C4240Jo() {
    }

    /* renamed from: a */
    public static boolean m99687a(Size size, Rational rational) {
        return m99686b(size, rational, IB5.f14643c);
    }

    /* renamed from: b */
    public static boolean m99686b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (IB5.m102817a(size) < IB5.m102817a(size2)) {
            return false;
        }
        return m99685c(size, rational);
    }

    /* renamed from: c */
    public static boolean m99685c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            if (!m99684d(Math.max(0, height - 16), width, rational) && !m99684d(Math.max(0, width - 16), height, rational2)) {
                return false;
            }
            return true;
        } else if (i == 0) {
            return m99684d(height, width, rational);
        } else {
            if (height % 16 != 0) {
                return false;
            }
            return m99684d(width, height, rational2);
        }
    }

    /* renamed from: d */
    public static boolean m99684d(int i, int i2, Rational rational) {
        boolean z;
        if (i2 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103737a(z);
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        if (numerator > Math.max(0, i2 - 16) && numerator < i2 + 16) {
            return true;
        }
        return false;
    }
}
