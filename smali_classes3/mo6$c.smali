.class public final Lmo6$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmo6;-><init>(Lpo6;Lcom/uber/autodispose/ScopeProvider;Le13;LTn6;Lco/bird/android/model/wire/WireBatch;LfF;Lom3;)V
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
.field public final synthetic g:Lmo6;


# direct methods
.method public constructor <init>(Lmo6;)V
    .locals 0

    iput-object p1, p0, Lmo6$c;->g:Lmo6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lmo6$c;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 2

    iget-object p1, p0, Lmo6$c;->g:Lmo6;

    invoke-static {p1}, Lmo6;->access$getNavigator$p(Lmo6;)Le13;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/BulkScanPurpose;->ADD_TO_BATCH:Lco/bird/android/model/constant/BulkScanPurpose;

    iget-object v1, p0, Lmo6$c;->g:Lmo6;

    invoke-static {v1}, Lmo6;->access$getBatch$p(Lmo6;)Lco/bird/android/model/wire/WireBatch;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Le13;->F3(Lco/bird/android/model/constant/BulkScanPurpose;Lco/bird/android/model/wire/WireBatch;)V

    return-void
.end method
