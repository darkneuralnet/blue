.class public final LY96$b;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements LwT2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY96;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/r$a<",
        "LY96;",
        "LY96$b;",
        ">;",
        "LwT2;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LY96;->T()LY96;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(LY96$a;)V
    .locals 0

    invoke-direct {p0}, LY96$b;-><init>()V

    return-void
.end method
