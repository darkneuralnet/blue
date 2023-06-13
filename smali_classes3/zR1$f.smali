.class public final LzR1$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LzR1;->C0(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/constant/PartKind;)V
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
        "Lco/bird/android/model/constant/PartKind;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0008\u001ar\u00122\u0008\u0001\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007*8\u00122\u0008\u0001\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "",
        "Lco/bird/android/model/constant/PartKind;",
        "it",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "LH6;",
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/util/List;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LzR1;


# direct methods
.method public constructor <init>(LzR1;)V
    .locals 0

    iput-object p1, p0, LzR1$f;->g:LzR1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LzR1$f;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/PartKind;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LzR1$f;->g:LzR1;

    invoke-static {p1}, LzR1;->access$getStatusConverter$p(LzR1;)LtQ1;

    move-result-object p1

    iget-object v0, p0, LzR1$f;->g:LzR1;

    invoke-static {v0}, LzR1;->access$getOption(LzR1;)Lco/bird/android/model/IdToolOption;

    move-result-object v0

    invoke-interface {p1, v0}, LtQ1;->c(Lco/bird/android/model/IdToolOption;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LzR1$f$a;->g:LzR1$f$a;

    new-instance v1, LDR1;

    invoke-direct {v1, v0}, LDR1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LzR1$f;->b(Ljava/util/List;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
