package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/LoginException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "Lco/bird/android/model/AuthenticationException;", "Lco/bird/android/model/NotLoggedInException;", "Lco/bird/android/model/UpdateRequestException;", "Lco/bird/android/model/UpdateRequiredException;", "Lco/bird/android/model/UserSuspendedException;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class LoginException extends Exception {
    public /* synthetic */ LoginException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private LoginException(String str) {
        super(str);
    }
}
