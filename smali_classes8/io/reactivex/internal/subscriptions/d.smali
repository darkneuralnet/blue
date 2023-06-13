.class public final enum Lio/reactivex/internal/subscriptions/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/internal/subscriptions/d;",
        ">;",
        "Lio/reactivex/internal/fuseable/g<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lio/reactivex/internal/subscriptions/d;

.field public static final synthetic c:[Lio/reactivex/internal/subscriptions/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/reactivex/internal/subscriptions/d;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/reactivex/internal/subscriptions/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/reactivex/internal/subscriptions/d;->b:Lio/reactivex/internal/subscriptions/d;

    const/4 v1, 0x1

    new-array v1, v1, [Lio/reactivex/internal/subscriptions/d;

    aput-object v0, v1, v2

    sput-object v1, Lio/reactivex/internal/subscriptions/d;->c:[Lio/reactivex/internal/subscriptions/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(LhT5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/subscriptions/d;->b:Lio/reactivex/internal/subscriptions/d;

    invoke-interface {p0, v0}, LhT5;->a(LoT5;)V

    invoke-interface {p0}, LhT5;->onComplete()V

    return-void
.end method

.method public static c(Ljava/lang/Throwable;LhT5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "LhT5<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/subscriptions/d;->b:Lio/reactivex/internal/subscriptions/d;

    invoke-interface {p1, v0}, LhT5;->a(LoT5;)V

    invoke-interface {p1, p0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/internal/subscriptions/d;
    .locals 1

    const-class v0, Lio/reactivex/internal/subscriptions/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/internal/subscriptions/d;

    return-object p0
.end method

.method public static values()[Lio/reactivex/internal/subscriptions/d;
    .locals 1

    sget-object v0, Lio/reactivex/internal/subscriptions/d;->c:[Lio/reactivex/internal/subscriptions/d;

    invoke-virtual {v0}, [Lio/reactivex/internal/subscriptions/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/internal/subscriptions/d;

    return-object v0
.end method


# virtual methods
.method public b(I)I
    .locals 0

    and-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public cancel()V
    .locals 0

    return-void
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public o(J)V
    .locals 0

    invoke-static {p1, p2}, Lio/reactivex/internal/subscriptions/g;->h(J)Z

    return-void
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public poll()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptySubscription"

    return-object v0
.end method
