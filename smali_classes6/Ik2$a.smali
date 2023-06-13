.class public LIk2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/v$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/crypto/tink/shaded/protobuf/v$d<",
        "LIk2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)LIk2;
    .locals 0

    invoke-static {p1}, LIk2;->a(I)LIk2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic findValueByNumber(I)Lcom/google/crypto/tink/shaded/protobuf/v$c;
    .locals 0

    invoke-virtual {p0, p1}, LIk2$a;->a(I)LIk2;

    move-result-object p1

    return-object p1
.end method
