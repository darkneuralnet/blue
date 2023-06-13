package co.bird.android.lib.webview.bridge;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ,\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¨\u0006\f"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/WebPayloadTypeAdapterFactory;", "LCb6;", "T", "LoE1;", "gson", "LFb6;", "type", "LBb6;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "b", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class WebPayloadTypeAdapterFactory implements InterfaceC32096Cb6 {

    /* renamed from: b */
    public static final C16021b f66077b = new C16021b(null);

    /* renamed from: c */
    public static final Lazy<C16036d> f66078c;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/d;", "b", "()Lco/bird/android/lib/webview/bridge/d;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.webview.bridge.WebPayloadTypeAdapterFactory$a */
    /* loaded from: classes3.dex */
    public static final class C16020a extends Lambda implements Function0<C16036d> {

        /* renamed from: g */
        public static final C16020a f66079g = new C16020a();

        public C16020a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C16036d invoke() {
            return new C16036d();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/WebPayloadTypeAdapterFactory$b;", "", "Lco/bird/android/lib/webview/bridge/d;", "TYPE_ADAPTER$delegate", "Lkotlin/Lazy;", C17296a.f69688o, "()Lco/bird/android/lib/webview/bridge/d;", "TYPE_ADAPTER", "<init>", "()V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.lib.webview.bridge.WebPayloadTypeAdapterFactory$b */
    /* loaded from: classes3.dex */
    public static final class C16021b {
        public /* synthetic */ C16021b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C16036d m56076a() {
            return (C16036d) WebPayloadTypeAdapterFactory.f66078c.getValue();
        }

        private C16021b() {
        }
    }

    static {
        Lazy<C16036d> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(C16020a.f66079g);
        f66078c = lazy;
    }

    @Override // p000.InterfaceC32096Cb6
    /* renamed from: d */
    public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 gson, C32798Fb6<T> type) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(type, "type");
        if (AbstractC16030b.class.isAssignableFrom(type.getRawType())) {
            C16036d m56076a = f66077b.m56076a();
            Intrinsics.checkNotNull(m56076a, "null cannot be cast to non-null type com.google.gson.TypeAdapter<T of co.bird.android.lib.webview.bridge.WebPayloadTypeAdapterFactory.create>");
            return m56076a;
        }
        return null;
    }
}
