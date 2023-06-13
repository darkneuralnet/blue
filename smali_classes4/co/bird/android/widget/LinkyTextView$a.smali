.class public final Lco/bird/android/widget/LinkyTextView$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/LinkyTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ%\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/widget/LinkyTextView$a;",
        "",
        "Landroid/text/style/URLSpan;",
        "urlSpan",
        "Lio/reactivex/subjects/d;",
        "",
        "clickSubject",
        "Landroid/text/style/ClickableSpan;",
        "a",
        "(Landroid/text/style/URLSpan;Lio/reactivex/subjects/d;)Landroid/text/style/ClickableSpan;",
        "Lkotlin/text/Regex;",
        "BUTTON_LINK_REGEX",
        "Lkotlin/text/Regex;",
        "<init>",
        "()V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/widget/LinkyTextView$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/text/style/URLSpan;Lio/reactivex/subjects/d;)Landroid/text/style/ClickableSpan;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/style/URLSpan;",
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroid/text/style/ClickableSpan;"
        }
    .end annotation

    const-string v0, "urlSpan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clickSubject"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lco/bird/android/widget/LinkyTextView;->access$getBUTTON_LINK_REGEX$cp()Lkotlin/text/Regex;

    move-result-object v0

    invoke-virtual {p1}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v1

    const-string v2, "urlSpan.url"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v1, v5, v3, v4}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Lco/bird/android/widget/LinkyTextView$a$a;

    invoke-direct {p1, p2, v0}, Lco/bird/android/widget/LinkyTextView$a$a;-><init>(Lio/reactivex/subjects/d;Lkotlin/text/MatchResult;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lco/bird/android/widget/URLSpanNoUnderline;

    invoke-virtual {p1}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lco/bird/android/widget/URLSpanNoUnderline;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    :goto_0
    return-object p1
.end method
