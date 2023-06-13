package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import kotlin.text.Typography;
import p000.C34841Nu6;
import p000.EM4;
import p000.Y70;
/* renamed from: mI4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC45006mI4<T> implements Comparable<AbstractC45006mI4<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private Y70.C9639a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private EM4.InterfaceC1799a mErrorListener;
    private final C34841Nu6.C5739a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private InterfaceC26038b mRequestCompleteListener;
    private C40864fJ4 mRequestQueue;
    private boolean mResponseDelivered;
    private QN4 mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    /* renamed from: mI4$a */
    /* loaded from: classes.dex */
    public class RunnableC26037a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f97795b;

        /* renamed from: c */
        public final /* synthetic */ long f97796c;

        public RunnableC26037a(String str, long j) {
            this.f97795b = str;
            this.f97796c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC45006mI4.this.mEventLog.m93200a(this.f97795b, this.f97796c);
            AbstractC45006mI4.this.mEventLog.m93199b(AbstractC45006mI4.this.toString());
        }
    }

    /* renamed from: mI4$b */
    /* loaded from: classes.dex */
    public interface InterfaceC26038b {
        /* renamed from: a */
        void mo11189a(AbstractC45006mI4<?> abstractC45006mI4);

        /* renamed from: b */
        void mo11188b(AbstractC45006mI4<?> abstractC45006mI4, EM4<?> em4);
    }

    /* renamed from: mI4$c */
    /* loaded from: classes.dex */
    public enum EnumC26039c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public AbstractC45006mI4(String str, EM4.InterfaceC1799a interfaceC1799a) {
        this(-1, str, interfaceC1799a);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue(), str));
                    sb.append(Typography.amp);
                } else {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri parse;
        String host;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            return host.hashCode();
        }
        return 0;
    }

    public void addMarker(String str) {
        if (C34841Nu6.C5739a.f25361c) {
            this.mEventLog.m93200a(str, Thread.currentThread().getId());
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((AbstractC45006mI4) ((AbstractC45006mI4) obj));
    }

    public void deliverError(VolleyError volleyError) {
        EM4.InterfaceC1799a interfaceC1799a;
        synchronized (this.mLock) {
            interfaceC1799a = this.mErrorListener;
        }
        if (interfaceC1799a != null) {
            interfaceC1799a.onErrorResponse(volleyError);
        }
    }

    public abstract void deliverResponse(T t);

    public void finish(String str) {
        C40864fJ4 c40864fJ4 = this.mRequestQueue;
        if (c40864fJ4 != null) {
            c40864fJ4.m41569c(this);
        }
        if (C34841Nu6.C5739a.f25361c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC26037a(str, id));
                return;
            }
            this.mEventLog.m93200a(str, id);
            this.mEventLog.m93199b(toString());
        }
    }

    public byte[] getBody() throws AuthFailureError {
        Map<String, String> params = getParams();
        if (params != null && params.size() > 0) {
            return encodeParameters(params, getParamsEncoding());
        }
        return null;
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public Y70.C9639a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method != 0 && method != -1) {
            return Integer.toString(method) + CoreConstants.DASH_CHAR + url;
        }
        return url;
    }

    public EM4.InterfaceC1799a getErrorListener() {
        EM4.InterfaceC1799a interfaceC1799a;
        synchronized (this.mLock) {
            interfaceC1799a = this.mErrorListener;
        }
        return interfaceC1799a;
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getParams() throws AuthFailureError {
        return null;
    }

    public String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() throws AuthFailureError {
        Map<String, String> postParams = getPostParams();
        if (postParams != null && postParams.size() > 0) {
            return encodeParameters(postParams, getPostParamsEncoding());
        }
        return null;
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    public Map<String, String> getPostParams() throws AuthFailureError {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public EnumC26039c getPriority() {
        return EnumC26039c.NORMAL;
    }

    public QN4 getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().mo10094c();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        InterfaceC26038b interfaceC26038b;
        synchronized (this.mLock) {
            interfaceC26038b = this.mRequestCompleteListener;
        }
        if (interfaceC26038b != null) {
            interfaceC26038b.mo11189a(this);
        }
    }

    public void notifyListenerResponseReceived(EM4<?> em4) {
        InterfaceC26038b interfaceC26038b;
        synchronized (this.mLock) {
            interfaceC26038b = this.mRequestCompleteListener;
        }
        if (interfaceC26038b != null) {
            interfaceC26038b.mo11188b(this, em4);
        }
    }

    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    public abstract EM4<T> parseNetworkResponse(O73 o73);

    public void sendEvent(int i) {
        C40864fJ4 c40864fJ4 = this.mRequestQueue;
        if (c40864fJ4 != null) {
            c40864fJ4.m41567e(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC45006mI4<?> setCacheEntry(Y70.C9639a c9639a) {
        this.mCacheEntry = c9639a;
        return this;
    }

    public void setNetworkRequestCompleteListener(InterfaceC26038b interfaceC26038b) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = interfaceC26038b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC45006mI4<?> setRequestQueue(C40864fJ4 c40864fJ4) {
        this.mRequestQueue = c40864fJ4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC45006mI4<?> setRetryPolicy(QN4 qn4) {
        this.mRetryPolicy = qn4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC45006mI4<?> setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC45006mI4<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC45006mI4<?> setShouldRetryConnectionErrors(boolean z) {
        this.mShouldRetryConnectionErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC45006mI4<?> setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC45006mI4<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb = new StringBuilder();
        if (isCanceled()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb.append(str);
        sb.append(getUrl());
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(getPriority());
        sb.append(" ");
        sb.append(this.mSequence);
        return sb.toString();
    }

    public AbstractC45006mI4(int i, String str, EM4.InterfaceC1799a interfaceC1799a) {
        this.mEventLog = C34841Nu6.C5739a.f25361c ? new C34841Nu6.C5739a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = interfaceC1799a;
        setRetryPolicy(new C49889uY0());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    public int compareTo(AbstractC45006mI4<T> abstractC45006mI4) {
        EnumC26039c priority = getPriority();
        EnumC26039c priority2 = abstractC45006mI4.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - abstractC45006mI4.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }
}
