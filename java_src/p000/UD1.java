package p000;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \"2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\rB\u0019\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010!J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0017J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014J+\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eR4\u0010\u0015\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"LUD1;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "LWD1;", "", "toString", "", "onPreExecute", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "b", "", "params", C17296a.f69688o, "([Ljava/lang/Void;)Ljava/util/List;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<set-?>", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "exception", "Ljava/net/HttpURLConnection;", "Ljava/net/HttpURLConnection;", "connection", "LVD1;", "c", "LVD1;", "getRequests", "()LVD1;", "requests", "<init>", "(Ljava/net/HttpURLConnection;LVD1;)V", "(LVD1;)V", "e", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: UD1 */
/* loaded from: classes5.dex */
public class UD1 extends AsyncTask<Void, Void, List<? extends WD1>> {

    /* renamed from: a */
    public Exception f37005a;

    /* renamed from: b */
    public final HttpURLConnection f37006b;

    /* renamed from: c */
    public final VD1 f37007c;

    /* renamed from: e */
    public static final C8216a f37004e = new C8216a(null);

    /* renamed from: d */
    public static final String f37003d = UD1.class.getCanonicalName();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LUD1$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: UD1$a */
    /* loaded from: classes5.dex */
    public static final class C8216a {
        private C8216a() {
        }

        public /* synthetic */ C8216a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UD1(HttpURLConnection httpURLConnection, VD1 requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f37006b = httpURLConnection;
        this.f37007c = requests;
    }

    /* renamed from: a */
    public List<WD1> m81821a(Void... params) {
        List<WD1> m52791m;
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            if (TD0.m84203d(this)) {
                return null;
            }
            Intrinsics.checkNotNullParameter(params, "params");
            try {
                HttpURLConnection httpURLConnection = this.f37006b;
                if (httpURLConnection == null) {
                    m52791m = this.f37007c.m80220f();
                } else {
                    m52791m = GraphRequest.f69390s.m52791m(httpURLConnection, this.f37007c);
                }
                return m52791m;
            } catch (Exception e) {
                this.f37005a = e;
                return null;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: b */
    public void m81820b(List<WD1> result) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (TD0.m84203d(this)) {
                return;
            }
            Intrinsics.checkNotNullParameter(result, "result");
            super.onPostExecute(result);
            Exception exc = this.f37005a;
            if (exc != null) {
                String str = f37003d;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                C52364yi6.m2853Y(str, format);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends WD1> doInBackground(Void[] voidArr) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            if (TD0.m84203d(this)) {
                return null;
            }
            return m81821a(voidArr);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends WD1> list) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (TD0.m84203d(this)) {
                return;
            }
            m81820b(list);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        Handler handler;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (TD0.m84203d(this)) {
                return;
            }
            super.onPreExecute();
            if (C17216a.m52724v()) {
                String str = f37003d;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                C52364yi6.m2853Y(str, format);
            }
            if (this.f37007c.m80214v() == null) {
                if (Thread.currentThread() instanceof HandlerThread) {
                    handler = new Handler();
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                this.f37007c.m80225H(handler);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f37006b + ", requests: " + this.f37007c + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UD1(VD1 requests) {
        this(null, requests);
        Intrinsics.checkNotNullParameter(requests, "requests");
    }
}
