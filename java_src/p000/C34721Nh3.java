package p000;

import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0006B!\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"LNh3;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", "kotlin.jvm.PlatformType", C17296a.f69688o, "LjG2;", "LjG2;", "mainNavigator", "Le13;", "b", "Le13;", "navigator", "LAz6;", "c", "LAz6;", "webArchiveManager", "<init>", "(LjG2;Le13;LAz6;)V", DateTokenConverter.CONVERTER_KEY, "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nh3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34721Nh3 implements MV0 {

    /* renamed from: d */
    public static final C5655a f24999d = new C5655a(null);

    /* renamed from: a */
    public final C43207jG2 f25000a;

    /* renamed from: b */
    public final InterfaceC40099e13 f25001b;

    /* renamed from: c */
    public final InterfaceC31844Az6 f25002c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LNh3$a;", "", "", "EARNINGS_MOTMOT_ARCHIVE_NAME", "Ljava/lang/String;", "<init>", "()V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Nh3$a */
    /* loaded from: classes3.dex */
    public static final class C5655a {
        public /* synthetic */ C5655a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5655a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nh3$b */
    /* loaded from: classes3.dex */
    public static final class C5656b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C5656b f25003g = new C5656b();

        public C5656b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            throw new LV0();
        }
    }

    public C34721Nh3(C43207jG2 mainNavigator, InterfaceC40099e13 navigator, InterfaceC31844Az6 webArchiveManager) {
        Intrinsics.checkNotNullParameter(mainNavigator, "mainNavigator");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(webArchiveManager, "webArchiveManager");
        this.f25000a = mainNavigator;
        this.f25001b = navigator;
        this.f25002c = webArchiveManager;
    }

    /* renamed from: f */
    public static final InterfaceC23496h m93566f(final C34721Nh3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractC23461c m33029z = this$0.f25002c.mo99404b("partner-reports-motmot-app").m33029z(new InterfaceC23478a() { // from class: Lh3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C34721Nh3.m93565g(C34721Nh3.this);
            }
        });
        final C5656b c5656b = C5656b.f25003g;
        return m33029z.m33084B(new InterfaceC23484g() { // from class: Mh3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34721Nh3.m93564h(Function1.this, obj);
            }
        });
    }

    /* renamed from: g */
    public static final void m93565g(C34721Nh3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f25001b.mo37027f0("partner-reports-motmot-app");
    }

    /* renamed from: h */
    public static final void m93564h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final Unit m93563i(C34721Nh3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC40099e13.C19924a.goToRider$default(this$0.f25001b, false, false, null, 7, null);
        return Unit.INSTANCE;
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            str = data.getQueryParameter("destination");
        } else {
            str = null;
        }
        if (str != null && str.hashCode() == -807723863 && str.equals("earnings")) {
            return this.f25000a.mo4134a(intent).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: Jh3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m93566f;
                    m93566f = C34721Nh3.m93566f(C34721Nh3.this);
                    return m93566f;
                }
            }));
        }
        return AbstractC23461c.m33078H(new Callable() { // from class: Kh3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m93563i;
                m93563i = C34721Nh3.m93563i(C34721Nh3.this);
                return m93563i;
            }
        });
    }
}
