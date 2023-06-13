.class public final LSx0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LRx0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/base/BaseCoreActivity;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLZ;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/DialogInterface;",
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
            "Lco/bird/android/core/base/BaseCoreActivity;",
            ">;",
            "LY94<",
            "LLZ;",
            ">;",
            "LY94<",
            "Landroid/content/DialogInterface;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSx0;->a:LY94;

    iput-object p2, p0, LSx0;->b:LY94;

    iput-object p3, p0, LSx0;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LSx0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/base/BaseCoreActivity;",
            ">;",
            "LY94<",
            "LLZ;",
            ">;",
            "LY94<",
            "Landroid/content/DialogInterface;",
            ">;)",
            "LSx0;"
        }
    .end annotation

    new-instance v0, LSx0;

    invoke-direct {v0, p0, p1, p2}, LSx0;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/base/BaseCoreActivity;LLZ;Landroid/content/DialogInterface;)LRx0;
    .locals 1

    new-instance v0, LRx0;

    invoke-direct {v0, p0, p1, p2}, LRx0;-><init>(Lco/bird/android/core/base/BaseCoreActivity;LLZ;Landroid/content/DialogInterface;)V

    return-object v0
.end method


# virtual methods
.method public b()LRx0;
    .locals 3

    iget-object v0, p0, LSx0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/base/BaseCoreActivity;

    iget-object v1, p0, LSx0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLZ;

    iget-object v2, p0, LSx0;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/DialogInterface;

    invoke-static {v0, v1, v2}, LSx0;->c(Lco/bird/android/core/base/BaseCoreActivity;LLZ;Landroid/content/DialogInterface;)LRx0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LSx0;->b()LRx0;

    move-result-object v0

    return-object v0
.end method
