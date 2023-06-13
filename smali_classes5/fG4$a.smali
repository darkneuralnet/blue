.class public final LfG4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfG4;->writeTo(Ljava/io/OutputStream;)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ljava/io/InputStream;",
        "b",
        "()Ljava/io/InputStream;",
        "com/github/kittinunf/fuel/core/requests/RepeatableBody$writeTo$1$1"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LfG4;

.field public final synthetic h:Ljava/io/ByteArrayInputStream;


# direct methods
.method public constructor <init>(LfG4;Ljava/io/ByteArrayInputStream;)V
    .locals 0

    iput-object p1, p0, LfG4$a;->g:LfG4;

    iput-object p2, p0, LfG4$a;->h:Ljava/io/ByteArrayInputStream;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, LfG4$a;->h:Ljava/io/ByteArrayInputStream;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LfG4$a;->b()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
