package p000;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.library.flow.FlowActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BÀ\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00020\b\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00190\b\u0012K\u0010%\u001aG\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001c¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R2\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0003\u0010\u0016R2\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00190\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\\\u0010%\u001aG\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001c8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b\u0013\u0010$¨\u0006("}, m28432d2 = {"LDi0;", "", "", C17296a.f69688o, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/jvm/functions/Function1;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/jvm/functions/Function1;", "title", "Lkotlin/Function0;", "", "c", "Lkotlin/jvm/functions/Function0;", "f", "()Lkotlin/jvm/functions/Function0;", "isEnabled", "animateTransition", "Landroid/view/View;", "e", "view", "Lkotlin/Function3;", "rootView", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/library/flow/FlowActivity;", "activity", "Llv1;", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "presenterFactory", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "flow_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Di0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32387Di0 {

    /* renamed from: a */
    public final String f6205a;

    /* renamed from: b */
    public final Function1<Context, String> f6206b;

    /* renamed from: c */
    public final Function0<Boolean> f6207c;

    /* renamed from: d */
    public final Function0<Boolean> f6208d;

    /* renamed from: e */
    public final Function1<Context, View> f6209e;

    /* renamed from: f */
    public final Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> f6210f;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Di0$a */
    /* loaded from: classes3.dex */
    public static final class C1586a extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C1586a f6211g = new C1586a();

        public C1586a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C32387Di0(String id, Function1<? super Context, String> title, Function0<Boolean> isEnabled, Function0<Boolean> animateTransition, Function1<? super Context, ? extends View> view, Function3<? super View, ? super ScopeProvider, ? super FlowActivity, ? extends InterfaceC44782lv1> presenterFactory) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(animateTransition, "animateTransition");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        this.f6205a = id;
        this.f6206b = title;
        this.f6207c = isEnabled;
        this.f6208d = animateTransition;
        this.f6209e = view;
        this.f6210f = presenterFactory;
    }

    /* renamed from: a */
    public final Function0<Boolean> m110001a() {
        return this.f6208d;
    }

    /* renamed from: b */
    public final String m110000b() {
        return this.f6205a;
    }

    /* renamed from: c */
    public final Function3<View, ScopeProvider, FlowActivity, InterfaceC44782lv1> m109999c() {
        return this.f6210f;
    }

    /* renamed from: d */
    public final Function1<Context, String> m109998d() {
        return this.f6206b;
    }

    /* renamed from: e */
    public final Function1<Context, View> m109997e() {
        return this.f6209e;
    }

    /* renamed from: f */
    public final Function0<Boolean> m109996f() {
        return this.f6207c;
    }

    public /* synthetic */ C32387Di0(String str, Function1 function1, Function0 function0, Function0 function02, Function1 function12, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1, function0, (i & 8) != 0 ? C1586a.f6211g : function02, function12, function3);
    }
}
