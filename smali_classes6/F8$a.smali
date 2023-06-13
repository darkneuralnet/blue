.class public LF8$a;
.super LD24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LD24<",
        "Lp8;",
        "LD8;",
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

    check-cast p1, LD8;

    invoke-virtual {p0, p1}, LF8$a;->c(LD8;)Lp8;

    move-result-object p1

    return-object p1
.end method

.method public c(LD8;)Lp8;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    new-instance v0, LRc1;

    new-instance v1, LJ8;

    invoke-direct {v1}, LJ8;-><init>()V

    invoke-virtual {p1}, LD8;->J()LH8;

    move-result-object v2

    const-class v3, Lk12;

    invoke-virtual {v1, v2, v3}, LQk2;->e(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk12;

    new-instance v2, LVM1;

    invoke-direct {v2}, LVM1;-><init>()V

    invoke-virtual {p1}, LD8;->K()LTM1;

    move-result-object v3

    const-class v4, LVE2;

    invoke-virtual {v2, v3, v4}, LQk2;->e(Lcom/google/crypto/tink/shaded/protobuf/F;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LVE2;

    invoke-virtual {p1}, LD8;->K()LTM1;

    move-result-object p1

    invoke-virtual {p1}, LTM1;->L()LWM1;

    move-result-object p1

    invoke-virtual {p1}, LWM1;->K()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, LRc1;-><init>(Lk12;LVE2;I)V

    return-object v0
.end method
