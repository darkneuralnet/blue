package p000;

import bo.app.InterfaceC13145t2;
import bo.app.InterfaceC13232y2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LlZ1;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lbo/app/t2;", C17296a.f69688o, "Lbo/app/t2;", "c", "()Lbo/app/t2;", "triggerEvent", "Lbo/app/y2;", "b", "Lbo/app/y2;", "()Lbo/app/y2;", "triggerAction", "LwO1;", "LwO1;", "()LwO1;", "inAppMessage", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "userId", "<init>", "(Lbo/app/t2;Lbo/app/y2;LwO1;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: lZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44563lZ1 {

    /* renamed from: a */
    public final InterfaceC13145t2 f96318a;

    /* renamed from: b */
    public final InterfaceC13232y2 f96319b;

    /* renamed from: c */
    public final InterfaceC50985wO1 f96320c;

    /* renamed from: d */
    public final String f96321d;

    public C44563lZ1(InterfaceC13145t2 triggerEvent, InterfaceC13232y2 triggerAction, InterfaceC50985wO1 inAppMessage, String str) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(triggerAction, "triggerAction");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.f96318a = triggerEvent;
        this.f96319b = triggerAction;
        this.f96320c = inAppMessage;
        this.f96321d = str;
    }

    /* renamed from: a */
    public final InterfaceC50985wO1 m27153a() {
        return this.f96320c;
    }

    /* renamed from: b */
    public final InterfaceC13232y2 m27152b() {
        return this.f96319b;
    }

    /* renamed from: c */
    public final InterfaceC13145t2 m27151c() {
        return this.f96318a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44563lZ1) {
            C44563lZ1 c44563lZ1 = (C44563lZ1) obj;
            return Intrinsics.areEqual(this.f96318a, c44563lZ1.f96318a) && Intrinsics.areEqual(this.f96319b, c44563lZ1.f96319b) && Intrinsics.areEqual(this.f96320c, c44563lZ1.f96320c) && Intrinsics.areEqual(this.f96321d, c44563lZ1.f96321d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f96318a.hashCode() * 31) + this.f96319b.hashCode()) * 31) + this.f96320c.hashCode()) * 31;
        String str = this.f96321d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return C31696Aj2.m115350i(this.f96320c.forJsonPut());
    }
}
