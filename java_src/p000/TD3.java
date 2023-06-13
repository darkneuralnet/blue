package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\u0018\u0010\u0019J:\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LTD3;", "Key", "Value", "", "", "position", "key", "item", C17296a.f69688o, "(JLjava/lang/Object;Ljava/lang/Object;)LTD3;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "J", "c", "()J", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "<init>", "(JLjava/lang/Object;Ljava/lang/Object;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TD3 */
/* loaded from: classes4.dex */
public final class TD3<Key, Value> {

    /* renamed from: a */
    public final long f34930a;

    /* renamed from: b */
    public final Key f34931b;

    /* renamed from: c */
    public final Value f34932c;

    public TD3(long j, Key key, Value value) {
        this.f34930a = j;
        this.f34931b = key;
        this.f34932c = value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TD3 copy$default(TD3 td3, long j, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            j = td3.f34930a;
        }
        if ((i & 2) != 0) {
            obj = td3.f34931b;
        }
        if ((i & 4) != 0) {
            obj2 = td3.f34932c;
        }
        return td3.m84188a(j, obj, obj2);
    }

    /* renamed from: a */
    public final TD3<Key, Value> m84188a(long j, Key key, Value value) {
        return new TD3<>(j, key, value);
    }

    /* renamed from: b */
    public final Value m84187b() {
        return this.f34932c;
    }

    /* renamed from: c */
    public final long m84186c() {
        return this.f34930a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TD3) {
            TD3 td3 = (TD3) obj;
            return this.f34930a == td3.f34930a && Intrinsics.areEqual(this.f34931b, td3.f34931b) && Intrinsics.areEqual(this.f34932c, td3.f34932c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f34930a) * 31;
        Key key = this.f34931b;
        int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
        Value value = this.f34932c;
        return hashCode2 + (value != null ? value.hashCode() : 0);
    }

    public String toString() {
        long j = this.f34930a;
        Key key = this.f34931b;
        Value value = this.f34932c;
        return "PageItemKey(position=" + j + ", key=" + key + ", item=" + value + ")";
    }
}
