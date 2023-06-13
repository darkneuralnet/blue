.class public final Lcom/google/protobuf/e$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# instance fields
.field public final a:Lcom/google/protobuf/CodedOutputStream;

.field public final b:[B


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/protobuf/e$h;->b:[B

    invoke-static {p1}, Lcom/google/protobuf/CodedOutputStream;->c0([B)Lcom/google/protobuf/CodedOutputStream;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/e$h;->a:Lcom/google/protobuf/CodedOutputStream;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/google/protobuf/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/protobuf/e$h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/protobuf/e;
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/e$h;->a:Lcom/google/protobuf/CodedOutputStream;

    invoke-virtual {v0}, Lcom/google/protobuf/CodedOutputStream;->c()V

    new-instance v0, Lcom/google/protobuf/e$j;

    iget-object v1, p0, Lcom/google/protobuf/e$h;->b:[B

    invoke-direct {v0, v1}, Lcom/google/protobuf/e$j;-><init>([B)V

    return-object v0
.end method

.method public b()Lcom/google/protobuf/CodedOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/e$h;->a:Lcom/google/protobuf/CodedOutputStream;

    return-object v0
.end method
