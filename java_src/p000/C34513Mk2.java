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
import p000.AbstractC34364Lt6;
/* renamed from: Mk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34513Mk2 extends AbstractC37078Xj2 {

    /* renamed from: g */
    public String f23472g;

    /* renamed from: h */
    public int f23473h = -1;

    /* renamed from: i */
    public float f23474i = Float.NaN;

    /* renamed from: j */
    public float f23475j = Float.NaN;

    /* renamed from: k */
    public float f23476k = Float.NaN;

    /* renamed from: l */
    public float f23477l = Float.NaN;

    /* renamed from: m */
    public float f23478m = Float.NaN;

    /* renamed from: n */
    public float f23479n = Float.NaN;

    /* renamed from: o */
    public float f23480o = Float.NaN;

    /* renamed from: p */
    public float f23481p = Float.NaN;

    /* renamed from: q */
    public float f23482q = Float.NaN;

    /* renamed from: r */
    public float f23483r = Float.NaN;

    /* renamed from: s */
    public float f23484s = Float.NaN;

    /* renamed from: t */
    public float f23485t = Float.NaN;

    /* renamed from: u */
    public int f23486u = 0;

    /* renamed from: v */
    public String f23487v = null;

    /* renamed from: w */
    public float f23488w = Float.NaN;

    /* renamed from: x */
    public float f23489x = 0.0f;

    /* renamed from: Mk2$a */
    /* loaded from: classes.dex */
    public static class C5355a {

        /* renamed from: a */
        public static SparseIntArray f23490a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f23490a = sparseIntArray;
            sparseIntArray.append(C39341cm4.KeyTimeCycle_android_alpha, 1);
            f23490a.append(C39341cm4.KeyTimeCycle_android_elevation, 2);
            f23490a.append(C39341cm4.KeyTimeCycle_android_rotation, 4);
            f23490a.append(C39341cm4.KeyTimeCycle_android_rotationX, 5);
            f23490a.append(C39341cm4.KeyTimeCycle_android_rotationY, 6);
            f23490a.append(C39341cm4.KeyTimeCycle_android_scaleX, 7);
            f23490a.append(C39341cm4.KeyTimeCycle_transitionPathRotate, 8);
            f23490a.append(C39341cm4.KeyTimeCycle_transitionEasing, 9);
            f23490a.append(C39341cm4.KeyTimeCycle_motionTarget, 10);
            f23490a.append(C39341cm4.KeyTimeCycle_framePosition, 12);
            f23490a.append(C39341cm4.KeyTimeCycle_curveFit, 13);
            f23490a.append(C39341cm4.KeyTimeCycle_android_scaleY, 14);
            f23490a.append(C39341cm4.KeyTimeCycle_android_translationX, 15);
            f23490a.append(C39341cm4.KeyTimeCycle_android_translationY, 16);
            f23490a.append(C39341cm4.KeyTimeCycle_android_translationZ, 17);
            f23490a.append(C39341cm4.KeyTimeCycle_motionProgress, 18);
            f23490a.append(C39341cm4.KeyTimeCycle_wavePeriod, 20);
            f23490a.append(C39341cm4.KeyTimeCycle_waveOffset, 21);
            f23490a.append(C39341cm4.KeyTimeCycle_waveShape, 19);
        }

        private C5355a() {
        }

        /* renamed from: a */
        public static void m94923a(C34513Mk2 c34513Mk2, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f23490a.get(index)) {
                    case 1:
                        c34513Mk2.f23474i = typedArray.getFloat(index, c34513Mk2.f23474i);
                        break;
                    case 2:
                        c34513Mk2.f23475j = typedArray.getDimension(index, c34513Mk2.f23475j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f23490a.get(index));
                        break;
                    case 4:
                        c34513Mk2.f23476k = typedArray.getFloat(index, c34513Mk2.f23476k);
                        break;
                    case 5:
                        c34513Mk2.f23477l = typedArray.getFloat(index, c34513Mk2.f23477l);
                        break;
                    case 6:
                        c34513Mk2.f23478m = typedArray.getFloat(index, c34513Mk2.f23478m);
                        break;
                    case 7:
                        c34513Mk2.f23480o = typedArray.getFloat(index, c34513Mk2.f23480o);
                        break;
                    case 8:
                        c34513Mk2.f23479n = typedArray.getFloat(index, c34513Mk2.f23479n);
                        break;
                    case 9:
                        c34513Mk2.f23472g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f53557Y0) {
                            int resourceId = typedArray.getResourceId(index, c34513Mk2.f43731b);
                            c34513Mk2.f43731b = resourceId;
                            if (resourceId == -1) {
                                c34513Mk2.f43732c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c34513Mk2.f43732c = typedArray.getString(index);
                            break;
                        } else {
                            c34513Mk2.f43731b = typedArray.getResourceId(index, c34513Mk2.f43731b);
                            break;
                        }
                    case 12:
                        c34513Mk2.f43730a = typedArray.getInt(index, c34513Mk2.f43730a);
                        break;
                    case 13:
                        c34513Mk2.f23473h = typedArray.getInteger(index, c34513Mk2.f23473h);
                        break;
                    case 14:
                        c34513Mk2.f23481p = typedArray.getFloat(index, c34513Mk2.f23481p);
                        break;
                    case 15:
                        c34513Mk2.f23482q = typedArray.getDimension(index, c34513Mk2.f23482q);
                        break;
                    case 16:
                        c34513Mk2.f23483r = typedArray.getDimension(index, c34513Mk2.f23483r);
                        break;
                    case 17:
                        c34513Mk2.f23484s = typedArray.getDimension(index, c34513Mk2.f23484s);
                        break;
                    case 18:
                        c34513Mk2.f23485t = typedArray.getFloat(index, c34513Mk2.f23485t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            c34513Mk2.f23487v = typedArray.getString(index);
                            c34513Mk2.f23486u = 7;
                            break;
                        } else {
                            c34513Mk2.f23486u = typedArray.getInt(index, c34513Mk2.f23486u);
                            break;
                        }
                    case 20:
                        c34513Mk2.f23488w = typedArray.getFloat(index, c34513Mk2.f23488w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            c34513Mk2.f23489x = typedArray.getDimension(index, c34513Mk2.f23489x);
                            break;
                        } else {
                            c34513Mk2.f23489x = typedArray.getFloat(index, c34513Mk2.f23489x);
                            break;
                        }
                }
            }
        }
    }

    public C34513Mk2() {
        this.f43733d = 3;
        this.f43734e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m94938U(HashMap<String, AbstractC34364Lt6> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC34364Lt6 abstractC34364Lt6 = hashMap.get(next);
            if (abstractC34364Lt6 != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    C11512a c11512a = this.f43734e.get(next.substring(7));
                    if (c11512a != null) {
                        ((AbstractC34364Lt6.C5111b) abstractC34364Lt6).m96237j(this.f43730a, c11512a, this.f23488w, this.f23486u, this.f23489x);
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
                        case -40300674:
                            if (next.equals("rotation")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = 11;
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
                            if (!Float.isNaN(this.f23477l)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23477l, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.f23478m)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23478m, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.f23482q)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23482q, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.f23483r)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23483r, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.f23484s)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23484s, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.f23485t)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23485t, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.f23480o)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23480o, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.f23481p)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23481p, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.f23476k)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23476k, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.f23475j)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23475j, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.f23479n)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23479n, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.f23474i)) {
                                abstractC34364Lt6.mo34499b(this.f43730a, this.f23474i, this.f23488w, this.f23486u, this.f23489x);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + next + "\"");
                            continue;
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: a */
    public void mo40951a(HashMap<String, AbstractC33194Gt6> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: b */
    public AbstractC37078Xj2 clone() {
        return new C34513Mk2().mo40949c(this);
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: c */
    public AbstractC37078Xj2 mo40949c(AbstractC37078Xj2 abstractC37078Xj2) {
        super.mo40949c(abstractC37078Xj2);
        C34513Mk2 c34513Mk2 = (C34513Mk2) abstractC37078Xj2;
        this.f23472g = c34513Mk2.f23472g;
        this.f23473h = c34513Mk2.f23473h;
        this.f23486u = c34513Mk2.f23486u;
        this.f23488w = c34513Mk2.f23488w;
        this.f23489x = c34513Mk2.f23489x;
        this.f23485t = c34513Mk2.f23485t;
        this.f23474i = c34513Mk2.f23474i;
        this.f23475j = c34513Mk2.f23475j;
        this.f23476k = c34513Mk2.f23476k;
        this.f23479n = c34513Mk2.f23479n;
        this.f23477l = c34513Mk2.f23477l;
        this.f23478m = c34513Mk2.f23478m;
        this.f23480o = c34513Mk2.f23480o;
        this.f23481p = c34513Mk2.f23481p;
        this.f23482q = c34513Mk2.f23482q;
        this.f23483r = c34513Mk2.f23483r;
        this.f23484s = c34513Mk2.f23484s;
        return this;
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: d */
    public void mo40948d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f23474i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f23475j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f23476k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f23477l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f23478m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f23482q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f23483r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f23484s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f23479n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f23480o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f23481p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f23485t)) {
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
        C5355a.m94923a(this, context.obtainStyledAttributes(attributeSet, C39341cm4.KeyTimeCycle));
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: h */
    public void mo60992h(HashMap<String, Integer> hashMap) {
        if (this.f23473h == -1) {
            return;
        }
        if (!Float.isNaN(this.f23474i)) {
            hashMap.put("alpha", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23475j)) {
            hashMap.put("elevation", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23476k)) {
            hashMap.put("rotation", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23477l)) {
            hashMap.put("rotationX", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23478m)) {
            hashMap.put("rotationY", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23482q)) {
            hashMap.put("translationX", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23483r)) {
            hashMap.put("translationY", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23484s)) {
            hashMap.put("translationZ", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23479n)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23480o)) {
            hashMap.put("scaleX", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23480o)) {
            hashMap.put("scaleY", Integer.valueOf(this.f23473h));
        }
        if (!Float.isNaN(this.f23485t)) {
            hashMap.put("progress", Integer.valueOf(this.f23473h));
        }
        if (this.f43734e.size() > 0) {
            Iterator<String> it = this.f43734e.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.f23473h));
            }
        }
    }
}
