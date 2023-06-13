package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* renamed from: W70 */
/* loaded from: classes5.dex */
public final class W70 implements InterfaceC43396jb1 {

    /* renamed from: c */
    public static final String f40427c;

    /* renamed from: d */
    public static final String f40428d;

    /* renamed from: e */
    public static final String f40429e;

    /* renamed from: f */
    public static final Set<C35142Pc1> f40430f;

    /* renamed from: g */
    public static final W70 f40431g;

    /* renamed from: h */
    public static final W70 f40432h;

    /* renamed from: a */
    public final String f40433a;

    /* renamed from: b */
    public final String f40434b;

    static {
        String m73105a = ZR5.m73105a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f40427c = m73105a;
        String m73105a2 = ZR5.m73105a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f40428d = m73105a2;
        String m73105a3 = ZR5.m73105a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f40429e = m73105a3;
        f40430f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C35142Pc1.m90060b("proto"), C35142Pc1.m90060b("json"))));
        f40431g = new W70(m73105a, null);
        f40432h = new W70(m73105a2, m73105a3);
    }

    public W70(String str, String str2) {
        this.f40433a = str;
        this.f40434b = str2;
    }

    /* renamed from: c */
    public static W70 m78816c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.DEFAULT_ENCODING));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new W70(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // p000.InterfaceC43396jb1
    /* renamed from: a */
    public Set<C35142Pc1> mo30220a() {
        return f40430f;
    }

    /* renamed from: b */
    public byte[] m78817b() {
        String str = this.f40434b;
        if (str == null && this.f40433a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f40433a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(Constants.DEFAULT_ENCODING));
    }

    /* renamed from: d */
    public String m78815d() {
        return this.f40434b;
    }

    /* renamed from: e */
    public String m78814e() {
        return this.f40433a;
    }

    @Override // p000.G01
    public byte[] getExtras() {
        return m78817b();
    }

    @Override // p000.G01
    public String getName() {
        return "cct";
    }
}
