.class public final LIq0$g;
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
        "Lco/bird/android/model/persistence/Bird;",
        ">;",
        "Ljava/util/List<",
        "+",
        "LG6;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/Bird;",
        "vehiclesInvolved",
        "LG6;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Ljava/util/List;"
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
        "SMAP\nComplaintResolutionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$toAdapterSection$vehiclesInvolvedSingle$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n1549#2:289\n1620#2,3:290\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionConverter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionConverter$toAdapterSection$vehiclesInvolvedSingle$2\n*L\n235#1:289\n235#1:290,3\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LIq0$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LIq0$g;

    invoke-direct {v0}, LIq0$g;-><init>()V

    sput-object v0, LIq0$g;->g:LIq0$g;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;)",
            "Ljava/util/List<",
            "LG6;",
            ">;"
        }
    .end annotation

    const-string v0, "vehiclesInvolved"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/persistence/Bird;

    new-instance v1, LG6;

    sget v4, LVi4;->item_complaint_vehicle_involved:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LIq0$g;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method