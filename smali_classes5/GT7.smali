.class public abstract LGT7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "LGT7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "LsT7<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "Ldj8;"
    }
.end annotation


# instance fields
.field protected zzb:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LGT7;->zzb:I

    return-void
.end method


# virtual methods
.method public b(LDo8;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final y()LgZ7;
    .locals 5

    :try_start_0
    invoke-interface {p0}, Ldj8;->l()I

    move-result v0

    sget-object v1, LgZ7;->c:LgZ7;

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lr18;->a([BII)Lr18;

    move-result-object v0

    invoke-interface {p0, v0}, Ldj8;->z(Lr18;)V

    invoke-virtual {v0}, Lr18;->b()V

    new-instance v0, LoX7;

    invoke-direct {v0, v1}, LoX7;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Serializing "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to a ByteString threw an IOException (should never happen)."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
