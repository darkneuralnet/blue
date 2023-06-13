.class public final Lwk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lvk5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lpd5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LNw2;",
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
            "Lpd5;",
            ">;",
            "LZ94<",
            "LNw2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwk5;->a:LZ94;

    iput-object p2, p0, Lwk5;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)Lwk5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lpd5;",
            ">;",
            "LZ94<",
            "LNw2;",
            ">;)",
            "Lwk5;"
        }
    .end annotation

    new-instance v0, Lwk5;

    invoke-direct {v0, p0, p1}, Lwk5;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lpd5;LNw2;)Lvk5;
    .locals 1

    new-instance v0, Lvk5;

    invoke-direct {v0, p0, p1}, Lvk5;-><init>(Lpd5;LNw2;)V

    return-object v0
.end method


# virtual methods
.method public b()Lvk5;
    .locals 2

    iget-object v0, p0, Lwk5;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpd5;

    iget-object v1, p0, Lwk5;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNw2;

    invoke-static {v0, v1}, Lwk5;->c(Lpd5;LNw2;)Lvk5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwk5;->b()Lvk5;

    move-result-object v0

    return-object v0
.end method
