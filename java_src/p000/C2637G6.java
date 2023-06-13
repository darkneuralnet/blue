package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LG6;", "", "T", "castModel", "()Ljava/lang/Object;", RequestHeadersFactory.MODEL, "", "layoutId", "", "visible", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/Object;", "c", "b", "I", "()I", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "<init>", "(Ljava/lang/Object;IZ)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAdapterItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,21:1\n9#2,4:22\n*S KotlinDebug\n*F\n+ 1 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n*L\n18#1:22,4\n*E\n"})
/* renamed from: G6 */
/* loaded from: classes4.dex */
public final class C2637G6 {

    /* renamed from: a */
    public final Object f10953a;

    /* renamed from: b */
    public final int f10954b;

    /* renamed from: c */
    public final boolean f10955c;

    public C2637G6(Object obj, int i, boolean z) {
        this.f10953a = obj;
        this.f10954b = i;
        this.f10955c = z;
    }

    public static /* synthetic */ C2637G6 copy$default(C2637G6 c2637g6, Object obj, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = c2637g6.f10953a;
        }
        if ((i2 & 2) != 0) {
            i = c2637g6.f10954b;
        }
        if ((i2 & 4) != 0) {
            z = c2637g6.f10955c;
        }
        return c2637g6.m105818a(obj, i, z);
    }

    /* renamed from: a */
    public final C2637G6 m105818a(Object obj, int i, boolean z) {
        return new C2637G6(obj, i, z);
    }

    /* renamed from: b */
    public final int m105817b() {
        return this.f10954b;
    }

    /* renamed from: c */
    public final Object m105816c() {
        return this.f10953a;
    }

    public final /* synthetic */ <T> T castModel() {
        T t = (T) m105816c();
        Intrinsics.reifiedOperationMarker(3, "T");
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    /* renamed from: d */
    public final boolean m105815d() {
        return this.f10955c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2637G6) {
            C2637G6 c2637g6 = (C2637G6) obj;
            return Intrinsics.areEqual(this.f10953a, c2637g6.f10953a) && this.f10954b == c2637g6.f10954b && this.f10955c == c2637g6.f10955c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Object obj = this.f10953a;
        int hashCode = (((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f10954b)) * 31;
        boolean z = this.f10955c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        Object obj = this.f10953a;
        int i = this.f10954b;
        boolean z = this.f10955c;
        return "AdapterItem(model=" + obj + ", layoutId=" + i + ", visible=" + z + ")";
    }

    public /* synthetic */ C2637G6(Object obj, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, i, (i2 & 4) != 0 ? true : z);
    }
}
