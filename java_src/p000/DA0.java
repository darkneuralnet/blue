package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m28432d2 = {"LDA0;", "", "<init>", "()V", C17296a.f69688o, "b", "c", "LDA0$a;", "LDA0$b;", "LDA0$c;", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DA0 */
/* loaded from: classes4.dex */
public abstract class DA0 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LDA0$a;", "LDA0;", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: DA0$a */
    /* loaded from: classes4.dex */
    public static final class C1411a extends DA0 {

        /* renamed from: a */
        public static final C1411a f5314a = new C1411a();

        private C1411a() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LDA0$b;", "LDA0;", "", "message", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: DA0$b */
    /* loaded from: classes4.dex */
    public static final class C1412b extends DA0 {

        /* renamed from: a */
        public final String f5315a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1412b(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f5315a = message;
        }

        public static /* synthetic */ C1412b copy$default(C1412b c1412b, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c1412b.f5315a;
            }
            return c1412b.m110822a(str);
        }

        /* renamed from: a */
        public final C1412b m110822a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new C1412b(message);
        }

        /* renamed from: b */
        public final String m110821b() {
            return this.f5315a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1412b) && Intrinsics.areEqual(this.f5315a, ((C1412b) obj).f5315a);
        }

        public int hashCode() {
            return this.f5315a.hashCode();
        }

        public String toString() {
            String str = this.f5315a;
            return "Error(message=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LDA0$c;", "LDA0;", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: DA0$c */
    /* loaded from: classes4.dex */
    public static final class C1413c extends DA0 {

        /* renamed from: a */
        public static final C1413c f5316a = new C1413c();

        private C1413c() {
            super(null);
        }
    }

    public /* synthetic */ DA0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DA0() {
    }
}
