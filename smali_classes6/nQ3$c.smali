.class public final LnQ3$c;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LnQ3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r$a<",
        "LnQ3;",
        "LnQ3$c;",
        ">;",
        "LwT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LnQ3;->T()LnQ3;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(LnQ3$a;)V
    .locals 0

    invoke-direct {p0}, LnQ3$c;-><init>()V

    return-void
.end method


# virtual methods
.method public M(LKv5;)LnQ3$c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LnQ3;

    invoke-static {v0, p1}, LnQ3;->V(LnQ3;LKv5;)V

    return-object p0
.end method

.method public N(Ljava/lang/String;)LnQ3$c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->c:Lcom/google/protobuf/r;

    check-cast v0, LnQ3;

    invoke-static {v0, p1}, LnQ3;->U(LnQ3;Ljava/lang/String;)V

    return-object p0
.end method
