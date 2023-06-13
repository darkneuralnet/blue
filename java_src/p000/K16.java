package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
/* renamed from: K16 */
/* loaded from: classes6.dex */
public final class K16 {

    /* renamed from: K16$a */
    /* loaded from: classes6.dex */
    public class C4307a implements InterfaceC4308b {

        /* renamed from: a */
        public final /* synthetic */ AbstractC18199g f18943a;

        public C4307a(AbstractC18199g abstractC18199g) {
            this.f18943a = abstractC18199g;
        }

        @Override // p000.K16.InterfaceC4308b
        /* renamed from: a */
        public byte mo99331a(int i) {
            return this.f18943a.mo47684b(i);
        }

        @Override // p000.K16.InterfaceC4308b
        public int size() {
            return this.f18943a.size();
        }
    }

    /* renamed from: K16$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC4308b {
        /* renamed from: a */
        byte mo99331a(int i);

        int size();
    }

    private K16() {
    }

    /* renamed from: a */
    public static String m99334a(InterfaceC4308b interfaceC4308b) {
        StringBuilder sb = new StringBuilder(interfaceC4308b.size());
        for (int i = 0; i < interfaceC4308b.size(); i++) {
            byte mo99331a = interfaceC4308b.mo99331a(i);
            if (mo99331a != 34) {
                if (mo99331a != 39) {
                    if (mo99331a != 92) {
                        switch (mo99331a) {
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
                                if (mo99331a >= 32 && mo99331a <= 126) {
                                    sb.append((char) mo99331a);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((mo99331a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo99331a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo99331a & 7) + 48));
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
    public static String m99333b(AbstractC18199g abstractC18199g) {
        return m99334a(new C4307a(abstractC18199g));
    }

    /* renamed from: c */
    public static String m99332c(String str) {
        return m99333b(AbstractC18199g.m47697j(str));
    }
}
