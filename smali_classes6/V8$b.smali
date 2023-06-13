.class public final LV8$b;
.super Lcom/google/crypto/tink/shaded/protobuf/t$a;
.source "SourceFile"

# interfaces
.implements LxT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/t$a<",
        "LV8;",
        "LV8$b;",
        ">;",
        "LxT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LV8;->F()LV8;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method public synthetic constructor <init>(LV8$a;)V
    .locals 0

    invoke-direct {p0}, LV8$b;-><init>()V

    return-void
.end method


# virtual methods
.method public y(Lcom/google/crypto/tink/shaded/protobuf/g;)LV8$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, LV8;

    invoke-static {v0, p1}, LV8;->H(LV8;Lcom/google/crypto/tink/shaded/protobuf/g;)V

    return-object p0
.end method

.method public z(I)LV8$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/t$a;->o()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/t$a;->c:Lcom/google/crypto/tink/shaded/protobuf/t;

    check-cast v0, LV8;

    invoke-static {v0, p1}, LV8;->G(LV8;I)V

    return-object p0
.end method
