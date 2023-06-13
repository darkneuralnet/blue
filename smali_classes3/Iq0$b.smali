.class public final LIq0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIq0;->j(Lco/bird/android/model/persistence/ComplaintResolutionForm;Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/F;
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
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "LH6;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001ab\u0012*\u0008\u0001\u0012&\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0004 \u0006*0\u0012*\u0008\u0001\u0012&\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
        "fields",
        "Lio/reactivex/K;",
        "",
        "LH6;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nComplaintResolutionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$convertNonRequiredForm$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n766#2:289\n857#2,2:290\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$convertNonRequiredForm$1\n*L\n128#1:289\n128#1:290,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LIq0;

.field public final synthetic h:Lco/bird/android/model/persistence/ComplaintResolution;

.field public final synthetic i:Lco/bird/android/model/persistence/ComplaintResolutionForm;


# direct methods
.method public constructor <init>(LIq0;Lco/bird/android/model/persistence/ComplaintResolution;Lco/bird/android/model/persistence/ComplaintResolutionForm;)V
    .locals 0

    iput-object p1, p0, LIq0$b;->g:LIq0;

    iput-object p2, p0, LIq0$b;->h:Lco/bird/android/model/persistence/ComplaintResolution;

    iput-object p3, p0, LIq0$b;->i:Lco/bird/android/model/persistence/ComplaintResolutionForm;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LIq0$b;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "fields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;->getRequired()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;->getField()Lco/bird/android/model/constant/ComplaintResolutionField;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/ComplaintResolutionField;->BEFORE_PHOTO:Lco/bird/android/model/constant/ComplaintResolutionField;

    if-eq v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LIq0$b$a;

    iget-object v1, p0, LIq0$b;->g:LIq0;

    iget-object v2, p0, LIq0$b;->h:Lco/bird/android/model/persistence/ComplaintResolution;

    iget-object v3, p0, LIq0$b;->i:Lco/bird/android/model/persistence/ComplaintResolutionForm;

    invoke-direct {v0, v1, v2, v3}, LIq0$b$a;-><init>(LIq0;Lco/bird/android/model/persistence/ComplaintResolution;Lco/bird/android/model/persistence/ComplaintResolutionForm;)V

    new-instance v1, LJq0;

    invoke-direct {v1, v0}, LJq0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->toList()Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LIq0$b;->b(Ljava/util/List;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
