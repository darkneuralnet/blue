.class public final LFO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwM6;

.field public final b:LwM6;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(LwM6;LwM6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "LcO6;",
            ">;",
            "LwM6<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, LFO6;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFO6;->a:LwM6;

    iput-object p2, p0, LFO6;->b:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;LwM6;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "Landroid/content/Context;",
            ">;",
            "LwM6<",
            "LHK6;",
            ">;[B)V"
        }
    .end annotation

    const/4 p3, 0x1

    iput p3, p0, LFO6;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFO6;->b:LwM6;

    iput-object p2, p0, LFO6;->a:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;LwM6;[C)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "Landroid/content/Context;",
            ">;",
            "LwM6<",
            "LxL6;",
            ">;[C)V"
        }
    .end annotation

    const/4 p3, 0x2

    iput p3, p0, LFO6;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFO6;->a:LwM6;

    iput-object p2, p0, LFO6;->b:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;LwM6;[I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "LHK6;",
            ">;",
            "LwM6<",
            "LfP6;",
            ">;[I)V"
        }
    .end annotation

    const/4 p3, 0x4

    iput p3, p0, LFO6;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFO6;->b:LwM6;

    iput-object p2, p0, LFO6;->a:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;LwM6;[S)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "Landroid/content/Context;",
            ">;",
            "LwM6<",
            "LMM6;",
            ">;[S)V"
        }
    .end annotation

    const/4 p3, 0x3

    iput p3, p0, LFO6;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFO6;->a:LwM6;

    iput-object p2, p0, LFO6;->b:LwM6;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 7

    iget v0, p0, LFO6;->c:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LFO6;->b:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LFO6;->a:LwM6;

    invoke-static {v1}, LsM6;->c(LwM6;)LoM6;

    move-result-object v1

    new-instance v2, LOM6;

    check-cast v0, LHK6;

    invoke-direct {v2, v0, v1}, LOM6;-><init>(LHK6;LoM6;)V

    return-object v2

    :cond_0
    iget-object v0, p0, LFO6;->a:LwM6;

    check-cast v0, LTO6;

    invoke-virtual {v0}, LTO6;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, LFO6;->b:LwM6;

    invoke-interface {v1}, LwM6;->a()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, LHK6;

    check-cast v1, LMM6;

    invoke-direct {v2, v0, v1}, LHK6;-><init>(Landroid/content/Context;LMM6;)V

    return-object v2

    :cond_1
    iget-object v0, p0, LFO6;->a:LwM6;

    check-cast v0, LTO6;

    invoke-virtual {v0}, LTO6;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, LFO6;->b:LwM6;

    invoke-interface {v1}, LwM6;->a()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, LuK6;

    check-cast v1, LxL6;

    invoke-direct {v2, v0, v1}, LuK6;-><init>(Landroid/content/Context;LxL6;)V

    return-object v2

    :cond_2
    iget-object v0, p0, LFO6;->b:LwM6;

    check-cast v0, LTO6;

    invoke-virtual {v0}, LTO6;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, LFO6;->a:LwM6;

    invoke-interface {v1}, LwM6;->a()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, LcL6;

    check-cast v1, LHK6;

    invoke-direct {v2, v0, v1}, LcL6;-><init>(Landroid/content/Context;LHK6;)V

    return-object v2

    :cond_3
    iget-object v0, p0, LFO6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LFO6;->b:LwM6;

    check-cast v1, LTO6;

    invoke-virtual {v1}, LTO6;->b()Landroid/content/Context;

    move-result-object v1

    check-cast v0, LcO6;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    new-instance v3, Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "com.google.android.play.core.assetpacks.AssetPackExtractionService"

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x4

    invoke-static {v2, v3, v4}, LpL6;->h(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;I)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    new-instance v3, Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "com.google.android.play.core.assetpacks.ExtractionForegroundService"

    invoke-direct {v3, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2, v3, v4}, LpL6;->h(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;I)V

    invoke-static {v1}, Lcom/google/android/play/core/common/PlayCoreDialogWrapperActivity;->a(Landroid/content/Context;)V

    invoke-static {v0}, LpL6;->k(Ljava/lang/Object;)V

    return-object v0
.end method
