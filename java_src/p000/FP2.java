package p000;

import android.annotation.SuppressLint;
import java.util.Objects;
import p000.AbstractC51248wp6;
import p000.C6198Ot;
/* renamed from: FP2 */
/* loaded from: classes.dex */
public abstract class FP2 {

    /* renamed from: FP2$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2236a {
        /* renamed from: a */
        public abstract FP2 mo91216a();

        /* renamed from: b */
        public AbstractC2236a m107250b(InterfaceC48378rz0<AbstractC51248wp6.AbstractC29965a> interfaceC48378rz0) {
            AbstractC51248wp6.AbstractC29965a mo6282f = mo91215c().mo6282f();
            interfaceC48378rz0.accept(mo6282f);
            mo91212f(mo6282f.mo6281a());
            return this;
        }

        @SuppressLint({"KotlinPropertyAccess"})
        /* renamed from: c */
        public abstract AbstractC51248wp6 mo91215c();

        /* renamed from: d */
        public abstract AbstractC2236a mo91214d(AbstractC2481Fp abstractC2481Fp);

        /* renamed from: e */
        public abstract AbstractC2236a mo91213e(int i);

        /* renamed from: f */
        public abstract AbstractC2236a mo91212f(AbstractC51248wp6 abstractC51248wp6);
    }

    /* renamed from: a */
    public static AbstractC2236a m107255a() {
        return new C6198Ot.C6200b().mo91213e(-1).mo91214d(AbstractC2481Fp.m106439a().mo40597a()).mo91212f(AbstractC51248wp6.m6287a().mo6281a());
    }

    /* renamed from: e */
    public static String m107254e(int i) {
        return i != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    /* renamed from: f */
    public static int m107253f(int i) {
        if (Objects.equals(m107254e(i), "audio/mp4a-latm")) {
            return 2;
        }
        return -1;
    }

    /* renamed from: g */
    public static int m107252g(int i) {
        return i != 1 ? 0 : 1;
    }

    /* renamed from: h */
    public static String m107251h(int i) {
        return i != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    /* renamed from: b */
    public abstract AbstractC2481Fp mo91220b();

    /* renamed from: c */
    public abstract int mo91219c();

    /* renamed from: d */
    public abstract AbstractC51248wp6 mo91218d();

    /* renamed from: i */
    public abstract AbstractC2236a mo91217i();
}
