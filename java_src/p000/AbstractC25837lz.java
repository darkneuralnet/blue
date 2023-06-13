package p000;

import com.appboy.events.SimpleValueCallback;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m28432d2 = {"Llz;", "LcO1;", "<init>", "()V", C17296a.f69688o, "La8;", "Lb8;", "LTz0;", "Lmx2;", "LVh3;", "LWh3;", "Lkw4;", "LeJ4;", "LQv5;", "LSv5;", "LZv5;", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: lz */
/* loaded from: classes2.dex */
public abstract class AbstractC25837lz implements InterfaceC39110cO1 {

    /* renamed from: a */
    public static final C25838a f97034a = new C25838a(null);

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ6\u0010\n\u001a\u00020\b*\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Llz$a;", "", "LP10;", "Lkotlin/Function1;", "Lv20;", "Lkotlin/ParameterName;", "name", "user", "", "block", C17296a.f69688o, "(LP10;Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: lz$a */
    /* loaded from: classes2.dex */
    public static final class C25838a {

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, m28432d2 = {"lz$a$a", "Lcom/appboy/events/SimpleValueCallback;", "Lv20;", "user", "", C17296a.f69688o, "onError", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: lz$a$a */
        /* loaded from: classes2.dex */
        public static final class C25839a extends SimpleValueCallback<C50185v20> {

            /* renamed from: a */
            public final /* synthetic */ Function1<C50185v20, Unit> f97035a;

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
            /* renamed from: lz$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C25840a extends Lambda implements Function0<String> {

                /* renamed from: g */
                public static final C25840a f97036g = new C25840a();

                public C25840a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to run on Braze user object";
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C25839a(Function1<? super C50185v20, Unit> function1) {
                this.f97035a = function1;
            }

            @Override // com.appboy.events.SimpleValueCallback, com.appboy.events.IValueCallback
            /* renamed from: a */
            public void onSuccess(C50185v20 user) {
                Intrinsics.checkNotNullParameter(user, "user");
                super.onSuccess(user);
                this.f97035a.invoke(user);
            }

            @Override // com.appboy.events.SimpleValueCallback, com.appboy.events.IValueCallback
            public void onError() {
                super.onError();
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C25840a.f97036g, 7, null);
            }
        }

        public /* synthetic */ C25838a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m26585a(P10 p10, Function1<? super C50185v20, Unit> block) {
            Intrinsics.checkNotNullParameter(p10, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            p10.getCurrentUser(new C25839a(block));
        }

        private C25838a() {
        }
    }

    public /* synthetic */ AbstractC25837lz(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC25837lz() {
    }
}
