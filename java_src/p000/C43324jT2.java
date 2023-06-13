package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: jT2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43324jT2 implements InterfaceC52637zA0 {

    /* renamed from: a */
    public final String f92743a;

    /* renamed from: b */
    public final EnumC24846a f92744b;

    /* renamed from: c */
    public final boolean f92745c;

    /* renamed from: jT2$a */
    /* loaded from: classes2.dex */
    public enum EnumC24846a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: b */
        public static EnumC24846a m30584b(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public C43324jT2(String str, EnumC24846a enumC24846a, boolean z) {
        this.f92743a = str;
        this.f92744b = enumC24846a;
        this.f92745c = z;
    }

    @Override // p000.InterfaceC52637zA0
    /* renamed from: a */
    public InterfaceC36752Vz0 mo483a(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB) {
        if (!rd2.m87136D()) {
            C32524Dx2.m109586c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C43917kT2(this);
    }

    /* renamed from: b */
    public EnumC24846a m30588b() {
        return this.f92744b;
    }

    /* renamed from: c */
    public String m30587c() {
        return this.f92743a;
    }

    /* renamed from: d */
    public boolean m30586d() {
        return this.f92745c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f92744b + CoreConstants.CURLY_RIGHT;
    }
}
