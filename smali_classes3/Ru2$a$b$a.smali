.class public final LRu2$a$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRu2$a$b;->a(LHJ6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/text/Editable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroid/text/Editable;",
        "text",
        "",
        "a",
        "(Landroid/text/Editable;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLocalHostAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$HostViewHolder$2$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,101:1\n18#2:102\n9#3,4:103\n*S KotlinDebug\n*F\n+ 1 LocalHostAdapter.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapter$HostViewHolder$2$1\n*L\n81#1:102\n81#1:103,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LRu2$a;

.field public final synthetic h:LRu2;


# direct methods
.method public constructor <init>(LRu2$a;LRu2;)V
    .locals 0

    iput-object p1, p0, LRu2$a$b$a;->g:LRu2$a;

    iput-object p2, p0, LRu2$a$b$a;->h:LRu2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/text/Editable;)V
    .locals 3

    iget-object v0, p0, LRu2$a$b$a;->g:LRu2$a;

    invoke-static {v0}, LRu2$a;->a(LRu2$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LRu2$a$b$a;->h:LRu2;

    invoke-static {v0}, LRu2;->access$getAdapterData(LRu2;)LE6;

    move-result-object v0

    iget-object v1, p0, LRu2$a$b$a;->g:LRu2$a;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result v1

    invoke-virtual {v0, v1}, LE6;->e(I)LG6;

    move-result-object v0

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LgN1;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    check-cast v0, LgN1;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LgN1;->c()LfN1;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, LRu2$a$b$a;->h:LRu2;

    invoke-static {v1}, LRu2;->access$getHostPortChangesRelay$p(LRu2;)Lma4;

    move-result-object v1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    :cond_3
    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v1, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/text/Editable;

    invoke-virtual {p0, p1}, LRu2$a$b$a;->a(Landroid/text/Editable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
