package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Liv2;", "", "LU94;", "Lcf3;", "b", "LU94;", "LocalOnBackPressedDispatcherOwner", C17296a.f69688o, "(LEt0;I)Lcf3;", "current", "<init>", "()V", "activity-compose_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,110:1\n76#2:111\n76#2:112\n76#2:113\n23#3,8:114\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:111\n52#1:112\n53#1:113\n53#1:114,8\n*E\n"})
/* renamed from: iv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43004iv2 {

    /* renamed from: a */
    public static final C43004iv2 f91709a = new C43004iv2();

    /* renamed from: b */
    public static final U94<InterfaceC39270cf3> f91710b = C41806gu0.m37351c(null, C24643a.f91712g, 1, null);

    /* renamed from: c */
    public static final int f91711c = 0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcf3;", "b", "()Lcf3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iv2$a */
    /* loaded from: classes.dex */
    public static final class C24643a extends Lambda implements Function0<InterfaceC39270cf3> {

        /* renamed from: g */
        public static final C24643a f91712g = new C24643a();

        public C24643a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC39270cf3 invoke() {
            return null;
        }
    }

    private C43004iv2() {
    }

    @JvmName(name = "getCurrent")
    /* renamed from: a */
    public final InterfaceC39270cf3 m31645a(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-2068013981);
        InterfaceC39270cf3 interfaceC39270cf3 = (InterfaceC39270cf3) interfaceC32720Et0.mo89572c(f91710b);
        interfaceC32720Et0.mo89638F(1680121597);
        if (interfaceC39270cf3 == null) {
            interfaceC39270cf3 = C36002St6.m84672a((View) interfaceC32720Et0.mo89572c(C11411h.m68320k()));
        }
        interfaceC32720Et0.mo89605Q();
        if (interfaceC39270cf3 == null) {
            Context context = (Context) interfaceC32720Et0.mo89572c(C11411h.m68324g());
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof InterfaceC39270cf3) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(context, "innerContext.baseContext");
                } else {
                    context = null;
                    break;
                }
            }
            interfaceC39270cf3 = (InterfaceC39270cf3) context;
        }
        interfaceC32720Et0.mo89605Q();
        return interfaceC39270cf3;
    }
}
