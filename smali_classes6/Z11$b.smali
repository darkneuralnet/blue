.class public final LZ11$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ11;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LfN4;

.field public final b:LfN4;

.field public final c:I


# direct methods
.method public constructor <init>(LfN4;LfN4;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ11$b;->a:LfN4;

    iput-object p2, p0, LZ11$b;->b:LfN4;

    iput p3, p0, LZ11$b;->c:I

    return-void
.end method

.method public synthetic constructor <init>(LfN4;LfN4;ILZ11$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LZ11$b;-><init>(LfN4;LfN4;I)V

    return-void
.end method


# virtual methods
.method public a()LfN4;
    .locals 1

    iget-object v0, p0, LZ11$b;->a:LfN4;

    return-object v0
.end method

.method public b()LfN4;
    .locals 1

    iget-object v0, p0, LZ11$b;->b:LfN4;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LZ11$b;->c:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LZ11$b;->a:LfN4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LZ11$b;->b:LfN4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, LZ11$b;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
