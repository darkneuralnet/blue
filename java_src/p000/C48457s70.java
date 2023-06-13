package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u0000¨\u0006\u0007"}, m28432d2 = {"", "", "len", "", C17296a.f69688o, "", "b", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nByteArray+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteArray+.kt\nco/bird/android/library/extension/ByteArray_Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,21:1\n11345#2:22\n11680#2,3:23\n*S KotlinDebug\n*F\n+ 1 ByteArray+.kt\nco/bird/android/library/extension/ByteArray_Kt\n*L\n20#1:22\n20#1:23,3\n*E\n"})
/* renamed from: s70  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48457s70 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s70$a */
    /* loaded from: classes3.dex */
    public static final class C28180a extends Lambda implements Function1<Byte, CharSequence> {

        /* renamed from: g */
        public final /* synthetic */ int f108289g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28180a(int i) {
            super(1);
            this.f108289g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }

        public final CharSequence invoke(byte b) {
            int checkRadix;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            int m116801constructorimpl = UByte.m116801constructorimpl(b) & UByte.MAX_VALUE;
            checkRadix = CharsKt__CharJVMKt.checkRadix(2);
            String num = Integer.toString(m116801constructorimpl, checkRadix);
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            String format = String.format("%" + this.f108289g + "s", Arrays.copyOf(new Object[]{num}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return new Regex(" ").replace(format, "0");
        }
    }

    /* renamed from: a */
    public static final String m14771a(byte[] bArr, int i) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        joinToString$default = ArraysKt___ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new C28180a(i), 30, (Object) null);
        return joinToString$default;
    }

    /* renamed from: b */
    public static final List<String> m14770b(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(P70.m90797a(b));
        }
        return arrayList;
    }
}
