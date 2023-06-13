package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: bs8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38812bs8 implements InterfaceC38952c69<Object> {

    /* renamed from: a */
    public List<InterfaceC43713k69<InterfaceC52969zj8, ?>> f59679a;

    /* renamed from: b */
    public final /* synthetic */ C35059Os8 f59680b;

    public /* synthetic */ C38812bs8(C35059Os8 c35059Os8, C32242Cr8 c32242Cr8) {
        this.f59680b = c35059Os8;
    }

    /* renamed from: a */
    public final /* synthetic */ Object m62242a() throws Exception {
        Object obj;
        obj = this.f59680b.f27516g;
        synchronized (obj) {
            this.f59679a = null;
        }
        return null;
    }

    @Override // p000.InterfaceC38952c69
    public final Mb9<Object> zza() throws Exception {
        YA8 ya8;
        String str;
        String str2;
        Object obj;
        List<InterfaceC43713k69<InterfaceC52969zj8, ?>> list;
        ya8 = this.f59680b.f27517h;
        str = this.f59680b.f27510a;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Initialize ".concat(valueOf);
        } else {
            str2 = new String("Initialize ");
        }
        UB8 mo61801b = ya8.mo61801b(str2, 1);
        try {
            obj = this.f59680b.f27516g;
            synchronized (obj) {
                if (this.f59679a == null) {
                    list = this.f59680b.f27518i;
                    this.f59679a = list;
                    this.f59680b.f27518i = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.f59679a.size());
            C53059zs8 c53059zs8 = new C53059zs8(this.f59680b, null);
            for (InterfaceC43713k69<InterfaceC52969zj8, ?> interfaceC43713k69 : this.f59679a) {
                try {
                    arrayList.add(interfaceC43713k69.zza(c53059zs8));
                } catch (Exception e) {
                    arrayList.add(C50508va9.m8431e(e));
                }
            }
            Mb9<Object> m36177a = C50508va9.m8434b(arrayList).m36177a(new Callable() { // from class: Pr8
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C38812bs8.this.m62242a();
                    return null;
                }
            }, Hc9.m103649b());
            mo61801b.m81881a(m36177a);
            mo61801b.close();
            return m36177a;
        } catch (Throwable th) {
            try {
                mo61801b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
