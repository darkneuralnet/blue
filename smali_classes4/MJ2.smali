.class public final LMJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LZC6;",
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


# direct methods
.method public constructor <init>(LVH2;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMJ2;->a:LVH2;

    iput-object p2, p0, LMJ2;->b:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;)LMJ2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LMJ2;"
        }
    .end annotation

    new-instance v0, LMJ2;

    invoke-direct {v0, p0, p1}, LMJ2;-><init>(LVH2;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;Landroid/content/Context;)LZC6;
    .locals 0

    invoke-virtual {p0, p1}, LVH2;->S0(Landroid/content/Context;)LZC6;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LZC6;

    return-object p0
.end method


# virtual methods
.method public b()LZC6;
    .locals 2

    iget-object v0, p0, LMJ2;->a:LVH2;

    iget-object v1, p0, LMJ2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, LMJ2;->c(LVH2;Landroid/content/Context;)LZC6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LMJ2;->b()LZC6;

    move-result-object v0

    return-object v0
.end method
