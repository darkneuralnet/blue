package p000;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B#\b\u0016\u0012\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Ljf1;", "", "E", "Lcom/fasterxml/jackson/databind/KeyDeserializer;", "", "key", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", "", "deserializeKey", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "clazz", "Lef1;", "c", "Lef1;", "cache", "<init>", "(Ljava/lang/Class;Lef1;)V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnumMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumMapper.kt\nco/bird/android/lib/jackson/EnumKeyDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
/* renamed from: jf1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43436jf1<E extends Enum<E>> extends KeyDeserializer {

    /* renamed from: b */
    public final Class<E> f93107b;

    /* renamed from: c */
    public final C40471ef1 f93108c;

    /* JADX WARN: Multi-variable type inference failed */
    public C43436jf1(Class<Enum<?>> clazz, C40471ef1 cache) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f93107b = clazz;
        this.f93108c = cache;
        cache.m42655a(clazz);
    }

    @Override // com.fasterxml.jackson.databind.KeyDeserializer
    public Object deserializeKey(String str, DeserializationContext deserializationContext) {
        Enum m42653c;
        if (str == null || (m42653c = this.f93108c.m42653c(this.f93107b, str)) == null) {
            Enum m42654b = this.f93108c.m42654b(this.f93107b);
            Intrinsics.checkNotNull(m42654b);
            return m42654b;
        }
        return m42653c;
    }
}
