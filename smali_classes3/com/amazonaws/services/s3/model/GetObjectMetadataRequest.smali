.class public Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "SourceFile"

# interfaces
.implements Lcom/amazonaws/services/s3/model/SSECustomerKeyProvider;
.implements Ljava/io/Serializable;


# instance fields
.field private bucketName:Ljava/lang/String;

.field private isRequesterPays:Z

.field private key:Ljava/lang/String;

.field private partNumber:Ljava/lang/Integer;

.field private sseCustomerKey:Lcom/amazonaws/services/s3/model/SSECustomerKey;

.field private versionId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->setBucketName(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->setKey(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->setVersionId(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getBucketName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->bucketName:Ljava/lang/String;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getPartNumber()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->partNumber:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSSECustomerKey()Lcom/amazonaws/services/s3/model/SSECustomerKey;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->sseCustomerKey:Lcom/amazonaws/services/s3/model/SSECustomerKey;

    return-object v0
.end method

.method public getVersionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->versionId:Ljava/lang/String;

    return-object v0
.end method

.method public isRequesterPays()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->isRequesterPays:Z

    return v0
.end method

.method public setBucketName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->bucketName:Ljava/lang/String;

    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->key:Ljava/lang/String;

    return-void
.end method

.method public setPartNumber(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->partNumber:Ljava/lang/Integer;

    return-void
.end method

.method public setRequesterPays(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->isRequesterPays:Z

    return-void
.end method

.method public setSSECustomerKey(Lcom/amazonaws/services/s3/model/SSECustomerKey;)V
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->sseCustomerKey:Lcom/amazonaws/services/s3/model/SSECustomerKey;

    return-void
.end method

.method public setVersionId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->versionId:Ljava/lang/String;

    return-void
.end method

.method public withBucketName(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->setBucketName(Ljava/lang/String;)V

    return-object p0
.end method

.method public withKey(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->setKey(Ljava/lang/String;)V

    return-object p0
.end method

.method public withPartNumber(Ljava/lang/Integer;)Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->setPartNumber(Ljava/lang/Integer;)V

    return-object p0
.end method

.method public withRequesterPays(Z)Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->setRequesterPays(Z)V

    return-object p0
.end method

.method public withSSECustomerKey(Lcom/amazonaws/services/s3/model/SSECustomerKey;)Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->setSSECustomerKey(Lcom/amazonaws/services/s3/model/SSECustomerKey;)V

    return-object p0
.end method

.method public withVersionId(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->setVersionId(Ljava/lang/String;)V

    return-object p0
.end method
