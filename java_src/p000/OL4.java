package p000;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C31129i;
import zendesk.belvedere.MediaResult;
/* renamed from: OL4 */
/* loaded from: classes8.dex */
public class OL4 extends AsyncTask<Uri, Void, List<MediaResult>> {

    /* renamed from: a */
    public final WeakReference<G80<List<MediaResult>>> f26408a;

    /* renamed from: b */
    public final Context f26409b;

    /* renamed from: c */
    public final ZQ5 f26410c;

    /* renamed from: d */
    public final String f26411d;

    public OL4(Context context, ZQ5 zq5, G80<List<MediaResult>> g80, String str) {
        this.f26409b = context;
        this.f26410c = zq5;
        this.f26411d = str;
        this.f26408a = new WeakReference<>(g80);
    }

    /* renamed from: c */
    public static void m92399c(Context context, ZQ5 zq5, G80<List<MediaResult>> g80, List<Uri> list) {
        m92398d(context, zq5, g80, list, null);
    }

    /* renamed from: d */
    public static void m92398d(Context context, ZQ5 zq5, G80<List<MediaResult>> g80, List<Uri> list, String str) {
        new OL4(context, zq5, g80, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Uri[]) list.toArray(new Uri[list.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0152 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<MediaResult> doInBackground(Uri... uriArr) {
        Uri uri;
        int i;
        Throwable th;
        IOException iOException;
        boolean z;
        boolean z2;
        OL4 ol4 = this;
        Uri[] uriArr2 = uriArr;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[1048576];
        int length = uriArr2.length;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        int i2 = 0;
        while (i2 < length) {
            Uri uri2 = uriArr2[i2];
            try {
                try {
                    inputStream = ol4.f26409b.getContentResolver().openInputStream(uri2);
                    File m73117f = ol4.f26410c.m73117f(ol4.f26409b, uri2, ol4.f26411d);
                    if (inputStream != null && m73117f != null) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[2];
                        objArr[0] = uri2;
                        try {
                            objArr[1] = m73117f;
                            C31129i.m671a("Belvedere", String.format(locale, "Copying media file into private cache - Uri: %s - Dest: %s", objArr));
                            FileOutputStream fileOutputStream2 = new FileOutputStream(m73117f);
                            while (true) {
                                try {
                                    try {
                                        int read = inputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        try {
                                            fileOutputStream2.write(bArr, 0, read);
                                        } catch (FileNotFoundException e) {
                                            e = e;
                                            fileOutputStream = fileOutputStream2;
                                            uri = uri2;
                                            i = 1;
                                            Locale locale2 = Locale.US;
                                            Object[] objArr2 = new Object[i];
                                            objArr2[0] = uri;
                                            C31129i.m669c("Belvedere", String.format(locale2, "File not found error copying file, uri: %s", objArr2), e);
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e2) {
                                                    C31129i.m669c("Belvedere", "Error closing InputStream", e2);
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e3) {
                                                    C31129i.m669c("Belvedere", "Error closing FileOutputStream", e3);
                                                }
                                            }
                                            i2++;
                                            ol4 = this;
                                            uriArr2 = uriArr;
                                        } catch (IOException e4) {
                                            e = e4;
                                            fileOutputStream = fileOutputStream2;
                                            uri = uri2;
                                            i = 1;
                                            Locale locale3 = Locale.US;
                                            Object[] objArr3 = new Object[i];
                                            objArr3[0] = uri;
                                            C31129i.m669c("Belvedere", String.format(locale3, "IO Error copying file, uri: %s", objArr3), e);
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e5) {
                                                    C31129i.m669c("Belvedere", "Error closing InputStream", e5);
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e6) {
                                                    iOException = e6;
                                                    C31129i.m669c("Belvedere", "Error closing FileOutputStream", iOException);
                                                    i2++;
                                                    ol4 = this;
                                                    uriArr2 = uriArr;
                                                }
                                            }
                                            i2++;
                                            ol4 = this;
                                            uriArr2 = uriArr;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = fileOutputStream2;
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException e7) {
                                                C31129i.m669c("Belvedere", "Error closing InputStream", e7);
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e8) {
                                                C31129i.m669c("Belvedere", "Error closing FileOutputStream", e8);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (FileNotFoundException e9) {
                                    e = e9;
                                    uri = uri2;
                                    i = 1;
                                } catch (IOException e10) {
                                    e = e10;
                                    uri = uri2;
                                    i = 1;
                                }
                            }
                            MediaResult m73113j = ZQ5.m73113j(ol4.f26409b, uri2);
                            Uri m73114i = ol4.f26410c.m73114i(ol4.f26409b, m73117f);
                            i = 1;
                            uri = uri2;
                            try {
                                arrayList.add(new MediaResult(m73117f, m73114i, uri, m73117f.getName(), m73113j.m783e(), m73113j.m780i(), m73113j.m778k(), m73113j.m784d()));
                                fileOutputStream = fileOutputStream2;
                            } catch (FileNotFoundException e11) {
                                e = e11;
                                fileOutputStream = fileOutputStream2;
                                Locale locale22 = Locale.US;
                                Object[] objArr22 = new Object[i];
                                objArr22[0] = uri;
                                C31129i.m669c("Belvedere", String.format(locale22, "File not found error copying file, uri: %s", objArr22), e);
                                if (inputStream != null) {
                                }
                                if (fileOutputStream != null) {
                                }
                                i2++;
                                ol4 = this;
                                uriArr2 = uriArr;
                            } catch (IOException e12) {
                                e = e12;
                                fileOutputStream = fileOutputStream2;
                                Locale locale32 = Locale.US;
                                Object[] objArr32 = new Object[i];
                                objArr32[0] = uri;
                                C31129i.m669c("Belvedere", String.format(locale32, "IO Error copying file, uri: %s", objArr32), e);
                                if (inputStream != null) {
                                }
                                if (fileOutputStream != null) {
                                }
                                i2++;
                                ol4 = this;
                                uriArr2 = uriArr;
                            }
                        } catch (FileNotFoundException e13) {
                            e = e13;
                        } catch (IOException e14) {
                            e = e14;
                        }
                    } else {
                        uri = uri2;
                        i = 1;
                        try {
                            Locale locale4 = Locale.US;
                            Object[] objArr4 = new Object[2];
                            if (inputStream == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objArr4[0] = Boolean.valueOf(z);
                            if (m73117f == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objArr4[1] = Boolean.valueOf(z2);
                            C31129i.m667e("Belvedere", String.format(locale4, "Unable to resolve uri. InputStream null = %s, File null = %s", objArr4));
                        } catch (FileNotFoundException e15) {
                            e = e15;
                            Locale locale222 = Locale.US;
                            Object[] objArr222 = new Object[i];
                            objArr222[0] = uri;
                            C31129i.m669c("Belvedere", String.format(locale222, "File not found error copying file, uri: %s", objArr222), e);
                            if (inputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            i2++;
                            ol4 = this;
                            uriArr2 = uriArr;
                        } catch (IOException e16) {
                            e = e16;
                            Locale locale322 = Locale.US;
                            Object[] objArr322 = new Object[i];
                            objArr322[0] = uri;
                            C31129i.m669c("Belvedere", String.format(locale322, "IO Error copying file, uri: %s", objArr322), e);
                            if (inputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            i2++;
                            ol4 = this;
                            uriArr2 = uriArr;
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e17) {
                            C31129i.m669c("Belvedere", "Error closing InputStream", e17);
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e18) {
                            iOException = e18;
                            C31129i.m669c("Belvedere", "Error closing FileOutputStream", iOException);
                            i2++;
                            ol4 = this;
                            uriArr2 = uriArr;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException e19) {
                e = e19;
                uri = uri2;
                i = 1;
            } catch (IOException e20) {
                e = e20;
                uri = uri2;
                i = 1;
            }
            i2++;
            ol4 = this;
            uriArr2 = uriArr;
        }
        return arrayList;
    }

    @Override // android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(List<MediaResult> list) {
        super.onPostExecute(list);
        G80<List<MediaResult>> g80 = this.f26408a.get();
        if (g80 != null) {
            g80.internalSuccess(list);
        } else {
            C31129i.m667e("Belvedere", "Callback null");
        }
    }
}
