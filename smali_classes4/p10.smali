.class public final Lp10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lo10;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lq10;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lq10;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp10;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lp10;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lq10;",
            ">;)",
            "Lp10;"
        }
    .end annotation

    new-instance v0, Lp10;

    invoke-direct {v0, p0}, Lp10;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lq10;)Lo10;
    .locals 1

    new-instance v0, Lo10;

    invoke-direct {v0, p0}, Lo10;-><init>(Lq10;)V

    return-object v0
.end method


# virtual methods
.method public b()Lo10;
    .locals 1

    iget-object v0, p0, Lp10;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq10;

    invoke-static {v0}, Lp10;->c(Lq10;)Lo10;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp10;->b()Lo10;

    move-result-object v0

    return-object v0
.end method
