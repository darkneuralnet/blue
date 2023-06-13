package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.IOException;
import p000.C42732iT3;
import p000.PI4;
/* renamed from: IP2 */
/* loaded from: classes6.dex */
public class IP2 extends GA0 {

    /* renamed from: b */
    public static final String[] f15453b = {"orientation"};

    /* renamed from: IP2$a */
    /* loaded from: classes6.dex */
    public enum EnumC3529a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: b */
        public final int f15458b;

        /* renamed from: c */
        public final int f15459c;

        /* renamed from: d */
        public final int f15460d;

        EnumC3529a(int i, int i2, int i3) {
            this.f15458b = i;
            this.f15459c = i2;
            this.f15460d = i3;
        }
    }

    public IP2(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1.close();
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m102419k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, f15453b, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int i = cursor.getInt(0);
                cursor.close();
                return i;
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: l */
    public static EnumC3529a m102418l(int i, int i2) {
        EnumC3529a enumC3529a = EnumC3529a.MICRO;
        if (i <= enumC3529a.f15459c && i2 <= enumC3529a.f15460d) {
            return enumC3529a;
        }
        EnumC3529a enumC3529a2 = EnumC3529a.MINI;
        if (i <= enumC3529a2.f15459c && i2 <= enumC3529a2.f15460d) {
            return enumC3529a2;
        }
        return EnumC3529a.FULL;
    }

    @Override // p000.GA0, p000.PI4
    /* renamed from: c */
    public boolean mo11130c(C47378qI4 c47378qI4) {
        Uri uri = c47378qI4.f105059d;
        if ("content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    @Override // p000.GA0, p000.PI4
    /* renamed from: f */
    public PI4.C6313a mo11129f(C47378qI4 c47378qI4, int i) throws IOException {
        boolean z;
        Bitmap thumbnail;
        int i2;
        ContentResolver contentResolver = this.f11074a.getContentResolver();
        int m102419k = m102419k(contentResolver, c47378qI4.f105059d);
        String type = contentResolver.getType(c47378qI4.f105059d);
        if (type != null && type.startsWith("video/")) {
            z = true;
        } else {
            z = false;
        }
        if (c47378qI4.m17648c()) {
            EnumC3529a m102418l = m102418l(c47378qI4.f105063h, c47378qI4.f105064i);
            if (!z && m102418l == EnumC3529a.FULL) {
                return new PI4.C6313a(null, C34928Oe3.m91751l(m105671j(c47378qI4)), C42732iT3.EnumC23266e.DISK, m102419k);
            }
            long parseId = ContentUris.parseId(c47378qI4.f105059d);
            BitmapFactory.Options m90496d = PI4.m90496d(c47378qI4);
            m90496d.inJustDecodeBounds = true;
            PI4.m90498a(c47378qI4.f105063h, c47378qI4.f105064i, m102418l.f15459c, m102418l.f15460d, m90496d, c47378qI4);
            if (z) {
                if (m102418l == EnumC3529a.FULL) {
                    i2 = 1;
                } else {
                    i2 = m102418l.f15458b;
                }
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i2, m90496d);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, m102418l.f15458b, m90496d);
            }
            if (thumbnail != null) {
                return new PI4.C6313a(thumbnail, null, C42732iT3.EnumC23266e.DISK, m102419k);
            }
        }
        return new PI4.C6313a(null, C34928Oe3.m91751l(m105671j(c47378qI4)), C42732iT3.EnumC23266e.DISK, m102419k);
    }
}
