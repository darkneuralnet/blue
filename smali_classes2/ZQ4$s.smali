.class public final LZQ4$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZQ4;->X()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/graphics/Bitmap;",
        "Lio/reactivex/K<",
        "+",
        "LZQ4$a;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "Lio/reactivex/K;",
        "LZQ4$a;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Landroid/graphics/Bitmap;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZQ4;


# direct methods
.method public constructor <init>(LZQ4;)V
    .locals 0

    iput-object p1, p0, LZQ4$s;->g:LZQ4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LZQ4$a;
    .locals 0

    invoke-static {p0, p1}, LZQ4$s;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LZQ4$a;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LZQ4$a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LZQ4$a;

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/graphics/Bitmap;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LZQ4$a;",
            ">;"
        }
    .end annotation

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZQ4$s;->g:LZQ4;

    invoke-static {v0, p1}, LZQ4;->access$saveImageToDisk(LZQ4;Landroid/graphics/Bitmap;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LZQ4$s$a;

    invoke-direct {v1, p1}, LZQ4$s$a;-><init>(Landroid/graphics/Bitmap;)V

    new-instance p1, LcR4;

    invoke-direct {p1, v1}, LcR4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, LZQ4$s;->b(Landroid/graphics/Bitmap;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
