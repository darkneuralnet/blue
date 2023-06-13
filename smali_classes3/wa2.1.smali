.class public final Lwa2;
.super LxE;
.source "SourceFile"

# interfaces
.implements Lva2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwa2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u001e\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008$\u0010%J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0016J\u0010\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0018\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00040\u00040\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006&"
    }
    d2 = {
        "Lwa2;",
        "LxE;",
        "Lva2;",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/IssueStatus;",
        "P",
        "",
        "m0",
        "status",
        "mh",
        "",
        "enabled",
        "ri",
        "visible",
        "Vf",
        "A7",
        "La4;",
        "b",
        "La4;",
        "binding",
        "Lio/reactivex/subjects/a;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lio/reactivex/subjects/a;",
        "statusSubject",
        "",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView;",
        "d",
        "[Lco/bird/android/widget/standardcomponents/CheckableItemView;",
        "checkableItems",
        "wa2$b",
        "e",
        "Lwa2$b;",
        "checkListener",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;La4;)V",
        "repair_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIssueStatusUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueStatusUi.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusUiImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,83:1\n13579#2,2:84\n*S KotlinDebug\n*F\n+ 1 IssueStatusUi.kt\nco/bird/android/feature/repair/v1/issuestatus/IssueStatusUiImpl\n*L\n52#1:84,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:La4;

.field public final c:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/model/IssueStatus;",
            ">;"
        }
    .end annotation
.end field

.field public final d:[Lco/bird/android/widget/standardcomponents/CheckableItemView;

.field public final e:Lwa2$b;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;La4;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, Lwa2;->b:La4;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string v0, "create<IssueStatus>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwa2;->c:Lio/reactivex/subjects/a;

    const/4 p1, 0x3

    new-array p1, p1, [Lco/bird/android/widget/standardcomponents/CheckableItemView;

    iget-object v0, p2, La4;->d:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    const/4 v0, 0x1

    iget-object v2, p2, La4;->c:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    aput-object v2, p1, v0

    const/4 v0, 0x2

    iget-object p2, p2, La4;->b:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    aput-object p2, p1, v0

    iput-object p1, p0, Lwa2;->d:[Lco/bird/android/widget/standardcomponents/CheckableItemView;

    new-instance p2, Lwa2$b;

    invoke-direct {p2, p0}, Lwa2$b;-><init>(Lwa2;)V

    iput-object p2, p0, Lwa2;->e:Lwa2$b;

    array-length p2, p1

    move v0, v1

    :goto_0
    if-ge v0, p2, :cond_0

    aget-object v2, p1, v0

    invoke-virtual {v2, v1}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setCanUncheck(Z)V

    iget-object v3, p0, Lwa2;->e:Lwa2$b;

    invoke-virtual {v2, v3}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setOnCheckChangedListener(Lco/bird/android/widget/standardcomponents/CheckableItemView$b;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final synthetic access$getBinding$p(Lwa2;)La4;
    .locals 0

    iget-object p0, p0, Lwa2;->b:La4;

    return-object p0
.end method

.method public static final synthetic access$getCheckableItems$p(Lwa2;)[Lco/bird/android/widget/standardcomponents/CheckableItemView;
    .locals 0

    iget-object p0, p0, Lwa2;->d:[Lco/bird/android/widget/standardcomponents/CheckableItemView;

    return-object p0
.end method

.method public static final synthetic access$getStatusSubject$p(Lwa2;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lwa2;->c:Lio/reactivex/subjects/a;

    return-object p0
.end method


# virtual methods
.method public A7(Z)V
    .locals 4

    iget-object v0, p0, Lwa2;->b:La4;

    iget-object v0, v0, La4;->b:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    const-string v1, "binding.dispute"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public P()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/IssueStatus;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwa2;->c:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "statusSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public Vf(Z)V
    .locals 4

    iget-object v0, p0, Lwa2;->b:La4;

    iget-object v0, v0, La4;->d:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    const-string v1, "binding.resolve"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public m0()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwa2;->b:La4;

    iget-object v0, v0, La4;->e:Landroid/widget/Button;

    const-string v1, "binding.update"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public mh(Lco/bird/android/model/IssueStatus;)V
    .locals 2

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwa2$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lwa2;->b:La4;

    iget-object p1, p1, La4;->b:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    invoke-virtual {p1, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setChecked(Z)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lwa2;->b:La4;

    iget-object p1, p1, La4;->c:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    invoke-virtual {p1, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setChecked(Z)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lwa2;->b:La4;

    iget-object p1, p1, La4;->d:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    invoke-virtual {p1, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setChecked(Z)V

    :goto_0
    return-void
.end method

.method public ri(Z)V
    .locals 1

    iget-object v0, p0, Lwa2;->b:La4;

    iget-object v0, v0, La4;->e:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
