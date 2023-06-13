package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0004B\u0019\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m28432d2 = {"LVM4;", "Landroid/content/ContextWrapper;", "Landroid/content/res/Resources;", "getResources", C17296a.f69688o, "Lkotlin/Lazy;", "b", "()Landroid/content/res/Resources;", "res", "Landroid/content/Context;", "base", "LbS5;", "stringRepository", "<init>", "(Landroid/content/Context;LbS5;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: VM4 */
/* loaded from: classes7.dex */
public final class VM4 extends ContextWrapper {

    /* renamed from: b */
    public static final C8610a f38901b = new C8610a(null);

    /* renamed from: a */
    public final Lazy f38902a;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m28432d2 = {"LVM4$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LbS5;", "stringRepository", "LVM4;", C17296a.f69688o, "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: VM4$a */
    /* loaded from: classes7.dex */
    public static final class C8610a {
        public /* synthetic */ C8610a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final VM4 m79932a(Context context, InterfaceC38557bS5 stringRepository) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stringRepository, "stringRepository");
            return new VM4(context, stringRepository, null);
        }

        private C8610a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LZM4;", "b", "()LZM4;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: VM4$b */
    /* loaded from: classes7.dex */
    public static final class C8611b extends Lambda implements Function0<ZM4> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC38557bS5 f38904h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8611b(InterfaceC38557bS5 interfaceC38557bS5) {
            super(0);
            this.f38904h = interfaceC38557bS5;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ZM4 invoke() {
            Resources baseResources = VM4.super.getResources();
            Intrinsics.checkNotNullExpressionValue(baseResources, "baseResources");
            return new ZM4(baseResources, this.f38904h, VM4.this);
        }
    }

    public /* synthetic */ VM4(Context context, InterfaceC38557bS5 interfaceC38557bS5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC38557bS5);
    }

    /* renamed from: b */
    public final Resources m79933b() {
        return (Resources) this.f38902a.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m79933b();
    }

    public VM4(Context context, InterfaceC38557bS5 interfaceC38557bS5) {
        super(context);
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C8611b(interfaceC38557bS5));
        this.f38902a = lazy;
    }
}
