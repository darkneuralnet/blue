package p000;

import android.media.MediaFormat;
import android.util.Size;
import com.google.android.gms.common.Scopes;
import p000.C28053ru;
/* renamed from: dp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39983dp6 implements InterfaceC49918ub1 {

    /* renamed from: dp6$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC19864a {
        /* renamed from: a */
        public abstract AbstractC39983dp6 mo15101a();

        /* renamed from: b */
        public abstract AbstractC19864a mo15100b(int i);

        /* renamed from: c */
        public abstract AbstractC19864a mo15099c(int i);

        /* renamed from: d */
        public abstract AbstractC19864a mo15098d(int i);

        /* renamed from: e */
        public abstract AbstractC19864a mo15097e(int i);

        /* renamed from: f */
        public abstract AbstractC19864a mo15096f(EnumC47841r46 enumC47841r46);

        /* renamed from: g */
        public abstract AbstractC19864a mo15095g(String str);

        /* renamed from: h */
        public abstract AbstractC19864a mo15094h(Size size);
    }

    /* renamed from: d */
    public static AbstractC19864a m43676d() {
        return new C28053ru.C28055b().m15093i(-1).mo15097e(1).mo15099c(2130708361);
    }

    @Override // p000.InterfaceC49918ub1
    /* renamed from: a */
    public abstract String mo2555a();

    @Override // p000.InterfaceC49918ub1
    /* renamed from: b */
    public abstract EnumC47841r46 mo10003b();

    @Override // p000.InterfaceC49918ub1
    /* renamed from: c */
    public MediaFormat mo2554c() {
        Size mo15102j = mo15102j();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(mo2555a(), mo15102j.getWidth(), mo15102j.getHeight());
        createVideoFormat.setInteger("color-format", mo15106f());
        createVideoFormat.setInteger("bitrate", mo15107e());
        createVideoFormat.setInteger("frame-rate", mo15105g());
        createVideoFormat.setInteger("i-frame-interval", mo15104h());
        if (mo15103i() != -1) {
            createVideoFormat.setInteger(Scopes.PROFILE, mo15103i());
        }
        return createVideoFormat;
    }

    /* renamed from: e */
    public abstract int mo15107e();

    /* renamed from: f */
    public abstract int mo15106f();

    /* renamed from: g */
    public abstract int mo15105g();

    /* renamed from: h */
    public abstract int mo15104h();

    /* renamed from: i */
    public abstract int mo15103i();

    /* renamed from: j */
    public abstract Size mo15102j();
}
