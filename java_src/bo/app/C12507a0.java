package bo.app;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J'\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lbo/app/a0;", "", "", "key", "", "blocklistedAttributes", "", C17296a.f69688o, "value", "", "values", "([Ljava/lang/String;)[Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.a0 */
/* loaded from: classes.dex */
public final class C12507a0 {

    /* renamed from: a */
    public static final C12507a0 f58204a = new C12507a0();

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a0$a */
    /* loaded from: classes.dex */
    public static final class C12508a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12508a f58205b = new C12508a();

        public C12508a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a0$b */
    /* loaded from: classes.dex */
    public static final class C12509b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58206b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12509b(String str) {
            super(0);
            this.f58206b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be blocklisted attribute: " + ((Object) this.f58206b) + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a0$c */
    /* loaded from: classes.dex */
    public static final class C12510c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12510c f58207b = new C12510c();

        public C12510c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute value cannot be null.";
        }
    }

    private C12507a0() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m63961a(String str, Set<String> blocklistedAttributes) {
        Intrinsics.checkNotNullParameter(blocklistedAttributes, "blocklistedAttributes");
        if (str == null) {
            C43664k20.m29442e(C43664k20.f93782a, f58204a, C43664k20.EnumC25082a.W, null, false, C12508a.f58205b, 6, null);
            return false;
        } else if (blocklistedAttributes.contains(str)) {
            C43664k20.m29442e(C43664k20.f93782a, f58204a, C43664k20.EnumC25082a.W, null, false, new C12509b(str), 6, null);
            return false;
        } else {
            return true;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m63962a(String str) {
        if (str == null) {
            C43664k20.m29442e(C43664k20.f93782a, f58204a, C43664k20.EnumC25082a.W, null, false, C12510c.f58207b, 6, null);
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String[] m63960a(String[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i = 0;
        while (i < length) {
            String str = values[i];
            i++;
            arrayList.add(C51781xj6.m4786b(str));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
