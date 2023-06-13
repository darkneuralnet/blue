package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: k78  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43722k78 {

    /* renamed from: a */
    public final P78 f93962a;

    /* renamed from: b */
    public final InterfaceC34483Mg8 f93963b;

    /* renamed from: c */
    public final List<InterfaceC42880ii8> f93964c;

    /* renamed from: d */
    public final List<InterfaceC36364Uh8> f93965d;

    /* renamed from: e */
    public final Uri f93966e;

    /* renamed from: f */
    public final Uri f93967f;

    public C43722k78(V68 v68) {
        P78 p78;
        InterfaceC34483Mg8 interfaceC34483Mg8;
        List<InterfaceC42880ii8> list;
        List<InterfaceC36364Uh8> list2;
        Uri uri;
        Uri uri2;
        p78 = v68.f38647a;
        this.f93962a = p78;
        interfaceC34483Mg8 = v68.f38648b;
        this.f93963b = interfaceC34483Mg8;
        list = v68.f38649c;
        this.f93964c = list;
        list2 = v68.f38650d;
        this.f93965d = list2;
        uri = v68.f38651e;
        this.f93966e = uri;
        uri2 = v68.f38652f;
        this.f93967f = uri2;
    }

    /* renamed from: a */
    public final Uri m29264a() {
        return this.f93967f;
    }

    /* renamed from: b */
    public final InterfaceC34483Mg8 m29263b() {
        return this.f93963b;
    }

    /* renamed from: c */
    public final List<InputStream> m29262c(InputStream inputStream) throws IOException {
        C40737f58 m42098a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStream);
        if (!this.f93965d.isEmpty() && (m42098a = C40737f58.m42098a(this.f93965d, this.f93966e, inputStream)) != null) {
            arrayList.add(m42098a);
        }
        for (InterfaceC42880ii8 interfaceC42880ii8 : this.f93964c) {
            InputStream inputStream2 = (InputStream) C38551bR8.m64526a(arrayList);
            arrayList.add(interfaceC42880ii8.zzc());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public final List<OutputStream> m29261d(OutputStream outputStream) throws IOException {
        C49631u58 m10870a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        if (!this.f93965d.isEmpty() && (m10870a = C49631u58.m10870a(this.f93965d, this.f93966e, outputStream)) != null) {
            arrayList.add(m10870a);
        }
        for (InterfaceC42880ii8 interfaceC42880ii8 : this.f93964c) {
            OutputStream outputStream2 = (OutputStream) C38551bR8.m64526a(arrayList);
            arrayList.add(interfaceC42880ii8.zzd());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public final boolean m29260e() {
        if (!this.f93964c.isEmpty()) {
            return true;
        }
        return false;
    }
}
