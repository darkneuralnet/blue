.class public final Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/reactivex/Observable<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;",
        "",
        "b",
        "()Lio/reactivex/Observable;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$j;->g:Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$j;->g:Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;

    invoke-static {v0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;->access$getAdapter$p(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)Lyq0;

    move-result-object v0

    invoke-virtual {v0}, Lyq0;->x()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity$j;->b()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
