.class public final LVB4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LUB4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVB4;->a:LY94;

    iput-object p2, p0, LVB4;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LVB4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LVB4;"
        }
    .end annotation

    new-instance v0, LVB4;

    invoke-direct {v0, p0, p1}, LVB4;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;LTq4;)LUB4;
    .locals 1

    new-instance v0, LUB4;

    invoke-direct {v0, p0, p1}, LUB4;-><init>(Landroid/content/Context;LTq4;)V

    return-object v0
.end method


# virtual methods
.method public b()LUB4;
    .locals 2

    iget-object v0, p0, LVB4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LVB4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTq4;

    invoke-static {v0, v1}, LVB4;->c(Landroid/content/Context;LTq4;)LUB4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LVB4;->b()LUB4;

    move-result-object v0

    return-object v0
.end method
