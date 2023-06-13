.class public final Lxt5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lwt5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LZk3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LZk3;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxt5;->a:LY94;

    iput-object p2, p0, Lxt5;->b:LY94;

    iput-object p3, p0, Lxt5;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lxt5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LZk3;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)",
            "Lxt5;"
        }
    .end annotation

    new-instance v0, Lxt5;

    invoke-direct {v0, p0, p1, p2}, Lxt5;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LZk3;LEa;LRh6;)Lwt5;
    .locals 1

    new-instance v0, Lwt5;

    invoke-direct {v0, p0, p1, p2}, Lwt5;-><init>(LZk3;LEa;LRh6;)V

    return-object v0
.end method


# virtual methods
.method public b()Lwt5;
    .locals 3

    iget-object v0, p0, Lxt5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZk3;

    iget-object v1, p0, Lxt5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEa;

    iget-object v2, p0, Lxt5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LRh6;

    invoke-static {v0, v1, v2}, Lxt5;->c(LZk3;LEa;LRh6;)Lwt5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxt5;->b()Lwt5;

    move-result-object v0

    return-object v0
.end method
