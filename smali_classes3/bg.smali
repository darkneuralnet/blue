.class public final Lbg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lbg;",
        "",
        "Lco/bird/android/model/persistence/Announcement;",
        "announcement",
        "",
        "birdCode",
        "",
        "LH6;",
        "a",
        "",
        "unlocking",
        "Landroid/text/SpannableString;",
        "b",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "announcement_release"
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
        "SMAP\nAnnouncementConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementConverter.kt\nco/bird/android/lib/announcement/adapter/AnnouncementConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1549#2:48\n1620#2,2:49\n1622#2:52\n1#3:51\n*S KotlinDebug\n*F\n+ 1 AnnouncementConverter.kt\nco/bird/android/lib/announcement/adapter/AnnouncementConverter\n*L\n22#1:48\n22#1:49,2\n22#1:52\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbg;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic c(Lbg;Ljava/lang/String;ZILjava/lang/Object;)Landroid/text/SpannableString;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lbg;->b(Ljava/lang/String;Z)Landroid/text/SpannableString;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/Announcement;Ljava/lang/String;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Announcement;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "announcement"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Announcement;->getPages()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    const/4 v5, 0x0

    const/4 v6, 0x2

    move-object/from16 v7, p0

    invoke-static {v7, v0, v5, v6, v4}, Lbg;->c(Lbg;Ljava/lang/String;ZILjava/lang/Object;)Landroid/text/SpannableString;

    move-result-object v4

    goto :goto_1

    :cond_0
    move-object/from16 v7, p0

    :goto_1
    new-instance v9, Lig;

    invoke-direct {v9, v3, v4}, Lig;-><init>(Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;Ljava/lang/CharSequence;)V

    new-instance v3, LG6;

    sget v10, Lak4;->item_announcement:I

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v3

    invoke-direct/range {v8 .. v13}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object/from16 v7, p0

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v15

    if-eqz v15, :cond_3

    new-instance v0, LH6;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x6

    const/16 v19, 0x0

    move-object v14, v0

    invoke-direct/range {v14 .. v19}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_2
    move-object/from16 v7, p0

    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public final b(Ljava/lang/String;Z)Landroid/text/SpannableString;
    .locals 4

    if-eqz p2, :cond_0

    sget p2, Lnl4;->feature_announcement_ride_started_bird_unlocking_title:I

    goto :goto_0

    :cond_0
    sget p2, Lnl4;->feature_announcement_ride_started_bird_unlocked_title:I

    :goto_0
    iget-object v0, p0, Lbg;->a:Landroid/content/Context;

    sget v1, LDf4;->calloutText:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    iget-object v1, p0, Lbg;->a:Landroid/content/Context;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v1, p2, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "context.getString(stringRes, birdCode)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v1, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-static {p2, p1, v1}, LmS5;->n(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object p1

    return-object p1
.end method
