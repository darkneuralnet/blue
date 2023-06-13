.class public final LHA3$f;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHA3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LHA3$f;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lmd2;",
        "b",
        "Lmd2;",
        "binding",
        "LfM2;",
        "c",
        "LfM2;",
        "marker",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LHA3;Landroid/view/View;)V",
        "ownedbirds_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$LocationViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n1#4:354\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$LocationViewHolder\n*L\n229#1:349\n229#1:350,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lmd2;

.field public c:LfM2;

.field public final synthetic d:LHA3;


# direct methods
.method public constructor <init>(LHA3;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LHA3$f;->d:LHA3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lmd2;->a(Landroid/view/View;)Lmd2;

    move-result-object p1

    const-string v0, "bind(view)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LHA3$f;->b:Lmd2;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, LbM2;->a(Landroid/content/Context;)I

    iget-object p1, p1, Lmd2;->e:Lcom/google/android/gms/maps/MapView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/maps/MapView;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic a(LHA3$f;Lcom/google/android/gms/maps/model/LatLng;LcD1;)V
    .locals 0

    invoke-static {p0, p1, p2}, LHA3$f;->b(LHA3$f;Lcom/google/android/gms/maps/model/LatLng;LcD1;)V

    return-void
.end method

.method public static final b(LHA3$f;Lcom/google/android/gms/maps/model/LatLng;LcD1;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$latLng"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LHA3$f;->c:LfM2;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    sget v1, Lfg4;->marker_my_bird:I

    invoke-static {v1}, LQT;->b(I)LPT;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    const v2, 0x3f63d70a    # 0.89f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p2, v0}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v0

    iput-object v0, p0, LHA3$f;->c:LfM2;

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_0
    const/high16 p0, 0x41780000    # 15.5f

    invoke-static {p1, p0}, Lrc0;->e(Lcom/google/android/gms/maps/model/LatLng;F)Lqc0;

    move-result-object p0

    invoke-virtual {p2, p0}, LcD1;->f(Lqc0;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    iget-object v0, p0, LHA3$f;->d:LHA3;

    invoke-static {v0}, LHA3;->access$getAdapterData(LHA3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LZL;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LZL;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LZL;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LZL;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LZL;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    iget-object v2, p0, LHA3$f;->b:Lmd2;

    iget-object v2, v2, Lmd2;->b:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LHA3$f;->b:Lmd2;

    iget-object v0, v0, Lmd2;->e:Lcom/google/android/gms/maps/MapView;

    new-instance v1, LMA3;

    invoke-direct {v1, p0, p1}, LMA3;-><init>(LHA3$f;Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/MapView;->a(LUg3;)V

    :cond_1
    return-void
.end method
