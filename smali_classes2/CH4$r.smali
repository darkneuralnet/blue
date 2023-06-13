.class public final LCH4$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCH4;->a(Landroid/content/Intent;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireLocation;",
        "+",
        "Ljava/util/List<",
        "+",
        "Landroid/net/Uri;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireLocation;",
        "kotlin.jvm.PlatformType",
        "",
        "Landroid/net/Uri;",
        "invoke"
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
.field public final synthetic g:LCH4;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LCH4;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LCH4$r;->g:LCH4;

    iput-object p2, p0, LCH4$r;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LCH4$r;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireLocation;",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const-string v0, "photoUris"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LIf6;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    iget-object v1, p0, LCH4$r;->g:LCH4;

    invoke-static {v1}, LCH4;->access$getBirdId$p(LCH4;)Ljava/lang/String;

    move-result-object v2

    const-string p1, "location"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LCH4$r;->g:LCH4;

    invoke-static {p1}, LCH4;->access$getRole$p(LCH4;)Lco/bird/android/model/constant/MapMode;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "role"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p1

    :goto_0
    iget-object p1, p0, LCH4$r;->g:LCH4;

    invoke-static {p1}, LCH4;->access$getType$p(LCH4;)Lco/bird/android/model/ComplaintType;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "type"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, p1

    :goto_1
    iget-object v7, p0, LCH4$r;->h:Ljava/lang/String;

    iget-object p1, p0, LCH4$r;->g:LCH4;

    invoke-static {p1}, LCH4;->access$getSelectedOptions$p(LCH4;)Ljava/util/Set;

    move-result-object v8

    iget-object v9, p0, LCH4$r;->g:LCH4;

    invoke-static {v9}, LCH4;->access$getValueToPropertyMap$p(LCH4;)Ljava/util/Map;

    move-result-object v9

    if-nez v9, :cond_2

    const-string v9, "valueToPropertyMap"

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object v0, v9

    :goto_2
    invoke-virtual {p1, v8, v0}, LCH4;->z(Ljava/util/Set;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {v1 .. v8}, LCH4;->X(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/ComplaintType;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
