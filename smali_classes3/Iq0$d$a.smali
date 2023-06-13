.class public final LIq0$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIq0$d;->b(Ljava/util/List;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
        "Lio/reactivex/K<",
        "+",
        "LH6;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
        "field",
        "Lio/reactivex/K;",
        "LH6;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;)Lio/reactivex/K;"
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

.field public final synthetic h:Lco/bird/android/model/persistence/ComplaintResolution;

.field public final synthetic i:Lco/bird/android/model/persistence/ComplaintResolutionForm;


# direct methods
.method public constructor <init>(LIq0;Lco/bird/android/model/persistence/ComplaintResolution;Lco/bird/android/model/persistence/ComplaintResolutionForm;)V
    .locals 0

    iput-object p1, p0, LIq0$d$a;->g:LIq0;

    iput-object p2, p0, LIq0$d$a;->h:Lco/bird/android/model/persistence/ComplaintResolution;

    iput-object p3, p0, LIq0$d$a;->i:Lco/bird/android/model/persistence/ComplaintResolutionForm;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;)Lio/reactivex/K;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LIq0$d$a;->g:LIq0;

    iget-object v3, p0, LIq0$d$a;->h:Lco/bird/android/model/persistence/ComplaintResolution;

    iget-object v0, p0, LIq0$d$a;->i:Lco/bird/android/model/persistence/ComplaintResolutionForm;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getIssueOptions()Ljava/util/List;

    move-result-object v4

    iget-object v0, p0, LIq0$d$a;->i:Lco/bird/android/model/persistence/ComplaintResolutionForm;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getActionTakenOptions()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x1

    move-object v2, p1

    invoke-static/range {v1 .. v6}, LIq0;->access$toAdapterSection(LIq0;Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;Lco/bird/android/model/persistence/ComplaintResolution;Ljava/util/List;Ljava/util/List;Z)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;

    invoke-virtual {p0, p1}, LIq0$d$a;->a(Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
