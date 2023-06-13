package p000;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.InterfaceC11183i;
import co.bird.android.model.Detail;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.p056ws.WebSocketProtocol;
/* renamed from: Wh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36825Wh1 {

    /* renamed from: c */
    public static final String[] f41511c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d */
    public static final C39909di1[] f41512d;

    /* renamed from: e */
    public static final C39909di1[] f41513e;

    /* renamed from: f */
    public static final C39909di1[] f41514f;

    /* renamed from: g */
    public static final C39909di1[] f41515g;

    /* renamed from: h */
    public static final C39909di1[] f41516h;

    /* renamed from: i */
    public static final C39909di1[][] f41517i;

    /* renamed from: j */
    public static final HashSet<String> f41518j;

    /* renamed from: a */
    public final List<Map<String, C36591Vh1>> f41519a;

    /* renamed from: b */
    public final ByteOrder f41520b;

    /* renamed from: Wh1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C9149a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41521a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f41522b;

        static {
            int[] iArr = new int[EnumC9154c.values().length];
            f41522b = iArr;
            try {
                iArr[EnumC9154c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41522b[EnumC9154c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC51092wa0.values().length];
            f41521a = iArr2;
            try {
                iArr2[EnumC51092wa0.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41521a[EnumC51092wa0.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41521a[EnumC51092wa0.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: Wh1$b */
    /* loaded from: classes.dex */
    public static final class C9150b {

        /* renamed from: c */
        public static final Pattern f41523c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        public static final Pattern f41524d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        public static final Pattern f41525e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        public static final List<HashMap<String, C39909di1>> f41526f = Collections.list(new C9151a());

        /* renamed from: a */
        public final List<Map<String, C36591Vh1>> f41527a = Collections.list(new C9152b());

        /* renamed from: b */
        public final ByteOrder f41528b;

        /* renamed from: Wh1$b$a */
        /* loaded from: classes.dex */
        public class C9151a implements Enumeration<HashMap<String, C39909di1>> {

            /* renamed from: a */
            public int f41529a = 0;

            @Override // java.util.Enumeration
            /* renamed from: a */
            public HashMap<String, C39909di1> nextElement() {
                C39909di1[] c39909di1Arr;
                HashMap<String, C39909di1> hashMap = new HashMap<>();
                for (C39909di1 c39909di1 : C36825Wh1.f41517i[this.f41529a]) {
                    hashMap.put(c39909di1.f77075b, c39909di1);
                }
                this.f41529a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f41529a < C36825Wh1.f41517i.length;
            }
        }

        /* renamed from: Wh1$b$b */
        /* loaded from: classes.dex */
        public class C9152b implements Enumeration<Map<String, C36591Vh1>> {

            /* renamed from: a */
            public int f41530a = 0;

            public C9152b() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, C36591Vh1> nextElement() {
                this.f41530a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f41530a < C36825Wh1.f41517i.length;
            }
        }

        /* renamed from: Wh1$b$c */
        /* loaded from: classes.dex */
        public class C9153c implements Enumeration<Map<String, C36591Vh1>> {

            /* renamed from: a */
            public final Enumeration<Map<String, C36591Vh1>> f41532a;

            public C9153c() {
                this.f41532a = Collections.enumeration(C9150b.this.f41527a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, C36591Vh1> nextElement() {
                return new HashMap(this.f41532a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f41532a.hasMoreElements();
            }
        }

        public C9150b(ByteOrder byteOrder) {
            this.f41528b = byteOrder;
        }

        /* renamed from: b */
        public static Pair<Integer, Integer> m77998b(String str) {
            int intValue;
            int i;
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> m77998b = m77998b(split[0]);
                if (((Integer) m77998b.first).intValue() == 2) {
                    return m77998b;
                }
                for (int i2 = 1; i2 < split.length; i2++) {
                    Pair<Integer, Integer> m77998b2 = m77998b(split[i2]);
                    if (!((Integer) m77998b2.first).equals(m77998b.first) && !((Integer) m77998b2.second).equals(m77998b.first)) {
                        intValue = -1;
                    } else {
                        intValue = ((Integer) m77998b.first).intValue();
                    }
                    if (((Integer) m77998b.second).intValue() != -1 && (((Integer) m77998b2.first).equals(m77998b.second) || ((Integer) m77998b2.second).equals(m77998b.second))) {
                        i = ((Integer) m77998b.second).intValue();
                    } else {
                        i = -1;
                    }
                    if (intValue == -1 && i == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        m77998b = new Pair<>(Integer.valueOf(i), -1);
                    } else if (i == -1) {
                        m77998b = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return m77998b;
            } else if (str.contains("/")) {
                String[] split2 = str.split("/", -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new Pair<>(10, 5);
                            }
                            return new Pair<>(5, -1);
                        }
                        return new Pair<>(10, -1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(2, -1);
            } else {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        int i3 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                        if (i3 >= 0 && parseLong <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            return new Pair<>(3, 4);
                        }
                        if (i3 < 0) {
                            return new Pair<>(9, -1);
                        }
                        return new Pair<>(4, -1);
                    } catch (NumberFormatException unused2) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused3) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
        }

        /* renamed from: a */
        public C36825Wh1 m77999a() {
            ArrayList list = Collections.list(new C9153c());
            if (!list.get(1).isEmpty()) {
                m77996d("ExposureProgram", String.valueOf(0), list);
                m77996d("ExifVersion", "0230", list);
                m77996d("ComponentsConfiguration", "1,2,3,0", list);
                m77996d("MeteringMode", String.valueOf(0), list);
                m77996d("LightSource", String.valueOf(0), list);
                m77996d("FlashpixVersion", "0100", list);
                m77996d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                m77996d("FileSource", String.valueOf(3), list);
                m77996d("SceneType", String.valueOf(1), list);
                m77996d("CustomRendered", String.valueOf(0), list);
                m77996d("SceneCaptureType", String.valueOf(0), list);
                m77996d("Contrast", String.valueOf(0), list);
                m77996d("Saturation", String.valueOf(0), list);
                m77996d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                m77996d("GPSVersionID", "2300", list);
                m77996d("GPSSpeedRef", "K", list);
                m77996d("GPSTrackRef", "T", list);
                m77996d("GPSImgDirectionRef", "T", list);
                m77996d("GPSDestBearingRef", "T", list);
                m77996d("GPSDestDistanceRef", "K", list);
            }
            return new C36825Wh1(this.f41528b, list);
        }

        /* renamed from: c */
        public C9150b m77997c(String str, String str2) {
            m77995e(str, str2, this.f41527a);
            return this;
        }

        /* renamed from: d */
        public final void m77996d(String str, String str2, List<Map<String, C36591Vh1>> list) {
            for (Map<String, C36591Vh1> map : list) {
                if (map.containsKey(str)) {
                    return;
                }
            }
            m77995e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x018a, code lost:
            if (r7 != r0) goto L100;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m77995e(String str, String str2, List<Map<String, C36591Vh1>> list) {
            int i;
            int i2;
            int i3;
            Matcher matcher;
            C9150b c9150b = this;
            String str3 = str;
            String str4 = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
                boolean find = f41524d.matcher(str4).find();
                boolean find2 = f41525e.matcher(str4).find();
                if (str2.length() != 19 || (!find && !find2)) {
                    C33928Jx2.m99522l("ExifData", "Invalid value for " + str3 + " : " + str4);
                    return;
                } else if (find2) {
                    str4 = str4.replaceAll(Detail.EMPTY_CHAR, ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str5 = str3;
            int i4 = 2;
            int i5 = 1;
            if (str4 != null && C36825Wh1.f41518j.contains(str5)) {
                if (str5.equals("GPSTimeStamp")) {
                    if (!f41523c.matcher(str4).find()) {
                        C33928Jx2.m99522l("ExifData", "Invalid value for " + str5 + " : " + str4);
                        return;
                    }
                    str4 = Integer.parseInt((String) HZ3.m103731g(matcher.group(1))) + "/1," + Integer.parseInt((String) HZ3.m103731g(matcher.group(2))) + "/1," + Integer.parseInt((String) HZ3.m103731g(matcher.group(3))) + "/1";
                } else {
                    try {
                        str4 = new C44823lz2(Double.parseDouble(str4)).toString();
                    } catch (NumberFormatException e) {
                        C33928Jx2.m99521m("ExifData", "Invalid value for " + str5 + " : " + str4, e);
                        return;
                    }
                }
            }
            int i6 = 0;
            int i7 = 0;
            while (i7 < C36825Wh1.f41517i.length) {
                C39909di1 c39909di1 = f41526f.get(i7).get(str5);
                if (c39909di1 != null) {
                    if (str4 == null) {
                        list.get(i7).remove(str5);
                    } else {
                        Pair<Integer, Integer> m77998b = m77998b(str4);
                        if (c39909di1.f77076c != ((Integer) m77998b.first).intValue() && c39909di1.f77076c != ((Integer) m77998b.second).intValue()) {
                            int i8 = c39909di1.f77077d;
                            if (i8 != -1 && (i8 == ((Integer) m77998b.first).intValue() || c39909di1.f77077d == ((Integer) m77998b.second).intValue())) {
                                i3 = c39909di1.f77077d;
                            } else {
                                i3 = c39909di1.f77076c;
                                if (i3 != i5) {
                                    if (i3 != 7) {
                                    }
                                }
                            }
                        } else {
                            i3 = c39909di1.f77076c;
                        }
                        String str6 = "/";
                        switch (i3) {
                            case 1:
                                i = i7;
                                i2 = i5;
                                list.get(i).put(str5, C36591Vh1.m79566a(str4));
                                break;
                            case 2:
                            case 7:
                                i = i7;
                                i2 = i5;
                                list.get(i).put(str5, C36591Vh1.m79562e(str4));
                                break;
                            case 3:
                                i = i7;
                                i2 = i5;
                                String[] split = str4.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i9 = 0; i9 < split.length; i9++) {
                                    iArr[i9] = Integer.parseInt(split[i9]);
                                }
                                list.get(i).put(str5, C36591Vh1.m79558i(iArr, c9150b.f41528b));
                                break;
                            case 4:
                                i = i7;
                                i2 = i5;
                                String[] split2 = str4.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i10 = 0; i10 < split2.length; i10++) {
                                    jArr[i10] = Long.parseLong(split2[i10]);
                                }
                                list.get(i).put(str5, C36591Vh1.m79560g(jArr, c9150b.f41528b));
                                break;
                            case 5:
                                String str7 = "/";
                                String[] split3 = str4.split(",", -1);
                                C44823lz2[] c44823lz2Arr = new C44823lz2[split3.length];
                                int i11 = i6;
                                while (i11 < split3.length) {
                                    String str8 = str7;
                                    String[] split4 = split3[i11].split(str8, -1);
                                    c44823lz2Arr[i11] = new C44823lz2((long) Double.parseDouble(split4[i6]), (long) Double.parseDouble(split4[1]));
                                    i11++;
                                    str7 = str8;
                                    i7 = i7;
                                    i6 = 0;
                                }
                                i = i7;
                                i2 = 1;
                                list.get(i).put(str5, C36591Vh1.m79559h(c44823lz2Arr, c9150b.f41528b));
                                break;
                            case 9:
                                String[] split5 = str4.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i12 = i6; i12 < split5.length; i12++) {
                                    iArr2[i12] = Integer.parseInt(split5[i12]);
                                }
                                list.get(i7).put(str5, C36591Vh1.m79564c(iArr2, c9150b.f41528b));
                                i = i7;
                                i2 = 1;
                                break;
                            case 10:
                                String[] split6 = str4.split(",", -1);
                                C44823lz2[] c44823lz2Arr2 = new C44823lz2[split6.length];
                                int i13 = i6;
                                while (i13 < split6.length) {
                                    String[] split7 = split6[i13].split(str6, -1);
                                    c44823lz2Arr2[i13] = new C44823lz2((long) Double.parseDouble(split7[i6]), (long) Double.parseDouble(split7[i5]));
                                    i13++;
                                    str6 = str6;
                                    i5 = 1;
                                }
                                c9150b = this;
                                list.get(i7).put(str5, C36591Vh1.m79563d(c44823lz2Arr2, c9150b.f41528b));
                                i = i7;
                                i2 = 1;
                                break;
                            case 12:
                                String[] split8 = str4.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i14 = i6; i14 < split8.length; i14++) {
                                    dArr[i14] = Double.parseDouble(split8[i14]);
                                }
                                list.get(i7).put(str5, C36591Vh1.m79565b(dArr, c9150b.f41528b));
                                break;
                        }
                        i7 = i + 1;
                        i5 = i2;
                        i4 = 2;
                        i6 = 0;
                    }
                }
                i = i7;
                i2 = i5;
                i7 = i + 1;
                i5 = i2;
                i4 = 2;
                i6 = 0;
            }
        }

        /* renamed from: f */
        public C9150b m77994f(long j) {
            return m77997c("ExposureTime", String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
        }

        /* renamed from: g */
        public C9150b m77993g(EnumC51092wa0 enumC51092wa0) {
            int i;
            if (enumC51092wa0 == EnumC51092wa0.UNKNOWN) {
                return this;
            }
            int i2 = C9149a.f41521a[enumC51092wa0.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C33928Jx2.m99522l("ExifData", "Unknown flash state: " + enumC51092wa0);
                        return this;
                    }
                    i = 1;
                } else {
                    i = 32;
                }
            } else {
                i = 0;
            }
            if ((i & 1) == 1) {
                m77997c("LightSource", String.valueOf(4));
            }
            return m77997c("Flash", String.valueOf(i));
        }

        /* renamed from: h */
        public C9150b m77992h(float f) {
            return m77997c("FocalLength", new C44823lz2(f * 1000.0f, 1000L).toString());
        }

        /* renamed from: i */
        public C9150b m77991i(int i) {
            return m77997c("ImageLength", String.valueOf(i));
        }

        /* renamed from: j */
        public C9150b m77990j(int i) {
            return m77997c("ImageWidth", String.valueOf(i));
        }

        /* renamed from: k */
        public C9150b m77989k(int i) {
            return m77997c("SensitivityType", String.valueOf(3)).m77997c("PhotographicSensitivity", String.valueOf(Math.min((int) Settings.DEFAULT_INITIAL_WINDOW_SIZE, i)));
        }

        /* renamed from: l */
        public C9150b m77988l(float f) {
            return m77997c("FNumber", String.valueOf(f));
        }

        /* renamed from: m */
        public C9150b m77987m(int i) {
            int i2;
            if (i != 0) {
                if (i != 90) {
                    if (i != 180) {
                        if (i != 270) {
                            C33928Jx2.m99522l("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                    } else {
                        i2 = 3;
                    }
                } else {
                    i2 = 6;
                }
            } else {
                i2 = 1;
            }
            return m77997c("Orientation", String.valueOf(i2));
        }

        /* renamed from: n */
        public C9150b m77986n(EnumC9154c enumC9154c) {
            String valueOf;
            int i = C9149a.f41522b[enumC9154c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(1);
                }
            } else {
                valueOf = String.valueOf(0);
            }
            return m77997c("WhiteBalance", valueOf);
        }
    }

    /* renamed from: Wh1$c */
    /* loaded from: classes.dex */
    public enum EnumC9154c {
        AUTO,
        MANUAL
    }

    static {
        C39909di1[] c39909di1Arr = {new C39909di1("ImageWidth", 256, 3, 4), new C39909di1("ImageLength", 257, 3, 4), new C39909di1("Make", 271, 2), new C39909di1("Model", 272, 2), new C39909di1("Orientation", 274, 3), new C39909di1("XResolution", 282, 5), new C39909di1("YResolution", 283, 5), new C39909di1("ResolutionUnit", 296, 3), new C39909di1("Software", 305, 2), new C39909di1("DateTime", 306, 2), new C39909di1("YCbCrPositioning", 531, 3), new C39909di1("SubIFDPointer", 330, 4), new C39909di1("ExifIFDPointer", 34665, 4), new C39909di1("GPSInfoIFDPointer", 34853, 4)};
        f41512d = c39909di1Arr;
        C39909di1[] c39909di1Arr2 = {new C39909di1("ExposureTime", 33434, 5), new C39909di1("FNumber", 33437, 5), new C39909di1("ExposureProgram", 34850, 3), new C39909di1("PhotographicSensitivity", 34855, 3), new C39909di1("SensitivityType", 34864, 3), new C39909di1("ExifVersion", 36864, 2), new C39909di1("DateTimeOriginal", 36867, 2), new C39909di1("DateTimeDigitized", 36868, 2), new C39909di1("ComponentsConfiguration", 37121, 7), new C39909di1("ShutterSpeedValue", 37377, 10), new C39909di1("ApertureValue", 37378, 5), new C39909di1("BrightnessValue", 37379, 10), new C39909di1("ExposureBiasValue", 37380, 10), new C39909di1("MaxApertureValue", 37381, 5), new C39909di1("MeteringMode", 37383, 3), new C39909di1("LightSource", 37384, 3), new C39909di1("Flash", 37385, 3), new C39909di1("FocalLength", 37386, 5), new C39909di1("SubSecTime", 37520, 2), new C39909di1("SubSecTimeOriginal", 37521, 2), new C39909di1("SubSecTimeDigitized", 37522, 2), new C39909di1("FlashpixVersion", 40960, 7), new C39909di1("ColorSpace", 40961, 3), new C39909di1("PixelXDimension", 40962, 3, 4), new C39909di1("PixelYDimension", 40963, 3, 4), new C39909di1("InteroperabilityIFDPointer", 40965, 4), new C39909di1("FocalPlaneResolutionUnit", 41488, 3), new C39909di1("SensingMethod", 41495, 3), new C39909di1("FileSource", 41728, 7), new C39909di1("SceneType", 41729, 7), new C39909di1("CustomRendered", 41985, 3), new C39909di1("ExposureMode", 41986, 3), new C39909di1("WhiteBalance", 41987, 3), new C39909di1("SceneCaptureType", 41990, 3), new C39909di1("Contrast", 41992, 3), new C39909di1("Saturation", 41993, 3), new C39909di1("Sharpness", 41994, 3)};
        f41513e = c39909di1Arr2;
        C39909di1[] c39909di1Arr3 = {new C39909di1("GPSVersionID", 0, 1), new C39909di1("GPSLatitudeRef", 1, 2), new C39909di1("GPSLatitude", 2, 5, 10), new C39909di1("GPSLongitudeRef", 3, 2), new C39909di1("GPSLongitude", 4, 5, 10), new C39909di1("GPSAltitudeRef", 5, 1), new C39909di1("GPSAltitude", 6, 5), new C39909di1("GPSTimeStamp", 7, 5), new C39909di1("GPSSpeedRef", 12, 2), new C39909di1("GPSTrackRef", 14, 2), new C39909di1("GPSImgDirectionRef", 16, 2), new C39909di1("GPSDestBearingRef", 23, 2), new C39909di1("GPSDestDistanceRef", 25, 2)};
        f41514f = c39909di1Arr3;
        f41515g = new C39909di1[]{new C39909di1("SubIFDPointer", 330, 4), new C39909di1("ExifIFDPointer", 34665, 4), new C39909di1("GPSInfoIFDPointer", 34853, 4), new C39909di1("InteroperabilityIFDPointer", 40965, 4)};
        C39909di1[] c39909di1Arr4 = {new C39909di1("InteroperabilityIndex", 1, 2)};
        f41516h = c39909di1Arr4;
        f41517i = new C39909di1[][]{c39909di1Arr, c39909di1Arr2, c39909di1Arr3, c39909di1Arr4};
        f41518j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public C36825Wh1(ByteOrder byteOrder, List<Map<String, C36591Vh1>> list) {
        boolean z;
        if (list.size() == f41517i.length) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103728j(z, "Malformed attributes list. Number of IFDs mismatch.");
        this.f41520b = byteOrder;
        this.f41519a = list;
    }

    /* renamed from: a */
    public static C9150b m78003a() {
        return new C9150b(ByteOrder.BIG_ENDIAN).m77997c("Orientation", String.valueOf(1)).m77997c("XResolution", "72/1").m77997c("YResolution", "72/1").m77997c("ResolutionUnit", String.valueOf(2)).m77997c("YCbCrPositioning", String.valueOf(1)).m77997c("Make", Build.MANUFACTURER).m77997c("Model", Build.MODEL);
    }

    /* renamed from: b */
    public static C36825Wh1 m78002b(InterfaceC11183i interfaceC11183i, int i) {
        C9150b m78003a = m78003a();
        if (interfaceC11183i.mo40428i1() != null) {
            interfaceC11183i.mo40428i1().mo3255a(m78003a);
        }
        m78003a.m77987m(i);
        return m78003a.m77990j(interfaceC11183i.getWidth()).m77991i(interfaceC11183i.getHeight()).m77999a();
    }

    /* renamed from: c */
    public Map<String, C36591Vh1> m78001c(int i) {
        int length = f41517i.length;
        HZ3.m103735c(i, 0, length, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f41519a.get(i);
    }

    /* renamed from: d */
    public ByteOrder m78000d() {
        return this.f41520b;
    }
}
