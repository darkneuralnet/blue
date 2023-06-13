.class public final LCI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Llj1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

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
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOh;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCI2;->a:LVH2;

    iput-object p2, p0, LCI2;->b:LY94;

    iput-object p3, p0, LCI2;->c:LY94;

    iput-object p4, p0, LCI2;->d:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;)LCI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;)",
            "LCI2;"
        }
    .end annotation

    new-instance v0, LCI2;

    invoke-direct {v0, p0, p1, p2, p3}, LCI2;-><init>(LVH2;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;Landroid/content/Context;LTq4;LOh;)Llj1;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LVH2;->H(Landroid/content/Context;LTq4;LOh;)Llj1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llj1;

    return-object p0
.end method


# virtual methods
.method public b()Llj1;
    .locals 4

    iget-object v0, p0, LCI2;->a:LVH2;

    iget-object v1, p0, LCI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LCI2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTq4;

    iget-object v3, p0, LCI2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LOh;

    invoke-static {v0, v1, v2, v3}, LCI2;->c(LVH2;Landroid/content/Context;LTq4;LOh;)Llj1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LCI2;->b()Llj1;

    move-result-object v0

    return-object v0
.end method
