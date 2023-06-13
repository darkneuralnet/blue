.class public LGv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE;
.implements LSZ1;


# instance fields
.field public final b:I

.field public final c:LY;


# direct methods
.method public constructor <init>(ILY;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LGv;->b:I

    iput-object p2, p0, LGv;->c:LY;

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

    new-instance v0, LFv;

    iget v1, p0, LGv;->b:I

    iget-object v2, p0, LGv;->c:LY;

    invoke-virtual {v2}, LY;->d()LF;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LFv;-><init>(ILF;)V

    return-object v0
.end method

.method public c()LS;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, LGv;->a()LS;

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
