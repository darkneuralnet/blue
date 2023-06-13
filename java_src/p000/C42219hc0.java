package p000;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* renamed from: hc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42219hc0 {
    private C42219hc0() {
    }

    /* renamed from: a */
    public static String m36166a(C35600Rb0 c35600Rb0, Integer num, List<String> list) throws CameraAccessExceptionCompat {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) c35600Rb0.m86590c("0").m78176a(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
                return null;
            }
            return "1";
        } else if (num.intValue() != 0 || ((Integer) c35600Rb0.m86590c("1").m78176a(CameraCharacteristics.LENS_FACING)).intValue() != 0) {
            return null;
        } else {
            return "0";
        }
    }

    /* renamed from: b */
    public static List<String> m36165b(C49663u90 c49663u90, C42812ic0 c42812ic0) throws InitializationException {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(c49663u90.mo10787d().m86589d());
            if (c42812ic0 == null) {
                for (String str2 : asList) {
                    arrayList.add(str2);
                }
                return arrayList;
            }
            try {
                str = m36166a(c49663u90.mo10787d(), c42812ic0.m33761d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : asList) {
                if (!str3.equals(str)) {
                    arrayList2.add(c49663u90.m10785f(str3));
                }
            }
            Iterator<InterfaceC33728Jb0> it = c42812ic0.m33763b(arrayList2).iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC33962Kb0) it.next()).mo98721a());
            }
            return arrayList;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(C46963pc0.m19068a(e));
        } catch (CameraUnavailableException e2) {
            throw new InitializationException(e2);
        }
    }
}
