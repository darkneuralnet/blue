package p000;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010\"J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR \u0010#\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, m28432d2 = {"LRV2;", "", "Landroid/view/MotionEvent;", "motionEvent", "LDY3;", "positionCalculator", "LlX3;", "c", "(Landroid/view/MotionEvent;LDY3;)LlX3;", "", "pointerId", "", "e", C17296a.f69688o, "h", "", "g", "motionEventPointerId", "LiX3;", "f", "(I)J", "b", "index", "pressed", "LmX3;", DateTokenConverter.CONVERTER_KEY, "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "()V", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "canHover", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RV2 */
/* loaded from: classes.dex */
public final class RV2 {

    /* renamed from: a */
    public long f32115a;

    /* renamed from: b */
    public final SparseLongArray f32116b = new SparseLongArray();

    /* renamed from: c */
    public final SparseBooleanArray f32117c = new SparseBooleanArray();

    /* renamed from: d */
    public final List<C45140mX3> f32118d = new ArrayList();

    /* renamed from: e */
    public int f32119e = -1;

    /* renamed from: f */
    public int f32120f = -1;

    /* renamed from: a */
    public final void m86694a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (this.f32116b.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.f32116b;
                    long j = this.f32115a;
                    this.f32115a = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f32116b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f32116b;
            long j2 = this.f32115a;
            this.f32115a = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f32117c.put(pointerId2, true);
            }
        }
    }

    /* renamed from: b */
    public final void m86693b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType != this.f32119e || source != this.f32120f) {
            this.f32119e = toolType;
            this.f32120f = source;
            this.f32117c.clear();
            this.f32116b.clear();
        }
    }

    /* renamed from: c */
    public final C44547lX3 m86692c(MotionEvent motionEvent, DY3 positionCalculator) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f32116b.clear();
            this.f32117c.clear();
            return null;
        }
        m86693b(motionEvent);
        m86694a(motionEvent);
        if (actionMasked != 10 && actionMasked != 7 && actionMasked != 9) {
            z = false;
        } else {
            z = true;
        }
        if (actionMasked == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.f32117c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                i = -1;
            } else {
                i = motionEvent.getActionIndex();
            }
        } else {
            i = 0;
        }
        this.f32118d.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            List<C45140mX3> list = this.f32118d;
            if (!z && i2 != i && (!z2 || motionEvent.getButtonState() != 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            list.add(m86691d(positionCalculator, motionEvent, i2, z3));
        }
        m86687h(motionEvent);
        return new C44547lX3(motionEvent.getEventTime(), this.f32118d, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C45140mX3 m86691d(DY3 dy3, MotionEvent motionEvent, int i, boolean z) {
        long j;
        long mo68594S;
        long m79839a;
        long mo68558q;
        int toolType;
        int m3348e;
        int historySize;
        int i2;
        long m111932c;
        boolean z2;
        boolean z3;
        long m86689f = m86689f(motionEvent.getPointerId(i));
        float pressure = motionEvent.getPressure(i);
        long m104938a = C33056Ge3.m104938a(motionEvent.getX(i), motionEvent.getY(i));
        if (i == 0) {
            m79839a = C33056Ge3.m104938a(motionEvent.getRawX(), motionEvent.getRawY());
            mo68558q = dy3.mo68558q(m79839a);
        } else if (Build.VERSION.SDK_INT >= 29) {
            m79839a = VV2.f39170a.m79839a(motionEvent, i);
            mo68558q = dy3.mo68558q(m79839a);
        } else {
            j = m104938a;
            mo68594S = dy3.mo68594S(m104938a);
            toolType = motionEvent.getToolType(i);
            if (toolType == 0) {
                if (toolType != 1) {
                    if (toolType != 2) {
                        if (toolType != 3) {
                            if (toolType != 4) {
                                m3348e = C52254yX3.f119686a.m3348e();
                            } else {
                                m3348e = C52254yX3.f119686a.m3352a();
                            }
                        } else {
                            m3348e = C52254yX3.f119686a.m3351b();
                        }
                    } else {
                        m3348e = C52254yX3.f119686a.m3350c();
                    }
                } else {
                    m3348e = C52254yX3.f119686a.m3349d();
                }
            } else {
                m3348e = C52254yX3.f119686a.m3348e();
            }
            int i3 = m3348e;
            ArrayList arrayList = new ArrayList();
            historySize = motionEvent.getHistorySize();
            for (i2 = 0; i2 < historySize; i2++) {
                float historicalX = motionEvent.getHistoricalX(i, i2);
                float historicalY = motionEvent.getHistoricalY(i, i2);
                if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (!Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        arrayList.add(new PM1(motionEvent.getHistoricalEventTime(i2), C33056Ge3.m104938a(historicalX, historicalY), null));
                    }
                }
            }
            if (motionEvent.getActionMasked() != 8) {
                m111932c = C33056Ge3.m104938a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
            } else {
                m111932c = C32120Ce3.f4427b.m111932c();
            }
            long j2 = m111932c;
            return new C45140mX3(m86689f, motionEvent.getEventTime(), mo68594S, j, z, pressure, i3, this.f32117c.get(motionEvent.getPointerId(i), false), arrayList, j2, null);
        }
        mo68594S = m79839a;
        j = mo68558q;
        toolType = motionEvent.getToolType(i);
        if (toolType == 0) {
        }
        int i32 = m3348e;
        ArrayList arrayList2 = new ArrayList();
        historySize = motionEvent.getHistorySize();
        while (i2 < historySize) {
        }
        if (motionEvent.getActionMasked() != 8) {
        }
        long j22 = m111932c;
        return new C45140mX3(m86689f, motionEvent.getEventTime(), mo68594S, j, z, pressure, i32, this.f32117c.get(motionEvent.getPointerId(i), false), arrayList2, j22, null);
    }

    /* renamed from: e */
    public final void m86690e(int i) {
        this.f32117c.delete(i);
        this.f32116b.delete(i);
    }

    /* renamed from: f */
    public final long m86689f(int i) {
        long j;
        int indexOfKey = this.f32116b.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.f32116b.valueAt(indexOfKey);
        } else {
            j = this.f32115a;
            this.f32115a = 1 + j;
            this.f32116b.put(i, j);
        }
        return C42768iX3.m33836b(j);
    }

    /* renamed from: g */
    public final boolean m86688g(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m86687h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f32117c.get(pointerId, false)) {
                this.f32116b.delete(pointerId);
                this.f32117c.delete(pointerId);
            }
        }
        if (this.f32116b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f32116b.size() - 1; -1 < size; size--) {
                int keyAt = this.f32116b.keyAt(size);
                if (!m86688g(motionEvent, keyAt)) {
                    this.f32116b.removeAt(size);
                    this.f32117c.delete(keyAt);
                }
            }
        }
    }
}
