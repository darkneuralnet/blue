.class public final LvF5;
.super Ljava/lang/Object;
.source "SourceFile"


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
            "LhI5;",
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
            "LhI5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvF5;->a:LY94;

    iput-object p2, p0, LvF5;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LvF5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LhI5;",
            ">;)",
            "LvF5;"
        }
    .end annotation

    new-instance v0, LvF5;

    invoke-direct {v0, p0, p1}, LvF5;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;LhI5;LZC0;LsE5;Z)LuF5;
    .locals 7

    new-instance v6, LuF5;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, LuF5;-><init>(Landroid/content/Context;LhI5;LZC0;LsE5;Z)V

    return-object v6
.end method


# virtual methods
.method public b(LZC0;LsE5;Z)LuF5;
    .locals 2

    iget-object v0, p0, LvF5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LvF5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LhI5;

    invoke-static {v0, v1, p1, p2, p3}, LvF5;->c(Landroid/content/Context;LhI5;LZC0;LsE5;Z)LuF5;

    move-result-object p1

    return-object p1
.end method
