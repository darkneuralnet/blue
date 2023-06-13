.class public Lf43$d;
.super Lbf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf43;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbf1<",
        "Lco/bird/android/model/persistence/NestMarker;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lf43;


# direct methods
.method public constructor <init>(Lf43;LEb5;)V
    .locals 0

    iput-object p1, p0, Lf43$d;->d:Lf43;

    invoke-direct {p0, p2}, Lbf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `nest_markers` WHERE `id` = ?"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/NestMarker;

    invoke-virtual {p0, p1, p2}, Lf43$d;->m(LqV5;Lco/bird/android/model/persistence/NestMarker;)V

    return-void
.end method

.method public m(LqV5;Lco/bird/android/model/persistence/NestMarker;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestMarker;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestMarker;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    return-void
.end method
