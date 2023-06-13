package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C11512a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.AbstractC33194Gt6;
/* renamed from: ck2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39319ck2 extends AbstractC37078Xj2 {

    /* renamed from: g */
    public String f61148g;

    /* renamed from: h */
    public int f61149h = -1;

    /* renamed from: i */
    public boolean f61150i = false;

    /* renamed from: j */
    public float f61151j = Float.NaN;

    /* renamed from: k */
    public float f61152k = Float.NaN;

    /* renamed from: l */
    public float f61153l = Float.NaN;

    /* renamed from: m */
    public float f61154m = Float.NaN;

    /* renamed from: n */
    public float f61155n = Float.NaN;

    /* renamed from: o */
    public float f61156o = Float.NaN;

    /* renamed from: p */
    public float f61157p = Float.NaN;

    /* renamed from: q */
    public float f61158q = Float.NaN;

    /* renamed from: r */
    public float f61159r = Float.NaN;

    /* renamed from: s */
    public float f61160s = Float.NaN;

    /* renamed from: t */
    public float f61161t = Float.NaN;

    /* renamed from: u */
    public float f61162u = Float.NaN;

    /* renamed from: v */
    public float f61163v = Float.NaN;

    /* renamed from: w */
    public float f61164w = Float.NaN;

    /* renamed from: ck2$a */
    /* loaded from: classes.dex */
    public static class C13660a {

        /* renamed from: a */
        public static SparseIntArray f61165a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f61165a = sparseIntArray;
            sparseIntArray.append(C39341cm4.KeyAttribute_android_alpha, 1);
            f61165a.append(C39341cm4.KeyAttribute_android_elevation, 2);
            f61165a.append(C39341cm4.KeyAttribute_android_rotation, 4);
            f61165a.append(C39341cm4.KeyAttribute_android_rotationX, 5);
            f61165a.append(C39341cm4.KeyAttribute_android_rotationY, 6);
            f61165a.append(C39341cm4.KeyAttribute_android_transformPivotX, 19);
            f61165a.append(C39341cm4.KeyAttribute_android_transformPivotY, 20);
            f61165a.append(C39341cm4.KeyAttribute_android_scaleX, 7);
            f61165a.append(C39341cm4.KeyAttribute_transitionPathRotate, 8);
            f61165a.append(C39341cm4.KeyAttribute_transitionEasing, 9);
            f61165a.append(C39341cm4.KeyAttribute_motionTarget, 10);
            f61165a.append(C39341cm4.KeyAttribute_framePosition, 12);
            f61165a.append(C39341cm4.KeyAttribute_curveFit, 13);
            f61165a.append(C39341cm4.KeyAttribute_android_scaleY, 14);
            f61165a.append(C39341cm4.KeyAttribute_android_translationX, 15);
            f61165a.append(C39341cm4.KeyAttribute_android_translationY, 16);
            f61165a.append(C39341cm4.KeyAttribute_android_translationZ, 17);
            f61165a.append(C39341cm4.KeyAttribute_motionProgress, 18);
        }

        private C13660a() {
        }

        /* renamed from: a */
        public static void m60977a(C39319ck2 c39319ck2, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f61165a.get(index)) {
                    case 1:
                        c39319ck2.f61151j = typedArray.getFloat(index, c39319ck2.f61151j);
                        break;
                    case 2:
                        c39319ck2.f61152k = typedArray.getDimension(index, c39319ck2.f61152k);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f61165a.get(index));
                        break;
                    case 4:
                        c39319ck2.f61153l = typedArray.getFloat(index, c39319ck2.f61153l);
                        break;
                    case 5:
                        c39319ck2.f61154m = typedArray.getFloat(index, c39319ck2.f61154m);
                        break;
                    case 6:
                        c39319ck2.f61155n = typedArray.getFloat(index, c39319ck2.f61155n);
                        break;
                    case 7:
                        c39319ck2.f61159r = typedArray.getFloat(index, c39319ck2.f61159r);
                        break;
                    case 8:
                        c39319ck2.f61158q = typedArray.getFloat(index, c39319ck2.f61158q);
                        break;
                    case 9:
                        c39319ck2.f61148g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f53557Y0) {
                            int resourceId = typedArray.getResourceId(index, c39319ck2.f43731b);
                            c39319ck2.f43731b = resourceId;
                            if (resourceId == -1) {
                                c39319ck2.f43732c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c39319ck2.f43732c = typedArray.getString(index);
                            break;
                        } else {
                            c39319ck2.f43731b = typedArray.getResourceId(index, c39319ck2.f43731b);
                            break;
                        }
                    case 12:
                        c39319ck2.f43730a = typedArray.getInt(index, c39319ck2.f43730a);
                        break;
                    case 13:
                        c39319ck2.f61149h = typedArray.getInteger(index, c39319ck2.f61149h);
                        break;
                    case 14:
                        c39319ck2.f61160s = typedArray.getFloat(index, c39319ck2.f61160s);
                        break;
                    case 15:
                        c39319ck2.f61161t = typedArray.getDimension(index, c39319ck2.f61161t);
                        break;
                    case 16:
                        c39319ck2.f61162u = typedArray.getDimension(index, c39319ck2.f61162u);
                        break;
                    case 17:
                        c39319ck2.f61163v = typedArray.getDimension(index, c39319ck2.f61163v);
                        break;
                    case 18:
                        c39319ck2.f61164w = typedArray.getFloat(index, c39319ck2.f61164w);
                        break;
                    case 19:
                        c39319ck2.f61156o = typedArray.getDimension(index, c39319ck2.f61156o);
                        break;
                    case 20:
                        c39319ck2.f61157p = typedArray.getDimension(index, c39319ck2.f61157p);
                        break;
                }
            }
        }
    }

    public C39319ck2() {
        this.f43733d = 1;
        this.f43734e = new HashMap<>();
    }

    /* renamed from: R */
    public void m60993R(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f61164w = m76527k(obj);
                return;
            case 1:
                this.f61148g = obj.toString();
                return;
            case 2:
                this.f61154m = m76527k(obj);
                return;
            case 3:
                this.f61155n = m76527k(obj);
                return;
            case 4:
                this.f61161t = m76527k(obj);
                return;
            case 5:
                this.f61162u = m76527k(obj);
                return;
            case 6:
                this.f61163v = m76527k(obj);
                return;
            case 7:
                this.f61159r = m76527k(obj);
                return;
            case '\b':
                this.f61160s = m76527k(obj);
                return;
            case '\t':
                this.f61156o = m76527k(obj);
                return;
            case '\n':
                this.f61157p = m76527k(obj);
                return;
            case 11:
                this.f61153l = m76527k(obj);
                return;
            case '\f':
                this.f61152k = m76527k(obj);
                return;
            case '\r':
                this.f61158q = m76527k(obj);
                return;
            case 14:
                this.f61151j = m76527k(obj);
                return;
            case 15:
                this.f61149h = m76526l(obj);
                return;
            case 16:
                this.f61150i = m76528j(obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // p000.AbstractC37078Xj2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo40951a(HashMap<String, AbstractC33194Gt6> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC33194Gt6 abstractC33194Gt6 = hashMap.get(next);
            if (abstractC33194Gt6 != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    C11512a c11512a = this.f43734e.get(next.substring(7));
                    if (c11512a != null) {
                        ((AbstractC33194Gt6.C2971b) abstractC33194Gt6).m104611i(this.f43730a, c11512a);
                    }
                } else {
                    switch (next.hashCode()) {
                        case -1249320806:
                            if (next.equals("rotationX")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320805:
                            if (next.equals("rotationY")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497657:
                            if (next.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (next.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (next.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (next.equals("progress")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            break;
                        case -760884510:
                            if (next.equals("transformPivotX")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -760884509:
                            if (next.equals("transformPivotY")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (next.equals("rotation")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.f61154m)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61154m);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.f61155n)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61155n);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.f61161t)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61161t);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.f61162u)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61162u);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.f61163v)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61163v);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.f61164w)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61164w);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.f61159r)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61159r);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.f61160s)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61160s);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.f61154m)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61156o);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.f61155n)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61157p);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.f61153l)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61153l);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.f61152k)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61152k);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.f61158q)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61158q);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.f61151j)) {
                                abstractC33194Gt6.mo77076c(this.f43730a, this.f61151j);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: b */
    public AbstractC37078Xj2 clone() {
        return new C39319ck2().mo40949c(this);
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: c */
    public AbstractC37078Xj2 mo40949c(AbstractC37078Xj2 abstractC37078Xj2) {
        super.mo40949c(abstractC37078Xj2);
        C39319ck2 c39319ck2 = (C39319ck2) abstractC37078Xj2;
        this.f61149h = c39319ck2.f61149h;
        this.f61150i = c39319ck2.f61150i;
        this.f61151j = c39319ck2.f61151j;
        this.f61152k = c39319ck2.f61152k;
        this.f61153l = c39319ck2.f61153l;
        this.f61154m = c39319ck2.f61154m;
        this.f61155n = c39319ck2.f61155n;
        this.f61156o = c39319ck2.f61156o;
        this.f61157p = c39319ck2.f61157p;
        this.f61158q = c39319ck2.f61158q;
        this.f61159r = c39319ck2.f61159r;
        this.f61160s = c39319ck2.f61160s;
        this.f61161t = c39319ck2.f61161t;
        this.f61162u = c39319ck2.f61162u;
        this.f61163v = c39319ck2.f61163v;
        this.f61164w = c39319ck2.f61164w;
        return this;
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: d */
    public void mo40948d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f61151j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f61152k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f61153l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f61154m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f61155n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f61156o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f61157p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f61161t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f61162u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f61163v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f61158q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f61159r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f61160s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f61164w)) {
            hashSet.add("progress");
        }
        if (this.f43734e.size() > 0) {
            Iterator<String> it = this.f43734e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: e */
    public void mo40947e(Context context, AttributeSet attributeSet) {
        C13660a.m60977a(this, context.obtainStyledAttributes(attributeSet, C39341cm4.KeyAttribute));
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: h */
    public void mo60992h(HashMap<String, Integer> hashMap) {
        if (this.f61149h == -1) {
            return;
        }
        if (!Float.isNaN(this.f61151j)) {
            hashMap.put("alpha", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61152k)) {
            hashMap.put("elevation", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61153l)) {
            hashMap.put("rotation", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61154m)) {
            hashMap.put("rotationX", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61155n)) {
            hashMap.put("rotationY", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61156o)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61157p)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61161t)) {
            hashMap.put("translationX", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61162u)) {
            hashMap.put("translationY", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61163v)) {
            hashMap.put("translationZ", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61158q)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61159r)) {
            hashMap.put("scaleX", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61160s)) {
            hashMap.put("scaleY", Integer.valueOf(this.f61149h));
        }
        if (!Float.isNaN(this.f61164w)) {
            hashMap.put("progress", Integer.valueOf(this.f61149h));
        }
        if (this.f43734e.size() > 0) {
            Iterator<String> it = this.f43734e.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.f61149h));
            }
        }
    }
}
