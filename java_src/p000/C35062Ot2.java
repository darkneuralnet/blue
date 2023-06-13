package p000;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LOt2;", "", "LU94;", "LE5;", "b", "LU94;", "LocalComposition", C17296a.f69688o, "(LEt0;I)LE5;", "current", "<init>", "()V", "activity-compose_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,161:1\n76#2:162\n76#2:163\n23#3,8:164\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n*L\n48#1:162\n49#1:163\n49#1:164,8\n*E\n"})
/* renamed from: Ot2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35062Ot2 {

    /* renamed from: a */
    public static final C35062Ot2 f27528a = new C35062Ot2();

    /* renamed from: b */
    public static final U94<InterfaceC1735E5> f27529b = C41806gu0.m37351c(null, C6201a.f27530g, 1, null);

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LE5;", "b", "()LE5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ot2$a */
    /* loaded from: classes.dex */
    public static final class C6201a extends Lambda implements Function0<InterfaceC1735E5> {

        /* renamed from: g */
        public static final C6201a f27530g = new C6201a();

        public C6201a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC1735E5 invoke() {
            return null;
        }
    }

    private C35062Ot2() {
    }

    @JvmName(name = "getCurrent")
    /* renamed from: a */
    public final InterfaceC1735E5 m91207a(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(1418020823);
        InterfaceC1735E5 interfaceC1735E5 = (InterfaceC1735E5) interfaceC32720Et0.mo89572c(f27529b);
        if (interfaceC1735E5 == null) {
            Context context = (Context) interfaceC32720Et0.mo89572c(C11411h.m68324g());
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof InterfaceC1735E5) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(context, "innerContext.baseContext");
                } else {
                    context = null;
                    break;
                }
            }
            interfaceC1735E5 = (InterfaceC1735E5) context;
        }
        interfaceC32720Et0.mo89605Q();
        return interfaceC1735E5;
    }
}
