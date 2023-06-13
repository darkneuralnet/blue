.class public final LNa4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ldd3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LMa4;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LZC6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LMa4;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMa4;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LZC6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNa4;->a:LMa4;

    iput-object p2, p0, LNa4;->b:LY94;

    iput-object p3, p0, LNa4;->c:LY94;

    return-void
.end method

.method public static a(LMa4;LY94;LY94;)LNa4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMa4;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LZC6;",
            ">;)",
            "LNa4;"
        }
    .end annotation

    new-instance v0, LNa4;

    invoke-direct {v0, p0, p1, p2}, LNa4;-><init>(LMa4;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LMa4;Landroid/content/Context;LZC6;)Ldd3;
    .locals 0

    invoke-virtual {p0, p1, p2}, LMa4;->a(Landroid/content/Context;LZC6;)Ldd3;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldd3;

    return-object p0
.end method


# virtual methods
.method public b()Ldd3;
    .locals 3

    iget-object v0, p0, LNa4;->a:LMa4;

    iget-object v1, p0, LNa4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LNa4;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZC6;

    invoke-static {v0, v1, v2}, LNa4;->c(LMa4;Landroid/content/Context;LZC6;)Ldd3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LNa4;->b()Ldd3;

    move-result-object v0

    return-object v0
.end method
