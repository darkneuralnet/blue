package p000;

import bo.app.C12652g0;
import bo.app.C13176v3;
import bo.app.C13268z;
import bo.app.InterfaceC13280z1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\n\u0010\r\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0018\u0010\r\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"Ln20;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Exception;", "Lkotlin/Exception;", C17296a.f69688o, "Ljava/lang/Exception;", "originalException", "c", "Ljava/lang/String;", "getNetworkExceptionMessage", "()Ljava/lang/String;", "networkExceptionMessage", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "getRequestInitiationTime", "()Ljava/lang/Long;", "requestInitiationTime", "Ln20$a;", "e", "Ln20$a;", "getRequestType", "()Ln20$a;", "requestType", "Lbo/app/z1;", "brazeRequest", "<init>", "(Ljava/lang/Exception;Lbo/app/z1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: n20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45443n20 {

    /* renamed from: a */
    public final Exception f99251a;

    /* renamed from: b */
    public final InterfaceC13280z1 f99252b;

    /* renamed from: c */
    public final String f99253c;

    /* renamed from: d */
    public final Long f99254d;

    /* renamed from: e */
    public final EnumC26353a f99255e;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Ln20$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: n20$a */
    /* loaded from: classes2.dex */
    public enum EnumC26353a {
        CONTENT_CARDS_SYNC,
        NEWS_FEED_SYNC,
        OTHER
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r2.m62873w() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C45443n20(Exception originalException, InterfaceC13280z1 brazeRequest) {
        EnumC26353a enumC26353a;
        Intrinsics.checkNotNullParameter(originalException, "originalException");
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        this.f99251a = originalException;
        this.f99252b = brazeRequest;
        this.f99253c = originalException.getMessage();
        this.f99254d = brazeRequest.mo62581j();
        if (brazeRequest instanceof C13268z) {
            enumC26353a = EnumC26353a.CONTENT_CARDS_SYNC;
        } else if (brazeRequest instanceof C12652g0) {
            C13176v3 mo62592c = brazeRequest.mo62592c();
            boolean z = mo62592c != null;
            if (z) {
                enumC26353a = EnumC26353a.NEWS_FEED_SYNC;
            } else {
                enumC26353a = EnumC26353a.OTHER;
            }
        } else {
            enumC26353a = EnumC26353a.OTHER;
        }
        this.f99255e = enumC26353a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45443n20) {
            C45443n20 c45443n20 = (C45443n20) obj;
            return Intrinsics.areEqual(this.f99251a, c45443n20.f99251a) && Intrinsics.areEqual(this.f99252b, c45443n20.f99252b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f99251a.hashCode() * 31) + this.f99252b.hashCode();
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(originalException=" + this.f99251a + ", brazeRequest=" + this.f99252b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
