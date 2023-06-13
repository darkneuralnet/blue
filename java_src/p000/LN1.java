package p000;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import com.chuckerteam.chucker.internal.data.entity.C17147a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
/* renamed from: LN1 */
/* loaded from: classes5.dex */
public final class LN1 implements KN1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f21325a;

    /* renamed from: b */
    public final AbstractC39268cf1<HttpTransaction> f21326b;

    /* renamed from: c */
    public final AbstractC38675bf1<HttpTransaction> f21327c;

    /* renamed from: d */
    public final AbstractC41861gz5 f21328d;

    /* renamed from: e */
    public final AbstractC41861gz5 f21329e;

    /* renamed from: LN1$a */
    /* loaded from: classes5.dex */
    public class CallableC4893a implements Callable<List<C17147a>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f21330b;

        public CallableC4893a(C33265Hb5 c33265Hb5) {
            this.f21330b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<C17147a> call() throws Exception {
            Long valueOf;
            Long valueOf2;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Integer valueOf3;
            Long valueOf4;
            Long valueOf5;
            String string6;
            boolean z;
            String string7;
            Cursor m102673c = IF0.m102673c(LN1.this.f21325a, this.f21330b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    long j = m102673c.getLong(0);
                    if (m102673c.isNull(1)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(m102673c.getLong(1));
                    }
                    if (m102673c.isNull(2)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(m102673c.getLong(2));
                    }
                    if (m102673c.isNull(3)) {
                        string = null;
                    } else {
                        string = m102673c.getString(3);
                    }
                    if (m102673c.isNull(4)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(4);
                    }
                    if (m102673c.isNull(5)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(5);
                    }
                    if (m102673c.isNull(6)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(6);
                    }
                    if (m102673c.isNull(7)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(7);
                    }
                    if (m102673c.isNull(8)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(m102673c.getInt(8));
                    }
                    if (m102673c.isNull(9)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(m102673c.getLong(9));
                    }
                    if (m102673c.isNull(10)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(m102673c.getLong(10));
                    }
                    if (m102673c.isNull(11)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(11);
                    }
                    if (m102673c.getInt(12) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m102673c.isNull(13)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(13);
                    }
                    arrayList.add(new C17147a(j, valueOf, valueOf2, string, string2, string3, string4, string5, valueOf3, valueOf4, valueOf5, string6, z, string7));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f21330b.release();
        }
    }

    /* renamed from: LN1$b */
    /* loaded from: classes5.dex */
    public class CallableC4894b implements Callable<HttpTransaction> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f21332b;

        public CallableC4894b(C33265Hb5 c33265Hb5) {
            this.f21332b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public HttpTransaction call() throws Exception {
            HttpTransaction httpTransaction;
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            Long valueOf4;
            String string9;
            int i;
            String string10;
            int i2;
            Long valueOf5;
            int i3;
            String string11;
            int i4;
            int i5;
            boolean z;
            Integer valueOf6;
            int i6;
            String string12;
            int i7;
            String string13;
            int i8;
            Long valueOf7;
            int i9;
            String string14;
            int i10;
            String string15;
            int i11;
            Long valueOf8;
            int i12;
            String string16;
            int i13;
            int i14;
            boolean z2;
            byte[] blob;
            int i15;
            boolean z3;
            String string17;
            Cursor m102673c = IF0.m102673c(LN1.this.f21325a, this.f21332b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "requestDate");
                int m41645e3 = C40824fF0.m41645e(m102673c, "responseDate");
                int m41645e4 = C40824fF0.m41645e(m102673c, "tookMs");
                int m41645e5 = C40824fF0.m41645e(m102673c, "protocol");
                int m41645e6 = C40824fF0.m41645e(m102673c, "method");
                int m41645e7 = C40824fF0.m41645e(m102673c, "url");
                int m41645e8 = C40824fF0.m41645e(m102673c, "host");
                int m41645e9 = C40824fF0.m41645e(m102673c, "path");
                int m41645e10 = C40824fF0.m41645e(m102673c, CardPaymentMethod.PAYMENT_METHOD_TYPE);
                int m41645e11 = C40824fF0.m41645e(m102673c, "responseTlsVersion");
                int m41645e12 = C40824fF0.m41645e(m102673c, "responseCipherSuite");
                int m41645e13 = C40824fF0.m41645e(m102673c, "requestPayloadSize");
                int m41645e14 = C40824fF0.m41645e(m102673c, "requestContentType");
                int m41645e15 = C40824fF0.m41645e(m102673c, "requestHeaders");
                int m41645e16 = C40824fF0.m41645e(m102673c, "requestHeadersSize");
                int m41645e17 = C40824fF0.m41645e(m102673c, "requestBody");
                int m41645e18 = C40824fF0.m41645e(m102673c, "isRequestBodyEncoded");
                int m41645e19 = C40824fF0.m41645e(m102673c, "responseCode");
                int m41645e20 = C40824fF0.m41645e(m102673c, "responseMessage");
                int m41645e21 = C40824fF0.m41645e(m102673c, "error");
                int m41645e22 = C40824fF0.m41645e(m102673c, "responsePayloadSize");
                int m41645e23 = C40824fF0.m41645e(m102673c, "responseContentType");
                int m41645e24 = C40824fF0.m41645e(m102673c, "responseHeaders");
                int m41645e25 = C40824fF0.m41645e(m102673c, "responseHeadersSize");
                int m41645e26 = C40824fF0.m41645e(m102673c, "responseBody");
                int m41645e27 = C40824fF0.m41645e(m102673c, "isResponseBodyEncoded");
                int m41645e28 = C40824fF0.m41645e(m102673c, "responseImageData");
                int m41645e29 = C40824fF0.m41645e(m102673c, "graphQlDetected");
                int m41645e30 = C40824fF0.m41645e(m102673c, "graphQlOperationName");
                if (m102673c.moveToFirst()) {
                    long j = m102673c.getLong(m41645e);
                    if (m102673c.isNull(m41645e2)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(m102673c.getLong(m41645e2));
                    }
                    if (m102673c.isNull(m41645e3)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(m102673c.getLong(m41645e3));
                    }
                    if (m102673c.isNull(m41645e4)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(m102673c.getLong(m41645e4));
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e5);
                    }
                    if (m102673c.isNull(m41645e6)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e7);
                    }
                    if (m102673c.isNull(m41645e8)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e9);
                    }
                    if (m102673c.isNull(m41645e10)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e11);
                    }
                    if (m102673c.isNull(m41645e12)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e12);
                    }
                    if (m102673c.isNull(m41645e13)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(m102673c.getLong(m41645e13));
                    }
                    if (m102673c.isNull(m41645e14)) {
                        i = m41645e15;
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e14);
                        i = m41645e15;
                    }
                    if (m102673c.isNull(i)) {
                        i2 = m41645e16;
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(i);
                        i2 = m41645e16;
                    }
                    if (m102673c.isNull(i2)) {
                        i3 = m41645e17;
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(m102673c.getLong(i2));
                        i3 = m41645e17;
                    }
                    if (m102673c.isNull(i3)) {
                        i4 = m41645e18;
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(i3);
                        i4 = m41645e18;
                    }
                    if (m102673c.getInt(i4) != 0) {
                        z = true;
                        i5 = m41645e19;
                    } else {
                        i5 = m41645e19;
                        z = false;
                    }
                    if (m102673c.isNull(i5)) {
                        i6 = m41645e20;
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(m102673c.getInt(i5));
                        i6 = m41645e20;
                    }
                    if (m102673c.isNull(i6)) {
                        i7 = m41645e21;
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(i6);
                        i7 = m41645e21;
                    }
                    if (m102673c.isNull(i7)) {
                        i8 = m41645e22;
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(i7);
                        i8 = m41645e22;
                    }
                    if (m102673c.isNull(i8)) {
                        i9 = m41645e23;
                        valueOf7 = null;
                    } else {
                        valueOf7 = Long.valueOf(m102673c.getLong(i8));
                        i9 = m41645e23;
                    }
                    if (m102673c.isNull(i9)) {
                        i10 = m41645e24;
                        string14 = null;
                    } else {
                        string14 = m102673c.getString(i9);
                        i10 = m41645e24;
                    }
                    if (m102673c.isNull(i10)) {
                        i11 = m41645e25;
                        string15 = null;
                    } else {
                        string15 = m102673c.getString(i10);
                        i11 = m41645e25;
                    }
                    if (m102673c.isNull(i11)) {
                        i12 = m41645e26;
                        valueOf8 = null;
                    } else {
                        valueOf8 = Long.valueOf(m102673c.getLong(i11));
                        i12 = m41645e26;
                    }
                    if (m102673c.isNull(i12)) {
                        i13 = m41645e27;
                        string16 = null;
                    } else {
                        string16 = m102673c.getString(i12);
                        i13 = m41645e27;
                    }
                    if (m102673c.getInt(i13) != 0) {
                        z2 = true;
                        i14 = m41645e28;
                    } else {
                        i14 = m41645e28;
                        z2 = false;
                    }
                    if (m102673c.isNull(i14)) {
                        i15 = m41645e29;
                        blob = null;
                    } else {
                        blob = m102673c.getBlob(i14);
                        i15 = m41645e29;
                    }
                    if (m102673c.getInt(i15) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (m102673c.isNull(m41645e30)) {
                        string17 = null;
                    } else {
                        string17 = m102673c.getString(m41645e30);
                    }
                    httpTransaction = new HttpTransaction(j, valueOf, valueOf2, valueOf3, string, string2, string3, string4, string5, string6, string7, string8, valueOf4, string9, string10, valueOf5, string11, z, valueOf6, string12, string13, valueOf7, string14, string15, valueOf8, string16, z2, blob, z3, string17);
                } else {
                    httpTransaction = null;
                }
                return httpTransaction;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f21332b.release();
        }
    }

    /* renamed from: LN1$c */
    /* loaded from: classes5.dex */
    public class CallableC4895c implements Callable<List<HttpTransaction>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f21334b;

        public CallableC4895c(C33265Hb5 c33265Hb5) {
            this.f21334b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<HttpTransaction> call() throws Exception {
            CallableC4895c callableC4895c;
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            Long valueOf4;
            int i;
            String string9;
            String string10;
            Long valueOf5;
            String string11;
            boolean z;
            Integer valueOf6;
            String string12;
            String string13;
            Long valueOf7;
            String string14;
            String string15;
            Long valueOf8;
            String string16;
            boolean z2;
            byte[] blob;
            boolean z3;
            String string17;
            int i2;
            Cursor m102673c = IF0.m102673c(LN1.this.f21325a, this.f21334b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "requestDate");
                int m41645e3 = C40824fF0.m41645e(m102673c, "responseDate");
                int m41645e4 = C40824fF0.m41645e(m102673c, "tookMs");
                int m41645e5 = C40824fF0.m41645e(m102673c, "protocol");
                int m41645e6 = C40824fF0.m41645e(m102673c, "method");
                int m41645e7 = C40824fF0.m41645e(m102673c, "url");
                int m41645e8 = C40824fF0.m41645e(m102673c, "host");
                int m41645e9 = C40824fF0.m41645e(m102673c, "path");
                int m41645e10 = C40824fF0.m41645e(m102673c, CardPaymentMethod.PAYMENT_METHOD_TYPE);
                int m41645e11 = C40824fF0.m41645e(m102673c, "responseTlsVersion");
                int m41645e12 = C40824fF0.m41645e(m102673c, "responseCipherSuite");
                int m41645e13 = C40824fF0.m41645e(m102673c, "requestPayloadSize");
                int m41645e14 = C40824fF0.m41645e(m102673c, "requestContentType");
                try {
                    int m41645e15 = C40824fF0.m41645e(m102673c, "requestHeaders");
                    int m41645e16 = C40824fF0.m41645e(m102673c, "requestHeadersSize");
                    int m41645e17 = C40824fF0.m41645e(m102673c, "requestBody");
                    int m41645e18 = C40824fF0.m41645e(m102673c, "isRequestBodyEncoded");
                    int m41645e19 = C40824fF0.m41645e(m102673c, "responseCode");
                    int m41645e20 = C40824fF0.m41645e(m102673c, "responseMessage");
                    int m41645e21 = C40824fF0.m41645e(m102673c, "error");
                    int m41645e22 = C40824fF0.m41645e(m102673c, "responsePayloadSize");
                    int m41645e23 = C40824fF0.m41645e(m102673c, "responseContentType");
                    int m41645e24 = C40824fF0.m41645e(m102673c, "responseHeaders");
                    int m41645e25 = C40824fF0.m41645e(m102673c, "responseHeadersSize");
                    int m41645e26 = C40824fF0.m41645e(m102673c, "responseBody");
                    int m41645e27 = C40824fF0.m41645e(m102673c, "isResponseBodyEncoded");
                    int m41645e28 = C40824fF0.m41645e(m102673c, "responseImageData");
                    int m41645e29 = C40824fF0.m41645e(m102673c, "graphQlDetected");
                    int m41645e30 = C40824fF0.m41645e(m102673c, "graphQlOperationName");
                    int i3 = m41645e14;
                    ArrayList arrayList = new ArrayList(m102673c.getCount());
                    while (m102673c.moveToNext()) {
                        long j = m102673c.getLong(m41645e);
                        if (m102673c.isNull(m41645e2)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(m102673c.getLong(m41645e2));
                        }
                        if (m102673c.isNull(m41645e3)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(m102673c.getLong(m41645e3));
                        }
                        if (m102673c.isNull(m41645e4)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(m102673c.getLong(m41645e4));
                        }
                        if (m102673c.isNull(m41645e5)) {
                            string = null;
                        } else {
                            string = m102673c.getString(m41645e5);
                        }
                        if (m102673c.isNull(m41645e6)) {
                            string2 = null;
                        } else {
                            string2 = m102673c.getString(m41645e6);
                        }
                        if (m102673c.isNull(m41645e7)) {
                            string3 = null;
                        } else {
                            string3 = m102673c.getString(m41645e7);
                        }
                        if (m102673c.isNull(m41645e8)) {
                            string4 = null;
                        } else {
                            string4 = m102673c.getString(m41645e8);
                        }
                        if (m102673c.isNull(m41645e9)) {
                            string5 = null;
                        } else {
                            string5 = m102673c.getString(m41645e9);
                        }
                        if (m102673c.isNull(m41645e10)) {
                            string6 = null;
                        } else {
                            string6 = m102673c.getString(m41645e10);
                        }
                        if (m102673c.isNull(m41645e11)) {
                            string7 = null;
                        } else {
                            string7 = m102673c.getString(m41645e11);
                        }
                        if (m102673c.isNull(m41645e12)) {
                            string8 = null;
                        } else {
                            string8 = m102673c.getString(m41645e12);
                        }
                        if (m102673c.isNull(m41645e13)) {
                            i = i3;
                            valueOf4 = null;
                        } else {
                            valueOf4 = Long.valueOf(m102673c.getLong(m41645e13));
                            i = i3;
                        }
                        if (m102673c.isNull(i)) {
                            string9 = null;
                        } else {
                            string9 = m102673c.getString(i);
                        }
                        int i4 = m41645e15;
                        int i5 = m41645e;
                        if (m102673c.isNull(i4)) {
                            string10 = null;
                        } else {
                            string10 = m102673c.getString(i4);
                        }
                        int i6 = m41645e16;
                        if (m102673c.isNull(i6)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Long.valueOf(m102673c.getLong(i6));
                        }
                        int i7 = m41645e17;
                        if (m102673c.isNull(i7)) {
                            string11 = null;
                        } else {
                            string11 = m102673c.getString(i7);
                        }
                        int i8 = m41645e18;
                        if (m102673c.getInt(i8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i9 = m41645e19;
                        if (m102673c.isNull(i9)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Integer.valueOf(m102673c.getInt(i9));
                        }
                        int i10 = m41645e20;
                        if (m102673c.isNull(i10)) {
                            string12 = null;
                        } else {
                            string12 = m102673c.getString(i10);
                        }
                        int i11 = m41645e21;
                        if (m102673c.isNull(i11)) {
                            string13 = null;
                        } else {
                            string13 = m102673c.getString(i11);
                        }
                        int i12 = m41645e22;
                        if (m102673c.isNull(i12)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(m102673c.getLong(i12));
                        }
                        int i13 = m41645e23;
                        if (m102673c.isNull(i13)) {
                            string14 = null;
                        } else {
                            string14 = m102673c.getString(i13);
                        }
                        int i14 = m41645e24;
                        if (m102673c.isNull(i14)) {
                            string15 = null;
                        } else {
                            string15 = m102673c.getString(i14);
                        }
                        int i15 = m41645e25;
                        if (m102673c.isNull(i15)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(m102673c.getLong(i15));
                        }
                        int i16 = m41645e26;
                        if (m102673c.isNull(i16)) {
                            string16 = null;
                        } else {
                            string16 = m102673c.getString(i16);
                        }
                        int i17 = m41645e27;
                        if (m102673c.getInt(i17) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i18 = m41645e28;
                        if (m102673c.isNull(i18)) {
                            blob = null;
                        } else {
                            blob = m102673c.getBlob(i18);
                        }
                        int i19 = m41645e29;
                        if (m102673c.getInt(i19) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i20 = m41645e30;
                        if (m102673c.isNull(i20)) {
                            i2 = i20;
                            string17 = null;
                        } else {
                            string17 = m102673c.getString(i20);
                            i2 = i20;
                        }
                        arrayList.add(new HttpTransaction(j, valueOf, valueOf2, valueOf3, string, string2, string3, string4, string5, string6, string7, string8, valueOf4, string9, string10, valueOf5, string11, z, valueOf6, string12, string13, valueOf7, string14, string15, valueOf8, string16, z2, blob, z3, string17));
                        m41645e = i5;
                        m41645e15 = i4;
                        m41645e16 = i6;
                        m41645e17 = i7;
                        m41645e18 = i8;
                        m41645e19 = i9;
                        m41645e20 = i10;
                        m41645e21 = i11;
                        m41645e22 = i12;
                        m41645e23 = i13;
                        m41645e24 = i14;
                        m41645e25 = i15;
                        m41645e26 = i16;
                        m41645e27 = i17;
                        m41645e28 = i18;
                        m41645e29 = i19;
                        m41645e30 = i2;
                        i3 = i;
                    }
                    m102673c.close();
                    this.f21334b.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    callableC4895c = this;
                    m102673c.close();
                    callableC4895c.f21334b.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                callableC4895c = this;
            }
        }
    }

    /* renamed from: LN1$d */
    /* loaded from: classes5.dex */
    public class C4896d extends AbstractC39268cf1<HttpTransaction> {
        public C4896d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR ABORT INTO `transactions` (`id`,`requestDate`,`responseDate`,`tookMs`,`protocol`,`method`,`url`,`host`,`path`,`scheme`,`responseTlsVersion`,`responseCipherSuite`,`requestPayloadSize`,`requestContentType`,`requestHeaders`,`requestHeadersSize`,`requestBody`,`isRequestBodyEncoded`,`responseCode`,`responseMessage`,`error`,`responsePayloadSize`,`responseContentType`,`responseHeaders`,`responseHeadersSize`,`responseBody`,`isResponseBodyEncoded`,`responseImageData`,`graphQlDetected`,`graphQlOperationName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, HttpTransaction httpTransaction) {
            interfaceC47496qV5.mo20956S0(1, httpTransaction.getId());
            if (httpTransaction.getRequestDate() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20956S0(2, httpTransaction.getRequestDate().longValue());
            }
            if (httpTransaction.getResponseDate() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20956S0(3, httpTransaction.getResponseDate().longValue());
            }
            if (httpTransaction.getTookMs() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20956S0(4, httpTransaction.getTookMs().longValue());
            }
            if (httpTransaction.getProtocol() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, httpTransaction.getProtocol());
            }
            if (httpTransaction.getMethod() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, httpTransaction.getMethod());
            }
            if (httpTransaction.getUrl() == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, httpTransaction.getUrl());
            }
            if (httpTransaction.getHost() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, httpTransaction.getHost());
            }
            if (httpTransaction.getPath() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, httpTransaction.getPath());
            }
            if (httpTransaction.getScheme() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, httpTransaction.getScheme());
            }
            if (httpTransaction.getResponseTlsVersion() == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, httpTransaction.getResponseTlsVersion());
            }
            if (httpTransaction.getResponseCipherSuite() == null) {
                interfaceC47496qV5.mo20954m1(12);
            } else {
                interfaceC47496qV5.mo20958G0(12, httpTransaction.getResponseCipherSuite());
            }
            if (httpTransaction.getRequestPayloadSize() == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20956S0(13, httpTransaction.getRequestPayloadSize().longValue());
            }
            if (httpTransaction.getRequestContentType() == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20958G0(14, httpTransaction.getRequestContentType());
            }
            if (httpTransaction.getRequestHeaders() == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, httpTransaction.getRequestHeaders());
            }
            if (httpTransaction.getRequestHeadersSize() == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20956S0(16, httpTransaction.getRequestHeadersSize().longValue());
            }
            if (httpTransaction.getRequestBody() == null) {
                interfaceC47496qV5.mo20954m1(17);
            } else {
                interfaceC47496qV5.mo20958G0(17, httpTransaction.getRequestBody());
            }
            interfaceC47496qV5.mo20956S0(18, httpTransaction.isRequestBodyEncoded() ? 1L : 0L);
            if (httpTransaction.getResponseCode() == null) {
                interfaceC47496qV5.mo20954m1(19);
            } else {
                interfaceC47496qV5.mo20956S0(19, httpTransaction.getResponseCode().intValue());
            }
            if (httpTransaction.getResponseMessage() == null) {
                interfaceC47496qV5.mo20954m1(20);
            } else {
                interfaceC47496qV5.mo20958G0(20, httpTransaction.getResponseMessage());
            }
            if (httpTransaction.getError() == null) {
                interfaceC47496qV5.mo20954m1(21);
            } else {
                interfaceC47496qV5.mo20958G0(21, httpTransaction.getError());
            }
            if (httpTransaction.getResponsePayloadSize() == null) {
                interfaceC47496qV5.mo20954m1(22);
            } else {
                interfaceC47496qV5.mo20956S0(22, httpTransaction.getResponsePayloadSize().longValue());
            }
            if (httpTransaction.getResponseContentType() == null) {
                interfaceC47496qV5.mo20954m1(23);
            } else {
                interfaceC47496qV5.mo20958G0(23, httpTransaction.getResponseContentType());
            }
            if (httpTransaction.getResponseHeaders() == null) {
                interfaceC47496qV5.mo20954m1(24);
            } else {
                interfaceC47496qV5.mo20958G0(24, httpTransaction.getResponseHeaders());
            }
            if (httpTransaction.getResponseHeadersSize() == null) {
                interfaceC47496qV5.mo20954m1(25);
            } else {
                interfaceC47496qV5.mo20956S0(25, httpTransaction.getResponseHeadersSize().longValue());
            }
            if (httpTransaction.getResponseBody() == null) {
                interfaceC47496qV5.mo20954m1(26);
            } else {
                interfaceC47496qV5.mo20958G0(26, httpTransaction.getResponseBody());
            }
            interfaceC47496qV5.mo20956S0(27, httpTransaction.isResponseBodyEncoded() ? 1L : 0L);
            if (httpTransaction.getResponseImageData() == null) {
                interfaceC47496qV5.mo20954m1(28);
            } else {
                interfaceC47496qV5.mo20955X0(28, httpTransaction.getResponseImageData());
            }
            interfaceC47496qV5.mo20956S0(29, httpTransaction.getGraphQlDetected() ? 1L : 0L);
            if (httpTransaction.getGraphQlOperationName() == null) {
                interfaceC47496qV5.mo20954m1(30);
            } else {
                interfaceC47496qV5.mo20958G0(30, httpTransaction.getGraphQlOperationName());
            }
        }
    }

    /* renamed from: LN1$e */
    /* loaded from: classes5.dex */
    public class C4897e extends AbstractC38675bf1<HttpTransaction> {
        public C4897e(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR REPLACE `transactions` SET `id` = ?,`requestDate` = ?,`responseDate` = ?,`tookMs` = ?,`protocol` = ?,`method` = ?,`url` = ?,`host` = ?,`path` = ?,`scheme` = ?,`responseTlsVersion` = ?,`responseCipherSuite` = ?,`requestPayloadSize` = ?,`requestContentType` = ?,`requestHeaders` = ?,`requestHeadersSize` = ?,`requestBody` = ?,`isRequestBodyEncoded` = ?,`responseCode` = ?,`responseMessage` = ?,`error` = ?,`responsePayloadSize` = ?,`responseContentType` = ?,`responseHeaders` = ?,`responseHeadersSize` = ?,`responseBody` = ?,`isResponseBodyEncoded` = ?,`responseImageData` = ?,`graphQlDetected` = ?,`graphQlOperationName` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, HttpTransaction httpTransaction) {
            interfaceC47496qV5.mo20956S0(1, httpTransaction.getId());
            if (httpTransaction.getRequestDate() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20956S0(2, httpTransaction.getRequestDate().longValue());
            }
            if (httpTransaction.getResponseDate() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20956S0(3, httpTransaction.getResponseDate().longValue());
            }
            if (httpTransaction.getTookMs() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20956S0(4, httpTransaction.getTookMs().longValue());
            }
            if (httpTransaction.getProtocol() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, httpTransaction.getProtocol());
            }
            if (httpTransaction.getMethod() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, httpTransaction.getMethod());
            }
            if (httpTransaction.getUrl() == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, httpTransaction.getUrl());
            }
            if (httpTransaction.getHost() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, httpTransaction.getHost());
            }
            if (httpTransaction.getPath() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, httpTransaction.getPath());
            }
            if (httpTransaction.getScheme() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, httpTransaction.getScheme());
            }
            if (httpTransaction.getResponseTlsVersion() == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, httpTransaction.getResponseTlsVersion());
            }
            if (httpTransaction.getResponseCipherSuite() == null) {
                interfaceC47496qV5.mo20954m1(12);
            } else {
                interfaceC47496qV5.mo20958G0(12, httpTransaction.getResponseCipherSuite());
            }
            if (httpTransaction.getRequestPayloadSize() == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20956S0(13, httpTransaction.getRequestPayloadSize().longValue());
            }
            if (httpTransaction.getRequestContentType() == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20958G0(14, httpTransaction.getRequestContentType());
            }
            if (httpTransaction.getRequestHeaders() == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, httpTransaction.getRequestHeaders());
            }
            if (httpTransaction.getRequestHeadersSize() == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20956S0(16, httpTransaction.getRequestHeadersSize().longValue());
            }
            if (httpTransaction.getRequestBody() == null) {
                interfaceC47496qV5.mo20954m1(17);
            } else {
                interfaceC47496qV5.mo20958G0(17, httpTransaction.getRequestBody());
            }
            interfaceC47496qV5.mo20956S0(18, httpTransaction.isRequestBodyEncoded() ? 1L : 0L);
            if (httpTransaction.getResponseCode() == null) {
                interfaceC47496qV5.mo20954m1(19);
            } else {
                interfaceC47496qV5.mo20956S0(19, httpTransaction.getResponseCode().intValue());
            }
            if (httpTransaction.getResponseMessage() == null) {
                interfaceC47496qV5.mo20954m1(20);
            } else {
                interfaceC47496qV5.mo20958G0(20, httpTransaction.getResponseMessage());
            }
            if (httpTransaction.getError() == null) {
                interfaceC47496qV5.mo20954m1(21);
            } else {
                interfaceC47496qV5.mo20958G0(21, httpTransaction.getError());
            }
            if (httpTransaction.getResponsePayloadSize() == null) {
                interfaceC47496qV5.mo20954m1(22);
            } else {
                interfaceC47496qV5.mo20956S0(22, httpTransaction.getResponsePayloadSize().longValue());
            }
            if (httpTransaction.getResponseContentType() == null) {
                interfaceC47496qV5.mo20954m1(23);
            } else {
                interfaceC47496qV5.mo20958G0(23, httpTransaction.getResponseContentType());
            }
            if (httpTransaction.getResponseHeaders() == null) {
                interfaceC47496qV5.mo20954m1(24);
            } else {
                interfaceC47496qV5.mo20958G0(24, httpTransaction.getResponseHeaders());
            }
            if (httpTransaction.getResponseHeadersSize() == null) {
                interfaceC47496qV5.mo20954m1(25);
            } else {
                interfaceC47496qV5.mo20956S0(25, httpTransaction.getResponseHeadersSize().longValue());
            }
            if (httpTransaction.getResponseBody() == null) {
                interfaceC47496qV5.mo20954m1(26);
            } else {
                interfaceC47496qV5.mo20958G0(26, httpTransaction.getResponseBody());
            }
            interfaceC47496qV5.mo20956S0(27, httpTransaction.isResponseBodyEncoded() ? 1L : 0L);
            if (httpTransaction.getResponseImageData() == null) {
                interfaceC47496qV5.mo20954m1(28);
            } else {
                interfaceC47496qV5.mo20955X0(28, httpTransaction.getResponseImageData());
            }
            interfaceC47496qV5.mo20956S0(29, httpTransaction.getGraphQlDetected() ? 1L : 0L);
            if (httpTransaction.getGraphQlOperationName() == null) {
                interfaceC47496qV5.mo20954m1(30);
            } else {
                interfaceC47496qV5.mo20958G0(30, httpTransaction.getGraphQlOperationName());
            }
            interfaceC47496qV5.mo20956S0(31, httpTransaction.getId());
        }
    }

    /* renamed from: LN1$f */
    /* loaded from: classes5.dex */
    public class C4898f extends AbstractC41861gz5 {
        public C4898f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM transactions";
        }
    }

    /* renamed from: LN1$g */
    /* loaded from: classes5.dex */
    public class C4899g extends AbstractC41861gz5 {
        public C4899g(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM transactions WHERE requestDate <= ?";
        }
    }

    /* renamed from: LN1$h */
    /* loaded from: classes5.dex */
    public class CallableC4900h implements Callable<Long> {

        /* renamed from: b */
        public final /* synthetic */ HttpTransaction f21340b;

        public CallableC4900h(HttpTransaction httpTransaction) {
            this.f21340b = httpTransaction;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Long call() throws Exception {
            LN1.this.f21325a.m108730c();
            try {
                long m61086m = LN1.this.f21326b.m61086m(this.f21340b);
                LN1.this.f21325a.m108734A();
                return Long.valueOf(m61086m);
            } finally {
                LN1.this.f21325a.m108728g();
            }
        }
    }

    /* renamed from: LN1$i */
    /* loaded from: classes5.dex */
    public class CallableC4901i implements Callable<Integer> {

        /* renamed from: b */
        public final /* synthetic */ HttpTransaction f21342b;

        public CallableC4901i(HttpTransaction httpTransaction) {
            this.f21342b = httpTransaction;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() throws Exception {
            LN1.this.f21325a.m108730c();
            try {
                LN1.this.f21325a.m108734A();
                return Integer.valueOf(LN1.this.f21327c.m64207j(this.f21342b) + 0);
            } finally {
                LN1.this.f21325a.m108728g();
            }
        }
    }

    /* renamed from: LN1$j */
    /* loaded from: classes5.dex */
    public class CallableC4902j implements Callable<Integer> {
        public CallableC4902j() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() throws Exception {
            InterfaceC47496qV5 m37254b = LN1.this.f21328d.m37254b();
            LN1.this.f21325a.m108730c();
            try {
                Integer valueOf = Integer.valueOf(m37254b.mo17482M());
                LN1.this.f21325a.m108734A();
                return valueOf;
            } finally {
                LN1.this.f21325a.m108728g();
                LN1.this.f21328d.m37249h(m37254b);
            }
        }
    }

    /* renamed from: LN1$k */
    /* loaded from: classes5.dex */
    public class CallableC4903k implements Callable<Integer> {

        /* renamed from: b */
        public final /* synthetic */ long f21345b;

        public CallableC4903k(long j) {
            this.f21345b = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() throws Exception {
            InterfaceC47496qV5 m37254b = LN1.this.f21329e.m37254b();
            m37254b.mo20956S0(1, this.f21345b);
            LN1.this.f21325a.m108730c();
            try {
                Integer valueOf = Integer.valueOf(m37254b.mo17482M());
                LN1.this.f21325a.m108734A();
                return valueOf;
            } finally {
                LN1.this.f21325a.m108728g();
                LN1.this.f21329e.m37249h(m37254b);
            }
        }
    }

    /* renamed from: LN1$l */
    /* loaded from: classes5.dex */
    public class CallableC4904l implements Callable<List<C17147a>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f21347b;

        public CallableC4904l(C33265Hb5 c33265Hb5) {
            this.f21347b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<C17147a> call() throws Exception {
            Long valueOf;
            Long valueOf2;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Integer valueOf3;
            Long valueOf4;
            Long valueOf5;
            String string6;
            boolean z;
            String string7;
            Cursor m102673c = IF0.m102673c(LN1.this.f21325a, this.f21347b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    long j = m102673c.getLong(0);
                    if (m102673c.isNull(1)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(m102673c.getLong(1));
                    }
                    if (m102673c.isNull(2)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(m102673c.getLong(2));
                    }
                    if (m102673c.isNull(3)) {
                        string = null;
                    } else {
                        string = m102673c.getString(3);
                    }
                    if (m102673c.isNull(4)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(4);
                    }
                    if (m102673c.isNull(5)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(5);
                    }
                    if (m102673c.isNull(6)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(6);
                    }
                    if (m102673c.isNull(7)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(7);
                    }
                    if (m102673c.isNull(8)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(m102673c.getInt(8));
                    }
                    if (m102673c.isNull(9)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(m102673c.getLong(9));
                    }
                    if (m102673c.isNull(10)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(m102673c.getLong(10));
                    }
                    if (m102673c.isNull(11)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(11);
                    }
                    if (m102673c.getInt(12) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m102673c.isNull(13)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(13);
                    }
                    arrayList.add(new C17147a(j, valueOf, valueOf2, string, string2, string3, string4, string5, valueOf3, valueOf4, valueOf5, string6, z, string7));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f21347b.release();
        }
    }

    public LN1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f21325a = abstractC32563Eb5;
        this.f21326b = new C4896d(abstractC32563Eb5);
        this.f21327c = new C4897e(abstractC32563Eb5);
        this.f21328d = new C4898f(abstractC32563Eb5);
        this.f21329e = new C4899g(abstractC32563Eb5);
    }

    /* renamed from: o */
    public static List<Class<?>> m97007o() {
        return Collections.emptyList();
    }

    @Override // p000.KN1
    /* renamed from: a */
    public LiveData<List<C17147a>> mo97021a(String str, String str2, String str3) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions WHERE responseCode LIKE ? AND (path LIKE ? OR graphQlOperationName LIKE ?) ORDER BY requestDate DESC", 3);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        if (str2 == null) {
            m103680c.mo20954m1(2);
        } else {
            m103680c.mo20958G0(2, str2);
        }
        if (str3 == null) {
            m103680c.mo20954m1(3);
        } else {
            m103680c.mo20958G0(3, str3);
        }
        return this.f21325a.m108725k().m18142e(new String[]{"transactions"}, false, new CallableC4893a(m103680c));
    }

    @Override // p000.KN1
    /* renamed from: b */
    public List<HttpTransaction> mo97020b(long j) {
        C33265Hb5 c33265Hb5;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        Long valueOf4;
        int i;
        String string9;
        String string10;
        Long valueOf5;
        String string11;
        boolean z;
        Integer valueOf6;
        String string12;
        String string13;
        Long valueOf7;
        String string14;
        String string15;
        Long valueOf8;
        String string16;
        boolean z2;
        byte[] blob;
        boolean z3;
        String string17;
        int i2;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM transactions WHERE requestDate >= ?", 1);
        m103680c.mo20956S0(1, j);
        this.f21325a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f21325a, m103680c, false, null);
        try {
            int m41645e = C40824fF0.m41645e(m102673c, "id");
            int m41645e2 = C40824fF0.m41645e(m102673c, "requestDate");
            int m41645e3 = C40824fF0.m41645e(m102673c, "responseDate");
            int m41645e4 = C40824fF0.m41645e(m102673c, "tookMs");
            int m41645e5 = C40824fF0.m41645e(m102673c, "protocol");
            int m41645e6 = C40824fF0.m41645e(m102673c, "method");
            int m41645e7 = C40824fF0.m41645e(m102673c, "url");
            int m41645e8 = C40824fF0.m41645e(m102673c, "host");
            int m41645e9 = C40824fF0.m41645e(m102673c, "path");
            int m41645e10 = C40824fF0.m41645e(m102673c, CardPaymentMethod.PAYMENT_METHOD_TYPE);
            int m41645e11 = C40824fF0.m41645e(m102673c, "responseTlsVersion");
            int m41645e12 = C40824fF0.m41645e(m102673c, "responseCipherSuite");
            int m41645e13 = C40824fF0.m41645e(m102673c, "requestPayloadSize");
            int m41645e14 = C40824fF0.m41645e(m102673c, "requestContentType");
            c33265Hb5 = m103680c;
            try {
                int m41645e15 = C40824fF0.m41645e(m102673c, "requestHeaders");
                int m41645e16 = C40824fF0.m41645e(m102673c, "requestHeadersSize");
                int m41645e17 = C40824fF0.m41645e(m102673c, "requestBody");
                int m41645e18 = C40824fF0.m41645e(m102673c, "isRequestBodyEncoded");
                int m41645e19 = C40824fF0.m41645e(m102673c, "responseCode");
                int m41645e20 = C40824fF0.m41645e(m102673c, "responseMessage");
                int m41645e21 = C40824fF0.m41645e(m102673c, "error");
                int m41645e22 = C40824fF0.m41645e(m102673c, "responsePayloadSize");
                int m41645e23 = C40824fF0.m41645e(m102673c, "responseContentType");
                int m41645e24 = C40824fF0.m41645e(m102673c, "responseHeaders");
                int m41645e25 = C40824fF0.m41645e(m102673c, "responseHeadersSize");
                int m41645e26 = C40824fF0.m41645e(m102673c, "responseBody");
                int m41645e27 = C40824fF0.m41645e(m102673c, "isResponseBodyEncoded");
                int m41645e28 = C40824fF0.m41645e(m102673c, "responseImageData");
                int m41645e29 = C40824fF0.m41645e(m102673c, "graphQlDetected");
                int m41645e30 = C40824fF0.m41645e(m102673c, "graphQlOperationName");
                int i3 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    long j2 = m102673c.getLong(m41645e);
                    if (m102673c.isNull(m41645e2)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(m102673c.getLong(m41645e2));
                    }
                    if (m102673c.isNull(m41645e3)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(m102673c.getLong(m41645e3));
                    }
                    if (m102673c.isNull(m41645e4)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(m102673c.getLong(m41645e4));
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e5);
                    }
                    if (m102673c.isNull(m41645e6)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e7);
                    }
                    if (m102673c.isNull(m41645e8)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e9);
                    }
                    if (m102673c.isNull(m41645e10)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e11);
                    }
                    if (m102673c.isNull(m41645e12)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e12);
                    }
                    if (m102673c.isNull(m41645e13)) {
                        i = i3;
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(m102673c.getLong(m41645e13));
                        i = i3;
                    }
                    if (m102673c.isNull(i)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(i);
                    }
                    int i4 = m41645e15;
                    int i5 = m41645e;
                    if (m102673c.isNull(i4)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(i4);
                    }
                    int i6 = m41645e16;
                    if (m102673c.isNull(i6)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(m102673c.getLong(i6));
                    }
                    int i7 = m41645e17;
                    if (m102673c.isNull(i7)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(i7);
                    }
                    int i8 = m41645e18;
                    if (m102673c.getInt(i8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i9 = m41645e19;
                    if (m102673c.isNull(i9)) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(m102673c.getInt(i9));
                    }
                    int i10 = m41645e20;
                    if (m102673c.isNull(i10)) {
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(i10);
                    }
                    int i11 = m41645e21;
                    if (m102673c.isNull(i11)) {
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(i11);
                    }
                    int i12 = m41645e22;
                    if (m102673c.isNull(i12)) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Long.valueOf(m102673c.getLong(i12));
                    }
                    int i13 = m41645e23;
                    if (m102673c.isNull(i13)) {
                        string14 = null;
                    } else {
                        string14 = m102673c.getString(i13);
                    }
                    int i14 = m41645e24;
                    if (m102673c.isNull(i14)) {
                        string15 = null;
                    } else {
                        string15 = m102673c.getString(i14);
                    }
                    int i15 = m41645e25;
                    if (m102673c.isNull(i15)) {
                        valueOf8 = null;
                    } else {
                        valueOf8 = Long.valueOf(m102673c.getLong(i15));
                    }
                    int i16 = m41645e26;
                    if (m102673c.isNull(i16)) {
                        string16 = null;
                    } else {
                        string16 = m102673c.getString(i16);
                    }
                    int i17 = m41645e27;
                    if (m102673c.getInt(i17) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i18 = m41645e28;
                    if (m102673c.isNull(i18)) {
                        blob = null;
                    } else {
                        blob = m102673c.getBlob(i18);
                    }
                    int i19 = m41645e29;
                    if (m102673c.getInt(i19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i20 = m41645e30;
                    if (m102673c.isNull(i20)) {
                        i2 = i20;
                        string17 = null;
                    } else {
                        string17 = m102673c.getString(i20);
                        i2 = i20;
                    }
                    arrayList.add(new HttpTransaction(j2, valueOf, valueOf2, valueOf3, string, string2, string3, string4, string5, string6, string7, string8, valueOf4, string9, string10, valueOf5, string11, z, valueOf6, string12, string13, valueOf7, string14, string15, valueOf8, string16, z2, blob, z3, string17));
                    m41645e = i5;
                    m41645e15 = i4;
                    m41645e16 = i6;
                    m41645e17 = i7;
                    m41645e18 = i8;
                    m41645e19 = i9;
                    m41645e20 = i10;
                    m41645e21 = i11;
                    m41645e22 = i12;
                    m41645e23 = i13;
                    m41645e24 = i14;
                    m41645e25 = i15;
                    m41645e26 = i16;
                    m41645e27 = i17;
                    m41645e28 = i18;
                    m41645e29 = i19;
                    m41645e30 = i2;
                    i3 = i;
                }
                m102673c.close();
                c33265Hb5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m102673c.close();
                c33265Hb5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c33265Hb5 = m103680c;
        }
    }

    @Override // p000.KN1
    /* renamed from: c */
    public LiveData<List<C17147a>> mo97019c() {
        return this.f21325a.m108725k().m18142e(new String[]{"transactions"}, false, new CallableC4904l(C33265Hb5.m103680c("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions ORDER BY requestDate DESC", 0)));
    }

    @Override // p000.KN1
    /* renamed from: d */
    public Object mo97018d(long j, Continuation<? super Integer> continuation) {
        return C39621dD0.m44538b(this.f21325a, true, new CallableC4903k(j), continuation);
    }

    @Override // p000.KN1
    /* renamed from: e */
    public Object mo97017e(Continuation<? super List<HttpTransaction>> continuation) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM transactions", 0);
        return C39621dD0.m44539a(this.f21325a, false, IF0.m102675a(), new CallableC4895c(m103680c), continuation);
    }

    @Override // p000.KN1
    /* renamed from: f */
    public Object mo97016f(HttpTransaction httpTransaction, Continuation<? super Long> continuation) {
        return C39621dD0.m44538b(this.f21325a, true, new CallableC4900h(httpTransaction), continuation);
    }

    @Override // p000.KN1
    /* renamed from: g */
    public LiveData<HttpTransaction> mo97015g(long j) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM transactions WHERE id = ?", 1);
        m103680c.mo20956S0(1, j);
        return this.f21325a.m108725k().m18142e(new String[]{"transactions"}, false, new CallableC4894b(m103680c));
    }

    @Override // p000.KN1
    /* renamed from: h */
    public Object mo97014h(HttpTransaction httpTransaction, Continuation<? super Integer> continuation) {
        return C39621dD0.m44538b(this.f21325a, true, new CallableC4901i(httpTransaction), continuation);
    }

    @Override // p000.KN1
    /* renamed from: i */
    public Object mo97013i(Continuation<? super Integer> continuation) {
        return C39621dD0.m44538b(this.f21325a, true, new CallableC4902j(), continuation);
    }
}
