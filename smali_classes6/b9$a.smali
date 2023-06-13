.class public Lb9$a;
.super LD24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb9;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LD24<",
        "Le21;",
        "LZ8;",
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

    check-cast p1, LZ8;

    invoke-virtual {p0, p1}, Lb9$a;->c(LZ8;)Le21;

    move-result-object p1

    return-object p1
.end method

.method public c(LZ8;)Le21;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, LY8;

    invoke-virtual {p1}, LZ8;->I()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->C()[B

    move-result-object p1

    invoke-direct {v0, p1}, LY8;-><init>([B)V

    return-object v0
.end method
