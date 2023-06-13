.class public final Lio/reactivex/internal/operators/single/G;
.super Lio/reactivex/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/single/G$a;,
        Lio/reactivex/internal/operators/single/G$c;,
        Lio/reactivex/internal/operators/single/G$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/F<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final b:[Lio/reactivex/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/K<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Lio/reactivex/K;Lio/reactivex/functions/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lio/reactivex/K<",
            "+TT;>;",
            "Lio/reactivex/functions/o<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/single/G;->b:[Lio/reactivex/K;

    iput-object p2, p0, Lio/reactivex/internal/operators/single/G;->c:Lio/reactivex/functions/o;

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/single/G;->b:[Lio/reactivex/K;

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    aget-object v0, v0, v3

    new-instance v1, Lio/reactivex/internal/operators/single/w$a;

    new-instance v2, Lio/reactivex/internal/operators/single/G$a;

    invoke-direct {v2, p0}, Lio/reactivex/internal/operators/single/G$a;-><init>(Lio/reactivex/internal/operators/single/G;)V

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/single/w$a;-><init>(Lio/reactivex/I;Lio/reactivex/functions/o;)V

    invoke-interface {v0, v1}, Lio/reactivex/K;->a(Lio/reactivex/I;)V

    return-void

    :cond_0
    new-instance v2, Lio/reactivex/internal/operators/single/G$b;

    iget-object v4, p0, Lio/reactivex/internal/operators/single/G;->c:Lio/reactivex/functions/o;

    invoke-direct {v2, p1, v1, v4}, Lio/reactivex/internal/operators/single/G$b;-><init>(Lio/reactivex/I;ILio/reactivex/functions/o;)V

    invoke-interface {p1, v2}, Lio/reactivex/I;->onSubscribe(Lio/reactivex/disposables/c;)V

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {v2}, Lio/reactivex/internal/operators/single/G$b;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    aget-object p1, v0, v3

    if-nez p1, :cond_2

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "One of the sources is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1, v3}, Lio/reactivex/internal/operators/single/G$b;->b(Ljava/lang/Throwable;I)V

    return-void

    :cond_2
    iget-object v4, v2, Lio/reactivex/internal/operators/single/G$b;->d:[Lio/reactivex/internal/operators/single/G$c;

    aget-object v4, v4, v3

    invoke-interface {p1, v4}, Lio/reactivex/K;->a(Lio/reactivex/I;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
