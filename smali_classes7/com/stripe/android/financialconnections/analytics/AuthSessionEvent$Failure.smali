.class public final Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;
.super Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Failure"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;",
        "timestamp",
        "Ljava/util/Date;",
        "error",
        "",
        "(Ljava/util/Date;Ljava/lang/Throwable;)V",
        "getError",
        "()Ljava/lang/Throwable;",
        "getTimestamp",
        "()Ljava/util/Date;",
        "component1",
        "component2",
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
.field private final error:Ljava/lang/Throwable;

.field private final timestamp:Ljava/util/Date;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/Date;Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/stripe/android/financialconnections/analytics/AnalyticsMappersKt;->toEventParams(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "failure"

    invoke-direct {p0, v2, p1, v0, v1}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->timestamp:Ljava/util/Date;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->error:Ljava/lang/Throwable;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;Ljava/util/Date;Ljava/lang/Throwable;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->getTimestamp()Ljava/util/Date;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->error:Ljava/lang/Throwable;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->copy(Ljava/util/Date;Ljava/lang/Throwable;)Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Date;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->error:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final copy(Ljava/util/Date;Ljava/lang/Throwable;)Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;
    .locals 1

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;-><init>(Ljava/util/Date;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->getTimestamp()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->getTimestamp()Ljava/util/Date;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->error:Ljava/lang/Throwable;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->error:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getError()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->error:Ljava/lang/Throwable;

    return-object v0
.end method

.method public getTimestamp()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->timestamp:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->error:Ljava/lang/Throwable;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;->error:Ljava/lang/Throwable;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failure(timestamp="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
