package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C31129i;
import zendesk.belvedere.MediaIntent;
import zendesk.belvedere.MediaResult;
/* renamed from: EP2 */
/* loaded from: classes8.dex */
public class EP2 {

    /* renamed from: a */
    public final ZQ5 f7417a;

    /* renamed from: b */
    public final Y52 f7418b;

    /* renamed from: c */
    public final Context f7419c;

    public EP2(Context context, ZQ5 zq5, Y52 y52) {
        this.f7419c = context;
        this.f7417a = zq5;
        this.f7418b = y52;
    }

    /* renamed from: a */
    public final boolean m109045a(Context context) {
        return m109039g(context);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public final List<Uri> m109044b(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (itemAt.getUri() != null) {
                    arrayList.add(itemAt.getUri());
                }
            }
        } else if (intent.getData() != null) {
            arrayList.add(intent.getData());
        }
        return arrayList;
    }

    /* renamed from: c */
    public C48526sE3<MediaIntent, MediaResult> m109043c(int i) {
        if (m109045a(this.f7419c)) {
            return m109036j(this.f7419c, i);
        }
        return new C48526sE3<>(MediaIntent.m795e(), null);
    }

    @TargetApi(19)
    /* renamed from: d */
    public final Intent m109042d(String str, boolean z, List<String> list) {
        C31129i.m671a("Belvedere", "Gallery Intent, using 'ACTION_OPEN_DOCUMENT'");
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType(str);
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        if (list != null && !list.isEmpty()) {
            intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) list.toArray(new String[0]));
        }
        return intent;
    }

    /* renamed from: e */
    public void m109041e(Context context, int i, int i2, Intent intent, G80<List<MediaResult>> g80, boolean z) {
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        MediaResult m75759b = this.f7418b.m75759b(i);
        if (m75759b != null) {
            if (m75759b.m785c() != null && m75759b.m779j() != null) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                if (i2 == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objArr[0] = Boolean.valueOf(z3);
                C31129i.m671a("Belvedere", String.format(locale, "Parsing activity result - Camera - Ok: %s", objArr));
                this.f7417a.m73110m(context, m75759b.m779j(), 3);
                if (i2 == -1) {
                    MediaResult m73113j = ZQ5.m73113j(context, m75759b.m779j());
                    arrayList.add(new MediaResult(m75759b.m785c(), m75759b.m779j(), m75759b.m781h(), m75759b.m782g(), m73113j.m783e(), m73113j.m780i(), m73113j.m778k(), m73113j.m784d()));
                    C31129i.m671a("Belvedere", String.format(locale, "Image from camera: %s", m75759b.m785c()));
                }
                this.f7418b.m75760a(i);
            } else {
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[1];
                if (i2 == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objArr2[0] = Boolean.valueOf(z2);
                C31129i.m671a("Belvedere", String.format(locale2, "Parsing activity result - Gallery - Ok: %s", objArr2));
                if (i2 == -1) {
                    List<Uri> m109044b = m109044b(intent);
                    C31129i.m671a("Belvedere", String.format(locale2, "Number of items received from gallery: %s", Integer.valueOf(m109044b.size())));
                    if (z) {
                        C31129i.m671a("Belvedere", "Resolving items");
                        OL4.m92399c(context, this.f7417a, g80, m109044b);
                        return;
                    }
                    C31129i.m671a("Belvedere", "Resolving items turned off");
                    for (Uri uri : m109044b) {
                        arrayList.add(ZQ5.m73113j(context, uri));
                    }
                }
            }
        }
        if (g80 != null) {
            g80.internalSuccess(arrayList);
        }
    }

    /* renamed from: f */
    public MediaIntent m109040f(int i, String str, boolean z, List<String> list) {
        if (m109038h(this.f7419c)) {
            return new MediaIntent(i, m109042d(str, z, list), null, true, 1);
        }
        return MediaIntent.m795e();
    }

    /* renamed from: g */
    public final boolean m109039g(Context context) {
        boolean z;
        Intent intent = new Intent();
        intent.setAction("android.media.action.IMAGE_CAPTURE");
        PackageManager packageManager = context.getPackageManager();
        if (!packageManager.hasSystemFeature("android.hardware.camera") && !packageManager.hasSystemFeature("android.hardware.camera.front")) {
            z = false;
        } else {
            z = true;
        }
        boolean m109037i = m109037i(intent, context);
        C31129i.m671a("Belvedere", String.format(Locale.US, "Camera present: %b, Camera App present: %b", Boolean.valueOf(z), Boolean.valueOf(m109037i)));
        if (!z || !m109037i) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m109038h(Context context) {
        return m109037i(m109042d("*/*", false, new ArrayList()), context);
    }

    /* renamed from: i */
    public final boolean m109037i(Intent intent, Context context) {
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final C48526sE3<MediaIntent, MediaResult> m109036j(Context context, int i) {
        boolean z;
        String str;
        File m73118e = this.f7417a.m73118e(context);
        if (m73118e == null) {
            C31129i.m667e("Belvedere", "Camera Intent: Image path is null. There's something wrong with the storage.");
            return null;
        }
        Uri m73114i = this.f7417a.m73114i(context, m73118e);
        if (m73114i == null) {
            C31129i.m667e("Belvedere", "Camera Intent: Uri to file is null. There's something wrong with the storage or FileProvider configuration.");
            return null;
        }
        C31129i.m671a("Belvedere", String.format(Locale.US, "Camera Intent: Request Id: %s - File: %s - Uri: %s", Integer.valueOf(i), m73118e, m73114i));
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", m73114i);
        this.f7417a.m73111l(context, intent, m73114i, 3);
        if (C39139cR3.m61310a(context, "android.permission.CAMERA") && !C39139cR3.m61309b(context, "android.permission.CAMERA")) {
            z = true;
        } else {
            z = false;
        }
        MediaResult m73113j = ZQ5.m73113j(context, m73114i);
        MediaResult mediaResult = new MediaResult(m73118e, m73114i, m73114i, m73118e.getName(), m73113j.m783e(), m73113j.m780i(), m73113j.m778k(), m73113j.m784d());
        if (z) {
            str = "android.permission.CAMERA";
        } else {
            str = null;
        }
        return new C48526sE3<>(new MediaIntent(i, intent, str, true, 2), mediaResult);
    }
}
