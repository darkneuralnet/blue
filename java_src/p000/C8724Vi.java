package p000;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C1706E1;
import p000.C7508Si;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LVi;", "", "LE1;", "accessTokenAppIdPair", "Luv5;", "appEvents", "", C17296a.f69688o, "LTi;", "eventsToPersist", "b", "LlR3;", "c", DateTokenConverter.CONVERTER_KEY, "(LlR3;)V", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Vi */
/* loaded from: classes5.dex */
public final class C8724Vi {

    /* renamed from: a */
    public static final String f39498a;

    /* renamed from: b */
    public static final C8724Vi f39499b = new C8724Vi();

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, m28432d2 = {"LVi$a;", "Ljava/io/ObjectInputStream;", "Ljava/io/ObjectStreamClass;", "readClassDescriptor", "Ljava/io/InputStream;", "inputStream", "<init>", "(Ljava/io/InputStream;)V", "b", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Vi$a */
    /* loaded from: classes5.dex */
    public static final class C8725a extends ObjectInputStream {

        /* renamed from: b */
        public static final C8726a f39500b = new C8726a(null);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LVi$a$a;", "", "", "ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME", "Ljava/lang/String;", "APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: Vi$a$a */
        /* loaded from: classes5.dex */
        public static final class C8726a {
            private C8726a() {
            }

            public /* synthetic */ C8726a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C8725a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(C1706E1.C1708b.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(C7508Si.C7510b.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    static {
        String name = C8724Vi.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "AppEventStore::class.java.name");
        f39498a = name;
    }

    private C8724Vi() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m79555a(C1706E1 accessTokenAppIdPair, C50122uv5 appEvents) {
        synchronized (C8724Vi.class) {
            if (TD0.m84203d(C8724Vi.class)) {
                return;
            }
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            C9155Wi.m77978b();
            C44493lR3 m79553c = m79553c();
            m79553c.m27294a(accessTokenAppIdPair, appEvents.m9488d());
            m79552d(m79553c);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final synchronized void m79554b(C7913Ti eventsToPersist) {
        synchronized (C8724Vi.class) {
            if (TD0.m84203d(C8724Vi.class)) {
                return;
            }
            Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
            C9155Wi.m77978b();
            C44493lR3 m79553c = m79553c();
            for (C1706E1 c1706e1 : eventsToPersist.m83145f()) {
                C50122uv5 m83148c = eventsToPersist.m83148c(c1706e1);
                if (m83148c != null) {
                    m79553c.m27294a(c1706e1, m83148c.m9488d());
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            m79552d(m79553c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:9:0x000e, B:14:0x0032, B:15:0x0035, B:50:0x00a2, B:18:0x0040, B:29:0x005e, B:30:0x0061, B:33:0x006c, B:34:0x0070, B:36:0x0075, B:37:0x0078, B:41:0x008a, B:40:0x0083, B:43:0x008c, B:44:0x008f, B:47:0x009a), top: B:61:0x0003 }] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.Context] */
    @JvmStatic
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized C44493lR3 m79553c() {
        C8725a c8725a;
        String str;
        String str2;
        C44493lR3 c44493lR3;
        Object readObject;
        synchronized (C8724Vi.class) {
            ?? m84203d = TD0.m84203d(C8724Vi.class);
            if (m84203d != 0) {
                return null;
            }
            try {
                C9155Wi.m77978b();
                m84203d = C17216a.m52741e();
            } catch (Throwable th) {
                th = th;
            }
            try {
                FileInputStream openFileInput = m84203d.openFileInput("AppEventsLogger.persistedevents");
                Intrinsics.checkNotNullExpressionValue(openFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                c8725a = new C8725a(new BufferedInputStream(openFileInput));
                try {
                    readObject = c8725a.readObject();
                } catch (FileNotFoundException unused) {
                    C52364yi6.m2839g(c8725a);
                    try {
                        m84203d.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e) {
                        e = e;
                        str = f39498a;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                        c44493lR3 = null;
                        if (c44493lR3 == null) {
                        }
                        return c44493lR3;
                    }
                    c44493lR3 = null;
                    if (c44493lR3 == null) {
                    }
                    return c44493lR3;
                } catch (Exception e2) {
                    e = e2;
                    Log.w(f39498a, "Got unexpected exception while reading events: ", e);
                    C52364yi6.m2839g(c8725a);
                    try {
                        m84203d.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e3) {
                        e = e3;
                        str = f39498a;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                        c44493lR3 = null;
                        if (c44493lR3 == null) {
                        }
                        return c44493lR3;
                    }
                    c44493lR3 = null;
                    if (c44493lR3 == null) {
                    }
                    return c44493lR3;
                }
            } catch (FileNotFoundException unused2) {
                c8725a = null;
            } catch (Exception e4) {
                e = e4;
                c8725a = null;
            } catch (Throwable th2) {
                th = th2;
                C52364yi6.m2839g(null);
                try {
                    m84203d.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e5) {
                    Log.w(f39498a, "Got unexpected exception when removing events file: ", e5);
                }
                throw th;
            }
            if (readObject != null) {
                c44493lR3 = (C44493lR3) readObject;
                C52364yi6.m2839g(c8725a);
                try {
                    m84203d.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e6) {
                    Log.w(f39498a, "Got unexpected exception when removing events file: ", e6);
                }
                if (c44493lR3 == null) {
                    c44493lR3 = new C44493lR3();
                }
                return c44493lR3;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m79552d(C44493lR3 c44493lR3) {
        if (TD0.m84203d(C8724Vi.class)) {
            return;
        }
        try {
            Context m52741e = C17216a.m52741e();
            ObjectOutputStream objectOutputStream = null;
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(m52741e.openFileOutput("AppEventsLogger.persistedevents", 0)));
                try {
                    objectOutputStream2.writeObject(c44493lR3);
                    C52364yi6.m2839g(objectOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    Log.w(f39498a, "Got unexpected exception while persisting events: ", th);
                    try {
                        m52741e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                    C52364yi6.m2839g(objectOutputStream);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            TD0.m84205b(th3, C8724Vi.class);
        }
    }
}
