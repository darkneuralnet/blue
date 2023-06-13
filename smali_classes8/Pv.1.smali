.class public LPv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX;


# instance fields
.field public b:LY;


# direct methods
.method public constructor <init>(LY;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPv;->b:LY;

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

    new-instance v0, LOv;

    iget-object v1, p0, LPv;->b:LY;

    invoke-virtual {v1}, LY;->d()LF;

    move-result-object v1

    invoke-direct {v0, v1}, LOv;-><init>(LF;)V

    return-object v0
.end method

.method public c()LS;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, LPv;->a()LS;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1ParsingException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
