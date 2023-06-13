.class public final Lpu5$c$a;
.super Ld36;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpu5$c;-><init>(Lpu5;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "pu5$c$a",
        "Ld36;",
        "",
        "s",
        "",
        "start",
        "before",
        "count",
        "",
        "onTextChanged",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Lpu5$c;

.field public final synthetic c:Lpu5;


# direct methods
.method public constructor <init>(Lpu5$c;Lpu5;)V
    .locals 0

    iput-object p1, p0, Lpu5$c$a;->b:Lpu5$c;

    iput-object p2, p0, Lpu5$c$a;->c:Lpu5;

    invoke-direct {p0}, Ld36;-><init>()V

    return-void
.end method


# virtual methods
.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    const-string p2, "s"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lpu5$c$a;->b:Lpu5$c;

    invoke-static {p2}, Lpu5$c;->e(Lpu5$c;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lpu5$c$a;->c:Lpu5;

    invoke-static {p2}, Lpu5;->access$getNotesSubject$p(Lpu5;)Lio/reactivex/subjects/a;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lpu5$c$a;->b:Lpu5$c;

    invoke-virtual {p1}, Lpu5$c;->i()LGf2;

    move-result-object p1

    iget-object p1, p1, LGf2;->b:Lco/bird/android/widget/EditTextBox;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lco/bird/android/widget/EditTextBox;->setError(Z)V

    return-void
.end method
