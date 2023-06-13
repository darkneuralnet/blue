.class public final LIe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LFe5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMD;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaY;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LhX;",
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
            "LMD;",
            ">;",
            "LY94<",
            "LaY;",
            ">;",
            "LY94<",
            "LhX;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIe5;->a:LY94;

    iput-object p2, p0, LIe5;->b:LY94;

    iput-object p3, p0, LIe5;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LIe5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LMD;",
            ">;",
            "LY94<",
            "LaY;",
            ">;",
            "LY94<",
            "LhX;",
            ">;)",
            "LIe5;"
        }
    .end annotation

    new-instance v0, LIe5;

    invoke-direct {v0, p0, p1, p2}, LIe5;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LMD;LaY;LhX;)LFe5;
    .locals 1

    new-instance v0, LFe5;

    invoke-direct {v0, p0, p1, p2}, LFe5;-><init>(LMD;LaY;LhX;)V

    return-object v0
.end method


# virtual methods
.method public b()LFe5;
    .locals 3

    iget-object v0, p0, LIe5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMD;

    iget-object v1, p0, LIe5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LaY;

    iget-object v2, p0, LIe5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LhX;

    invoke-static {v0, v1, v2}, LIe5;->c(LMD;LaY;LhX;)LFe5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIe5;->b()LFe5;

    move-result-object v0

    return-object v0
.end method
