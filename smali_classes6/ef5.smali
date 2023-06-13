.class public final Lef5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "ff5",
        "gf5",
        "hf5"
    }
    d2 = {}
    k = 0x4
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    invoke-static {p0, p1}, Lff5;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lff5;->b(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/widget/TextView;)Lu22;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            ")",
            "Lu22<",
            "LX26;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lgf5;->a(Landroid/widget/TextView;)Lu22;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroid/widget/TextView;)Lu22;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            ")",
            "Lu22<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lhf5;->a(Landroid/widget/TextView;)Lu22;

    move-result-object p0

    return-object p0
.end method
