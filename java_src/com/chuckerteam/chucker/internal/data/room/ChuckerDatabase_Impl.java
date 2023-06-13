package com.chuckerteam.chucker.internal.data.room;

import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC32563Eb5;
import p000.C33031Gb5;
import p000.C49301tY5;
import p000.InterfaceC45717nV5;
/* loaded from: classes5.dex */
public final class ChuckerDatabase_Impl extends ChuckerDatabase {

    /* renamed from: q */
    public volatile KN1 f69222q;

    /* renamed from: com.chuckerteam.chucker.internal.data.room.ChuckerDatabase_Impl$a */
    /* loaded from: classes5.dex */
    public class C17149a extends C33031Gb5.AbstractC2894b {
        public C17149a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `transactions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestDate` INTEGER, `responseDate` INTEGER, `tookMs` INTEGER, `protocol` TEXT, `method` TEXT, `url` TEXT, `host` TEXT, `path` TEXT, `scheme` TEXT, `responseTlsVersion` TEXT, `responseCipherSuite` TEXT, `requestPayloadSize` INTEGER, `requestContentType` TEXT, `requestHeaders` TEXT, `requestHeadersSize` INTEGER, `requestBody` TEXT, `isRequestBodyEncoded` INTEGER NOT NULL, `responseCode` INTEGER, `responseMessage` TEXT, `error` TEXT, `responsePayloadSize` INTEGER, `responseContentType` TEXT, `responseHeaders` TEXT, `responseHeadersSize` INTEGER, `responseBody` TEXT, `isResponseBodyEncoded` INTEGER NOT NULL, `responseImageData` BLOB, `graphQlDetected` INTEGER NOT NULL, `graphQlOperationName` TEXT)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ac72c06b37efb89e6417a7707016d4f5')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `transactions`");
            if (ChuckerDatabase_Impl.this.f7778h != null) {
                int size = ChuckerDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ChuckerDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (ChuckerDatabase_Impl.this.f7778h != null) {
                int size = ChuckerDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ChuckerDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            ChuckerDatabase_Impl.this.f7771a = interfaceC45124mV5;
            ChuckerDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (ChuckerDatabase_Impl.this.f7778h != null) {
                int size = ChuckerDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ChuckerDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: e */
        public void mo52988e(InterfaceC45124mV5 interfaceC45124mV5) {
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: f */
        public void mo52987f(InterfaceC45124mV5 interfaceC45124mV5) {
            IF0.m102674b(interfaceC45124mV5);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: g */
        public C33031Gb5.C2895c mo52986g(InterfaceC45124mV5 interfaceC45124mV5) {
            HashMap hashMap = new HashMap(30);
            hashMap.put("id", new C49301tY5.C28782a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("requestDate", new C49301tY5.C28782a("requestDate", "INTEGER", false, 0, null, 1));
            hashMap.put("responseDate", new C49301tY5.C28782a("responseDate", "INTEGER", false, 0, null, 1));
            hashMap.put("tookMs", new C49301tY5.C28782a("tookMs", "INTEGER", false, 0, null, 1));
            hashMap.put("protocol", new C49301tY5.C28782a("protocol", "TEXT", false, 0, null, 1));
            hashMap.put("method", new C49301tY5.C28782a("method", "TEXT", false, 0, null, 1));
            hashMap.put("url", new C49301tY5.C28782a("url", "TEXT", false, 0, null, 1));
            hashMap.put("host", new C49301tY5.C28782a("host", "TEXT", false, 0, null, 1));
            hashMap.put("path", new C49301tY5.C28782a("path", "TEXT", false, 0, null, 1));
            hashMap.put(CardPaymentMethod.PAYMENT_METHOD_TYPE, new C49301tY5.C28782a(CardPaymentMethod.PAYMENT_METHOD_TYPE, "TEXT", false, 0, null, 1));
            hashMap.put("responseTlsVersion", new C49301tY5.C28782a("responseTlsVersion", "TEXT", false, 0, null, 1));
            hashMap.put("responseCipherSuite", new C49301tY5.C28782a("responseCipherSuite", "TEXT", false, 0, null, 1));
            hashMap.put("requestPayloadSize", new C49301tY5.C28782a("requestPayloadSize", "INTEGER", false, 0, null, 1));
            hashMap.put("requestContentType", new C49301tY5.C28782a("requestContentType", "TEXT", false, 0, null, 1));
            hashMap.put("requestHeaders", new C49301tY5.C28782a("requestHeaders", "TEXT", false, 0, null, 1));
            hashMap.put("requestHeadersSize", new C49301tY5.C28782a("requestHeadersSize", "INTEGER", false, 0, null, 1));
            hashMap.put("requestBody", new C49301tY5.C28782a("requestBody", "TEXT", false, 0, null, 1));
            hashMap.put("isRequestBodyEncoded", new C49301tY5.C28782a("isRequestBodyEncoded", "INTEGER", true, 0, null, 1));
            hashMap.put("responseCode", new C49301tY5.C28782a("responseCode", "INTEGER", false, 0, null, 1));
            hashMap.put("responseMessage", new C49301tY5.C28782a("responseMessage", "TEXT", false, 0, null, 1));
            hashMap.put("error", new C49301tY5.C28782a("error", "TEXT", false, 0, null, 1));
            hashMap.put("responsePayloadSize", new C49301tY5.C28782a("responsePayloadSize", "INTEGER", false, 0, null, 1));
            hashMap.put("responseContentType", new C49301tY5.C28782a("responseContentType", "TEXT", false, 0, null, 1));
            hashMap.put("responseHeaders", new C49301tY5.C28782a("responseHeaders", "TEXT", false, 0, null, 1));
            hashMap.put("responseHeadersSize", new C49301tY5.C28782a("responseHeadersSize", "INTEGER", false, 0, null, 1));
            hashMap.put("responseBody", new C49301tY5.C28782a("responseBody", "TEXT", false, 0, null, 1));
            hashMap.put("isResponseBodyEncoded", new C49301tY5.C28782a("isResponseBodyEncoded", "INTEGER", true, 0, null, 1));
            hashMap.put("responseImageData", new C49301tY5.C28782a("responseImageData", "BLOB", false, 0, null, 1));
            hashMap.put("graphQlDetected", new C49301tY5.C28782a("graphQlDetected", "INTEGER", true, 0, null, 1));
            hashMap.put("graphQlOperationName", new C49301tY5.C28782a("graphQlOperationName", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("transactions", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "transactions");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "transactions(com.chuckerteam.chucker.internal.data.entity.HttpTransaction).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // com.chuckerteam.chucker.internal.data.room.ChuckerDatabase
    /* renamed from: C */
    public KN1 mo53009C() {
        KN1 kn1;
        if (this.f69222q != null) {
            return this.f69222q;
        }
        synchronized (this) {
            if (this.f69222q == null) {
                this.f69222q = new LN1(this);
            }
            kn1 = this.f69222q;
        }
        return kn1;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "transactions");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C17149a(9), "ac72c06b37efb89e6417a7707016d4f5", "a70b1841a05694f746087779f5a5c887")).m23589b());
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: h */
    public List<AbstractC39165cU2> mo52995h(Map<Class<? extends InterfaceC7937Tq>, InterfaceC7937Tq> map) {
        return Arrays.asList(new AbstractC39165cU2[0]);
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: n */
    public Set<Class<? extends InterfaceC7937Tq>> mo52994n() {
        return new HashSet();
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: o */
    public Map<Class<?>, List<Class<?>>> mo52993o() {
        HashMap hashMap = new HashMap();
        hashMap.put(KN1.class, LN1.m97007o());
        return hashMap;
    }
}
