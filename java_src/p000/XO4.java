package p000;

import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
/* renamed from: XO4 */
/* loaded from: classes6.dex */
public class XO4 {

    /* renamed from: g */
    public PathEffect f43111g;

    /* renamed from: h */
    public MaskFilter f43112h;

    /* renamed from: m */
    public Shader f43117m;

    /* renamed from: n */
    public Shader f43118n;

    /* renamed from: a */
    public List<VO4> f43105a = new ArrayList();

    /* renamed from: b */
    public List<List<VO4>> f43106b = new ArrayList();

    /* renamed from: c */
    public int f43107c = 0;

    /* renamed from: d */
    public int f43108d = 1;

    /* renamed from: e */
    public Paint.Cap f43109e = Paint.Cap.ROUND;

    /* renamed from: f */
    public Paint.Join f43110f = Paint.Join.MITER;

    /* renamed from: i */
    public boolean f43113i = true;

    /* renamed from: j */
    public Integer f43114j = -16777216;

    /* renamed from: k */
    public boolean f43115k = true;

    /* renamed from: l */
    public boolean f43116l = true;

    /* renamed from: o */
    public Paint.Style f43119o = Paint.Style.FILL_AND_STROKE;

    /* renamed from: p */
    public Integer f43120p = -1;

    public XO4(List<VO4> list) {
        m77036b(list);
    }

    /* renamed from: a */
    public XO4 m77037a(VO4 vo4) {
        if (vo4 != null) {
            this.f43105a.add(vo4);
        }
        return this;
    }

    /* renamed from: b */
    public XO4 m77036b(List<VO4> list) {
        if (list != null) {
            for (VO4 vo4 : list) {
                m77037a(vo4);
            }
        }
        return this;
    }

    /* renamed from: c */
    public XO4 m77035c(List<VO4> list) {
        if (list != null) {
            this.f43106b.add(list);
        }
        return this;
    }

    /* renamed from: d */
    public WO4 m77034d() {
        return new WO4(this.f43107c, this.f43105a, this.f43106b, this.f43108d, this.f43109e, this.f43110f, this.f43111g, this.f43112h, this.f43113i, this.f43114j, this.f43115k, this.f43116l, this.f43117m, this.f43118n, this.f43119o, this.f43120p);
    }

    /* renamed from: e */
    public XO4 m77033e(Integer num) {
        this.f43120p = num;
        return this;
    }

    /* renamed from: f */
    public XO4 m77032f(Integer num) {
        this.f43114j = num;
        return this;
    }

    /* renamed from: g */
    public XO4 m77031g(int i) {
        this.f43108d = i;
        return this;
    }

    /* renamed from: h */
    public XO4 m77030h(Paint.Style style) {
        this.f43119o = style;
        return this;
    }

    /* renamed from: i */
    public XO4 m77029i(int i) {
        this.f43107c = i;
        return this;
    }
}
