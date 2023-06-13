package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00142\u00020\u0001:\u0001\u0003BC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0015"}, m28432d2 = {"LeE3;", "", "", C17296a.f69688o, "I", "pageSize", "b", "prefetchDistance", "", "c", "Z", "enablePlaceholders", DateTokenConverter.CONVERTER_KEY, "initialLoadSize", "e", "maxSize", "f", "jumpThreshold", "<init>", "(IIZIII)V", "g", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: eE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40225eE3 {

    /* renamed from: g */
    public static final C19995a f78139g = new C19995a(null);
    @JvmField

    /* renamed from: a */
    public final int f78140a;
    @JvmField

    /* renamed from: b */
    public final int f78141b;
    @JvmField

    /* renamed from: c */
    public final boolean f78142c;
    @JvmField

    /* renamed from: d */
    public final int f78143d;
    @JvmField

    /* renamed from: e */
    public final int f78144e;
    @JvmField

    /* renamed from: f */
    public final int f78145f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"LeE3$a;", "", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "MAX_SIZE_UNBOUNDED", "getMAX_SIZE_UNBOUNDED$annotations", "()V", "<init>", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: eE3$a */
    /* loaded from: classes.dex */
    public static final class C19995a {
        public /* synthetic */ C19995a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19995a() {
        }
    }

    @JvmOverloads
    public C40225eE3(int i, int i2, boolean z, int i3, int i4, int i5) {
        this.f78140a = i;
        this.f78141b = i2;
        this.f78142c = z;
        this.f78143d = i3;
        this.f78144e = i4;
        this.f78145f = i5;
        if (!z && i2 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i4 == Integer.MAX_VALUE || i4 >= (i2 * 2) + i) {
            if (!(i5 == Integer.MIN_VALUE || i5 > 0)) {
                throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i + ", prefetchDist=" + i2 + ", maxSize=" + i4);
    }

    public /* synthetic */ C40225eE3(int i, int i2, boolean z, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i6 & 2) != 0 ? i : i2, (i6 & 4) != 0 ? true : z, (i6 & 8) != 0 ? i * 3 : i3, (i6 & 16) != 0 ? Integer.MAX_VALUE : i4, (i6 & 32) != 0 ? Integer.MIN_VALUE : i5);
    }
}
