package com.auth0.android.jwt;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JWTDeserializer implements InterfaceC50581vi2<C45829nh2> {
    @Override // p000.InterfaceC50581vi2
    /* renamed from: a */
    public C45829nh2 deserialize(AbstractC52360yi2 abstractC52360yi2, Type type, InterfaceC49989ui2 interfaceC49989ui2) throws JsonParseException {
        if (!abstractC52360yi2.m2880s() && abstractC52360yi2.m2879u()) {
            C36133Ti2 m2885e = abstractC52360yi2.m2885e();
            String m53427c = m53427c(m2885e, "iss");
            String m53427c2 = m53427c(m2885e, "sub");
            Date m53428b = m53428b(m2885e, "exp");
            Date m53428b2 = m53428b(m2885e, "nbf");
            Date m53428b3 = m53428b(m2885e, "iat");
            String m53427c3 = m53427c(m2885e, "jti");
            List<String> m53426d = m53426d(m2885e, "aud");
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, AbstractC52360yi2> entry : m2885e.entrySet()) {
                hashMap.put(entry.getKey(), new C33566Ij0(entry.getValue()));
            }
            return new C45829nh2(m53427c, m53427c2, m53428b, m53428b2, m53428b3, m53427c3, m53426d, hashMap);
        }
        throw new DecodeException("The token's payload had an invalid JSON format.");
    }

    /* renamed from: b */
    public final Date m53428b(C36133Ti2 c36133Ti2, String str) {
        if (!c36133Ti2.m83134z(str)) {
            return null;
        }
        return new Date(c36133Ti2.m83135y(str).mo2883h() * 1000);
    }

    /* renamed from: c */
    public final String m53427c(C36133Ti2 c36133Ti2, String str) {
        if (!c36133Ti2.m83134z(str)) {
            return null;
        }
        return c36133Ti2.m83135y(str).mo2882j();
    }

    /* renamed from: d */
    public final List<String> m53426d(C36133Ti2 c36133Ti2, String str) {
        List<String> emptyList = Collections.emptyList();
        if (c36133Ti2.m83134z(str)) {
            AbstractC52360yi2 m83135y = c36133Ti2.m83135y(str);
            if (m83135y.m2881o()) {
                C41095fi2 m2886c = m83135y.m2886c();
                ArrayList arrayList = new ArrayList(m2886c.size());
                for (int i = 0; i < m2886c.size(); i++) {
                    arrayList.add(m2886c.m41011y(i).mo2882j());
                }
                return arrayList;
            }
            return Collections.singletonList(m83135y.mo2882j());
        }
        return emptyList;
    }
}
