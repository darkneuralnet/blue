package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
/* renamed from: Ek2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32641Ek2 extends AbstractC32875Fk2 {

    /* renamed from: h */
    public String f7998h = null;

    /* renamed from: i */
    public int f7999i = AbstractC37078Xj2.f43729f;

    /* renamed from: j */
    public int f8000j = 0;

    /* renamed from: k */
    public float f8001k = Float.NaN;

    /* renamed from: l */
    public float f8002l = Float.NaN;

    /* renamed from: m */
    public float f8003m = Float.NaN;

    /* renamed from: n */
    public float f8004n = Float.NaN;

    /* renamed from: o */
    public float f8005o = Float.NaN;

    /* renamed from: p */
    public float f8006p = Float.NaN;

    /* renamed from: q */
    public int f8007q = 0;

    /* renamed from: r */
    public float f8008r = Float.NaN;

    /* renamed from: s */
    public float f8009s = Float.NaN;

    /* renamed from: Ek2$a */
    /* loaded from: classes.dex */
    public static class C1939a {

        /* renamed from: a */
        public static SparseIntArray f8010a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8010a = sparseIntArray;
            sparseIntArray.append(C39341cm4.KeyPosition_motionTarget, 1);
            f8010a.append(C39341cm4.KeyPosition_framePosition, 2);
            f8010a.append(C39341cm4.KeyPosition_transitionEasing, 3);
            f8010a.append(C39341cm4.KeyPosition_curveFit, 4);
            f8010a.append(C39341cm4.KeyPosition_drawPath, 5);
            f8010a.append(C39341cm4.KeyPosition_percentX, 6);
            f8010a.append(C39341cm4.KeyPosition_percentY, 7);
            f8010a.append(C39341cm4.KeyPosition_keyPositionType, 9);
            f8010a.append(C39341cm4.KeyPosition_sizePercent, 8);
            f8010a.append(C39341cm4.KeyPosition_percentWidth, 11);
            f8010a.append(C39341cm4.KeyPosition_percentHeight, 12);
            f8010a.append(C39341cm4.KeyPosition_pathMotionArc, 10);
        }

        private C1939a() {
        }

        /* renamed from: b */
        public static void m108537b(C32641Ek2 c32641Ek2, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f8010a.get(index)) {
                    case 1:
                        if (MotionLayout.f53557Y0) {
                            int resourceId = typedArray.getResourceId(index, c32641Ek2.f43731b);
                            c32641Ek2.f43731b = resourceId;
                            if (resourceId == -1) {
                                c32641Ek2.f43732c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c32641Ek2.f43732c = typedArray.getString(index);
                            break;
                        } else {
                            c32641Ek2.f43731b = typedArray.getResourceId(index, c32641Ek2.f43731b);
                            break;
                        }
                    case 2:
                        c32641Ek2.f43730a = typedArray.getInt(index, c32641Ek2.f43730a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            c32641Ek2.f7998h = typedArray.getString(index);
                            break;
                        } else {
                            c32641Ek2.f7998h = C41363g91.f81686c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        c32641Ek2.f10056g = typedArray.getInteger(index, c32641Ek2.f10056g);
                        break;
                    case 5:
                        c32641Ek2.f8000j = typedArray.getInt(index, c32641Ek2.f8000j);
                        break;
                    case 6:
                        c32641Ek2.f8003m = typedArray.getFloat(index, c32641Ek2.f8003m);
                        break;
                    case 7:
                        c32641Ek2.f8004n = typedArray.getFloat(index, c32641Ek2.f8004n);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, c32641Ek2.f8002l);
                        c32641Ek2.f8001k = f;
                        c32641Ek2.f8002l = f;
                        break;
                    case 9:
                        c32641Ek2.f8007q = typedArray.getInt(index, c32641Ek2.f8007q);
                        break;
                    case 10:
                        c32641Ek2.f7999i = typedArray.getInt(index, c32641Ek2.f7999i);
                        break;
                    case 11:
                        c32641Ek2.f8001k = typedArray.getFloat(index, c32641Ek2.f8001k);
                        break;
                    case 12:
                        c32641Ek2.f8002l = typedArray.getFloat(index, c32641Ek2.f8002l);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8010a.get(index));
                        break;
                }
            }
            if (c32641Ek2.f43730a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public C32641Ek2() {
        this.f43733d = 2;
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: a */
    public void mo40951a(HashMap<String, AbstractC33194Gt6> hashMap) {
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: b */
    public AbstractC37078Xj2 clone() {
        return new C32641Ek2().mo40949c(this);
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: c */
    public AbstractC37078Xj2 mo40949c(AbstractC37078Xj2 abstractC37078Xj2) {
        super.mo40949c(abstractC37078Xj2);
        C32641Ek2 c32641Ek2 = (C32641Ek2) abstractC37078Xj2;
        this.f7998h = c32641Ek2.f7998h;
        this.f7999i = c32641Ek2.f7999i;
        this.f8000j = c32641Ek2.f8000j;
        this.f8001k = c32641Ek2.f8001k;
        this.f8002l = Float.NaN;
        this.f8003m = c32641Ek2.f8003m;
        this.f8004n = c32641Ek2.f8004n;
        this.f8005o = c32641Ek2.f8005o;
        this.f8006p = c32641Ek2.f8006p;
        this.f8008r = c32641Ek2.f8008r;
        this.f8009s = c32641Ek2.f8009s;
        return this;
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: e */
    public void mo40947e(Context context, AttributeSet attributeSet) {
        C1939a.m108537b(this, context.obtainStyledAttributes(attributeSet, C39341cm4.KeyPosition));
    }

    /* renamed from: m */
    public void m108540m(int i) {
        this.f8007q = i;
    }

    /* renamed from: n */
    public void m108539n(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f7998h = obj.toString();
                return;
            case 1:
                this.f8001k = m76527k(obj);
                return;
            case 2:
                this.f8002l = m76527k(obj);
                return;
            case 3:
                this.f8000j = m76526l(obj);
                return;
            case 4:
                float m76527k = m76527k(obj);
                this.f8001k = m76527k;
                this.f8002l = m76527k;
                return;
            case 5:
                this.f8003m = m76527k(obj);
                return;
            case 6:
                this.f8004n = m76527k(obj);
                return;
            default:
                return;
        }
    }
}
