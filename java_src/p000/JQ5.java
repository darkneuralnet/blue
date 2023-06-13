package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
/* renamed from: JQ5 */
/* loaded from: classes.dex */
public class JQ5 extends C41363g91 {

    /* renamed from: d */
    public HV2 f17532d;

    public JQ5(String str) {
        this.f81687a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.f17532d = m100497d(Arrays.copyOf(dArr, i + 1));
    }

    /* renamed from: d */
    public static HV2 m100497d(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = i * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        HV2 hv2 = new HV2(dArr3, dArr2);
        System.out.println(" 0 " + hv2.mo34283c(0.0d, 0));
        System.out.println(" 1 " + hv2.mo34283c(1.0d, 0));
        return hv2;
    }

    @Override // p000.C41363g91
    /* renamed from: a */
    public double mo39969a(double d) {
        return this.f17532d.mo34283c(d, 0);
    }

    @Override // p000.C41363g91
    /* renamed from: b */
    public double mo39968b(double d) {
        return this.f17532d.mo34280f(d, 0);
    }
}
