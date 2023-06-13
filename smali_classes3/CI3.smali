.class public final LCI3;
.super LxE;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006J\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006J\u0006\u0010\t\u001a\u00020\u0004R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "LCI3;",
        "LxE;",
        "Lco/bird/android/model/wire/WirePart;",
        "part",
        "",
        "Pl",
        "Lio/reactivex/Observable;",
        "f",
        "d",
        "dismiss",
        "Lb00;",
        "b",
        "Lb00;",
        "binding",
        "Landroid/content/DialogInterface;",
        "c",
        "Landroid/content/DialogInterface;",
        "dialog",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lb00;Landroid/content/DialogInterface;)V",
        "repair_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lb00;

.field public final c:Landroid/content/DialogInterface;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lb00;Landroid/content/DialogInterface;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dialog"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LCI3;->b:Lb00;

    iput-object p3, p0, LCI3;->c:Landroid/content/DialogInterface;

    return-void
.end method


# virtual methods
.method public final Pl(Lco/bird/android/model/wire/WirePart;)V
    .locals 7

    const-string v0, "part"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCI3;->b:Lb00;

    iget-object v0, v0, Lb00;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->repair_id_tools_confirmation_title:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePart;->getKind()Lco/bird/android/model/constant/PartKind;

    move-result-object v4

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v5

    invoke-static {v4, v5}, LfI3;->a(Lco/bird/android/model/constant/PartKind;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePart;->getKey()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LCI3;->b:Lb00;

    iget-object v0, v0, Lb00;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->repair_id_tools_confirmation_instruction:I

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePart;->getKind()Lco/bird/android/model/constant/PartKind;

    move-result-object p1

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v4

    invoke-static {p1, v4}, LfI3;->a(Lco/bird/android/model/constant/PartKind;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final d()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LCI3;->b:Lb00;

    iget-object v0, v0, Lb00;->b:Landroid/widget/Button;

    const-string v1, "binding.cancel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final dismiss()V
    .locals 1

    iget-object v0, p0, LCI3;->c:Landroid/content/DialogInterface;

    invoke-interface {v0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public final f()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LCI3;->b:Lb00;

    iget-object v0, v0, Lb00;->c:Landroid/widget/Button;

    const-string v1, "binding.confirm"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
