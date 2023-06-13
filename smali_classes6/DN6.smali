.class public final LDN6;
.super LON6;
.source "SourceFile"


# instance fields
.field public final c:[B


# direct methods
.method public constructor <init>(Ljava/security/cert/X509Certificate;[B)V
    .locals 0

    invoke-direct {p0, p1}, LON6;-><init>(Ljava/security/cert/X509Certificate;)V

    iput-object p2, p0, LDN6;->c:[B

    return-void
.end method


# virtual methods
.method public final getEncoded()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateEncodingException;
        }
    .end annotation

    iget-object v0, p0, LDN6;->c:[B

    return-object v0
.end method
