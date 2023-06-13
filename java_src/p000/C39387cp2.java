package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000f"}, m28432d2 = {"Lcp2;", "Landroid/view/LayoutInflater;", "Landroid/content/Context;", "newContext", "cloneInContext", "viewContext", "", "name", "Landroid/util/AttributeSet;", "attrs", "Landroid/view/View;", "b", "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "viewpump_release"}, m28431k = 1, m28430mv = {1, 6, 0})
@SuppressLint({"SoonBlockedPrivateApi"})
/* renamed from: cp2  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39387cp2 extends LayoutInflater {

    /* renamed from: a */
    public static final C19605b f75664a = new C19605b(null);
    @Deprecated

    /* renamed from: b */
    public static final Lazy<Field> f75665b;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: cp2$a */
    /* loaded from: classes7.dex */
    public static final class C19604a extends Lambda implements Function0<Field> {

        /* renamed from: g */
        public static final C19604a f75666g = new C19604a();

        public C19604a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Field invoke() {
            Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField;
            }
            throw new IllegalArgumentException("No constructor arguments field found in LayoutInflater!".toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lcp2$b;", "", "Ljava/lang/reflect/Field;", "CONSTRUCTOR_ARGS_FIELD$delegate", "Lkotlin/Lazy;", "b", "()Ljava/lang/reflect/Field;", "CONSTRUCTOR_ARGS_FIELD", "<init>", "()V", "viewpump_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: cp2$b */
    /* loaded from: classes7.dex */
    public static final class C19605b {
        public /* synthetic */ C19605b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final Field m45070b() {
            return (Field) C39387cp2.f75665b.getValue();
        }

        private C19605b() {
        }
    }

    static {
        Lazy<Field> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(C19604a.f75666g);
        f75665b = lazy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39387cp2(Context newContext) {
        super(newContext);
        Intrinsics.checkNotNullParameter(newContext, "newContext");
    }

    /* renamed from: b */
    public final View m45072b(Context viewContext, String name, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        C19605b c19605b = f75664a;
        Object obj = c19605b.m45070b().get(this);
        if (obj != null) {
            Object[] objArr = (Object[]) obj;
            objArr[0] = viewContext;
            c19605b.m45070b().set(this, objArr);
            return createView(name, null, attrs);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context newContext) {
        Intrinsics.checkNotNullParameter(newContext, "newContext");
        return new C39387cp2(newContext);
    }
}
