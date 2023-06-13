package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: px2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47175px2 {

    /* renamed from: a */
    public final Integer f104375a;

    /* renamed from: b */
    public final Integer f104376b;

    /* renamed from: c */
    public final Integer f104377c;

    /* renamed from: d */
    public final Boolean f104378d;

    /* renamed from: e */
    public final Boolean f104379e;

    /* renamed from: f */
    public final InterfaceC27423b f104380f;

    /* renamed from: px2$a */
    /* loaded from: classes6.dex */
    public static class C27422a {

        /* renamed from: a */
        public Integer f104381a;

        /* renamed from: b */
        public Integer f104382b;

        /* renamed from: c */
        public Integer f104383c;

        /* renamed from: d */
        public Boolean f104384d;

        /* renamed from: e */
        public Boolean f104385e;

        /* renamed from: f */
        public InterfaceC27423b f104386f;

        /* renamed from: a */
        public C47175px2 m18400a() {
            return new C47175px2(this.f104381a, this.f104382b, this.f104383c, this.f104384d, this.f104385e, this.f104386f);
        }

        /* renamed from: b */
        public C27422a m18399b(InterfaceC27423b interfaceC27423b) {
            this.f104386f = interfaceC27423b;
            return this;
        }
    }

    /* renamed from: px2$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC27423b {
        /* renamed from: a */
        void mo3109a(int i, String str, String str2);
    }

    public C47175px2(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, InterfaceC27423b interfaceC27423b) {
        this.f104375a = num;
        this.f104376b = num2;
        this.f104377c = num3;
        this.f104378d = bool;
        this.f104379e = bool2;
        this.f104380f = interfaceC27423b;
    }

    /* renamed from: a */
    public Integer m18406a() {
        return this.f104375a;
    }

    /* renamed from: b */
    public InterfaceC27423b m18405b() {
        return this.f104380f;
    }

    /* renamed from: c */
    public Integer m18404c() {
        return this.f104376b;
    }

    /* renamed from: d */
    public Boolean m18403d() {
        return this.f104378d;
    }

    /* renamed from: e */
    public Boolean m18402e() {
        return this.f104379e;
    }

    /* renamed from: f */
    public Integer m18401f() {
        return this.f104377c;
    }

    public String toString() {
        return "LogOptions{logLevel=" + this.f104375a + ", macAddressLogSetting=" + this.f104376b + ", uuidLogSetting=" + this.f104377c + ", shouldLogAttributeValues=" + this.f104378d + ", shouldLogScannedPeripherals=" + this.f104379e + ", logger=" + this.f104380f + CoreConstants.CURLY_RIGHT;
    }
}
