.class public final Lbn5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lbn5;",
        "LF6;",
        "LG6;",
        "adapterItem",
        "",
        "b",
        "oldItem",
        "newItem",
        "",
        "c",
        "<init>",
        "()V",
        "co.bird.android.feature.scrap"
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
        "SMAP\nScrapAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapterDiff.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,36:1\n18#2:37\n18#2:42\n18#2:47\n18#2:52\n9#3,4:38\n9#3,4:43\n9#3,4:48\n9#3,4:53\n*S KotlinDebug\n*F\n+ 1 ScrapAdapterDiff.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapterDiff\n*L\n13#1:37\n14#1:42\n25#1:47\n29#1:52\n13#1:38,4\n14#1:43,4\n25#1:48,4\n29#1:53,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Ljava/util/List<",
            "LH6;",
            ">;)",
            "Landroidx/recyclerview/widget/h$e;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LF6$a;->a(LF6;Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;

    move-result-object p1

    return-object p1
.end method

.method public b(LG6;)Ljava/lang/String;
    .locals 4

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, LLj4;->item_scrap_header:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v2, p1

    :cond_0
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v2

    goto :goto_0

    :cond_2
    sget v1, LLj4;->item_scrap_reason:I

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LHp5;

    if-eqz v0, :cond_3

    move-object v2, p1

    :cond_3
    check-cast v2, LHp5;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, LHp5;->d()Lco/bird/android/model/constant/ScrapRequestReason;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    move-object v3, p1

    goto :goto_0

    :cond_5
    sget p1, LLj4;->item_scrap_image_upload_bar:I

    if-ne v0, p1, :cond_6

    const-string v3, "image_upload_bar"

    goto :goto_0

    :cond_6
    sget p1, LLj4;->item_scrap_details:I

    if-ne v0, p1, :cond_7

    const-string v3, "scrap_details"

    :cond_7
    :goto_0
    return-object v3
.end method

.method public c(LG6;LG6;)Z
    .locals 4

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LHp5;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LHp5;

    if-eqz v0, :cond_0

    move-object v1, p2

    :cond_0
    check-cast v1, LHp5;

    if-eqz v1, :cond_1

    check-cast p1, LHp5;

    invoke-virtual {p1}, LHp5;->e()Z

    move-result p1

    invoke-virtual {v1}, LHp5;->e()Z

    move-result p2

    if-ne p1, p2, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v3

    :goto_0
    if-nez p1, :cond_4

    goto :goto_1

    :cond_2
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_3

    move-object v1, p2

    :cond_3
    check-cast v1, Ljava/util/List;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    move v2, v3

    :goto_1
    return v2
.end method
