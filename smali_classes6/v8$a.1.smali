.class public Lv8$a;
.super LD24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv8;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LD24<",
        "LVE2;",
        "Ls8;",
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

    check-cast p1, Ls8;

    invoke-virtual {p0, p1}, Lv8$a;->c(Ls8;)LVE2;

    move-result-object p1

    return-object p1
.end method

.method public c(Ls8;)LVE2;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, Lq24;

    new-instance v1, Lo24;

    invoke-virtual {p1}, Ls8;->J()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/g;->C()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lo24;-><init>([B)V

    invoke-virtual {p1}, Ls8;->K()Lx8;

    move-result-object p1

    invoke-virtual {p1}, Lx8;->I()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lq24;-><init>(Ln24;I)V

    return-object v0
.end method
