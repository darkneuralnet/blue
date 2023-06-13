.class public final Lyk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lxk5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lvk5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/E;",
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
            "Lvk5;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyk5;->a:LZ94;

    iput-object p2, p0, Lyk5;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)Lyk5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lvk5;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;)",
            "Lyk5;"
        }
    .end annotation

    new-instance v0, Lyk5;

    invoke-direct {v0, p0, p1}, Lyk5;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lvk5;Lio/reactivex/E;)Lxk5;
    .locals 1

    new-instance v0, Lxk5;

    invoke-direct {v0, p0, p1}, Lxk5;-><init>(Lvk5;Lio/reactivex/E;)V

    return-object v0
.end method


# virtual methods
.method public b()Lxk5;
    .locals 2

    iget-object v0, p0, Lyk5;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvk5;

    iget-object v1, p0, Lyk5;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/E;

    invoke-static {v0, v1}, Lyk5;->c(Lvk5;Lio/reactivex/E;)Lxk5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyk5;->b()Lxk5;

    move-result-object v0

    return-object v0
.end method
