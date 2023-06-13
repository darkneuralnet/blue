.class public final Lvk1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luk1;


# instance fields
.field public final a:Lwk1;


# direct methods
.method public constructor <init>(Lwk1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvk1;->a:Lwk1;

    return-void
.end method

.method public static b(Lwk1;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwk1;",
            ")",
            "LY94<",
            "Luk1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lvk1;

    invoke-direct {v0, p0}, Lvk1;-><init>(Lwk1;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)Lgk1;
    .locals 1

    iget-object v0, p0, Lvk1;->a:Lwk1;

    invoke-virtual {v0, p1, p2, p3}, Lwk1;->b(LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)Lgk1;

    move-result-object p1

    return-object p1
.end method
