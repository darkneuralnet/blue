.class public final Lny0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LL46;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/E;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LK46;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "LK46;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0;->a:LZ94;

    iput-object p2, p0, Lny0;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)Lny0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "LK46;",
            ">;)",
            "Lny0;"
        }
    .end annotation

    new-instance v0, Lny0;

    invoke-direct {v0, p0, p1}, Lny0;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lio/reactivex/E;LK46;)LL46;
    .locals 0

    invoke-static {p0, p1}, Lhy0;->f(Lio/reactivex/E;LK46;)LL46;

    move-result-object p0

    invoke-static {p0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL46;

    return-object p0
.end method


# virtual methods
.method public b()LL46;
    .locals 2

    iget-object v0, p0, Lny0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/E;

    iget-object v1, p0, Lny0;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK46;

    invoke-static {v0, v1}, Lny0;->c(Lio/reactivex/E;LK46;)LL46;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lny0;->b()LL46;

    move-result-object v0

    return-object v0
.end method
