package p000;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.MapMode;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.H31;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t\u001aB\u0010\u0010\u001a\u00020\u000b*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u0013²\u0006\f\u0010\u0011\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m28432d2 = {"LXC;", "", "throwable", "Le13;", "navigator", "Lco/bird/android/model/constant/MapMode;", "mapMode", "", "zendeskArticleId", "", "showHelpButton", "", C17296a.f69688o, "LH31;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "genericErrorTitle", "genericErrorMessage", "core-basemvp_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/core/mvp/extensions/Rx_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* renamed from: Zf5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37513Zf5 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zf5$a */
    /* loaded from: classes2.dex */
    public static final class C10322a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ H31 f48926g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10322a(H31 h31) {
            super(0);
            this.f48926g = h31;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f48926g.dismissDialog();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zf5$b */
    /* loaded from: classes2.dex */
    public static final class C10323b extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f48927g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC40099e13 f48928h;

        /* renamed from: i */
        public final /* synthetic */ H31 f48929i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10323b(String str, InterfaceC40099e13 interfaceC40099e13, H31 h31) {
            super(0);
            this.f48927g = str;
            this.f48928h = interfaceC40099e13;
            this.f48929i = h31;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String str = this.f48927g;
            Long longOrNull = str != null ? StringsKt__StringNumberConversionsKt.toLongOrNull(str) : null;
            if (longOrNull != null) {
                this.f48928h.mo36922w3(longOrNull.longValue());
            } else {
                InterfaceC40099e13.C19924a.goToFaq$default(this.f48928h, null, 1, null);
            }
            this.f48929i.dismissDialog();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zf5$c */
    /* loaded from: classes2.dex */
    public static final class C10324c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Context f48930g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10324c(Context context) {
            super(0);
            this.f48930g = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f48930g.getString(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zf5$d */
    /* loaded from: classes2.dex */
    public static final class C10325d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Context f48931g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10325d(Context context) {
            super(0);
            this.f48931g = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f48931g.getString(C45871nl4.web_archive_failed_title);
        }
    }

    /* renamed from: a */
    public static final void m72789a(AbstractC9344XC abstractC9344XC, Throwable throwable, InterfaceC40099e13 navigator, MapMode mapMode, String str, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC9344XC, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        m72788b(abstractC9344XC, abstractC9344XC.getActivity(), throwable, navigator, mapMode, str, z);
    }

    /* renamed from: b */
    public static final void m72788b(H31 h31, Context context, Throwable throwable, InterfaceC40099e13 navigator, MapMode mapMode, String str, boolean z) {
        Lazy lazy;
        Lazy lazy2;
        C49375tg1 c49375tg1;
        boolean isBlank;
        TS5 ts5;
        String str2;
        Integer num;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(h31, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        lazy = LazyKt__LazyJVMKt.lazy(new C10325d(context));
        lazy2 = LazyKt__LazyJVMKt.lazy(new C10324c(context));
        Throwable m87362c = R36.m87362c(throwable);
        boolean z2 = true;
        if (m87362c instanceof RetrofitException) {
            try {
                c49375tg1 = (C49375tg1) ((RetrofitException) m87362c).m53929a(C49375tg1.class);
            } catch (Exception unused) {
                String m72787c = m72787c(lazy);
                String genericErrorMessage = m72786d(lazy2);
                Intrinsics.checkNotNullExpressionValue(genericErrorMessage, "genericErrorMessage");
                c49375tg1 = new C49375tg1(0, genericErrorMessage, m72787c, null, 8, null);
            }
            String genericErrorTitle = c49375tg1.m11931d();
            if (genericErrorTitle == null) {
                genericErrorTitle = m72787c(lazy);
                Intrinsics.checkNotNullExpressionValue(genericErrorTitle, "genericErrorTitle");
            }
            String str3 = genericErrorTitle;
            String genericErrorMessage2 = c49375tg1.m11932c();
            isBlank = StringsKt__StringsJVMKt.isBlank(genericErrorMessage2);
            if (!(!isBlank)) {
                genericErrorMessage2 = null;
            }
            if (genericErrorMessage2 == null) {
                genericErrorMessage2 = m72786d(lazy2);
                Intrinsics.checkNotNullExpressionValue(genericErrorMessage2, "genericErrorMessage");
            }
            ts5 = new TS5(str3, genericErrorMessage2, z, null, 8, null);
        } else if (m87362c instanceof HttpException) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            C49375tg1 m14549l = C28237sD.m14549l(m87362c, resources);
            String genericErrorTitle2 = m14549l.m11931d();
            if (genericErrorTitle2 == null) {
                genericErrorTitle2 = m72787c(lazy);
                Intrinsics.checkNotNullExpressionValue(genericErrorTitle2, "genericErrorTitle");
            }
            String str4 = genericErrorTitle2;
            String genericErrorMessage3 = m14549l.m11932c();
            isBlank2 = StringsKt__StringsJVMKt.isBlank(genericErrorMessage3);
            if (!(!isBlank2)) {
                genericErrorMessage3 = null;
            }
            if (genericErrorMessage3 == null) {
                genericErrorMessage3 = m72786d(lazy2);
                Intrinsics.checkNotNullExpressionValue(genericErrorMessage3, "genericErrorMessage");
            }
            ts5 = new TS5(str4, genericErrorMessage3, z, null, 8, null);
        } else {
            String genericErrorTitle3 = m72787c(lazy);
            Intrinsics.checkNotNullExpressionValue(genericErrorTitle3, "genericErrorTitle");
            String genericErrorMessage4 = m72786d(lazy2);
            Intrinsics.checkNotNullExpressionValue(genericErrorMessage4, "genericErrorMessage");
            ts5 = new TS5(genericErrorTitle3, genericErrorMessage4, z, null, 8, null);
        }
        String string = context.getString(C45871nl4.driver_license_get_help);
        if (ts5.m83589c()) {
            str2 = string;
        } else {
            str2 = null;
        }
        int i = C33804Jj4.dialog_general;
        int i2 = C37287Yg4.title;
        int i3 = C37287Yg4.message;
        String m83588d = ts5.m83588d();
        String m83590b = ts5.m83590b();
        int i4 = C37287Yg4.confirmButton;
        String string2 = context.getString(C45871nl4.dialog_okay);
        Integer valueOf = Integer.valueOf(C37287Yg4.secondaryButton);
        valueOf.intValue();
        if (str2 == null) {
            z2 = false;
        }
        if (z2) {
            num = valueOf;
        } else {
            num = null;
        }
        H31.C3014a.showCustomDialog$default(h31, i, (Integer) null, (Integer) null, false, true, false, Integer.valueOf(i2), Integer.valueOf(i3), (CharSequence) m83588d, (CharSequence) m83590b, i4, num, string2, str2, (Function0) new C10322a(h31), (Function0) new C10323b(str, navigator, h31), (Function0) null, (Function0) null, false, 458798, (Object) null);
    }

    /* renamed from: c */
    public static final String m72787c(Lazy<String> lazy) {
        return lazy.getValue();
    }

    /* renamed from: d */
    public static final String m72786d(Lazy<String> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ void displayStyledError$default(AbstractC9344XC abstractC9344XC, Throwable th, InterfaceC40099e13 interfaceC40099e13, MapMode mapMode, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            mapMode = MapMode.RIDER;
        }
        MapMode mapMode2 = mapMode;
        if ((i & 8) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = false;
        }
        m72789a(abstractC9344XC, th, interfaceC40099e13, mapMode2, str2, z);
    }

    public static /* synthetic */ void displayStyledError$default(H31 h31, Context context, Throwable th, InterfaceC40099e13 interfaceC40099e13, MapMode mapMode, String str, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            mapMode = MapMode.RIDER;
        }
        MapMode mapMode2 = mapMode;
        if ((i & 16) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = false;
        }
        m72788b(h31, context, th, interfaceC40099e13, mapMode2, str2, z);
    }
}
