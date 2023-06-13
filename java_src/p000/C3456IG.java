package p000;

import com.facebook.share.internal.C17296a;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000f"}, m28432d2 = {"LIG;", "LBb6;", "Ljava/math/BigDecimal;", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "", "f", "Lcom/google/gson/stream/JsonReader;", "input", "e", "<init>", "()V", C17296a.f69688o, "b", "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IG */
/* loaded from: classes4.dex */
public final class C3456IG extends AbstractC31862Bb6<BigDecimal> {

    /* renamed from: a */
    public static final C3458b f14945a = new C3458b(null);

    /* renamed from: b */
    public static final Lazy<C3456IG> f14946b;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LIG;", "b", "()LIG;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IG$a */
    /* loaded from: classes4.dex */
    public static final class C3457a extends Lambda implements Function0<C3456IG> {

        /* renamed from: g */
        public static final C3457a f14947g = new C3457a();

        public C3457a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C3456IG invoke() {
            return new C3456IG();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LIG$b;", "", "<init>", "()V", "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: IG$b */
    /* loaded from: classes4.dex */
    public static final class C3458b {
        public /* synthetic */ C3458b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3458b() {
        }
    }

    static {
        Lazy<C3456IG> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(C3457a.f14947g);
        f14946b = lazy;
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: e */
    public BigDecimal read(JsonReader jsonReader) throws IOException {
        BigDecimal read = TypeAdapters.f74627z.read(jsonReader);
        Intrinsics.checkNotNullExpressionValue(read, "BIG_DECIMAL.read(input)");
        return read;
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: f */
    public void write(JsonWriter out, BigDecimal bigDecimal) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        if (bigDecimal == null) {
            out.nullValue();
        } else {
            out.value(bigDecimal.stripTrailingZeros().toPlainString());
        }
    }
}
