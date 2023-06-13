package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
/* renamed from: YV2 */
/* loaded from: classes6.dex */
public class YV2 {

    /* renamed from: a */
    public final NA5<String, ZV2> f45942a = new NA5<>();

    /* renamed from: b */
    public final NA5<String, PropertyValuesHolder[]> f45943b = new NA5<>();

    /* renamed from: a */
    public static void m74985a(YV2 yv2, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            yv2.m74974l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            yv2.m74973m(objectAnimator.getPropertyName(), ZV2.m73010b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: c */
    public static YV2 m74983c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return m74982d(context, resourceId);
        }
        return null;
    }

    /* renamed from: d */
    public static YV2 m74982d(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m74981e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m74981e(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: e */
    public static YV2 m74981e(List<Animator> list) {
        YV2 yv2 = new YV2();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m74985a(yv2, list.get(i));
        }
        return yv2;
    }

    /* renamed from: b */
    public final PropertyValuesHolder[] m74984b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YV2)) {
            return false;
        }
        return this.f45942a.equals(((YV2) obj).f45942a);
    }

    /* renamed from: f */
    public <T> ObjectAnimator m74980f(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, m74979g(str));
        ofPropertyValuesHolder.setProperty(property);
        m74978h(str).m73011a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: g */
    public PropertyValuesHolder[] m74979g(String str) {
        if (m74976j(str)) {
            return m74984b(this.f45943b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public ZV2 m74978h(String str) {
        if (m74975k(str)) {
            return this.f45942a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f45942a.hashCode();
    }

    /* renamed from: i */
    public long m74977i() {
        int size = this.f45942a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            ZV2 m94263m = this.f45942a.m94263m(i);
            j = Math.max(j, m94263m.m73009c() + m94263m.m73008d());
        }
        return j;
    }

    /* renamed from: j */
    public boolean m74976j(String str) {
        return this.f45943b.get(str) != null;
    }

    /* renamed from: k */
    public boolean m74975k(String str) {
        return this.f45942a.get(str) != null;
    }

    /* renamed from: l */
    public void m74974l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f45943b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void m74973m(String str, ZV2 zv2) {
        this.f45942a.put(str, zv2);
    }

    public String toString() {
        return '\n' + getClass().getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f45942a + "}\n";
    }
}
