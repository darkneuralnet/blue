package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a-\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0006\u0010\u0006\u001a\u00020\u0000H\u0001\"(\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m28432d2 = {"LgV2;", "Lkotlin/Function1;", "LS42;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "wrapped", "b", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "NoInspectorInfo", "", "Z", "c", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "isDebugInspectorInfoEnabled", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: K32 */
/* loaded from: classes.dex */
public final class K32 {

    /* renamed from: a */
    public static final Function1<S42, Unit> f18989a = C4320a.f18991g;

    /* renamed from: b */
    public static boolean f18990b;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: K32$a */
    /* loaded from: classes.dex */
    public static final class C4320a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public static final C4320a f18991g = new C4320a();

        public C4320a() {
            super(1);
        }

        /* renamed from: a */
        public final void m99300a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m99300a(s42);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final Function1<S42, Unit> m99303a() {
        return f18989a;
    }

    @PublishedApi
    /* renamed from: b */
    public static final InterfaceC41563gV2 m99302b(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super S42, Unit> inspectorInfo, InterfaceC41563gV2 wrapped) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        J32 j32 = new J32(inspectorInfo);
        return interfaceC41563gV2.mo39266t0(j32).mo39266t0(wrapped).mo39266t0(j32.m101240a());
    }

    /* renamed from: c */
    public static final boolean m99301c() {
        return f18990b;
    }
}
