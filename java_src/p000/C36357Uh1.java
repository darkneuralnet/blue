package p000;

import android.location.Location;
import androidx.camera.core.InterfaceC11183i;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* renamed from: Uh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36357Uh1 {

    /* renamed from: c */
    public static final String f37750c = "Uh1";

    /* renamed from: d */
    public static final ThreadLocal<SimpleDateFormat> f37751d = new C8345a();

    /* renamed from: e */
    public static final ThreadLocal<SimpleDateFormat> f37752e = new C8346b();

    /* renamed from: f */
    public static final ThreadLocal<SimpleDateFormat> f37753f = new C8347c();

    /* renamed from: g */
    public static final List<String> f37754g = m81165n();

    /* renamed from: h */
    public static final List<String> f37755h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a */
    public final C37059Xh1 f37756a;

    /* renamed from: b */
    public boolean f37757b = false;

    /* renamed from: Uh1$a */
    /* loaded from: classes.dex */
    public class C8345a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* renamed from: Uh1$b */
    /* loaded from: classes.dex */
    public class C8346b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: Uh1$c */
    /* loaded from: classes.dex */
    public class C8347c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: Uh1$d */
    /* loaded from: classes.dex */
    public static final class C8348d {

        /* renamed from: Uh1$d$a */
        /* loaded from: classes.dex */
        public static final class C8349a {

            /* renamed from: a */
            public final double f37758a;

            public C8349a(double d) {
                this.f37758a = d;
            }

            /* renamed from: a */
            public double m81146a() {
                return this.f37758a / 2.23694d;
            }
        }

        private C8348d() {
        }

        /* renamed from: a */
        public static C8349a m81149a(double d) {
            return new C8349a(d * 0.621371d);
        }

        /* renamed from: b */
        public static C8349a m81148b(double d) {
            return new C8349a(d * 1.15078d);
        }

        /* renamed from: c */
        public static C8349a m81147c(double d) {
            return new C8349a(d);
        }
    }

    public C36357Uh1(C37059Xh1 c37059Xh1) {
        this.f37756a = c37059Xh1;
    }

    /* renamed from: c */
    public static Date m81176c(String str) throws ParseException {
        return f37751d.get().parse(str);
    }

    /* renamed from: d */
    public static Date m81175d(String str) throws ParseException {
        return f37753f.get().parse(str);
    }

    /* renamed from: e */
    public static Date m81174e(String str) throws ParseException {
        return f37752e.get().parse(str);
    }

    /* renamed from: f */
    public static String m81173f(long j) {
        return f37753f.get().format(new Date(j));
    }

    /* renamed from: h */
    public static C36357Uh1 m81171h(File file) throws IOException {
        return m81170i(file.toString());
    }

    /* renamed from: i */
    public static C36357Uh1 m81170i(String str) throws IOException {
        return new C36357Uh1(new C37059Xh1(str));
    }

    /* renamed from: j */
    public static C36357Uh1 m81169j(InterfaceC11183i interfaceC11183i) throws IOException {
        ByteBuffer mo69476e = interfaceC11183i.mo69480A0()[0].mo69476e();
        mo69476e.rewind();
        byte[] bArr = new byte[mo69476e.capacity()];
        mo69476e.get(bArr);
        return m81168k(new ByteArrayInputStream(bArr));
    }

    /* renamed from: k */
    public static C36357Uh1 m81168k(InputStream inputStream) throws IOException {
        return new C36357Uh1(new C37059Xh1(inputStream));
    }

    /* renamed from: n */
    public static List<String> m81165n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    /* renamed from: A */
    public void m81179A() throws IOException {
        if (!this.f37757b) {
            m81178a();
        }
        this.f37756a.m76671W();
    }

    /* renamed from: a */
    public final void m81178a() {
        long currentTimeMillis = System.currentTimeMillis();
        String m81173f = m81173f(currentTimeMillis);
        this.f37756a.m76664b0("DateTime", m81173f);
        try {
            this.f37756a.m76664b0("SubSecTime", Long.toString(currentTimeMillis - m81175d(m81173f).getTime()));
        } catch (ParseException unused) {
        }
    }

    /* renamed from: b */
    public void m81177b(Location location) {
        this.f37756a.m76662c0(location);
    }

    /* renamed from: g */
    public void m81172g(C36357Uh1 c36357Uh1) {
        ArrayList<String> arrayList = new ArrayList(f37754g);
        arrayList.removeAll(f37755h);
        for (String str : arrayList) {
            String m76655g = this.f37756a.m76655g(str);
            String m76655g2 = c36357Uh1.f37756a.m76655g(str);
            if (m76655g != null && !m76655g.equals(m76655g2)) {
                c36357Uh1.f37756a.m76664b0(str, m76655g);
            }
        }
    }

    /* renamed from: l */
    public void m81167l() {
        int i;
        switch (m81161r()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 2;
                break;
        }
        this.f37756a.m76664b0("Orientation", String.valueOf(i));
    }

    /* renamed from: m */
    public void m81166m() {
        int i;
        switch (m81161r()) {
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 4;
                break;
        }
        this.f37756a.m76664b0("Orientation", String.valueOf(i));
    }

    /* renamed from: o */
    public String m81164o() {
        return this.f37756a.m76655g("ImageDescription");
    }

    /* renamed from: p */
    public int m81163p() {
        return this.f37756a.m76651i("ImageLength", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Location m81162q() {
        char c;
        double m81146a;
        String m76655g = this.f37756a.m76655g("GPSProcessingMethod");
        double[] m76645m = this.f37756a.m76645m();
        double m76657f = this.f37756a.m76657f(0.0d);
        double m76653h = this.f37756a.m76653h("GPSSpeed", 0.0d);
        String m76655g2 = this.f37756a.m76655g("GPSSpeedRef");
        if (m76655g2 == null) {
            m76655g2 = "K";
        }
        long m81154y = m81154y(this.f37756a.m76655g("GPSDateStamp"), this.f37756a.m76655g("GPSTimeStamp"));
        if (m76645m == null) {
            return null;
        }
        if (m76655g == null) {
            m76655g = f37750c;
        }
        Location location = new Location(m76655g);
        location.setLatitude(m76645m[0]);
        location.setLongitude(m76645m[1]);
        if (m76657f != 0.0d) {
            location.setAltitude(m76657f);
        }
        if (m76653h != 0.0d) {
            int hashCode = m76655g2.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && m76655g2.equals("N")) {
                        c = 1;
                        if (c == 0) {
                            if (c != 1) {
                                m81146a = C8348d.m81149a(m76653h).m81146a();
                            } else {
                                m81146a = C8348d.m81148b(m76653h).m81146a();
                            }
                        } else {
                            m81146a = C8348d.m81147c(m76653h).m81146a();
                        }
                        location.setSpeed((float) m81146a);
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    location.setSpeed((float) m81146a);
                } else {
                    if (m76655g2.equals("M")) {
                        c = 0;
                        if (c == 0) {
                        }
                        location.setSpeed((float) m81146a);
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    location.setSpeed((float) m81146a);
                }
            } else {
                if (m76655g2.equals("K")) {
                    c = 2;
                    if (c == 0) {
                    }
                    location.setSpeed((float) m81146a);
                }
                c = 65535;
                if (c == 0) {
                }
                location.setSpeed((float) m81146a);
            }
        }
        if (m81154y != -1) {
            location.setTime(m81154y);
        }
        return location;
    }

    /* renamed from: r */
    public int m81161r() {
        return this.f37756a.m76651i("Orientation", 0);
    }

    /* renamed from: s */
    public int m81160s() {
        switch (m81161r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: t */
    public long m81159t() {
        long m81155x = m81155x(this.f37756a.m76655g("DateTimeOriginal"));
        if (m81155x == -1) {
            return -1L;
        }
        String m76655g = this.f37756a.m76655g("SubSecTimeOriginal");
        if (m76655g != null) {
            try {
                long parseLong = Long.parseLong(m76655g);
                while (parseLong > 1000) {
                    parseLong /= 10;
                }
                return m81155x + parseLong;
            } catch (NumberFormatException unused) {
                return m81155x;
            }
        }
        return m81155x;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(m81158u()), Integer.valueOf(m81163p()), Integer.valueOf(m81160s()), Boolean.valueOf(m81156w()), Boolean.valueOf(m81157v()), m81162q(), Long.valueOf(m81159t()), m81164o());
    }

    /* renamed from: u */
    public int m81158u() {
        return this.f37756a.m76651i("ImageWidth", 0);
    }

    /* renamed from: v */
    public boolean m81157v() {
        return m81161r() == 2;
    }

    /* renamed from: w */
    public boolean m81156w() {
        int m81161r = m81161r();
        return m81161r == 4 || m81161r == 5 || m81161r == 7;
    }

    /* renamed from: x */
    public final long m81155x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return m81175d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* renamed from: y */
    public final long m81154y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return m81176c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        } else if (str == null) {
            try {
                return m81174e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        } else {
            return m81155x(str + " " + str2);
        }
    }

    /* renamed from: z */
    public void m81153z(int i) {
        if (i % 90 != 0) {
            C33928Jx2.m99522l(f37750c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i)));
            this.f37756a.m76664b0("Orientation", String.valueOf(0));
            return;
        }
        int i2 = i % 360;
        int m81161r = m81161r();
        while (i2 < 0) {
            i2 += 90;
            switch (m81161r) {
                case 2:
                    m81161r = 5;
                    break;
                case 3:
                case 8:
                    m81161r = 6;
                    break;
                case 4:
                    m81161r = 7;
                    break;
                case 5:
                    m81161r = 4;
                    break;
                case 6:
                    m81161r = 1;
                    break;
                case 7:
                    m81161r = 2;
                    break;
                default:
                    m81161r = 8;
                    break;
            }
        }
        while (i2 > 0) {
            i2 -= 90;
            switch (m81161r) {
                case 2:
                    m81161r = 7;
                    break;
                case 3:
                    m81161r = 8;
                    break;
                case 4:
                    m81161r = 5;
                    break;
                case 5:
                    m81161r = 2;
                    break;
                case 6:
                    m81161r = 3;
                    break;
                case 7:
                    m81161r = 4;
                    break;
                case 8:
                    m81161r = 1;
                    break;
                default:
                    m81161r = 6;
                    break;
            }
        }
        this.f37756a.m76664b0("Orientation", String.valueOf(m81161r));
    }
}
