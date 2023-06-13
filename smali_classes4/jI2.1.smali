.class public final LjI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LyL;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaM;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llp2;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lde5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Llp2;",
            ">;",
            "LY94<",
            "Lde5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjI2;->a:LVH2;

    iput-object p2, p0, LjI2;->b:LY94;

    iput-object p3, p0, LjI2;->c:LY94;

    iput-object p4, p0, LjI2;->d:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;)LjI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Llp2;",
            ">;",
            "LY94<",
            "Lde5;",
            ">;)",
            "LjI2;"
        }
    .end annotation

    new-instance v0, LjI2;

    invoke-direct {v0, p0, p1, p2, p3}, LjI2;-><init>(LVH2;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;LaM;Llp2;Lde5;)LyL;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LVH2;->n(LaM;Llp2;Lde5;)LyL;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LyL;

    return-object p0
.end method


# virtual methods
.method public b()LyL;
    .locals 4

    iget-object v0, p0, LjI2;->a:LVH2;

    iget-object v1, p0, LjI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LaM;

    iget-object v2, p0, LjI2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llp2;

    iget-object v3, p0, LjI2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lde5;

    invoke-static {v0, v1, v2, v3}, LjI2;->c(LVH2;LaM;Llp2;Lde5;)LyL;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LjI2;->b()LyL;

    move-result-object v0

    return-object v0
.end method
