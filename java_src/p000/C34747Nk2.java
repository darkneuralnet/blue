package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C11512a;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* renamed from: Nk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34747Nk2 extends AbstractC37078Xj2 {

    /* renamed from: A */
    public HashMap<String, Method> f25062A;

    /* renamed from: g */
    public int f25063g = -1;

    /* renamed from: h */
    public String f25064h = null;

    /* renamed from: i */
    public int f25065i;

    /* renamed from: j */
    public String f25066j;

    /* renamed from: k */
    public String f25067k;

    /* renamed from: l */
    public int f25068l;

    /* renamed from: m */
    public int f25069m;

    /* renamed from: n */
    public View f25070n;

    /* renamed from: o */
    public float f25071o;

    /* renamed from: p */
    public boolean f25072p;

    /* renamed from: q */
    public boolean f25073q;

    /* renamed from: r */
    public boolean f25074r;

    /* renamed from: s */
    public float f25075s;

    /* renamed from: t */
    public float f25076t;

    /* renamed from: u */
    public boolean f25077u;

    /* renamed from: v */
    public int f25078v;

    /* renamed from: w */
    public int f25079w;

    /* renamed from: x */
    public int f25080x;

    /* renamed from: y */
    public RectF f25081y;

    /* renamed from: z */
    public RectF f25082z;

    /* renamed from: Nk2$a */
    /* loaded from: classes.dex */
    public static class C5666a {

        /* renamed from: a */
        public static SparseIntArray f25083a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f25083a = sparseIntArray;
            sparseIntArray.append(C39341cm4.KeyTrigger_framePosition, 8);
            f25083a.append(C39341cm4.KeyTrigger_onCross, 4);
            f25083a.append(C39341cm4.KeyTrigger_onNegativeCross, 1);
            f25083a.append(C39341cm4.KeyTrigger_onPositiveCross, 2);
            f25083a.append(C39341cm4.KeyTrigger_motionTarget, 7);
            f25083a.append(C39341cm4.KeyTrigger_triggerId, 6);
            f25083a.append(C39341cm4.KeyTrigger_triggerSlack, 5);
            f25083a.append(C39341cm4.KeyTrigger_motion_triggerOnCollision, 9);
            f25083a.append(C39341cm4.KeyTrigger_motion_postLayoutCollision, 10);
            f25083a.append(C39341cm4.KeyTrigger_triggerReceiver, 11);
            f25083a.append(C39341cm4.KeyTrigger_viewTransitionOnCross, 12);
            f25083a.append(C39341cm4.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f25083a.append(C39341cm4.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        private C5666a() {
        }

        /* renamed from: a */
        public static void m93500a(C34747Nk2 c34747Nk2, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f25083a.get(index)) {
                    case 1:
                        c34747Nk2.f25066j = typedArray.getString(index);
                        break;
                    case 2:
                        c34747Nk2.f25067k = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f25083a.get(index));
                        break;
                    case 4:
                        c34747Nk2.f25064h = typedArray.getString(index);
                        break;
                    case 5:
                        c34747Nk2.f25071o = typedArray.getFloat(index, c34747Nk2.f25071o);
                        break;
                    case 6:
                        c34747Nk2.f25068l = typedArray.getResourceId(index, c34747Nk2.f25068l);
                        break;
                    case 7:
                        if (MotionLayout.f53557Y0) {
                            int resourceId = typedArray.getResourceId(index, c34747Nk2.f43731b);
                            c34747Nk2.f43731b = resourceId;
                            if (resourceId == -1) {
                                c34747Nk2.f43732c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c34747Nk2.f43732c = typedArray.getString(index);
                            break;
                        } else {
                            c34747Nk2.f43731b = typedArray.getResourceId(index, c34747Nk2.f43731b);
                            break;
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, c34747Nk2.f43730a);
                        c34747Nk2.f43730a = integer;
                        c34747Nk2.f25075s = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c34747Nk2.f25069m = typedArray.getResourceId(index, c34747Nk2.f25069m);
                        break;
                    case 10:
                        c34747Nk2.f25077u = typedArray.getBoolean(index, c34747Nk2.f25077u);
                        break;
                    case 11:
                        c34747Nk2.f25065i = typedArray.getResourceId(index, c34747Nk2.f25065i);
                        break;
                    case 12:
                        c34747Nk2.f25080x = typedArray.getResourceId(index, c34747Nk2.f25080x);
                        break;
                    case 13:
                        c34747Nk2.f25078v = typedArray.getResourceId(index, c34747Nk2.f25078v);
                        break;
                    case 14:
                        c34747Nk2.f25079w = typedArray.getResourceId(index, c34747Nk2.f25079w);
                        break;
                }
            }
        }
    }

    public C34747Nk2() {
        int i = AbstractC37078Xj2.f43729f;
        this.f25065i = i;
        this.f25066j = null;
        this.f25067k = null;
        this.f25068l = i;
        this.f25069m = i;
        this.f25070n = null;
        this.f25071o = 0.1f;
        this.f25072p = true;
        this.f25073q = true;
        this.f25074r = true;
        this.f25075s = Float.NaN;
        this.f25077u = false;
        this.f25078v = i;
        this.f25079w = i;
        this.f25080x = i;
        this.f25081y = new RectF();
        this.f25082z = new RectF();
        this.f25062A = new HashMap<>();
        this.f43733d = 5;
        this.f43734e = new HashMap<>();
    }

    /* renamed from: A */
    public final void m93516A(String str, View view) {
        boolean z;
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f43734e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                C11512a c11512a = this.f43734e.get(str2);
                if (c11512a != null) {
                    c11512a.m67861a(view);
                }
            }
        }
    }

    /* renamed from: B */
    public final void m93515B(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: a */
    public void mo40951a(HashMap<String, AbstractC33194Gt6> hashMap) {
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: b */
    public AbstractC37078Xj2 clone() {
        return new C34747Nk2().mo40949c(this);
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: c */
    public AbstractC37078Xj2 mo40949c(AbstractC37078Xj2 abstractC37078Xj2) {
        super.mo40949c(abstractC37078Xj2);
        C34747Nk2 c34747Nk2 = (C34747Nk2) abstractC37078Xj2;
        this.f25063g = c34747Nk2.f25063g;
        this.f25064h = c34747Nk2.f25064h;
        this.f25065i = c34747Nk2.f25065i;
        this.f25066j = c34747Nk2.f25066j;
        this.f25067k = c34747Nk2.f25067k;
        this.f25068l = c34747Nk2.f25068l;
        this.f25069m = c34747Nk2.f25069m;
        this.f25070n = c34747Nk2.f25070n;
        this.f25071o = c34747Nk2.f25071o;
        this.f25072p = c34747Nk2.f25072p;
        this.f25073q = c34747Nk2.f25073q;
        this.f25074r = c34747Nk2.f25074r;
        this.f25075s = c34747Nk2.f25075s;
        this.f25076t = c34747Nk2.f25076t;
        this.f25077u = c34747Nk2.f25077u;
        this.f25081y = c34747Nk2.f25081y;
        this.f25082z = c34747Nk2.f25082z;
        this.f25062A = c34747Nk2.f25062A;
        return this;
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: d */
    public void mo40948d(HashSet<String> hashSet) {
    }

    @Override // p000.AbstractC37078Xj2
    /* renamed from: e */
    public void mo40947e(Context context, AttributeSet attributeSet) {
        C5666a.m93500a(this, context.obtainStyledAttributes(attributeSet, C39341cm4.KeyTrigger), context);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m93502y(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        View findViewById;
        boolean z6;
        if (this.f25069m != AbstractC37078Xj2.f43729f) {
            if (this.f25070n == null) {
                this.f25070n = ((ViewGroup) view.getParent()).findViewById(this.f25069m);
            }
            m93515B(this.f25081y, this.f25070n, this.f25077u);
            m93515B(this.f25082z, view, this.f25077u);
            if (this.f25081y.intersect(this.f25082z)) {
                if (this.f25072p) {
                    this.f25072p = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f25074r) {
                    this.f25074r = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f25073q = true;
                z5 = z6;
                z3 = false;
            } else {
                if (!this.f25072p) {
                    this.f25072p = true;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f25073q) {
                    this.f25073q = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f25074r = true;
                z5 = false;
            }
        } else {
            if (this.f25072p) {
                float f2 = this.f25075s;
                if ((f - f2) * (this.f25076t - f2) < 0.0f) {
                    this.f25072p = false;
                    z = true;
                    if (!this.f25073q) {
                        float f3 = this.f25075s;
                        float f4 = f - f3;
                        if ((this.f25076t - f3) * f4 < 0.0f && f4 < 0.0f) {
                            this.f25073q = false;
                            z2 = true;
                            if (this.f25074r) {
                                float f5 = this.f25075s;
                                float f6 = f - f5;
                                if ((this.f25076t - f5) * f6 < 0.0f && f6 > 0.0f) {
                                    this.f25074r = false;
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                boolean z7 = z2;
                                z5 = z4;
                                z3 = z7;
                            } else {
                                if (Math.abs(f - this.f25075s) > this.f25071o) {
                                    this.f25074r = true;
                                }
                                z3 = z2;
                                z5 = false;
                            }
                        }
                    } else if (Math.abs(f - this.f25075s) > this.f25071o) {
                        this.f25073q = true;
                    }
                    z2 = false;
                    if (this.f25074r) {
                    }
                }
            } else if (Math.abs(f - this.f25075s) > this.f25071o) {
                this.f25072p = true;
            }
            z = false;
            if (!this.f25073q) {
            }
            z2 = false;
            if (this.f25074r) {
            }
        }
        this.f25076t = f;
        if (z3 || z || z5) {
            ((MotionLayout) view.getParent()).m68184O(this.f25068l, z5, f);
        }
        if (this.f25065i == AbstractC37078Xj2.f43729f) {
            findViewById = view;
        } else {
            findViewById = ((MotionLayout) view.getParent()).findViewById(this.f25065i);
        }
        if (z3) {
            String str = this.f25066j;
            if (str != null) {
                m93501z(str, findViewById);
            }
            if (this.f25078v != AbstractC37078Xj2.f43729f) {
                ((MotionLayout) view.getParent()).m68134w0(this.f25078v, findViewById);
            }
        }
        if (z5) {
            String str2 = this.f25067k;
            if (str2 != null) {
                m93501z(str2, findViewById);
            }
            if (this.f25079w != AbstractC37078Xj2.f43729f) {
                ((MotionLayout) view.getParent()).m68134w0(this.f25079w, findViewById);
            }
        }
        if (z) {
            String str3 = this.f25064h;
            if (str3 != null) {
                m93501z(str3, findViewById);
            }
            if (this.f25080x != AbstractC37078Xj2.f43729f) {
                ((MotionLayout) view.getParent()).m68134w0(this.f25080x, findViewById);
            }
        }
    }

    /* renamed from: z */
    public final void m93501z(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(InstructionFileId.DOT)) {
            m93516A(str, view);
            return;
        }
        if (this.f25062A.containsKey(str)) {
            method = this.f25062A.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.f25062A.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f25062A.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + FU0.m107117d(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f25064h + "\"on class " + view.getClass().getSimpleName() + " " + FU0.m107117d(view));
        }
    }
}
