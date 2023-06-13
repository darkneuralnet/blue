package p000;

import android.text.Spanned;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"LRR5;", "Lht5;", "", "", "", "value", "c", "([Ljava/lang/CharSequence;)Ljava/lang/String;", "b", "(Ljava/lang/String;)[Ljava/lang/CharSequence;", "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: RR5 */
/* loaded from: classes7.dex */
public final class RR5 implements InterfaceC42394ht5<CharSequence[], String> {

    /* renamed from: a */
    public static final RR5 f32030a = new RR5();

    private RR5() {
    }

    @Override // p000.InterfaceC42394ht5
    /* renamed from: b */
    public CharSequence[] mo35621a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (CharSequence[]) QR5.f30375c.m88503a(value).m88505a().toArray(new CharSequence[0]);
    }

    @Override // p000.InterfaceC42394ht5
    /* renamed from: c */
    public String serialize(CharSequence[] value) {
        List list;
        Intrinsics.checkNotNullParameter(value, "value");
        list = ArraysKt___ArraysKt.toList(value);
        int length = value.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (value[i] instanceof Spanned) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return new QR5(list, z).m88504b();
    }
}
