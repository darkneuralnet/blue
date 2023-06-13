.class public final Ld85;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc85;


# instance fields
.field public final a:Le85;


# direct methods
.method public constructor <init>(Le85;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld85;->a:Le85;

    return-void
.end method

.method public static b(Le85;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le85;",
            ")",
            "LY94<",
            "Lc85;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld85;

    invoke-direct {v0, p0}, Ld85;-><init>(Le85;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/model/FlightBannerNode$RiderBarType;Landroid/view/View;Z)Lb85;
    .locals 1

    iget-object v0, p0, Ld85;->a:Le85;

    invoke-virtual {v0, p1, p2, p3}, Le85;->b(Lco/bird/android/model/FlightBannerNode$RiderBarType;Landroid/view/View;Z)Lb85;

    move-result-object p1

    return-object p1
.end method
