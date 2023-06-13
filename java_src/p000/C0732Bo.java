package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: Bo */
/* loaded from: classes6.dex */
public class C0732Bo<T> extends AbstractC41105fj2<T> {

    /* renamed from: c */
    public static AbstractC41105fj2<int[]> f2897c = new C0740h(null);

    /* renamed from: d */
    public static AbstractC41105fj2<Integer[]> f2898d = new C0741i(null);

    /* renamed from: e */
    public static AbstractC41105fj2<short[]> f2899e = new C0742j(null);

    /* renamed from: f */
    public static AbstractC41105fj2<Short[]> f2900f = new C0743k(null);

    /* renamed from: g */
    public static AbstractC41105fj2<byte[]> f2901g = new C0744l(null);

    /* renamed from: h */
    public static AbstractC41105fj2<Byte[]> f2902h = new C0745m(null);

    /* renamed from: i */
    public static AbstractC41105fj2<char[]> f2903i = new C0746n(null);

    /* renamed from: j */
    public static AbstractC41105fj2<Character[]> f2904j = new C0747o(null);

    /* renamed from: k */
    public static AbstractC41105fj2<long[]> f2905k = new C0748p(null);

    /* renamed from: l */
    public static AbstractC41105fj2<Long[]> f2906l = new C0733a(null);

    /* renamed from: m */
    public static AbstractC41105fj2<float[]> f2907m = new C0734b(null);

    /* renamed from: n */
    public static AbstractC41105fj2<Float[]> f2908n = new C0735c(null);

    /* renamed from: o */
    public static AbstractC41105fj2<double[]> f2909o = new C0736d(null);

    /* renamed from: p */
    public static AbstractC41105fj2<Double[]> f2910p = new C0737e(null);

    /* renamed from: q */
    public static AbstractC41105fj2<boolean[]> f2911q = new C0738f(null);

    /* renamed from: r */
    public static AbstractC41105fj2<Boolean[]> f2912r = new C0739g(null);

