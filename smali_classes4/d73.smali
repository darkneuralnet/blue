.class public final Ld73;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LP43;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/amazonaws/services/s3/AmazonS3Client;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LP43;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Lcom/amazonaws/services/s3/AmazonS3Client;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld73;->a:LP43;

    iput-object p2, p0, Ld73;->b:LY94;

    iput-object p3, p0, Ld73;->c:LY94;

    return-void
.end method

.method public static a(LP43;LY94;LY94;)Ld73;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Lcom/amazonaws/services/s3/AmazonS3Client;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "Ld73;"
        }
    .end annotation

    new-instance v0, Ld73;

    invoke-direct {v0, p0, p1, p2}, Ld73;-><init>(LP43;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LP43;Lcom/amazonaws/services/s3/AmazonS3Client;Landroid/content/Context;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;
    .locals 0

    invoke-virtual {p0, p1, p2}, LP43;->r1(Lcom/amazonaws/services/s3/AmazonS3Client;Landroid/content/Context;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;
    .locals 3

    iget-object v0, p0, Ld73;->a:LP43;

    iget-object v1, p0, Ld73;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/services/s3/AmazonS3Client;

    iget-object v2, p0, Ld73;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {v0, v1, v2}, Ld73;->c(LP43;Lcom/amazonaws/services/s3/AmazonS3Client;Landroid/content/Context;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld73;->b()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;

    move-result-object v0

    return-object v0
.end method
