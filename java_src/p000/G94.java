package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import java.security.GeneralSecurityException;
import p000.C42301hk2;
/* renamed from: G94 */
/* loaded from: classes6.dex */
public final class G94 implements InterfaceC38226at5 {

    /* renamed from: a */
    public final String f11066a;

    /* renamed from: b */
    public final Q70 f11067b;

    /* renamed from: c */
    public final AbstractC18199g f11068c;

    /* renamed from: d */
    public final C42301hk2.EnumC22717c f11069d;

    /* renamed from: e */
    public final EnumC40189eA3 f11070e;

    /* renamed from: f */
    public final Integer f11071f;

    public G94(String str, AbstractC18199g abstractC18199g, C42301hk2.EnumC22717c enumC22717c, EnumC40189eA3 enumC40189eA3, Integer num) {
        this.f11066a = str;
        this.f11067b = C48807si6.m13787d(str);
        this.f11068c = abstractC18199g;
        this.f11069d = enumC22717c;
        this.f11070e = enumC40189eA3;
        this.f11071f = num;
    }

    /* renamed from: b */
    public static G94 m105678b(String str, AbstractC18199g abstractC18199g, C42301hk2.EnumC22717c enumC22717c, EnumC40189eA3 enumC40189eA3, Integer num) throws GeneralSecurityException {
        if (enumC40189eA3 == EnumC40189eA3.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new G94(str, abstractC18199g, enumC22717c, enumC40189eA3, num);
    }

    @Override // p000.InterfaceC38226at5
    /* renamed from: a */
    public Q70 mo65324a() {
        return this.f11067b;
    }

    /* renamed from: c */
    public Integer m105677c() {
        return this.f11071f;
    }

    /* renamed from: d */
    public C42301hk2.EnumC22717c m105676d() {
        return this.f11069d;
    }

    /* renamed from: e */
    public EnumC40189eA3 m105675e() {
        return this.f11070e;
    }

    /* renamed from: f */
    public String m105674f() {
        return this.f11066a;
    }

    /* renamed from: g */
    public AbstractC18199g m105673g() {
        return this.f11068c;
    }
}
