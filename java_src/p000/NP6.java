package p000;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
/* renamed from: NP6 */
/* loaded from: classes6.dex */
public final class NP6 {

    /* renamed from: a */
    public static final Api.ClientKey f24552a;
    @ShowFirstParty

    /* renamed from: b */
    public static final Api.ClientKey f24553b;

    /* renamed from: c */
    public static final Api.AbstractClientBuilder f24554c;

    /* renamed from: d */
    public static final Api.AbstractClientBuilder f24555d;

    /* renamed from: e */
    public static final Scope f24556e;

    /* renamed from: f */
    public static final Scope f24557f;

    /* renamed from: g */
    public static final Api f24558g;

    /* renamed from: h */
    public static final Api f24559h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f24552a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f24553b = clientKey2;
        EP6 ep6 = new EP6();
        f24554c = ep6;
        GP6 gp6 = new GP6();
        f24555d = gp6;
        f24556e = new Scope(Scopes.PROFILE);
        f24557f = new Scope("email");
        f24558g = new Api("SignIn.API", ep6, clientKey);
        f24559h = new Api("SignIn.INTERNAL_API", gp6, clientKey2);
    }
}
