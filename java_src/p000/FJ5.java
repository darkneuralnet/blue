package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m28432d2 = {"LFJ5;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FJ5 */
/* loaded from: classes4.dex */
public enum FJ5 {
    UNINITIALIZED,
    CONNECTING,
    CONNECTED,
    TOKEN_REQUESTED,
    TOKEN_RESPONSE_RECEIVED,
    LOCK_STATE_REQUESTED,
    LOCK_STATE_RESPONSE_RECEIVED,
    UNLOCK_REQUESTED,
    UNLOCK_RESPONSE_RECEIVED,
    LOCK_REQUESTED,
    LOCK_RESPONSE_RECEIVED,
    LOCK_INSERTED_RESPONSE_RECEIVED,
    DISCONNECTING,
    DISCONNECTED,
    UNKNOWN,
    EXCEPTION
}
