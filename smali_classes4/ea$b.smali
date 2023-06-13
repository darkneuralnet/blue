.class public Lea$b;
.super Lbf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbf1<",
        "Lco/bird/android/model/persistence/AnalyticsEntity;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lea;


# direct methods
.method public constructor <init>(Lea;LEb5;)V
    .locals 0

    iput-object p1, p0, Lea$b;->d:Lea;

    invoke-direct {p0, p2}, Lbf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `analytics` WHERE `id` = ?"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/AnalyticsEntity;

    invoke-virtual {p0, p1, p2}, Lea$b;->m(LqV5;Lco/bird/android/model/persistence/AnalyticsEntity;)V

    return-void
.end method

.method public m(LqV5;Lco/bird/android/model/persistence/AnalyticsEntity;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/AnalyticsEntity;->getId()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x1

    invoke-interface {p1, p2, v0, v1}, LoV5;->S0(IJ)V

    return-void
.end method
