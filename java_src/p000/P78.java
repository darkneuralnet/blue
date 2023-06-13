package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.recaptcha.zzew;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* renamed from: P78 */
/* loaded from: classes6.dex */
public final class P78 {

    /* renamed from: a */
    public final Map<String, InterfaceC34483Mg8> f27946a;

    /* renamed from: b */
    public final Map<String, InterfaceC42880ii8> f27947b;

    /* renamed from: c */
    public final List<InterfaceC36364Uh8> f27948c;

    public P78(List<InterfaceC34483Mg8> list) {
        List<InterfaceC42880ii8> emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.f27946a = new HashMap();
        this.f27947b = new HashMap();
        this.f27948c = new ArrayList();
        AbstractC45711nU8 listIterator = ((ZP8) list).listIterator(0);
        while (listIterator.hasNext()) {
            InterfaceC34483Mg8 interfaceC34483Mg8 = (InterfaceC34483Mg8) listIterator.next();
            if (TextUtils.isEmpty(interfaceC34483Mg8.mo19070x())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                InterfaceC34483Mg8 put = this.f27946a.put(interfaceC34483Mg8.mo19070x(), interfaceC34483Mg8);
                if (put != null) {
                    String canonicalName = put.getClass().getCanonicalName();
                    String canonicalName2 = interfaceC34483Mg8.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb.append("Cannot override Backend ");
                    sb.append(canonicalName);
                    sb.append(" with ");
                    sb.append(canonicalName2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        for (InterfaceC42880ii8 interfaceC42880ii8 : emptyList) {
            if (TextUtils.isEmpty(interfaceC42880ii8.zza())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                InterfaceC42880ii8 put2 = this.f27947b.put(interfaceC42880ii8.zza(), interfaceC42880ii8);
                if (put2 != null) {
                    String canonicalName3 = put2.getClass().getCanonicalName();
                    String canonicalName4 = interfaceC42880ii8.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length());
                    sb2.append("Cannot to override Transform ");
                    sb2.append(canonicalName3);
                    sb2.append(" with ");
                    sb2.append(canonicalName4);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        this.f27948c.addAll(emptyList2);
    }

    /* renamed from: a */
    public final <T> T m90726a(Uri uri, InterfaceC52615z78<T> interfaceC52615z78) throws IOException {
        return interfaceC52615z78.mo1770a(m90722e(uri));
    }

    /* renamed from: b */
    public final void m90725b(Uri uri) throws IOException {
        C43722k78 m90722e = m90722e(uri);
        m90722e.m29263b().mo19075b(m90722e.m29264a());
    }

    /* renamed from: c */
    public final void m90724c(Uri uri, Uri uri2) throws IOException {
        C43722k78 m90722e = m90722e(uri);
        C43722k78 m90722e2 = m90722e(uri2);
        if (m90722e.m29263b() == m90722e2.m29263b()) {
            m90722e.m29263b().mo19071f(m90722e.m29264a(), m90722e2.m29264a());
            return;
        }
        throw new zzew("Cannot rename file across backends");
    }

    /* renamed from: d */
    public final boolean m90723d(Uri uri) throws IOException {
        C43722k78 m90722e = m90722e(uri);
        return m90722e.m29263b().mo19072e(m90722e.m29264a());
    }

    /* renamed from: e */
    public final C43722k78 m90722e(Uri uri) throws IOException {
        ZP8 m73197z;
        C42701iP8 m73202u = ZP8.m73202u();
        C42701iP8 m73202u2 = ZP8.m73202u();
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment) && encodedFragment.startsWith("transform=")) {
            m73197z = ZP8.m73199x(SL8.m85706c("+").m85707b().m85705d(encodedFragment.substring(10)));
        } else {
            m73197z = ZP8.m73197z();
        }
        int size = m73197z.size();
        for (int i = 0; i < size; i++) {
            m73202u2.m34006d(C47001pf8.m19005b((String) m73197z.get(i)));
        }
        ZP8 m34004f = m73202u2.m34004f();
        int size2 = m34004f.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) m34004f.get(i2);
            InterfaceC42880ii8 interfaceC42880ii8 = this.f27947b.get(str);
            if (interfaceC42880ii8 != null) {
                m73202u.m34006d(interfaceC42880ii8);
            } else {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + valueOf.length());
                sb.append("No such transform: ");
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                throw new zzew(sb.toString());
            }
        }
        ZP8 mo73204o = m73202u.m34004f().mo73204o();
        V68 v68 = new V68(null);
        v68.m80379g(this);
        String scheme = uri.getScheme();
        InterfaceC34483Mg8 interfaceC34483Mg8 = this.f27946a.get(scheme);
        if (interfaceC34483Mg8 != null) {
            v68.m80383c(interfaceC34483Mg8);
            v68.m80381e(this.f27948c);
            v68.m80378h(mo73204o);
            v68.m80380f(uri);
            if (!mo73204o.isEmpty()) {
                ArrayList arrayList = new ArrayList(uri.getPathSegments());
                if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                    String str2 = (String) arrayList.get(arrayList.size() - 1);
                    ListIterator<E> listIterator = mo73204o.listIterator(mo73204o.size());
                    while (listIterator.hasPrevious()) {
                        str2 = ((InterfaceC42880ii8) listIterator.previous()).zzb();
                    }
                    arrayList.set(arrayList.size() - 1, str2);
                    uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
                }
            }
            v68.m80382d(uri);
            return new C43722k78(v68);
        }
        throw new zzew(String.format("Cannot open, unregistered backend: %s", scheme));
    }
}
