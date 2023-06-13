package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C49278tW0;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\t\u0010\u000e\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, m28432d2 = {"LfG4;", "LOY;", "Ljava/io/OutputStream;", "outputStream", "", "writeTo", "", "e", "", "isEmpty", "g", "", "contentType", "f", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Ljava/lang/Long;", "()Ljava/lang/Long;", "length", "b", "LOY;", "getBody", "()LOY;", "setBody", "(LOY;)V", "body", "<init>", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: fG4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40837fG4 implements InterfaceC6029OY {

    /* renamed from: a */
    public final Long f79783a;

    /* renamed from: b */
    public InterfaceC6029OY f79784b;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Ljava/io/InputStream;", "b", "()Ljava/io/InputStream;", "com/github/kittinunf/fuel/core/requests/RepeatableBody$writeTo$1$1"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: fG4$a */
    /* loaded from: classes5.dex */
    public static final class C20343a extends Lambda implements Function0<InputStream> {

        /* renamed from: h */
        public final /* synthetic */ ByteArrayInputStream f79786h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20343a(ByteArrayInputStream byteArrayInputStream) {
            super(0);
            this.f79786h = byteArrayInputStream;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InputStream invoke() {
            return this.f79786h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()J"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: fG4$b */
    /* loaded from: classes5.dex */
    public static final class C20344b extends Lambda implements Function0<Long> {

        /* renamed from: g */
        public final /* synthetic */ long f79787g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20344b(long j) {
            super(0);
            this.f79787g = j;
        }

        /* renamed from: b */
        public final long m41634b() {
            return this.f79787g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(m41634b());
        }
    }

    public C40837fG4(InterfaceC6029OY body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f79784b = body;
        this.f79783a = body.mo12269a();
    }

    @Override // p000.InterfaceC6029OY
    /* renamed from: a */
    public Long mo12269a() {
        return this.f79783a;
    }

    @Override // p000.InterfaceC6029OY
    /* renamed from: e */
    public byte[] mo12266e() {
        return this.f79784b.mo12266e();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C40837fG4) && Intrinsics.areEqual(this.f79784b, ((C40837fG4) obj).f79784b);
        }
        return true;
    }

    @Override // p000.InterfaceC6029OY
    /* renamed from: f */
    public String mo12265f(String str) {
        return this.f79784b.mo12265f(str);
    }

    @Override // p000.InterfaceC6029OY
    /* renamed from: g */
    public boolean mo12264g() {
        return this.f79784b.mo12264g();
    }

    public int hashCode() {
        InterfaceC6029OY interfaceC6029OY = this.f79784b;
        if (interfaceC6029OY != null) {
            return interfaceC6029OY.hashCode();
        }
        return 0;
    }

    @Override // p000.InterfaceC6029OY
    public boolean isEmpty() {
        return this.f79784b.isEmpty();
    }

    public String toString() {
        return "RepeatableBody(body=" + this.f79784b + ")";
    }

    @Override // p000.InterfaceC6029OY
    public long writeTo(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(mo12266e());
        long writeTo = this.f79784b.writeTo(outputStream);
        this.f79784b = C49278tW0.C28729c.m12260b(C49278tW0.f110565g, new C20343a(byteArrayInputStream), new C20344b(writeTo), null, 4, null);
        return writeTo;
    }
}
