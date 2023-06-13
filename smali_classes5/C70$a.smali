.class public LC70$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC70;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LtC1$a;LCC1;Ljava/nio/ByteBuffer;I)LtC1;
    .locals 1

    new-instance v0, LtO5;

    invoke-direct {v0, p1, p2, p3, p4}, LtO5;-><init>(LtC1$a;LCC1;Ljava/nio/ByteBuffer;I)V

    return-object v0
.end method
