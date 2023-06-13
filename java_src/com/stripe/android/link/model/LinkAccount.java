package com.stripe.android.link.model;

import com.stripe.android.model.ConsumerSession;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u0004\u0018\u00010\nJ\f\u0010\u0015\u001a\u00020\u0010*\u00020\u0003H\u0002J\f\u0010\u0016\u001a\u00020\u0010*\u00020\u0003H\u0002J\f\u0010\u0017\u001a\u00020\u0010*\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/link/model/LinkAccount;", "", "consumerSession", "Lcom/stripe/android/model/ConsumerSession;", "(Lcom/stripe/android/model/ConsumerSession;)V", "accountStatus", "Lcom/stripe/android/link/model/AccountStatus;", "getAccountStatus", "()Lcom/stripe/android/link/model/AccountStatus;", "clientSecret", "", "getClientSecret", "()Ljava/lang/String;", "email", "getEmail", "isVerified", "", "()Z", "redactedPhoneNumber", "getRedactedPhoneNumber", "getAuthSessionCookie", "containsSMSSessionStarted", "containsVerifiedSMSSession", "isVerifiedForSignup", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class LinkAccount {
    private final AccountStatus accountStatus;
    private final String clientSecret;
    private final ConsumerSession consumerSession;
    private final String email;
    private final boolean isVerified;
    private final String redactedPhoneNumber;

    public LinkAccount(ConsumerSession consumerSession) {
        boolean z;
        AccountStatus accountStatus;
        Intrinsics.checkNotNullParameter(consumerSession, "consumerSession");
        this.consumerSession = consumerSession;
        this.redactedPhoneNumber = consumerSession.getRedactedPhoneNumber();
        this.clientSecret = consumerSession.getClientSecret();
        this.email = consumerSession.getEmailAddress();
        if (!containsVerifiedSMSSession(consumerSession) && !isVerifiedForSignup(consumerSession)) {
            z = false;
        } else {
            z = true;
        }
        this.isVerified = z;
        if (z) {
            accountStatus = AccountStatus.Verified;
        } else if (containsSMSSessionStarted(consumerSession)) {
            accountStatus = AccountStatus.VerificationStarted;
        } else {
            accountStatus = AccountStatus.NeedsVerification;
        }
        this.accountStatus = accountStatus;
    }

    private final boolean containsSMSSessionStarted(ConsumerSession consumerSession) {
        Object obj;
        boolean z;
        Iterator<T> it = consumerSession.getVerificationSessions().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
                if (verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.Sms && verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Started) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean containsVerifiedSMSSession(ConsumerSession consumerSession) {
        Object obj;
        boolean z;
        Iterator<T> it = consumerSession.getVerificationSessions().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
                if (verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.Sms && verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Verified) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean isVerifiedForSignup(ConsumerSession consumerSession) {
        Object obj;
        boolean z;
        Iterator<T> it = consumerSession.getVerificationSessions().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
                if (verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.SignUp && verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Started) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final AccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public final String getAuthSessionCookie() {
        return this.consumerSession.getAuthSessionClientSecret();
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }
}
