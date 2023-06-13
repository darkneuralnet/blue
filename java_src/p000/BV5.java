package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeConstants;
/* renamed from: BV5 */
/* loaded from: classes.dex */
public final class BV5 {

    /* renamed from: c */
    public final String f2430c;

    /* renamed from: d */
    public final T80 f2431d;

    /* renamed from: e */
    public final C36761Wa0 f2432e;

    /* renamed from: f */
    public final C36600Vi1 f2433f;

    /* renamed from: g */
    public final int f2434g;

    /* renamed from: h */
    public boolean f2435h;

    /* renamed from: i */
    public boolean f2436i;

    /* renamed from: j */
    public AbstractC44540lW5 f2437j;

    /* renamed from: k */
    public final C42509i51 f2438k;

    /* renamed from: a */
    public final List<CV5> f2428a = new ArrayList();

    /* renamed from: b */
    public final List<CV5> f2429b = new ArrayList();

    /* renamed from: l */
    public final KL4 f2439l = new KL4();

    public BV5(Context context, String str, C35600Rb0 c35600Rb0, T80 t80) throws CameraUnavailableException {
        int i;
        this.f2435h = false;
        this.f2436i = false;
        String str2 = (String) HZ3.m103731g(str);
        this.f2430c = str2;
        this.f2431d = (T80) HZ3.m103731g(t80);
        this.f2433f = new C36600Vi1();
        this.f2438k = C42509i51.m34487b(context);
        try {
            C36761Wa0 m86590c = c35600Rb0.m86590c(str2);
            this.f2432e = m86590c;
            Integer num = (Integer) m86590c.m78176a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            this.f2434g = i;
            int[] iArr = (int[]) m86590c.m78176a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 3) {
                        this.f2435h = true;
                    } else if (i2 == 6) {
                        this.f2436i = true;
                    }
                }
            }
            m113958e();
            if (context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                m113959d();
            }
            m113957f();
            m113962a();
        } catch (CameraAccessExceptionCompat e) {
            throw C46963pc0.m19068a(e);
        }
    }

    /* renamed from: c */
    public static Range<Integer> m113960c(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double m113951l = m113951l(range2.intersect(range));
        double m113951l2 = m113951l(range3.intersect(range));
        double m113951l3 = m113951l2 / m113951l(range3);
        double m113951l4 = m113951l / m113951l(range2);
        int i = (m113951l2 > m113951l ? 1 : (m113951l2 == m113951l ? 0 : -1));
        if (i > 0) {
            if (m113951l3 >= 0.5d || m113951l3 >= m113951l4) {
                return range3;
            }
        } else if (i == 0) {
            int i2 = (m113951l3 > m113951l4 ? 1 : (m113951l3 == m113951l4 ? 0 : -1));
            if (i2 > 0) {
                return range3;
            }
            if (i2 == 0 && range3.getLower().intValue() > range2.getLower().intValue()) {
                return range3;
            }
        } else if (m113951l4 < 0.5d && m113951l3 > m113951l4) {
            return range3;
        }
        return range2;
    }

    /* renamed from: i */
    public static int m113954i(C36761Wa0 c36761Wa0, int i, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) c36761Wa0.m78176a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: k */
    public static int m113952k(Range<Integer> range, Range<Integer> range2) {
        boolean z;
        if (!range.contains((Range<Integer>) range2.getUpper()) && !range.contains((Range<Integer>) range2.getLower())) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103728j(z, "Ranges must not intersect");
        if (range.getLower().intValue() > range2.getUpper().intValue()) {
            return range.getLower().intValue() - range2.getUpper().intValue();
        }
        return range2.getLower().intValue() - range.getUpper().intValue();
    }

    /* renamed from: l */
    public static int m113951l(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    /* renamed from: a */
    public final void m113962a() {
    }

    /* renamed from: b */
    public boolean m113961b(boolean z, List<DV5> list) {
        List<CV5> list2;
        if (z) {
            list2 = this.f2429b;
        } else {
            list2 = this.f2428a;
        }
        Iterator<CV5> it = list2.iterator();
        boolean z2 = false;
        while (it.hasNext() && !(z2 = it.next().m112183d(list))) {
        }
        return z2;
    }

    /* renamed from: d */
    public final void m113959d() {
        this.f2429b.addAll(C49710uE1.m10533c());
    }

    /* renamed from: e */
    public final void m113958e() {
        this.f2428a.addAll(C49710uE1.m10535a(this.f2434g, this.f2435h, this.f2436i));
        this.f2428a.addAll(this.f2433f.m79548a(this.f2430c, this.f2434g));
    }

    /* renamed from: f */
    public final void m113957f() {
        this.f2437j = AbstractC44540lW5.m27189a(new Size(640, 480), new Size(1280, 720), this.f2438k.m34485d(), new Size(1920, DateTimeConstants.MINUTES_PER_DAY), m113950m());
    }

    /* renamed from: g */
    public final List<List<Size>> m113956g(List<List<Size>> list) {
        int i = 1;
        for (List<Size> list2 : list) {
            i *= list2.size();
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new ArrayList());
            }
            int size = i / list.get(0).size();
            int i3 = i;
            for (int i4 = 0; i4 < list.size(); i4++) {
                List<Size> list3 = list.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    ((List) arrayList.get(i5)).add(list3.get((i5 % i3) / size));
                }
                if (i4 < list.size() - 1) {
                    i3 = size;
                    size /= list.get(i4 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    /* renamed from: h */
    public final Range<Integer> m113955h(Range<Integer> range, int i) {
        if (range == null) {
            return BR5.f2318a;
        }
        Range<Integer>[] rangeArr = (Range[]) this.f2432e.m78176a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null) {
            return BR5.f2318a;
        }
        Range<Integer> range2 = new Range<>(Integer.valueOf(Math.min(range.getLower().intValue(), i)), Integer.valueOf(Math.min(range.getUpper().intValue(), i)));
        Range<Integer> range3 = BR5.f2318a;
        int i2 = 0;
        for (Range<Integer> range4 : rangeArr) {
            if (i >= range4.getLower().intValue()) {
                if (range3.equals(BR5.f2318a)) {
                    range3 = range4;
                }
                if (range4.equals(range2)) {
                    return range4;
                }
                try {
                    int m113951l = m113951l(range4.intersect(range2));
                    if (i2 == 0) {
                        i2 = m113951l;
                    } else {
                        if (m113951l >= i2) {
                            range3 = m113960c(range2, range3, range4);
                            i2 = m113951l(range2.intersect(range3));
                        }
                        range4 = range3;
                    }
                } catch (IllegalArgumentException unused) {
                    if (i2 == 0) {
                        if (m113952k(range4, range2) >= m113952k(range3, range2)) {
                            if (m113952k(range4, range2) == m113952k(range3, range2)) {
                                if (range4.getLower().intValue() <= range3.getUpper().intValue() && m113951l(range4) >= m113951l(range3)) {
                                }
                            }
                        }
                    }
                }
                range3 = range4;
            }
        }
        return range3;
    }

    /* renamed from: j */
    public Size m113953j(int i) {
        Size[] outputSizes;
        StreamConfigurationMap m19304c = this.f2432e.m78175b().m19304c();
        if (i == 34) {
            outputSizes = m19304c.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = m19304c.getOutputSizes(i);
        }
        return (Size) Collections.max(Arrays.asList(outputSizes), new C36194Tp0());
    }

    /* renamed from: m */
    public final Size m113950m() {
        CamcorderProfile camcorderProfile;
        try {
            int parseInt = Integer.parseInt(this.f2430c);
            if (this.f2431d.mo39154b(parseInt, 1)) {
                camcorderProfile = this.f2431d.mo39155a(parseInt, 1);
            } else {
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            return m113949n(parseInt);
        } catch (NumberFormatException unused) {
            return m113948o();
        }
    }

    /* renamed from: n */
    public final Size m113949n(int i) {
        CamcorderProfile camcorderProfile;
        Size size = IB5.f14644d;
        if (this.f2431d.mo39154b(i, 10)) {
            camcorderProfile = this.f2431d.mo39155a(i, 10);
        } else if (this.f2431d.mo39154b(i, 8)) {
            camcorderProfile = this.f2431d.mo39155a(i, 8);
        } else if (this.f2431d.mo39154b(i, 12)) {
            camcorderProfile = this.f2431d.mo39155a(i, 12);
        } else if (this.f2431d.mo39154b(i, 6)) {
            camcorderProfile = this.f2431d.mo39155a(i, 6);
        } else if (this.f2431d.mo39154b(i, 5)) {
            camcorderProfile = this.f2431d.mo39155a(i, 5);
        } else if (this.f2431d.mo39154b(i, 4)) {
            camcorderProfile = this.f2431d.mo39155a(i, 4);
        } else {
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        return size;
    }

    /* renamed from: o */
    public final Size m113948o() {
        Size[] outputSizes = this.f2432e.m78175b().m19304c().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return IB5.f14644d;
        }
        Arrays.sort(outputSizes, new C36194Tp0(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = IB5.f14646f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return IB5.f14644d;
    }

    /* renamed from: p */
    public Map<InterfaceC11225s<?>, BR5> m113947p(boolean z, List<AbstractC28413sp> list, Map<InterfaceC11225s<?>, List<Size>> map) {
        String str;
        Range<Integer> range;
        BR5 mo31668a;
        boolean z2;
        List<Size> list2;
        String str2;
        Size size;
        m113943t();
        ArrayList arrayList = new ArrayList();
        for (AbstractC28413sp abstractC28413sp : list) {
            arrayList.add(abstractC28413sp.mo13608d());
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Iterator<InterfaceC11225s<?>> it = arrayList2.iterator();
        while (true) {
            Size size2 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC11225s<?> next = it.next();
            if (z) {
                size2 = m113953j(next.mo69364l());
            }
            arrayList.add(DV5.m110346f(z, next.mo69364l(), new Size(640, 480), this.f2437j, size2));
        }
        String str3 = " New configs: ";
        if (m113961b(z, arrayList)) {
            Range<Integer> range2 = null;
            int i = Integer.MAX_VALUE;
            for (AbstractC28413sp abstractC28413sp2 : list) {
                range2 = m113945r(abstractC28413sp2.mo13607e(), range2);
                i = m113946q(i, abstractC28413sp2.mo13610b(), abstractC28413sp2.mo13609c());
            }
            List<Integer> m113944s = m113944s(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Integer num : m113944s) {
                InterfaceC11225s<?> interfaceC11225s = arrayList2.get(num.intValue());
                arrayList3.add(this.f2439l.m99002a(DV5.m110348d(interfaceC11225s.mo69364l()), map.get(interfaceC11225s)));
            }
            List<List<Size>> m113956g = m113956g(arrayList3);
            for (Integer num2 : m113944s) {
                range2 = m113945r(arrayList2.get(num2.intValue()).m69274M(null), range2);
            }
            Iterator<List<Size>> it2 = m113956g.iterator();
            List<Size> list3 = null;
            int i2 = Integer.MAX_VALUE;
            while (true) {
                if (it2.hasNext()) {
                    List<Size> next2 = it2.next();
                    ArrayList arrayList4 = new ArrayList();
                    for (AbstractC28413sp abstractC28413sp3 : list) {
                        arrayList4.add(abstractC28413sp3.mo13608d());
                    }
                    Iterator<List<Size>> it3 = it2;
                    int i3 = i;
                    int i4 = 0;
                    while (i4 < next2.size()) {
                        Size size3 = next2.get(i4);
                        List<Size> list4 = list3;
                        InterfaceC11225s<?> interfaceC11225s2 = arrayList2.get(m113944s.get(i4).intValue());
                        if (z) {
                            list2 = next2;
                            size = m113953j(interfaceC11225s2.mo69364l());
                            str2 = str3;
                        } else {
                            list2 = next2;
                            str2 = str3;
                            size = null;
                        }
                        arrayList4.add(DV5.m110346f(z, interfaceC11225s2.mo69364l(), size3, this.f2437j, size));
                        i3 = m113946q(i3, interfaceC11225s2.mo69364l(), size3);
                        i4++;
                        next2 = list2;
                        list3 = list4;
                        str3 = str2;
                    }
                    str = str3;
                    List<Size> list5 = list3;
                    List<Size> list6 = next2;
                    if (range2 != null && i > i3 && i3 < range2.getLower().intValue()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (m113961b(z, arrayList4)) {
                        if (i2 == Integer.MAX_VALUE || i2 < i3) {
                            i2 = i3;
                            list3 = list6;
                        } else {
                            list3 = list5;
                        }
                        if (z2) {
                            i2 = i3;
                            list3 = list6;
                            break;
                        }
                    } else {
                        list3 = list5;
                    }
                    it2 = it3;
                    str3 = str;
                } else {
                    str = str3;
                    break;
                }
            }
            if (list3 != null) {
                if (range2 != null) {
                    range = m113955h(range2, i2);
                } else {
                    range = null;
                }
                HashMap hashMap = new HashMap();
                for (InterfaceC11225s<?> interfaceC11225s3 : arrayList2) {
                    if (range != null) {
                        mo31668a = BR5.m114036a(list3.get(m113944s.indexOf(Integer.valueOf(arrayList2.indexOf(interfaceC11225s3))))).mo31667b(range).mo31668a();
                    } else {
                        mo31668a = BR5.m114036a(list3.get(m113944s.indexOf(Integer.valueOf(arrayList2.indexOf(interfaceC11225s3))))).mo31668a();
                    }
                    hashMap.put(interfaceC11225s3, mo31668a);
                }
                return hashMap;
            }
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f2430c + " and Hardware level: " + this.f2434g + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str + arrayList2);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f2430c + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList2);
    }

    /* renamed from: q */
    public final int m113946q(int i, int i2, Size size) {
        return Math.min(i, m113954i(this.f2432e, i2, size));
    }

    /* renamed from: r */
    public final Range<Integer> m113945r(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    /* renamed from: s */
    public final List<Integer> m113944s(List<InterfaceC11225s<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        for (InterfaceC11225s<?> interfaceC11225s : list) {
            int m69270r = interfaceC11225s.m69270r(0);
            if (!arrayList2.contains(Integer.valueOf(m69270r))) {
                arrayList2.add(Integer.valueOf(m69270r));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer num : arrayList2) {
            int intValue = num.intValue();
            for (InterfaceC11225s<?> interfaceC11225s2 : list) {
                if (intValue == interfaceC11225s2.m69270r(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(interfaceC11225s2)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    public final void m113943t() {
        this.f2438k.m34484e();
        if (this.f2437j == null) {
            m113957f();
            return;
        }
        this.f2437j = AbstractC44540lW5.m27189a(this.f2437j.mo22220b(), this.f2437j.mo22216f(), this.f2438k.m34485d(), this.f2437j.mo22217e(), this.f2437j.mo22218d());
    }

    /* renamed from: u */
    public DV5 m113942u(boolean z, int i, Size size) {
        Size size2;
        if (z) {
            size2 = m113953j(i);
        } else {
            size2 = null;
        }
        return DV5.m110346f(z, i, size, this.f2437j, size2);
    }
}
