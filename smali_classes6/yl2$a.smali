.class public Lyl2$a;
.super LD24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl2;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LD24<",
        "Lp8;",
        "Lwl2;",
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

    check-cast p1, Lwl2;

    invoke-virtual {p0, p1}, Lyl2$a;->c(Lwl2;)Lp8;

    move-result-object p1

    return-object p1
.end method

.method public c(Lwl2;)Lp8;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, Lwl2;->I()Lxl2;

    move-result-object v0

    invoke-virtual {v0}, Lxl2;->I()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lul2;->a(Ljava/lang/String;)Ltl2;

    move-result-object v1

    invoke-interface {v1, v0}, Ltl2;->b(Ljava/lang/String;)Lp8;

    move-result-object v0

    new-instance v1, Lvl2;

    invoke-virtual {p1}, Lwl2;->I()Lxl2;

    move-result-object p1

    invoke-virtual {p1}, Lxl2;->H()LKk2;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lvl2;-><init>(LKk2;Lp8;)V

    return-object v1
.end method
