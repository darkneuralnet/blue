.class public LJv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP;


# instance fields
.field public b:LY;


# direct methods
.method public constructor <init>(LY;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJv;->b:LY;

    return-void
.end method


# virtual methods
.method public a()LS;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, LIv;

    invoke-virtual {p0}, LJv;->b()Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1}, LLR5;->b(Ljava/io/InputStream;)[B

    move-result-object v1

    invoke-direct {v0, v1}, LIv;-><init>([B)V

    return-object v0
.end method

.method public b()Ljava/io/InputStream;
    .locals 2

    new-instance v0, Loz0;

    iget-object v1, p0, LJv;->b:LY;

    invoke-direct {v0, v1}, Loz0;-><init>(LY;)V

    return-object v0
.end method

.method public c()LS;
    .locals 4

    :try_start_0
    invoke-virtual {p0}, LJv;->a()LS;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1ParsingException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException converting stream to byte array: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
