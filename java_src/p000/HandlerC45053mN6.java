package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* renamed from: mN6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class HandlerC45053mN6 extends Handler {

    /* renamed from: b */
    public static HandlerC45053mN6 f97934b;

    /* renamed from: a */
    public WeakReference<UF2> f97935a;

    /* renamed from: mN6$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C26079a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97936a;

        static {
            int[] iArr = new int[EnumC38504bM6.values().length];
            f97936a = iArr;
            try {
                iArr[EnumC38504bM6.GET_REQUEST_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97936a[EnumC38504bM6.GET_REQUEST_SUCCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97936a[EnumC38504bM6.GET_REQUEST_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97936a[EnumC38504bM6.POST_REQUEST_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f97936a[EnumC38504bM6.POST_REQUEST_SUCCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f97936a[EnumC38504bM6.POST_REQUEST_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public HandlerC45053mN6(Looper looper, UF2 uf2) {
        super(looper);
        this.f97935a = new WeakReference<>(uf2);
    }

    /* renamed from: a */
    public static synchronized HandlerC45053mN6 m25694a(Looper looper, UF2 uf2) {
        HandlerC45053mN6 handlerC45053mN6;
        synchronized (HandlerC45053mN6.class) {
            if (f97934b == null) {
                f97934b = new HandlerC45053mN6(looper, uf2);
            }
            handlerC45053mN6 = f97934b;
        }
        return handlerC45053mN6;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        EnumC38504bM6 m64629b;
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        if (this.f97935a.get() == null || (m64629b = EnumC38504bM6.m64629b(message.what)) == null) {
            return;
        }
        switch (C26079a.f97936a[m64629b.ordinal()]) {
            case 1:
                KJ6.m99012a(HandlerC45053mN6.class, 0, "GET request to " + EnumC39097cM6.RAMP_CONFIG_URL.toString());
                sb = new StringBuilder();
                sb.append("GET request to ");
                sb.append(message.obj);
                str = " succeeded";
                sb.append(str);
                KJ6.m99012a(HandlerC45053mN6.class, 0, sb.toString());
                return;
            case 2:
                sb = new StringBuilder();
                sb.append("GET request to ");
                sb.append(message.obj);
                str = " succeeded";
                sb.append(str);
                KJ6.m99012a(HandlerC45053mN6.class, 0, sb.toString());
                return;
            case 3:
                sb2 = new StringBuilder();
                sb2.append("GET request to ");
                sb2.append(message.obj);
                sb2.append(" error.");
                KJ6.m99012a(HandlerC45053mN6.class, 3, sb2.toString());
                return;
            case 4:
                sb = new StringBuilder();
                sb.append("POST request to ");
                sb.append(message.obj);
                str = " started.";
                sb.append(str);
                KJ6.m99012a(HandlerC45053mN6.class, 0, sb.toString());
                return;
            case 5:
                sb = new StringBuilder();
                sb.append("POST request to ");
                sb.append(message.obj);
                str = " successfully.";
                sb.append(str);
                KJ6.m99012a(HandlerC45053mN6.class, 0, sb.toString());
                return;
            case 6:
                sb2 = new StringBuilder();
                sb2.append("POST request to ");
                sb2.append(message.obj);
                sb2.append(" error.");
                KJ6.m99012a(HandlerC45053mN6.class, 3, sb2.toString());
                return;
            default:
                return;
        }
    }
}
