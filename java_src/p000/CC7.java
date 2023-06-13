package p000;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: CC7 */
/* loaded from: classes6.dex */
public final class CC7 {

    /* renamed from: a */
    public static final SparseArray f3609a;

    /* renamed from: b */
    public static final SparseArray f3610b;

    /* renamed from: c */
    public static final AtomicReference f3611c;
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d */
    public static final Map f3612d;

    static {
        SparseArray sparseArray = new SparseArray();
        f3609a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f3610b = sparseArray2;
        f3611c = new AtomicReference();
        sparseArray.put(-1, EnumC50244v79.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC50244v79.FORMAT_CODE_128);
        sparseArray.put(2, EnumC50244v79.FORMAT_CODE_39);
        sparseArray.put(4, EnumC50244v79.FORMAT_CODE_93);
        sparseArray.put(8, EnumC50244v79.FORMAT_CODABAR);
        sparseArray.put(16, EnumC50244v79.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC50244v79.FORMAT_EAN_13);
        sparseArray.put(64, EnumC50244v79.FORMAT_EAN_8);
        sparseArray.put(128, EnumC50244v79.FORMAT_ITF);
        sparseArray.put(256, EnumC50244v79.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC50244v79.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC50244v79.FORMAT_UPC_E);
        sparseArray.put(2048, EnumC50244v79.FORMAT_PDF417);
        sparseArray.put(4096, EnumC50244v79.FORMAT_AZTEC);
        sparseArray2.put(0, C79.TYPE_UNKNOWN);
        sparseArray2.put(1, C79.TYPE_CONTACT_INFO);
        sparseArray2.put(2, C79.TYPE_EMAIL);
        sparseArray2.put(3, C79.TYPE_ISBN);
        sparseArray2.put(4, C79.TYPE_PHONE);
        sparseArray2.put(5, C79.TYPE_PRODUCT);
        sparseArray2.put(6, C79.TYPE_SMS);
        sparseArray2.put(7, C79.TYPE_TEXT);
        sparseArray2.put(8, C79.TYPE_URL);
        sparseArray2.put(9, C79.TYPE_WIFI);
        sparseArray2.put(10, C79.TYPE_GEO);
        sparseArray2.put(11, C79.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, C79.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f3612d = hashMap;
        hashMap.put(1, EnumC50016uk9.CODE_128);
        hashMap.put(2, EnumC50016uk9.CODE_39);
        hashMap.put(4, EnumC50016uk9.CODE_93);
        hashMap.put(8, EnumC50016uk9.CODABAR);
        hashMap.put(16, EnumC50016uk9.DATA_MATRIX);
        hashMap.put(32, EnumC50016uk9.EAN_13);
        hashMap.put(64, EnumC50016uk9.EAN_8);
        hashMap.put(128, EnumC50016uk9.ITF);
        hashMap.put(256, EnumC50016uk9.QR_CODE);
        hashMap.put(512, EnumC50016uk9.UPC_A);
        hashMap.put(1024, EnumC50016uk9.UPC_E);
        hashMap.put(2048, EnumC50016uk9.PDF417);
        hashMap.put(4096, EnumC50016uk9.AZTEC);
    }

    /* renamed from: a */
    public static EnumC50244v79 m112618a(int i) {
        EnumC50244v79 enumC50244v79 = (EnumC50244v79) f3609a.get(i);
        if (enumC50244v79 == null) {
            return EnumC50244v79.FORMAT_UNKNOWN;
        }
        return enumC50244v79;
    }

    /* renamed from: b */
    public static C79 m112617b(int i) {
        C79 c79 = (C79) f3610b.get(i);
        if (c79 == null) {
            return C79.TYPE_UNKNOWN;
        }
        return c79;
    }

    /* renamed from: c */
    public static Lk9 m112616c(C9555Xx c9555Xx) {
        int m76030a = c9555Xx.m76030a();
        JQ7 jq7 = new JQ7();
        if (m76030a == 0) {
            jq7.m100495f(f3612d.values());
        } else {
            for (Map.Entry entry : f3612d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & m76030a) != 0) {
                    jq7.m100496e((EnumC50016uk9) entry.getValue());
                }
            }
        }
        Ak9 ak9 = new Ak9();
        ak9.m115313b(jq7.m100494g());
        return ak9.m115312c();
    }

    /* renamed from: d */
    public static String m112615d() {
        return true != m112613f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    /* renamed from: e */
    public static void m112614e(C40559en9 c40559en9, final G59 g59) {
        c40559en9.m42548f(new Ym9() { // from class: ff7
            @Override // p000.Ym9
            public final Rl9 zza() {
                EnumC52003y59 enumC52003y59;
                G59 g592 = G59.this;
                W59 w59 = new W59();
                if (CC7.m112613f()) {
                    enumC52003y59 = EnumC52003y59.TYPE_THICK;
                } else {
                    enumC52003y59 = EnumC52003y59.TYPE_THIN;
                }
                w59.m78840e(enumC52003y59);
                C40768f89 c40768f89 = new C40768f89();
                c40768f89.m41949b(g592);
                w59.m78837h(c40768f89.m41948c());
                return C51231wn9.m6314d(w59);
            }
        }, O59.ON_DEVICE_BARCODE_LOAD);
    }

    /* renamed from: f */
    public static boolean m112613f() {
        AtomicReference atomicReference = f3611c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean m102058b = IT8.m102058b(C52226yU2.m3451c().m3452b());
        atomicReference.set(Boolean.valueOf(m102058b));
        return m102058b;
    }
}
