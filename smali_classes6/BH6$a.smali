.class public LBH6$a;
.super LD24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBH6;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LD24<",
        "Lp8;",
        "LzH6;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, LD24;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/F;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    check-cast p1, LzH6;

    invoke-virtual {p0, p1}, LBH6$a;->c(LzH6;)Lp8;

    move-result-object p1

    return-object p1
.end method

.method public c(LzH6;)Lp8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, LyH6;

    invoke-virtual {p1}, LzH6;->I()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->C()[B

    move-result-object p1

    invoke-direct {v0, p1}, LyH6;-><init>([B)V

    return-object v0
.end method
