.class public abstract LlY2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzx2;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x68929dc81c4e557dL


# instance fields
.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LlY2;->b:Ljava/lang/String;

    return-object v0
.end method

.method public readResolve()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    invoke-virtual {p0}, LlY2;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LKx2;->j(Ljava/lang/String;)Lzx2;

    move-result-object v0

    return-object v0
.end method
