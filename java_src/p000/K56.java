package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.skydoves.balloon.Balloon;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007¨\u0006\u000b"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", Entry.TYPE_TEXT, "Lkotlin/Function1;", "Lcom/skydoves/balloon/Balloon$a;", "", "Lkotlin/ExtensionFunctionType;", "additionalConfig", "Lcom/skydoves/balloon/Balloon;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTooltip+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip+.kt\nco/bird/android/utility/misc/Tooltip_Kt\n+ 2 Balloon.kt\ncom/skydoves/balloon/BalloonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n133#2:40\n1#3:41\n*S KotlinDebug\n*F\n+ 1 Tooltip+.kt\nco/bird/android/utility/misc/Tooltip_Kt\n*L\n24#1:40\n*E\n"})
/* renamed from: K56 */
/* loaded from: classes4.dex */
public final class K56 {
    /* renamed from: a */
    public static final Balloon m99238a(Context context, String text, Function1<? super Balloon.C18588a, Unit> function1) {
        LifecycleOwner lifecycleOwner;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Balloon.C18588a c18588a = new Balloon.C18588a(context);
        c18588a.m45640U0(10);
        c18588a.m45646R0(EnumC1606Do.BOTTOM);
        c18588a.m45642T0(EnumC2480Fo.ALIGN_ANCHOR);
        c18588a.m45621c1(8);
        c18588a.m45644S0(0.5f);
        c18588a.m45632Y0(4.0f);
        c18588a.m45600j1(14.0f);
        c18588a.m45606h1(text);
        c18588a.m45603i1(C32364Df4.birdWhite);
        c18588a.m45636W0(C32364Df4.birdNewRoad);
        c18588a.m45634X0(EnumC8825Vw.FADE);
        if (context instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) context;
        } else {
            lifecycleOwner = null;
        }
        c18588a.m45627a1(lifecycleOwner);
        if (function1 != null) {
            function1.invoke(c18588a);
        }
        return c18588a.m45629a();
    }

    public static /* synthetic */ Balloon createBirdTooltip$default(Context context, String str, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return m99238a(context, str, function1);
    }
}
