.class public final LH7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LG7;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
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
            "LTq4;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH7;->a:LY94;

    iput-object p2, p0, LH7;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LH7;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LH7;"
        }
    .end annotation

    new-instance v0, LH7;

    invoke-direct {v0, p0, p1}, LH7;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTq4;Landroid/content/Context;)LG7;
    .locals 1

    new-instance v0, LG7;

    invoke-direct {v0, p0, p1}, LG7;-><init>(LTq4;Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()LG7;
    .locals 2

    iget-object v0, p0, LH7;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    iget-object v1, p0, LH7;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, LH7;->c(LTq4;Landroid/content/Context;)LG7;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LH7;->b()LG7;

    move-result-object v0

    return-object v0
.end method
