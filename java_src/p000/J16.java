package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.protobuf.AbstractC18504e;
/* renamed from: J16 */
/* loaded from: classes6.dex */
public final class J16 {

    /* renamed from: J16$a */
    /* loaded from: classes6.dex */
    public class C3863a implements InterfaceC3864b {

        /* renamed from: a */
        public final /* synthetic */ AbstractC18504e f16670a;

        public C3863a(AbstractC18504e abstractC18504e) {
            this.f16670a = abstractC18504e;
        }

        @Override // p000.J16.InterfaceC3864b
        /* renamed from: a */
        public byte mo101294a(int i) {
            return this.f16670a.mo46285b(i);
        }

        @Override // p000.J16.InterfaceC3864b
        public int size() {
            return this.f16670a.size();
        }
    }

    /* renamed from: J16$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC3864b {
        /* renamed from: a */
        byte mo101294a(int i);

        int size();
    }

    private J16() {
    }

    /* renamed from: a */
    public static String m101297a(InterfaceC3864b interfaceC3864b) {
        StringBuilder sb = new StringBuilder(interfaceC3864b.size());
        for (int i = 0; i < interfaceC3864b.size(); i++) {
            byte mo101294a = interfaceC3864b.mo101294a(i);
            if (mo101294a != 34) {
                if (mo101294a != 39) {
                    if (mo101294a != 92) {
                        switch (mo101294a) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (mo101294a >= 32 && mo101294a <= 126) {
                                    sb.append((char) mo101294a);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo101294a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo101294a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo101294a & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m101296b(AbstractC18504e abstractC18504e) {
        return m101297a(new C3863a(abstractC18504e));
    }

    /* renamed from: c */
    public static String m101295c(String str) {
        return m101296b(AbstractC18504e.m46297h(str));
    }
}
