.class public final Lqj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Leg;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/persistence/announcements/AnnouncementDatabase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/announcements/AnnouncementDatabase;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqj;->a:Lhj;

    iput-object p2, p0, Lqj;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)Lqj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/announcements/AnnouncementDatabase;",
            ">;)",
            "Lqj;"
        }
    .end annotation

    new-instance v0, Lqj;

    invoke-direct {v0, p0, p1}, Lqj;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Lco/bird/android/persistence/announcements/AnnouncementDatabase;)Leg;
    .locals 0

    invoke-virtual {p0, p1}, Lhj;->i(Lco/bird/android/persistence/announcements/AnnouncementDatabase;)Leg;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Leg;

    return-object p0
.end method


# virtual methods
.method public b()Leg;
    .locals 2

    iget-object v0, p0, Lqj;->a:Lhj;

    iget-object v1, p0, Lqj;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/persistence/announcements/AnnouncementDatabase;

    invoke-static {v0, v1}, Lqj;->c(Lhj;Lco/bird/android/persistence/announcements/AnnouncementDatabase;)Leg;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqj;->b()Leg;

    move-result-object v0

    return-object v0
.end method
