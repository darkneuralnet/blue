.class public final LIq0$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIq0;->p(Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;Lco/bird/android/model/persistence/ComplaintResolution;Ljava/util/List;Ljava/util/List;Z)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "LG6;",
        ">;",
        "LH6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "LG6;",
        "adapterItems",
        "LH6;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)LH6;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LIq0;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(LIq0;Z)V
    .locals 0

    iput-object p1, p0, LIq0$f;->g:LIq0;

    iput-boolean p2, p0, LIq0$f;->h:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LH6;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LG6;",
            ">;)",
            "LH6;"
        }
    .end annotation

    const-string v0, "adapterItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG6;

    new-instance v2, LNq5;

    iget-object v1, p0, LIq0$f;->g:LIq0;

    invoke-static {v1}, LIq0;->access$getContext$p(LIq0;)Landroid/content/Context;

    move-result-object v1

    sget v3, Lnl4;->involved_vehicles:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "context.getString(L.string.involved_vehicles)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v3, p0, LIq0$f;->h:Z

    invoke-direct {v2, v1, v3}, LNq5;-><init>(Ljava/lang/String;Z)V

    sget v3, LVi4;->item_complaint_section_header:I

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    new-instance v8, LG6;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LIq0$f;->g:LIq0;

    invoke-static {p1}, LIq0;->access$getContext$p(LIq0;)Landroid/content/Context;

    move-result-object p1

    sget v2, Lnl4;->scan_vehicles:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LIq0$f;->g:LIq0;

    invoke-static {p1}, LIq0;->access$getContext$p(LIq0;)Landroid/content/Context;

    move-result-object p1

    sget v2, Lnl4;->scan_more_vehicles:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v3, p1

    sget v4, LVi4;->item_scan_vehicles:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, LH6;

    invoke-direct {p1, v1, v0, v8}, LH6;-><init>(Ljava/util/List;LG6;LG6;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LIq0$f;->a(Ljava/util/List;)LH6;

    move-result-object p1

    return-object p1
.end method
