.class public final LLd0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLd0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a8\u0006\t"
    }
    d2 = {
        "LLd0;",
        "",
        "",
        "Lco/bird/api/response/CannotAccessReportResponse;",
        "reports",
        "LH6;",
        "a",
        "<init>",
        "()V",
        "co.bird.android.feature.cannotaccess"
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
        "SMAP\nCannotAccessReportsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsConverter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1549#2:50\n1620#2,2:51\n1622#2:54\n1#3:53\n*S KotlinDebug\n*F\n+ 1 CannotAccessReportsConverter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsConverter\n*L\n17#1:50\n17#1:51,2\n17#1:54\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LLd0$a;

.field public static final b:Lorg/joda/time/format/DateTimeFormatter;

.field public static final c:Lorg/joda/time/format/DateTimeFormatter;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LLd0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LLd0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LLd0;->a:LLd0$a;

    invoke-static {}, Lorg/joda/time/format/DateTimeFormat;->shortTime()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, LLd0;->b:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "YYYY-MM-dd"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, LLd0;->c:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/api/response/CannotAccessReportResponse;",
            ">;)",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "reports"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/CannotAccessReportResponse;

    const/4 v3, 0x4

    new-array v3, v3, [LG6;

    invoke-virtual {v2}, Lco/bird/api/response/CannotAccessReportResponse;->getReportDate()Lorg/joda/time/DateTime;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    new-instance v12, LG6;

    sget-object v6, LLd0;->b:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {v6, v4}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, LLd0;->c:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {v7, v4}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    sget v8, LTi4;->item_cannot_access_report_date:I

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_0
    move-object v12, v5

    :goto_1
    const/4 v4, 0x0

    aput-object v12, v3, v4

    invoke-virtual {v2}, Lco/bird/api/response/CannotAccessReportResponse;->getReasonTitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    new-instance v12, LG6;

    sget v8, LTi4;->item_cannot_access_report_detail:I

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_1
    move-object v12, v5

    :goto_2
    const/4 v6, 0x1

    aput-object v12, v3, v6

    invoke-virtual {v2}, Lco/bird/api/response/CannotAccessReportResponse;->getNotes()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_2

    new-instance v7, LG6;

    sget v15, LTi4;->item_cannot_access_report_detail:I

    const/16 v16, 0x0

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object v13, v7

    invoke-direct/range {v13 .. v18}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_2
    move-object v7, v5

    :goto_3
    const/4 v8, 0x2

    aput-object v7, v3, v8

    invoke-virtual {v2}, Lco/bird/api/response/CannotAccessReportResponse;->getPhotoUrls()Ljava/util/List;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    if-eqz v7, :cond_3

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_4

    :cond_3
    move v4, v6

    :cond_4
    xor-int/2addr v4, v6

    if-eqz v4, :cond_5

    move-object v7, v2

    goto :goto_4

    :cond_5
    move-object v7, v5

    :goto_4
    new-instance v2, LG6;

    sget v8, LTi4;->item_cannot_access_report_image_carousel:I

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x3

    aput-object v2, v3, v4

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v9, LH6;

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_6
    return-object v1
.end method
