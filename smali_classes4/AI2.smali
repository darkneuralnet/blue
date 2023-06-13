.class public final LAI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Landroid/app/DownloadManager;",
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

    iput-object p1, p0, LAI2;->a:LVH2;

    iput-object p2, p0, LAI2;->b:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;)LAI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LAI2;"
        }
    .end annotation

    new-instance v0, LAI2;

    invoke-direct {v0, p0, p1}, LAI2;-><init>(LVH2;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;Landroid/content/Context;)Landroid/app/DownloadManager;
    .locals 0

    invoke-virtual {p0, p1}, LVH2;->F(Landroid/content/Context;)Landroid/app/DownloadManager;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/DownloadManager;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/app/DownloadManager;
    .locals 2

    iget-object v0, p0, LAI2;->a:LVH2;

    iget-object v1, p0, LAI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, LAI2;->c(LVH2;Landroid/content/Context;)Landroid/app/DownloadManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LAI2;->b()Landroid/app/DownloadManager;

    move-result-object v0

    return-object v0
.end method
