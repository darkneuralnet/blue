package p000;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C11512a;
import java.util.HashMap;
import java.util.HashSet;
/* renamed from: Xj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37078Xj2 {

    /* renamed from: f */
    public static int f43729f = -1;

    /* renamed from: a */
    public int f43730a;

    /* renamed from: b */
    public int f43731b;

    /* renamed from: c */
    public String f43732c;

    /* renamed from: d */
    public int f43733d;

    /* renamed from: e */
    public HashMap<String, C11512a> f43734e;

    public AbstractC37078Xj2() {
        int i = f43729f;
        this.f43730a = i;
        this.f43731b = i;
        this.f43732c = null;
    }

    /* renamed from: a */
    public abstract void mo40951a(HashMap<String, AbstractC33194Gt6> hashMap);

    @Override // 
    /* renamed from: b */
    public abstract AbstractC37078Xj2 clone();

    /* renamed from: c */
    public AbstractC37078Xj2 mo40949c(AbstractC37078Xj2 abstractC37078Xj2) {
        this.f43730a = abstractC37078Xj2.f43730a;
        this.f43731b = abstractC37078Xj2.f43731b;
        this.f43732c = abstractC37078Xj2.f43732c;
        this.f43733d = abstractC37078Xj2.f43733d;
        this.f43734e = abstractC37078Xj2.f43734e;
        return this;
    }

    /* renamed from: d */
    public abstract void mo40948d(HashSet<String> hashSet);

    /* renamed from: e */
    public abstract void mo40947e(Context context, AttributeSet attributeSet);

    /* renamed from: f */
    public boolean m76531f(String str) {
        String str2 = this.f43732c;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    /* renamed from: g */
    public void m76530g(int i) {
        this.f43730a = i;
    }

    /* renamed from: h */
    public void mo60992h(HashMap<String, Integer> hashMap) {
    }

    /* renamed from: i */
    public AbstractC37078Xj2 m76529i(int i) {
        this.f43731b = i;
        return this;
    }

    /* renamed from: j */
    public boolean m76528j(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    /* renamed from: k */
    public float m76527k(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    /* renamed from: l */
    public int m76526l(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
