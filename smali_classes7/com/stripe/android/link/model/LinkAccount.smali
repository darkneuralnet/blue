.class public final Lcom/stripe/android/link/model/LinkAccount;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0014\u001a\u0004\u0018\u00010\nJ\u000c\u0010\u0015\u001a\u00020\u0010*\u00020\u0003H\u0002J\u000c\u0010\u0016\u001a\u00020\u0010*\u00020\u0003H\u0002J\u000c\u0010\u0017\u001a\u00020\u0010*\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/link/model/LinkAccount;",
        "",
        "consumerSession",
        "Lcom/stripe/android/model/ConsumerSession;",
        "(Lcom/stripe/android/model/ConsumerSession;)V",
        "accountStatus",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "getAccountStatus",
        "()Lcom/stripe/android/link/model/AccountStatus;",
        "clientSecret",
        "",
        "getClientSecret",
        "()Ljava/lang/String;",
        "email",
        "getEmail",
        "isVerified",
        "",
        "()Z",
        "redactedPhoneNumber",
        "getRedactedPhoneNumber",
        "getAuthSessionCookie",
        "containsSMSSessionStarted",
        "containsVerifiedSMSSession",
        "isVerifiedForSignup",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final accountStatus:Lcom/stripe/android/link/model/AccountStatus;

.field private final clientSecret:Ljava/lang/String;

.field private final consumerSession:Lcom/stripe/android/model/ConsumerSession;

.field private final email:Ljava/lang/String;

.field private final isVerified:Z

.field private final redactedPhoneNumber:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/stripe/android/model/ConsumerSession;)V
    .locals 1

    const-string v0, "consumerSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getRedactedPhoneNumber()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->redactedPhoneNumber:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->clientSecret:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->email:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/stripe/android/link/model/LinkAccount;->containsVerifiedSMSSession(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/stripe/android/link/model/LinkAccount;->isVerifiedForSignup(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lcom/stripe/android/link/model/LinkAccount;->isVerified:Z

    if-eqz v0, :cond_2

    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->Verified:Lcom/stripe/android/link/model/AccountStatus;

    goto :goto_2

    :cond_2
    invoke-direct {p0, p1}, Lcom/stripe/android/link/model/LinkAccount;->containsSMSSessionStarted(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->VerificationStarted:Lcom/stripe/android/link/model/AccountStatus;

    goto :goto_2

    :cond_3
    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->NeedsVerification:Lcom/stripe/android/link/model/AccountStatus;

    :goto_2
    iput-object p1, p0, Lcom/stripe/android/link/model/LinkAccount;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    return-void
.end method

.method private final containsSMSSessionStarted(Lcom/stripe/android/model/ConsumerSession;)Z
    .locals 6

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->Sms:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    if-ne v4, v5, :cond_1

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->Started:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    if-ne v3, v4, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    return v1
.end method

.method private final containsVerifiedSMSSession(Lcom/stripe/android/model/ConsumerSession;)Z
    .locals 6

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->Sms:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    if-ne v4, v5, :cond_1

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->Verified:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    if-ne v3, v4, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    return v1
.end method

.method private final isVerifiedForSignup(Lcom/stripe/android/model/ConsumerSession;)Z
    .locals 6

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->SignUp:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    if-ne v4, v5, :cond_1

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->Started:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    if-ne v3, v4, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    return v1
.end method


# virtual methods
.method public final getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    return-object v0
.end method

.method public final getAuthSessionCookie()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSession;->getAuthSessionClientSecret()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getRedactedPhoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->redactedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final isVerified()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/model/LinkAccount;->isVerified:Z

    return v0
.end method
