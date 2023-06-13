.class public final LzB1;
.super LSa6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LSa6<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "LzB1;",
        "",
        "T",
        "LSa6;",
        "Lkotlin/reflect/KType;",
        "d",
        "Lkotlin/reflect/KType;",
        "h",
        "()Lkotlin/reflect/KType;",
        "i",
        "(Lkotlin/reflect/KType;)V",
        "type",
        "ktype",
        "<init>",
        "()V",
        "config_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public d:Lkotlin/reflect/KType;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LSa6;-><init>()V

    return-void
.end method


# virtual methods
.method public d()Lkotlin/reflect/KType;
    .locals 1

    invoke-virtual {p0}, LzB1;->h()Lkotlin/reflect/KType;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lkotlin/reflect/KType;
    .locals 1

    iget-object v0, p0, LzB1;->d:Lkotlin/reflect/KType;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "type"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i(Lkotlin/reflect/KType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LzB1;->d:Lkotlin/reflect/KType;

    return-void
.end method
