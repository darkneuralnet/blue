.class public final LZF6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LYF6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LHy1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lni;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LHy1;",
            ">;",
            "LY94<",
            "Lni;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZF6;->a:LY94;

    iput-object p2, p0, LZF6;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LZF6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LHy1;",
            ">;",
            "LY94<",
            "Lni;",
            ">;)",
            "LZF6;"
        }
    .end annotation

    new-instance v0, LZF6;

    invoke-direct {v0, p0, p1}, LZF6;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LHy1;Lni;)LYF6;
    .locals 1

    new-instance v0, LYF6;

    invoke-direct {v0, p0, p1}, LYF6;-><init>(LHy1;Lni;)V

    return-object v0
.end method


# virtual methods
.method public b()LYF6;
    .locals 2

    iget-object v0, p0, LZF6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHy1;

    iget-object v1, p0, LZF6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lni;

    invoke-static {v0, v1}, LZF6;->c(LHy1;Lni;)LYF6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZF6;->b()LYF6;

    move-result-object v0

    return-object v0
.end method
