.class public final Lco/bird/android/vehiclescanner/common/mrp/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/vehiclescanner/common/mrp/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseScanRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseScanRenderer.kt\nco/bird/android/vehiclescanner/common/mrp/BaseScanRenderer$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"
    }
.end annotation


# direct methods
.method public static a(Lco/bird/android/vehiclescanner/common/mrp/a;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Lco/bird/android/vehiclescanner/common/mrp/a<",
            "TS;>;TS;)V"
        }
    .end annotation

    instance-of v0, p1, LIx5;

    if-eqz v0, :cond_7

    check-cast p1, LIx5;

    invoke-interface {p1}, LIx5;->c()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lco/bird/android/vehiclescanner/common/mrp/a;->w1()LRk5;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v0}, LRk5;->gm(Z)V

    :cond_0
    invoke-interface {p1}, LIx5;->g()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lco/bird/android/vehiclescanner/common/mrp/a;->w1()LRk5;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v0}, LRk5;->hm(Z)V

    :cond_1
    invoke-interface {p1}, LIx5;->j()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Lco/bird/android/vehiclescanner/common/mrp/a;->w1()LRk5;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v0}, LRk5;->im(Z)V

    :cond_2
    invoke-interface {p1}, LIx5;->e()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Lco/bird/android/vehiclescanner/common/mrp/a;->w1()LRk5;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v0}, LRk5;->sm(Z)V

    :cond_3
    invoke-interface {p1}, LIx5;->h()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Lco/bird/android/vehiclescanner/common/mrp/a;->w1()LRk5;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v0}, LRk5;->vm(Z)V

    :cond_4
    invoke-interface {p1}, LIx5;->k()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Lco/bird/android/vehiclescanner/common/mrp/a;->w1()LRk5;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v0}, LRk5;->tm(Z)V

    :cond_5
    invoke-interface {p1}, LIx5;->i()Lco/bird/android/model/constant/PartKind;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Lco/bird/android/vehiclescanner/common/mrp/a;->w1()LRk5;

    move-result-object v1

    invoke-virtual {v1, v0}, LRk5;->rm(Lco/bird/android/model/constant/PartKind;)V

    :cond_6
    invoke-interface {p1}, LIx5;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p0}, Lco/bird/android/vehiclescanner/common/mrp/a;->w1()LRk5;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, LRk5;->setInstructions$default(LRk5;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_7
    return-void
.end method
