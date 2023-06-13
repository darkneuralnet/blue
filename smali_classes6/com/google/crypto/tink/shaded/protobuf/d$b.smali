.class public final Lcom/google/crypto/tink/shaded/protobuf/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public final d:Lcom/google/crypto/tink/shaded/protobuf/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/d$b;->d:Lcom/google/crypto/tink/shaded/protobuf/m;

    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/d$b;->d:Lcom/google/crypto/tink/shaded/protobuf/m;

    return-void
.end method
