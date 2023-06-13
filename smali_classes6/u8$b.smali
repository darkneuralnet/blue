.class public final Lu8$b;
.super Lcom/google/crypto/tink/shaded/protobuf/t$a;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t$a<",
        "Lu8;",
        "Lu8$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lu8;->F()Lu8;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method public synthetic constructor <init>(Lu8$a;)V
    .locals 0

    invoke-direct {p0}, Lu8$b;-><init>()V

    return-void
.end method


# virtual methods
.method public y(I)Lu8$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lu8;

    invoke-static {v0, p1}, Lu8;->G(Lu8;I)V

    return-object p0
.end method

.method public z(Lx8;)Lu8$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, Lu8;

    invoke-static {v0, p1}, Lu8;->H(Lu8;Lx8;)V

    return-object p0
.end method
