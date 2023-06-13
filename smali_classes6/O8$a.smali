.class public LO8$a;
.super LD24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO8;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LD24<",
        "Lp8;",
        "LM8;",
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

    check-cast p1, LM8;

    invoke-virtual {p0, p1}, LO8$a;->c(LM8;)Lp8;

    move-result-object p1

    return-object p1
.end method

.method public c(LM8;)Lp8;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, LL8;

    invoke-virtual {p1}, LM8;->J()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/g;->C()[B

    move-result-object v1

    invoke-virtual {p1}, LM8;->K()LP8;

    move-result-object p1

    invoke-virtual {p1}, LP8;->I()I

    move-result p1

    invoke-direct {v0, v1, p1}, LL8;-><init>([BI)V

    return-object v0
.end method
