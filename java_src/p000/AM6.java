package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import co.bird.android.model.Detail;
import com.google.android.play.core.common.LocalTestingException;
import com.stripe.android.core.networking.AnalyticsFields;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: AM6 */
/* loaded from: classes6.dex */
public final class AM6 implements InterfaceC40920fP6 {

    /* renamed from: h */
    public static final C42061hK6 f427h = new C42061hK6("FakeAssetPackService");

    /* renamed from: i */
    public static final AtomicInteger f428i = new AtomicInteger(1);

    /* renamed from: a */
    public final String f429a;

    /* renamed from: b */
    public final BK6 f430b;

    /* renamed from: c */
    public final C51556xL6 f431c;

    /* renamed from: d */
    public final Context f432d;

    /* renamed from: e */
    public final MM6 f433e;

    /* renamed from: f */
    public final InterfaceC46230oM6<Executor> f434f;

    /* renamed from: g */
    public final Handler f435g = new Handler(Looper.getMainLooper());

    public AM6(File file, BK6 bk6, C51556xL6 c51556xL6, Context context, MM6 mm6, InterfaceC46230oM6<Executor> interfaceC46230oM6) {
        this.f429a = file.getAbsolutePath();
        this.f430b = bk6;
        this.f431c = c51556xL6;
        this.f432d = context;
        this.f433e = mm6;
        this.f434f = interfaceC46230oM6;
    }

    /* renamed from: g */
    public static long m115863g(int i, long j) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return j;
            }
            return 0L;
        }
        return j / 2;
    }

    /* renamed from: l */
    public static String m115859l(File file) throws LocalTestingException {
        try {
            return BM6.m114072a(Arrays.asList(file));
        } catch (IOException e) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e2);
        }
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: a */
    public final void mo10450a(int i) {
        f427h.m36535d("notifySessionFailed", new Object[0]);
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: b */
    public final void mo10449b(int i, String str, String str2, int i2) {
        f427h.m36535d("notifyChunkTransferred", new Object[0]);
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: c */
    public final void mo10448c(final int i, final String str) {
        f427h.m36535d("notifyModuleCompleted", new Object[0]);
        this.f434f.m21257a().execute(new Runnable(this, i, str) { // from class: xM6

            /* renamed from: b */
            public final AM6 f117468b;

            /* renamed from: c */
            public final int f117469c;

            /* renamed from: d */
            public final String f117470d;

            {
                this.f117468b = this;
                this.f117469c = i;
                this.f117470d = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f117468b.m115861i(this.f117469c, this.f117470d);
            }
        });
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: d */
    public final XY5<List<String>> mo10447d(Map<String, Long> map) {
        f427h.m36535d("syncPacks()", new Object[0]);
        return CZ5.m112114a(new ArrayList());
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: e */
    public final XY5<ParcelFileDescriptor> mo10446e(int i, String str, String str2, int i2) {
        File[] m115860k;
        int i3;
        f427h.m36535d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C37929aO6 c37929aO6 = new C37929aO6();
        try {
        } catch (LocalTestingException e) {
            f427h.m36534e("getChunkFileDescriptor failed", e);
            c37929aO6.m71488b(e);
        } catch (FileNotFoundException e2) {
            f427h.m36534e("getChunkFileDescriptor failed", e2);
            c37929aO6.m71488b(new LocalTestingException("Asset Slice file not found.", e2));
        }
        for (File file : m115860k(str)) {
            if (MK6.m95440b(file).equals(str2)) {
                c37929aO6.m71489a(ParcelFileDescriptor.open(file, 268435456));
                return c37929aO6.m71487c();
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: f */
    public final void mo10445f(List<String> list) {
        f427h.m36535d("cancelDownload(%s)", list);
    }

    /* renamed from: h */
    public final /* synthetic */ void m115862h(Intent intent) {
        this.f430b.mo61428a(this.f432d, intent);
    }

    /* renamed from: i */
    public final /* synthetic */ void m115861i(int i, String str) {
        try {
            m115858m(i, str, 4);
        } catch (LocalTestingException e) {
            f427h.m36534e("notifyModuleCompleted failed", e);
        }
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: j */
    public final void mo10441j() {
        f427h.m36535d("keepAlive", new Object[0]);
    }

    /* renamed from: k */
    public final File[] m115860k(final String str) throws LocalTestingException {
        File file = new File(this.f429a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter(str) { // from class: yM6

                /* renamed from: a */
                public final String f119447a;

                {
                    this.f119447a = str;
                }

                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.startsWith(String.valueOf(this.f119447a).concat(Detail.EMPTY_CHAR)) && str2.endsWith(".apk");
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (MK6.m95440b(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", str));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
    }

    /* renamed from: m */
    public final void m115858m(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f433e.m95397a());
        bundle.putInt(AnalyticsFields.SESSION_ID, i);
        File[] m115860k = m115860k(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : m115860k) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String m95440b = MK6.m95440b(file);
            bundle.putParcelableArrayList(XN6.m77065f("chunk_intents", str, m95440b), arrayList2);
            bundle.putString(XN6.m77065f("uncompressed_hash_sha256", str, m95440b), m115859l(file));
            bundle.putLong(XN6.m77065f("uncompressed_size", str, m95440b), file.length());
            arrayList.add(m95440b);
        }
        bundle.putStringArrayList(XN6.m77066e("slice_ids", str), arrayList);
        bundle.putLong(XN6.m77066e("pack_version", str), this.f433e.m95397a());
        bundle.putInt(XN6.m77066e("status", str), i2);
        bundle.putInt(XN6.m77066e("error_code", str), 0);
        bundle.putLong(XN6.m77066e("bytes_downloaded", str), m115863g(i2, j));
        bundle.putLong(XN6.m77066e("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", m115863g(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f435g.post(new Runnable(this, putExtra) { // from class: zM6

            /* renamed from: b */
            public final AM6 f121134b;

            /* renamed from: c */
            public final Intent f121135c;

            {
                this.f121134b = this;
                this.f121135c = putExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f121134b.m115862h(this.f121135c);
            }
        });
    }
}
