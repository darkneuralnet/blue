package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LAi2;", "", "", "index", "", "c", "(I)V", DateTokenConverter.CONVERTER_KEY, "()I", "LMs5;", "descriptor", "", "e", "Lia1;", C17296a.f69688o, "Lia1;", AnalyticsRequestV2.HEADER_ORIGIN, "<set-?>", "b", "Z", "()Z", "isUnmarkedNull", "<init>", "(LMs5;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ai2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C31687Ai2 {

    /* renamed from: a */
    public final C42793ia1 f967a;

    /* renamed from: b */
    public boolean f968b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ai2$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C0190a extends FunctionReferenceImpl implements Function2<InterfaceC34588Ms5, Integer, Boolean> {
        public C0190a(Object obj) {
            super(2, obj, C31687Ai2.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        /* renamed from: a */
        public final Boolean m115374a(InterfaceC34588Ms5 p0, int i) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(((C31687Ai2) this.receiver).m115375e(p0, i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC34588Ms5 interfaceC34588Ms5, Integer num) {
            return m115374a(interfaceC34588Ms5, num.intValue());
        }
    }

    public C31687Ai2(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f967a = new C42793ia1(descriptor, new C0190a(this));
    }

    /* renamed from: b */
    public final boolean m115378b() {
        return this.f968b;
    }

    /* renamed from: c */
    public final void m115377c(int i) {
        this.f967a.m33799a(i);
    }

    /* renamed from: d */
    public final int m115376d() {
        return this.f967a.m33796d();
    }

    /* renamed from: e */
    public final boolean m115375e(InterfaceC34588Ms5 interfaceC34588Ms5, int i) {
        boolean z = !interfaceC34588Ms5.mo10455i(i) && interfaceC34588Ms5.mo10460d(i).mo10462b();
        this.f968b = z;
        return z;
    }
}
