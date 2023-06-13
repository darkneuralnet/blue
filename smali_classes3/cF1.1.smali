.class public final LcF1;
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
        "LcF1;",
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
        "co.bird.android.feature.hardcount"
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
        "SMAP\nHardCountAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountAdapterDiff.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,31:1\n18#2:32\n18#2:37\n18#2:42\n18#2:47\n18#2:52\n9#3,4:33\n9#3,4:38\n9#3,4:43\n9#3,4:48\n9#3,4:53\n*S KotlinDebug\n*F\n+ 1 HardCountAdapterDiff.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapterDiff\n*L\n12#1:32\n13#1:37\n14#1:42\n15#1:47\n24#1:52\n12#1:33,4\n13#1:38,4\n14#1:43,4\n15#1:48,4\n24#1:53,4\n*E\n"
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

    sget v1, Lej4;->item_hard_count:I

    const/4 v2, 0x0

    const-string v3, ""

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LqH1;

    if-eqz v0, :cond_0

    move-object v2, p1

    :cond_0
    check-cast v2, LqH1;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, LqH1;->j()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, p1

    goto :goto_0

    :cond_2
    sget v1, Lej4;->item_hard_count_pending_upload:I

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LqH1;

    if-eqz v0, :cond_3

    move-object v2, p1

    :cond_3
    check-cast v2, LqH1;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, LqH1;->j()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_4
    sget v1, Lej4;->item_hard_count_unidentified:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LqH1;

    if-eqz v0, :cond_5

    move-object v2, p1

    :cond_5
    check-cast v2, LqH1;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, LqH1;->j()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_6
    sget v1, Lej4;->item_last_successful_hard_count:I

    if-ne v0, v1, :cond_8

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LqH1;

    if-eqz v0, :cond_7

    move-object v2, p1

    :cond_7
    check-cast v2, LqH1;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, LqH1;->j()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_8
    :goto_0
    return-object v3
.end method

.method public c(LG6;LG6;)Z
    .locals 3

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LqH1;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LqH1;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    check-cast p2, LqH1;

    check-cast p1, LqH1;

    invoke-virtual {p1}, LqH1;->c()Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, LqH1;->c()Ljava/util/Collection;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_2
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method
