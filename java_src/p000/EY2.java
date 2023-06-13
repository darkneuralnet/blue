package p000;

import androidx.lifecycle.C11759u;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LEY2;", "LOr6;", "LYY2;", "", "backStackEntryId", "", "f", "onCleared", "LWr6;", "b", "toString", "", C17296a.f69688o, "Ljava/util/Map;", "viewModelStores", "<init>", "()V", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: EY2 */
/* loaded from: classes.dex */
public final class EY2 extends AbstractC35048Or6 implements YY2 {

    /* renamed from: b */
    public static final C1864b f7663b = new C1864b(null);

    /* renamed from: c */
    public static final C11759u.InterfaceC11763b f7664c = new C1863a();

    /* renamed from: a */
    public final Map<String, C36920Wr6> f7665a = new LinkedHashMap();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"EY2$a", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: EY2$a */
    /* loaded from: classes.dex */
    public static final class C1863a implements C11759u.InterfaceC11763b {
        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new EY2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LEY2$b;", "", "LWr6;", "viewModelStore", "LEY2;", C17296a.f69688o, "Landroidx/lifecycle/u$b;", "FACTORY", "Landroidx/lifecycle/u$b;", "<init>", "()V", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: EY2$b */
    /* loaded from: classes.dex */
    public static final class C1864b {
        public /* synthetic */ C1864b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final EY2 m108835a(C36920Wr6 viewModelStore) {
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            return (EY2) new C11759u(viewModelStore, EY2.f7664c, null, 4, null).m66922a(EY2.class);
        }

        private C1864b() {
        }
    }

    @Override // p000.YY2
    /* renamed from: b */
    public C36920Wr6 mo74899b(String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        C36920Wr6 c36920Wr6 = this.f7665a.get(backStackEntryId);
        if (c36920Wr6 == null) {
            C36920Wr6 c36920Wr62 = new C36920Wr6();
            this.f7665a.put(backStackEntryId, c36920Wr62);
            return c36920Wr62;
        }
        return c36920Wr6;
    }

    /* renamed from: f */
    public final void m108836f(String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        C36920Wr6 remove = this.f7665a.remove(backStackEntryId);
        if (remove != null) {
            remove.m77779a();
        }
    }

    @Override // p000.AbstractC35048Or6
    public void onCleared() {
        for (C36920Wr6 c36920Wr6 : this.f7665a.values()) {
            c36920Wr6.m77779a();
        }
        this.f7665a.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.f7665a.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
