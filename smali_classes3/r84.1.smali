.class public final Lr84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lp84;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lw84;",
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
            "Lw84;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr84;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lr84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lw84;",
            ">;)",
            "Lr84;"
        }
    .end annotation

    new-instance v0, Lr84;

    invoke-direct {v0, p0}, Lr84;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lw84;)Lp84;
    .locals 1

    new-instance v0, Lp84;

    invoke-direct {v0, p0}, Lp84;-><init>(Lw84;)V

    return-object v0
.end method


# virtual methods
.method public b()Lp84;
    .locals 1

    iget-object v0, p0, Lr84;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw84;

    invoke-static {v0}, Lr84;->c(Lw84;)Lp84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr84;->b()Lp84;

    move-result-object v0

    return-object v0
.end method
