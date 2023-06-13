package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.C34386Lw1;
/* renamed from: yw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52499yw1 {

    /* renamed from: a */
    public static final Comparator<byte[]> f120430a = new Comparator() { // from class: xw1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m2241g;
            m2241g = C52499yw1.m2241g((byte[]) obj, (byte[]) obj2);
            return m2241g;
        }
    };

    /* renamed from: yw1$a */
    /* loaded from: classes.dex */
    public static class C30782a {
        private C30782a() {
        }

        /* renamed from: a */
        public static Cursor m2239a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private C52499yw1() {
    }

    /* renamed from: b */
    public static List<byte[]> m2246b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m2245c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static List<List<byte[]>> m2244d(C53092zw1 c53092zw1, Resources resources) {
        if (c53092zw1.m106b() != null) {
            return c53092zw1.m106b();
        }
        return C32514Dw1.m109617c(resources, c53092zw1.m105c());
    }

    /* renamed from: e */
    public static C34386Lw1.C5131a m2243e(Context context, C53092zw1 c53092zw1, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo m2242f = m2242f(context.getPackageManager(), c53092zw1, context.getResources());
        if (m2242f == null) {
            return C34386Lw1.C5131a.m96114a(1, null);
        }
        return C34386Lw1.C5131a.m96114a(0, m2240h(context, c53092zw1, m2242f.authority, cancellationSignal));
    }

    /* renamed from: f */
    public static ProviderInfo m2242f(PackageManager packageManager, C53092zw1 c53092zw1, Resources resources) throws PackageManager.NameNotFoundException {
        String m103e = c53092zw1.m103e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m103e, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(c53092zw1.m102f())) {
                List<byte[]> m2246b = m2246b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(m2246b, f120430a);
                List<List<byte[]>> m2244d = m2244d(c53092zw1, resources);
                for (int i = 0; i < m2244d.size(); i++) {
                    ArrayList arrayList = new ArrayList(m2244d.get(i));
                    Collections.sort(arrayList, f120430a);
                    if (m2245c(m2246b, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + m103e + ", but package was not " + c53092zw1.m102f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + m103e);
    }

    /* renamed from: g */
    public static /* synthetic */ int m2241g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static C34386Lw1.C5132b[] m2240h(Context context, C53092zw1 c53092zw1, String str, CancellationSignal cancellationSignal) {
        int i;
        int i2;
        int i3;
        Uri withAppendedId;
        int i4;
        int i5;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i6 = 0;
            cursor = C30782a.m2239a(context.getContentResolver(), build, new String[]{TransferTable.COLUMN_ID, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c53092zw1.m101g()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex(TransferTable.COLUMN_ID);
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = i6;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor.getInt(columnIndex4);
                    } else {
                        i2 = i6;
                    }
                    if (columnIndex3 == -1) {
                        i3 = i;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i3 = i;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i4 = cursor.getInt(columnIndex5);
                    } else {
                        i4 = 400;
                    }
                    if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                        i5 = i3;
                        z = true;
                    } else {
                        i5 = i3;
                        z = false;
                    }
                    arrayList2.add(C34386Lw1.C5132b.m96111a(withAppendedId, i2, i4, z, i5));
                    i6 = 0;
                }
                arrayList = arrayList2;
            }
            return (C34386Lw1.C5132b[]) arrayList.toArray(new C34386Lw1.C5132b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
