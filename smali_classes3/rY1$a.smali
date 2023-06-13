.class public final LrY1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LrY1;->a(Ljava/lang/Class;Landroidx/work/b;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "[",
        "Ljava/io/File;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042,\u0010\u0003\u001a(\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Ljava/io/File;",
        "kotlin.jvm.PlatformType",
        "files",
        "",
        "a",
        "([Ljava/io/File;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LrY1;

.field public final synthetic h:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/c;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Landroidx/work/b;


# direct methods
.method public constructor <init>(LrY1;Ljava/lang/Class;Landroidx/work/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrY1;",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/c;",
            ">;",
            "Landroidx/work/b;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LrY1$a;->g:LrY1;

    iput-object p2, p0, LrY1$a;->h:Ljava/lang/Class;

    iput-object p3, p0, LrY1$a;->i:Landroidx/work/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([Ljava/io/File;)V
    .locals 4

    const-string v0, "files"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LrY1$a;->g:LrY1;

    invoke-static {v0}, LrY1;->access$getWorkManager$p(LrY1;)LZC6;

    move-result-object v0

    iget-object v1, p0, LrY1$a;->h:Ljava/lang/Class;

    iget-object v2, p0, LrY1$a;->i:Landroidx/work/b;

    iget-object v3, p0, LrY1$a;->g:LrY1;

    invoke-static {v3}, LrY1;->access$getDestS3Folder$p(LrY1;)Lco/bird/android/model/Folder;

    move-result-object v3

    invoke-static {p1, v0, v1, v2, v3}, Lyl1;->a([Ljava/io/File;LZC6;Ljava/lang/Class;Landroidx/work/b;Lco/bird/android/model/Folder;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/io/File;

    invoke-virtual {p0, p1}, LrY1$a;->a([Ljava/io/File;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
