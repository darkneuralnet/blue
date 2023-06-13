.class public final Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;",
        "",
        "",
        "payload",
        "Ljava/security/interfaces/RSAPublicKey;",
        "publicKey",
        "keyId",
        "encrypt",
        "Ldh2;",
        "createJweObject",
        "<init>",
        "()V",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createJweObject(Ljava/lang/String;Ljava/lang/String;)Ldh2;
    .locals 4

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldh2;

    new-instance v1, Lbh2$a;

    sget-object v2, LXg2;->g:LXg2;

    sget-object v3, LUc1;->f:LUc1;

    invoke-direct {v1, v2, v3}, Lbh2$a;-><init>(LXg2;LUc1;)V

    invoke-virtual {v1, p2}, Lbh2$a;->m(Ljava/lang/String;)Lbh2$a;

    move-result-object p2

    invoke-virtual {p2}, Lbh2$a;->d()Lbh2;

    move-result-object p2

    new-instance v1, LvL3;

    invoke-direct {v1, p1}, LvL3;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, p2, v1}, Ldh2;-><init>(Lbh2;LvL3;)V

    return-object v0
.end method

.method public final encrypt(Ljava/lang/String;Ljava/security/interfaces/RSAPublicKey;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publicKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;->createJweObject(Ljava/lang/String;Ljava/lang/String;)Ldh2;

    move-result-object p1

    new-instance p3, Lnm4;

    invoke-direct {p3, p2}, Lnm4;-><init>(Ljava/security/interfaces/RSAPublicKey;)V

    invoke-virtual {p1, p3}, Ldh2;->g(Lah2;)V

    invoke-virtual {p1}, Ldh2;->r()Ljava/lang/String;

    move-result-object p1

    const-string p2, "jwe.serialize()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
