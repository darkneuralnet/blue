package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.github.kittinunf.fuel.core.FuelError;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.charset.Charset;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p053io.ByteStreamsKt;
import kotlin.p053io.CloseableKt;
import kotlin.text.Charsets;
import p000.InterfaceC6029OY;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001#B=\u0012\u0012\b\u0002\u0010!\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0018j\u0004\u0018\u0001`\"\u0012\b\b\u0002\u0010*\u001a\u00020%¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R,\u0010!\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0018j\u0004\u0018\u0001`\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LtW0;", "LOY;", "", "contentType", "f", "", "e", "Ljava/io/OutputStream;", "outputStream", "", "writeTo", "", "isEmpty", "g", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Lkotlin/Lazy;", "()Ljava/lang/Long;", "length", "Lkotlin/Function0;", "Ljava/io/InputStream;", "Lcom/github/kittinunf/fuel/core/BodySource;", "b", "Lkotlin/jvm/functions/Function0;", "getOpenStream$fuel", "()Lkotlin/jvm/functions/Function0;", "setOpenStream$fuel", "(Lkotlin/jvm/functions/Function0;)V", "openStream", "Lcom/github/kittinunf/fuel/core/BodyLength;", "c", "calculateLength", "Ljava/nio/charset/Charset;", DateTokenConverter.CONVERTER_KEY, "Ljava/nio/charset/Charset;", "getCharset", "()Ljava/nio/charset/Charset;", "charset", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/nio/charset/Charset;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: tW0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49278tW0 implements InterfaceC6029OY {

    /* renamed from: a */
    public final Lazy f110566a;

    /* renamed from: b */
    public Function0<? extends InputStream> f110567b;

    /* renamed from: c */
    public Function0<Long> f110568c;

    /* renamed from: d */
    public final Charset f110569d;

    /* renamed from: g */
    public static final C28729c f110565g = new C28729c(null);

    /* renamed from: e */
    public static final Function0<ByteArrayInputStream> f110563e = C28728b.f110571g;

    /* renamed from: f */
    public static final Function0 f110564f = C28727a.f110570g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()Ljava/lang/Void;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: tW0$a */
    /* loaded from: classes5.dex */
    public static final class C28727a extends Lambda implements Function0 {

        /* renamed from: g */
        public static final C28727a f110570g = new C28727a();

        public C28727a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Void invoke() {
            throw FuelError.C17429a.m52050b(FuelError.f69982c, new IllegalStateException("The input has already been written to an output stream and can not be consumed again."), null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/io/ByteArrayInputStream;", "b", "()Ljava/io/ByteArrayInputStream;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: tW0$b */
    /* loaded from: classes5.dex */
    public static final class C28728b extends Lambda implements Function0<ByteArrayInputStream> {

        /* renamed from: g */
        public static final C28728b f110571g = new C28728b();

        public C28728b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ByteArrayInputStream invoke() {
            return new ByteArrayInputStream(new byte[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\f\u001a\u00020\u000b2\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\n\u001a\u00020\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LtW0$c;", "", "Lkotlin/Function0;", "Ljava/io/InputStream;", "Lcom/github/kittinunf/fuel/core/BodySource;", "openStream", "", "Lcom/github/kittinunf/fuel/core/BodyLength;", "calculateLength", "Ljava/nio/charset/Charset;", "charset", "LtW0;", C17296a.f69688o, "", "CONSUMED_STREAM", "Lkotlin/jvm/functions/Function0;", "Ljava/io/ByteArrayInputStream;", "EMPTY_STREAM", "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: tW0$c */
    /* loaded from: classes5.dex */
    public static final class C28729c {
        private C28729c() {
        }

        /* renamed from: b */
        public static /* synthetic */ C49278tW0 m12260b(C28729c c28729c, Function0 function0, Function0 function02, Charset charset, int i, Object obj) {
            if ((i & 4) != 0) {
                charset = Charsets.UTF_8;
            }
            return c28729c.m12261a(function0, function02, charset);
        }

        /* renamed from: a */
        public final C49278tW0 m12261a(Function0<? extends InputStream> openStream, Function0<Long> function0, Charset charset) {
            Intrinsics.checkNotNullParameter(openStream, "openStream");
            Intrinsics.checkNotNullParameter(charset, "charset");
            return new C49278tW0(openStream, function0, charset);
        }

        public /* synthetic */ C28729c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: tW0$d */
    /* loaded from: classes5.dex */
    public static final class C28730d extends Lambda implements Function0<Long> {
        public C28730d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long l;
            Function0 function0 = C49278tW0.this.f110568c;
            if (function0 == null || (l = (Long) function0.invoke()) == null) {
                return null;
            }
            long longValue = l.longValue();
            if (longValue == -1) {
                return null;
            }
            return Long.valueOf(longValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/io/ByteArrayInputStream;", "b", "()Ljava/io/ByteArrayInputStream;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: tW0$e */
    /* loaded from: classes5.dex */
    public static final class C28731e extends Lambda implements Function0<ByteArrayInputStream> {

        /* renamed from: g */
        public final /* synthetic */ byte[] f110573g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28731e(byte[] bArr) {
            super(0);
            this.f110573g = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ByteArrayInputStream invoke() {
            return new ByteArrayInputStream(this.f110573g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()J"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: tW0$f */
    /* loaded from: classes5.dex */
    public static final class C28732f extends Lambda implements Function0<Long> {

        /* renamed from: g */
        public final /* synthetic */ byte[] f110574g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28732f(byte[] bArr) {
            super(0);
            this.f110574g = bArr;
        }

        /* renamed from: b */
        public final long m12258b() {
            return this.f110574g.length;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(m12258b());
        }
    }

    public C49278tW0() {
        this(null, null, null, 7, null);
    }

    @Override // p000.InterfaceC6029OY
    /* renamed from: a */
    public Long mo12269a() {
        return (Long) this.f110566a.getValue();
    }

    /* renamed from: c */
    public C40837fG4 m12267c() {
        return InterfaceC6029OY.C6030a.m92025a(this);
    }

    @Override // p000.InterfaceC6029OY
    /* renamed from: e */
    public byte[] mo12266e() {
        int i;
        if (isEmpty()) {
            return new byte[0];
        }
        Long mo12269a = mo12269a();
        if (mo12269a != null) {
            i = (int) mo12269a.longValue();
        } else {
            i = 32;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        try {
            writeTo(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            this.f110567b = new C28731e(byteArray);
            this.f110568c = new C28732f(byteArray);
            Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream(le….toLong() }\n            }");
            return byteArray;
        } finally {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49278tW0) {
                C49278tW0 c49278tW0 = (C49278tW0) obj;
                return Intrinsics.areEqual(this.f110567b, c49278tW0.f110567b) && Intrinsics.areEqual(this.f110568c, c49278tW0.f110568c) && Intrinsics.areEqual(this.f110569d, c49278tW0.f110569d);
            }
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC6029OY
    /* renamed from: f */
    public String mo12265f(String str) {
        if (isEmpty()) {
            return "(empty)";
        }
        if (mo12264g()) {
            return "(consumed)";
        }
        if (str == null) {
            str = URLConnection.guessContentTypeFromStream(this.f110567b.invoke());
        }
        return C7472SY.m85306a(this, str);
    }

    @Override // p000.InterfaceC6029OY
    /* renamed from: g */
    public boolean mo12264g() {
        return this.f110567b == f110564f;
    }

    public int hashCode() {
        Function0<? extends InputStream> function0 = this.f110567b;
        int hashCode = (function0 != null ? function0.hashCode() : 0) * 31;
        Function0<Long> function02 = this.f110568c;
        int hashCode2 = (hashCode + (function02 != null ? function02.hashCode() : 0)) * 31;
        Charset charset = this.f110569d;
        return hashCode2 + (charset != null ? charset.hashCode() : 0);
    }

    @Override // p000.InterfaceC6029OY
    public boolean isEmpty() {
        Long mo12269a;
        return this.f110567b == f110563e || ((mo12269a = mo12269a()) != null && mo12269a.longValue() == 0);
    }

    public String toString() {
        return "DefaultBody(openStream=" + this.f110567b + ", calculateLength=" + this.f110568c + ", charset=" + this.f110569d + ")";
    }

    @Override // p000.InterfaceC6029OY
    public long writeTo(OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        InputStream invoke = this.f110567b.invoke();
        if (invoke instanceof BufferedInputStream) {
            bufferedInputStream = (BufferedInputStream) invoke;
        } else {
            bufferedInputStream = new BufferedInputStream(invoke, 8192);
        }
        try {
            long copyTo$default = ByteStreamsKt.copyTo$default(bufferedInputStream, outputStream, 0, 2, null);
            CloseableKt.closeFinally(bufferedInputStream, null);
            outputStream.flush();
            this.f110567b = f110564f;
            return copyTo$default;
        } finally {
        }
    }

    public C49278tW0(Function0<? extends InputStream> openStream, Function0<Long> function0, Charset charset) {
        Intrinsics.checkNotNullParameter(openStream, "openStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f110567b = openStream;
        this.f110568c = function0;
        this.f110569d = charset;
        this.f110566a = LazyKt.lazy(new C28730d());
    }

    public /* synthetic */ C49278tW0(Function0 function0, Function0 function02, Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f110563e : function0, (i & 2) != 0 ? null : function02, (i & 4) != 0 ? Charsets.UTF_8 : charset);
    }
}
