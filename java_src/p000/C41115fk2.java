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
/* renamed from: fk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41115fk2 extends AbstractC37078Xj2 {

    /* renamed from: g */
    public String f80510g = null;

    /* renamed from: h */
    public int f80511h = 0;

    /* renamed from: i */
    public int f80512i = -1;

    /* renamed from: j */
    public String f80513j = null;

    /* renamed from: k */
    public float f80514k = Float.NaN;

    /* renamed from: l */
    public float f80515l = 0.0f;

    /* renamed from: m */
    public float f80516m = 0.0f;

    /* renamed from: n */
    public float f80517n = Float.NaN;

    /* renamed from: o */
    public int f80518o = -1;

    /* renamed from: p */
    public float f80519p = Float.NaN;

    /* renamed from: q */
    public float f80520q = Float.NaN;

    /* renamed from: r */
    public float f80521r = Float.NaN;

    /* renamed from: s */
    public float f80522s = Float.NaN;

    /* renamed from: t */
    public float f80523t = Float.NaN;

    /* renamed from: u */
    public float f80524u = Float.NaN;

    /* renamed from: v */
    public float f80525v = Float.NaN;

    /* renamed from: w */
    public float f80526w = Float.NaN;

    /* renamed from: x */
    public float f80527x = Float.NaN;

    /* renamed from: y */
    public float f80528y = Float.NaN;

    /* renamed from: z */
    public float f80529z = Float.NaN;

    /* renamed from: fk2$a */
    /* loaded from: classes.dex */
    public static class C20498a {

        /* renamed from: a */
        public static SparseIntArray f80530a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f80530a = sparseIntArray;
            sparseIntArray.append(C39341cm4.KeyCycle_motionTarget, 1);
            f80530a.append(C39341cm4.KeyCycle_framePosition, 2);
            f80530a.append(C39341cm4.KeyCycle_transitionEasing, 3);
            f80530a.append(C39341cm4.KeyCycle_curveFit, 4);
            f80530a.append(C39341cm4.KeyCycle_waveShape, 5);
            f80530a.append(C39341cm4.KeyCycle_wavePeriod, 6);
            f80530a.append(C39341cm4.KeyCycle_waveOffset, 7);
            f80530a.append(C39341cm4.KeyCycle_waveVariesBy, 8);
            f80530a.append(C39341cm4.KeyCycle_android_alpha, 9);
            f80530a.append(C39341cm4.KeyCycle_android_elevation, 10);
            f80530a.append(C39341cm4.KeyCycle_android_rotation, 11);
            f80530a.append(C39341cm4.KeyCycle_android_rotationX, 12);
            f80530a.append(C39341cm4.KeyCycle_android_rotationY, 13);
            f80530a.append(C39341cm4.KeyCycle_transitionPathRotate, 14);
            f80530a.append(C39341cm4.KeyCycle_android_scaleX, 15);
            f80530a.append(C39341cm4.KeyCycle_android_scaleY, 16);
            f80530a.append(C39341cm4.KeyCycle_android_translationX, 17);
            f80530a.append(C39341cm4.KeyCycle_android_translationY, 18);
            f80530a.append(C39341cm4.KeyCycle_android_translationZ, 19);
            f80530a.append(C39341cm4.KeyCycle_motionProgress, 20);
            f80530a.append(C39341cm4.KeyCycle_wavePhase, 21);
        }

        private C20498a() {
        }

        /* renamed from: b */
        public static void m40931b(C41115fk2 c41115fk2, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f80530a.get(index)) {
                    case 1:
                        if (MotionLayout.f53557Y0) {
                            int resourceId = typedArray.getResourceId(index, c41115fk2.f43731b);
                            c41115fk2.f43731b = resourceId;
                            if (resourceId == -1) {
                                c41115fk2.f43732c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c41115fk2.f43732c = typedArray.getString(index);
                            break;
                        } else {
                            c41115fk2.f43731b = typedArray.getResourceId(index, c41115fk2.f43731b);
                            break;
                        }
                    case 2:
                        c41115fk2.f43730a = typedArray.getInt(index, c41115fk2.f43730a);
                        break;
                    case 3:
                        c41115fk2.f80510g = typedArray.getString(index);
                        break;
                    case 4:
                        c41115fk2.f80511h = typedArray.getInteger(index, c41115fk2.f80511h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            c41115fk2.f80513j = typedArray.getString(index);
                            c41115fk2.f80512i = 7;
                            break;
                        } else {
                            c41115fk2.f80512i = typedArray.getInt(index, c41115fk2.f80512i);
                            break;
                        }
                    case 6:
                        c41115fk2.f80514k = typedArray.getFloat(index, c41115fk2.f80514k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            c41115fk2.f80515l = typedArray.getDimension(index, c41115fk2.f80515l);
                            break;
                        } else {
                            c41115fk2.f80515l = typedArray.getFloat(index, c41115fk2.f80515l);
                            break;
                        }
                    case 8:
                        c41115fk2.f80518o = typedArray.getInt(index, c41115fk2.f80518o);
                        break;
                    case 9:
                        c41115fk2.f80519p = typedArray.getFloat(index, c41115fk2.f80519p);
                        break;
                    case 10:
                        c41115fk2.f80520q = typedArray.getDimension(index, c41115fk2.f80520q);
                        break;
                    case 11:
                        c41115fk2.f80521r = typedArray.getFloat(index, c41115fk2.f80521r);
                        break;
                    case 12:
                        c41115fk2.f80523t = typedArray.getFloat(index, c41115fk2.f80523t);
                        break;
                    case 13:
                        c41115fk2.f80524u = typedArray.getFloat(index, c41115fk2.f80524u);
                        break;
                    case 14:
                        c41115fk2.f80522s = typedArray.getFloat(index, c41115fk2.f80522s);
                        break;
                    case 15:
                        c41115fk2.f80525v = typedArray.getFloat(index, c41115fk2.f80525v);
                        break;
                    case 16:
                        c41115fk2.f80526w = typedArray.getFloat(index, c41115fk2.f80526w);
                        break;
                    case 17:
                        c41115fk2.f80527x = typedArray.getDimension(index, c41115fk2.f80527x);
                        break;
                    case 18:
                        c41115fk2.f80528y = typedArray.getDimension(index, c41115fk2.f80528y);
                        break;
                    case 19:
                        c41115fk2.f80529z = typedArray.getDimension(index, c41115fk2.f80529z);
                        break;
                    case 20:
                        c41115fk2.f80517n = typedArray.getFloat(index, c41115fk2.f80517n);
                        break;
                    case 21:
                        c41115fk2.f80516m = typedArray.getFloat(index, c41115fk2.f80516m) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f80530a.get(index));
                        break;
                }
            }
        }
    }

    public C41115fk2() {
        this.f43733d = 4;
        this.f43734e = new HashMap<>();
    }

    /* renamed from: Y */
    public void m40953Y(HashMap<String, AbstractC50685vs6> hashMap) {
        AbstractC50685vs6 abstractC50685vs6;
        AbstractC50685vs6 abstractC50685vs62;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C11512a c11512a = this.f43734e.get(str.substring(7));
                if (c11512a != null && c11512a.m67858d() == C11512a.EnumC11514b.FLOAT_TYPE && (abstractC50685vs6 = hashMap.get(str)) != null) {
                    abstractC50685vs6.m37768e(this.f43730a, this.f80512i, this.f80513j, this.f80518o, this.f80514k, this.f80515l, this.f80516m, c11512a.m67857e(), c11512a);
                }
            } else {
                float m40952Z = m40952Z(str);
                if (!Float.isNaN(m40952Z) && (abstractC50685vs62 = hashMap.get(str)) != null) {
                    abstractC50685vs62.m37769d(this.f43730a, this.f80512i, this.f80513j, this.f80518o, this.f80514k, this.f80515l, this.f80516m, m40952Z);
                }
            }
        }
    }

    /* renamed from: Z */
    public float m40952Z(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f80523t;
            case 1:
                return this.f80524u;
            case 2:
                return this.f80527x;
            case 3:
                return this.f80528y;
            case 4:
                return this.f80529z;
            case 5:
                return this.f80517n;
            case 6:
                return this.f80525v;
            case 7:
                return this.f80526w;
            case '\b':
                return this.f80521r;
            case '\t':
                return this.f80520q;
            case '\n':
                return this.f80522s;
            case 11:
                return this.f80519p;
            case '\f':
                return this.f80515l;
            case '\r':
                return this.f80516m;
            default:
                if (!str.startsWith("CUSTOM")) {
                    Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                    return Float.NaN;
                }
                return Float.NaN;
        }
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: a */
    public void mo40951a(HashMap<String, AbstractC33194Gt6> hashMap) {
        FU0.m107114g("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            AbstractC33194Gt6 abstractC33194Gt6 = hashMap.get(str);
            if (abstractC33194Gt6 != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80523t);
                        continue;
                    case 1:
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80524u);
                        continue;
                    case 2:
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80527x);
                        continue;
                    case 3:
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80528y);
                        continue;
                    case 4:
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80529z);
                        continue;
                    case 5:
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80517n);
                        continue;
                    case 6:
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80525v);
                        continue;
                    case 7:
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80526w);
                        continue;
                    case '\b':
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80521r);
                        continue;
                    case '\t':
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80520q);
                        continue;
                    case '\n':
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80522s);
                        continue;
                    case 11:
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80519p);
                        continue;
                    case '\f':
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80515l);
                        continue;
                    case '\r':
                        abstractC33194Gt6.mo77076c(this.f43730a, this.f80516m);
                        continue;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: b */
    public AbstractC37078Xj2 clone() {
        return new C41115fk2().mo40949c(this);
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: c */
    public AbstractC37078Xj2 mo40949c(AbstractC37078Xj2 abstractC37078Xj2) {
        super.mo40949c(abstractC37078Xj2);
        C41115fk2 c41115fk2 = (C41115fk2) abstractC37078Xj2;
        this.f80510g = c41115fk2.f80510g;
        this.f80511h = c41115fk2.f80511h;
        this.f80512i = c41115fk2.f80512i;
        this.f80513j = c41115fk2.f80513j;
        this.f80514k = c41115fk2.f80514k;
        this.f80515l = c41115fk2.f80515l;
        this.f80516m = c41115fk2.f80516m;
        this.f80517n = c41115fk2.f80517n;
        this.f80518o = c41115fk2.f80518o;
        this.f80519p = c41115fk2.f80519p;
        this.f80520q = c41115fk2.f80520q;
        this.f80521r = c41115fk2.f80521r;
        this.f80522s = c41115fk2.f80522s;
        this.f80523t = c41115fk2.f80523t;
        this.f80524u = c41115fk2.f80524u;
        this.f80525v = c41115fk2.f80525v;
        this.f80526w = c41115fk2.f80526w;
        this.f80527x = c41115fk2.f80527x;
        this.f80528y = c41115fk2.f80528y;
        this.f80529z = c41115fk2.f80529z;
        return this;
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: d */
    public void mo40948d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f80519p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f80520q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f80521r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f80523t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f80524u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f80525v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f80526w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f80522s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f80527x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f80528y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f80529z)) {
            hashSet.add("translationZ");
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
        C20498a.m40931b(this, context.obtainStyledAttributes(attributeSet, C39341cm4.KeyCycle));
    }
}
