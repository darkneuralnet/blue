.class public LRv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE;
.implements LSZ1;


# instance fields
.field public b:Z

.field public c:I

.field public d:LY;


# direct methods
.method public constructor <init>(ZILY;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LRv;->b:Z

    iput p2, p0, LRv;->c:I

    iput-object p3, p0, LRv;->d:LY;

    return-void
.end method


# virtual methods
.method public a()LS;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LRv;->d:LY;

    iget-boolean v1, p0, LRv;->b:Z

    iget v2, p0, LRv;->c:I

    invoke-virtual {v0, v1, v2}, LY;->c(ZI)LS;

    move-result-object v0

    return-object v0
.end method

.method public c()LS;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, LRv;->a()LS;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1ParsingException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
