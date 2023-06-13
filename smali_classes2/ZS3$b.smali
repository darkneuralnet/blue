.class public final LZS3$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZS3;->a(Lco/bird/android/model/wire/WirePhysicalLock;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LZS3;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZS3;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZS3;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LZS3$b;->g:LZS3;

    iput-object p2, p0, LZS3$b;->h:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LZS3$b;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 1

    iget-object p1, p0, LZS3$b;->g:LZS3;

    invoke-static {p1}, LZS3;->access$getUi$p(LZS3;)LdT3;

    move-result-object p1

    invoke-interface {p1}, LdT3;->l4()I

    move-result p1

    iget-object v0, p0, LZS3$b;->h:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LZS3$b;->g:LZS3;

    invoke-static {p1}, LZS3;->access$getDoneEvents$p(LZS3;)Lma4;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LZS3$b;->g:LZS3;

    invoke-static {p1}, LZS3;->access$getUi$p(LZS3;)LdT3;

    move-result-object p1

    iget-object v0, p0, LZS3$b;->g:LZS3;

    invoke-static {v0}, LZS3;->access$getUi$p(LZS3;)LdT3;

    move-result-object v0

    invoke-interface {v0}, LdT3;->l4()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, LdT3;->N3(I)V

    :goto_0
    return-void
.end method
