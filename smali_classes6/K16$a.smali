.class public LK16$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK16$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK16;->b(Lcom/google/crypto/tink/shaded/protobuf/g;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/crypto/tink/shaded/protobuf/g;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/g;)V
    .locals 0

    iput-object p1, p0, LK16$a;->a:Lcom/google/crypto/tink/shaded/protobuf/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)B
    .locals 1

    iget-object v0, p0, LK16$a;->a:Lcom/google/crypto/tink/shaded/protobuf/g;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->b(I)B

    move-result p1

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LK16$a;->a:Lcom/google/crypto/tink/shaded/protobuf/g;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v0

    return v0
.end method
