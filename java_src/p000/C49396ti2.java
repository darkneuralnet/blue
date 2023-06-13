package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.UStringsKt;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"Lti2;", "Lr0;", "LMs5;", "descriptor", "", "q", "w", "", "j", "", "F", "", "l", "LC0;", C17296a.f69688o, "LC0;", "lexer", "Lkt5;", "b", "Lkt5;", "c", "()Lkt5;", "serializersModule", "Lbi2;", "json", "<init>", "(LC0;Lbi2;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n+ 2 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,393:1\n386#2,5:394\n386#2,5:399\n386#2,5:404\n386#2,5:409\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n*L\n379#1:394,5\n380#1:399,5\n381#1:404,5\n382#1:409,5\n*E\n"})
/* renamed from: ti2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49396ti2 extends AbstractC27747r0 {

    /* renamed from: a */
    public final AbstractC0809C0 f110924a;

    /* renamed from: b */
    public final AbstractC44173kt5 f110925b;

    public C49396ti2(AbstractC0809C0 lexer, AbstractC38706bi2 json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f110924a = lexer;
        this.f110925b = json.m64101f();
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: F */
    public byte mo3321F() {
        AbstractC0809C0 abstractC0809C0 = this.f110924a;
        String m113120s = abstractC0809C0.m113120s();
        try {
            return UStringsKt.toUByte(m113120s);
        } catch (IllegalArgumentException unused) {
            AbstractC0809C0.m113114y(abstractC0809C0, "Failed to parse type 'UByte' for input '" + m113120s + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: c */
    public AbstractC44173kt5 mo3297c() {
        return this.f110925b;
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: j */
    public long mo3291j() {
        AbstractC0809C0 abstractC0809C0 = this.f110924a;
        String m113120s = abstractC0809C0.m113120s();
        try {
            return UStringsKt.toULong(m113120s);
        } catch (IllegalArgumentException unused) {
            AbstractC0809C0.m113114y(abstractC0809C0, "Failed to parse type 'ULong' for input '" + m113120s + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: l */
    public short mo3289l() {
        AbstractC0809C0 abstractC0809C0 = this.f110924a;
        String m113120s = abstractC0809C0.m113120s();
        try {
            return UStringsKt.toUShort(m113120s);
        } catch (IllegalArgumentException unused) {
            AbstractC0809C0.m113114y(abstractC0809C0, "Failed to parse type 'UShort' for input '" + m113120s + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.InterfaceC36230Tt0
    /* renamed from: q */
    public int mo11843q(InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // p000.AbstractC27747r0, p000.GV0
    /* renamed from: w */
    public int mo3280w() {
        AbstractC0809C0 abstractC0809C0 = this.f110924a;
        String m113120s = abstractC0809C0.m113120s();
        try {
            return UStringsKt.toUInt(m113120s);
        } catch (IllegalArgumentException unused) {
            AbstractC0809C0.m113114y(abstractC0809C0, "Failed to parse type 'UInt' for input '" + m113120s + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
