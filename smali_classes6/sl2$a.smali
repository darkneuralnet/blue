.class public Lsl2$a;
.super LD24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl2;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LD24<",
        "Lp8;",
        "Lql2;",
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

    check-cast p1, Lql2;

    invoke-virtual {p0, p1}, Lsl2$a;->c(Lql2;)Lp8;

    move-result-object p1

    return-object p1
.end method

.method public c(Lql2;)Lp8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, Lql2;->I()Lrl2;

    move-result-object p1

    invoke-virtual {p1}, Lrl2;->H()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lul2;->a(Ljava/lang/String;)Ltl2;

    move-result-object v0

    invoke-interface {v0, p1}, Ltl2;->b(Ljava/lang/String;)Lp8;

    move-result-object p1

    return-object p1
.end method
