.class public final enum Lio/reactivex/internal/util/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/util/n$a;,
        Lio/reactivex/internal/util/n$c;,
        Lio/reactivex/internal/util/n$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/internal/util/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lio/reactivex/internal/util/n;

.field public static final synthetic c:[Lio/reactivex/internal/util/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/reactivex/internal/util/n;

    const-string v1, "COMPLETE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/reactivex/internal/util/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/reactivex/internal/util/n;->b:Lio/reactivex/internal/util/n;

    const/4 v1, 0x1

    new-array v1, v1, [Lio/reactivex/internal/util/n;

    aput-object v0, v1, v2

    sput-object v1, Lio/reactivex/internal/util/n;->c:[Lio/reactivex/internal/util/n;

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

.method public static a(Ljava/lang/Object;LhT5;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "LhT5<",
            "-TT;>;)Z"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/util/n;->b:Lio/reactivex/internal/util/n;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    invoke-interface {p1}, LhT5;->onComplete()V

    return v1

    :cond_0
    instance-of v0, p0, Lio/reactivex/internal/util/n$b;

    if-eqz v0, :cond_1

    check-cast p0, Lio/reactivex/internal/util/n$b;

    iget-object p0, p0, Lio/reactivex/internal/util/n$b;->b:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_1
    invoke-interface {p1, p0}, LhT5;->onNext(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static b(Ljava/lang/Object;Lio/reactivex/D;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lio/reactivex/D<",
            "-TT;>;)Z"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/util/n;->b:Lio/reactivex/internal/util/n;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    invoke-interface {p1}, Lio/reactivex/D;->onComplete()V

    return v1

    :cond_0
    instance-of v0, p0, Lio/reactivex/internal/util/n$b;

    if-eqz v0, :cond_1

    check-cast p0, Lio/reactivex/internal/util/n$b;

    iget-object p0, p0, Lio/reactivex/internal/util/n$b;->b:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_1
    invoke-interface {p1, p0}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static c(Ljava/lang/Object;LhT5;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "LhT5<",
            "-TT;>;)Z"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/util/n;->b:Lio/reactivex/internal/util/n;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    invoke-interface {p1}, LhT5;->onComplete()V

    return v1

    :cond_0
    instance-of v0, p0, Lio/reactivex/internal/util/n$b;

    if-eqz v0, :cond_1

    check-cast p0, Lio/reactivex/internal/util/n$b;

    iget-object p0, p0, Lio/reactivex/internal/util/n$b;->b:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, LhT5;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_1
    instance-of v0, p0, Lio/reactivex/internal/util/n$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Lio/reactivex/internal/util/n$c;

    iget-object p0, p0, Lio/reactivex/internal/util/n$c;->b:LoT5;

    invoke-interface {p1, p0}, LhT5;->a(LoT5;)V

    return v1

    :cond_2
    invoke-interface {p1, p0}, LhT5;->onNext(Ljava/lang/Object;)V

    return v1
.end method

.method public static d(Ljava/lang/Object;Lio/reactivex/D;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lio/reactivex/D<",
            "-TT;>;)Z"
        }
    .end annotation

    sget-object v0, Lio/reactivex/internal/util/n;->b:Lio/reactivex/internal/util/n;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    invoke-interface {p1}, Lio/reactivex/D;->onComplete()V

    return v1

    :cond_0
    instance-of v0, p0, Lio/reactivex/internal/util/n$b;

    if-eqz v0, :cond_1

    check-cast p0, Lio/reactivex/internal/util/n$b;

    iget-object p0, p0, Lio/reactivex/internal/util/n$b;->b:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_1
    instance-of v0, p0, Lio/reactivex/internal/util/n$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Lio/reactivex/internal/util/n$a;

    iget-object p0, p0, Lio/reactivex/internal/util/n$a;->b:Lio/reactivex/disposables/c;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    return v1

    :cond_2
    invoke-interface {p1, p0}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    return v1
.end method

.method public static e()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lio/reactivex/internal/util/n;->b:Lio/reactivex/internal/util/n;

    return-object v0
.end method

.method public static f(Lio/reactivex/disposables/c;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lio/reactivex/internal/util/n$a;

    invoke-direct {v0, p0}, Lio/reactivex/internal/util/n$a;-><init>(Lio/reactivex/disposables/c;)V

    return-object v0
.end method

.method public static g(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lio/reactivex/internal/util/n$b;

    invoke-direct {v0, p0}, Lio/reactivex/internal/util/n$b;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static h(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    check-cast p0, Lio/reactivex/internal/util/n$b;

    iget-object p0, p0, Lio/reactivex/internal/util/n$b;->b:Ljava/lang/Throwable;

    return-object p0
.end method

.method public static i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p0
.end method

.method public static j(Ljava/lang/Object;)Z
    .locals 1

    sget-object v0, Lio/reactivex/internal/util/n;->b:Lio/reactivex/internal/util/n;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static k(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Lio/reactivex/internal/util/n$b;

    return p0
.end method

.method public static l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    return-object p0
.end method

.method public static m(LoT5;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lio/reactivex/internal/util/n$c;

    invoke-direct {v0, p0}, Lio/reactivex/internal/util/n$c;-><init>(LoT5;)V

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/internal/util/n;
    .locals 1

    const-class v0, Lio/reactivex/internal/util/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/internal/util/n;

    return-object p0
.end method

.method public static values()[Lio/reactivex/internal/util/n;
    .locals 1

    sget-object v0, Lio/reactivex/internal/util/n;->c:[Lio/reactivex/internal/util/n;

    invoke-virtual {v0}, [Lio/reactivex/internal/util/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/internal/util/n;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NotificationLite.Complete"

    return-object v0
.end method
