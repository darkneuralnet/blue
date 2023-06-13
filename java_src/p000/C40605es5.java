package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001bBK\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014\u0012\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m28432d2 = {"Les5;", "Lds5;", "LT42;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lbs5;", "c", "Lbs5;", "H", "()Lbs5;", "semanticsConfiguration", "mergeDescendants", "clearAndSetSemantics", "Lkotlin/Function1;", "Lss5;", "", "Lkotlin/ExtensionFunctionType;", "properties", "LS42;", "inspectorInfo", "<init>", "(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: es5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40605es5 extends T42 implements InterfaceC40012ds5 {

    /* renamed from: d */
    public static final C20126a f79036d = new C20126a(null);

    /* renamed from: e */
    public static AtomicInteger f79037e = new AtomicInteger(0);

    /* renamed from: c */
    public final C38809bs5 f79038c;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Les5$a;", "", "", C17296a.f69688o, "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "lastIdentifier", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: es5$a */
    /* loaded from: classes.dex */
    public static final class C20126a {
        public /* synthetic */ C20126a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m42472a() {
            return C40605es5.f79037e.addAndGet(1);
        }

        private C20126a() {
        }
    }

    public /* synthetic */ C40605es5(boolean z, boolean z2, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, function1, (i & 8) != 0 ? K32.m99303a() : function12);
    }

    @Override // p000.InterfaceC40012ds5
    /* renamed from: H */
    public C38809bs5 mo42474H() {
        return this.f79038c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C40605es5) && Intrinsics.areEqual(mo42474H(), ((C40605es5) obj).mo42474H())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return mo42474H().hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40605es5(boolean z, boolean z2, Function1<? super InterfaceC48906ss5, Unit> properties, Function1<? super S42, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        C38809bs5 c38809bs5 = new C38809bs5();
        c38809bs5.m62251w(z);
        c38809bs5.m62252v(z2);
        properties.invoke(c38809bs5);
        this.f79038c = c38809bs5;
    }
}
