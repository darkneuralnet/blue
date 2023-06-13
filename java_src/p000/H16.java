package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016J\u0016\u0010\u0005\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0016R\u001d\u0010\t\u001a\u00020\u00068&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m28432d2 = {"LH16;", "", LegacyRepairType.OTHER_KEY, "c", "Lkotlin/Function0;", "b", "Lpm0;", C17296a.f69688o, "()J", "color", "La30;", DateTokenConverter.CONVERTER_KEY, "()La30;", "brush", "", "h", "()F", "alpha", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H16 */
/* loaded from: classes.dex */
public interface H16 {

    /* renamed from: a */
    public static final C3006a f12733a = C3006a.f12734a;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"LH16$a;", "", "Lpm0;", "color", "LH16;", "b", "(J)LH16;", "La30;", "brush", "", "alpha", C17296a.f69688o, "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n77#1:149\n*E\n"})
    /* renamed from: H16$a */
    /* loaded from: classes.dex */
    public static final class C3006a {

        /* renamed from: a */
        public static final /* synthetic */ C3006a f12734a = new C3006a();

        private C3006a() {
        }

        /* renamed from: a */
        public final H16 m104495a(AbstractC37727a30 abstractC37727a30, float f) {
            if (abstractC37727a30 == null) {
                return C3007b.f12735b;
            }
            if (abstractC37727a30 instanceof C46831pN5) {
                return m104494b(C37713a16.m71974c(((C46831pN5) abstractC37727a30).m19361b(), f));
            }
            if (abstractC37727a30 instanceof AbstractC34399Lx5) {
                return new C38913c30((AbstractC34399Lx5) abstractC37727a30, f);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: b */
        public final H16 m104494b(long j) {
            boolean z;
            if (j != C47063pm0.f104050b.m18726g()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C33359Hm0(j, null);
            }
            return C3007b.f12735b;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, m28432d2 = {"LH16$b;", "LH16;", "Lpm0;", C17296a.f69688o, "()J", "color", "La30;", DateTokenConverter.CONVERTER_KEY, "()La30;", "brush", "", "h", "()F", "alpha", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H16$b */
    /* loaded from: classes.dex */
    public static final class C3007b implements H16 {

        /* renamed from: b */
        public static final C3007b f12735b = new C3007b();

        private C3007b() {
        }

        @Override // p000.H16
        /* renamed from: a */
        public long mo61991a() {
            return C47063pm0.f104050b.m18726g();
        }

        @Override // p000.H16
        /* renamed from: d */
        public AbstractC37727a30 mo61990d() {
            return null;
        }

        @Override // p000.H16
        /* renamed from: h */
        public float mo61988h() {
            return Float.NaN;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: H16$c */
    /* loaded from: classes.dex */
    public static final class C3008c extends Lambda implements Function0<Float> {
        public C3008c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(H16.this.mo61988h());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LH16;", "b", "()LH16;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: H16$d */
    /* loaded from: classes.dex */
    public static final class C3009d extends Lambda implements Function0<H16> {
        public C3009d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final H16 invoke() {
            return H16.this;
        }
    }

    /* renamed from: a */
    long mo61991a();

    /* renamed from: b */
    default H16 m104497b(Function0<? extends H16> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(this, C3007b.f12735b)) {
            return this;
        }
        return other.invoke();
    }

    /* renamed from: c */
    default H16 m104496c(H16 other) {
        float m71973d;
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z = other instanceof C38913c30;
        if (z && (this instanceof C38913c30)) {
            AbstractC34399Lx5 m61989e = ((C38913c30) other).m61989e();
            m71973d = C37713a16.m71973d(other.mo61988h(), new C3008c());
            return new C38913c30(m61989e, m71973d);
        } else if (!z || (this instanceof C38913c30)) {
            if (!z && (this instanceof C38913c30)) {
                return this;
            }
            return other.m104497b(new C3009d());
        } else {
            return other;
        }
    }

    /* renamed from: d */
    AbstractC37727a30 mo61990d();

    /* renamed from: h */
    float mo61988h();
}
