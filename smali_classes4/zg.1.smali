.class public final Lzg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lwg;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOi;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljg;",
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
            "LRh6;",
            ">;",
            "LY94<",
            "LOi;",
            ">;",
            "LY94<",
            "Ljg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzg;->a:LY94;

    iput-object p2, p0, Lzg;->b:LY94;

    iput-object p3, p0, Lzg;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lzg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LOi;",
            ">;",
            "LY94<",
            "Ljg;",
            ">;)",
            "Lzg;"
        }
    .end annotation

    new-instance v0, Lzg;

    invoke-direct {v0, p0, p1, p2}, Lzg;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LRh6;LOi;Ljg;)Lwg;
    .locals 1

    new-instance v0, Lwg;

    invoke-direct {v0, p0, p1, p2}, Lwg;-><init>(LRh6;LOi;Ljg;)V

    return-object v0
.end method


# virtual methods
.method public b()Lwg;
    .locals 3

    iget-object v0, p0, Lzg;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRh6;

    iget-object v1, p0, Lzg;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LOi;

    iget-object v2, p0, Lzg;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljg;

    invoke-static {v0, v1, v2}, Lzg;->c(LRh6;LOi;Ljg;)Lwg;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzg;->b()Lwg;

    move-result-object v0

    return-object v0
.end method
