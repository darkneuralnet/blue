package p000;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/* renamed from: BX3 */
/* loaded from: classes6.dex */
public class BX3 {
    private BX3() {
    }

    /* renamed from: a */
    public static boolean m113901a(double d, double d2, List<LatLng> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(d2);
        LatLng latLng = list.get(size - 1);
        double radians3 = Math.toRadians(latLng.f71430b);
        double radians4 = Math.toRadians(latLng.f71431c);
        int i = 0;
        double d3 = radians3;
        for (LatLng latLng2 : list) {
            double m64623f = C38509bN2.m64623f(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d3 && m64623f == 0.0d) {
                return true;
            }
            double radians5 = Math.toRadians(latLng2.f71430b);
            double radians6 = Math.toRadians(latLng2.f71431c);
            if (m113898d(d3, radians5, C38509bN2.m64623f(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, m64623f, z)) {
                i++;
            }
            d3 = radians5;
            radians4 = radians6;
        }
        if ((i & 1) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m113900b(LatLng latLng, List<LatLng> list, boolean z) {
        return m113901a(latLng.f71430b, latLng.f71431c, list, z);
    }

    /* renamed from: c */
    public static double m113899c(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            return RN5.m86795c(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.f71430b);
        double radians2 = Math.toRadians(latLng.f71431c);
        double radians3 = Math.toRadians(latLng2.f71430b);
        double radians4 = Math.toRadians(latLng2.f71431c);
        double radians5 = Math.toRadians(latLng3.f71430b) - radians3;
        double radians6 = Math.toRadians(latLng3.f71431c) - radians4;
        double d = (((radians - radians3) * radians5) + ((radians2 - radians4) * radians6)) / ((radians5 * radians5) + (radians6 * radians6));
        if (d <= 0.0d) {
            return RN5.m86795c(latLng, latLng2);
        }
        if (d >= 1.0d) {
            return RN5.m86795c(latLng, latLng3);
        }
        return RN5.m86795c(new LatLng(latLng.f71430b - latLng2.f71430b, latLng.f71431c - latLng2.f71431c), new LatLng((latLng3.f71430b - latLng2.f71430b) * d, d * (latLng3.f71431c - latLng2.f71431c)));
    }

    /* renamed from: d */
    public static boolean m113898d(double d, double d2, double d3, double d4, double d5, boolean z) {
        if ((d5 >= 0.0d && d5 >= d3) || ((d5 < 0.0d && d5 < d3) || d4 <= -1.5707963267948966d || d <= -1.5707963267948966d || d2 <= -1.5707963267948966d || d >= 1.5707963267948966d || d2 >= 1.5707963267948966d || d3 <= -3.141592653589793d)) {
            return false;
        }
        double d6 = (((d3 - d5) * d) + (d2 * d5)) / d3;
        if (d >= 0.0d && d2 >= 0.0d && d4 < d6) {
            return false;
        }
        if ((d <= 0.0d && d2 <= 0.0d && d4 >= d6) || d4 >= 1.5707963267948966d) {
            return true;
        }
        if (z) {
            if (Math.tan(d4) < m113894h(d, d2, d3, d5)) {
                return false;
            }
        } else if (C38509bN2.m64625d(d4) < m113896f(d, d2, d3, d5)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m113897e(List<LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    /* renamed from: f */
    public static double m113896f(double d, double d2, double d3, double d4) {
        return ((C38509bN2.m64625d(d) * (d3 - d4)) + (C38509bN2.m64625d(d2) * d4)) / d3;
    }

    /* renamed from: g */
    public static List<LatLng> m113895g(List<LatLng> list, double d) {
        LatLng latLng;
        int size = list.size();
        if (size >= 1) {
            double d2 = 0.0d;
            if (d > 0.0d) {
                boolean m113897e = m113897e(list);
                if (m113897e) {
                    latLng = list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    list.add(new LatLng(latLng.f71430b + 1.0E-11d, latLng.f71431c + 1.0E-11d));
                } else {
                    latLng = null;
                }
                Stack stack = new Stack();
                double[] dArr = new double[size];
                int i = 0;
                dArr[0] = 1.0d;
                int i2 = size - 1;
                dArr[i2] = 1.0d;
                if (size > 2) {
                    stack.push(new int[]{0, i2});
                    int i3 = 0;
                    while (stack.size() > 0) {
                        int[] iArr = (int[]) stack.pop();
                        double d3 = d2;
                        for (int i4 = iArr[0] + 1; i4 < iArr[1]; i4++) {
                            double m113899c = m113899c(list.get(i4), list.get(iArr[0]), list.get(iArr[1]));
                            if (m113899c > d3) {
                                d3 = m113899c;
                                i3 = i4;
                            }
                        }
                        if (d3 > d) {
                            dArr[i3] = d3;
                            stack.push(new int[]{iArr[0], i3});
                            stack.push(new int[]{i3, iArr[1]});
                        }
                        d2 = 0.0d;
                    }
                }
                if (m113897e) {
                    list.remove(list.size() - 1);
                    list.add(latLng);
                }
                ArrayList arrayList = new ArrayList();
                for (LatLng latLng2 : list) {
                    if (dArr[i] != 0.0d) {
                        arrayList.add(latLng2);
                    }
                    i++;
                }
                return arrayList;
            }
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        throw new IllegalArgumentException("Polyline must have at least 1 point");
    }

    /* renamed from: h */
    public static double m113894h(double d, double d2, double d3, double d4) {
        return ((Math.tan(d) * Math.sin(d3 - d4)) + (Math.tan(d2) * Math.sin(d4))) / Math.sin(d3);
    }
}
