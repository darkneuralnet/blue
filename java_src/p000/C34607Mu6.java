package p000;

import android.content.Context;
import java.io.File;
import p000.C51985y41;
/* renamed from: Mu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34607Mu6 {

    /* renamed from: Mu6$a */
    /* loaded from: classes.dex */
    public class C5423a implements C51985y41.InterfaceC30414c {

        /* renamed from: a */
        public File f23799a = null;

        /* renamed from: b */
        public final /* synthetic */ Context f23800b;

        public C5423a(Context context) {
            this.f23800b = context;
        }

        @Override // p000.C51985y41.InterfaceC30414c
        public File get() {
            if (this.f23799a == null) {
                this.f23799a = new File(this.f23800b.getCacheDir(), "volley");
            }
            return this.f23799a;
        }
    }

    /* renamed from: a */
    public static C40864fJ4 m94588a(Context context) {
        return m94587b(context, null);
    }

    /* renamed from: b */
    public static C40864fJ4 m94587b(Context context, AbstractC4752LA abstractC4752LA) {
        C6298PE c6298pe;
        if (abstractC4752LA == null) {
            c6298pe = new C6298PE(new SN1());
        } else {
            c6298pe = new C6298PE(abstractC4752LA);
        }
        return m94586c(context, c6298pe);
    }

    /* renamed from: c */
    public static C40864fJ4 m94586c(Context context, InterfaceC49646u73 interfaceC49646u73) {
        C40864fJ4 c40864fJ4 = new C40864fJ4(new C51985y41(new C5423a(context.getApplicationContext())), interfaceC49646u73);
        c40864fJ4.m41565g();
        return c40864fJ4;
    }
}
