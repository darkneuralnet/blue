.class public final LU43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/amazonaws/services/s3/AmazonS3Client;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LP43;

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
.method public constructor <init>(LP43;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU43;->a:LP43;

    iput-object p2, p0, LU43;->b:LY94;

    return-void
.end method

.method public static a(LP43;LY94;)LU43;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LU43;"
        }
    .end annotation

    new-instance v0, LU43;

    invoke-direct {v0, p0, p1}, LU43;-><init>(LP43;LY94;)V

    return-object v0
.end method

.method public static c(LP43;Landroid/content/Context;)Lcom/amazonaws/services/s3/AmazonS3Client;
    .locals 0

    invoke-virtual {p0, p1}, LP43;->f(Landroid/content/Context;)Lcom/amazonaws/services/s3/AmazonS3Client;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/services/s3/AmazonS3Client;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/amazonaws/services/s3/AmazonS3Client;
    .locals 2

    iget-object v0, p0, LU43;->a:LP43;

    iget-object v1, p0, LU43;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, LU43;->c(LP43;Landroid/content/Context;)Lcom/amazonaws/services/s3/AmazonS3Client;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LU43;->b()Lcom/amazonaws/services/s3/AmazonS3Client;

    move-result-object v0

    return-object v0
.end method
