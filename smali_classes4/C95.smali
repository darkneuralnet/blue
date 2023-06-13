.class public final LC95;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LB95;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LUI4;",
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
            "LUI4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC95;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LC95;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LUI4;",
            ">;)",
            "LC95;"
        }
    .end annotation

    new-instance v0, LC95;

    invoke-direct {v0, p0}, LC95;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LUI4;)LB95;
    .locals 1

    new-instance v0, LB95;

    invoke-direct {v0, p0}, LB95;-><init>(LUI4;)V

    return-object v0
.end method


# virtual methods
.method public b()LB95;
    .locals 1

    iget-object v0, p0, LC95;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUI4;

    invoke-static {v0}, LC95;->c(LUI4;)LB95;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC95;->b()LB95;

    move-result-object v0

    return-object v0
.end method