    /* renamed from: Bo$a */
    /* loaded from: classes6.dex */
    public class C0733a extends C0732Bo<Long[]> {
        public C0733a(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public Long[] mo36570b(Object obj) {
            List list = (List) obj;
            Long[] lArr = new Long[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        lArr[i] = (Long) obj2;
                    } else {
                        lArr[i] = Long.valueOf(((Number) obj2).longValue());
                    }
                    i++;
                }
            }
            return lArr;
        }
    }

    /* renamed from: Bo$b */
    /* loaded from: classes6.dex */
    public class C0734b extends C0732Bo<float[]> {
        public C0734b(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public float[] mo36570b(Object obj) {
            List<Number> list = (List) obj;
            float[] fArr = new float[list.size()];
            int i = 0;
            for (Number number : list) {
                fArr[i] = number.floatValue();
                i++;
            }
            return fArr;
        }
    }

    /* renamed from: Bo$c */
    /* loaded from: classes6.dex */
    public class C0735c extends C0732Bo<Float[]> {
        public C0735c(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public Float[] mo36570b(Object obj) {
            List list = (List) obj;
            Float[] fArr = new Float[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        fArr[i] = (Float) obj2;
                    } else {
                        fArr[i] = Float.valueOf(((Number) obj2).floatValue());
                    }
                    i++;
                }
            }
            return fArr;
        }
    }

    /* renamed from: Bo$d */
    /* loaded from: classes6.dex */
    public class C0736d extends C0732Bo<double[]> {
        public C0736d(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public double[] mo36570b(Object obj) {
            List<Number> list = (List) obj;
            double[] dArr = new double[list.size()];
            int i = 0;
            for (Number number : list) {
                dArr[i] = number.doubleValue();
                i++;
            }
            return dArr;
        }
    }

    /* renamed from: Bo$e */
    /* loaded from: classes6.dex */
    public class C0737e extends C0732Bo<Double[]> {
        public C0737e(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public Double[] mo36570b(Object obj) {
            List list = (List) obj;
            Double[] dArr = new Double[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Double) {
                        dArr[i] = (Double) obj2;
                    } else {
                        dArr[i] = Double.valueOf(((Number) obj2).doubleValue());
                    }
                    i++;
                }
            }
            return dArr;
        }
    }

    /* renamed from: Bo$f */
    /* loaded from: classes6.dex */
    public class C0738f extends C0732Bo<boolean[]> {
        public C0738f(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public boolean[] mo36570b(Object obj) {
            List<Boolean> list = (List) obj;
            boolean[] zArr = new boolean[list.size()];
            int i = 0;
            for (Boolean bool : list) {
                zArr[i] = bool.booleanValue();
                i++;
            }
            return zArr;
        }
    }

    /* renamed from: Bo$g */
    /* loaded from: classes6.dex */
    public class C0739g extends C0732Bo<Boolean[]> {
        public C0739g(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public Boolean[] mo36570b(Object obj) {
            boolean z;
            List list = (List) obj;
            Boolean[] boolArr = new Boolean[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Boolean) {
                        boolArr[i] = Boolean.valueOf(((Boolean) obj2).booleanValue());
                    } else if (obj2 instanceof Number) {
                        if (((Number) obj2).intValue() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolArr[i] = Boolean.valueOf(z);
                    } else {
                        throw new RuntimeException("can not convert " + obj2 + " toBoolean");
                    }
                    i++;
                }
            }
            return boolArr;
        }
    }

    /* renamed from: Bo$h */
    /* loaded from: classes6.dex */
    public class C0740h extends C0732Bo<int[]> {
        public C0740h(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public int[] mo36570b(Object obj) {
            List<Number> list = (List) obj;
            int[] iArr = new int[list.size()];
            int i = 0;
            for (Number number : list) {
                iArr[i] = number.intValue();
                i++;
            }
            return iArr;
        }
    }

    /* renamed from: Bo$i */
    /* loaded from: classes6.dex */
    public class C0741i extends C0732Bo<Integer[]> {
        public C0741i(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public Integer[] mo36570b(Object obj) {
            List list = (List) obj;
            Integer[] numArr = new Integer[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Integer) {
                        numArr[i] = (Integer) obj2;
                    } else {
                        numArr[i] = Integer.valueOf(((Number) obj2).intValue());
                    }
                    i++;
                }
            }
            return numArr;
        }
    }

    /* renamed from: Bo$j */
    /* loaded from: classes6.dex */
    public class C0742j extends C0732Bo<short[]> {
        public C0742j(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public short[] mo36570b(Object obj) {
            List<Number> list = (List) obj;
            short[] sArr = new short[list.size()];
            int i = 0;
            for (Number number : list) {
                sArr[i] = number.shortValue();
                i++;
            }
            return sArr;
        }
    }

    /* renamed from: Bo$k */
    /* loaded from: classes6.dex */
    public class C0743k extends C0732Bo<Short[]> {
        public C0743k(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public Short[] mo36570b(Object obj) {
            List list = (List) obj;
            Short[] shArr = new Short[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Short) {
                        shArr[i] = (Short) obj2;
                    } else {
                        shArr[i] = Short.valueOf(((Number) obj2).shortValue());
                    }
                    i++;
                }
            }
            return shArr;
        }
    }

    /* renamed from: Bo$l */
    /* loaded from: classes6.dex */
    public class C0744l extends C0732Bo<byte[]> {
        public C0744l(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public byte[] mo36570b(Object obj) {
            List<Number> list = (List) obj;
            byte[] bArr = new byte[list.size()];
            int i = 0;
            for (Number number : list) {
                bArr[i] = number.byteValue();
                i++;
            }
            return bArr;
        }
    }

    /* renamed from: Bo$m */
    /* loaded from: classes6.dex */
    public class C0745m extends C0732Bo<Byte[]> {
        public C0745m(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public Byte[] mo36570b(Object obj) {
            List list = (List) obj;
            Byte[] bArr = new Byte[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Byte) {
                        bArr[i] = (Byte) obj2;
                    } else {
                        bArr[i] = Byte.valueOf(((Number) obj2).byteValue());
                    }
                    i++;
                }
            }
            return bArr;
        }
    }

    /* renamed from: Bo$n */
    /* loaded from: classes6.dex */
    public class C0746n extends C0732Bo<char[]> {
        public C0746n(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public char[] mo36570b(Object obj) {
            List<Object> list = (List) obj;
            char[] cArr = new char[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                cArr[i] = obj2.toString().charAt(0);
                i++;
            }
            return cArr;
        }
    }

    /* renamed from: Bo$o */
    /* loaded from: classes6.dex */
    public class C0747o extends C0732Bo<Character[]> {
        public C0747o(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public Character[] mo36570b(Object obj) {
            List list = (List) obj;
            Character[] chArr = new Character[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    chArr[i] = Character.valueOf(obj2.toString().charAt(0));
                    i++;
                }
            }
            return chArr;
        }
    }

    /* renamed from: Bo$p */
    /* loaded from: classes6.dex */
    public class C0748p extends C0732Bo<long[]> {
        public C0748p(C40512ej2 c40512ej2) {
            super(c40512ej2);
        }

        @Override // p000.AbstractC41105fj2
        /* renamed from: h */
        public long[] mo36570b(Object obj) {
            List<Number> list = (List) obj;
            long[] jArr = new long[list.size()];
            int i = 0;
            for (Number number : list) {
                jArr[i] = number.intValue();
                i++;
            }
            return jArr;
        }
    }

    public C0732Bo(C40512ej2 c40512ej2) {
        super(c40512ej2);
    }

    @Override // p000.AbstractC41105fj2
    /* renamed from: a */
    public void mo40997a(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    @Override // p000.AbstractC41105fj2
    /* renamed from: c */
    public Object mo40996c() {
        return new ArrayList();
    }
}
