.class public final enum Lio/reactivex/internal/disposables/e;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/internal/disposables/e;",
        ">;",
        "Lio/reactivex/internal/fuseable/e<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lio/reactivex/internal/disposables/e;

.field public static final enum c:Lio/reactivex/internal/disposables/e;

.field public static final synthetic d:[Lio/reactivex/internal/disposables/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/reactivex/internal/disposables/e;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/reactivex/internal/disposables/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    new-instance v1, Lio/reactivex/internal/disposables/e;

    const-string v3, "NEVER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lio/reactivex/internal/disposables/e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/reactivex/internal/disposables/e;->c:Lio/reactivex/internal/disposables/e;

    const/4 v3, 0x2

    new-array v3, v3, [Lio/reactivex/internal/disposables/e;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lio/reactivex/internal/disposables/e;->d:[Lio/reactivex/internal/disposables/e;

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

.method public static a(Lio/reactivex/f;)V
    .locals 1

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    invoke-interface {p0, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-interface {p0}, Lio/reactivex/f;->onComplete()V

    return-void
.end method

.method public static c(Lio/reactivex/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/s<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    invoke-interface {p0, v0}, Lio/reactivex/s;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-interface {p0}, Lio/reactivex/s;->onComplete()V

    return-void
.end method

.method public static d(Lio/reactivex/D;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    invoke-interface {p0, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-interface {p0}, Lio/reactivex/D;->onComplete()V

    return-void
.end method

.method public static g(Ljava/lang/Throwable;Lio/reactivex/f;)V
    .locals 1

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-interface {p1, p0}, Lio/reactivex/f;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static h(Ljava/lang/Throwable;Lio/reactivex/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/s<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    invoke-interface {p1, v0}, Lio/reactivex/s;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-interface {p1, p0}, Lio/reactivex/s;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static i(Ljava/lang/Throwable;Lio/reactivex/D;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/D<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-interface {p1, p0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static j(Ljava/lang/Throwable;Lio/reactivex/I;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lio/reactivex/I<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    invoke-interface {p1, v0}, Lio/reactivex/I;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-interface {p1, p0}, Lio/reactivex/I;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/internal/disposables/e;
    .locals 1

    const-class v0, Lio/reactivex/internal/disposables/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/internal/disposables/e;

    return-object p0
.end method

.method public static values()[Lio/reactivex/internal/disposables/e;
    .locals 1

    sget-object v0, Lio/reactivex/internal/disposables/e;->d:[Lio/reactivex/internal/disposables/e;

    invoke-virtual {v0}, [Lio/reactivex/internal/disposables/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/internal/disposables/e;

    return-object v0
.end method


# virtual methods
.method public b(I)I
    .locals 0

    and-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public dispose()V
    .locals 0

    return-void
.end method

.method public e()Z
    .locals 1

    sget-object v0, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
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
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method
