.class public final Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;
.super Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Retry"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;",
        "timestamp",
        "Ljava/util/Date;",
        "(Ljava/util/Date;)V",
        "getTimestamp",
        "()Ljava/util/Date;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final timestamp:Ljava/util/Date;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/Date;)V
    .locals 7

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "retry"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;->timestamp:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;Ljava/util/Date;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;->getTimestamp()Ljava/util/Date;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;->copy(Ljava/util/Date;)Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Date;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Ljava/util/Date;)Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;
    .locals 1

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;-><init>(Ljava/util/Date;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;->getTimestamp()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;->getTimestamp()Ljava/util/Date;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getTimestamp()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;->timestamp:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Retry(timestamp="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
